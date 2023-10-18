/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagefilters;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ImagePanel extends javax.swing.JPanel {

    BufferedImage image = null;
    ButtonPanel bp = null;
    BufferedImage imagetmp = new BufferedImage(200, 200, BufferedImage.TYPE_3BYTE_BGR);
    private File currentFile;
    private int bright;
    private int redVal;
    private int greenVal;
    private int blueVal;
    private int blurValue = 0;

    BufferedImage raindrop;
    ArrayList<List<Integer>> pixels = new ArrayList<>();
    ArrayList<List<Integer>> pixels_copy = new ArrayList<>();
    Random rand = new Random();

    /**
     * Creates new form ImagePanel
     */
    public ImagePanel() {
        initComponents();
    }

    public void setBP(ButtonPanel bp) {
        this.bp = bp;
    }

    public void setImage(BufferedImage image) {
        this.image = image;

        raindrop = cloneImage(this.image);

        int width = raindrop.getWidth();
        int height = raindrop.getHeight();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                pixels.add(Arrays.asList(x, y));
                pixels_copy.add(Arrays.asList(x, y));
            }
        }

        repaint();
    }

    BufferedImage cloneImage(BufferedImage img) {
        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_3BYTE_BGR);

        for (int xx = 0; xx < w; xx++) {
            for (int yy = 0; yy < h; yy++) {

                int pixel = img.getRGB(xx, yy);
                image.setRGB(xx, yy, pixel);
            }
        }
        return image;
    }

    void save() {

        if (currentFile != null) {
            try {
                ImageIO.write(imagetmp, "png", currentFile);
            } catch (IOException ex) {
                System.out.println("Unsuccess");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No any image has been opened yet");
        }
    }

    void saveAs() {
        JFileChooser fileChooser = new JFileChooser("");
        fileChooser.setDialogTitle("Specify a file to save");

        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(filter);

        int act = fileChooser.showSaveDialog(this);
        if (act == JFileChooser.APPROVE_OPTION);
        File fileToSave = fileChooser.getSelectedFile();
        currentFile = fileToSave;

        try {
            ImageIO.write(imagetmp, "png", fileToSave);
        } catch (IOException ex) {
            System.out.println("Unsuccess");
        }
    }


    void setRed(int value) {
        this.redVal = value;
    }

    void setGreen(int value) {
        this.greenVal = value;
    }

    void setBlue(int value) {
        this.blueVal = value;
    }

    void setBrightness(int value) {
        this.bright = value * 3 / 2;
    }
    void setCurrentFile(File cf) {
        currentFile = cf;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1690, 1000);
        if (image != null) {
            int w = image.getWidth();
            int h = image.getHeight();
            imagetmp = cloneImage(image);
            Filters filter = new Filters(this.imagetmp);

            if (bp.getMonochrome()) {
                for (int xx = 0; xx < w; xx++) {
                    for (int yy = 0; yy < h; yy++) {
                        int pixel = imagetmp.getRGB(xx, yy);
                        int red = (pixel >> 16) & 0x0ff;
                        int green = (pixel >> 8) & 0x0ff;
                        int blue = (pixel) & 0x0ff;
                        int col = (red + green + blue) / 3;
                        imagetmp.setRGB(xx, yy, (new Color(col, col, col).getRGB()));
                    }
                }

            }
            if (bp.getVertical()) {
                this.imagetmp = filter.getVerticalEdgeDetectionFilteredImage();
            }
            if (bp.getHorizontal()) {
                this.imagetmp = filter.getVerticalEdgeDetectionFilteredImage();
            }
            if (bp.getCombo()) {
                this.imagetmp = filter.getComboEdgeDetectionFilteredImage();
            }

            if (bp.getBlur()) {
                blurValue = 5;
                this.imagetmp = filter.getBlurEffectedImage(blurValue);
            }
            if (bp.getGradientOverlay()) {
                filter.getGradientOverlay();

            }
//            Brightness
            for (int xx = 0; xx < w; xx++) {
                for (int yy = 0; yy < h; yy++) {
                    int pixel = imagetmp.getRGB(xx, yy);
                    int red = (pixel >> 16) & 0x0ff;
                    int green = (pixel >> 8) & 0x0ff;
                    int blue = (pixel) & 0x0ff;

                    int bRed = (red + red * bright / 100) > 255 ? 255 : (red + red * bright / 100) < 0 ? 0 : (red + red * bright / 100);
                    int bGreen = (green + green * bright / 100) > 255 ? 255 : (green + green * bright / 100) < 0 ? 0 : (green + green * bright / 100);
                    int bBlue = (blue + blue * bright / 100) > 255 ? 255 : (blue + blue * bright / 100) < 0 ? 0 : (blue + blue * bright / 100);
                    imagetmp.setRGB(xx, yy, (new Color(bRed, bGreen, bBlue).getRGB()));
                }
            }

            g.drawImage(imagetmp, 10, 10, image.getWidth(), image.getHeight(), this);
            //Red
            for (int xx = 0; xx < w; xx++) {
                for (int yy = 0; yy < h; yy++) {
                    int pixel = imagetmp.getRGB(xx, yy);
                    int red = (pixel >> 16) & 0x0ff;
                    int green = (pixel >> 8) & 0x0ff;
                    int blue = (pixel) & 0x0ff;

                    int bRed = (red + red * redVal / 100) > 255 ? 255 : (red + red * redVal / 100) < 0 ? 0 : (red + red * redVal / 100);
                    int bGreen = (green + green * greenVal / 100) > 255 ? 255 : (green + green * greenVal / 100) < 0 ? 0 : (green + green * greenVal / 100);
                    int bBlue = (blue + blue * blueVal / 100) > 255 ? 255 : (blue + blue * blueVal / 100) < 0 ? 0 : (blue + blue * blueVal / 100);
                    if (bp.getChannelSwap()) {
                        if (bp.getRBG()) {
                            imagetmp.setRGB(xx, yy, (new Color(bRed, bBlue, bGreen).getRGB()));
                        } else if (bp.getGRB()) {
                            imagetmp.setRGB(xx, yy, (new Color(bGreen, bRed, bBlue).getRGB()));

                        } else if (bp.getBGR()) {
                            imagetmp.setRGB(xx, yy, (new Color(bBlue, bGreen, bRed).getRGB()));

                        } else if (bp.getGBR()) {
                            imagetmp.setRGB(xx, yy, (new Color(bGreen, bBlue, bRed).getRGB()));

                        } else if (bp.getBRG()) {
                            imagetmp.setRGB(xx, yy, (new Color(bBlue, bRed, bGreen).getRGB()));
                        }
                    } else {
                        imagetmp.setRGB(xx, yy, (new Color(bRed, bGreen, bBlue).getRGB()));
                    }

                }
            }

            g.drawImage(imagetmp, 10, 10, image.getWidth(), image.getHeight(), this);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
