package io.dev.objects;

public class Clubs {

    // If a variable is marked static, it's value remains same for that class across any instance/object
    // Static members are always referenced using <ClassName>.<member> i.e.,
    public static int fans;
    public String city;
    public String name;
    public String captain;

    public void display() {
        System.out.println(name + " is the best supported EPL football club in" + city +
                " led by " + captain + " in front of " + fans);
    }

    public String slogans() {
        int fans = Clubs.fans;
        System.out.println("Accessed static field from a non-static context. But not vice-versa");
        return "Arsenal Forever!";
    }
}