package com.ipi.jva350;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.ipi.jva350.model.Entreprise;

public class proportionPondereeDuMoisTest {
    @Test
    public void proportionPondereeDuMois() {
        // Given
        Entreprise entreprise = new Entreprise();

        // When
        double res = entreprise.proportionPondereeDuMois(LocalDate.of(2024, 2, 23));
        System.out.println(res);
        // Then
        assertEquals(0.8,res);
    }
}
