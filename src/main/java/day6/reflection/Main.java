package day6.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Animal.class;
//        Class clazz2 = Class.forName("day6.reflection.Animal");
//        Method[] methods = clazz.getMethods();  //pobiera wszystkie metody łącznie z tymi z nadklasy
        Method[] methods = clazz.getDeclaredMethods(); //pobiera wszystkie adeklarowane metody
        Object o = clazz.newInstance();
        for (Method m: methods) {
            if (m.isAnnotationPresent(RunIt.class)) {
                System.out.println(m.getName());
                System.out.println(m.getAnnotation(RunIt.class).name());
                m.invoke(o);
            }
        }
    }
}