import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        double nota1,nota2,nota3,asistencia,promedio;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = lectura.nextLine();
        System.out.println("Ingrese la primer nota");
        nota1=lectura.nextDouble();
        System.out.println("Ingrese la segunda nota");
        nota2=lectura.nextDouble();
        System.out.println("Ingrese la tercer nota");
        nota3=lectura.nextDouble();
        System.out.println("Ingrese el porcentaje de la asistencia");
        asistencia=lectura.nextDouble();
        
        promedio=(nota1+nota2+nota3)/3;

        if (promedio>=3.5 && asistencia >=70 || nombre.equals("checho")    ){
            //Si la condicion se cumple
            System.out.println("Aprobaste");
        } 
        else{
            //Si la condicion NO se cumple
            System.out.println("No aprobaste");
        }

        lectura.close();

    }

}
