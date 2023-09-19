public class ArrayChallenge {
    public static void main(String[] args){
/*create an array of integers */
        int[] numbers = {10,20,30,40,50};
        /*
        Step 2 : calculate the sum of all elements in the array

        */
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        /*
         * Calculate the average of all elements in the array
         * 
         */
        double average = (double)sum / numbers.length;

        /*
         * Find the largest number in the array
         * 
         */
        int largest = numbers[0];
        for(int number: numbers){
            if(number > largest){
                largest = number;
            }
        }
                // Print the results
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
                System.out.println("Largest Number: " + largest);

    }

    
}
