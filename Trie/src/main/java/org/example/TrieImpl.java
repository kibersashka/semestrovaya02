package org.example;

public interface TrieImpl {
    void insert(String str);
    boolean search(String str);
    boolean startsWith(String str);
    boolean delete(TrieNode current, String word, int index);
}
