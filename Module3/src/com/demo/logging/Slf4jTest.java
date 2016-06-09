package com.demo.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by raist on 2016/3/27.
 */
public class Slf4jTest {

    private static Logger Log = LoggerFactory.getLogger(Slf4jTest.class);

    public void demoLogBack(){

        Log.debug("Test the MessageFormat for {} to {} endTo {}", 1,2,3);
        Log.info("Test the MessageFormat for {} to {} endTo {}", 1,2,3);
        Log.error("Test the MessageFormat for {} to {} endTo {}", 1,2,3);

        try{
            throw new IllegalStateException("try to throw an Exception");
        }catch(Exception e){
            Log.error(e.getMessage(),e);
        }
    }

    public static void main(String[] args){
        Slf4jTest instance1 = new Slf4jTest();
        instance1.demoLogBack();
    }

}
