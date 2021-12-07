package homework.education.storage;

import homework.education.model.Lesson;
import homework.education.model.User;

public class UserStorage {
    private User[] users = new User[10];
    private int size;


    public void add(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] array = new User[users.length + 10];
        System.arraycopy(users, 0, array, 0, array.length);
        users = array;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }

    public User getByPassword(String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }

    public String getByType() {
        for (int i = 0; i < size; i++) {
            if (users[i].getType().equals("admin")) {
                return "admin";
            } else if (users[i].getType().equals("user")) {
                return "user";
            }
        }

        return null;
    }

    public String getByTypeAdmin() {


        for (int i = 0; i < size; i++) {
            if (users[i].getType().equals("admin")) {
                return "admin";
            }
        }
        return null;
    }
}
