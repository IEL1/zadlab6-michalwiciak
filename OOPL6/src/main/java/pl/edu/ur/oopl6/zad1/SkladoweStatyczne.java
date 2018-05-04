package pl.edu.ur.oopl6.zad1;
import java.util.Scanner;

public class SkladoweStatyczne {

    public static void main(String[] args) {
        // TODO zad 3
        
        System.out.println("----------------------------");
        System.out.println("Co chcesz policzyc?");
        System.out.println("1. Pole kola");
        System.out.println("2. Obwod kola");
        System.out.println("3. Pole kwadaratu");
        System.out.println("4. Obwod kwadratu");
        System.out.println("5. Pole prostokata");
        System.out.println("6. Obwod prostokata");
        System.out.println("7. Pole stozka");
        System.out.println("8. Objetosc stozka");
        System.out.println("9. Pole walca");
        System.out.println("10. Objetosc walca");
        System.out.println("----------------------------");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        switch(liczba){
            case 1:
                System.out.println("Podaj dlugosc promienia: ");
                double r = scanner.nextDouble();
                System.out.println(Figury.PoleKola(r));
                break;
            case 2:
                System.out.println("Podaj dlugosc promienia: ");
                double r2 = scanner.nextDouble();
                System.out.println(Figury.ObwodKola(r2));
                break;
            case 3:
                System.out.println("Podaj dlugosc boku: ");
                double a = scanner.nextDouble();
                System.out.println(Figury.PoleKwadratu(a));
                break;
            case 4:
                System.out.println("Podaj dlugosc boku: ");
                double a2 = scanner.nextDouble();
                System.out.println(Figury.ObwodKwadratu(a2));
                break;
            case 5:
                System.out.println("Podaj dlugosc pierwszego boku: ");
                double b1 = scanner.nextDouble();
                System.out.println("Podaj dlugosc drugiego boku: ");
                double b2 = scanner.nextDouble();
                System.out.println(Figury.PoleProstokata(b1,b2));
                break;
            case 6:
                System.out.println("Podaj dlugosc pierwszego boku: ");
                double b3 = scanner.nextDouble();
                System.out.println("Podaj dlugosc drugiego boku: ");
                double b4 = scanner.nextDouble();
                System.out.println(Figury.ObwodProstokata(b3,b4));
                break;
            case 7:
                System.out.println("Podaj dlugosc promienia: ");
                double r3 = scanner.nextDouble();
                System.out.println("Podaj dlugosc tworzacej stozka: ");
                double r4 = scanner.nextDouble();
                System.out.println(Figury.PoleStozka(r3,r4));
                break;
            case 8:
                System.out.println("Podaj dlugosc promienia: ");
                double r5 = scanner.nextDouble();
                System.out.println("Podaj dlugosc wysokosci: ");
                double h = scanner.nextDouble();
                System.out.println(Figury.ObjetoscStozka(r5,h));
                break;
            case 9:
                System.out.println("Podaj dlugosc promienia: ");
                double r6 = scanner.nextDouble();
                System.out.println("Podaj dlugosc wysokosci: ");
                double h2 = scanner.nextDouble();
                System.out.println(Figury.PoleWalca(r6,h2));
                break;
            case 10:
                System.out.println("Podaj dlugosc promienia: ");
                double r7 = scanner.nextDouble();
                System.out.println("Podaj dlugosc wysokosci: ");
                double h3 = scanner.nextDouble();
                System.out.println(Figury.ObjetoscWalca(r7,h3));
                break;
            default:
                System.out.println("Podano niewlasciwy numer");
                break;
        }
    }
    
}
