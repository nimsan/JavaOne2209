package Lesson5;

public class UserApp {
    public static void main(String[] args) {
        User user = new User();
        System.out.println("Name = " + user.name + " Age = " + user.age);
        user.name = "Ivan";
        user.age = 33;
        System.out.println("Name = " + user.name + " Age = " + user.age);
        User user2 = new User();
        user2.name = "Olga";
        user2.age = 18;
        System.out.println("Name = " + user2.name + " Age = " + user2.age);

    }
}
