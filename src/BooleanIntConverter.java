public class BooleanIntConverter {
    public static int booleanToInt(boolean b) {
        return b ? 1 : 0;
    }

    public static boolean intToBoolean(int i) {
        return i != 0;
    }
}
