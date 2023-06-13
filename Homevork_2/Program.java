/**
 * Program
 */
public class Program {

   // Управляющая программа
    public static void main(String args[])
    {
        HeapSort hs = new HeapSort();
        ConsoleView cv = new ConsoleView();
        System.out.print("\033[H\033[J"); // Очистка консоли

        // Заполнение массива рандомными значениями
        // размер массива и максимальную границу возможных значений вводит пользователь
        int arr[] = RandomArray.randomFill(cv.getSize(), cv.getMax()); 

        System.out.println("\nИсходный массив");
        PrintArray.printArray(arr);

        hs.sort(arr);

        System.out.println("\nОтсортированный массив");
        PrintArray.printArray(arr);
    }
}