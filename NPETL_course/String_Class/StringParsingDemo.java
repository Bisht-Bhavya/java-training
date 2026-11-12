import java.util.StringTokenizer;

import static java.lang.System.in;

public class StringParsingDemo {
    static String in = "Lille Java: Dala Structures;" + "author DS;" + "publisher NPTEL;" + "copyright 2020;";
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer(in, ";");
        while (st.hasMoreTokens()){
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\n" + val);
        }
    }
}
