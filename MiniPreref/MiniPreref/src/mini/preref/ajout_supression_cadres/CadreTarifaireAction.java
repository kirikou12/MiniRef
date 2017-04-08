package mini.preref.ajout_supression_cadres;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CadreTarifaireAction extends ActionSupport implements  ModelDriven<Tarifaire>{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	Tarifaire tarif = new Tarifaire();

	@Override
	public String execute() throws Exception {
		System.out.print("test");
		return "success";
	}

	@Override
	public Tarifaire getModel() {
		return tarif;
	}

}
