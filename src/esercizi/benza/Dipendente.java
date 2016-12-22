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
public class Dipendente {
    String cognome , nome;

    public Dipendente(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String addNewStazione(String città, int QTMax, int QTAttuale) {
        String msg = "Impossibile aggiungere questa stazione";
        if (città.equals("") || QTMax == 0 || QTAttuale ==0) {
            return msg;
        }

        /*int newcode = 1;
        if (bib.getElencoLibri().size() > 0) {
            newcode = bib.getElencoLibri().get(bib.getElencoLibri().size() - 1).getCodLibro() + 1;
        }*/

        Distributore d = new Distributore(città, QTMax, QTAttuale);
        D. bib.getElencoLibri().add(l);
        msg = "Aggiuntio libro: " + newcode + "#: " + titolo + " - " + autore;
        return msg;
    }
}
