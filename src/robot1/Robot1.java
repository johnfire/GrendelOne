/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot1;

/**
 *
 * @author christopher-rehm
 */

        
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
 


public class Robot1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       
       senses mysenses = new senses();
       Movement myMovements = new Movement();
       Speech mySpeech = new Speech();
       
       mysenses.main(args);
        try {
            Movement.testpi();
        } catch (InterruptedException ex) {
            Logger.getLogger(Robot1.class.getName()).log(Level.INFO, null, ex);
        }
       
    }
    
}
