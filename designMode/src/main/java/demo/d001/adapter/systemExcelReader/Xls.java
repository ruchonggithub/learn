package demo.d001.adapter.systemExcelReader;

import java.io.InputStream;
import java.util.List;

public interface Xls {
    public <T> List<T> readXlsData(InputStream inputStream);
}
