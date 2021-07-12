package com.ebstech;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here
        String connection = "jdbc:sqlite:store.db";
        DriverManager.getConnection(connection);
        System.out.println("conection created ");
    }

//    public void checkIfSerializable(Object object) throws JsonSerializationException {
//        if(Objects.isNull(object))
//        {
//            throw new JsonSerializationException("the object can is null");
//        }
//        Class<?> clazz = object.getClass();
//        if(!clazz.isAnnotationPresent(JsonSerializable.class))
//        {
//            throw  new JsonSerializationException("The class "
//                    + clazz.getSimpleName()
//                    + " is not annotated with JsonSerializable");
//        }
//    }
////    public void initializeObject(Object object) throws Exception
//    {
//        Class<?> clazz = object.getClass();
//        for(Method method : clazz.getDeclaredMethods())
//        {
//            if(method.isAnnotationPresent(Init.class))
//            {
//                method.setAccessible(true);
//                method.invoke(object);
//            }
//        }
//    }
//    private String getJsonString(Object object) throws Exception {
//        Class<?> clazz = object.getClass();
//        Map<String, String> jsonElementsMap = new HashMap<>();
//        for (Field field : clazz.getDeclaredFields()) {
//            field.setAccessible(true);
//            if (field.isAnnotationPresent(JsonElement.class)) {
//                jsonElementsMap.put(getKey(field), (String) field.get(object));
//                field.get
//            }
//        }
//
//        String jsonString = jsonElementsMap.entrySet()
//                .stream()
//                .map(entry -> "\"" + entry.getKey() + "\":\""
//                        + entry.getValue() + "\"")
//                .collect(Collectors.joining(","));
//        return "{" + jsonString + "}";
//    }

}
