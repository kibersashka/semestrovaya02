package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {
    public static void saveResultsToCSV(String filename, List<Result> results) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("wordLength;wordCount;InsertTime(nano);SearchTime(nano);DeleteTime(nano)\n");
            for (Result result : results) {
                writer.write(result.getWordLength() + ";" +
                        result.getWordCount() + ";" +
                        result.getAverageInsertTime() + ";" +
                        result.getAverageSearchTime() + ";" +
                        result.getAverageDeleteTime() + "\n");
            }

            System.out.println("CSV файл успешно сохранён: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Ошибка при сохранении CSV: " + e.getMessage());
        }
    }
}