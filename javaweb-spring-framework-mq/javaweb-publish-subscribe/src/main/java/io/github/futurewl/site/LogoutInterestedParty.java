package io.github.futurewl.site;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LogoutInterestedParty implements ApplicationListener<LogoutEvent> {
    private static final Logger log = LogManager.getLogger();

    @Override
    @Async
    public void onApplicationEvent(LogoutEvent event) {
        log.info("Logout event for IP address {}.", event.getSource());

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            log.error(e);
        }
    }
}
