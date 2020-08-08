package Biseccion;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Martín
 */
public class Biseccion {
    
    public static double F(double x){
        //return (Math.pow(Math.E, x) + x);
        //return (x-Math.sin(1/x));
        //return (Math.log(x)-0.2*x+750);
        //return (Math.pow(Math.E, x) + Math.cos(x) - 0.1 * x);
        //return ((668.061)*(1-Math.pow(Math.E, (-10*x)/68.1))/x)-40;
        //return Math.pow(x, 10) - 1;
        //return 79-Math.pow(x,3.3); 
        //return 0.5 * Math.pow(x,3) - 4 * Math.pow(x, 2) + 6*x -2;
        return Math.pow(x,10) - 1;
        
    }
    
    public static boolean hayRaiz(double a, double b){
        if (F(a) < 0 && F(b) > 0 || F(a) > 0 && F(b) < 0) {
            System.out.println("Hay raiz");
            return true;
        } else{
            System.out.println("No hay raiz");
            return false;
        }
    }
    
    public static int sacarK(double a, double b, double epsilon){
        double k = (Math.log((b - a)/epsilon)/Math.log(2));
        int intK = (int) k + 1;
        return intK;
    }
    
    public static double sacarX(double a , double b){
        //Biseccion
        double x = ((a+b)/2);
        //falsa posicion
        //double x = ((F(b)*a-F(a)*b)/(F(b)-F(a)));
        return x;
    }
    
    public static boolean verAPosOrNeg(double a){
        if ((F(a)) < 0){
            return false;
        }else{
            return true;
        }

    }
        
    public static double cicloRaices(double a, double b , int k){
        
        /*
            https://www.chillyfacts.com/create-csv-file-using-java/        
        */
        try{
            PrintWriter pw= new PrintWriter
        (new File("C:\\Users\\Martín\\Documents"
                + "\\NetBeansProjects\\Biseccion\\books_table555.csv"));
            StringBuilder sb=new StringBuilder();

            double x = 0;
            System.out.println("||" + "n" + "||\t" + "a" + "\t||\t" + "b" + 
                    "\t||\t" + "x" + "\t||\t" 
                    + "Valor de la Funcion" + "\t||");
            sb.append("n,a,b,x,Valor de la funcíon \r");
                    
            for (int i = 0; i <= k; i++) {
                
                if (F(x) == 0)break;
                
                
                x = sacarX(a,b);
            
                double valorFuncion = F(x);
            
                System.out.println("||" + i + "||\t" + a
                        + "\t||\t" + b + "\t||"
                        + "\t" + x + "\t||\t" + valorFuncion + "\t||");
                sb.append(i + "," + a + "," + b + "," + x + "," +
                        valorFuncion + "\r");
                
                if (valorFuncion < 0) a = x;
                else b = x;
            
            }
            
            pw.write(sb.toString());
            pw.close();
            System.out.println("Respuesta: " + x);
            System.out.println("finished");
            return x;
        }catch (Exception e) {
            // TODO: handle exception
        }
        return 0;
    }
    
    public static double sacarRaiz(double a, double b, int k){
        
        boolean quienPosOrNeg = verAPosOrNeg(a);
        double x = 0;
        
        if (quienPosOrNeg == true) {
            // a es el positivo
            x = cicloRaices(b, a, k);
        }else{
            x = cicloRaices(a, b, k);
        }
        return x;
    }
                   
}
