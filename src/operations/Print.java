package operations;

import tree.Tree;

import java.io.PrintStream;

public class Print {
  private Tree tree;
  public Print(Tree tree) {

    this.tree = tree; // Конструктор
  }

  /**
   * traversing a tree root pre-orderly
   * @param root given tree root
   * @return linux-kind tree of nodes
   */
  public String traversePreOrder(Tree root) {

    if (root == null) { // Объект класс Tree root
      return "";
    }

    StringBuilder sb = new StringBuilder(); // String builder
    sb.append(root.getValue()); // осы String builder ге элемент қосу

    String pointerRight = "└──"; // Оң жақ бөлігі
    String pointerLeft = (root.getRight() != null) ? "├──" : "└──"; // сол жақ бөлігі

    traverseNodes(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
    traverseNodes(sb, "", pointerRight, root.getRight(), false);

    return sb.toString();
  }

  /**
   * traversing through a nodes
   * @param sb StringBuilder containing printing result
   * @param padding left-side padding to node
   * @param pointer pointer to this node
   * @param node given node
   * @param hasRightSibling check if this node has right-side sibling
   */
  public void traverseNodes(StringBuilder sb, String padding, String pointer, Tree node,
                            boolean hasRightSibling) {
    if (node != null) { // Ағаш бойынша элементтерді орналастыру
      sb.append("\n"); // Отступ
      sb.append(padding); // Бос орын қалдыру
      sb.append(pointer); // Элемент қосу
      sb.append(node.getValue()); // Мән беру

      StringBuilder paddingBuilder = new StringBuilder(padding);
      if (hasRightSibling) {
        paddingBuilder.append("│  ");
      } else {
        paddingBuilder.append("   ");
      }

      String paddingForBoth = paddingBuilder.toString();
      String pointerRight = "└──";
      String pointerLeft = (node.getRight() != null) ? "├──" : "└──";

      traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
      traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);
    }
  }

  /**
   * prints String to given Printing stream
   * @param os printing stream (mainly 'System.out')
   */
  public void print(PrintStream os) {
    os.print(traversePreOrder(tree));
    System.out.println();
  }
}