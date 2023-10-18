/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagefilters;

import java.awt.Color;
import java.awt.Graphics;


public class Gradient {

    //Horizontal Gradient
    public void drawGradientH(Color c1, Color c2, int width, int height, Graphics g) {
        double R = c1.getRed();
        double G = c1.getGreen();
        double B = c1.getBlue();

        double dR = c2.getRed() - R;
        double dG = c2.getGreen() - G;
        double dB = c2.getBlue() - B;

        double st = width;

        double rInc = dR / st;
        double gInc = dG / st;
        double bInc = dB / st;

        for (int x = 0; x < width; x++) {
            g.setColor(new Color((int) R, (int) G, (int) B,155));
            for (int y = 0; y < height; y++) {
                g.fillRect(x, y, 1, 1);

            }
            R += rInc;
            B += bInc;
            G += gInc;
        }

    }

    //Horizontal Gradient    
    private void drawGradientH(Color c1, Color c2, int width, int height, int x, double st, Graphics g) {
        double R = c1.getRed();
        double G = c1.getGreen();
        double B = c1.getBlue();

        double dR = c2.getRed() - R;
        double dG = c2.getGreen() - G;
        double dB = c2.getBlue() - B;

        double rInc = dR / st;
        double gInc = dG / st;
        double bInc = dB / st;

        for (; x < width; x++) {
            g.setColor(new Color((int) R, (int) G, (int) B));
            for (int y = 0; y < height; y++) {
                g.fillRect(x, y, 1, 1);

            }
            R += rInc;
            B += bInc;
            G += gInc;
        }

    }

    //Multiple colors Horizontal Gradient
    public void drawMultiGradientH(int width, int height, Graphics g, Color... c) {

        int widthInc = width / (c.length - 1);
        width = 0;

        for (int i = 0; i < c.length - 1; i++) {
            int x = i * widthInc;
            width += widthInc;
            drawGradientH(c[i], c[i + 1], width, height, x, widthInc, g);
        }

    }

    //Vertical Gradient
    public void drawGradientV(Color c1, Color c2, int width, int height, Graphics g) {
        double R = c1.getRed();
        double G = c1.getGreen();
        double B = c1.getBlue();

        double dR = c2.getRed() - R;
        double dG = c2.getGreen() - G;
        double dB = c2.getBlue() - B;

        double st = height;

        double rInc = dR / st;
        double gInc = dG / st;
        double bInc = dB / st;

        for (int y = 0; y < height; y++) {
            g.setColor(new Color((int) R, (int) G, (int) B));
            for (int x = 0; x < width; x++) {
                g.fillRect((int) x, (int) y, 1, 1);

            }
            R += rInc;
            B += bInc;
            G += gInc;
        }

    }

    //Vertical Gradient
    private void drawGradientV(Color c1, Color c2, int width, int height, double y, double st, Graphics g) {
        double R = c1.getRed();
        double G = c1.getGreen();
        double B = c1.getBlue();

        double dR = c2.getRed() - R;
        double dG = c2.getGreen() - G;
        double dB = c2.getBlue() - B;

        double rInc = dR / st;
        double gInc = dG / st;
        double bInc = dB / st;

        for (; y < height; y++) {
            g.setColor(new Color((int) R, (int) G, (int) B));
            for (int x = 0; x < width; x++) {
                g.fillRect((int) x, (int) y, 1, 1);

            }
            R += rInc;
            B += bInc;
            G += gInc;
        }

    }

    //Multiple colors Vertical Gradient
    public void drawMultiGradientV(int width, int height, Graphics g, Color... c) {

        double heightInc = height / (c.length - 1);
        height = 0;

        for (int i = 0; i < c.length - 1; i++) {
            double y = i * heightInc;

            height += heightInc;
            drawGradientV(c[i], c[i + 1], width, height, y, heightInc, g);
        }

    }

    //Diagonal Gradient
    public void drawGradientD(Color c1, Color c2, int width, int height, Graphics g) {
        double R = c1.getRed();
        double G = c1.getGreen();
        double B = c1.getBlue();

        double st = width + height;

        double dR = (c2.getRed() - R);
        double dG = (c2.getGreen() - G);
        double dB = (c2.getBlue() - B);

        double rInc = dR / st;
        double gInc = dG / st;
        double bInc = dB / st;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                double r = (R + (i + j) * rInc) / 255;
                double g_ = (G + (i + j) * gInc) / 255;
                double b = (B + (i + j) * bInc) / 255;

                g.setColor(new Color((float) r, (float) g_, (float) b));
                g.fillRect(j, i, 1, 1);
            }
        }
    }

}
