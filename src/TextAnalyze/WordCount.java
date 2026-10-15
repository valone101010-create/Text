package TextAnalyze;

import static java.awt.SystemColor.text;

public class WordCount {
    public static void main(String[] args) {
        String text = "Петроний пробудился лишь около полудня,и,как обычно,с ощущением сильной усталости";
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println(+wordCount);


    }
}
