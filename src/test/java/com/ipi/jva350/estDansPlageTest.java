package com.ipi.jva350;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ipi.jva350.model.Entreprise;

public class estDansPlageTest {
	@Test
	public void estDansPlage() {
		Entreprise entreprise = new Entreprise();
		boolean res = entreprise.estDansPlage(LocalDate.of(2024, 3, 2), LocalDate.of(2024, 1, 1), LocalDate.of(2025, 1, 1));
		assertEquals(true,res);
	}
}
