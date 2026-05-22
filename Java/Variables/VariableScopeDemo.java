package Variables;

public class VariableScopeDemo {
    static int classVariable = 10;
    int instanceVariable = 20;

    public static void main(String[] args) {
        int localVariable = 30;
        System.out.println("Class variable: " + classVariable);
        VariableScopeDemo demo = new VariableScopeDemo();
        System.out.println("Instance variable: " + demo.instanceVariable);
        System.out.println("Local variable: " + localVariable);
    }
}
