/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi.benza;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class RegistroBenzinai {
    
    private ArrayList<Distributore> registro = new ArrayList<Distributore>();

    
    public ArrayList<Distributore> getReg() {
        return registro;
    }

    public void setReg(ArrayList<Distributore> registro) {
        this.registro = registro;
    }

   

    public RegistroBenzinai() {
    }
    
}
