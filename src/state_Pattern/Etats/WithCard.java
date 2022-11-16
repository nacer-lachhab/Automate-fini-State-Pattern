package state_Pattern.Etats;

import state_Pattern.Systeme.Guichet;

public class WithCard implements IEtat {

	@Override
	public void insertCard(Guichet sg) {
		// TODO Auto-generated method stub
		System.out.println("impossible de reinserer la carte");
	}

	@Override
	public void ejectCard(Guichet sg) {
		System.out.println("ejecter la carte");
		sg.setEtatCourant(sg.getEtat1());
		System.out.println("passage de l etat 2 a l etat 1");
	}

	@Override
	public void enterPin(Guichet sg) {
		// TODO Auto-generated method stub
		System.out.println("pin saisie");
		sg.setEtatCourant(sg.getEtat3());
		System.out.println("de letat 2, passer a l'etat 3");
	}

	@Override
	public void retreave(Guichet sg) {
		// TODO Auto-generated method stub
		System.out.println("pas droit de recurer l'argent, code pas saisie !!!!");
	}

}
