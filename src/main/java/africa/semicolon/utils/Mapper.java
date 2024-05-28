package africa.semicolon.utils;

import africa.semicolon.data.model.EstoreUser;
import africa.semicolon.dto.RegisterRequest;

public class Mapper {

    public static EstoreUser mapToCustomer(RegisterRequest user) {
        EstoreUser customer = new EstoreUser();
        customer.setUsername(user.getUsername());
        customer.setPassword(user.getPassword());
        customer.setEmail(user.getEmail());
        return customer;
    }
}
