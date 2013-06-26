/**
 * Created with IntelliJ IDEA.
 * User: Trinitee
 * Date: 6/24/13
 * Time: 6:27 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson02Samples {

    public static void main(String[] args) {
        // Call various other methods from here to run them
        //weirdLoop();
        //sort();
        //allAs();
        //reverseNumbers();
        //reverseArray();
        //isGeneticSequence();
        inputAndSearch();
        //calculator();
    }


    public static void sort() {
        int[] unsortedArray = {4,2,9,8,1,3,6,5};
        IntArraySorter sorter = new IntArraySorter();
        System.out.println("Unsorted: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted: " + Arrays.toString(sorter.sortArray(unsortedArray)));
    }

    public static void weirdLoop() {
        for (int i = -8123; i < 3243*31; i += (2351%923)) {
            System.out.println("i: " + i);
        }
    }

    public static void allAs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string: ");
            String s = scanner.next();
            System.out.println("The string only contains the letter 'a': " + stringIsAllAs(s));
        }
    }

    // There's a bug in this, find it
    public static boolean stringIsAllAs(String s) {
        int i = 0;
        while (i < s.length()) {

            char character = s.charAt(i);
            if (character == 'a' || character == 'A') {

                i++;
            }
            else {

                return false;
            }
        }
        return true;

    }

    // Methods to fill in
    public static void reverseNumbers() {

        // 1) Ask the user for how many numbers they want to enter
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("How many numbers do you want to enter?:" );
        Integer response = scanner.nextInt();

        // 2) Let them enter that many numbers
        int x = 0;
        while (x < response){
            System.out.println(" Enter a number ");
            numbers.add(scanner.nextInt());
            x++;

        }

        // 3) Print them out in reverse
        for(int i = numbers.size() - 1; i >= 0; i--){
            System.out.println(numbers.get(i));
        }
    }

    public static void reverseArray() {
        int[] array = {12, 320, 231, 214, 12312, 41024, 124, 12, 4123, 123, 1234, 634, 85, 685, 87};
        // 1) Reverse the above array above without creating a new array, then print it out
        int placeholder = 0;
        int n = array.length;

          //this is my original solution that I refactored below
//        if(n % 2 == 0){
//            for(int i = 1; i < n / 2 + 1; i++){
//                if(i == n / 2 ){
//                    placeholder = array[i - 1];
//                    array[i - 1] = array[n - i];
//                    array[n - i] = placeholder;
//                    i += 2;
//                }
//                else{
//                    placeholder = array[i - 1];
//                    array[i - 1] = array[n - i];
//                    array[n - i] = placeholder;
//                }
//            }
//        }
//        else {
//            for(int i = 1; i < (n / 2) + 1; i++){
//                placeholder = array[i - 1];
//                array[i - 1] = array[n - i];
//                array[n - i] = placeholder;
//            }
//
//        }

        for(int i = 1; i < n / 2 + 1; i++){

            placeholder = array[i - 1];
            array[i - 1] = array[n - i];
            array[n - i] = placeholder;

            //Below is added so that for even numbered arrays, the middle 2 numbers will not be swapped
            if((n % 2 == 0) && (i == n / 2)){
                i += 2;
            }

        }

        for(int x = 0; x < n; x++ ){
            System.out.println(array[x]);
        }
    }

    public static void isGeneticSequence() {
        // 1) Ask the user for a string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any line of text that you wish: ");
        String response = scanner.next();
        // 2) If the string contains only the characters 'G', 'A', 'T', or 'C' (case-sensitive) print true
        int i = 0;
        while(i < response.length()){
           //if(response.charAt(i) isin ('G', 'A', 'T', 'C')){
        //}

        // 3) Otherwise, print false
        }
    }

    public static void inputAndSearch() {
        // 1) Ask the user to input 10 words
        ArrayList<String> words = new ArrayList<String>();
        Scanner scanner =   new Scanner(System.in);

        for (int i = 1; i <= 2; i++){
            System.out.println("Please enter a word: ");
            words.add(scanner.next());
        }

        // 2) Then ask the user to input a search word
        String searchAgain = "yes";

        while(searchAgain.equals("yes")){
            Boolean isThere = false;
            System.out.println("Please enter a search word");
            String searchWord = scanner.next();
        // 3) If the word exists in the first 10 words, print true, otherwise print false

            int x = 0;
            while((x < words.size()) && (isThere == false)){
                if(words.get(x).equals(searchWord)){
                   isThere = true;
                   x = words.size();
                }
                else{
                    x += 1;
                }

            }
            System.out.println("The word " + searchWord + " is in the list? " + isThere);
        // 4) Return to step 2
            System.out.println("Would you like to search for another word(yes/no)? ");
            searchAgain = scanner.next().trim();
        }
    }

    public static void calculator() {
        // Below is a very simple calculator
        // 1) Modify it to support both addition, subtraction and multiplication operations
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an mathematical statement in the format x + y. Use +, -, *(for multiply): ");
            Integer leftOperand = scanner.nextInt();
            String operator = scanner.next(); // The "+" sign, just ignore this
            Integer rightOperand = scanner.nextInt();
            if(operator.equals("+")){
                System.out.println("Resulting value is: " + (leftOperand.intValue() + rightOperand.intValue()));
            }
            else if(operator.equals("-")){
                System.out.println("Resulting value is: " + (leftOperand.intValue() - rightOperand.intValue()));

            }
            else if(operator.equals("*")){
                System.out.println("Resulting value is: " + (leftOperand.intValue() * rightOperand.intValue()));
            }
        }
    }
}
