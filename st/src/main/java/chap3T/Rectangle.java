package chap3T;

public class Rectangle {
    int width;
    int height;


    int area() {
        return width * height;
    }

    int perimeter() {;
        return 2 * (width + height);
    }

    boolean square() {
        ;
        return this.width == this.height;
    }
}

