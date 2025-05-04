package Oops;

public class Color extends Box{
    String color;

    Color(){
        super();
        this.color = "NotDefined";
    }

    Color(int width, int height, int length, String color){
        super(width, height, length);
        this.color = color;
    }

    Color(Box anotherBox, String color){
        super(anotherBox);
        this.color = color;
    }

    @Override
    void temp(){
        System.out.println("Color Class");
    }
}
