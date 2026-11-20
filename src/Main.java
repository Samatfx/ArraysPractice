public class Main{
    public static void main(String[] args){

        int[] counter = {1, 0, -4, 4, 5, 0, 7, -8, 9, 10};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.print("Array: ");
        for(int num : counter){
            System.out.print(num + " ");

        if(num > 0){
            positive++;
        }
        else if(num < 0){
            negative--;
        }
        else{
            zero++;
        }
        }
        System.out.println("\nPositive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);

    }
}