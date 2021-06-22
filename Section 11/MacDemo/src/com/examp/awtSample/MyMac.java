package com.examp.awtSample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyMac extends Frame {
    public MyMac(String title)  {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLange = new Font("SansSerif", Font.BOLD,18);
        Font sansSerifSmall = new Font("SansSerif",Font.BOLD,12);
        g.setFont(sansSerifLange);
        g.drawString("The Complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim Buchalka", 60, 100);

    }
}