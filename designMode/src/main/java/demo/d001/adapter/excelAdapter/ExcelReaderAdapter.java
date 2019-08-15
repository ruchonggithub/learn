package demo.d001.adapter.excelAdapter;

import demo.d001.adapter.excelReader.CsvReader;
import demo.d001.adapter.excelReader.JsonReader;
import demo.d001.adapter.excelReader.XlsReader;
import demo.d001.adapter.excelReader.XlsxReader;
import demo.d001.adapter.systemExcelReader.Sheet;
import demo.d001.adapter.systemExcelReader.Xls;
import demo.d001.adapter.systemExcelReader.Xlsx;

import java.io.InputStream;
import java.util.List;

public class ExcelReaderAdapter implements Xls, Xlsx {

    private CsvReader csvReader;
    private XlsReader xlsReader;
    private XlsxReader xlsxReader;
    private JsonReader jsonReader;

    public ExcelReaderAdapter(CsvReader csvReader) {
        this.csvReader = csvReader;

    }

    public ExcelReaderAdapter(JsonReader jsonReader) {
        this.jsonReader = jsonReader;
    }

    public ExcelReaderAdapter(XlsxReader xlsxReader) {
        this.xlsxReader = xlsxReader;
    }

    public ExcelReaderAdapter(XlsReader xlsReader) {
        this.xlsReader = xlsReader;
    }


    @Override
    public <T> List<T> readXlsData(InputStream inputStream) {
        return null;
    }

    @Override
    public <T> List<T> readXlsxData(Sheet inputStream) {
        return null;
    }
}
