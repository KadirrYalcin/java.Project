package ders1;


public class Ders1Baslama {
 
	public static void main(String[] args) {
		int dizi[]= {1,5,2,54,-54,421,52,14};
		listeSirala(dizi);
		diziSirala(dizi);
		int sonuc=elemanBul(dizi, 14);
	
		System.out.println("İstenilen eleman"+sonuc);
		}

	public static int elemanBul(int[] dizi,int istenilenElemean) {
		
		int ilkEleman=dizi[0];
		int ilkElemanIndex=0;
		int sonEleman=dizi[dizi.length-1];
		int sonElemanIndex=dizi.length;
		int ortancaEleman=dizi[dizi.length/2];
		int ortancaElemanİndex=dizi.length/2;
		while(ilkEleman<sonEleman) {
			if(istenilenElemean<ortancaEleman) {
			
				ortancaElemanİndex=(ilkElemanIndex+ortancaElemanİndex)/2;
				ortancaEleman=dizi[ortancaElemanİndex];
				sonEleman=ortancaEleman;
		
			}
			else if (istenilenElemean>ortancaEleman) {
			
			ortancaElemanİndex=(ortancaElemanİndex+sonElemanIndex)/2;
			
			ortancaEleman=dizi[ortancaElemanİndex];
			ilkEleman=ortancaEleman;
			
			}
			else {
			return ortancaElemanİndex+1;
		}
		}
		return 0;
			
		
	}

	public static void listeSirala(int[] dizi) {
	int degisir;
	
	for(int i=0;i<dizi.length;i++) {
		for (int j = 0; j < dizi.length; j++) {
			if(dizi[i]<dizi[j]) {
				degisir=dizi[i];
				dizi[i]=dizi[j];
				dizi[j]=degisir;
				
			}
			
		}
		
	}
	}
	public static void diziSirala(int dizi[]) {
		for(int i=0;i<dizi.length;i++) {
		System.out.println("Dizinin"+(i+1)+".elemanı:"+dizi[i]);
		}
		}
	}

