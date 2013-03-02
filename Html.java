/**
 * Interface for Node
 *
 * Realistically, would probably have some operations here.
 */
public interface Node { }

/**
 * A node containing a sequence of Normal and Italic text
 */
public class Html implements Node {
    private final ImList<Node> content;

    public Html(ImList<Node> nodes) {
        // do we need defensive copying?  why or why not?
        this.nodes = nodes;
    }
}


/**
 * A node for normal text
 */
public class Normal implements Node {
    private final String content;
    
    public Normal(String content) {
        this.content = content;
    }
}

/**
 * A node containing for italic content.
 */
public class Italic implements Node {
    private final Html content;
    
    public Italic(Html content) {
        this.content = content;
    }
}
