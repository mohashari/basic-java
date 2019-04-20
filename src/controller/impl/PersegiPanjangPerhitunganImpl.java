package controller.impl;

import controller.Perhitungan;
import model.PersegiPanjang;
import view.PersegiPanjangView;

public class PersegiPanjangPerhitunganImpl implements Perhitungan {

    @Override
    public double hitungLuas(PersegiPanjangView view) {
        return menghitungLebar(view.getLebar(),
                view.getPanjang());
    }

    private double menghitungLebar(Double param1, Double param2) {
        return param1 * param2;
    }

    @Override
    public double hitungKeliling(PersegiPanjang persegiPanjang) {
        return 0;
    }
}
