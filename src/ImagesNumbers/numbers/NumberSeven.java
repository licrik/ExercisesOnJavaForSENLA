package ImagesNumbers.numbers;

public class NumberSeven extends Number {

    public NumberSeven(int wight, int height) {
        super(wight, height);
    }

    @Override
    public char GetNumberChar() {
        return '7';
    }

    @Override
    protected void InitializeStringsLine() {
        AddCoordinate(0, 0);
        AddCoordinate(1, 0);
        AddCoordinate(2, 0);
        AddCoordinate(3, 0);
        AddCoordinate(4, 0);

        AddCoordinate(4, 1);

        AddCoordinate(3, 2);

        AddCoordinate(2, 3);

        AddCoordinate(1, 4);

        AddCoordinate(0, 5);

        AddCoordinate(0, 6);
    }

}
