package org.myProject.View;

import javax.swing.*;
import java.awt.*;

public class panelButton extends JPanel {

    private int arcWidth;
    private int arcHeight;

    public panelButton(int arcWidth, int arcHeight){
        this.setOpaque(false);
        this.arcHeight = arcHeight;
        this.arcWidth = arcWidth;
    }

    @Override
    protected void paintComponent(Graphics graphics){
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(this.getBackground());
        g2.fillRoundRect(0,0, this.getWidth(), this.getHeight(), arcWidth,arcHeight);
        super.paintComponent(graphics);
    }
}
