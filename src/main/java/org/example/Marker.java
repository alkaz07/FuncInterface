package org.example;

public class Marker {
    String color;
    Drawable image;

    public Marker(String color) {
        this.color = color;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public void paint(String s) {
        if (image != null) {
            System.out.println("Маркер рисует " + color + " цветом");
            image.draw(s);
        }
        else
            System.out.println("нечего рисовать");
    }
}
