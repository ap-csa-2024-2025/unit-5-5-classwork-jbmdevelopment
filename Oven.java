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
    public String updateStatus() {
        return "fix this later";
        //return "New oven with a maximum temperature of " + maxTemp + " 
        //and a starting temperature of " + currentTemp + " degrees.";

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

    }
    public String toString() {
        String formatted = "";
        return formatted;
    }
} 
