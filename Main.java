import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("Jin De Guzman");
    /*
    This program will run my game
    */
    Scanner kb = new Scanner(System.in);

    //set up game
    List<String> words = new ArrayList<>();
    int players;
    String commenName;
    String onePlayerRules = "";
    String twoPlayerRules = "";
    System.out.print("One or Two Players: ");
    players = kb.nextInt();
    System.out.print("Who do you want to commentate your game (enter a name): ");
    commenName = kb.next();
    Commentary commentator = new Commentary(commenName, null, players);

    if(players > 2)
    {
      //set up game cont
      System.out.println("Who is your rival? ");
      String computer = kb.next();
      System.out.println("How difficult do you want it? -scale 1-3 1 being hardest- ");
      int difficulty = kb.nextInt();
      if(difficulty == 1)
      {
        System.out.print(commentator.getName() + ": You suck chose a harder mode next time!");
      }
      System.out.println("Are you competitve?  Do you want to be scored (true or false)");
      boolean wantScore = kb.nextBoolean();
      if(!wantScore)
      {
        System.out.print(commentator.getName() + ": Your lame!");
      }

      if(difficulty == 1)//hard
      {
        words.add("pseudopseudohypoparathyroidism");
        words.add("apeuro");
      }
      else if(difficulty == 2)//medium
      {
        words.add("supremacy");
        words.add("hydrochloric");
      }
      else//easy
      {
        words.add("Apple");
        words.add("Oxymoron");
      }

      System.out.println("Chose a random num 0 or 1");
      words.remove(kb.nextInt());

      if(wantScore)
      {
        OnePlayer game = new OnePlayer(onePlayerRules, words.get(0), difficulty, difficulty, 100, computer);
        String answer = game.getPhrase();
        String emptyAnswer = "";
        for(int i = 0; i <  answer.length(); i++)
        {
          emptyAnswer += ".";
        }
        String guess;
        boolean checkGuess = false;
        boolean didWin = false;
        

        //run game
        while(game.getLives() != 0)//add winning end
        {
          System.out.println(emptyAnswer);
          System.out.println(computer + ":choose a letter scrub!");
          guess = kb.next();
          for(int i = 0; i < answer.length(); i++)
          {
            if(answer.substring(i,i+1).equals(guess))
            {
              checkGuess = true;
            }
          }
          if(checkGuess == true)
          {
            //replace method for empty
            emptyAnswer = replaceEmpty(emptyAnswer, answer, guess);
            System.out.println("Guess is right");
            game.setPhrase(game.getPhrase().replaceAll(guess,""));
            if(game.getPhrase().equals(""))
            {
              didWin = true;
              game.setLives(0);
              System.out.println(game.getPhrase());
            }
          }//end if guess was true
          else
          {
            game.setLives(game.getLives()-1);
            System.out.println("Incorrect you have " + game.getLives() + " lives");
            commentator.setMessage("Do better!");
            commentator.toString();
            game.setScore(game.getScore()-5);
          }//end if guess was false
          checkGuess = false;
        }//end while game
        if(didWin)
        {
        System.out.println(emptyAnswer);
        System.out.println(computer + ":Darn i'll get you next time!");
        }
        else
        {
          System.out.println(computer + ":Wow you suck I win haha");
        }
        commentator.setMessage("Thanks for playing the game although you suck");
        commentator.toString();
        if(game.getCompName().equals("Jin"))
        game.setScore(99999);
        System.out.println("Your score was " + game.getScore() + " It's okay I Jin De Guzman have gotten better though" );
      }//end for game with score------------------------------------------------------------------------------------------------
      else
      {
        OnePlayer game = new OnePlayer(onePlayerRules, words.get(0), difficulty, difficulty, computer);
        String answer = game.getPhrase();
        String emptyAnswer = "";
        for(int i = 0; i <  answer.length(); i++)
        {
          emptyAnswer += ".";
        }
        String guess;
        boolean checkGuess = false;
        boolean didWin = false;
        

        //run game
        while(game.getLives() != 0)//add winning end
        {
          System.out.println(emptyAnswer);
          System.out.println(computer + ":choose a letter scrub!");
          guess = kb.next();
          for(int i = 0; i < answer.length(); i++)
          {
            if(answer.substring(i,i+1).equals(guess))
            {
              checkGuess = true;
            }
          }
          if(checkGuess == true)
          {
            //replace method for empty
            emptyAnswer = replaceEmpty(emptyAnswer, answer, guess);
            System.out.println("Guess is right");
            game.setPhrase(game.getPhrase().replaceAll(guess,""));
            if(game.getPhrase().equals(""))
            {
              didWin = true;
              game.setLives(0);
              System.out.println(game.getPhrase());
            }
          }
          else
          {
            game.setLives(game.getLives()-1);
            System.out.println("Incorrect you have " + game.getLives() + " lives");//end if you suck at game and lost
            commentator.setMessage("Do better!");
            commentator.toString();
          }
          checkGuess = false;
        }//end while game
        if(didWin)
        {
        System.out.println(emptyAnswer);
        System.out.println(computer + ":Darn i'll get you next time!");
        }
        else
        {
          System.out.println(computer + ":Wow you suck I win haha");
        }
        commentator.setMessage("Thanks for playing the game although you suck");
        commentator.toString();
      }//end one player with no wanting score--------------------------------------------------------------------------
    }//end for one player
    else
    {
      //set up
      System.out.print("Namer: My name is: ");
      String namerName = kb.next();
      System.out.print(namerName + ": on a scale of 1-10 10 being most compeitive im taking this game a ");
      int namerCompetitiveness = kb.nextInt();

      System.out.print("Guesser: My name is: ");
      String guesserName = kb.next();
      System.out.print(guesserName + ": on a scale of 1-10 10 being most compeitive im taking this game a ");
      int guesserCompetitiveness = kb.nextInt();

      System.out.print("As the namer I think the word should be... (guesser look away) ");
      String word = kb.next();
      System.out.print(" and the guesser should have this many tries: ");
      int tries = kb.nextInt();

      Guesser guesser = new Guesser(twoPlayerRules, word, tries, guesserName, guesserCompetitiveness, false, null);
      TwoPlayer namer = new TwoPlayer(twoPlayerRules, word, tries, namerName, namerCompetitiveness, true);

        String answer = namer.getPhrase();
        String emptyAnswer = "";
        for(int i = 0; i <  answer.length(); i++)
        {
          emptyAnswer += ".";
        }
        String guess;
        boolean checkGuess = false;
        boolean didWin = false;

      //Make a space
      for(int i = 0; i < 50; i++)
      {
        System.out.println();
      }
      System.out.print("Welcome to the game " + guesserName + " is taking the game as " + guesserCompetitiveness + " while "
                      + namerName + " is taking this as a " + namerCompetitiveness);
      
      //start game
      while(guesser.getLives() != 0)//add winning end
        {
          System.out.println(emptyAnswer);
          System.out.println(namer.getName() + ":choose a letter scrub!");
          guess = kb.next();
          for(int i = 0; i < answer.length(); i++)
          {
            if(answer.substring(i,i+1).equals(guess))
            {
              checkGuess = true;
            }
          }
          if(checkGuess == true)
          {
            //replace method for empty
            emptyAnswer = replaceEmpty(emptyAnswer, answer, guess);
            System.out.println("Guess is right");
            namer.setPhrase(namer.getPhrase().replaceAll(guess,""));
            if(namer.getPhrase().equals(""))
            {
              didWin = true;
              guesser.setLives(0);
              System.out.println(namer.getPhrase());
            }
          }
          else
          {
            guesser.setLives(guesser.getLives()-1);
            System.out.println("Incorrect you have " + guesser.getLives() + " lives");//end if you suck at game and lost
            commentator.setMessage("Do better!");
            commentator.toString();
          }
          checkGuess = false;
        }//end while game
        if(didWin)
        {
        System.out.println(emptyAnswer);
        System.out.println(namer.getName() + ":Darn i'll get you next time!");
        }
        else
        {
          System.out.println(namer.getName() + ":Wow you suck I win haha");
        }
        commentator.setMessage("Thanks for playing the game although you suck");
        commentator.toString();

        System.out.print("Have the guesser enter a new word: ");
        String newWord = kb.next();
        System.out.print("Feedback says "  + feedback(emptyAnswer, newWord));
    }//end for 2 player-----------------------------------------------------------------------------------------------
      

  }//end main method

  public static String replaceEmpty(String emp, String ans, String gues)
  {
    for(int i = 0; i < ans.length(); i++)
    {
      if(ans.substring(i,i+1).equals(gues))
      {
        emp = emp.substring(0,i) + gues + emp.substring(i+1);
      }
    }
    return emp;
  }//end method

  public static String feedback(String word, String newWord)
  {
    boolean isNice = false;
    int isNiceCounter = 0;
    String out;
    for(int i = 0; i < 10; i++)
    {
      if(Math.random() < 0.5)
      {
        isNice = true;
      }
      isNiceCounter++;
    }
    if(word.length() + newWord.length() >= 20)
    {
      if(isNiceCounter > 5)
      {
        out = "YOu use long words good job beint tactical";
      }
      else
      {
        out = "Using long words, talk about cheap";
      }
    }
    else
    {
      if(isNiceCounter > 5)
      {
        out = "YOu use short words good job keeping it nice and sweet";
      }
      else
      {
        out = "Using short words, get a brain long words means more guesses";
      }
    }
    return out;
  }//end method
}//end class
/*
https://stackoverflow.com/questions/8878015/return-true-or-false-randomly*/
