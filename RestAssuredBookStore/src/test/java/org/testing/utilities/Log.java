package org.testing.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
    private static Logger logger;

    public static void initializeLogger() {
        logger = LoggerFactory.getLogger(Log.class);
    }

    public static void info(String message) {
        if (logger == null) {
            initializeLogger();
        }
        logger.info(message);
    }

    public static void debug(String message) {
        if (logger == null) {
            initializeLogger();
        }
        logger.debug(message);
    }

    public static void error(String message) {
        if (logger == null) {
            initializeLogger();
        }
        logger.error(message);
    }

    public static void error(String message, Throwable t) {
        if (logger == null) {
            initializeLogger();
        }
        logger.error(message, t);
    }
}
