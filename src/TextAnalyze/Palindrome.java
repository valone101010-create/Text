package TextAnalyze;

public class Palindrome {
    public static void main(String[] args) {
        String text = "Уведи у вора карову и деву";


        String cleanedText = text.toLowerCase().replaceAll("[^a-яё]", "");
        String reversedCleaned = new StringBuilder(cleanedText).reverse().toString();
        boolean isPalindrome = cleanedText.equals(reversedCleaned);

        System.out.println("Текст является палиндромом: " + (isPalindrome ? "Да" : "Нет"));
    }
}
