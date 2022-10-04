public class Main {

  public static void main(String[] args) {
    int number = 19;
    int kalan = 0;
    boolean sayiDurumu = true;

    if (number == 1) {
      System.out.println("Lütfen 1'den büyük bir sayı giriniz");
      return;// metoddan dışarı çıkar
    }
    if (number < 1) {
      System.out.println("Geçersiz Sayı Girdiniz");
      return;
    } else {
      for (int i = 2; i < number; i++) {
        kalan = number % i;
        if (kalan == 0) {
          sayiDurumu = false;
          break;
        }
      }
    }
    if (sayiDurumu) {
      System.out.println("Sayımız Asal Sayıdır");
    } else {
      System.out.println("Sayımız Asal Sayı Değildir");
    }
  }
}