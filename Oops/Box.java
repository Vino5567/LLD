package Oops;

public class Box {
    int width;
    int height;
    int length;
    int temp = 10;

    Box(){
        this.width = -1;
        this.height = -1;
        this.length = -1;
    }

    Box(int width, int height, int length){
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box(Box anotherBox){
        this.width = anotherBox.width;
        this.height = anotherBox.height;
        this.length = anotherBox.length;
    }

    Box(int temp){
        this.temp = temp;
    }

    void temp(){
        System.out.println("Box Class");
    }
}
