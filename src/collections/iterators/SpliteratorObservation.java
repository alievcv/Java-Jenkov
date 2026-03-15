package collections.iterators;

import java.util.List;
import java.util.Spliterator;

public class SpliteratorObservation {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        Spliterator<Integer> spliterator = list.spliterator();
        System.out.println("Est size: " + spliterator.estimateSize());

        //it is not used by devs directly, instead it is used by the parallel processing libraries
    }


}
