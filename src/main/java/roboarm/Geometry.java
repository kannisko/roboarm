package roboarm;

import static java.lang.Math.*;

public class Geometry {
    static final float L1 = 80.0f;
    static final float L2 = 80.0f;

    static double angleToRadian(int angle) {
        return (float) (PI * angle) / 180;
    }

    static float getX(int alpha, int beta) {
        double alphaD = angleToRadian(alpha);
        double betaD = angleToRadian(beta);
        return (float) (L1 * cos(alphaD) - L2 * cos(betaD));
    }

    static float getY(int alpha, int beta) {
        double alphaD = angleToRadian(alpha);
        double betaD = angleToRadian(beta);
        return (float) (L1 * sin(alphaD) - L2 * sin(betaD));

    }

    public static void main(String[] args) {
        int alpha, beta;

        for (alpha = 0; alpha <= 135; alpha += 5) {
            for (beta = max(90, alpha); beta <= 180; beta += 5) {
                float x = getX(alpha, beta);
                float y = getY(alpha, beta);
                String ss = "alpha=" + alpha + " beta=" + beta + " x=" + x + " y=" + y + "\n";
                System.out.print(ss);
            }
        }
    }

}
