import controller.impl.PersegiPanjangPerhitunganImpl;
import view.PersegiPanjangView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PersegiPanjangView view = new PersegiPanjangView();
        PersegiPanjangPerhitunganImpl perhitungan = new PersegiPanjangPerhitunganImpl();

        System.out.println("APLIKASI MENGITUNG PERSEGI PANJANG");
        System.out.println("MASUKAN PANJANG:    ");
        view.setPanjang(scanner.nextDouble());

        System.out.println("MASUKAN LEBAR:  ");
        view.setLebar(scanner.nextDouble());

        System.out.println("LUAS NYA ADALAH: \n   " + perhitungan.hitungLuas(view));

    }
}





