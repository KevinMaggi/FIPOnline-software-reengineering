import organizzazione.*;
import federazione.*;

public class Main {

	public static void main(String[] args) {
		//Istanziamo i vari uffici
		UfficioGare uffGare = UfficioGare.getIstance();
		UfficioDesignazioni uffDes = UfficioDesignazioni.getIstance();
		GiudiceSportivo giudice = GiudiceSportivo.getIstance();
		UfficioAmministrativo uffAmm = UfficioAmministrativo.getIstance();
		
		//Istanziamo alcuni tesserati CIA e diamone il riferimento all'ufficio designazioni
		Arbitro a1 = new Arbitro("Kevin", "Maggi", "59366", "IT01...", "ma.kev97@gmail.com", "3463803150");
		Arbitro a2 = new Arbitro("Mattia", "Parigi", "59358", "IT01...", "par***@***", "347*******");
		UDC udc1 = new UDC("Francesco", "Rivituso", "61256", "IT00...", "riv***@***", "348*******");
		UDC udc2 = new UDC("Sofia", "Pierallini", "61261", "IT00...", "sof***@***", "380*******");
		UDC udc3 = new UDC("Lorenzo", "Bezzi", "39657", "IT00...", "lor***@***", "331*******");
		Osservatore oss = new Osservatore("Antonio", "Massafra", "38567", "IT02...", "mas***@***", "333*******");
		
		uffDes.addArbitro(a1);
		uffDes.addArbitro(a2);
		uffDes.addUDC(udc1);
		uffDes.addUDC(udc2);
		uffDes.addUDC(udc3);
		uffDes.addOsservatore(oss);
		
		//L'ufficio gare crea una gara
		System.out.println("     ADESSO L'UFFICIO GARE CREERA' UNA GARA");
		uffGare.crea();
		
		//L'ufficio designazioni designa la gara
		System.out.println("\n     ADESSO L'UFFICIO DESIGNAZIONI INVIERA' LA DESIGNAZIONI PER LA GARA");
		uffDes.designa();
		
		//I tesserati prima della partita inviano il rimborso
		a1.inviaRimborso();
		a2.inviaRimborso();
		udc1.inviaRimborso();
		udc2.inviaRimborso();
		udc3.inviaRimborso();
		oss.inviaRimborso();
		
		//L'interfaccia del primo arbitro mostra questo
		System.out.println("\n     DOPO AVER INVIATO IL RIMBORSO, L'INTERFACCIA DEL PRIMO ARBITRO APPARIRA' COSI'");
		a1.visualizzaInterfaccia();
		
		//Dopo la partita il primo arbitro invia il referto
		a1.inviaReferto();
		
		//Il giudice sportivo omologa la gara
		giudice.omologa();
		
		//L'ufficio amministrativo liquida i rimborsi passati
		System.out.println("\n     ADESSO L'UFFICIO AMMINISTRATIVO LIQUIDERA' I RIMBORSI");
		uffAmm.liquida();
		
		//L'interfaccia del primo arbitro adesso mostra questo
		System.out.println("\n     DOPO LA LIQUIDAZIONE L'INTERFACCIA DEL PRIMO ARBITRO APPARIRA' COSI'");
		a1.visualizzaInterfaccia();
	}

}
