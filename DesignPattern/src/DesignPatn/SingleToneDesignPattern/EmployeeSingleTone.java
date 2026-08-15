package DesignPatn.SingleToneDesignPattern;

import java.io.Serial;
import java.io.Serializable;

public class EmployeeSingleTone  {

    private static EmployeeSingleTone instance;

    private static boolean instanceCreated = false;

    static {
        instance = new EmployeeSingleTone();
    }

    private EmployeeSingleTone() {

        // Protect against Reflection
        if (instanceCreated) {
            throw new RuntimeException(
                    "Singleton instance already exists"
            );
        }

        instanceCreated = true;
    }

    public static EmployeeSingleTone getInstance() {
        return instance;
    }

    // Protect against Serialization
    private Object readResolve() {
        return instance;
    }

    // Protect against Cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(
                "Cloning is not allowed"
        );
    }
}