import java.text.Normalizer;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScisors {
    public static void main(String[] args) {



    while (true) {

           Scanner scan = new Scanner(System.in);
            System.out.println("Akmens, Skeres vai Papirs!");
            String user = scan.next();

           String[] elements = {"akmens", "skeres", "papirs"};
           String computer = elements[new Random().nextInt(elements.length)];
           System.out.println("Pretinieks: " + computer);

           if (user.equals(computer)) {
                System.out.println("Neizskirts");
            } else if (user.equals("akmens") && computer.equals("skeres")) {
               System.out.println("Tu uzvareji");
            } else if (user.equals("akmens") && computer.equals("papirs")) {
                System.out.println("Tu zaudeji");
                break;
          } else if (user.equals("papirs") && computer.equals("akmens")) {
               System.out.println("Tu uzvareji");
            } else if (user.equals("papirs") && computer.equals("skeres")) {
               System.out.println("Tu zaudeji");
               break;
           } else if (user.equals("skeres") && computer.equals("papirs")) {
               System.out.println("Tu uzvareji");
            } else {
                System.out.println("Tu zaudeji");
               break;
            }
    }
    }
}
        
