package az.iktlab.javasiplessons.lesson11;

import java.io.Serializable;

public interface Alive extends Serializable {

    void run();

    default void defaultMethod() {
        System.out.println("Default method");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Some private method");
    }

    static void staticMethod() {
        System.out.println("Static method in the interface");
    }
}
