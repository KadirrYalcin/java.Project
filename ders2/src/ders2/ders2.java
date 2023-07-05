package ders2;

public class ders2 {
	public static void main(String[] args) {
		Kisi p1=new Kisi("Kadir",526);
		System.out.println(p1.getKimlik());
		Personel p2=new Personel("betül", 15254220, 123);
		System.out.println(p2.getOgrenciNo());
		
	}

}
class Kisi{
	
		private String isim;
		private int kimlik;

		public Kisi(String isim,int kimlik) {
			this.isim=isim;
			this.kimlik=kimlik;
		}

		public String getIsim() {
			return isim;
		}

		public void setIsim(String isim) {
			this.isim = isim;
		}

		public int getKimlik() {
			return kimlik;
		}

		public void setKimlik(int kimlik) {
			this.kimlik = kimlik;
		}

}


class Personel extends Kisi{
	
		private int ogrenciNo;

		public Personel(String isim,int kimlik,int ogrenciKimlik) {
		super(isim,kimlik);
		this.ogrenciNo=ogrenciKimlik;
		}

		public int getOgrenciNo() {
			return ogrenciNo;
		}

		public void setOgrenciNo(int ogrenciNo) {
			this.ogrenciNo = ogrenciNo;
		}

}
class Temizlikci extends Personel{
		private int calisanNumarasi;

		public Temizlikci(String isim,int kimlik,int ogrenciNo,int calisanNumarasi) {
			super(isim, kimlik, ogrenciNo);
			this.calisanNumarasi=calisanNumarasi;
		}

		public int getCalisanNumarasi() {
			return calisanNumarasi;
		}

		public void setCalisanNumarasi(int calisanNumarasi) {
			this.calisanNumarasi = calisanNumarasi;
		
	}


	
	
}
