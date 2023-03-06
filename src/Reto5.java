import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        String nombre, apellido, nombreCompleto;
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
        System.out.println("Ingrese su apellido");
        apellido=leer.next();
        nombreCompleto=nombre+apellido;
        System.out.println("su nombre tiene de largo: " +nombre.length()+ "y su apellido tiene de largo: " +apellido.length());
        System.out.println("su nombre completo es: " +nombreCompleto);
        System.out.println("su nombre es " +nombre.toUpperCase()+ " " +apellido.toLowerCase());
        System.out.println(nombre.substring(0, 2)+apellido);
        leer.close();



    }
}
