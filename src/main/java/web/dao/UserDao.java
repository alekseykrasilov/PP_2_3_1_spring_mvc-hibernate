package web.dao;

import web.Model.User;

import java.util.List;

public interface UserDao {

    List<User> index();

    void save(User user);

    User show(Long id);

    void update(Long id, User updatedUser);

    void delete(Long id);
}
