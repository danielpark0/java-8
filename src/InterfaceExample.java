public interface InterfaceExample {
    void printName();

    default void printNameUpperCase() {
        System.out.println("DEFAULT INTERFACE EXAMPLE");
    }
}
