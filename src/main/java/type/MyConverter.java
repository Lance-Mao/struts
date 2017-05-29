package type;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

public class MyConverter extends StrutsTypeConverter {

    //把String转化为指定的类型
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            return simpleDateFormat.parse(strings[0]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String convertToString(Map map, Object o) {
        return null;
    }
}
