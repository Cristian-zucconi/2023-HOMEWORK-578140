package it.uniroma3.diadia.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

public class PartitaTest {

	@Test
	public void testGetStanzaVincente() {
		Partita partita = new Partita();
		String prova = partita.getStanzaVincente().getNome();
		
		assertEquals("Biblioteca",prova);
	}

	@Test
	public void testVinta() {
		Partita partita = new Partita();
		Stanza vinc = partita.getStanzaVincente();
		Stanza corr = partita.getStanzaCorrente();
		assertEquals(false,vinc.equals(corr));
	}

	@Test
	public void testIsFinita() {
		Partita partita = new Partita();
		Stanza vinc = partita.getStanzaVincente();
		Stanza corr = partita.getStanzaCorrente();
		assertEquals(false,vinc.equals(corr) || partita.isFinita());
	
	} 

}