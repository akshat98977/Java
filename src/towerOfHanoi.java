public class towerOfHanoi {
  public static void towerOfHanoi1(int n, String src, String helper, String dest) {
    if (n == 1) {
      System.out.println("Transfer Disk "+ n + " From " + src + " to " + dest);
      return;
    }
    towerOfHanoi1(n-1, src, dest , helper);
    System.out.println("Transfer Disk "+ n + " From " + src + " to " + dest);
    towerOfHanoi1(n-1, helper, src, dest);
  }
  public static void main(String[] args) {
    int n = 3;
    towerOfHanoi1(n, "S", "H", "D");
  }
}
