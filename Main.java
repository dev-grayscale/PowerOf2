/**
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 *
 * An integer n is a power of two, if there exists an integer x such that n == 2^x.
 *
 * Input: n = 16
 * Output: true
 * Explanation: 2^4 = 16
 *
 * https://leetcode.com/problems/power-of-two/
 */
public class Main {
  /**
   * As our constraints are limited to the int type, the following conclusion could be made:
   *
   * 1. Each position in the vector holds a power of 2 value, if the bit is on.
   * 2. 0 is not a power of 2.
   *
   * Determining the value is a power of 2 means proving there's only 1 non-zero bit.
   *
   * The formula (n & (n - 1)) act as discarding the rightmost 1 bit and preserving the 1s on the left, if any.
   * 0 is returned if the discarded 1 bit was the last one. You can check <link>NumberOf1s#V3</link> for another use case.
   *
   * E.g.
   * 001000 (8) & 000111 (7) = 0
   * 1001000 (72) & 1000111 (71) = 1000000 (64)
   */
  public static boolean isPowerOf2(int value) {
    return value != 0 && (value & (value - 1)) == 0;
  }
}
