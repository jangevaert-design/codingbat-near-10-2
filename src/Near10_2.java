public class Near10_2 {
  public boolean nearTen(int num) {
    return (num % 10 <= 2 || num % 10 >= 8);
  }

// more concise:
// public boolean nearTen(int num) {
//   return ((num + 2) % 10 < 5);
// }
}
