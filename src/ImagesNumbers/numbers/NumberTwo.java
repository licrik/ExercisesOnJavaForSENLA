package ImagesNumbers.numbers;

public class NumberTwo extends Number {

    public NumberTwo(int wight, int height) {
        super(wight, height);
    }

    @Override
    public char GetNumberChar() {
        return '2';
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

        AddCoordinate(2, 3);
        AddCoordinate(3, 3);

        AddCoordinate(1, 4);
        AddCoordinate(0, 5);

        AddCoordinate(0, 6);
        AddCoordinate(1, 6);
        AddCoordinate(2, 6);
        AddCoordinate(3, 6);
        AddCoordinate(4, 6);
    }

}
