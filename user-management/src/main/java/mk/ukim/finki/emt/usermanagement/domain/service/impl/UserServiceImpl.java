package mk.ukim.finki.emt.usermanagement.domain.service.impl;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.usermanagement.domain.exceptions.UserNotFoundException;
import mk.ukim.finki.emt.usermanagement.domain.models.User;
import mk.ukim.finki.emt.usermanagement.domain.models.UserId;
import mk.ukim.finki.emt.usermanagement.domain.repository.UserRepository;
import mk.ukim.finki.emt.usermanagement.domain.service.UserService;
import mk.ukim.finki.emt.usermanagement.domain.service.form.UserForm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(UserId id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }


    @Override
    public User createUser(UserForm form) {
        User u = User.build(form.getName(), form.getSurname(), form.getUsername(), form.getPassword());
        userRepository.save(u);
        return u;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
