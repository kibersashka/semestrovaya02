package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StatisticsCollector {
    public static void collect() {
        List<Result> results = new ArrayList<>();
        for (int i = 100; i <= 10000; i+=100) {
            Result result = new Result();
            result.setWordLength(7);
            result.setWordCount(i);
            List<String> words = TriesGenerator.generateWords(i, 7);
            for (int j = 0; j < 5; j++) {
                Trie trie = new Trie();
                long startTime1 = System.nanoTime();
                for (String word : words) {
                    trie.insert(word);
                }
                long endTime1 = System.nanoTime();
                long duration1 = endTime1 - startTime1;
                result.summaryInsertTime += duration1;

                List<String> randWords = new ArrayList<>();
                for (int z = 0; z < 100; z++) {
                    Random rand = new Random();
                    randWords.add(words.get(rand.nextInt(i)));
                }

                long startTime2 = System.nanoTime();
                for (String randWord : randWords) {
                    trie.search(randWord);
                }
                long endTime2 = System.nanoTime();
                long duration2 = endTime2 - startTime2;
                result.summarySearchTime += duration2;

                long startTime3 = System.nanoTime();
                for (String word : words) {
                    trie.delete(trie.getRoot(), word, 0);
                }
                long endTime3 = System.nanoTime();
                long duration3 = endTime3 - startTime3;
                result.summaryDeleteTime += duration3;
            }
            result.setAverageInsertTimeMillis((double) result.summaryInsertTime / 5 / i);
            result.setAverageSearchTimeMillis((double) result.summarySearchTime / 500);
            result.setAverageDeleteTimeMillis((double) result.summaryDeleteTime / 5 / i);
            results.add(result);
        }
        CSVWriter.saveResultsToCSV("Trie/src/main/resources/trieStats.csv", results);
    }
}
