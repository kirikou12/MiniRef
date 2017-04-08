package mini.preref.login;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import mini.preref.ajout_supression_cadres.Tarifaire;

public class LoginAction extends ActionSupport implements  ModelDriven<Tarifaire>{


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
