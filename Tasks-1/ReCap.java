public class Main {

	public static void main(String[] args) {
    int sayi1 = 21;
    int sayi2 = 26;
    int sayi3 = 21;
    int enBüyük = sayi1;

    if(enBüyük<sayi2){
      enBüyük = sayi2;
    }
    if(enBüyük<sayi3){
      enBüyük = sayi3;
    }

    System.out.println("En Büyük Sayı : " + enBüyük);
	}

}