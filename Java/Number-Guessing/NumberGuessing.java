import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int count = 0;
        int sysNum = random.nextInt(1000)+1;

        System.out.println("Try to guess the NUMBER!");
        System.out.println("System has selected a number between 1 and 1000.");

        int userNum = -1;
        while(sysNum != userNum){
            System.out.print("Guess the number: ");
            userNum = sc.nextInt();

            if(userNum > sysNum){
                System.out.println("Your guess is HIGH");
            }else{
                System.out.println("Your guess is LOW");
            }

            count++;
        }

        System.out.println("Correct! \uD83C\uDF89");
        System.out.println("You guessed the number in " + (count+1) + " attempts.");

        sc.close();
    }
}
