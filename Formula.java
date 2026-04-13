public class Formula <T> {

    public boolean P(T a, T b){
        return a.equals(b);
    }

    public boolean S(T a){
        return a != null;
    }

    public boolean A(T a){
        return false;
        
    }
    
    public int function(int x, int y){
        return x*y;
        
    }



}
