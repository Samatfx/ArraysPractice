public class averageCounter {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50, 60};

        int sum = 0;


        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
            sum += num;
        }

        double average = (double) sum / numbers.length;

        // 9. Count how many values are strictly greater than the average
        int aboveAverageCount = 0;
        for (int num : numbers) {
            if (num > average) {
                aboveAverageCount++;
            }
        }


        System.out.println("\nAverage: " + average);
        System.out.println("Numbers above average: " + aboveAverageCount);
    }
}
