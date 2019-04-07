import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin();
        admin.printName("Muklis");
    }
}


//  class parent
class Users  {

    String name;
    String age;

    void printName(String name) {
        System.out.println(name);
    }

}

//class child
class Admin extends Users {

    String role;
    void getAdmin() {
        System.out.println("ADMIN");
    }
}

