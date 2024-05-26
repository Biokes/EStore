package africa.semicolon.utils;
import africa.semicolon.data.model.EstoreUser;
import africa.semicolon.exceptions.EstoreUserException;
import java.util.Optional;
import static africa.semicolon.utils.ErrorMessages.*;

public class Validator {
    private static void validate(String name){
        if(Optional.ofNullable(name).isEmpty()|| name.isBlank())
            throw new EstoreUserException(INCOMPLETE_FIELDS.getMessage());
    }
    private static void validatePassword(String password){
        if(Optional.ofNullable(password).isEmpty()|| password.isBlank())
            throw new EstoreUserException(INVALID_PASSWORD.getMessage());
        if(!password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*-]){8,20}$"))
            throw new EstoreUserException(INVALID_PASSWORD.getMessage());
    }
    private static void validateEmail(String email){
        if(!email.matches("(^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$\n)"))
            throw new EstoreUserException(INVALID_EMAIL.getMessage());
    }
    public static void validateUser(EstoreUser user){
        validate(user.getUsername());
        validatePassword(user.getPassword());
        validateEmail(user.getEmail());

    }
}
