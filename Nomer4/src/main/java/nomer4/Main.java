/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer4;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1, 1, 1);
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);

        System.out.println("Limas segi empat dengan luas alas : " + 1 + ", luas selubung limas : " + 1 + " dan tinggi : " + 1 +
                           ". Luasnya : " + limas1.getLuas() + ", sedangkan volumenya : " + limas1.getVolume());

        System.out.println("Limas segi empat dengan luas alas : " + 30 + ", luas selubung limas : " + 40 + " dan tinggi : " + 50 +
                           ". Luasnya : " + limas2.getLuas() + ", sedangkan volumenya : " + limas2.getVolume());

        System.out.println("Limas segi empat dengan luas alas : " + 25 + ", luas selubung limas : " + 35 + " dan tinggi : " + 45 +
                           ". Luasnya : " + limas3.getLuas() + ", sedangkan volumenya : " + limas3.getVolume());
    }
}

