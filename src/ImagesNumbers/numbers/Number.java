package ImagesNumbers.numbers;

import java.util.Arrays;
import java.util.LinkedList;

public abstract class Number {

    private int _wight;
    private int _height;

    public Number(int wight, int height) {
        _wight = wight;
        _height = height;
    }

    private LinkedList<Coordinate> _coordinates = new LinkedList<Coordinate>();

    protected void AddCoordinate(int x, int y) {
        _coordinates.add(new Coordinate(x, y));
    }

    public String[] GetNumberStrings(char element) {
        InitializeStringsLine();

        return GetStringForPosition(element);
    }

    public abstract char GetNumberChar();

    private String[] GetStringForPosition(char element) {
        char[][] char_array = CreateCharArray(element);

        return ConvertCharArray(char_array);
    }

    private char[][] CreateCharArray(char element) {
        char[][] builder = CreateCleanArray();

        for (Coordinate coordinate:
                _coordinates) {
            builder[coordinate.y()][coordinate.x()] = element;
        }

        return builder;
    }

    private String[] ConvertCharArray(char[][] array) {
        String[] string_array = new String[_height];

        for (int i = 0; i < _height; i++) {
            string_array[i] = String.valueOf(array[i]);
        }

        return string_array;
    }

    private char[][] CreateCleanArray() {
        char[][] chars = new char[_wight][_height];

        for (int i = 0; i < _height; i++) {
            Arrays.fill(chars[i], ' ');
        }
        return chars;
    }

    protected abstract void InitializeStringsLine();

}
