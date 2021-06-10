public abstract class Game
{
  //instance variables
  private String rules;
  private String phrase;
  private int lives;
  
  //constructors
  public Game(String rules, String phrase, int lives)
  {
    this.rules = rules;
    this.phrase = phrase;
    this.lives = lives;
  }

  //getters
  public String getRules()
  {
    return rules;
  }
  public String getPhrase()
  {
    return phrase;
  }
  public int getLives()
  {
    return lives;
  }

  //setters
  public void setRules (String rules)
  {
    this.rules = rules;
  }
  public void setPhrase (String phrase)
  {
    this.phrase = phrase;
  }
  public void setLives (int lives)
  {
    this.lives = lives;
  }

  //toString
  public String toString()
  {
    String ret;
    ret = "This is your word " + phrase;
    return ret;
  }
}
/*
https://stackoverflow.com/questions/25109138/setter-getter-method-inheritance

https://www.javatpoint.com/java-string-replaceall
*/