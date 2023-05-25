package mk.ukim.finki.emt.ordermanagement.service.forms;

import lombok.Data;
import mk.ukim.finki.emt.ordermanagement.domain.valueobjects.Product;
import mk.ukim.finki.emt.ordermanagement.domain.valueobjects.User;
import mk.ukim.finki.emt.sharedkernel.domain.location.Address;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class OrderItemForm {

    @NotNull
    private Product product;

    @NotNull
    private User user;

    @Min(1)
    private int quantity = 1;

    @NotNull
    private Address address = new Address();
}
