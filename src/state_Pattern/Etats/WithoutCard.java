package state_Pattern.Etats;

import state_Pattern.Systeme.Guichet;

public class WithoutCard implements IEtat{

	@Override
	public void insertCard(Guichet sg) {
		// TODO Auto-generated method stub
		System.out.println("saisie de carte");
		sg.setEtatCourant(sg.getEtat2());
		System.out.println("de l'etat 1, passage a l'etat 2");
	}

	@Override
	public void ejectCard(Guichet sg) {
		// TODO Auto-generated method stub
		System.out.println("pas de carte a ejecter");
	}

	@Override
	public void enterPin(Guichet sg) {
		// TODO Auto-generated method stub
		System.out.println("pas de carte, pas le droit");
	}

	@Override
	public void retreave(Guichet sg) {
		// TODO Auto-generated method stub
		System.out.println("pas encore le droit de recuperer l'argent la carte");
	}

}
