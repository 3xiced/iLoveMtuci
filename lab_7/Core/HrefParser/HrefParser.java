package Core.HrefParser;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HrefParser {
    public String[] parse(String htmlString) {
        final ArrayList<String> result = new ArrayList<String>();

        Matcher m = Pattern.compile("<a href=\"[^\"]*\"")
                .matcher(htmlString);
        while (m.find()) {
            String string = m.group().replace(" ", "");
            if (!string.contains("https") && !string.contains("http") && !string.contains("?")
                    && !string.contains("javascript") && !string.contains(".php") && string != "/"
                    && !string.isEmpty() && !string.isBlank()) {
                try {
                    string = string.substring(9, string.length() - 1);
                    result.add(string);
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("SUBSTRING LENGTH EXCEPTION");
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
