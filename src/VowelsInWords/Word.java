package VowelsInWords;

import java.util.ArrayList;
import java.util.List;

public class Word implements Comparable<Word> {
    public int count = 0;
    private int _first_vowel = -1;
    private String _word;

    private char[] _vowels = new char[] {
            'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'
    };

    public Word(String word){
        _word = word;
    }

    public void CountVowels(){
        String lower_word = _word.toLowerCase();

        for (int i = 0; i < lower_word.length(); i++) {
            if (IsVowel(lower_word.charAt(i))) {
                count++;
                if (_first_vowel < 0) { _first_vowel = i; }
            }
        }
    }

    public String GetWord() {
        StringBuilder word = new StringBuilder(_word);

        char upper = Character.toUpperCase(_word.charAt(_first_vowel));

        word.setCharAt(_first_vowel, upper);

        return word.toString();
    }

    private boolean IsVowel(char symbol){
        for (char item:
             _vowels) {
            if (symbol == item) { return true; }
        }

        return false;
    }

    @Override
    public int compareTo(Word o) {
       return count - o.count;
    }
}
