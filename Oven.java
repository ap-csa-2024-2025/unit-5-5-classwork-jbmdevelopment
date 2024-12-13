public class Oven
{

    private int maxTemp = 450; // max
    private int currentTemp = 70; // starting
    static boolean ON = false; 
    public int getMaxTemp() {
        return maxTemp;
    }
    public int getCurrentTemp() {
        return currentTemp;
    }
    public void reset() {
        maxTemp = 450;
        currentTemp = 70;
    }
    public String toString() {
       return "New oven with a maximum temperature of " + maxTemp + " and a starting temperature of " + currentTemp + " degrees.";

    }
    public void quit() {
        System.out.println("Thanks for playing this game!");
    }
    public void turnOff() {
        ON = false;
        currentTemp = 0;
    }
    public boolean isOn() {
        if(currentTemp > 0) {
            return true;
        }
        return false;
    }
    public void preheat(int temp) {
        currentTemp = temp;
        if(temp > maxTemp) {
            currentTemp = maxTemp;
        }
    }
} 
