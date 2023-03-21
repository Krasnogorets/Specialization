import java.util.Arrays;

public class Task {
    static String[] findShortString(String[] str) {
        String tempString = "";
        for (String item : str) {
            if (item.length() <= 3 && item!="") {
                tempString += item;
                tempString += " ";
            }
        }
        String[] result = tempString.split(" ");
        return result;
    }

    public static void main(String[] args) {
        String[] inputString = new String[] {"22", ";-)", "hello", "45", "world", "Comission", "string", "0", "1",
                "test", "ghost", "1223355","","7" };
        System.out.println("базовый набор строк :" + Arrays.toString(inputString));
        System.out.println("строки длиной <=3 :" +Arrays.toString(findShortString(inputString)));
    }
}
