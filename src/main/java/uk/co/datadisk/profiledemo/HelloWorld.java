package uk.co.datadisk.profiledemo;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    private Environment env;

    public HelloWorld(Environment env) {
        this.env = env;
    }

    public String helloWorld() {
        return "Hello World - " + env.getProperty("dd.environment");
    }
}
