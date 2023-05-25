package mk.ukim.finki.emt.usermanagement.domain.models;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;
import mk.ukim.finki.emt.usermanagement.domain.valueObjects.Role;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "shop_users")
@Getter
public class User extends AbstractEntity<UserId> {

    private String name;

    private String surname;

    private String username;

    private String password;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    public static User build(String name, String surname, String username, String password) {
        User u = new User();
        u.name=name;
        u.surname=surname;
        u.username=username;
        u.password=password;
        return u;
    }
}
