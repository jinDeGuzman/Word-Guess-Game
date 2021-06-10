public class TwoPlayer extends Game
{
  //inst vars
  private int competitiveness;
  private String name;
  static boolean isNamer;

  //constructors
  public TwoPlayer(String rules, String phrase, int lives, String name, int competitiveness, boolean isNamer)
  {
    super(rules, phrase, lives);
    this.name = name;
    this.competitiveness = competitiveness;
    this.isNamer = isNamer;
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
    return name;
  }
  public int getCompetitiveness()
  {
    return competitiveness;
  }
  public boolean getIsNamer()
  {
    return isNamer;
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
    name = this.name;
  }
  public void setCompetitiveness(int competitiveness)
  {
    competitiveness = this.competitiveness;
  }
  public void setIsNamer(boolean isNamer)
  {
    isNamer = this.isNamer;
  }
}//end class