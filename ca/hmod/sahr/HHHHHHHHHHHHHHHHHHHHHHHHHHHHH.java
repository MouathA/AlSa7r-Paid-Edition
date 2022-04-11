//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import java.util.*;
import java.math.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    public static int getRandomInRange(final int n, final int n2) {
        return new Random().nextInt(n2 - n + 1) + n;
    }
    
    public static float getRandomInRange(final float n, final float n2) {
        return new Random().nextFloat() * (n2 - n) + n;
    }
    
    public static double getRandomInRange(final double n, final double n2) {
        return new Random().nextDouble() * (n2 - n) + n;
    }
    
    public static float getAngleDifference(final float n, final float n2) {
        final float n3 = Math.abs(n2 - n) % 360.0f;
        return (n3 > 180.0f) ? (360.0f - n3) : n3;
    }
    
    public static double round(final double val, final int newScale) {
        if (newScale < 0) {
            throw new IllegalArgumentException();
        }
        return new BigDecimal(val).setScale(newScale, RoundingMode.HALF_UP).doubleValue();
    }
    
    public static double getMiddleint(final double n, final double n2) {
        return (n + n2) / 2.0;
    }
    
    public static int getMiddle(final int n, final int n2) {
        return (n + n2) / 2;
    }
}
