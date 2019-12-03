import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        int[] numbers = new int[]{6, 4, 3, 2, 1, 7, 8, 9, 11, 15, 3432, 2412, 12, 11, 0, 5};
        System.out.println("Przed: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Po: " + Arrays.toString(numbers));
        Arrays.stream(numbers).forEach(n -> System.out.printf(n + ", "));
    }

    static void bubbleSort(int[] numbers) {
        boolean notChange = false;

        while (!notChange) {
            notChange = true;
            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    notChange = false;
                }
            }
        }

    }
}
