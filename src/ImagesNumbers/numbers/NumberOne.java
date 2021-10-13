package ImagesNumbers.numbers;

public class NumberOne extends Number {

    public NumberOne(int wight, int height) {
        super(wight, height);
    }

    @Override
    public char GetNumberChar() {
        return '1';
    }

    @Override
    protected void InitializeStringsLine() {
        AddCoordinate(2, 0);

        AddCoordinate(1, 1);
        AddCoordinate(2, 1);

        AddCoordinate(0, 2);
        AddCoordinate(2, 2);

        AddCoordinate(2, 3);
        AddCoordinate(2, 4);
        AddCoordinate(2, 5);

        AddCoordinate(0, 6);
        AddCoordinate(1, 6);
        AddCoordinate(2, 6);
        AddCoordinate(3, 6);
        AddCoordinate(4, 6);
    }
}
