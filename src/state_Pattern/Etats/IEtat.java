package state_Pattern.Etats;

import state_Pattern.Systeme.Guichet;

public interface IEtat {

	void insertCard(Guichet sg);
	void ejectCard(Guichet sg);
	void enterPin(Guichet sg);
	void retreave(Guichet sg);
}
