package collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExample {
    public static void main(String[] args) {
        List L = new ArrayList();
        L.add("1");
        L.add(2);
        L.add("Poltek Harber");
        L.add(2);
        
        L.remove(2);
        
//        for (Object o : L) {
//            System.out.println(o);
//        }
//        
//        for (int i = 0; i < L.size(); i++) {
//            System.out.println(L.get(i)); 
//        }
        
        
//        System.out.println(L.get(2)); 


        Map<String,String> M = new HashMap<>();
        M.put("id", "1252458145");
        M.put("fullname", "DINDA DESTRIYANI HERNAWATI");
        M.put("nickname", "dinda");
        
        M.remove("fullname");
        
        for (String s : M.keySet()) {
            String value = M.get(s);
            System.out.println(value);
        }
        
    }
}
