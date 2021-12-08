package operations;

import exception.NodeException;
import tree.Tree;

public class Main {

    public static void main(String[] args) throws NodeException {
        Tree tree = new Tree(10); // Ағашқа элемент қосу
        tree.addNode(new Tree(9)); //
        tree.addNode(new Tree(7)); //
        tree.addNode(new Tree(8)); //
        tree.addNode(new Tree(11)); //
        tree.addNode(new Tree(12)); //
        tree.addNode(new Tree(6)); //
        tree.addNode(new Tree(5)); //

        new Print(tree).print(System.out);


        Tree t = tree.findNode(10); // Ағаш бойынша элементті іздеу

        new Print(t).print(System.out); // Элементтерді шығару

    }
}
