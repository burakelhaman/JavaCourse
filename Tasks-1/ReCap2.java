public class Main {

  public static void main(String[] args) {

    double[] myList = { 1.2, 7.3, 3.4, 5.6 };
    double total = 0;
    double enBüyük = myList[0];

    for (double number : myList) {
      if (enBüyük < number) {
        enBüyük = number;
      }
      total = total + number;
      System.out.println(number);
    }
    System.out.println("Sayıların Toplamı : " + total);
    System.out.println("En Büyük Sayı : " + enBüyük);
  }

}