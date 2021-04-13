import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("Jin De Guzman");
    /*
    This program will run flowa Plowa before I make it in full
    */

    Scanner kb = new Scanner(System.in);
    String answer;
    int tries = 5;
    String guess;
    boolean checkGuess = false;

    System.out.println("This is two player mode make a word to" +
                        " compare:");
    answer = kb.next();
    
    while(tries != 0)
    {
      System.out.println("Chose a letter:");
      guess = kb.next();
      for(int i = 0; i < answer.length()-1; i++)
      {
        if(answer.substring(i,i+1).equalsIgnoreCase(guess))
        {
          checkGuess = true;
          //answer = answer.substring(i-1);//string to take out guesse letter and also possible boolean to fix without break
          
        }
      }
      if(checkGuess == true)
      System.out.println("Guess is right");
      else
      {
        tries--;
        System.out.println("Incorrect you have " + tries + " tries");
      }
      checkGuess = false;
    }//end while game
    
    System.out.println("Thanks for playin'");

  }
}