package com.revature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main( String[] args ) {
        //create logger using logger factory then pass in class
        Logger logger = LoggerFactory.getLogger("com.revature.App");

        //we can log different values
        logger.trace("traces");
        logger.debug("Hello world");
        logger.error("error");
        logger.info("gives info");
        logger.warn("gives warning");
    }
}
