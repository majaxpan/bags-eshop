package mk.ukim.finki.emt.usermanagement.domain.service;

import mk.ukim.finki.emt.usermanagement.domain.models.User;
import mk.ukim.finki.emt.usermanagement.domain.models.UserId;
import mk.ukim.finki.emt.usermanagement.domain.service.form.UserForm;

import java.util.List;

public interface UserService {

    User findById(UserId id);
    User createUser(UserForm form);
    List<User> findAll();

}
