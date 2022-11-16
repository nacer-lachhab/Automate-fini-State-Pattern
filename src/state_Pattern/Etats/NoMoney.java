package state_Pattern.Etats;

import state_Pattern.Systeme.Guichet;

public class NoMoney implements IEtat {

	@Override
	public void insertCard(Guichet sg) {
		System.out.println("impossible de reinserer la carte");
	}

	
	
	@Override
	public void ejectCard(Guichet sg) {
		// TODO Auto-generated method stub
		sg.setEtatCourant(sg.getEtat1());
		System.out.println("pas d'argent");
		System.out.println("ejecter la carte");
		System.out.println("retour a letat 1");
	}

	@Override
	public void enterPin(Guichet sg) {
		// TODO Auto-generated method stub
		System.out.println("code deja saisie");
	}

	@Override
	public void retreave(Guichet sg) {
		System.out.println("pas d'argent suffisante dans guichet");
		sg.setEtatCourant(sg.getEtat1());
	}

}
