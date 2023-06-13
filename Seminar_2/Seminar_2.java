/**
 * Seminar_2
 */
public class Seminar_2 {

    public static void main(String[] args) {

    }

    // Сортировка пузырьком:
    public static void boobleSort(int[] array) {
        int count = 0;

        int length = array.length - 1;

        boolean notSorted = true;
        for (int l = 0; l < array.length - 1 && notSorted; l++) {
            notSorted = false;
            for (int i = 0; i < length; i++) {
                count++;
                if (array[i] > array[i + 1]) {
                    notSorted = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            length--;
        }
    }

    // Быстрая сортировка с лекции:
    public static void quickSortLecture(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }

        } while (leftPosition <= rightPosition);

        if (leftPosition < endPosition) {
            quickSortLecture(array, leftPosition, endPosition);
        }

        if (startPosition < rightPosition) {
            quickSortLecture(array, startPosition, rightPosition);
        }
    }

    // Быстрая сортировка с семинара:
    public static void quickSortSeminar(int[] array, int leftBorder, int rightBorder) {
        int pivot = array[(leftBorder + rightBorder) / 2];
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        do {
            while (array[leftMarker] < pivot)
                leftMarker++;
            while (array[rightMarker] > pivot)
                rightMarker--;
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int temp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = temp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder)
            quickSortSeminar(array, leftMarker, rightBorder);
        if (leftBorder < rightMarker)
            quickSortSeminar(array, leftBorder, rightMarker);
    }

    // Бинарный поиск
    public static int binarySearch(int key, int[] array, int left, int right) {
        if (left > right)
            return -1;
        int mid = (left + right) / 2;
        if (array[mid] < key)
            return binarySearch(key, array, mid + 1, right);
        if (array[mid] > key)
            return binarySearch(key, array, left, mid - 1);
        return mid;
    }

    
}
