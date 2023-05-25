package mk.ukim.finki.emt.sharedkernel.domain.location;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address implements ValueObject {

    private final String address;

    public Address() {
        this.address = "";
    }
}
