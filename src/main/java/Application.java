package controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shorten.UrlMapping;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class Application {
    private static final Logger log = Logger.getLogger(Application.class);
    public static Properties properties;

    public static void main(String[] args) {
        try {
            BasicConfigurator.configure();
            properties = new Properties();
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream("config.properties");
            properties.load(is);
        } catch (IOException e) {
            log.error("get config error:" + e);
        }
        log.info("=============================================================");
        log.info("==================START SCHEDULER CATEGORY SYNC==============");
        log.info("=============================================================");

        UrlMapping.addUrl();
        SpringApplication.run(Application.class, args);
    }

    public static String getConfig(String key) {
        return properties.getProperty(key);
    }
}
