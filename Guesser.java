public class Guesser extends TwoPlayer
{
  //inst vars
  private String guess;

  //constructors
  public Guesser(String rules, String phrase, int lives, String name, int competitiveness, boolean isNamer, String guess)
  {
    super(rules, phrase, lives, name, competitiveness, isNamer);
    this.guess = guess;
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
  public String getName()
  {
    return super.getName();
  }
  public int getCompetitiveness()
  {
    return super.getCompetitiveness();
  }
  public boolean getIsNamer()
  {
    return super.getIsNamer();
  }
  public String getGuess()
  {
    return guess;
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
  public void setLives (int lives)
  {
    super.setLives(lives);
  }
  public void setName(String name)
  {
    super.setName(name);
  }
  public void setCompetitiveness(int competitiveness)
  {
    super.setCompetitiveness(competitiveness);
  }
  public void setIsNamer(boolean isNamer)
  {
    isNamer = this.isNamer;
  }
  public void setGuess(String guess)
  {
    guess = this.guess;
  }
}