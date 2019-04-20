package controller;

import model.PersegiPanjang;
import view.PersegiPanjangView;

public interface Perhitungan {

    double hitungLuas(PersegiPanjangView view);

    double hitungKeliling(PersegiPanjang persegiPanjang);

}
