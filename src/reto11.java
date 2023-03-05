import java.util.Scanner;

public class reto11 {
        public static void name(String [] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double temperatura1, temperaturaF;
        System.out.println("ingrese la temperatura en grados centigrados(C°)");
        temperatura1=lectura.nextDouble();
        temperaturaF= (temperatura1-32)/1.8 ;
        System.out.println("la temperatura en grados Farenheit(F°) es " +temperaturaF+ "(F°");
     
        lectura.close();

    }
}    


