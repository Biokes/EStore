package africa.semicolon.services;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServicesTest {
    @Autowired
    private UserService userService;

    @BeforeEach
    void wipe(){
        userService.deleteAll();
    }
}
