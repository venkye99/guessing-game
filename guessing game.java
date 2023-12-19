import java.util.Random;
import java.util.Scanner;

public class UniqueNumberGame {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in); 
    Random random = new Random();

    System.out.println("Welcome to the Mystery Number Challenge!"); 
    
    int score = 0;

    boolean playAgain = true;

    while (playAgain) {

      int mysteryNumber = random.nextInt(100) + 1;
  
      int tries = 0;

      int maxTries = 5;

      System.out.println("I have chosen a number between 1 and 100. Can you unravel it?");

      while (tries < maxTries) {

        System.out.print("Enter your estimate: ");
        
        int guess = scanner.nextInt();

        scanner.nextLine(); 
      
        tries++;

        if (guess == mysteryNumber) {
          System.out.println("Bingo! You guessed the number " + mysteryNumber + " in " + tries + " tries.");
          score++;
          break;

        } else if (guess < mysteryNumber) {
          System.out.println("Too low...try going higher!");
        
        } else {
          System.out.println("Too much...try going lower!");
        }

      }

      if (tries >= maxTries) {
        System.out.println("Game over! The number was " + mysteryNumber);
      }

      System.out.print("Wanna try again (yes/no)? ");
      String playAgainInput = scanner.nextLine();

      playAgain = playAgainInput.equalsIgnoreCase("yes") || playAgainInput.equalsIgnoreCase("yeah");

    }

    System.out.println("Thanks for playing! Your score is " + score);  
    scanner.close();

  }

}
