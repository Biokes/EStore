package africa.semicolon.services;


import africa.semicolon.data.model.EstoreUser;
import africa.semicolon.data.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstoreUserService implements UserService{
    @Autowired
    private UserRepository repo;
    public void deleteAll() {
        repo.deleteAll();
    }
    public void saveUser(EstoreUser user) {
        repo.save(user);
    }
    @Override
    public long countUsers() {
        return repo.count();
    }
}
