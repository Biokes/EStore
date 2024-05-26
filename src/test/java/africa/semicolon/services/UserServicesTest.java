package africa.semicolon.services;

import africa.semicolon.data.model.EstoreUser;
import africa.semicolon.exceptions.EstoreUserException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    @Test
    void testUserFieldsCAnnotBeNull(){
      EstoreUser user = new EstoreUser();
      assertThrows(EstoreUserException.class,()->userService.saveUser(user));

    }
}
