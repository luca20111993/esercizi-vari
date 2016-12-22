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
public class Distributore implements Comparable<Distributore>{
    private String città;
    private double capacitàMax;
    private double benzAttuale;

    public Distributore(double capacitàMax) {
        this.capacitàMax = capacitàMax;
    }
    
    public Distributore(String città, double capacitàMax, double benzAttuale) {
        this.città = città;
        this.capacitàMax = capacitàMax;
        this.benzAttuale = benzAttuale;
    }

    public String getCittà() {
        return città;
    }

    public double getCapacitàMax() {
        return capacitàMax;
    }

    public double getBenzAttuale() {
        return benzAttuale;
    }

    
    @Override
    public int compareTo(Distributore o) {
        String capacità1 = "" + this.capacitàMax;
        String capacità2 = "" + o.capacitàMax;
         return capacità1.compareTo(capacità2);
    }
    
}
