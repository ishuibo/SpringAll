package cn.shuibo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @Author: Bobby
 * @Date: 2019/6/6 16:40
 */
@Aspect // @Aspect切面类注解
@Component  // @Component把切面类加入到IOC容器中
public class ShuiBoAspect {

    private static final Logger logger = LoggerFactory.getLogger(ShuiBoAspect.class);

    public static long startTime;
    public static long endTime;

    /**
     * execution(public * cn.shuibo.controller.*.*(..))
     * 表示cn.shuibo.controller包下所有类的所有方法, "..."表示所有方法中的参数不限个数
     */
    @Pointcut("execution(public * cn.shuibo.controller.*.*(..))")
    public void shuiboPointcutLog(){

    }
    @Before("shuiboPointcutLog()")
    public void before(JoinPoint joinPoint) {
        startTime = System.currentTimeMillis();
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        HttpServletRequest request = requestAttributes.getRequest();
        Method method = signature.getMethod();
        logger.info("请求URL:" + request.getRequestURL().toString());
        String requestMethod = request.getMethod();
        logger.info("请求方式:" + requestMethod);
        Object[] args = joinPoint.getArgs();
        LocalVariableTableParameterNameDiscoverer u = new LocalVariableTableParameterNameDiscoverer();
        String[] paramNames = u.getParameterNames(method);
        if (args != null && paramNames != null) {
            String params = "";
            for (int i = 0; i < args.length; i++) {
                params += "  " + paramNames[i] + "=" + args[i];
            }
            logger.info("入参:" + params);
        }
        String remoteAddr = request.getRemoteAddr();
        logger.info("IP:" + remoteAddr);
        String declaringTypeName = joinPoint.getSignature().getDeclaringTypeName();
        logger.info("类名:" + declaringTypeName);
        String methodName = joinPoint.getSignature().getName();
        logger.info("方法名:" + methodName);
    }

    @After("shuiboPointcutLog()")
    public void after() {
        endTime = System.currentTimeMillis() - startTime;
    }

    @AfterReturning(pointcut = "shuiboPointcutLog()", returning = "object")
    public void getAfterReturn(Object object) {
        logger.info("访问耗时:{}ms", endTime);
    }
}
