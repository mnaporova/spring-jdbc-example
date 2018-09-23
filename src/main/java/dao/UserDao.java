package dao;

import entity.User;

import java.util.List;

//работа с БД
public interface UserDao {

    void save (User user);

    User getById(int id);

    List<User> findAll();// метод, который вернет список юзеров

    void update(User user);

    void  delete(int id);


}
