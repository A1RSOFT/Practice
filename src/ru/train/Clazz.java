package ru.train;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Clazz {
    private String name;

    private List<Field> fields;

    private List<Method> methods;

    public List<Method> getMethods() {
        return methods;
    }

    public String getName() {
        return name;
    }

    public List<Field> getFields() {
        return fields;
    }
}
