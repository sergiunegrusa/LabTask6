/**
 * This class is a tree
 */
public class Tree {

    private String element; //the element
    private Node left;  //the left node
    private Node right; //the right element

    public Tree(String element, Node left, Node right){
        setElement(element);
        setLeft(left);
        setRight(right);
    }

    public Tree(){

    }

    /**
     * Method to set the element
     */
    public void setElement(String element) {
        this.element = element;
    }

    /**
     * Method to set the left element
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * Method to set the right element
     */
    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * Method to get the element
     */
    public String getElement() {
        return element;
    }

    /**
     * Method to get the left element
     */
    public Node getLeft() {
        return left;
    }

    /**
     * Method to get the right element
     */
    public Node getRight() {
        return right;
    }

    /**
     * method that checks if the tree is empty
     * @return true if empty, false if not
     */
    public boolean isEmpty(){
        if(element == null && left == null && right == null){
            return true;
        }
        else return false;
    }

    /**
     * preOrder method that visit node and then its children
     * @param n is for the current node
     */
    public void preOrder(Node n){
        if(n.getLeft() != null){
            preOrder(n.getLeft());
        }
        if(n.getRight() != null){
            preOrder(n.getRight());
        }
    }

}
