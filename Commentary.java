public class Commentary
{
  //variables
  String name;
  int players;
  String message;

  //consructors
  public Commentary(String name, String message, int players)
  {
    this.name = name;
    this.message = message;
    this.players = players;
  }

  //getters
  public String getName()
  {
    return name;
  }
  public String getMessage()
  {
    return message;
  }
  public int getPlayers()
  {
    return players;
  }
  
  //setters
  public void setName (String name)
  {
    this.name = name;
  }
  public void setMessage(String message)
  {
    this.message = message;
  }
  public void setPlayers(int players)
  {
    this.players = players;
  }
  
  //toString
  public String toString()
  {
    String out = "";

    out += name + ": " + message;

    return out;
  }
}//end commentary class