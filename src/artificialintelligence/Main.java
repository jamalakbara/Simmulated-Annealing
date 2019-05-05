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
public class Main {
    
    private static double getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
	}
        Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
	   
   public static void main(String args[]){  
        double x1 = getRandomNumberInRange(-10,10);
        double x2 = getRandomNumberInRange(-10,10);

        Fungsi f = new Fungsi(x1,x2);
        double BSF = f.funct();
        SA sims = new SA(5000000,0.725,BSF);
        sims.simulatedAn();
        System.out.println("nilai minimum = "+sims.getMinValue());
   }
}
