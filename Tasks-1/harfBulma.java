public class Main {

  public static void main(String[] args) {
    char harf = 'ç';
    char[] kalınSesliHarfler = { 'A', 'I', 'O', 'U' };
    char[] inceSesliHarfler = { 'E', 'İ', 'Ö', 'Ü' };

    for (int i = 0; i < 4; i++) {
      if (harf == kalınSesliHarfler[i]) {
        System.out.println("Harfimiz Kalındır!!");
        return;
      } else if (harf == inceSesliHarfler[i]) {
        System.out.println("Harfimiz İncedir!!");
        return;
      }
      if (i == kalınSesliHarfler.length - 1) {
        System.out.println("Lütfen Geçerli Harf Giriniz!!");
      }
    }
  }
}