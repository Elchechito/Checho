import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) { 
        Scanner lectura = new Scanner(System.in);
        int moneda, resultado, suerte;
        System.out.println("elige 1.cara 2.cruz");
        moneda=lectura.nextInt();
        
        switch (moneda) {
        case 1: 
            resultado=1;          
            System.out.println("eligio cara");
                break;

        case 2: 
        resultado=2;          
        System.out.println("eligio sello");
            break;
         }
         
        suerte=( (int)(Math.random()*2+1)    );


        switch (suerte) {
            case 1: 
            suerte=1;          
            System.out.println("la maquina eligio cara");
                break;
                
            case 2: 
            suerte=2;          
            System.out.println("la maquina eligio sello");
                break;
        }


        lectura.close();
}
        
}