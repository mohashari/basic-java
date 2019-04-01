import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Arrays
        //default definition
        //type[] identifier = new type[length];


        String[] names = new String[3];

        // set value arrays
        names[0] = "muklis";
        names[1] = "avi";
        names[2] = "mustofa";

        //declaration arrays
        String[] tools = {"ss", "ss"};


        System.out.println("Arrays: " + names);

        //for loop default
        for (int i = 0; i < names.length; i++) {
            System.out.println("name:   " + names[i]);

        }

        //for each
        for (String tool : tools) {
            System.out.println("Tool  :    " + tool);
        }


        //java 8 lambda expression

        List<String> animals = new ArrayList<>();
        animals.add("kanguru");
        animals.add("cat");
        animals.add("bird");

        animals.forEach(animal -> {
            System.out.println("Animal: " + animal);
        });


    }
}
