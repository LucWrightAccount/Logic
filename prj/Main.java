import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> universe = Arrays.asList("a", "b");

        Formula2<String> formula = new Formula2<>(universe);

        boolean result = formula.evaluation();

        // Manual fact checks (your given facts)
        System.out.println("\n--- FACT CHECKS ---");

        String a = "a";
        String b = "b";

        System.out.println("P(a,b) = " + formula.P(a, b));
        System.out.println("A(a)   = " + formula.A(a));
        System.out.println("S(b)   = " + formula.S(b));
        System.out.println("P(b,a) = " + formula.P(b, a));

        System.out.println("Formula result: " + result);

        System.out.println("Evaluation result = " + result);

        List<String> universe2 = Arrays.asList("z", "c");

        Formula2<String> formula2 = new Formula2<>(universe2);

        boolean result2 = formula2.evaluation();

        // Manual fact checks (your given facts)
        System.out.println("\n--- FACT CHECKS ---");

        String z = "z";
        String c = "c";

        System.out.println("P(z,c) = " + formula.P(z, c));
        System.out.println("A(z)   = " + formula.A(z));
        System.out.println("S(c)   = " + formula.S(c));
        System.out.println("P(c,z) = " + formula.P(c, z));

        System.out.println("Formula result: " + result2);

        System.out.println("Evaluation result = " + result2);

    }

}
