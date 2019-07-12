import java.time.LocalDateTime;

public class Irasas {
	
	private float suma;
	private LocalDateTime dataIrLaikas;
	private String papildomaInfo;
	private static int counter = 0;
	private int id = 0;
	private Boolean pozymisArIBanka;

	
	
	public Irasas(float suma, String papildomaInfo, 
			Boolean pozymisArIBanka) {
		super();
		this.suma = suma;
		this.dataIrLaikas = LocalDateTime.now();
		this.papildomaInfo = papildomaInfo;
		++counter;
		this.id = counter;
		this.pozymisArIBanka = pozymisArIBanka;

	}
	
	
	public float getSuma() {
		return suma;
	}
	public void setSuma(float suma) {
		this.suma = suma;
	}
	public LocalDateTime getDataIrLaikas() {
		return dataIrLaikas;
	}
	public void setDataIrLaikas(LocalDateTime dataIrLaikas) {
		this.dataIrLaikas = dataIrLaikas;
	}
	public String getPapildomaInfo() {
		return papildomaInfo;
	}
	public void setPapildomaInfo(String papildomaInfo) {
		this.papildomaInfo = papildomaInfo;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Irasas.counter = counter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Boolean getPozymisArIBanka() {
		return pozymisArIBanka;
	}
	public void setPozymisArIBanka(Boolean pozymisArIBanka) {
		this.pozymisArIBanka = pozymisArIBanka;
	}
	
	
	
}
