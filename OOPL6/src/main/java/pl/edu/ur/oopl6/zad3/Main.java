/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad3;

import java.util.Scanner;

/**
 *
 * @author MICHAL
 */
public class Main {
    
    public static void main(String[] args){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Co chcesz policzyc?");
        System.out.println("1. Modul liczby zespolonej");
        System.out.println("2. Wartosc liczby sprzezonej do liczby zespolonej");
        System.out.println("3. Utworzyc obiekt liczby zespolonej po dodawaniu");
        System.out.println("4. Utworzyc obiekt liczby zespolonej po odejmowaniu");
        System.out.println("5. Utworzyc obiekt liczby zespolonej po mnozeniu");
        System.out.println("6. Utworzyc obiekt liczby zespolonej po dzieleniu");
        System.out.println("7. Wartosc liczby zespolonej w typie String w postaci algebraicznej");
        System.out.println("---------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt(); 
        switch (liczba){
            case 1:
                Scanner s = new Scanner(System.in);
                System.out.println("Podaj czesc rzeczywista: ");
                double x = s.nextDouble();
                System.out.println("Podaj czesc urojona: ");
                double y = s.nextDouble();
                System.out.println(Complex.mod(x, y));
                break;
            case 2:
                Scanner s2 = new Scanner(System.in);
                System.out.println("Podaj czesc rzeczywista: ");
                double x2 = s2.nextDouble();
                System.out.println("Podaj czesc urojona: ");
                double y2 = s2.nextDouble();
                System.out.println(Complex.conj(x2, y2));
                break;
            case 3:
                Scanner s3 = new Scanner(System.in);
                System.out.println("Podaj czesc rzeczywista: ");
                double x3 = s3.nextDouble();
                System.out.println("Podaj czesc urojona: ");
                double y3 = s3.nextDouble();
                Complex w3 = new Complex(x3,y3);
                System.out.println("Podaj czesc rzeczywista: ");
                double c = s3.nextDouble();
                System.out.println("Podaj czesc urojona: ");
                double v = s3.nextDouble();
                System.out.println(Complex.plus(c, v, w3));
                break;
            case 4:
                Scanner s4 = new Scanner(System.in);
                System.out.println("Podaj czesc rzeczywista: ");
                double x4 = s4.nextDouble();
                System.out.println("Podaj czesc urojona: ");
                double y4 = s4.nextDouble();
                Complex w4 = new Complex(x4,y4);
                System.out.println("Podaj czesc rzeczywista: ");
                double b = s4.nextDouble();
                System.out.println("Podaj czesc urojona: ");
                double n = s4.nextDouble();
                System.out.println(Complex.minus(b, n, w4));
                break;
            case 5:
                Scanner s5 = new Scanner(System.in);
                System.out.println("Podaj czesc rzeczywista: ");
                double x5 = s5.nextDouble();
                System.out.println("Podaj czesc urojona: ");
                double y5 = s5.nextDouble();
                Complex w5 = new Complex(x5,y5);
                System.out.println("Podaj czesc rzeczywista: ");
                double a = s5.nextDouble();
                System.out.println("Podaj czesc urojona: ");
                double d = s5.nextDouble();
                System.out.println(Complex.times(a, d, w5));
                break;
            case 6:
                Scanner s6 = new Scanner(System.in);
                System.out.println("Podaj czesc rzeczywista: ");
                double x6 = s6.nextDouble();
                System.out.println("Podaj czesc urojona: ");
                double y6 = s6.nextDouble();
                Complex w6 = new Complex(x6,y6);
                System.out.println("Podaj czesc rzeczywista: ");
                double f = s6.nextDouble();
                System.out.println("Podaj czesc urojona: ");
                double g = s6.nextDouble();
                System.out.println(Complex.div(f, g, w6));
                break;
            case 7:
                Scanner s7 = new Scanner(System.in);
                System.out.println("Podaj czesc rzeczywista: ");
                double x7 = s7.nextDouble();
                System.out.println("Podaj czesc urojona: ");
                double y7 = s7.nextDouble();
                System.out.println(Complex.toString(x7, y7));
                break;
            default:
                break;
        }
    }
}
