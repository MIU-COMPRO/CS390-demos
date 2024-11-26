package lesson2.random;

import java.util.Random;

import lesson2.staticdemo.RandomNumbers;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(); // 1.
         int x = RandomNumbers.getRandomInt(); 
      
       int rn =  RandomNumbers.getRandomInt(1, 6); // Own api
        // System.out.println(x);
         System.out.println(rn);
         int rn1 =  RandomNumbers.getRandomInt(1, 6); // Own api
       //  System.out.println(x);
         System.out.println(rn1);
         
      //  System.out.println(Math.random()); // 2. 
        
        String x1 = "Welcome, to, Java";
          String[]  arr =    x1.split(",");
        
        
		

	}

}
