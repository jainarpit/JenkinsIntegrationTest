package com.Company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleLogging {
    static final Logger logger = LogManager.getLogger(SampleLogging.class);

    public static void main(String[] args) {
        logger.info("Helloo!! I am info");
        logger.info("from Main");
        LoginTest();
    }

    public static void LoginTest() {
        logger.error("login failed");
    }
}

