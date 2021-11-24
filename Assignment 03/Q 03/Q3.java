import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year :");
        int year = input.nextInt();
        if(checkYear(year)){
            System.out.println(year+" is a leap year");
        }else {
            System.out.println(year+" not a leap year");
        }
    }
    static boolean checkYear(int year) {
        if (year % 400 == 0){
            return true;
        }else if(year % 100 == 0){
            return false;
        }else if (year % 4 == 0) {
            return true;
        }else {
            return false;
        }
    }
}
