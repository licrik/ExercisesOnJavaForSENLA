package ImagesNumbers.numbers;

public class NumberFour extends Number {

    public NumberFour(int wight, int height) {
        super(wight, height);
    }

    @Override
    public char GetNumberChar() {
        return '4';
    }

    @Override
    protected void InitializeStringsLine() {
        AddCoordinate(3, 0);

        AddCoordinate(2, 1);
        AddCoordinate(3, 1);

        AddCoordinate(1, 2);
        AddCoordinate(3, 2);

        AddCoordinate(0, 3);
        AddCoordinate(3, 3);

        AddCoordinate(0, 4);
        AddCoordinate(1, 4);
        AddCoordinate(2, 4);
        AddCoordinate(3, 4);
        AddCoordinate(4, 4);

        AddCoordinate(3, 5);

        AddCoordinate(3, 6);
    }

}
