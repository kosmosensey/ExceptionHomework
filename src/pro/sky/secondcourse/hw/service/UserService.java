package pro.sky.secondcourse.hw.service;

import pro.sky.secondcourse.hw.exceprion.MatchPasswordException;
import pro.sky.secondcourse.hw.exceprion.WrongLoginException;
import pro.sky.secondcourse.hw.exceprion.WrongPasswordException;

public class UserService {
    public static void createUser(String login, String password, String confirmPassword) {
        try {
            validateLogAndPass(login, password, confirmPassword);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void validateLogAndPass(String login, String password, String confirmPassword)
            throws Exception {
        // Проверка логина
        if (login == null || !login.matches("[a-zA-Z0-9_]+") || login.length() > 20) {
            throw new WrongLoginException("Неверный формат логина");
        }
        // Проверка пароля
        if (password == null || !password.matches("[a-zA-Z0-9_]+") || password.length() > 20) {
            throw new WrongPasswordException("Неверный формат пароля");
        }
        // Проверка совпадения пароля
        if (!password.equals(confirmPassword)) {
            throw new MatchPasswordException("Пароль не совпадает");
        }
    }
}
