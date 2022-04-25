package tests;

import org.apache.log4j.Logger;


public class Log4g {
    public static Logger Log = Logger.getLogger(Log4g.class.getName());
    public static void startcase(String startcase){
        Log.info("==================================="+startcase +" START CASE=======================");
    }
    public static void endcase(String endcase){
        Log.info("==================================="+endcase +" End CASE============================");
    }
    public static void info(String message){
        Log.info(message);
    }
}
