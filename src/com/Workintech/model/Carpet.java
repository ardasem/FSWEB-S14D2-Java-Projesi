package com.Workintech.model;

import com.Workintech.enums.PaintColor;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", height=" + height +
                ", color=" + color.getHexCode() +
                '}';
    }
}
