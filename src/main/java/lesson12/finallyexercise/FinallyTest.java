package lesson12.finallyexercise;

class FinallyTest {
	public static void test() throws Exception {
        try {
         //  return;                         // 1
          // System.exit(0);                 // 2
        	
            throw new Exception("first");   // 3a
        }
        catch (Exception x){
	         System.out.println(x.getMessage());
	        // System.err.println(x);
             throw new Exception("second");  // 3b
        }
       
        finally {
            System.out.println("finally!");
        }
      
    }

	public static void main(String[] args){
        try{
            test();
        }
        catch(Exception x){
            System.out.println(x.getMessage());
	   }
    }
}
