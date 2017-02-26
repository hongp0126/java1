/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package class2;


/**
 *
 * @author hongp
 */
public class Class2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double [] C = {24, 27, 28, 29, 31}; //some numbers inside the array C
        double [] F = new double[5]; //empty array F
        double [] K = new double[5]; //empty array K
        
        for(int a = 0; a < C.length; a = a+1) {

            F[a] = (C[a]*9)/5 + 32;
            K[a] = C[a] + 273.15;
            
        System.out.println("The Fahrenheit number of C is " +F[a]+ " and the Kelvin number of C is " + K[a]);
       }
    }
}
