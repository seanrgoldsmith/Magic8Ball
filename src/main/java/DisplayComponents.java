import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DisplayComponents {

    public static Scanner userInput = new Scanner(System.in);

    public static void homeScreen() throws InterruptedException {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                      8888888888888888");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                   8888888888888888888888");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                8888888888888888888888888888");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~              888888888888aaaaaaaaa88888888888");
        System.out.println("                                                            8888888888888a ____  a8888888888888");
        System.out.println("Magic Eight Ball: Pop Culture Reference Edition             888888888888  /    \\  8888888888888");
        System.out.println("                                                            888888888888  \\____/  8888888888888");
        System.out.println("                    Product of the Zoltar Co.**             888888888888  /    \\  8888888888888");
        System.out.println("                                                            888888888888a \\____/ a8888888888888");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~              888888888888aaaaaaaaa888888888888");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                88888888888888888888888888888");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                   888888888888888888888888");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                      888888888888888888");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("*Due to an unforseen event in the late 80's Zoltar Products no longer grants wishes only suggestions");
        theGame();
    }

    public static void intro() throws InterruptedException {
        System.out.println();
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("Squeak...  ");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println();
        TimeUnit.SECONDS.sleep(2);
        System.out.println();
        System.out.println("I want to play a game...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println();
        doYouWantToPlay();
    }

    public static void doYouWantToPlay() throws InterruptedException {
        System.out.println("Would you like to play a game? (y/n)");
        System.out.println();
        String userChoice = userInput.nextLine();
        if (userChoice.toLowerCase().equalsIgnoreCase("y")) {
            homeScreen();

        } if (userChoice.toLowerCase().equalsIgnoreCase("n")) {
                noGameOption();
        } else {
            System.out.println("Do you understand the words that are coming out of my mouth?! (y)es... or (n)o...");
            doYouWantToPlay();
        }
    }


    public static void theGame() throws InterruptedException {
        System.out.println();
        System.out.println();
        System.out.println("Zoltar Says, \"Make Your Wish\": ");
        String userWish = userInput.nextLine();
        Random random = new Random();
        int randResponse = random.nextInt(12);

        String[] responses = {"As you wish", "INCONCEIVABLE!", "The Dude abides", "Good news everyone!", "Bye Felicia",
                "That's what she said!", "Holy Schnikes!", "There is literally nothing in this world that you cannot do.", "You'll shoot your eye out, kid!",
                "So, I'm telling you there's a chance...", "May the Force be with you!", "Mama says, 'Stupid is as stupid does.'"};
        System.out.println();
        System.out.println();
        System.out.println("Your Wish: " + userWish);
        System.out.println();
        System.out.println("Your suggestion: " + responses[randResponse]);
        System.out.println();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Would you like to play again? (y/n)");
        String userDecision = userInput.nextLine();
        if (userDecision.toLowerCase().equalsIgnoreCase("n")) {
            noGameOption();
        } if (userDecision.toLowerCase().equalsIgnoreCase("y")) {
            theGame();
        } else {
            System.out.println();
            System.out.println("Do you understand the words that are coming out of my mouth?! (y)es... or (n)o...");
            doYouWantToPlay();
        }
    }


    public static void noGameOption() {
        System.out.println();
        System.out.println("Have fun storming the castle!");
        System.exit(1);
    }

}



