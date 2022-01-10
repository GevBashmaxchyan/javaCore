package homework.education2.education.storage;


import homework.education2.education.model.User;
import homework.education2.education.util.FileUtil;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    private Map<String,User> userMap = new HashMap<>();

    


    public void add(User user) {
        userMap.put(user.getEmail(),user);
        FileUtil.serializeUserMap(userMap);;
    }

    public void print() {
        for (User value : userMap.values()) {
            System.out.println(value);
        }
    }

    public User getByEmail(String email)  {
        return userMap.get(email);



    }


    public void initeData() {
        Map<String, User> userMapFromFile = FileUtil.deserializeUserMap();
        if (userMapFromFile != null) {
            userMap = userMapFromFile;
        }
    }
}
