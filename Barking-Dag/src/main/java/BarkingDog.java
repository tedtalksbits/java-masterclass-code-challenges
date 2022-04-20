public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int timeOfDay){
        if (timeOfDay < 0 || timeOfDay > 23){
            return false;
        }
        else return ( isBarking && (timeOfDay < 8 || timeOfDay == 23));

    }
}
