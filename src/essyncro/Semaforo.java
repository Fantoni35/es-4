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
public class Semaforo {
    int valore;             /*0=rosso*/
    public Semaforo(int v){
        valore=v;
    }
    synchronized public void p(){
        while(valore==0){           try {
            /*semaforo rosso*/
            wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
    
            valore--;           /*semaforo rosso*/
}    
    }/*fine p*/
        
 synchronized public void v(){
    valore++;                   //semaforo verde
    notify();                      //risveglia thread in coda
}                           // fine v

}


