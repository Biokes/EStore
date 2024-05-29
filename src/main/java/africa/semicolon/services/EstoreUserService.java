package africa.semicolon.services;


import africa.semicolon.data.model.EstoreUser;
import africa.semicolon.data.repo.UserRepository;
import africa.semicolon.dto.RegisterRequest;
import africa.semicolon.utils.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static africa.semicolon.utils.Validator.validateUser;

@Service
public class EstoreUserService implements UserService{
    @Autowired
    private UserRepository repo;
    public void deleteAll(){
        repo.deleteAll();
    }
    public void saveUser(RegisterRequest user) {
        validateUser(user);
        repo.save(Mapper.mapToCustomer(user));
    }
    public long countUsers(){
        return repo.count();
    }
}
