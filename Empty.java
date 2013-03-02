/**
 * Implements the result of the empty() operation on immutable
 * lists.
 */
public class Empty<E> implements ImList<E> {

    public Empty() { }

    public ImList<E> cons(E e) { return new Cons<E>(e, this); }
    
    public E first() { threw new UnsupportedOperationException(); }
    
    public ImList<E> rest() { throw new UnsupportedOperationException(); }
}     
