package com.Workintech.enums;

public enum PaintColor {
    BLUE("#ffff"),
    GREEN("#ff0f"),
    RED("#f00f"),
    WHITE("#fff0"),
    ;


    private String hexCode;

    PaintColor(String hexCode) {

        this.hexCode=hexCode;
    }

    public String getHexCode(){
        return hexCode;
    }
}
