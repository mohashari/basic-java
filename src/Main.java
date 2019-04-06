import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // make object class
        Users users = new Users();

        Users users1 = new Users("nnn",34);

        users.printName("alex");


    }
}


//sample class and object

class Users {

    // constractor
    Users() {

    }

    Users(String name, Integer age) {
        System.out.println(name + age);
    }

    // state class
    String name;
    String age;
    String address;


    // behavior class
    void printName(String name) {
        System.out.println(name);
    }

}

