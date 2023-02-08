package MathClass;

public class MathImplementation {
    public static void main(String[] args) {
        // Power Functions
        System.out.println(Math.sqrt(45));
        System.out.println(Math.cbrt(343));
        System.out.println(Math.pow(5,2.5));

        // Logarithmic Functions
        System.out.println();
        System.out.println(Math.log(2));
        System.out.println(Math.log10(10));

        System.out.println();
        System.out.println(Math.exp(5));

        // Trigonometric Functions
        System.out.println();
        System.out.println(Math.sin(30));
        System.out.println(Math.cos(30));
        System.out.println(Math.tan(30));

        // Algebraic Functions
        System.out.println();
        System.out.println(Math.abs(1-5));
        System.out.println(Math.max(4,8));
        System.out.println(Math.min(3,2));

        System.out.println();
        System.out.println(Math.round(3.4444));
        System.out.println(Math.ceil(3.444));
        System.out.println(Math.floor(3.444));
        System.out.println(Math.random() * 10);

        System.out.println();
        System.out.println(Math.signum(-4));
        System.out.println(Math.signum(4));

        // Degree Functions
        System.out.println(Math.toDegrees(4.5));
        System.out.println(Math.toRadians(45));
    }
}
