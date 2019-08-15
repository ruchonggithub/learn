package demo.d001.adapter.excelReader;

import java.util.ArrayList;
import java.util.List;

public class JsonReader<T> {
    private final List<T> data = new ArrayList<T>();

    public List<T> getData() {
        return data;
    }
}
