import java.util.Scanner;

public class Budget {
    public static void main(String[] args) throws Exception {
        Double ancho, largo, area, presupuesto;
        System.out.println("ingrese el ancho");
        Scanner lectura=new Scanner(System.in);
        ancho= lectura.nextDouble();
        System.out.println("ingrese el largo");
        largo= lectura.nextDouble();
        area= largo*ancho;
        presupuesto = 45.000*area;
    
        System.out.println("la superficie a cubrir tiene"+ancho+"metros de ancho *"+largo+"metros de largo, con 2 metros cuadrados. El presupuesto del proyecto es: "+presupuesto);

        lectura.close();





    }
}