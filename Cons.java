/**
 * Implements the result of a cons operation.
 */ 
public class Empty<E> implements ImList<E> {
    
    // the element
    private E e;
    
    // the rest of the list
    private ImList<E> rest;
    
    // constructor
    public Cons(E e, ImList<E> rest) {
        this.e = e;
        this.rest = rest;
    }
    
    public ImList<E> cons(E e) { return new Cons<E>(e, this); }
    
    public E first() { return e; }
    
    public ImList<E> rest() { return rest; }
    
}