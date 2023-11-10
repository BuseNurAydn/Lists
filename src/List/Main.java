package List;

import java.util.ArrayList;

public class Main {
	public static void yazdir(ArrayList<String> a) { //METODA PARAMETRE OLARAK BÖYLE YAPILABÝLÝR
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array= new ArrayList<String>();
		array.add("Nebahat");
		array.add("Tahsin");
		array.add("Buse");
		array.add("Berat");
		System.out.println(array.get(0)); //0.indexi yazdýrýr
		System.out.println(array.size()); //Boyutunu yazdýrýr
		
		System.out.println("-----------------------");
		
		//ARRAYLÝSTÝ EKRANA YAZDIRMAK ÝÇÝN
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
		System.out.println("------------------");
		array.remove(0);
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
		System.out.println("--------------");
		System.out.println(array.indexOf("Buse"));

		System.out.println("---------------");
		array.set(2, "Nur");
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
		System.out.println("-------------");
		yazdir(array);
	}

}
