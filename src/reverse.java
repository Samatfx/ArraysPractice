public class reverse {
    public static void main(String[] args){
        int[] numbers = {3, 8, 12, 5, 9, 2, 7};

        System.out.print("Original: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }


        System.out.print("\nReversed: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
