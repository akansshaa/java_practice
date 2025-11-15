import java.util.Scanner;

public class GuessingGame {
    int random;
    GuessingGame(){
        random = (int)Math.ceil(Math.random());
    }
    /***
     * 
     * @param guessedNum number guessed by the user 
     * @return 
     * - negative if guessed number is smaller
     * - 0 if guessed number is corred
     * - positive if guessed number is larger
     */
    int guess(int guessedNum){
        return guessedNum - random;
    }
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        Scanner sc = new Scanner(System.in);
        int guess,result;
        System.out.println("Guess a number!");
        do{
            System.out.print("enter a number : ");
            guess = sc.nextInt();
            result = game.guess(guess);
            if(result == 0){
                System.out.println("woohoo! You've got it right.");
            }else if(result<0){
                System.out.println("ahuh! guess a bigger number.");
            }else{
                System.out.println("ahah!almost correct ,guess a number smaller.");
            }
        }while(result!=0);
        sc.close();
        }
}
