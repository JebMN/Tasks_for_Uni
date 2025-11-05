public class Demo {

    public void publicMethod() {
        System.out.println("Public method called.");
    }

    protected void protectedMethod() {
        System.out.println("Protected method called.");
    }

    void packagePrivateMethod() { // No modifier = package-private
        System.out.println("Package-private method called.");
    }

    private void privateMethod() {
        System.out.println("Private method called.");
    }
}