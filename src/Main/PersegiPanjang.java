package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class PersegiPanjang implements MenghitungBangun{
    private double panjang, lebar;
    public PersegiPanjang(double p, double l){
        panjang = p;
        lebar = l;
    }
    
    // Encaptulation
    public void setPanjang(int p){
        panjang = p;
    }
    
    public double getPanjang(){
        return panjang;
    }
    
    public void setLebar(int l){
        lebar = l;
    }
    
    public double getLebar(){
        return lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 *(panjang + lebar);
    }
}
