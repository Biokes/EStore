package africa.semicolon.utils;
import africa.semicolon.data.model.EstoreUser;
import africa.semicolon.dto.RegisterRequest;
import africa.semicolon.exceptions.EstoreUserException;
import java.util.Optional;
import static africa.semicolon.exceptions.ErrorMessages.*;

public class Validator {
    private static void validate(String name){
        if(Optional.ofNullable(name).isEmpty()|| name.isBlank())
            throw new EstoreUserException(INCOMPLETE_FIELDS.getMessage());
        name =name.strip();
    }
    private static void validatePassword(String password){
        if(Optional.ofNullable(password).isEmpty()|| password.isBlank())
            throw new EstoreUserException(INVALID_PASSWORD.getMessage());
        password=password.strip();
        if(!password.matches("^(?=.*[a-zA-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*,])[A-Za-z\\d!@#$%^&*,]{8,20}"))
            throw new EstoreUserException(INVALID_PASSWORD.getMessage());
    }
    private static void validateEmail(String email){
        email=email.strip();
        if(!email.matches("(^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$)"))
            throw new EstoreUserException(INVALID_EMAIL.getMessage());
    }
    public static void validateUser(RegisterRequest user){
        validate(user.getUsername());
        validatePassword(user.getPassword());
        validateEmail(user.getEmail());
    }
}
