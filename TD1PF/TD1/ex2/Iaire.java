package ex2;



public interface Iaire<T,U>{
    public T fst();
    public U snd();
    public <V>Iaire <V,U> changefst(V u);
    public <V>Iaire <T,V> changesnd (V u);
} 