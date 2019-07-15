import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IslaiduIrasas extends Irasas{
	
	


	private String kategorija;
	private String atsiskaitymoTipas = "";
	public IslaiduIrasas(float suma, Boolean pozymisArIBanka, String papildomaInfo, LocalDateTime dataIrLaikas) {
		super(suma, papildomaInfo, pozymisArIBanka, dataIrLaikas);
		// TODO Auto-generated constructor stub
		this.kategorija = "Islaidos";
	}
	@Override
	public String toString() {
		if (this.getPozymisArIBanka() == true) {
			setAtsiskaitymoTipas("Banko pavedimas.");
		} else if (this.getPozymisArIBanka() == false){
			setAtsiskaitymoTipas("Atsiskaitymas grynais.");
		}
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
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
//	data Su Laiku 
//	kategorija
//	atsiskaitymo Budas
//	papildoma Info
	
	
	


	
	
	
//	public String atsiskaitymas(){
//		if (pozymisArIBanka==true) {
//			atsiskaitymoTipas = "Banko pavedimas.";
//		} else {
//			atsiskaitymoTipas = "Atsiskaitymas grynais.";
//		} return atsiskaitymoTipas;
//	}
	
	
	
	
	
	
}
