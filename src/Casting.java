public class Casting {
    public static void main(String[] args) {
        // Exercise 1
        
        // Creating double variable 

        double num = 112.35;
        System.out.println("Double: " + num);

        // casting double variable to int
 
        int num1 = (int)num;
        System.out.println("int: " + num1);
       
        // Exercise 2

        // creating string variable

         String data  = "49";
         System.out.println("The string value is: " + data);

        //  converting string variable to int

         int num2 = Integer.parseInt(data);
         System.out.println("The integer value is: " + num2);
    }
}
