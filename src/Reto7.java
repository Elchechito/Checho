import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int descuento, bolita, compra, total;
        System.out.println("ingrese el valor de su compra");
        compra=leer.nextInt();
        bolita=(int)(Math.random()*4+1 );
        descuento=0;
        if (compra>50000 && bolita==1 ){
            descuento=(10*compra)/100; total=compra-descuento;
            System.out.println("Ah ganado un descuento del 10% en su compra por sacar la bolita roja, el total de su compra sera de" +total);
        }
        



    
    
    
    }

}
