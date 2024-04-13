package vtprojesi;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	ArrayList<db> kisiler = new ArrayList<>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		main program = new main();
while(true) {
		System.out.println("Aşağıdakilerden birini seçiniz");
		System.out.println("1 - Üye ekle");
		System.out.println("2 - Üye listesini gör");
		System.out.println("3 - Üye sil");
		System.out.println("4 - Üye düzenle");

		int key = input.nextInt();

		switch (key) {
		case 1:
			program.add(input);
			break;
		case 2:
			program.see(input);
			break;
		case 3:
			program.delete(input);
			break;
		case 4:
			program.design(input);
			break;

		default:
			break;
		}}}

	public void add(Scanner input)
	{
		System.out.print("Adınız ve soyadınız : ");
		String adsoyad = input.nextLine();
		String adsoyad2 = input.nextLine();

		System.out.print("Yaşınız : ");

		int yas = input.nextInt();
		db kisi1 = new db(adsoyad2, yas);
		kisiler.add(kisi1);
		kisi1.getAdSoyad();

	}
	public void see(Scanner input)
	{
		
		for (db kisi : kisiler) {
			if(kisi.getAdSoyad()!=" ") {
			System.out.print("Adı ve soyadı : " + kisi.getAdSoyad() + " - ");
			System.out.println("Yası : " + kisi.getYas());			
		}}

	}
	public void delete(Scanner input)
	{
		
		for (db kisi : kisiler) {
			System.out.print("Adı ve soyadı : " + kisi.getAdSoyad() + " ");
			System.out.println("Yası : " + kisi.getYas());			
		}
		System.out.println("Silmek istediğiniz kişinin isim,soyadı ve yasını doğru giriniz.");
		System.out.println("Ad ve soyad : ");
		String adsoyad = input.nextLine();
		String adsoyad2 = input.nextLine();

		System.out.println("Yas : ");
		int yas1 = input.nextInt();
		for (db kisi : kisiler) {
			if(adsoyad2.equals(kisi.getAdSoyad()) && yas1==kisi.getYas()) {
				kisi.deleteAdSoyad();
				kisi.deleteYas();
				break;
			}else {
				System.out.println("Geçerli değerler giriniz");
			}
		}


	}
	public void design(Scanner input) {
		for (db kisi : kisiler) {
			System.out.print("Adı ve soyadı : " + kisi.getAdSoyad() + " ");
			System.out.println("Yası : " + kisi.getYas());			
		}
		System.out.println("Silmek istediğiniz kişinin isim,soyadı ve yasını doğru giriniz.");
		System.out.println("Ad ve soyad : ");
		String adsoyad = input.nextLine();
		String adsoyad2 = input.nextLine();

		System.out.println("Yas : ");
		int yas1 = input.nextInt();
		for (db kisi : kisiler) {
			if(adsoyad2.equals(kisi.getAdSoyad()) && yas1==kisi.getYas()) {
				System.out.println("Yeni adı giriniz : ");
				String adsoyad3 = input.nextLine();
				String adsoyad4 = input.nextLine();
				System.out.println("Yeni yaşı giriniz : ");
				int yas2 = input.nextInt();
				kisi.setAdSoyad(adsoyad4);
				kisi.setYas(yas2);

				break;
			}else {
				System.out.println("Geçerli değerler giriniz");
			}
		}
	}
}
