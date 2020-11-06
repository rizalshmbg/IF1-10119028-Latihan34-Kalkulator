/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan34.kalkulator;

/**
 *
 * @author
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk program kalkulator
 */
public class Kalkulator {
    public double value1, value2;
    
    public double tambahBilangan() {
        return value1 + value2;
    }
    
    public double kurangBilangan() {
        return value1 - value2;
    }
    
    public double kaliBilangan() {
        return value1 * value2;
    }
    
    public double bagiBilangan() {
        return value1 / value2;
    }
    
    public double sisaBilangan() {
        return value1 % value2;
    }
}