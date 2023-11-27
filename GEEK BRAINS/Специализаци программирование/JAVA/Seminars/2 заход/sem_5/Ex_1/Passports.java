package Ex_1;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> people = new HashMap<>();
    void add (String passport, String name){
        people.put(passport, name);
    }
    String findByName(String userName) {
        StringBuilder stb = new StringBuilder();
        int count = 1;
        for (Map.Entry<String,String> entry : people.entrySet()) {
            String passport = entry.getKey();
            String name = entry.getValue();
            if (name.equals(userName)) {
                stb.append(count++);
                stb.append(". ");
                stb.append(name);
                stb.append(": ");
                stb.append(passport);
                stb.append("\n");
            }
        }
        return stb.toString();
    }

    String getList(){
        StringBuilder stb = new StringBuilder();
        int count = 1;
        for (Map.Entry<String,String> entry : people.entrySet()) {
            String passport = entry.getKey();
            String name = entry.getValue();
            stb.append(count++);
            stb.append(". ");
            stb.append(passport);
            stb.append(name);
            stb.append("\n");

        }
        return stb.toString();
    }
}
