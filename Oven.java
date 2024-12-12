public class Oven
{
    private int maxTemp;
    private int currentTemp;
    static boolean isOn = false; 
    public int getMaxTemp() {
        return maxTemp;
    }
    public int getCurrentTemp() {
        return currentTemp;
    }
    public void turnOff() {
        isOn = !isOn;
    }
    public boolean isOn() {
        return isOn;
    }
    public void preheat(int temp) {

    }
    public String toString() {
        String formatted = "";
        return formatted;
    }
} 
