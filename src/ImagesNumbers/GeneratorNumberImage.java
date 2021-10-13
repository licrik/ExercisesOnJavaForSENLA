package ImagesNumbers;

public class GeneratorNumberImage {
    private Image[] _image;
    private int _position = -1;

    private int _wight = 8;
    private int _height = 7;

    public GeneratorNumberImage(int[] number){
        _image = new Image[number.length];
        int maximum = number[0];

        for (int i = 0; i < number.length; i++) {
            _image[i] = new Image(number[i], _wight, _height);

            if (maximum < number[i]) {
                _position = i;
            }
        }
    }

    public String[] GetStringImage() {
        String[] str = new String[_height];

        for (int i = 0; i < _image.length; i++) {

            String[] img = _image[i].GetImage(i == _position);
            for (int j = 0; j < _height; j++) {
                str[j] += img[j];
            }
        }

        return str;
    }
}
