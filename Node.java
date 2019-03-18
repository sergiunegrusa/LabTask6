/**
 * This class is a node for labtask.
 * @author sergiun
 *
 */

public class Node {

    private String element; //the element contained in the node
    private Node left;  //the node to the left
    private Node right; //the node to the right

    public Node(String element, Node left, Node right){
        setElement(element);
        setLeft(left);
        setRight(right);
    }

    public Node() {

    }

    /**
     * Method to set the element
     */
    public void setElement(String element) {
        this.element = element;
    }

    /**
     * Method to set the right
     */
    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * Method to set the left
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * Method to get the element
     */
    public String getElement() {
        return element;
    }

    /**
     * Method to get the right
     */
    public Node getRight() {
        return right;
    }

    /**
     * Method to get the left
     */
    public Node getLeft() {
        return left;
    }
}
