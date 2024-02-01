package goit;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;

public class App {
    public static void main(String[] args)throws IOException {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Oksana");
        hashMap.put("lastname", "Matviichuk");
        Gson gson = new Gson();
        String stringGson = gson.toJson(hashMap);
        System.out.println(stringGson);

    }
}
