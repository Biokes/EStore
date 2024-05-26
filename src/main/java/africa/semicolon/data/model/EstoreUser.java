package africa.semicolon.data.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;


@Data
@Entity
@Table(name="user")
public class EstoreUser {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name="user_id")
    private long id;
    @Column(name="username")
    private String username;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
}


