package cn.shuibo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

/**
 * @Author: Bobby
 * @Date: 2019/5/24 15:48
 */
@Component
public class TestService {

    private final static Logger logger = LoggerFactory.getLogger(TestService.class);

    /**
     * 同步
     * @throws InterruptedException
     */
    public void synchroEvent() throws InterruptedException{
        Thread.sleep(3000);
        Thread.sleep(2000);
        Thread.sleep(1000);
        logger.info("同步方法执行完了");
    }

    /**
     * 异步
     * @throws InterruptedException
     */
    @Async
    public void asyncEvent() throws InterruptedException{
        Thread.sleep(3000);
        Thread.sleep(2000);
        Thread.sleep(1000);
        logger.info("异步方法执行完了");
    }
}
