package uk.co.datadisk.profiledemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import uk.co.datadisk.profiledemo.Repositories.UserRepository;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
//@SpringBootTest
@DataJpaTest
@ActiveProfiles("test")
class HelloWorldTest {

    //@Autowired
    //private HelloWorld helloWorld;

    @Autowired
    private Environment env;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        System.out.println("Test Environment: " + env.getProperty("dd.environment"));
    }

    @Test
    public void listUsers() {
        assertEquals(1, userRepository.findAll().size());
    }
}