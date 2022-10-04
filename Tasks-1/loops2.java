public class Main {

	public static void main(String[] args) {
    //for
    for(int i=1;i<10;i++){
      System.out.println(i);
    }
    System.out.println("For Döngüsü Bitti");

    //While
    int j = 1;
    while(j<10){
      System.out.println(j);
      j+=1;
    }
    System.out.println("While Döngüsü Bitti");

    //Do-While
    //şart uymasa dahi 1 kere çalışacak
    int k = 1;
    do{
      System.out.println(k);
      k+=1;
    }while(k<10);
    System.out.println("Do-While Döngüsü Bitti");
	}

}