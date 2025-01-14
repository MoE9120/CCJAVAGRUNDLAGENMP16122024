package oop_thema1_bank;

public class Kunde {

	private String kundenID;

	private String name;

	private String adresse;

	// Konstruktor
	public Kunde(String kundenID, String name, String adresse) {
		this.kundenID = kundenID;
		this.name = name;
		this.adresse = adresse;
	}

	// Getter und Setter
	public String getKundenID() {
		return kundenID;
	}

	public void setKundenID(String kundenID) {
		this.kundenID = kundenID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "KundenID: " + kundenID + ", Name: " + name + ", Adresse: " + adresse;
	}
}
