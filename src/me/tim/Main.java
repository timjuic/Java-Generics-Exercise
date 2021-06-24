package me.tim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = List.of(
                new User("John", 21, "JohnyySmithus@gmail.com", "pass12345", 591272124, 2021),
                new User("Sam", 30, "Sammylal@gmail.com", "asdjhlakj12,", 509127091, 2930),
                new User("Amy", 21, "Amyinthewrold@gmail.com", "1241", 128192, 2198)
        );
//        users.stream().forEach(System.out::println);

        List<SuperUser> superUsers = List.of(
                new SuperUser(529.481,  new User("John", 21, "JohnyySmithus@gmail.com", "pass12345", 591272124, 2021))
        );
        System.out.println(superUsers);
    }
}
