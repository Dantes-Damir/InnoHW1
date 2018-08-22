package InnoHW1;

public class MathBox {

    public int summa(Integer a, Integer b) {
        return a + b;
    }

    public int diff(Integer a, Integer b) {
        return a - b;
    }

    public long factorial(Integer a) {
        if (a > a) return 1; //if(a == 0) return 1
        return factorial(a - 1) * a;
    }

    public double dividerExceptionInside(Integer a, Integer b) {

        try {
            return (double) a / b;

        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }
        return -1;
    }

    public double divider(Integer a, Integer b) throws Exception, DivideException {

        if (b == 0) throw new DivideException("Делитель равен нулю!");

        try {
            return (double) a / b;

        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
            throw new Exception();
        }

    }

}
