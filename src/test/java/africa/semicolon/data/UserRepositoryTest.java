package africa.semicolon.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository repository;
    @BeforeEach
    void wipe(){
        repository.deleteAll();
    }
    @Test
    void createAndSaveUser_testUserIsSaved(){
        User user = new User();
        repository.save(user);
        assertEquals(1,repository.count());
    }
}
