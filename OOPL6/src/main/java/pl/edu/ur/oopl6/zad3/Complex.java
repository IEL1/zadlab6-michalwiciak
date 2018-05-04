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
 public class Complex {
 public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Witaj w strukturze liczb zespolonych! Wybierz dzialanie: ");
    System.out.println("1. Obliczanie modulu");
    System.out.println("2. Obliczanie liczby sprzezonej");
    System.out.println("3. Dodawanie liczb (w postaci algebraicznej)");
    System.out.println("4. Odejmowanie liczb (w postaci algebraicznej)");
    System.out.println("5. Mnozenie liczb (w postaci algebraicznej)");
    System.out.println("6. Dzielenie liczb (w postaci algebraicznej)");
    System.out.println();
    int wybor = scanner.nextInt();
    
    System.out.println("Podaj 1 liczbe: ");
    System.out.println("Czesc rzeczywista: ");
    int re = scanner.nextInt();
    System.out.println("Czesc urojona: ");
    int im = scanner.nextInt();
    
    System.out.println("Podaj 2 liczbe: ");
    System.out.println("Czesc rzeczywista: ");
    int re1 = scanner.nextInt();
    System.out.println("Czesc urojona: ");
    int im1 = scanner.nextInt();
    System.out.println();
    System.out.println("Liczba 1: " + Funkcje.toString(re, im));
    System.out.println("Liczba 2: " + Funkcje.toString(re1, im1));
    System.out.println();
    
    switch (wybor){
        case 1:
            System.out.println("Modul 1 liczby: ");
            System.out.println(" " +Funkcje.Modul(re, im));
            System.out.println("Modul 2 liczby: ");
            System.out.println(" " +Funkcje.Modul(re1, im1));
            break;
        case 2:
            System.out.println("Liczba sprzezona do 1 liczby: ");
            Funkcje.Sprzezenie(re, im);
            System.out.println("Liczba sprzezona do 2 liczby: ");
            Funkcje.Sprzezenie(re1, im1);
            break;
        case 3: 
            Funkcje.Suma(re, im, re1, im1);
            break;
        case 4:
            Funkcje.Roznica(re, im, re1, im1);
            break;
        case 5: 
            Funkcje.Iloczyn(re, im, re1, im1);
            break;
        case 6:
            Funkcje.Iloraz(re, im, re1, im1);
            break;  
        default:
            System.out.println("Wybrano nieprawidlowy numer.");
    }
}
    
}

