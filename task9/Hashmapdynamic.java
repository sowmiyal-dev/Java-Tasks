package task9;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdynamic {

    public static void main(String[] args) {
        HashMap<Integer, String> employee = new HashMap<>();
        employee.put(101, "arun");
        employee.put(102, "kumar");
        employee.put(103, "jeeva");

        for (Map.Entry<Integer, String> entry:employee.entrySet()) {
            System.out.println("ID:"+ entry.getKey()+",Name:"+entry.getValue());
        }
    }
}