import java.util.Date;

import com.teamtreehouse.Treet;


public class Example{

  public static void main(String[] args) {
    Treet treet = new Treet(
      "apichampion",
      "ben is one of the best",
            new Date(1511814180)
      );
    System.out.printf("This is a new Treet: %s %n", treet);
  }
}
