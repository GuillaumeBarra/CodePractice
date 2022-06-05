import java.util.*;


class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        //convert list to array using stream
        int[] array = ar.stream().mapToInt(Integer::intValue).toArray();
        
        //create empty set
        HashSet<Integer> set = new HashSet<Integer>();
        int counter = 0;
        
        //add elements to set if they don't exist
        //remove element from set if they already exist and count 1 pair
        for(int i = 0; i < n; i++) {
            int element = array[i];
            if(set.contains(element)) {
                set.remove(element);
                counter++;
            } else {
                set.add(element);
            }
        }
        return counter;
    }
}
