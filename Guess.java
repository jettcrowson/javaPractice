import java.util.Random;
import java.util.Scanner;

class Guess {

    public static void main(String[] args){

        System.out.println("I'm thinking of a number...");
        System.out.println("Can you guess what it is?");

        int number = generate();
        int guesses = 7;

        for (int i = 0; i < guesses; i++){

            System.out.println("Guess number " + (i + 1));
            
            int userGuess = guess();

            if (userGuess == number){

                System.out.println("Good job! You guessed correctly!");

                break;
            
            } else {

                System.out.println("");

                if (userGuess > number){

                    System.out.println("Your last guess was too high.");

                } else {

                    System.out.println("Your last guess was too low.");

                }

            }

        }
        
        System.out.println("The number I was thinking of was " + number);

    }

    public static int generate(){

        Random r = new Random();
        
        return r.nextInt(1000) + 1;

    }

    public static int guess(){
        
        System.out.println("Guess a number: ");

        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();
        
        return userGuess;

    }

}