package Ex0;
import Ex0.Robot;
public class Run {
    public static void main(String[] args) {
        Robot myRobot = new Robot("Bob", "", "Well, I'm not crashing so often...");
        myRobot.favouriteFood = "banana"; // Trevor put this line
        System.out.println(myRobot.howDoesItGo);
    }
}
