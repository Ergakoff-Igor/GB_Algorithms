import java.util.Random;

public class RandomArray {
    
    public static int[] randomFill(int size, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(max);
        }
        return array;
    }
}
