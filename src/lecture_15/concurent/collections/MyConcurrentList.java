package lecture_15.concurent.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyConcurrentList {
    public static void main(String[] args) {
        compareList(new ArrayList<>(), "Array List");
        compareList(new CopyOnWriteArrayList<>(), "Concurrent List");
    }

    private static void compareList(List<String> list, String listName){
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(listName + " Thread-1 " + i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                String key = listName + " Thread-2 " + i;
                list.add(listName + " Thread-2 " + i);
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
        System.out.println("Size " + listName + ": " + list.size());
    }
}
