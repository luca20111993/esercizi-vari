/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi.vari;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class GiocatoreMorra {

    private String nome;
    /*private int soldi = 0;*/

    public GiocatoreMorra(String nomeGiocatore/*, int credito*/) {
        nome = nomeGiocatore;
        /*soldi = credito;*/
    }

    public String Scelta() {
        
        String input2 = "";
        String output="";
        boolean ancora = true;
        

        while (ancora == true) {
        
            input2 = JOptionPane.showInputDialog("Inserire la tua scelta: ");
            
            if (input2.equalsIgnoreCase("sasso") || input2.equalsIgnoreCase("forbice") || input2.equalsIgnoreCase("carta")) {

                
                output = "Scelta valida , hai scelto: " + input2 ;
                System.out.println(output);
                ancora = false;
                return input2;

            } else {
                
                output = "Scelta NON valida , hai scelto: " + input2 + "\nRifai la tua scelta.";
                System.out.println(output);
                ancora = true;
                

            }

            //return ris;
        }
            return output;
    }
    }


