package Group9;

import Interop.Utils.Utils;

public class PiMath {

    public static double getDistanceBetweenAngles(double from, double to)
    {
        return Utils.mod(to - from + java.lang.Math.PI, Utils.TAU) - java.lang.Math.PI;
    }

    public static double clamp(double value, double lower, double upper)
    {
        return Math.max(lower, Math.min(upper, value));
    }

}
