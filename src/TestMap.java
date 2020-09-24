import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Thanh",34);
        hashMap.put("Long",20);
        hashMap.put("Huyen",18);
        hashMap.put("Vu",27);
        hashMap.put("Chu",37);
        hashMap.put("Tuoc",23);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");



        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);


        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Kim",12);
        linkedHashMap.put("Tho",34);
        linkedHashMap.put("Thuy",22);
        linkedHashMap.put("Hoa",19);
        linkedHashMap.put("Moc",27);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Hoa"));


    }
}
