package de.foo.config;

import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TomcatServletContextListener implements ServletContextListener {
    
    private static final Logger logger = Logger.getLogger(TomcatServletContextListener.class.getName());

    @Override
    public void contextInitialized(ServletContextEvent event) {
        // If true, when coercing expressions to numbers "" and null will be coerced to zero as required by the specification.
        logger.info("org.apache.el.parser.COERCE_TO_ZERO=false");
        System.setProperty("org.apache.el.parser.COERCE_TO_ZERO", "false");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
    }

}
