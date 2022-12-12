package web.service;

import web.Model.User;

import java.util.List;

public interface UserService {
    public List<User> index();

    void save(User user);

    User show(Long id);

    void update(Long id, User updatedUser);

    void delete(Long id);
}
