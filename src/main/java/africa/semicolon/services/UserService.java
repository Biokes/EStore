package africa.semicolon.services;


import africa.semicolon.data.model.EstoreUser;
import africa.semicolon.dto.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void deleteAll();
    void saveUser(RegisterRequest user);
    long countUsers();
}
