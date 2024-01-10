package derick.fiatEx;

public class bubbleSorting {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        int [] numbers = new int[10000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }

        bubbleSorting(numbers);

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    public static void bubbleSorting(int [] numbers){

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                if (numbers[j] > numbers[i]){
                    int pivo = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = pivo;
                }
            }
        }

    }
}
