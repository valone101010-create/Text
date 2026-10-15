package TextAnalyze;

import java.util.Map;
import java.util.TreeMap;

public class LetterFrequency {
    public static void main(String[] args) {


        String text = "Петроний пробудился лишь около полудня,и,как,обычно,c ощущением сильной усталости";
        String lowerText = text.toLowerCase();
        Map<Character, Integer> letterFrequency = new TreeMap<>();
        for (char c : lowerText.toCharArray()) {
            if (Character.isLetter(c)) letterFrequency.put(c, letterFrequency.getOrDefault(c, 0) + 1);
        }

        StringBuilder freqOutput = new StringBuilder("Частота букв: ");
        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            freqOutput.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");

            if (freqOutput.length() > 2) {
                freqOutput.setLength(freqOutput.length() - 2);
            }
            System.out.println(freqOutput.toString());
        }


    }
}
