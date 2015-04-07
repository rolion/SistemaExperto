/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaexperto.Entidad;

/**
 *
 * @author Lion
 */
public class Literal extends Hecho{
    private boolean neg;
    private int oprel;

    public Literal(boolean neg, int oprel, int var, double valor) {
        super(var, valor);
        this.neg = neg;
        this.oprel = oprel;
    }

    public Literal(boolean neg, int oprel) {
        this.neg = neg;
        this.oprel = oprel;
    }

    public boolean isNeg() {
        return neg;
    }

    public void setNeg(boolean neg) {
        this.neg = neg;
    }

    public int getOprel() {
        return oprel;
    }

    public void setOprel(int oprel) {
        this.oprel = oprel;
    }

 
    
}
