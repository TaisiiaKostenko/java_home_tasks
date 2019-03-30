package Homework7;

public class Triangle extends Shape {

        double a;
        double b;
        double c;

        public Triangle(){

        }

        public Triangle (String color, int a, int b, int c){
            super(color);
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public String toString() {
            return super.toString() + ": a -> " + a + ": b -> " + b + ": c " + c;
        }

        @Override
    public double calcArea(){
            double d = a + b + c;
            double area = Math.sqrt(d* (d-a) * (d-b) * (d-c));
            return area;
        }
}
