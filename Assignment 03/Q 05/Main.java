public class Main {
    public static void main(String[] args){
        Rand rand = new Rand();
        int randomNumbers[] = rand.initialized();
        int max = rand.findMax(randomNumbers);
        int min = rand.findMin(randomNumbers);
        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);
    }
}
