package Homework7;

public class Rectangle extends Shape {
        double width;
        double height;

        public Rectangle() {
        }

        public Rectangle (double width, double height, String color) {
            super(color);
            this.height = height;
            this.width = width;
        }

        @Override
        public String toString() {
            return super.toString() + ": width -> " + width + ": height -> " + height;
        }

        @Override
        public double calcArea() {
            double area = width * height;
            return area;
        }

}
