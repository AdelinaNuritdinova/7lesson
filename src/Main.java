import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String , String[]> states = new HashMap<String , String[]>();
        states.put("Мерзкий" , new String[]{"Отвратный" , "Ужасный" , "Неприятный"});
        states.put("Отвратный" , new String[]{"Мерзкий" , "Ужасный" , "Неприятный"});
        states.put("Ужасный" , new String[]{"Отвратный" , "Мерзкий" , "Неприятный"});
        states.put("Неприятный" , new String[]{"Отвратный" , "Ужасный" , "Мерзкий"});
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ur key pls");

        String[] strings = states.get(scanner.next());
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
