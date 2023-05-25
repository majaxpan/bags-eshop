package mk.ukim.finki.emt.ordermanagement.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Getter
public class User implements ValueObject {

    private final UserId id;
    private final String name;
    private final String surname;
    private final String username;
    private final String password;

    public User() {
        this.id=UserId.randomId(UserId.class);
        this.name="";
        this.surname="";
        this.username="";
        this.password="";
    }

    @JsonCreator
    public User(@JsonProperty("id") UserId id,
                   @JsonProperty("name") String name,
                   @JsonProperty("surname") String surname,
                   @JsonProperty("username") String username,
                @JsonProperty("password") String password) {
        this.id = id;
        this.name=name;
        this.surname=surname;
        this.username=username;
        this.password=password;
    }
}
