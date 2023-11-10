package List;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main2 {
	/*
	private static LinkedList<String> gidilecek_yerler =new LinkedList<String>();
	
	public static void listeyi_yazdir() {
		for(int i=0;i<gidilecek_yerler.size();i++) {
			System.out.println(gidilecek_yerler.get(i));
		}
	}*/

	public static void listeyi_yazdir(LinkedList<String> gidilecek_yerler) {
		for(String s:gidilecek_yerler) {
			System.out.println(s);
		}
		System.out.println("---------------");
	
		//BUDA EKRANA YAZDIRMAK ���N KULLANILIR
	ListIterator<String> �terator =gidilecek_yerler.listIterator();
	while(�terator.hasNext()) { //YAN� ITERATORUN G�STERD��� HERHANG� B��R OBJE VAR MI
		System.out.println(�terator.next());//B�R SONRAK� YER� G�STERMEK ���N
	}
	
	}
	public static void siraliEkle(LinkedList<String> gidilecek_yerler,String yeni) {
		ListIterator<String> �terator =gidilecek_yerler.listIterator();
		while(�terator.hasNext()) { //HERHANG� B�R OBJE VAR MI ?
			int karsilastir=�terator.next().compareTo(yeni); //B�R SONRAK� YER� G�STER�YOR VE
			                                                  //YEN� DEGER �LE KAR�ILA�TIRIYOR
			if(karsilastir==0) { // �K� DEGER E��T
				System.out.println("Listeden zaten bu eleman var...");
				return; //KOD BLO�UNU SONLANDIRIR
				
			}else if(karsilastir < 0){ //YEN� DE�ER ITERATOR.NEXT'EN B�Y�KSE
				
				
			}else if(karsilastir > 0) { //YEN� DE�ER ITERATOR.NEXT'EN K���KSE
				�terator.previous(); // ITERATORU GER� ALIYORUZ
				�terator.add(yeni); //YEN� DE�ER� EKLER�Z	
				return; //KOD BLO�UNU B�T�RMEK ���N
			}		
			
		}
		�terator.add(yeni);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> gidilecek_yerler =new LinkedList<String>();
		gidilecek_yerler.add("Postane");
		gidilecek_yerler.add("Market");
		gidilecek_yerler.add("K�t�phane");
		gidilecek_yerler.add("Park");
		gidilecek_yerler.add("Okul");
		
	   //listeyi_yazdir();
		
		listeyi_yazdir(gidilecek_yerler);
		
		System.out.println("-------------------");
		
		gidilecek_yerler.add(3, "AVM"); //3.�NDEXE AVM'Y� EKLED�
		listeyi_yazdir(gidilecek_yerler);
		
		System.out.println("--------------");
		gidilecek_yerler.remove(2); //2.�NDEX� S�LER
		listeyi_yazdir(gidilecek_yerler);
		
		
       System.out.println("------------------------");
       siraliEkle(gidilecek_yerler,"Postane"); //BU YERLER� ALFABET�K OLARAK SIRALAR
       siraliEkle(gidilecek_yerler,"Okul");
       siraliEkle(gidilecek_yerler,"Ev");
       listeyi_yazdir(gidilecek_yerler);
	}

}
