/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artificialintelligence;

import java.util.Random;

/**
 *
 * @author jamal
 */
public class Fungsi{
    
    private double x1,x2;
    
    public Fungsi (double x1,double x2){
        this.x1 = x1;
        this.x2 = x2;
    }
     
     public double funct(){
        double sinX1 = Math.sin(x1);
        double cosX2 = Math.cos(x2);
        double pitagoras = Math.sqrt(Math.pow(x1, 2)+Math.pow(x2, 2));
        double exp = Math.exp(Math.abs(1-(pitagoras/Math.PI)));
        
        double f = -(Math.abs(sinX1*cosX2*exp));
        return f;
     }
     
     
}
