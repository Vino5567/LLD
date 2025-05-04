package Oops;

public class Weight extends Color{
    double weight;

    Weight(){
        super(); // this is nothing but calls the above construtor
        this.weight = -1;
    }

    Weight(int width, int height, int length, String color, double weight){
        super(width, height, length,color);
        this.weight = weight;
    } //also we call in different order like below

    Weight(double weight, int width, int height, int length, String color){
        super(width, height, length,color);
        this.weight = weight;
    }

    Weight(Box another, String color, double weight){
        super(another, color);
        this.weight = weight;
    }

    @Override
    void temp(){
        System.out.println("Weight Class");
    }
}
