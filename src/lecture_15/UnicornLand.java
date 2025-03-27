package lecture_15;

public class UnicornLand
{
  private String landName = "Unicorn Land";

  class Unicorn{
      String unicornName;

      public String getUnicornName() {
          return unicornName;
      }

      void printLandName(){
          System.out.println(landName);
      }
  }

  void showUnicornName(){
      //unicornName только через объект
      Unicorn unicorn =  new Unicorn();
      String unicornName = unicorn.unicornName;
      // getUnicornName() только через объект
      System.out.println(unicorn.getUnicornName());
  }




}
