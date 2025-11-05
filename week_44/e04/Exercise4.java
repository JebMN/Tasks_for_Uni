class Exercise4 {
    public static void main(String [] args) {
       System.out.println("Area of Rectangle : " + calculateAreaRec(4, 5) + 
       ", and the area of the Square : " + calculateAreaSqu(4));     
    }

    public static double calculateAreaRec(double length, double width) {
        return length * width; 

    }

    public static double calculateAreaSqu(double side) {
        return side * side;

    }
}