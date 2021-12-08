package exception;

public class TreeException extends Exception{
  /**
   * throws if there wrong operations with Tree
   * @param message raising exception message
   */
  public TreeException(String message) {
    super(message);
  }
}
