package TextAnalyze;

public class ALongWord {
    public static void main(String[] args) {
        String text = "Петроний пробудился лишь около полудня,и,как,обычно,c ощущением сильной усталости";

        String[] words = text.trim().split("\\s+");
        String AlongWord = "";

        for (String word : words) {

            String cleanWord = word.replaceAll("[^a-zA-Zа-яА-ЯёЁ]", "");

            if (cleanWord.length() > AlongWord.length()) {
                AlongWord = cleanWord;

            }
        }
        System.out.println("Самое длинное слово:" + AlongWord);
    }


}
