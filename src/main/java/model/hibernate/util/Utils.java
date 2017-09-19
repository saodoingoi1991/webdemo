package model.hibernate.util;

public class Utils {
    public static String convertUrl(String param1, String param2) {
        param1 = VNCharacterUtils.removeAccent(param1);
        param1 = param1.replaceAll(" ", "-");
        param2 = param2.replaceAll(" ", "-");
        return param1 + "-" + param2;
    }
}
