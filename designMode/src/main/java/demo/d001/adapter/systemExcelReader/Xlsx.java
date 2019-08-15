package demo.d001.adapter.systemExcelReader;

import java.io.InputStream;
import java.util.List;

public interface Xlsx {
    public <T> List<T> readXlsxData(Sheet inputStream);
}
