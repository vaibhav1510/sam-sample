package Utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonParser<T> {

    public static String convert(Class clz, Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

//    public static T serialize(Class clz, String jsonStr) {
//        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
//
//        GsonBuilder builder = new GsonBuilder();
//        builder.setPrettyPrinting();
//
//        Gson gson = builder.create();
//
//        Student student = gson.fromJson(jsonString, clz);
//    }

}
