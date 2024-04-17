package org.example;

public class Main {
    public static void main(String[] args) {
        example3();
    }

    private static void example1() {
        Marker redM = new Marker("red");
        redM.paint("Вася");

        redM.setImage(new Line());
        redM.paint("Петя");

        redM.setImage(new Square());
        redM.paint("Гриша");

//        redM.setImage(new Zigzag()); //нельзя - зигзаг описан ВНУТРИ методам example2 а не example1
    }

    public static void example2(){
        Marker greenM = new Marker("green");

        class Zigzag implements Drawable{   //inner class
            @Override
            public void draw(String s) {
                System.out.println("размашистым зигзагом обозначим "+s);
            }
        }

        greenM.setImage(new Zigzag());  //здесь можно инстанциировать Зигзаг
        greenM.paint("Катя");
        Marker blackM = new Marker("black");
        blackM.setImage(new Zigzag());
        blackM.paint("Елена");
    }

    public static void example3(){
        Marker blueM = new Marker("blue");
        blueM.setImage(new Drawable() { //анонимный вложенный класс
            @Override
            public void draw(String s) {
                System.out.println("Рисуем кракозябру "+s);
            }
        });
        blueM.paint("Василий Пупкин");

        blueM.setImage(s -> System.out.println("много точек складываются в "+s));
        blueM.paint("Света Васина");

        blueM.setImage(word -> {
            System.out.println("---------------------");
            for (char symbol: word.toCharArray()) {
                System.out.println("рисуем букву "+symbol+" с завитушками");
            }
            System.out.println("---------------------");
        });

        blueM.paint("Кот");
    }
}