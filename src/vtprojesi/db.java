package vtprojesi;

public class db {
		
		private String adsoyad;
		private int yas;
		
		public db(String adsoyad,int yas) {
			this.adsoyad=adsoyad;
			this.yas=yas;
		}
		public String getAdSoyad() {
			return adsoyad;
		}
		public int getYas() {
			return yas;
		}
		public String deleteAdSoyad() {
			adsoyad = " ";
			return adsoyad;
		}
		public int deleteYas() {
			yas = 0 ;
			return yas;
		}
		public String setAdSoyad(String adsoyad2) {
			adsoyad=adsoyad2;
			return adsoyad;
		}public int setYas(int yas2) {
			yas=yas2;;
			return yas;
		}
		
		
//		public void getAd(String variable) {
//			System.out.println(variable);
//		}
//		public void getYas(int variable) {
//			System.out.println(variable);
//		}
//		public void getSoyad(String variable) {
//			System.out.println(variable);
//		}
//		public void setAd(String variable) {
//			
//		}
//		public void setYas(int variable) {
//			System.out.println(variable);
//		}
//		public void setSoyad(String variable) {
//			System.out.println(variable);
//		}
}
