import java.lang.reflect.Type;
import java.util.*;
import java.util.NoSuchElementException;
public class Main {
    public static void main(String[] args){
         Node node = new Node("Calcifer", null, null);
         Node node1 = new Node("Kiki", null, null);
         Node node2 = new Node("Howl", null, null);
         Node node3 = new Node("Lin", null, null);
         Node node4 = new Node("San", null, null);
         Node node5 = new Node("Ponyo", null, null);
         Node node6 = new Node("Sophie", null, null);

         Tree tree = new Tree();
         tree.setElement(node3.getElement());
         tree.setLeft(node2);
         tree.getLeft().setLeft(node);
         tree.getLeft().setRight(node1);
         tree.setRight(node4);
         tree.getRight().setLeft(node5);
         tree.getRight().setRight(node6);

         System.out.println(tree.getElement());
         System.out.println(tree.getLeft().getElement());
         System.out.println(tree.getLeft().getLeft().getElement());
         System.out.println(tree.getLeft().getRight().getElement());
         System.out.println(tree.getRight().getElement());
         System.out.println(tree.getRight().getLeft().getElement());
         System.out.println(tree.getRight().getRight().getElement());

    }
}
