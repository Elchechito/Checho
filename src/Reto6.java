import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int resultado1, resultado2, total, operacion;

    resultado1=(int)(Math.random()*6+1);
    resultado2=(int)(Math.random()*6+1);
    total=resultado1+resultado2;

    System.out.println("desea jugar?  1.Si  2.No");
    operacion=leer.nextInt();
    if (operacion==1 && total==3) {
        System.out.println("el resultado del primer dado es " +resultado1+ " y el resultado del segundo dado es " +resultado2+ " y el total de los dados es " +total+ " FELICIDADES, GANO!!!"); 
    } else
    if(operacion==1 && resultado1==1 && resultado2==1){
        System.out.println("el resultado del primer dado es " +resultado1+ " y el resultado del segundo dado es " +resultado2+ " Obtuvo par de unos, FELICIDADES, GANO!!!");
    } else 
    if (operacion==1 && total==12 || total==12 || total==2){
        System.out.println("el resultado del primer dado es" +resultado1+ " y el resultado del segundo dado es " +resultado2+ " el total de los dados es " +total+ " FELICIDADES, GANO!!!");
    } else 
    if (operacion==1 && total==7){
        System.out.println("el resultado del primer dado es " +resultado1+ " y el resultado del segundo dado es " +resultado2+ " el total de los dados es " +total+ " FELICIDADES, GANO!!!");
    } else
    if (operacion==1 && total==11) {
        System.out.println("el resultado del primer dado es " +resultado1+ " y el resultado del segundo dado es " +resultado2+ " el total de los dados es " +total+ " FELICIDADES, GANO!!!");
    } else 
    if (operacion!=1) {
        System.out.println("Vuelva pronto!"); 
    } else {
    System.out.println("el resultado del primer dado es " +resultado1+ " y el resultado del segundo dado es  " +resultado2+ " el total de los dados es " +total+ " PERDIO" );
    }

    leer.close();
    
    
    
    
    }
}