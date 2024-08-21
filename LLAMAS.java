/*
Daniel Balser
LLAMAS Project
 */
package llamas;
import java.util.Scanner;


public class LLAMAS {// start class

   
    public static void main(String[] args) {// start main method
    
    
        Scanner kb= new Scanner(System.in);
        double llama_land;
        int Price_llama;
        int a; // length of one side of the octagon
        double area;
        double num_llamas;
        double cost;

        
        
        
        
        
        llama_land= Math.pow(42,2);
        Price_llama = 250;
        System.out.println("Input dimension of the land:");
        a= kb.nextInt();
        area= 2 * (1 + Math.sqrt(2)) * Math.pow(a,2);
        num_llamas= Math.floor(area / llama_land);
        cost= num_llamas * Price_llama;
        
           
      
    
       System.out.println("The total area of the land is "+ area);
       System.out.println("The number of llamas is "+ num_llamas);
       System.out.println("The total cost of the llamas is $"+ cost);
       
    }// end main method
    
}// end class

