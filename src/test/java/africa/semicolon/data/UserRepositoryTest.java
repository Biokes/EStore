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
        EstoreUser user = new EstoreUser();
        user.setId(1);
        repository.save(user);
        assertEquals(1,repository.count());
    }
}
