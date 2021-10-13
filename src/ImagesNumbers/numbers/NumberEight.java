package ImagesNumbers.numbers;

public class NumberEight extends Number {

    public NumberEight(int wight, int height) {
        super(wight, height);
    }

    @Override
    public char GetNumberChar() {
        return '8';
    }

    @Override
    protected void InitializeStringsLine() {
        AddCoordinate(1, 0);
        AddCoordinate(2, 0);
        AddCoordinate(3, 0);

        AddCoordinate(0, 1);
        AddCoordinate(4, 1);

        AddCoordinate(0, 2);
        AddCoordinate(4, 2);

        AddCoordinate(1, 3);
        AddCoordinate(2, 3);
        AddCoordinate(3, 3);

        AddCoordinate(0, 4);
        AddCoordinate(4, 4);

        AddCoordinate(0, 5);
        AddCoordinate(4, 5);

        AddCoordinate(1, 6);
        AddCoordinate(2, 6);
        AddCoordinate(3, 6);
    }

}
