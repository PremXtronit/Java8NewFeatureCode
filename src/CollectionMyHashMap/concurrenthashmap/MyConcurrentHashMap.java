package CollectionMyHashMap.concurrenthashmap;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class MyConcurrentHashMap {


    public static void main(String[] args) {

        Optional<NullableObj> n1 = Optional.ofNullable(null);
        ConcurrentHashMap<String, Optional<NullableObj>> concurrentHashMap1 = new ConcurrentHashMap<>();
        concurrentHashMap1.put("Key", n1);
        System.out.println(concurrentHashMap1);

        Optional<Trip> trip1 = Optional.ofNullable(null);
        Optional<Trip> trip2 = Optional.ofNullable(new Trip());
        ConcurrentHashMap<String, Optional<Trip>> concurrentHashMap2 = new ConcurrentHashMap<>();
        concurrentHashMap2.put("trip1", trip1);
        concurrentHashMap2.put("trip2", trip2);
        System.out.println(concurrentHashMap2);

        final Optional<Trip> value = concurrentHashMap2.get("trip1");
        System.out.println(value);
        //System.out.println(value.get());
        System.out.println(value.orElse(new Trip()));

        final Optional<Trip> value1 = concurrentHashMap2.get("trip2");
        System.out.println(value1);
        System.out.println(value1.get());
        System.out.println(value1.orElse(new Trip()));


    }

}

class NullableObj {

}

class Trip {

}
