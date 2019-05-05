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
public class SA{

    private int T;
    private double alpha;
    private double x1,x2,ns1,ns2,P,R,Min,BSF;
    
    public SA(int T, double alpha,double bsf){
        this.T = T;
        this.alpha = alpha;
        this.BSF = bsf;
    }
    
    private static double getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
	}
        Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
    
    public void simulatedAn(){
        Min = BSF;
        
        for (int i = 0; i < T; i++) {
            ns1 = getRandomNumberInRange(-10,10);
            ns2 = getRandomNumberInRange(-10,10);
            
            T = (int) (T * alpha);
            
            Fungsi f2 = new Fungsi(ns1,ns2);
            double NS = f2.funct();
            double deltaE = NS - BSF;
            
            if (deltaE < 0) {
                BSF = NS;
            }else{
                R = getRandomNumberInRange(0,1);
                P = Math.exp(-deltaE/T);
                if (P > R) {
                    BSF = NS;
                }
            }
            
            if (BSF < Min) {
                Min = BSF;
            }
        }
    }
    public double getMinValue(){
        return Min;
    }
}
