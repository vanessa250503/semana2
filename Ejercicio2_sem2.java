package ejercicios_practica2;
import java.util.Scanner;
public class Ejercicio2_sem2 {
    public static void main(String[] args) {
    double DAI;
    double depreciacion = 0.10;
    double totaI;
    double totaII;
    double totaIII;
    double mulI= 0.25;
    double mulII = 0.10;
    double total;
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese el valor del vehículo en USA");
    double valorV = leer.nextDouble();
    
    System.out.println("Ingrse el costo por flete");
    double flete = leer.nextDouble();
    
    System.out.println("Ingrese el valor de seguro");
    double seguro = leer.nextDouble();
    
    DAI= valorV * depreciacion;
    totaI= valorV - DAI;
    totaII = totaI- flete;
    totaIII = totaII -seguro;
    total = totaIII * mulI;
    
    System.out.println("EL valor por Derecho Arancelario a la importacion de su vehicule es de:$ " + total);
    depreciacion = valorV * mulII;
    
    System.out.println("El valor de Depreciacion es de: $" + depreciacion);
    }
    
}