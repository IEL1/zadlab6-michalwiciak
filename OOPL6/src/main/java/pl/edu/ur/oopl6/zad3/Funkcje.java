/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad3;

/**
 *
 * @author MICHAL
 */
public class Funkcje {
    
    public static String toString(int x, int y) {
    if (x!=0 && y>0) {
        return x + " + " + y + "i";
    }
    if (x!=0 && y<0) {
        return x + " - " + (-y) + "i";
    }
    if (y==0) {
        return String.valueOf(x);
    }
    if (x==0) {
        return y + "i";
    }
    return x + " + i*" + y;
    }
    
    public static double Modul(int re, int im){
        return Math.sqrt(re*re+im*im);
    }
    
    public static void Sprzezenie(int re, int im){
        System.out.println(re + "" + im*(-1) + "i");
    }
    
    public static void Suma(int re, int im, int re1, int im1){
        int Re = re + re1;
        int Im = im + im1;
    if(Im>0)
    {
        System.out.println("Suma: " + Re + " + " +Im + "i");
    }
    else 
    {
        System.out.println("Suma: " + Re + " - " + Math.abs(Im)+"i");
    }
    
    }
    
    public static void Roznica(int re, int im, int re1, int im1){
        int Re = re-re1;
        int Im = im-im1;
          if(Im>0)
    {
        System.out.println("Roznica: " + Re + " + "+Im+"i");
    }
    else 
    {
        System.out.println("Roznica: " + Re + " - " + Math.abs(Im)+"i");
    }
          
    }
    
    public static void Iloczyn(int re, int im, int re1, int im1){
        double Re = re*re1-im*im1;
        double Im = re*im1+im*re1;
          if(Im>0)
    {
        System.out.println("Iloczyn: " + Re + " + " + Im + "i");
    }
    else 
    {
        System.out.println("Iloczyn: "+ Re + " - " + Math.abs(Im)+ "i");
    }
          
    }
    
    public static void Iloraz(int re, int im, int re1, int im1){
        double Re = (re*re1 + im*im1)/(re1*re1+im1*im1);
        double Im = (im*re1-re*im1)/(re1*re1+im1*im1);
          if(Im>0)
    {
        System.out.println("Iloraz: " + Re + " + " + Im + "i");
    }
    else 
    {
        System.out.println("Iloraz: " + Re + " - " + Math.abs(Im) + "i");
    }
          
    }  
    
}
