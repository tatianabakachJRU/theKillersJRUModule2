package lecture_5;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        //numbers.add("true");

        // ТАК НЕ ДЕЛАЕМ!
        ArrayList stringList = new ArrayList();
        stringList.add("abc"); //добавляем строку в список
        stringList.add("abc"); //добавляем строку в список
        stringList.add( 1 ); //добавляем число в список
        stringList.add( true ); //добавляем число в список
        for(Object o: stringList){
            String s = (String) o; //тут будет исключение,
            //когда дойдем до элемента-числа
        }

    }
}
