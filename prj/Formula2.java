
/*
Generic Class for Formula
 */

import java.util.Collection;

public class Formula2 <T>{

    //Set used
    private final Collection<T> universe;

    public Formula2(Collection<T> universe){
        this.universe = universe;

    }

    //Predicate Symbols
    public boolean P(T x, T y){
        return x.equals("a") || y.equals("a");
    }

    public boolean A(T x){
        return x.equals("a");

    }

    public boolean S(T y){
        return y.equals("b");
        
    }
    
   //Universal/Existential Qualifiers 
    public boolean forAllX(){
        return universe.stream().allMatch(x -> thereExistY(x));
    }
    public boolean thereExistY(T x){
        return universe.stream().anyMatch(y -> implication(x,y));
    }
    public boolean forAllZ(T x, T y){
        return universe.stream().allMatch(z -> P(y,z) && A(x));
    }
    public boolean implication(T x, T y){
        boolean antecedent = P(x,y) && A(x) && S(y);

        return !antecedent || forAllZ(x,y);
    }

    public boolean evaluation(){
        return forAllX();
    }


    
}
