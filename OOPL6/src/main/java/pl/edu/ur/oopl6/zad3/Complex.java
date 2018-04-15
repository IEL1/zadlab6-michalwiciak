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
public class Complex {

    private double x, y;

    /*
    liczba zespolona postaci: z = u + i*v
    @param u czesc rzeczywista
    @param v czesc urojona
     */
    public Complex(double u, double v) {
        x = u;
        y = v;
    }

    public double real() {
        return x;
    }

    public double imag() {
        return y;
    }
    
    //modul
    public static double mod(double x, double y) {
        if (x != 0 || y != 0) {
            return Math.sqrt(x * x + y * y);
        } else {
            return 0d;
        }
    }
    
    //liczba sprzezona
    public static Complex conj(double x, double y) {
    return new Complex(x,-y);
    }
    
    //dodawanie liczb zespolonych
    public static Complex plus(double x, double y, Complex w) {
        return new Complex(x+w.real(),y+w.imag());
    }
    //odejmowanie liczb zespolonych
    public static Complex minus(double x, double y, Complex w) {
        return new Complex(x-w.real(),y-w.imag());
    }
    //mnozenie liczb zespolonych
    public static Complex times(double x, double y, Complex w) {
    return new Complex(x*w.real()-y*w.imag(),x*w.imag()+y*w.real());
    }
    
        /**
        @param w to liczba do podzielenia
        @return nowa liczbe zespolona z/w gdzie z to ta liczba zespolona  
    */
    public static Complex div(double x, double y, Complex w) {
        double den=Math.pow(w.mod(x, y),2);
        return new Complex((x*w.real()+y*w.imag())/den,(y*w.real()-x*w.imag())/den);
    }
    
    //liczba zespolona w postaci wykladniczej
    public static Complex exp(double x, double y) {
    return new Complex(Math.exp(x)*Math.cos(y),Math.exp(x)*Math.sin(y));
    }
    
    //liczba zespolona w postaci algebraicznej w formie String
    public static String toString(double x, double y) {
        if (x!=0 && y>0) {
            return x+" + "+y+"i";
        }
        if (x!=0 && y<0) {
            return x+" - "+(-y)+"i";
        }
        if (y==0) {
            return String.valueOf(x);
        }
        if (x==0) {
            return y+"i";
        }
        return x+" + i*"+y;
    }       
}
