package com.manerajona.annotation;

import java.util.logging.Logger;

//@Slf4j
public aspect MonitorAspect {

    private final static Logger LOGGER = Logger.getLogger("LogEvent");

    public pointcut callEvent() : @annotation(com.manerajona.annotation.Monitor);

    before() : callEvent() {
        LOGGER.info("Logging before event");
    }

    void around(): callEvent() {
        try {
            proceed();
        } catch (Throwable e) {
            LOGGER.severe("Error on event");
        }
    }

    after() : callEvent() {
        LOGGER.info("Logging after event");
    }
}
