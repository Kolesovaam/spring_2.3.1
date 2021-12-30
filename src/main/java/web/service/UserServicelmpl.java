package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServicelmpl implements UserService{

    private final UserDao userDao;

    public UserServicelmpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }

    @Override

    public void edit(User user) {
        userDao.edit(user);
    }

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }
}
