class Exercise3 {
    public static void main(String[] args) {
        Double fahrenheit = 50.0;
        Double celsius = convertToCelcius(fahrenheit);
        System.out.println("50F in Celsius is " + celsius + "C");
        
    }
    
    public static double convertToCelcius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);                  

    }
}