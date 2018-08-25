/**
 * Created by nickfarow on 21/10/2016.
 * TODO auto init value to avoid condition check result.
 */

public class ReturnHelper {
    public int one, two, three, four, five, six, seven, eight, night;
    public int yi, er, san, si, wu, liu, qi, ba, jiu;

    public int bool_one;
    public int bool_yi;

    public static int MIN_INT = -2147483648;

    public ReturnHelper() {
        // Init processText special value as processText flag for check if variable's value changed or not.
        this.one = this.two = this.three = this.four = this.five = this.six = this.seven = this.eight = this.night = this.MIN_INT;
        this.bool_one = -1;

        this.yi = this.er = this.san = this.si = this.wu = this.liu = this.qi = this.ba = this.jiu = this.MIN_INT;
        this.bool_yi = -1;
    }
    public ReturnHelper(int one, int two, int bool_one) {
        this.one = one;
        this.two = two;
        this.bool_one = bool_one;
    }

    public ReturnHelper(int one, int two, int three, int four, int five, int six, int seven, int bool_one) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.seven = seven;

        this.bool_one = bool_one;
    }

    public ReturnHelper(int one, int two, int three, int four, int five, int six, int seven, int bool_one,
        int yi, int er, int san, int si, int wu, int liu, int qi, int bool_yi) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.seven = seven;
        this.bool_one = bool_one;

        this.yi = yi;
        this.er = er;
        this.san = san;
        this.si = si;
        this.wu = wu;
        this.liu = liu;
        this.qi = qi;
        this.bool_yi = bool_yi;
    }
}
