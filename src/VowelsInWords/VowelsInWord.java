package VowelsInWords;

import ConnectorWithUser.Connector;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class VowelsInWord {
    private static Connector _connector;
    private static Word[] _words;

    public static void main(String[] args){
        _connector = new Connector();

        _connector.SendMessage("Введите строку с текстом: ");
        String message = _connector.GetMessage();
        SplitMessageOnWords(message);

        Arrays.sort(_words);
        PrintWords();
    }

    private static void SplitMessageOnWords(String message) {
        String[] words = message.split(" ");

        _words = new Word[words.length];

        for (int i = 0; i < words.length; i++) {
            _words[i] = new Word(words[i]);
            _words[i].CountVowels();
        }
    }

    private static void PrintWords(){
        for (Word item:
             _words) {
            _connector.SendMessage(item.GetWord() + " ");
        }
    }
}
