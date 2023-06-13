public class PrintArray {
    // Метод для вывода на экран массива размера 
    // n - размер массива
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
