public class Main {

  public static void main(String[] args) {
    String mesaj = "Bugün hava çok güzel.";
    String mesaj2 = "    Bugün hava çok güzel.     ";
    System.out.println(mesaj);

    // seçilen karakteri istenilen karaktere donuştürür
    String yeniMesaj = mesaj.replace(' ', '-');
    System.out.println(yeniMesaj);
    System.out.println(mesaj.substring(2, 4));
    // 2'den başla 4'e kadar

    // split ile kelimeleri ayırırız
    for (String kelime : mesaj.split(" ")) {
      System.out.println(kelime);
    }
    // harfleri küçültme ve büyütme
    System.out.println(mesaj.toLowerCase());
    System.out.println(mesaj.toUpperCase());

    System.out.println(mesaj2.trim());

  }
}