package pro.sky.secondcourse.hw;

import pro.sky.secondcourse.hw.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService.validateLogAndPass("Qwerty_123", "Pass_123", "Pass_123");
    }
}