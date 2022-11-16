package state_Pattern;

import java.util.Scanner;

import state_Pattern.Systeme.Guichet;

public class Demo {

	public static void main(String[] args) {
		System.out.println("precisez le montant dispo dans le guichet: ");
		Scanner sc = new Scanner(System.in);
		Guichet sg = new Guichet(sc.nextInt());
		System.out.println("le montant que l'utilisateur suposé veux retirer:");
		sg.setMontantUser(sc.nextInt());
		System.out.println("****"+sg.getMontantUser()+"****");
		System.out.println("****"+sg.getMontant()+"****");
		sg.insertCard();
		sg.insertCard();
//		sg.ejectCard();
		sg.enterPin();
		sg.retreave();
	}

}