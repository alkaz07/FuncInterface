package org.example;

public class Line implements Drawable{
    @Override
    public void draw(String s) {
        System.out.println("ведем маркер, не отрывая по линии "+s);
    }
}
