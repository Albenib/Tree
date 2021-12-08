package exception;

public class NodeException extends TreeException{
  /**
   * throws if there wrong operations with Node
   * @param message raising exception message
   */
  public NodeException(String message) {
    super(message);
  }
}
