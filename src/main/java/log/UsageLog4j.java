package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsageLog4j {
    private static final Logger LOG = LoggerFactory.getLogger(UsageLog4j.class.getName());
    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        double number = 39.2;
        boolean result = true;
        float key = 12;
        byte house = 64;
        short numberTest = 12;
        long myNumber = 42222;
        char test = 4;

        LOG.debug("User info name : {}, age : {}", name, age);
        LOG.debug("test1 : {} number", number);
        LOG.debug("test2 : {} result", result);
        LOG.debug("test3 : {} key", key);
        LOG.debug("test4 : {} house", house);
        LOG.debug("test5 : {} numberTest", numberTest);
        LOG.debug("test6 : {} myNumber", myNumber);
        LOG.debug("test7 : {} test", test);
    }
}