package africa.semicolon.data;

import africa.semicolon.data.model.EstoreUser;
import africa.semicolon.data.repo.UserRepository;
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
        user.setId(1L);
        repository.save(user);
        assertEquals(1,repository.count());
    }
}
