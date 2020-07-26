package uk.co.datadisk.profiledemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ProfileDemoApplication implements CommandLineRunner {

    private final Environment env;

    private final HelloWorld helloWorld;

    public ProfileDemoApplication(Environment env, HelloWorld helloWorld) {
        this.env = env;
        this.helloWorld = helloWorld;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProfileDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Main Profile demo App");
        System.out.println("Environment: " + env.getProperty("dd.environment"));
        System.out.println(helloWorld.helloWorld());
    }
}
