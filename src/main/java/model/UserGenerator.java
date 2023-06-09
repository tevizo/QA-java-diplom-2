package model;

import org.apache.commons.lang3.RandomStringUtils;

public class UserGenerator {
    public static User getRandom(){
        String email = RandomStringUtils.randomAlphabetic(10) + "@yandex.ru";
        String password = RandomStringUtils.randomAlphabetic(10);
        String name = RandomStringUtils.randomAlphabetic(10);
        return new User(email, password, name);
    }
}
