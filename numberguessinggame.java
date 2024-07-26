import java.util.Random;
import java.util.Scanner;
public class numberguessinggame{
    private static String playAgainInput;

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        boolean playAgain=true;
        System.out.println("Welcome to the Number Guessing Game!");
        while(playAgain){
            int number=random.nextInt(100)+1;
            int attempts=0;
            int maxattempts=10;
            int score=0;
            boolean hasguessedcorrectly=false;
            System.out.println("I have generated a random number between 1 and 100");
            System.out.println("you have "+maxattempts+"attempts to guess it");
            while (attempts<maxattempts){
                System.out.println("enter your guess:");
                    int guess=scanner.nextInt();
                    attempts++;
                    if (guess<number){
                        System.out.println("Too Low!");
                    }else if (guess>number){
                        System.out.println("Too High!");
                    }else{
                        System.out.println("correct! The numberwas"+number+".");
                        score+=(maxattempts-attempts)+1;
                        hasguessedcorrectly=true;
                        break;
                    }
                }
                if(!hasguessedcorrectly){
                    System.out.println("Sorry, you have usedall your attempts. The number was"+number+".");
                }
                System.out.println("Your score:"+score);
                System.out.println("Do you wantto play again?(yes/no):");
                scanner.nextLine();
                playAgainInput = scanner.nextLine().trim().toLowerCase();
                if (!playAgainInput.equals("yes")){
                    playAgain=false;
                }
            }
            System.out.println("Thanks for playing!Goodbye!");
            scanner.close();
        }
    }