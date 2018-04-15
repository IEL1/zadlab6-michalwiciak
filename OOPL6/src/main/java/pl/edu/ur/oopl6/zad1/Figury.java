package pl.edu.ur.oopl6.zad1;

public class Figury {
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Obliczona wartosc wynosi: ");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        double wynik = Math.PI*Math.pow(r,2);
        wynik*=100;
        wynik=Math.round(wynik);
        wynik/=100;
        return wynik;
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        double wynik = 2*Math.PI*r;
        wynik*=100;
        wynik=Math.round(wynik);
        wynik/=100;
        return wynik;
    }
    public static double PoleKwadratu(double r){
    double wynik =Math.pow(r,2);
    wynik*=100;
    wynik=Math.round(wynik);
    wynik/=100;
    return wynik;
    }
    
    public static double ObwodKwadratu(double r){
    double wynik =4*r;
    wynik*=100;
    wynik=Math.round(wynik);
    wynik/=100;
    return wynik;
    }
    
    public static double PoleProstokata(double r, double H){
    double wynik =r*H;
    wynik*=100;
    wynik=Math.round(wynik);
    wynik/=100;
    return wynik;    
    }
    
    public static double ObwodProstokata(double r, double H){
    double wynik =2*r+2*H;
    wynik*=100;
    wynik = Math.round(wynik);
    wynik/=100;
    return wynik;     
    }
    
    public static double PoleStozka(double r, double l){
    double wynik =Math.PI*r*(r+l);
    wynik*=100;
    wynik = Math.round(wynik);
    wynik/=100;
    return wynik;      
    }
    
    public static double ObjetoscStozka(double r, double H){
    double wynik =1.0/3.0*Math.PI*Math.pow(r, 2)*H;
    wynik*=100;
    wynik = Math.round(wynik);
    wynik/=100;
    return wynik;      
    }
    
    public static double PoleWalca(double r, double H){
    double wynik =2*Math.PI*Math.pow(r, 2)+2*Math.PI*r*H;
    wynik*=100;
    wynik = Math.round(wynik);
    wynik/=100;
    return wynik;     
    }
    
    public static double ObjetoscWalca(double r, double H){
    double wynik =Math.PI*Math.pow(r, 2)*H;
    wynik*=100;
    wynik = Math.round(wynik);
    wynik/=100;
    return wynik; 
    }
}
