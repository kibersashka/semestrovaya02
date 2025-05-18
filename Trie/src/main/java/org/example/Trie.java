package org.example;

public class Trie implements TrieImpl{
    private TrieNode root;//корень дерева -> всегда пустой

    public Trie() {
        this.root = new TrieNode();
    }

    /**
     * вставка: если уже есть -> не добавляем
     * меняем флаг в конце слова
     * @param str
     */
    @Override
    public void insert(String str) {
        TrieNode current = root;
        for(Character ch : str.toCharArray()) {
            if(!current.getChildren().containsKey(ch)) {
                current.getChildren().put(ch, new TrieNode());
            }
            current = current.getChildren().get(ch);
        }
        current.setTerminal(true);
    }

    /**
     * поиск слова -> проходит по всему дереву
     * и если мы дошли до узла без потомка
     * то значит слово не закончилось терминалом -> не содержится в дереве
     * @param str
     * @return
     */
    public boolean search(String str) {
        TrieNode current = root;
        for(Character ch : str.toCharArray()){
            if(current.getChildren().get(ch) == null){
                return false;
            }
            current = current.getChildren().get(ch);
        }
        return current.isTerminal();
    }

}
