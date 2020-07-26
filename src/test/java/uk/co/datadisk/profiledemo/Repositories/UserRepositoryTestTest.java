package uk.co.datadisk.profiledemo.Repositories;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class UserRepositoryTestTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Environment env;

    @Test
    public void UserRepoTest() throws Exception {
        System.out.println("Repo Test Environment: " + env.getProperty("dd.environment"));

        // sleep for 10 seconds
        Thread.sleep(10000);
        assertEquals(1, userRepository.findAll().size());
    }
}