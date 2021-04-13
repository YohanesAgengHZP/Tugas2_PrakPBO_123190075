/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo3;

/**
 *
 * @author Yohanes Ageng
 */
public class Kerucut extends Lingkaran implements MenghitungRuang {
    private int tinggi;

    public Kerucut(int tinggi, double jari2) {
        super(jari2);
        this.tinggi = tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    @Override
    public double volume() {
        return ((double)1/3) * this.luas() * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        double r = this.jari2;
        int t = this.tinggi;
        double s = Math.sqrt((r*r)+(t*t));
        return 22/7 * r * (r + s);
    }
}
