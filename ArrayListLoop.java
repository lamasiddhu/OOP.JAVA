import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args) {
        /*import Arraylist from java.util */
        ArrayList<String> names= new ArrayList<>();
        names.add("AAyam");
        names.add("adhar");
        names.add("Yausan");
        names.add("Niraj");
        names.add("Ayush");
        names.add("Rijan");
        /*To logo, find the lenght/element count, .size() */
        int namesLenght= names.size();
        /*Loop sae as array */
        for(int index= 0; index<namesLenght;index++){
            //get each elemts with .get(index);
            String singleName= names.get(index);
            System.out.println("Index:"+index+"Value"+singleName);
        }
         // Using Foreach in java iterate with elment/ actaul value
         for(String element:names){
            System.out.println(element);


    }
}