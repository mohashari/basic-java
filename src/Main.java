import java.util.*;

public class Main {

    public static void main(String[] args) {

        String name;
        String age;

        Users users = new Users();

        Scanner scanner = new Scanner(System.in);

        System.out.println("MASUKAN NAMA:   ");
        name = scanner.nextLine();
        users.setName(name);

        System.out.println("MASUKAN AGE:    ");
        age = scanner. nextLine();
        users.setAge(age);


        System.out.println("USER INPUT IS " + users.getName() + " " + users.getAge());

    }
}


class Users {

    private String name;
    private String age;


    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}



