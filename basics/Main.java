import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        int number=0;
        System.out.println("I own " + number + " " + pluralize("cat", number) + ".");
        flip(3);
        flip(7);
        flip(5);

        clock();
    }

    public static String pluralize(String string, int number){

        if(number <= 0){
            return string+"s";
        }
        if(number == 1){
            return  string;
        }
        if(number > 1){
            return  string+"s";
        }
        return "I own no animals";

    }

    public static void flip(int n) {

        int numberToFlip = 0;
        int flips = 0;
        int headsCounter = 0;

        while(numberToFlip <=n) {

            double random = Math.random();

            if (random < .5) {
                System.out.println("TAILS");
                flips++;
                headsCounter=0;
            }
            if (random >.5) {
                System.out.println("HEADS");
                headsCounter++;
                numberToFlip++;
                flips++;
            };
        }
        System.out.println("It took " + flips + " flips to flip " + headsCounter + " heads in a row.");
    }

    public static void clock() {
        int initial = 0;
        int interval = 1000;
        Timer timer = new Timer();
        String timeDate = "HH:mm:ss";

        TimerTask timertask = new TimerTask() {
            public void run() {
                System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern(timeDate)));
            }
        };
        timer.scheduleAtFixedRate(timertask, initial, interval);
    }
}