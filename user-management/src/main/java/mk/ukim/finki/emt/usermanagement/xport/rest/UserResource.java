package mk.ukim.finki.emt.usermanagement.xport.rest;


import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.usermanagement.domain.models.User;
import mk.ukim.finki.emt.usermanagement.domain.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserResource {
    private final UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.findAll();
    }
}
