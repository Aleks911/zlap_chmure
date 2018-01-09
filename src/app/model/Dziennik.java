package app.model;

public class Dziennik {
	
	
	private int id;
	private String nazwa;
	private String poczatek;
	private String koniec;
	private String deszcz;
	private String grad;
	private String wyladowania;
	private int predkosc_wiatru;
	private int intensywnosc;
	
	public Dziennik() {
	}

	public Dziennik(int id, String nazwa, String poczatek, String koniec, String deszcz, String grad,
			String wyladowania, int predkosc_wiatru, int intensywnosc) {
		this.id = id;
		this.nazwa = nazwa;
		this.poczatek = poczatek;
		this.koniec = koniec;
		this.deszcz = deszcz;
		this.grad = grad;
		this.wyladowania = wyladowania;
		this.predkosc_wiatru = predkosc_wiatru;
		this.intensywnosc = intensywnosc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getPoczatek() {
		return poczatek;
	}

	public void setPoczatek(String poczatek) {
		this.poczatek = poczatek;
	}

	public String getKoniec() {
		return koniec;
	}

	public void setKoniec(String koniec) {
		this.koniec = koniec;
	}

	public String getDeszcz() {
		return deszcz;
	}

	public void setDeszcz(String deszcz) {
		this.deszcz = deszcz;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getWyladowania() {
		return wyladowania;
	}

	public void setWyladowania(String wyladowania) {
		this.wyladowania = wyladowania;
	}

	public int getPredkosc_wiatru() {
		return predkosc_wiatru;
	}

	public void setPredkosc_wiatru(int predkosc_wiatru) {
		this.predkosc_wiatru = predkosc_wiatru;
	}

	public int getIntensywnosc() {
		return intensywnosc;
	}

	public void setIntensywnosc(int intensywnosc) {
		this.intensywnosc = intensywnosc;
	}

	
	

}
