/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essyncro;

import java.util.Vector;

/**
 *
 * @author PC
 */
public class EsSyncro {

    /**
     * @param args the command line arguments
     */public static int[] buffer = new int[10];
    public static void main(String[] args) {
     Semaforo pieno= new Semaforo (0);
     Semaforo nuovo= new Semaforo(1);
             Thread t1= new Thread  (new produttore,(pieno vuoto));
             Thread t2= new Thread ("produttore due");
             Thread t3= new Thread("produttore tre");
             Thread t4= new Thread("produttore quattro")
                     t1.start();
                     t2.start();
                     t3.start();
                     t4.start();
    }
    
}
