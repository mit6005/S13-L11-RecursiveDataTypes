/**
 * Immutable List interface
 */
public interface ImList<E> {
    /**
     * Cons adds a new item to the front of the list
     *
     * @param e the element to add to the front
     * @return a new list consisting of e followed by this list
     */
    public ImList<E> cons (E e);
    
    /**
     * Returns the first element of the list.  Requires the list be
     * nonempty.
     *
     * @return the first element of the list
     */
    public E first();
    
    /**
     * Returns the list except the first element.  Requires the list
     * to be nonempty.
     *
     * @return the list except for the first element.
     */
     public ImList<E> rest();
}