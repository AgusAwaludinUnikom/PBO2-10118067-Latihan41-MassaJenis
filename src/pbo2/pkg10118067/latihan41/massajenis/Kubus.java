/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan41.massajenis;

/**
 *
 * @author Kiyo
 */
public class Kubus {
    private int sisi = 5; 
    private int massa = 250;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        int volume;
        return volume = sisi*sisi*sisi ;

    }
    
    public int hitungMassaJenis(int parMassa , int volume){
        return  parMassa / volume ;
    }
}
