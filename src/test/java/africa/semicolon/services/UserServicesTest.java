package africa.semicolon.services;

import africa.semicolon.data.model.EstoreUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserServicesTest {
    @Autowired
    private UserService userService;

    @BeforeEach
    void wipe(){
        userService.deleteAll();
    }
    @Test
    void createUser_testUserIsCreated(){
        EstoreUser user = new EstoreUser();
        userService.saveUser(user);
        assertEquals(1, userService.countUsers());
        user = new EstoreUser();
        userService.saveUser(user);
        assertEquals(2,userService.countUsers());
    }
}
