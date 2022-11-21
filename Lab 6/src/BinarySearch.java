/*public class BinarySearch {
    public static boolean search(int[] array, int first, int last, int searchedValue){
        if(last >= first){
            int mid = first + (last-first)/2;

            if(array[mid] == searchedValue){
                return true;
            }
            if (array[mid] > searchedValue){
                return search((array, first, mid-1, searchedValue));  //search in left subarray
            }else{
                return search(array,mid+1,last,searchedValue);  //search in right subbaray;
            }
        }
        return false;
    }

}*/
