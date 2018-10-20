import java.util.*;
public class Dictionary{
    static ArrayList<Word> word = new ArrayList<>();
    public void insert(){
        new DictionaryManagement().insertFromFile();
    }
    public static Comparator<Word> W = new Comparator<Word>() {
    // so sanh 2 doi tuong voi nhau
        @Override
        public int compare(Word w1, Word w2){
            return w1.getWord_target().compareTo(w2.getWord_target());
        }
    };
    // sap xep theo Alphabet
    public static void sort() {
        Collections.sort(word, W);
                
    }
    
}