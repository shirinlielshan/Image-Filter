/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagefilters;

import java.awt.Color;
import java.awt.image.BufferedImage;


public class Filters {

//    private BufferedImage image;
//
//    public Filters(BufferedImage image) {
//        this.image = image;
//    }
//
//    public BufferedImage getImage() {
//        return image;
//    }
//
//    public void setImage(BufferedImage image) {
//        this.image = image;
//    }
    private BufferedImage image;
    private int[][] edgeDetectionVerticalKernel = {{-1, 0, 1}, {-1, 0, 1}, {-1, 0, 1}};
    private int[][] edgeDetectionHorizontalKernel = {{-1, -1, -1}, {0, 0, 0}, {1, 1, 1}};
    private int[][] edgeGradientColors;

    public Filters(BufferedImage image) {
        this.image = image;
    }

    public BufferedImage getImage() {
        return image;
    }

    public int[][] getEdgeGradientColors() {
        return edgeGradientColors;
    }

    public void setEdgeGradientColors(int w, int h) {
        this.edgeGradientColors = new int[w][h];
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int[][] getEdgeDetectionVerticalKernel() {
        return edgeDetectionVerticalKernel;
    }

    public void setEdgeDetectionVerticalKernel(int[][] edgeDetectionVerticalKernel) {
        this.edgeDetectionVerticalKernel = edgeDetectionVerticalKernel;
    }

    public int[][] getEdgeDetectionHorizontalKernel() {
        return edgeDetectionHorizontalKernel;
    }

    public void setEdgeDetectionHorizontalKernel(int[][] edgeDetectionHorizontalKernel) {
        this.edgeDetectionHorizontalKernel = edgeDetectionHorizontalKernel;
    }

    public BufferedImage getComboEdgeDetectionFilteredImage() {
        int[][] values = new int[3][3];
        int maxGr = 0;
        int w = this.image.getWidth();
        int h = this.image.getHeight();
        setEdgeGradientColors(w, h);
        for (int i = 1; i < w - 1; i++) {
            for (int j = 1; j < h - 1; j++) {
                for (int keyX = 0; keyX < 3; keyX++) {
                    for (int keyY = 0; keyY < 3; keyY++) {
                        values[keyX][keyY] = getGrayScaleColor(this.image.getRGB(i - (1 - keyX), j - (1 - keyY)));
                    }
                }
                int GrX = 0;
                int GrY = 0;
                for (int keyX = 0; keyX < 3; keyX++) {
                    for (int keyY = 0; keyY < 3; keyY++) {
                        GrX += edgeDetectionVerticalKernel[keyX][keyY] * values[keyX][keyY];
                        GrY += edgeDetectionHorizontalKernel[keyX][keyY] * values[keyX][keyY];
                    }
                }
                int GrVal = (int) Math.sqrt((GrX * GrX) + (GrY * GrY));
                if (maxGr < GrVal) {
                    maxGr = GrVal;
                }
                this.edgeGradientColors[i][j] = GrVal;
            }
        }
        double factor = 255.0 / maxGr;
        for (int i = 1; i < w - 1; i++) {
            for (int j = 1; j < h - 1; j++) {
                int edgeColorValue = (int) (this.edgeGradientColors[i][j] * factor);
                edgeColorValue = 0xff000000 | (edgeColorValue << 16) | (edgeColorValue << 8) | edgeColorValue;
                this.image.setRGB(i, j, edgeColorValue);
            }
        }
        return this.image;
    }

    public BufferedImage getVerticalEdgeDetectionFilteredImage() {
        int[][] values = new int[3][3];
        int maxGr = 0;
        int w = this.image.getWidth();
        int h = this.image.getHeight();
        setEdgeGradientColors(w, h);
        for (int i = 1; i < w - 1; i++) {
            for (int j = 1; j < h - 1; j++) {
                for (int keyX = 0; keyX < 3; keyX++) {
                    for (int keyY = 0; keyY < 3; keyY++) {
                        values[keyX][keyY] = getGrayScaleColor(this.image.getRGB(i - (1 - keyX), j - (1 - keyY)));
                    }
                }
                int GrX = 0;
                int GrY = 0;
                for (int keyX = 0; keyX < 3; keyX++) {
                    for (int keyY = 0; keyY < 3; keyY++) {
                        GrX += edgeDetectionVerticalKernel[keyX][keyY] * values[keyX][keyY];
                    }
                }
                int GrVal = (int) Math.sqrt((GrX * GrX) + (GrY * GrY));
                if (maxGr < GrVal) {
                    maxGr = GrVal;
                }
                this.edgeGradientColors[i][j] = GrVal;
            }
        }
        double factor = 255.0 / maxGr;
        for (int i = 1; i < w - 1; i++) {
            for (int j = 1; j < h - 1; j++) {
                int edgeColorValue = (int) (this.edgeGradientColors[i][j] * factor);
                edgeColorValue = 0xff000000 | (edgeColorValue << 16) | (edgeColorValue << 8) | edgeColorValue;
                this.image.setRGB(i, j, edgeColorValue);
            }
        }
        return this.image;
    }

    public BufferedImage getHorizontalEdgeDetectionFilteredImage() {
        int[][] values = new int[3][3];
        int maxGr = 0;
        int w = this.image.getWidth();
        int h = this.image.getHeight();
        setEdgeGradientColors(w, h);
        for (int i = 1; i < w - 1; i++) {
            for (int j = 1; j < h - 1; j++) {
                for (int keyX = 0; keyX < 3; keyX++) {
                    for (int keyY = 0; keyY < 3; keyY++) {
                        values[keyX][keyY] = getGrayScaleColor(this.image.getRGB(i - (1 - keyX), j - (1 - keyY)));
                    }
                }
                int GrX = 0;
                int GrY = 0;
                for (int keyX = 0; keyX < 3; keyX++) {
                    for (int keyY = 0; keyY < 3; keyY++) {
                        GrY += edgeDetectionHorizontalKernel[keyX][keyY] * values[keyX][keyY];
                    }
                }
                int GrVal = (int) Math.sqrt((GrX * GrX) + (GrY * GrY));
                if (maxGr < GrVal) {
                    maxGr = GrVal;
                }
                this.edgeGradientColors[i][j] = GrVal;
            }
        }
        double factor = 255.0 / maxGr;
        for (int i = 1; i < w - 1; i++) {
            for (int j = 1; j < h - 1; j++) {
                int edgeColorValue = (int) (this.edgeGradientColors[i][j] * factor);
                edgeColorValue = 0xff000000 | (edgeColorValue << 16) | (edgeColorValue << 8) | edgeColorValue;
                this.image.setRGB(i, j, edgeColorValue);
            }
        }
        return this.image;
    }

    public int getGrayScaleColor(int RGB) {
        int red = (RGB >> 16) & 0x0ff;
        int green = (RGB >> 8) & 0x0ff;
        int blue = (RGB) & 0x0ff;
        int gray = (int) ((0.2126 * red) + (0.7152 * green) + (0.0722 * blue));
        return gray;
    }

    public BufferedImage getBlurEffectedImage(int blurValue) {
        int w = this.image.getWidth();
        int h = this.image.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                this.image.setRGB(i, j, getBluredPixelColor(i, j, blurValue, w, h));
            }
        }
        return this.image;
    }

    public int getBluredPixelColor(int xx, int yy, int blurValue, int w, int h) {
        int sumRed = 0;
        int sumGreen = 0;
        int sumBlue = 0;
        int countPixels = 0;
        for (int i = xx - blurValue; i < xx + blurValue; i++) {
            for (int j = yy - blurValue; j < yy + blurValue; j++) {
                if (i >= 0 && j >= 0 && i < w && j < h) {
                    int pixel = this.image.getRGB(i, j);
                    int red = (pixel >> 16) & 0x0ff;
                    int green = (pixel >> 8) & 0x0ff;
                    int blue = (pixel) & 0x0ff;
                    sumRed += red;
                    sumGreen += green;
                    sumBlue += blue;
                    countPixels++;
                }
            }

        }
        int r = sumRed / countPixels;
        int b = sumBlue / countPixels;
        int g = sumGreen / countPixels;
        int rgb = 0xff000000 | (r << 16) | (g << 8) | b;
        return rgb;

    }

    public void getGradientOverlay() {
        int w = this.image.getWidth();
        int h = this.image.getHeight();
        Gradient g1 = new Gradient();

        g1.drawGradientH(Color.red, Color.blue, w, h, this.image.getGraphics());

    }

}
