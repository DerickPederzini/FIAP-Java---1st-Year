package derick.fiatEx;

public class QuickSorting {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        int [] numbers = new int[10000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }

        int end = numbers.length-1;

        quickSort(numbers, 0, end);

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    public static void quickSort(int [] numbers, int begin, int end){
        if (begin < end){
            int part = partition(numbers, begin, end);

            quickSort(numbers, begin, part-1);
            quickSort(numbers, part+1, end);
        }
    }

    private static int partition (int [] numbers, int begin, int end){

        int pivot = numbers[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (numbers[j] <= pivot){
                i++;

                int swap = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = swap;
            }
        }
        int swap = numbers[i+1];
        numbers[i+1] = numbers[end];
        numbers[end] = swap;
            
        return i+1;
    }
}
