package ua.lesson21.demo_3;

import java.lang.reflect.*;

public class ReflectionUtil {

    public static void showFullClassName(Object object){
        Class<?> clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public static void showSimpleClassName(Object object){
        Class<?> clazz = object.getClass();
        System.out.println(clazz.getSimpleName());
    }

    public static void showClassField(Object object){
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getFields();

        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getModifiers());
        }
    }

    public static void showAllClassField(Object object){
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("field name: " + field.getName());
            System.out.println("field type: " + field.getType());
            System.out.println("field modifier: " + field.getModifiers());
            System.out.println();
        }
    }

    public static void showAllMethodsField(Object object){
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("method name: " + method.getName());
            System.out.println("method type: " + method.getReturnType());
            System.out.println("method count parameter: " + method.getParameterCount());

            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("parameter type: " + parameter.getType());
                System.out.println("parameter name: " + parameter.getName());
            }
            System.out.println("method modifier: " + method.getModifiers());
            System.out.println();
        }
    }

    public static void setValuePrivateField(Object object, String fieldName, Object newValue) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = object.getClass();
        Field declaredField = clazz.getDeclaredField(fieldName);

        declaredField.setAccessible(true);
        declaredField.set(object, newValue);
        declaredField.setAccessible(false);
    }
    
    public static void showAllConstructors(Object object){
        Class<?> clazz = object.getClass();
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
            System.out.println(declaredConstructor.getParameterCount());
            Parameter[] parameters = declaredConstructor.getParameters();

            for (Parameter parameter : parameters) {
                System.out.println("parameter name:" + parameter.getName());
            }

        }
    }

    public static Object createNewObject(Object object)
            throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {

        Class<?> clazz = object.getClass();
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance();
    }

    public static Object createNewObject2(Object object)
            throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {

        Class<?> clazz = object.getClass();
        Constructor<?> declaredConstructor = clazz.getConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance("Alex", 55);
    }
}


