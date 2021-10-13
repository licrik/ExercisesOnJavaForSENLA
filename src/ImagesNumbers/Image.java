package ImagesNumbers;

import ImagesNumbers.numbers.*;
import ImagesNumbers.numbers.Number;

public class Image {
    private Number _number;
    private char _char_number = '*';

    public Image(int number, int wight, int height) {
        CreateNumber(number, wight, height);
    }

    private void CreateNumber(int number, int wight, int height) {
        switch (number) {
            case 0:
                _number = new NumberZero(wight, height);

                break;

            case 1:
                _number = new NumberOne(wight, height);

                break;

            case 2:
                _number = new NumberTwo(wight, height);

                break;

            case 3:
                _number = new NumberThree(wight, height);

                break;

            case 4:
                _number = new NumberFour(wight, height);

                break;

            case 5:
                _number = new NumberFive(wight, height);

                break;
            case 6:
                _number = new NumberSix(wight, height);

                break;

            case 7:
                _number = new NumberSeven(wight, height);

                break;

            case 8:
                _number = new NumberEight(wight, height);

                break;

            case 9:
                _number = new NumberNine(wight, height);

                break;
        }
    }

    public String[] GetImage(boolean maximum) {
        if (maximum) {
            _char_number = _number.GetNumberChar();
        }

        return _number.GetNumberStrings(_char_number);
    }
}
