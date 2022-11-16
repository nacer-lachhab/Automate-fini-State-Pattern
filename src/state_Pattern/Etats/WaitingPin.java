package state_Pattern.Etats;

import state_Pattern.Systeme.Guichet;

public class WaitingPin implements IEtat {

	@Override
	public void insertCard(Guichet sg) {
		// TODO Auto-generated method stub
		System.out.println("impossible de reinserer la carte");
	}

	@Override
	public void ejectCard(Guichet sg) {
		System.out.println("ejecter la carte");
		sg.setEtatCourant(sg.getEtat1());
		System.out.println("passage de l etat 3 a l etat 1");
	}

	@Override
	public void enterPin(Guichet sg) {
		// TODO Auto-generated method stub
		System.out.println("code saisit");
		retreave(sg);
	}

	@Override
	public void retreave(Guichet sg) {
		// TODO Auto-generated method stub
		if(sg.getMontantUser()<=sg.getMontant()) {
			sg.setEtatCourant(sg.getEtat1());
			System.out.println("retrait d'argent et ejection de carte");
		}else {
			sg.setEtatCourant(sg.getEtat4());
		}
	}

}
