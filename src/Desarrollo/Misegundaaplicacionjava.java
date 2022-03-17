
package Desarrollo;

public class Misegundaaplicacionjava {
    
    
    public static void main(String[] args) {
        //se hace llamado cada uno de los metodos creados
        metodoConvoid();
        metodoConInt();
        metodoConDouble();
        metodoConstring();
        
    }
    public static void metodoConvoid(){
        System.out.println("contenido del metodo con void");
    }
    
    public static int metodoConInt(){
        System.out.println("contenido del metodo con int");
        return 0;
        }
    
    public static double  metodoCondouble(){
        System.out.println("contenido del metodo con double");
        return 0.0;
    }
    public static String metodoConstring(){
        System.out.println("contenido del metodo string");
        return "";
    }
}
