import java.util.List;

public class Formula<T> {

    private final List<T> universe;

    public Formula(List<T> universe) {
        this.universe = universe;

    }

    public boolean P(T x, T y) {
        return x != null || y != null;
    }

    public boolean S(T y) {
        return y != null;
    }

    public boolean A(T x) {
        return x != null;
    }

    public boolean forEveryX() {

        for (T x : universe) {
            System.out.println("Checking x = " + x);

            if (thereExistsY(x) == false) {
                return false;
            }
        }
        return true;

    }

    public boolean thereExistsY(T x) {

        for (T y : universe) {
            if (implication(x, y)) {
                if (forEveryZ(x, y) == false) {
                    return false;
                }

            }
        }
        return true;

    }

    public boolean forEveryZ(T x, T y) {
        for (T z : universe) {
            if (zCondition(x, y, z) == false) {
                System.out.println("FAILURE:");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
                return false;

            }
            System.out.println("SUCCESS:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
        }

        return true;
    }

    public boolean implication(T x, T y) {
        return P(x, y) && A(x) && S(y);

    }

    public boolean zCondition(T x, T y, T z) {
        return ((P(y, z) && A(x)));

    }

    public boolean evaluate() {

        return forEveryX();
    }

}
