package com.universe.kalman;

import java.util.Vector;

public class MAModel {
    private double[] data;
    private int q;

    public MAModel(double[] data, int q) {
        this.data = data;
        this.q = q;
    }

    public Vector<double[]> solveCoeOfMA() {
        Vector<double[]> vec = new Vector<>();
        double[] maCoe = new YM().computeMACoe(this.data, this.q);

        vec.add(maCoe);

        return vec;
    }
}

