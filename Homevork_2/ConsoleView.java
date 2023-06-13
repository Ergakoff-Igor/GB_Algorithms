import java.util.Scanner;

public class ConsoleView implements Viev {

    Scanner in;

    // Метод вызова сканнера
    public ConsoleView() {
        in = new Scanner(System.in, "ibm866");
    }

    // Метод ввода размера массива
    public int getSize() {
        System.out.printf("Введите размер массива: ");
        return in.nextInt();
    }

    // Метод ввода максимальной границы значений
    public int getMax() {
        System.out.printf("Введите максимальное возможное значение массива: ");
        return in.nextInt();
    }

}
