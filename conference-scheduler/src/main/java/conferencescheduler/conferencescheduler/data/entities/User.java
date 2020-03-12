package conferencescheduler.conferencescheduler.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity{
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    private Set<Role> authorities;
    private String blabla;
}
