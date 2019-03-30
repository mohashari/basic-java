public class Main {

    public static void main(String[] args) {
        //data types
        // primitive data types
        String name;
        int angka;
        double angkaBulat;
        boolean isActived;


        name = "muklis";
        angka = 2;
        angkaBulat = 3.0;
        isActived = true;

        System.out.println("PRIMITIVE DATA TYPE"
                + name + " "
                + angka + " "
                + angkaBulat + " "
                + isActived);


        //data types object
        Integer angkaObject;
        Double angkaBulatObject;
        Boolean isActiveObject;


        angkaObject = 7;
        angkaBulatObject = 60.0;
        isActiveObject = Boolean.TRUE;

        System.out.println("Object Data Type:   " +
                angkaObject + " "
                + angkaBulatObject + " "
                + isActiveObject);

    }
}
