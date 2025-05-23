package org.example;

import java.util.HashMap;
import java.util.Map;

public class Trie implements TrieImpl {
    private TrieNode root;//корень дерева -> всегда пустой
    private long counterPref;

    public Trie() {
        this.root = new TrieNode();
    }

    /**
     * вставка: если уже есть -> не добавляем
     * меняем флаг в конце слова
     *
     * @param str
     */
    @Override
    public void insert(String str) {
        TrieNode current = root;
        for (Character ch : str.toCharArray()) {
            if (!current.getChildren().containsKey(ch)) {
                current.getChildren().put(ch, new TrieNode());

            }
            current = current.getChildren().get(ch);
            current.setCount(current.getCount() + 1);
        }
        current.setTerminal(true);
    }

    /**
     * поиск слова -> проходит по всему дереву
     * и если мы дошли до узла без потомка
     * то значит слово не закончилось терминалом -> не содержится в дереве
     *
     * @param str
     * @return
     */

    public boolean search(String str) {
        TrieNode current = root;
        for (Character ch : str.toCharArray()) {
            if (current.getChildren().get(ch) == null) {
                return false;
            }
            current = current.getChildren().get(ch);
        }
        return current.isTerminal();
    }

    /**
     * поиск слова с префиксом str -> проходит по всему дереву
     * и если мы не нашли эту последовательность префиксов в дереве
     * то значит слов с этим префиксом нет -> не содержится в дереве
     *
     * @param prefix
     * @return boolean
     */
    @Override
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char ch : prefix.toCharArray()) {
            if (current.getChildren().get(ch) == null) {
                return false;
            }
            current = current.getChildren().get(ch);
        }
        return true;
    }

    /**
     * рекурсивно идём по дереву, поэтому каждый раз передаём текущий узел, слово и глубину обхода
     *
     * если текущая глубина равна длине слова, проверяем заканчивается ли какое-нибудь слово на эту букву,
     * если нет, то возвращаем false, иначе
     * убираем флаг конца и возвращаем true если у него нет потомков
     * если глубина меньше длины и эта ветка кончилась, то GGwp возвращаем false
     * начинаем рекурсивно углубляться, индекс изменяем на idx+1
     * после того как дошли до конца, возвращаемся по стеку вызовов и удалем неконечные узлы без потомков
     *
     * @param word
     * @return true если удалили все буквы слова
     */
    public boolean delete(TrieNode current, String word, int index) {
        if (index == word.length()) {
            if (!current.isTerminal())
                return false;
            current.setTerminal(false);
            return current.getChildren().isEmpty();
        }

        char ch = word.charAt(index);
        TrieNode next = current.getChildren().get(ch);
        if (next == null) {
            return false;
        }

        boolean shouldDeleteCurrentNode = delete(next, word, index + 1);

        if (shouldDeleteCurrentNode) {
            current.getChildren().remove(ch);
            return current.getChildren().isEmpty() && !current.isTerminal();
        }
        return false;
    }

    public TrieNode getRoot() {
        return root;
    }
    public void findRoot(TrieNode node, String currentPref, Map<String, Integer> res){
        if(node.getCount() > 1 &&
                (node.isTerminal() || node.getChildren().size() > 1)){//у узла есть потомки больше чем 1 -> сущетсвует больше 1 слова
            //или слово либо терминал или несколько продолжений
            res.put(currentPref, node.getCount());//корень и кол-во слов
            return;//избегаем случая с одинковым продолжением но не корнем типо (лес и лесн )
        }
        for(Map.Entry<Character, TrieNode> entry : node.getChildren().entrySet()){
            findRoot(entry.getValue(), currentPref + entry.getKey(), res);//идем по всем поттомкам
        }

    }

    public Map<String, Integer> findRootInTheWord(){
        Map<String, Integer> rootWords = new HashMap<>();
        findRoot(root, "", rootWords);//собираем мап
        return rootWords;
    }
}
