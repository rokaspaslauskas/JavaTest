import java.time.format.DateTimeFormatter;

public class PajamuIrasas extends Irasas {

	private String kategorija;
	private String atsiskaitymoTipas = "";

	public PajamuIrasas(float suma, String kategorija, Boolean pozymisArIBanka, String papildomaInfo) {
		super(suma, papildomaInfo, pozymisArIBanka);
		this.kategorija = kategorija;
	}

	@Override
	public String toString() {
		if (this.getPozymisArIBanka() == true) {
			setAtsiskaitymoTipas("Banko pavedimas.");
		} else if (this.getPozymisArIBanka() == false){
			setAtsiskaitymoTipas("Atsiskaitymas grynais.");
		}
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		return "Data: " + dtf.format(this.getDataIrLaikas()) + "\nID#: " + this.getId() + "\nSuma: " + this.getSuma()
				+ "\nKategorija: " + this.getKategorija()+"\nAtsiskaitymo tipas: " + this.getAtsiskaitymoTipas()+"\nPapildoma informacija: " + this.getPapildomaInfo();
	}

	

	public String getAtsiskaitymoTipas() {
		return atsiskaitymoTipas;
	}

	public void setAtsiskaitymoTipas(String atsiskaitymoTipas) {
		this.atsiskaitymoTipas = atsiskaitymoTipas;
	}

	public String getKategorija() {
		return kategorija;
	}

	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}
//	suma
//	data
//	kategorija
//	pozymis Ar I Banka
//	papildoma Info

//	public PajamuIrasas(float pajamuSuma, String kategorija, Boolean pozymisArIBanka,
//			String papildomaInfo) {
//		super();
//		this.pajamuSuma = pajamuSuma;
//		this.kategorija = kategorija;
//		this.pozymisArIBanka = pozymisArIBanka;
//		this.papildomaInfo = papildomaInfo;
//		++counter;
//		this.id = counter;
//		this.pajamuDataIrLaikas=getTime();
//	}

}