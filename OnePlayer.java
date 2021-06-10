public class OnePlayer extends Game
{
  //inst variables
  private int difficulty;
  private int score;
  private String compName;

  //constructors
  public OnePlayer(String rules, String phrase, int lives, int difficulty, int score, String compName)
  {
    super(rules, phrase, lives);

    difficulty = this.difficulty;
    score = this.score;
    compName = this.compName;
  }

  public OnePlayer(String rules, String phrase, int lives, int difficulty, String compName)//noncompetitive (no score)
  {
    super(rules, phrase, lives);

    difficulty = this.difficulty;
    compName = this.compName;
  }


  //getters
  public String getRules()
  {
    return super.getRules();//overide
  }
  public String getPhrase()
  {
    return super.getPhrase();//overide
  }
  public int getLives()
  {
    return super.getLives();//overide
  }
  public int getDifficulty()
  {
    return difficulty;
  }
  public int getScore()
  {
    return score;
  }
  public String getCompName()
  {
    return compName;
  }
  
  //setters
  public void setRules (String rules)
  {
    super.setRules(rules);
  }
  public void setPhrase (String phrase)
  {
    super.setPhrase(phrase);
  }
  public void setScore (int score)
  {
    score = this.score;
  }
  public void setLives (int lives)
  {
    super.setLives(lives);
  }
  public void setDifficulty (int difficulty)
  {
    difficulty = this.difficulty;
  }
  public void setCompName(String compName)
  {
    compName = this.compName;
  }

  //toString
  public String toString()
  {
    String out = "";

    return out;
  }
}//end class