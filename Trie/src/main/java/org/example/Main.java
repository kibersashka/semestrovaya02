package org.example;

/**
 * Разработчик 1: Базовая структура и вставка
 * Задачи:
 * 1. Реализация класса TrieNode:
 *    - Поля для хранения дочерних узлов
 *    - Флаг окончания слова
 *    - Конструктор (при необходимости)
 *
 * 2. Реализация класса Trie:
 *    - Корневой узел
 *    - Базовый конструктор
 *
 * 3. Метод вставки слова (`insert`):
 *    - Пошаговая обработка каждого символа слова
 *    - Создание новых узлов при необходимости
 *    - Установка флага isEndOfWord
 *
 * Тестирование:
 * - Вставка одиночных слов
 * - Вставка слов с общими префиксами
 * - Проверка корректности структуры дерева
 */
public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));

        System.out.println(trie.startsWith("ap"));
        System.out.println(trie.startsWith("sf"));

        System.out.println(trie.delete(trie.getRoot(), "apple", 0));
        System.out.println(trie.search("app"));
    }
}