package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main extends UserDaoJDBCImpl  {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Aleksandr","Kurma", (byte) 99);
        System.out.println("User с именем – Aleksandr добавлен в базу данных");

        userService.saveUser("James","Gosling", (byte) 65);
        System.out.println("User с именем – James добавлен в базу данных");

        userService.saveUser("Sergei","Nikonov", (byte) 1);
        System.out.println("User с именем – Sergei добавлен в базу данных");

       List<User> userList = userService.getAllUsers();
        for (User user:userList ){
            System.out.println(user.toString());
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();











        // реализуйте алгоритм здесь
    }

}