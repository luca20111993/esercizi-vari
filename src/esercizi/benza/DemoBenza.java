/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi.benza;

/**
 *
 * @author tss
 */
public class DemoBenza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String msg="";
        
        
        Distributore dist1 = new Distributore("Torino", 99.9, 65.4);
        Distributore dist2 = new Distributore("Torino", 99.8, 50);
        Distributore dist3 = new Distributore("Torino", 88.5, 77.7);
        
        
        
        if ((dist1.compareTo(dist2)) == 0){
             msg = "Entrambi i distributori hanno la stesas capacità max";
        } 
        
        if((dist1.compareTo(dist2) <0)){
             msg = "Il primo distributore ha una capacità minore del secondo \nCapacità primo distributore: " +
                    dist1.capacitàMax  + " - Capacità secondo distributore : " + dist2.capacitàMax;
        }
        if((dist1.compareTo(dist2))>0){
             msg = "Il primo distributore ha una capacità maggiore rispetto al secondo \nCapacità primo distributore: " + 
                    dist1.capacitàMax + " - Capacità secondo distributore : " + dist2.capacitàMax;
        }
        System.out.println(msg);
    }
    
}
