package com.Workintech.model;

public class Bedroom extends Room{
    private String name;
    private Bed bed;
    private Carpet carpet;
    private Wardrobe wardrobe;


    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp,String name, Bed bed, Wardrobe wardrobe,Carpet carpet) {
        super(wall1, wall2, wall3, wall4, ceiling, lamp);
        this.bed = bed;
        this.carpet = carpet;
        this.name=name;
        this.wardrobe=wardrobe;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    @Override
    public String toString() {
        return super.toString() + "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", carpet=" + carpet +
                ", wardrobe=" + wardrobe +
                '}';
    }
}
