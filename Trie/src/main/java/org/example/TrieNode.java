package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * храниние ссылок на потомков (может быть много -> массив(?) потомков)
 * ----------------значение------
 * флаг
 *
 */
public class TrieNode {
    private Map<Character, TrieNode> children; //потомки
    private boolean terminal; //конец слова или нет

    public TrieNode() {
        children = new HashMap<>();
        terminal = false;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public boolean isTerminal() {
        return terminal;
    }

    public void setTerminal(boolean terminal) {
        this.terminal = terminal;
    }
}
