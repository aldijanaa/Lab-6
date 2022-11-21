import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //task 1
        //int values[] = {6,5,8,7,11};
        //System.out.println("smallest is: " + smallest(values));

        //task 2
        //int values[] = {6,5,8,7,11};
        //System.out.println("this is: " + indexOfTheSmallest(values));


        //task 3
        /*int [] values = {-1, 6,9,8,12};
        System.out.println("smallest is " + indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));*/

        //task 4
        int [] values = {3,2,4,5,8};
        System.out.println(Arrays.toString(values));  //how original array looks like
        swap(values,1,0);  //calling swap and passing values to it
        System.out.println(Arrays.toString(values));

        swap(values,0,3);
        System.out.println(Arrays.toString(values));


        //task 5
        /*int[] array = {-3,2,3,47,8,12};
        Scanner reader = new Scanner(System.in);

        System.out.println("values of the array " + Arrays.toString(array));
        System.out.println();

        System.out.println("enter searched number ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        if(result == false){
            System.out.println("Value" + searchedValue + "is not in the array");
        }else{
            System.out.println("value " + searchedValue + " is in the array ");
        }*/


        //task 6
        //int[] array ={5,1,3,4,2} ;
        //printElegantly(array);


        //task 7
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky = new NightSky(0.2, 15, 6);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());





    }

    //task 1
    /*public static int smallest(int [] array){
        int smallest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest) { //if next element of array is smaller than previous one
                smallest = array[i];   //smallest becomes
            }

        }
        return  smallest;
    }*/

    //task 2
    /*public static int indexOfTheSmallest(int [] array){
        int smallest = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest) { //if next element of array is smaller than previous one
                index = i;
                smallest = array[i];   //smallest becomes
            }

        }
        return  index;

    }*/
     //task 3
    /*public static int indexOfTheSmallestStartingFrom(int [] array, int index){
        int smallest = array[index];
        int indexOfSmallest = index;

        for(int i = index; i < array.length; i++){
            if(array[i] < smallest) { //if next element of array is smaller than previous one
                indexOfSmallest = i;
                smallest = array[i];   //smallest becomes
            }

        }
        return  indexOfSmallest;


    }*/


    //task 4
    /*public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }*/

    //task 6
    /*public static void printElegantly(int[] array){
        for( int i= 0; i<array.length; i++){
            if(i == array.length-1){
                System.out.println(array[i]);
            }else{
                System.out.println(array[i] + " , ");
            }
        }

    }*/

}