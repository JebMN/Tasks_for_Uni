class Calculator {
    public void addAndDisplay(int a, int b) {

        int result = calculateSum(a, b);
        System.out.println("The sum is: " + result);
    }
    private int calculateSum(int a, int b) {
        return a + b;
    }
}