package org.example;

public class Square implements Drawable{
    @Override
    public void draw(String s) {
        System.out.println("рисуем квадрат, а в центре пишем "+s);
    }
}
