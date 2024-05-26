package africa.semicolon.services;


import africa.semicolon.data.model.EstoreUser;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void deleteAll();
    void saveUser(EstoreUser user);
    long countUsers();
}
