import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void test() {
    Assertions.assertFalse(Main.isPowerOf2(0));
    Assertions.assertFalse(Main.isPowerOf2(3));
    Assertions.assertFalse(Main.isPowerOf2(5));
    Assertions.assertFalse(Main.isPowerOf2(7));
    Assertions.assertFalse(Main.isPowerOf2(10));
    Assertions.assertFalse(Main.isPowerOf2(80));

    Assertions.assertTrue(Main.isPowerOf2(1));
    Assertions.assertTrue(Main.isPowerOf2(2));
    Assertions.assertTrue(Main.isPowerOf2(4));
    Assertions.assertTrue(Main.isPowerOf2(16));
    Assertions.assertTrue(Main.isPowerOf2(32));
    Assertions.assertTrue(Main.isPowerOf2(64));
    Assertions.assertTrue(Main.isPowerOf2(128));
    Assertions.assertTrue(Main.isPowerOf2(256));
    Assertions.assertTrue(Main.isPowerOf2(512));
    Assertions.assertTrue(Main.isPowerOf2(1024));
    Assertions.assertTrue(Main.isPowerOf2(2048));
    Assertions.assertTrue(Main.isPowerOf2(1 << 30));
    Assertions.assertTrue(Main.isPowerOf2(1 << 20));
    Assertions.assertTrue(Main.isPowerOf2(Integer.MIN_VALUE));
  }
}
