package lecture_15.concurent.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyConcurrentMap {
    public static void main(String[] args) {
        compareMap(new HashMap<>(), "Hash Map");
        compareMap(new ConcurrentHashMap<>(), "Concurrent");
    }

    private static void compareMap(Map<String, Integer> map, String mapName){
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                String key = mapName + " Thread-1 " + i;
                map.put(key, i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                String key = mapName + " Thread-2 " + i;
                map.put(key, i);
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Size " + mapName + ": " + map.size());
    }
}
