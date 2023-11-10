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
	
		//BUDA EKRANA YAZDIRMAK ÝÇÝN KULLANILIR
	ListIterator<String> ýterator =gidilecek_yerler.listIterator();
	while(ýterator.hasNext()) { //YANÝ ITERATORUN GÖSTERDÝÐÝ HERHANGÝ BÝÝR OBJE VAR MI
		System.out.println(ýterator.next());//BÝR SONRAKÝ YERÝ GÖSTERMEK ÝÇÝN
	}
	
	}
	public static void siraliEkle(LinkedList<String> gidilecek_yerler,String yeni) {
		ListIterator<String> ýterator =gidilecek_yerler.listIterator();
		while(ýterator.hasNext()) { //HERHANGÝ BÝR OBJE VAR MI ?
			int karsilastir=ýterator.next().compareTo(yeni); //BÝR SONRAKÝ YERÝ GÖSTERÝYOR VE
			                                                  //YENÝ DEGER ÝLE KARÞILAÞTIRIYOR
			if(karsilastir==0) { // ÝKÝ DEGER EÞÝT
				System.out.println("Listeden zaten bu eleman var...");
				return; //KOD BLOÐUNU SONLANDIRIR
				
			}else if(karsilastir < 0){ //YENÝ DEÐER ITERATOR.NEXT'EN BÜYÜKSE
				
				
			}else if(karsilastir > 0) { //YENÝ DEÐER ITERATOR.NEXT'EN KÜÇÜKSE
				ýterator.previous(); // ITERATORU GERÝ ALIYORUZ
				ýterator.add(yeni); //YENÝ DEÐERÝ EKLERÝZ	
				return; //KOD BLOÐUNU BÝTÝRMEK ÝÇÝN
			}		
			
		}
		ýterator.add(yeni);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> gidilecek_yerler =new LinkedList<String>();
		gidilecek_yerler.add("Postane");
		gidilecek_yerler.add("Market");
		gidilecek_yerler.add("Kütüphane");
		gidilecek_yerler.add("Park");
		gidilecek_yerler.add("Okul");
		
	   //listeyi_yazdir();
		
		listeyi_yazdir(gidilecek_yerler);
		
		System.out.println("-------------------");
		
		gidilecek_yerler.add(3, "AVM"); //3.ÝNDEXE AVM'YÝ EKLEDÝ
		listeyi_yazdir(gidilecek_yerler);
		
		System.out.println("--------------");
		gidilecek_yerler.remove(2); //2.ÝNDEXÝ SÝLER
		listeyi_yazdir(gidilecek_yerler);
		
		
       System.out.println("------------------------");
       siraliEkle(gidilecek_yerler,"Postane"); //BU YERLERÝ ALFABETÝK OLARAK SIRALAR
       siraliEkle(gidilecek_yerler,"Okul");
       siraliEkle(gidilecek_yerler,"Ev");
       listeyi_yazdir(gidilecek_yerler);
	}

}
