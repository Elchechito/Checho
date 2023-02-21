import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
       double num1, num2, rest, rest2;
       int op;
        System.out.println("ingrese el primer numero");
        
        num1=lectura.nextDouble();
        System.out.println("ingrese el segundo numero");
        num2=lectura.nextDouble();

        System.out.println("1.suma 2.resta 3.multiplicacion 4.division 5.potencia 6.radicacion");
        op= lectura.nextInt();
            
        switch(op){
            case 1:
            rest=num1+num2;
            System.out.println("la suma entre " +num1+ " mas " +num2+ " es: " +rest);
            break;

            case 2:
            rest=num1-num2;
            System.out.println("la resta entre " +num1+ " menos " +num2+ " es: " +rest);
            break;

            case 3:
            rest=num1*num2;
            System.out.println("la multiplicacion entre " +num1+ " por " +num2+ " es: " +rest);
            break;

            case 4:
            rest=num1/num2;
            System.out.println("la division entre " +num1+ " y " +num2+ " es: " +rest);
            break;

            case 5:
            rest=Math.pow(num1,num2);
            System.out.println("la potenciacion entre " +num1+ " y " +num2+ " es: " +rest);
            break;
            
            case 6:
            rest=Math.sqrt(num1);
            rest2=Math.sqrt(num2);
            System.out.println("la raiz cuadrada de " +num1+ " es: " +rest+ " y la raiz cuadrada de " +num2+ " es: " +rest2);
            break;

            default:
            System.out.println("La opcion no es valida.");
            break;
            



        }

        lectura.close();
    }
}
