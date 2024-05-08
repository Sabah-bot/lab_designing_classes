public class Rectangle {
//represent a Rectangle. The objects should have two properties: one for length, one for width.
    int length;
    int width;

    public Rectangle(int length, int width ) {
        this.length = length;
        this.width = width;


    }

    //method which will calculate the area of the rectangle
    public  int getArea() {
        int area = (this.length * this.width);
        return area;
    }

    //method which checks if your rectangle is actually a square

    public boolean square() {
        if (this.length == this.width) {
            return true;}
        else
        {return false;}

    }

}
