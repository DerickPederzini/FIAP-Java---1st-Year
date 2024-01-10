package havingFun;

public class quickSorting {
    public static void main(String[] args) {

        int [] numbers = new int[]{1,6,10,2,9,8,5,4};
        int end = numbers.length-1;

        quickSort(numbers, 0, end);

    }

    public static void quickSort(int [] numbers, int begin, int end){
    if (begin < end){
        int partitionIndex = partition(numbers, begin, end);

        quickSort(numbers, begin, partitionIndex-1);
        quickSort(numbers, partitionIndex+1, end);
        }
    }

    public static int partition(int [] numbers, int begin, int end){
        int pivot = numbers[end];
        int i = begin-1;

        for (int j = begin; j < end; j++) {
            if (pivot >= numbers[j]){
                i++;

                int swap = numbers[i];
                numbers[i] = numbers[j];
                numbers[j]= swap;
            }
        }

        int swap = numbers[i+1];
        numbers[i+1] = numbers[end];
        numbers[end] = swap;

        return i+1;
    }
}
