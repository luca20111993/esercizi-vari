/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi.vari;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Morra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //enuncio le mie variabili
        String input;
        String sasso = "";
        String carta = "";
        String forbice = "";
        String output = "";

        //Chiedo all'utente di inserire le proprie credenziali
        input = JOptionPane.showInputDialog("Inserire il nome: ");
        String nomeGiocatore = input;
        //Chiedo all'utente di inserire il credito iniziale
        //input = JOptionPane.showInputDialog("Inserire credito da giocare: ");
        //int credito = Integer.parseInt(input);

        //Inizio elaborazione , creo nuovo giocatore con classe GiocatoreMorra
        GiocatoreMorra g = new GiocatoreMorra(nomeGiocatore/* ,credito*/);

        //Gli faccio scegliere fra carta sasso forbice
        String input1 = g.Scelta();

        //System.out.println(input1);

        //Giocando contro il computer dobbiamo far scegliere al computer fra c , s , f
        //Creo un'array e gli assegno i miei valori
        String[] ScelteComputer = new String[3];
        
        Computer c = new Computer();
        
        ScelteComputer[0] = c.getSasso();
        ScelteComputer[1] = c.getCarta();
        ScelteComputer[2] = c.getForbice();

        Random rand = new Random();
        int risposta = rand.nextInt(ScelteComputer.length);
        //System.out.println(risposta);
        String risposta2 = ScelteComputer[risposta];
        //System.out.println(risposta2);

        System.out.println(output(input1, risposta2));

    }

    public static String output(String input1, String risposta2) {
        String output = "";

        if (input1.equalsIgnoreCase("sasso") && risposta2.equalsIgnoreCase("carta")) {
            output = "La scelta del giocatore era: " + input1 + " La scelta del computer è stata: " + risposta2 + "\n"
                    + "Il compure vince!";
        } else if (input1.equalsIgnoreCase("sasso") && risposta2.equalsIgnoreCase("forbice")) {
            output = "La scelta del giocatore era: " + input1 + " La scelta del computer è stata: " + risposta2 + "\n"
                    + "Il giocatore vince!";
        } else if (input1.equalsIgnoreCase("sasso") && risposta2.equalsIgnoreCase("sasso")) {
            output = "La scelta del giocatore era: " + input1 + " La scelta del computer è stata: " + risposta2 + "\n"
                    + "Pareggio!!!";
        } else if (input1.equalsIgnoreCase("carta") && risposta2.equalsIgnoreCase("carta")) {
            output = "La scelta del giocatore era: " + input1 + " La scelta del computer è stata: " + risposta2 + "\n"
                    + "Pareggio!!!";
        } else if (input1.equalsIgnoreCase("carta") && risposta2.equalsIgnoreCase("forbice")) {
            output = "La scelta del giocatore era: " + input1 + " La scelta del computer è stata: " + risposta2 + "\n"
                    + "Il computer vince!";
        } else if (input1.equalsIgnoreCase("carta") && risposta2.equalsIgnoreCase("sasso")) {
            output = "La scelta del giocatore era: " + input1 + " La scelta del computer è stata: " + risposta2 + "\n"
                    + "Il giocatore vince!";
        } else if (input1.equalsIgnoreCase("forbice") && risposta2.equalsIgnoreCase("carta")) {
            output = "La scelta del giocatore era: " + input1 + " La scelta del computer è stata: " + risposta2 + "\n"
                    + "Il giocatore vince!";
        } else if (input1.equalsIgnoreCase("forbice") && risposta2.equalsIgnoreCase("forbice")) {
            output = "La scelta del giocatore era: " + input1 + " La scelta del computer è stata: " + risposta2 + "\n"
                    + "Pareggio!!!";
        } else if (input1.equalsIgnoreCase("forbice") && risposta2.equalsIgnoreCase("sasso")) {
            output = "La scelta del giocatore era: " + input1 + " La scelta del computer è stata: " + risposta2 + "\n"
                    + "Il computer vince!";
        }

        return output;
    }
}
