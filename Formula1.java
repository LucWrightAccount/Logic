import java.util.List;

public class Formula1<T> {

    private final List<T> universe;

    public Formula1(List<T> universe) {
        this.universe = universe;
    }

    public boolean P(T x, T y) {
    return x != null && y != null && y.toString().contains(x.toString());
}

public boolean S(T y) {
    return y != null && y.toString().length() % 2 == 0; // even length

}

public boolean A(T x) {
    return x != null && Character.isLowerCase(x.toString().charAt(0));
}

    // implication: A → B  == !A || B
    public boolean implication(T x, T y) {

        boolean left = P(x, y) && A(x) && S(y);

        if (!left) {
            return true; // implication is automatically true
        }

        return forEveryZ(x, y);
    }

    // ∀z (P(y,z) ∧ A(x))
    public boolean forEveryZ(T x, T y) {
        for (T z : universe) {
            if (!(P(y, z) && A(x))) {
                System.out.println("FAIL at:");
                System.out.println("x=" + x + ", y=" + y + ", z=" + z);
                return false;
            }
        }
        return true;
    }

    // ∃y
    public boolean thereExistsY(T x) {
        for (T y : universe) {
            if (implication(x, y)) {
                return true; // found valid witness
            }
        }
        return false;
    }

    // ∀x
    public boolean forEveryX() {
        for (T x : universe) {
            System.out.println("Checking x = " + x);

            if (!thereExistsY(x)) {
                System.out.println("FAILED x = " + x);
                return false;
            }
        }
        return true;
    }

    public boolean evaluate() {
        return forEveryX();
    }
}