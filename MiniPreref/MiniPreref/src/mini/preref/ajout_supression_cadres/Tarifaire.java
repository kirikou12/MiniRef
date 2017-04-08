package mini.preref.ajout_supression_cadres;

import java.io.Serializable;
import java.util.Date;

public class Tarifaire implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private double prix;
	private Date dateDebut;
	private Date dateFin;
	
	
	public Tarifaire(){
		
	}
	
	
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
