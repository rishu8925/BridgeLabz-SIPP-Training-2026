
import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"rishu");
        map.put(2,"pragati");
        map.put(3,"Reshu");
        for(Map.Entry<Integer,String > e : map.entrySet()){ //entry set h ye  ek 

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
