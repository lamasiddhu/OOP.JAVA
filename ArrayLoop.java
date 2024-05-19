public class ArrayLoop{
    public static void main (String[]args){
        int[] data = {10, 20, 30, 40, 50};
        int arrayLength = data.length;
        /* first approach */
        for (int index = 0; index < arrayLength; index ++){
            System.out.println("Index" + index + "Value" +data(index));
        }
        System.out.println("Using length -1");
        /*Second approach */
        for(int index = 0; index <= arraylength - 1; index++ ){
            System.out.println("Index" + index + "Value" + data(index));
        }
        //data[100]; this will crash, no index accessible
        /*Task Make an array of length 10 
         * Add the value as 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
         * Make another array with the same length 10
         * Add the value of first array in neagtive onto second array
         * Use loop on first array to complet this
         * second array shoud be -10, -20, -30, -40, -50, -60, -70, -80, -90, -100
         * Print the second array
        */

        int[] firstArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int firstArrayLength = firstArray .Length;
        int[]secondArray = new int[10];
        for(int index = 0; index < firstArrayLength; index ++){
            secondArray[index] = -firstArray[index];
            System.out.println(secondArray[index]);
        }


        /*Task
         * print the second array in descending
         * should be : -100, -90, -80, -70, ..........................., -10
         * NOte : start loop from (length - 1) to 0
         */

         int secondArrayLength = secondArray.length;
         for(int index = firstArrayLength -1; index >= 0 ; index --){
            System.out.println("Descending"+ secondArray(index));
         }

    }
}