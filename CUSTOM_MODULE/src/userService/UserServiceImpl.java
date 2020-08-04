package userService;

import user.User;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private static Map<Integer, User> users = new HashMap<Integer, User>();
    private static Integer userId = 0;

    public static void addUser(String name, Integer age, String userName) {
        users.put(userId++, new User(name, age, userName));
    }

    public static void editUser(Integer userId, String name, Integer age, String userName) {
        users.get(userId).setUsername(userName);
        users.get(userId).setAge(age);
        users.get(userId).setName(name);
    }

    public static void deleteUser(Integer userId) {
        users.remove(userId);
    }

    public static void printUser() {
        users.forEach((a, b) -> System.out.println(a + " " + b));
    }
}
