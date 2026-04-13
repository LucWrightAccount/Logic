import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> universe = List.of(
            "a",
            "c",
            "b"
        );
        
        Formula1<String> formula = new Formula1<>(universe);

        boolean result = formula.evaluate();

        System.out.println("Formula result: " + result);
    }

}
