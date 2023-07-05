package ders3;
public class TV {
		private int ses;
		private String marka;
		private String isim;
		

			public TV(String marka,String isim) {
				this.marka=marka;
				this.isim=isim;
				ses=20;
				}
			public void sesArttir() {
				if(ses<20) {
					ses++;
					System.out.println("Ses seviyesi"+ses);
				}
					
				else {
					System.out.println("Ses zaten maksimumda.");
				}
				
			}
			public void sesAzalt() {
				if(ses>0) {
					ses--;
					System.out.println("Ses seviyesi"+ses);
				}
				else {
					System.out.println("Ses zaten minimumda.");
				}
				
			}
			@Override
			public String toString() {
			return marka+"  Markalı  "+ isim+"  İsimli Telvizyon oluşturuldu";
			}
}