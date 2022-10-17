package ex2;
public class Paire<T,U> implements Iaire<T,U>{
    private T var1;
    private U var2;
    public Paire(T var1,U var2){
        this.var1=var1;
        this.var2=var2;
    }
    @Override
    public T fst(){
        return var1;
    }
    @Override
        public U snd() {
            // TODO Auto-generated method stub
            return var2;
        }
    public static void main(String[]args){
        Paire <Integer ,String> popo =new Paire<Integer,String>(35, "nulleuh");
        System.out.println(popo.fst()+"  et  "+popo.snd());
        System.out.println(popo);
    }
    
    @Override
    public <V> Iaire<V, U> changefst(V u) {
        // TODO Auto-generated method stub
        return new Paire<V,U>(u, var2) ;
    }
    @Override
    public <V> Iaire<T, V> changesnd(V u) {
        // TODO Auto-generated method stub
        return new Paire<T,V>(var1, u);
    }

public String toString(){
    return("("+this.fst()+" , "+this.snd()+") :: Paire["+var1.getClass()+" , "+var2.getClass()+"]");
}

}
