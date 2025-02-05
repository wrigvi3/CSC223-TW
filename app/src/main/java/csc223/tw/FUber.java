package csc223.tw;

public class FUber {
    public static float euclidean(float x1, float y1, float x2, float y2){
        double var1 = (double) x2 - (double) x1;
        double var2 = (double) y2 - (double) y1;
        double sq1 = Math.pow(var1, 2);
        double sq2 = Math.pow(var2, 2);
        double d = Math.sqrt(sq1+sq2);
        return (float) d;
    }
    public static float manhattan(float x1, float y1, float x2, float y2){
        double var1 = Math.abs((double) x2 - (double) x1);
        double var2 = Math.abs((double) y2 - (double) y1);
        float d = (float) var1 + (float) var2;
        return d;
    }
}
