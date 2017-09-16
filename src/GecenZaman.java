/**
 *
 * @author belen.yasin
 */

public class GecenZaman {

  public static void main(String[] args) {
    long beginTime = 0, endTime = 0;

    beginTime = System.currentTimeMillis();

    for (int i = 0; i < 10; i++) {
      System.out.println("Durum: " + i);
    }

    endTime = System.currentTimeMillis();

    System.out.println("Çalışma Süresi : " + ((double) (endTime - beginTime)) / 1000);
  }
}
