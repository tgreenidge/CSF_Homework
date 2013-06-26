/**
 * Created with IntelliJ IDEA.
 * User: Trinitee
 * Date: 6/24/13
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntArraySorter {
    public int[] sortArray(int[] array) {
        // For each number in the array
        // Look at every number after it, in sequence
        // If the first number is greater than the second, swap them
        int placeholder = 0;

        for (int i = 0; i < array.length; i++ ){
            for (int x = i + 1; x < array.length; x++ ){
                if(array[i] > array[x]) {
                    placeholder = array[i];
                    array[i] = array[x];
                    array[x] = placeholder;

                }
            }
        }
        return array;
    }
}
