package org.example;

import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Logger logger = logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.trace("Este es un mensaje de nivel TRACE");
        logger.debug("Este es un mensaje de nivel DEBUG");
        logger.info("Este es un mensaje de nivel INFO");
        logger.warn("Este es un mensaje de nivel WARN");
        logger.error("Este es un mensaje de nivel ERROR");
        logger.fatal("Este es un mensaje de nivel FATAL");
    }
}