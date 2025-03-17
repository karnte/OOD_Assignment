import java.lang.reflect.Method;

public class StockMarketDataParserAdapter implements CSVParser {

    private Object stockMarketDataParser;

    public StockMarketDataParserAdapter() {
        try {
            // โหลดคลาสจาก .class file
            Class<?> clazz = Class.forName("StockMarketDataParser");
            stockMarketDataParser = clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void parseCSV() {
        try {
            // ใช้ Reflection เรียกใช้เมท็อด `parse()`
            Method method = stockMarketDataParser.getClass().getMethod("parseFromCSV");
            method.invoke(stockMarketDataParser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
