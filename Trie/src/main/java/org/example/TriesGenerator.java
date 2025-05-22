package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TriesGenerator {
    static List<String> generateWords(int wordCount, int wordLength) {
        List<String> result = new ArrayList<>();
        Random rand = new Random();

        while (result.size() < wordCount) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < wordLength; i++) {
                sb.append((char) ('a' + rand.nextInt(26)));
            }
            String word = sb.toString();
            if (!result.contains(word)) {
                result.add(word);
            }
        }
        return result;
    }

}
