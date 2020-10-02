package stepDenitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdresseStepDefintion {
	@Given("^un abonné avec une adresse principale \"([^\"]*)\" en France$")
	public void unAbonneAvecUneAdressePrincipaleEnFrance(String arg1) throws Throwable {
		System.out.println("hello");
	}

	@When("^le conseiller connecté à \"([^\"]*)\" modifie l'adresse de l'abonné$")
	public void leConseillerConnecteAModifieLadresseDeLabonne(String arg1) throws Throwable {
	}

	@Then("^l'adresse de l'abonné modifiée est enregistrée sur l'ensemble des contrats de l'abonné$")
	public void ladresseDeLabonneModifieeEstEnregistreeSurLensembleDesContratsDeLabonne() throws Throwable {
	}

	@Then("^un mouvement de modification d'adresse est crée$")
	public void unMouvementDeModificationDadresseEstCree() throws Throwable {
	}

}
