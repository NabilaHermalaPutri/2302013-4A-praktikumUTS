/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nomer4;

/**
 *
 * @author Lenovo
 */
public class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    public LimasSegiEmpat() {
        this.luasAlas = 0;
        this.luasSelubungLimas = 0;
        this.tinggi = 0;
    }

    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    public double getLuas() {
        return this.luasAlas + this.luasSelubungLimas;
    }

    public double getVolume() {
        return (1.0 / 3.0) * this.luasAlas * this.tinggi;
    }

    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    public void setLuasSelubungLimas(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}

