package single.mei.typeX7_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author wxy
 * @date: 2023/5/16 10:59 PM
 * @ClassName: IteratorTest
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            iterator.remove();
        }
        System.out.println();

        arrayList.forEach(System.out::print);
        System.out.println(); // 空

    }
}
