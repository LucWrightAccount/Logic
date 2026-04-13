import java.util.List;

public class Formula<T>{

    private final List<T> universe;
    
    public Formula(List<T> universe){
        this.universe = universe;

    }


    public  boolean P(T x, T y){
        return x.equals(y);
    }

    public  boolean S(T y){
        return y != null;
    }

    public  boolean A(T x){
        return x != null;
    }

    public boolean forEveryX(){
        /*TODO: Change Output
        Default: false
        */
        
        for (T x : universe){
             if(!thereExistsY(x))return false;

        }
        return true;

    }

    
    public boolean thereExistsY(T x){
        
        for(T y:universe){

            if (implication(x, y)){


                 if(forEveryZ(x,y)){
                    return false;
                 }

            }            
        }

    }

    public boolean forEveryZ(T x, T y) {
        for(T z : universe){
            if(!zCondition(x,y,z)){
                return false;

            }
        }
        return true;
    }

    public boolean implication(T x,T y){
        return P(x, y) && A(x) && S(y);

    }



    public boolean zCondition(T x, T y, T z){
        return ((P(y,z) && A(x)));

    }


    


    public boolean evaluate() {
        
        return forEveryX();
    }


}
