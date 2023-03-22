import java.util.Scanner;

public class converter {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the amount of Seconds: ");
        int secondsTotal=scanner.nextInt();

        int hours = secondsTotal % 60;
        int minuteTotal = secondsTotal / 60;
        int seconds = minuteTotal % 60;
        minuteTotal = minuteTotal / 60;
        System.out.print( minuteTotal + ":" + seconds + ":" + hours);
        System.out.print("\n");
    }
}