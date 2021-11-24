import java.util.Random;

public class Rand 
	{
		
    int randomNumbers[] = new int[10];

    int[] initialized(){
        Random random = new Random();
        System.out.print("Random Numbers in Array : { ");
        for (int i = 0; i < 10; i++){
            randomNumbers[i] = random.nextInt(100);
            System.out.print(randomNumbers[i]+ ",");
        }
        System.out.println("\b}");
        return randomNumbers;
    }
    public static int findMax(int randomNumbers[]){
        int max = 0;

        for (int i = 0; i < randomNumbers.length; i++){
            if (max < randomNumbers[i]){
               max = randomNumbers[i];
           }
        }
        return max;
    }
    public int findMin(int randomNumbers[]){
        int min = randomNumbers[0];

        for (int i = 0; i < randomNumbers.length; i++){
            if (min > randomNumbers[i]){
                min = randomNumbers[i];
            }
        }
        return min;
    }

}
