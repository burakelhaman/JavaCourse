public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		// değişken isimlendirmeleri camelCase şeklinde yazılır
		String metin = "İlginizi Çeker";
		String metin2 = "Metinsel İfadeler";

		System.out.println(metin);

		// integer
		int vade = 12;

		double dolarDun = 18.15;
		double dolarBugun = 18.2;

		boolean dolarDustuMu = false;

		String okYonu = " ";

		if (dolarBugun < dolarDun) {// true
			okYonu = "down.svg";
			System.out.println(okYonu);

		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);

		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		// array
		String[] krediler = { "laptop", "mouse", "keyboard" };

		System.out.println(krediler[0]);

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}
}