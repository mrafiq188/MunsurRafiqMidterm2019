package datastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "NY");
                map.put(2, "LA");
                map.put(3, "TX");
                map.put(4, "VA");
                map.put(5, "WA");
                map.put(6, "NJ");

                for (Map.Entry<Integer, String> States : map.entrySet()) {
                        System.out.println("Collection View is as follows-->" +States.getKey()+":"+States.getValue());
                }
        }
}
