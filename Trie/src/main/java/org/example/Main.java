package org.example;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Trie trie = new Trie();
//        trie.insert("apple");
//        trie.insert("app");
//        System.out.println(trie.search("apple"));
//        System.out.println(trie.search("app"));
//
//        System.out.println(trie.startsWith("ap"));
//        System.out.println(trie.startsWith("sf"));
//
//        System.out.println(trie.delete(trie.getRoot(), "apple", 0));
//        System.out.println(trie.search("app"));
        //StatisticsCollector.collect();
        String text = "бег бегать бегун лес лесник лесной дом домой";
        String[] words = text.split(" ");

        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }

        // Находим все корни и количество однокоренных слов
        Map<String, Integer> rootWords = trie.findRootInTheWord();

        // Выводим результат
        System.out.println("Корень -> Количество однокоренных слов");
        for (Map.Entry<String, Integer> entry : rootWords.entrySet()) {
            if (entry.getValue() > 1) {  // Игнорируем корни с одним словом
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}