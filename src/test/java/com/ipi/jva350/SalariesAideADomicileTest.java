package com.ipi.jva350;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.ipi.jva350.model.SalarieAideADomicile;

public class SalariesAideADomicileTest {
	@Test
	public void testLogaleanDr2() {
		String nom="user1" ;
		LocalDate moisDebutContrat = null;
		LocalDate moisEnCours = null;
		double congesPayesAcquisAnneeN = 10;
		double joursTravaillesAnneeN = 20;
		double joursTravaillesAnneeNMoins1=30;
		double congesPayesAcquisAnneeNMoins1=30;
		double congesPayesPrisAnneeNMoins1=30;
		SalarieAideADomicile monsalaire = new SalarieAideADomicile(nom,moisDebutContrat,moisEnCours,
                joursTravaillesAnneeN,  congesPayesAcquisAnneeN,
                 joursTravaillesAnneeNMoins1, congesPayesAcquisAnneeNMoins1, congesPayesPrisAnneeNMoins1) ;
		boolean res = monsalaire.aLegalementDroitADesCongesPayes();
		assertTrue(res);
	}
	@Test
	public void testaLegalementDroitADesCongesPayesFalse() {
		String nom="user1" ;
		LocalDate moisDebutContrat = null;
		LocalDate moisEnCours = null;
		double congesPayesAcquisAnneeN = 1;
		double joursTravaillesAnneeN = 1;
		double joursTravaillesAnneeNMoins1=3;
		double congesPayesAcquisAnneeNMoins1=3;
		double congesPayesPrisAnneeNMoins1=3;
		SalarieAideADomicile monsalaire = new SalarieAideADomicile(nom,moisDebutContrat,moisEnCours,
                joursTravaillesAnneeN,  congesPayesAcquisAnneeN,
                 joursTravaillesAnneeNMoins1, congesPayesAcquisAnneeNMoins1, congesPayesPrisAnneeNMoins1) ;
		boolean res = monsalaire.aLegalementDroitADesCongesPayes();
		assertTrue(res);
	}
}
