package TextAnalyze;

public class ReversedWord {
    public static void main(String[] args) {
        String text = "Петроний пробудился лишь около полудня,и,как,обычно,c ощущением сильной усталости";
        String[] words = text.split("\\s+");


        StringBuilder reversedText = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedText.append(reversedWord).append(" ");
        }
        System.out.println("Текст с перевернутыми словами: " + reversedText.toString().trim());
    }
}
