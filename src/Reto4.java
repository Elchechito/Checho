import java.util.Scanner;

public class Reto4 {
 
    public static void main(String[] args) { 
        Scanner lectura = new Scanner(System.in);
        int eleccion, maquina, resultado, resultadomaquina;

        System.out.println("elija 1.pierdra 2.papel 3.tijera");
        eleccion=lectura.nextInt();

        switch (eleccion) {
            case 1: 
            resultado=1;          
            System.out.println("eligio piedra");
                break;
                
            case 2: 
            resultado=2;          
            System.out.println("eligio papel");
                break;

            default:
            System.out.println("eligio tijera");
                break;
        }

 
        maquina=( (int)(Math.random()*3+1)    );

        switch (maquina) {
            case 1: 
            resultadomaquina=1;          
            System.out.println("la maquina eligio piedra");
                break;
                
            case 2: 
            resultadomaquina=2;          
            System.out.println("la maquina eligio papel");
                break;

            default:
            System.out.println("la maquina eligio tijera");
                break;
        
            
        
    }

    lectura.close(); 
    }

}
