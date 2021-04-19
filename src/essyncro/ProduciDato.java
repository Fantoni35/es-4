/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essyncro;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ProduciDato extends Thread {   //si scrive un dato nel buffer quando abbiamo il semaforo verde e quindi vuoto altrimenti si sospende e alla fine dell'operazione di scrittura setta verde il semaforo
    Semaforo pieno;
    Semaforo vuoto;
    int tanti=5;        //numero di elementi da produrre
    final int attesa=500;   //tempo di riposo e di attesa
    public ProduciDato(Semaforo s1, Semaforo s2){
        pieno=s1;
        vuoto=s2;
    }
    public void run (){
        for(int i=0;i<tanti;i++){   try {
            // for per tutte le volte che devo produrre
            vuoto.p();      //qui il consumatore aspetterà il produttore che lo sblocchi
            ProdConsSem.buffer=i;           //produce un numero
            System.out.println("Scrittore:dato scritto:"+i);
            pieno.v();                      //qui si sblocca il consumatore
            Thread.sleep(attesa);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProduciDato.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        System.out.println("Scrittore:termine scrittura dati");
}       //fine run
    }
