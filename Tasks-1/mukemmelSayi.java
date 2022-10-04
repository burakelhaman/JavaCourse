public class Main {

  public static void main(String[] args) {
    int number = 0;
    int toplama = 0;

    if (number < 1) {
      System.out.println("0'dan büyük bir sayı giriniz!!");
      return;
    }
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        toplama += i;
      }
    }
    if (toplama == number) {
      System.out.println("Sayımız Mükemmel Sayıdır!!");
    } else {
      System.out.println("Sayımız Mükemmel Sayı Değildir!!");
    }
  }
}