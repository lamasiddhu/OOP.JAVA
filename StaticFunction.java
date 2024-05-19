public class StaticFunction{
    /*in the following public and static is optional*/
    public static int addTwoNumber(int a , int b){
        int sum = a + b ;
        return sum;
    }
    public static String vendingMachine(int menu){
        if(menu == 1){
            return "Coke";
        }
        if(menu == 2){
            return "water";
        }
        if (menu == 3){
            return "Frooti";
        }
        return "Nothing";
        
        public static boolean checkEven(int num){
            int(num % 2 == 0){
                return true;
            }else{
                return false;
            }
        }
        public static String checkEligible(int age , String name){
            if(age < 10){
                return "Sorry" +name  +", you are not eligible";
            }else{
                return "Congratulation"+ name +",you are eligible"
            }
        }
        public static double makeMultiply(double num1, double num2){
            return num1 * num2;
        }
    }
    public static void main (String[]args){
        //If a function is static no need to make object
        //If the function is static in the same class you can simple call the method
        int sumReturn = addTwoNumber(10 , 30);
        System.out.println("The sum is"+ sumReturn);

        String frooti = vendingMachine(3);
        System.out.println("frooti check" + frooti);
        /*Task make a funtion checkEven
         * that takes one int
         * that returns a boolean
         * if the int is even return true else false
         */

         /*Task2
          * make a function checkEligible
          * that takes one int age , one String name
          * If the age is < 10
          * return String "Sorry name , you are not eligible"
          * else return "Congratulation name, you are eligible"
          */


          /*Task 3
           * Make a function makeMultiply
           * that takes 2 double
           * return a double with the multiplication of two */
    }
}