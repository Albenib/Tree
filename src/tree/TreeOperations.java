package tree;

import exception.NodeException;

public interface TreeOperations {
  void addNode(Tree tree); // Нүктені қосу әдісі
  void addNode(int val); // Нүктеге мән беру
  void removeNode(int val) throws NodeException; // өшіру әдісі
  boolean nodeExists(Tree node,int val); // Нүктенің бар жоғын анықтау
  Tree findNodeForRemove(int val) throws NodeException; // Нүктені өшіру үшін анықтау әдісі
  Tree findNode(int val) throws NodeException; // Нүктені табу әдісі
}
