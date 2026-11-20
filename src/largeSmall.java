public class largeSmall {
    public static void main(String[] args){
        int[] largeSmall = {1, 0, -12, 5, 90, -56, 0, 12};

        int largest = largeSmall[0];
        int largestIndex = 0;

        int smallest = largeSmall[0];
        int smallestIndex = 0;

        System.out.println("Array: ");
        for(int i = 0; i < largeSmall.length; i++){
            System.out.println(largeSmall[i] + " ");

            if(largeSmall[i] > largest){
                largest = largeSmall[i];
                largestIndex = i;
            }
            if(largeSmall[i] < smallest){
                smallest = largeSmall[i];
                smallestIndex = i;
            }
        }
        System.out.println("\nLargest: " + largest + " at index " + largestIndex);
        System.out.println("Smallest " + smallest + " at index " + smallestIndex);
    }
}
