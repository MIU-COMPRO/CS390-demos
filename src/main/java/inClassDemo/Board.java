package inClassDemo;

public class Board {
//    private int rows;
//    private int cols;
    private double length;
    private double width;
    private String color;

    public Board(){
        length = 75.5;
        width = 56.7;
        color = "white";
    }
    public Board(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }
    //Call another constructor
    public Board(double length, double width){
        this(length, width, "Black");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return length * width;
    }

    @Override
    public String toString() {
        return "Board{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
