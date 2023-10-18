/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagefilters;


public class ButtonPanel extends javax.swing.JPanel {

    ImagePanel ip;

    /**
     * Creates new form ButtonPanel
     */
    public ButtonPanel() {
        initComponents();
    }

    public void setIP(ImagePanel ip) {
        this.ip = ip;
    }

    public boolean getMonochrome() {
        return monoChrome.isSelected();
    }

    public boolean getChannelSwap() {
        return channelSwap.isSelected();
    }

    public boolean getRGB() {
        return RGB.isSelected();
    }

    public boolean getRBG() {
        return RBG.isSelected();
    }

    public boolean getGRB() {
        return GRB.isSelected();
    }

    public boolean getGBR() {
        return GBR.isSelected();
    }

    public boolean getBGR() {
        return BGR.isSelected();
    }

    public boolean getBRG() {
        return BRG.isSelected();
    }

    public boolean getBlur() {
        return blur.isSelected();
    }

    public boolean getVertical() {
        return Vertical.isSelected();
    }

    public boolean getHorizontal() {
        return Horizontal.isSelected();
    }
    public boolean getCombo() {
        return Combo.isSelected();
    }
    public boolean getGradientOverlay() {
        return GradientOverlay.isSelected();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        redValue = new javax.swing.JSlider();
        greenValue = new javax.swing.JSlider();
        blueValue = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        channelSwap = new javax.swing.JCheckBox();
        RGB = new javax.swing.JRadioButton();
        RBG = new javax.swing.JRadioButton();
        GRB = new javax.swing.JRadioButton();
        GBR = new javax.swing.JRadioButton();
        BGR = new javax.swing.JRadioButton();
        BRG = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        monoChrome = new javax.swing.JCheckBox();
        Horizontal = new javax.swing.JCheckBox();
        Vertical = new javax.swing.JCheckBox();
        Combo = new javax.swing.JCheckBox();
        GradientOverlay = new javax.swing.JCheckBox();
        blur = new javax.swing.JCheckBox();
        brightness = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();

        redValue.setMaximum(50);
        redValue.setMinimum(-50);
        redValue.setToolTipText("RED");
        redValue.setValue(0);
        redValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redValueStateChanged(evt);
            }
        });

        greenValue.setMaximum(50);
        greenValue.setMinimum(-50);
        greenValue.setValue(0);
        greenValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenValueStateChanged(evt);
            }
        });

        blueValue.setMaximum(50);
        blueValue.setMinimum(-50);
        blueValue.setValue(0);
        blueValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueValueStateChanged(evt);
            }
        });

        jLabel1.setText("RED");

        jLabel2.setText("GREEN");

        jLabel3.setText("BLUE");

        channelSwap.setText("Channels Swap");
        channelSwap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        channelSwap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        channelSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                channelSwapActionPerformed(evt);
            }
        });

        buttonGroup1.add(RGB);
        RGB.setText("RGB");
        RGB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RGBActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBG);
        RBG.setText("RBG");
        RBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBGActionPerformed(evt);
            }
        });

        buttonGroup1.add(GRB);
        GRB.setText("GRB");
        GRB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(GBR);
        GBR.setText("GBR");
        GBR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GBRActionPerformed(evt);
            }
        });

        buttonGroup1.add(BGR);
        BGR.setText("BGR");
        BGR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGRActionPerformed(evt);
            }
        });

        buttonGroup1.add(BRG);
        BRG.setText("BRG");
        BRG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRGActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Filters");

        monoChrome.setText("Monochrome");
        monoChrome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monoChromeActionPerformed(evt);
            }
        });

        Horizontal.setText("Horizontal");
        Horizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorizontalActionPerformed(evt);
            }
        });

        Vertical.setText("Vertical");
        Vertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerticalActionPerformed(evt);
            }
        });

        Combo.setText("Combo");
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });

        GradientOverlay.setText("Gradient Overlay");
        GradientOverlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradientOverlayActionPerformed(evt);
            }
        });

        blur.setText("Blur");
        blur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blurActionPerformed(evt);
            }
        });

        brightness.setMaximum(50);
        brightness.setMinimum(-50);
        brightness.setValue(0);
        brightness.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                brightnessStateChanged(evt);
            }
        });

        jLabel5.setText("Brightness");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(channelSwap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monoChrome)
                            .addComponent(Horizontal)
                            .addComponent(Vertical)
                            .addComponent(Combo)
                            .addComponent(GradientOverlay)
                            .addComponent(blur)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GBR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RGB))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BGR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RBG))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GRB)
                            .addComponent(BRG))))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greenValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(blueValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(redValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brightness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(channelSwap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBG)
                    .addComponent(GRB)
                    .addComponent(RGB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GBR)
                    .addComponent(BGR)
                    .addComponent(BRG))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(monoChrome)
                        .addGap(18, 18, 18)
                        .addComponent(blur)
                        .addGap(18, 18, 18)
                        .addComponent(Horizontal)
                        .addGap(18, 18, 18)
                        .addComponent(Vertical)
                        .addGap(18, 18, 18)
                        .addComponent(Combo)
                        .addGap(18, 18, 18)
                        .addComponent(GradientOverlay)
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(brightness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(redValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(greenValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(blueValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57))
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)))
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void monoChromeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monoChromeActionPerformed
        ip.repaint();
    }//GEN-LAST:event_monoChromeActionPerformed

    private void blurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blurActionPerformed
        ip.repaint();
    }//GEN-LAST:event_blurActionPerformed

    private void RBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBGActionPerformed
        ip.repaint();
    }//GEN-LAST:event_RBGActionPerformed

    private void redValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redValueStateChanged
        ip.setRed(redValue.getValue());
        ip.repaint();
    }//GEN-LAST:event_redValueStateChanged

    private void blueValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueValueStateChanged
        ip.setBlue(blueValue.getValue());
        ip.repaint();
    }//GEN-LAST:event_blueValueStateChanged

    private void greenValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenValueStateChanged
        ip.setGreen(greenValue.getValue());
        ip.repaint();
    }//GEN-LAST:event_greenValueStateChanged

    private void channelSwapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_channelSwapActionPerformed
        ip.repaint();
    }//GEN-LAST:event_channelSwapActionPerformed

    private void BRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRGActionPerformed
        ip.repaint();
    }//GEN-LAST:event_BRGActionPerformed

    private void RGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RGBActionPerformed
        ip.repaint();
    }//GEN-LAST:event_RGBActionPerformed

    private void brightnessStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_brightnessStateChanged
        ip.setBrightness(brightness.getValue());
        ip.repaint();
    }//GEN-LAST:event_brightnessStateChanged

    private void VerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerticalActionPerformed
        ip.repaint();
    }//GEN-LAST:event_VerticalActionPerformed

    private void HorizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorizontalActionPerformed
        ip.repaint();
    }//GEN-LAST:event_HorizontalActionPerformed

    private void GradientOverlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradientOverlayActionPerformed
        ip.repaint();
    }//GEN-LAST:event_GradientOverlayActionPerformed

    private void GRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GRBActionPerformed
        ip.repaint();
    }//GEN-LAST:event_GRBActionPerformed

    private void GBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GBRActionPerformed
        ip.repaint();
    }//GEN-LAST:event_GBRActionPerformed

    private void BGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGRActionPerformed
        ip.repaint();
    }//GEN-LAST:event_BGRActionPerformed

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        ip.repaint();
    }//GEN-LAST:event_ComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BGR;
    private javax.swing.JRadioButton BRG;
    private javax.swing.JCheckBox Combo;
    private javax.swing.JRadioButton GBR;
    private javax.swing.JRadioButton GRB;
    private javax.swing.JCheckBox GradientOverlay;
    private javax.swing.JCheckBox Horizontal;
    private javax.swing.JRadioButton RBG;
    private javax.swing.JRadioButton RGB;
    private javax.swing.JCheckBox Vertical;
    private javax.swing.JSlider blueValue;
    private javax.swing.JCheckBox blur;
    private javax.swing.JSlider brightness;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox channelSwap;
    private javax.swing.JSlider greenValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox monoChrome;
    private javax.swing.JSlider redValue;
    // End of variables declaration//GEN-END:variables

}