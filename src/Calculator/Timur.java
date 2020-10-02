package Calculator;

public class Timur  implements Human{
    private String place = "";
    private int hours = 0;
    private int speed = 0;

    Timur(int hours, int speed, String place){
        this.hours = hours;
        this.speed = speed;
        this.place = place;
    }

    public String walk() {
        String walk = "I walk with " + this.speed + " speed. ";
        return walk;
    }
    public String sleep() {
        String sleep = "I sleep " + this.hours +" hours. ";
        return sleep;
    }
    public String place() {
         String place = "I am Timur from " + this.place + ". ";
        return place;
    }
}
