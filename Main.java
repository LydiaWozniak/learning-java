
public class Main {

   int myFavouriteNumber;
   double someDecimal;
   boolean amIHungry;
   String aLotOfCharacters;
   char aSingleCharacter;

   public Main(int number, double decimal, boolean hungry, String word, char letter) {
      myFavouriteNumber = number;
      someDecimal = decimal;
      amIHungry = hungry;
      aLotOfCharacters = word;
      aSingleCharacter = letter;

   }

   public static void main(String[] args) {

      Main myself = new Main(4, 3.4, true, "Hello World!", 'A');

      System.out.println("Am I hungry " + myself.amIHungry);

   }
}