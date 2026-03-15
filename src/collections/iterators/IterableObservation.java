package collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableObservation implements Iterable<String>{

    private List<String> list = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        return this.list.iterator();
    }
}
