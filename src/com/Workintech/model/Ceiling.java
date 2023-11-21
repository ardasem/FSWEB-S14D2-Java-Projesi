package com.Workintech.model;

import com.Workintech.enums.PaintColor;

import java.awt.*;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create(int height, PaintColor paintedColor){
        System.out.println("Height: "+ height + " Painted Color: "+ paintedColor.name());
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                ", paintedColor=" + paintedColor.getHexCode() +
                '}';
    }
}
