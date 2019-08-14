import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String[]> dics = new HashMap<>();

        dics.put("Детский", new String[]{"Маленький", "Инфантильный"});
        dics.put("Стремный", new String[]{"Некрасивый", "Страшный"});
        dics.put("Мерзкий", new String[]{"Ужасный", "Отвратный"});
        dics.put("Свежий", new String[]{"Новый" , "Молодой"});

        while (true) {
            System.out.println("Enter your word");
            String w = scanner.nextLine();

            Set<Map.Entry<String, String[]>> entries = dics.entrySet();
            Map<String, String[]> dictionaryMap = new HashMap<>();

            for (Map.Entry<String, String[]> entry : entries) {
                String key = entry.getKey();
                String[] value = entry.getValue();
                for (int i = 0; i < value.length; i++) {
                    String syn = value[i];
                    String[] value2 = new String[value.length];
                    for (int i2 = 0; i2 < value.length; i2++) {
                        String originValue = value[i2];
                        if (originValue.equals(syn)) {
                            value2[i2] = key;
                        } else {
                            value2[i2] = originValue;
                        }
                    }
                    dictionaryMap.put(syn, value2);

                    if (w.equals(syn)) {
                        for (String v : value2) {

                            System.out.println(v);
                        }
                    }
                }
            }
        }
    }
}
