package InnoHW1;

public class Main {

    public static void main(String[] args) {
        MathBox mathBox = new MathBox();

        System.out.println(mathBox.summa(2, 4));
        //System.out.println(mathBox.factorial(4));
        System.out.println(mathBox.diff(2, 4));
        System.out.println(mathBox.dividerExceptionInside(2, 4));
        try {
            System.out.println(mathBox.divider(2, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
