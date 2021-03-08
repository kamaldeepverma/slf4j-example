package org.sl4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        logger.info("Hello from slf4j");
    }
}
