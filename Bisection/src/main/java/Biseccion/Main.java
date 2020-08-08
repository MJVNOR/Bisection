/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biseccion;

import static Biseccion.Biseccion.F;
import static Biseccion.Biseccion.hayRaiz;
import static Biseccion.Biseccion.sacarRaiz;
import static Biseccion.Biseccion.sacarK;
/**
 *
 * @author Martín
 */
public class Main {
    //2x+senx
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        /*
        double a = -0.5, b = 0.5, epsilon = 0.00001; 
        
        if (F(a) * F(b) == 0){
            System.out.println("Hay raiz");
            if (F(a) == 0) {
                System.out.println("Respuesta:" + a);
            } else {
                System.out.println("Respuesta:" + b);
            }
        }else{
            boolean siHayRaiz = hayRaiz(a,b);
            if (siHayRaiz == true){
                int k = sacarK(a, b, epsilon);
                sacarRaiz(a,b,k);
            }else{ 
            //something
            }
        }
        */
    
        
        MainWindow ventana = new MainWindow();
        ventana.setTitle("Bisección");
        ventana.setSize(700,500);
        ventana.setLocation(200, 40);
        ventana.setVisible(true);   
    }
    
    
}
