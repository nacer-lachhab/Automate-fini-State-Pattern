package state_Pattern.Systeme;

import state_Pattern.Etats.IEtat;
import state_Pattern.Etats.NoMoney;
import state_Pattern.Etats.WaitingPin;
import state_Pattern.Etats.WithCard;
import state_Pattern.Etats.WithoutCard;

public class Guichet {
	
	int montant;
	int montantUser;
	
	private IEtat etatCourant;
	private IEtat etat1;
	private IEtat etat2;
	private IEtat etat3;
	private IEtat etat4;

	public Guichet(int montant) {
		
		this.montant = montant;
		etat1 = new WithoutCard();
		etat2 = new WithCard();
		etat3 = new WaitingPin();
		etat4 = new NoMoney();
		etatCourant = etat1;
	}

	public IEtat getEtatCourant() {
		return etatCourant;
	}

	public void setEtatCourant(IEtat etatCourant) {
		this.etatCourant = etatCourant;
	}

	public IEtat getEtat1() {
		return etat1;
	}

	public void setEtat1(IEtat etat1) {
		this.etat1 = etat1;
	}

	public IEtat getEtat2() {
		return etat2;
	}

	public void setEtat2(IEtat etat2) {
		this.etat2 = etat2;
	}

	public IEtat getEtat3() {
		return etat3;
	}

	public void setEtat3(IEtat etat3) {
		this.etat3 = etat3;
	}

	public IEtat getEtat4() {
		return etat4;
	}

	public void setEtat4(IEtat etat4) {
		this.etat4 = etat4;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public int getMontantUser() {
		return montantUser;
	}

	public void setMontantUser(int montantUser) {
		this.montantUser = montantUser;
	}
	
	@Override
	public String toString() {
		return "Guichet [montant=" + montant + ", montantUser=" + montantUser + ", etatCourant=" + etatCourant
				+ ", etat1=" + etat1 + ", etat2=" + etat2 + ", etat3=" + etat3 + ", etat4=" + etat4 + "]";
	}

	public void insertCard() {
		// TODO Auto-generated method stub
		//System.out.println(this.toString());
		etatCourant.insertCard(this);
	}

	
	public void ejectCard() {
		// TODO Auto-generated method stub
		etatCourant.ejectCard(this);
	}

	
	public void enterPin() {
		// TODO Auto-generated method stub
		etatCourant.enterPin(this);
	}

	
	public void retreave() {
		// TODO Auto-generated method stub
		etatCourant.retreave(this);
	}
}
