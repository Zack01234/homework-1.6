public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray();

        //Задание 1
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Задание 2
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей.");

        //Задание 3
        double averageSpending = (double) sum / array.length;
        String average = String.format("%.2f", averageSpending);
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        //Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
        }
        return arr;
    }
}
