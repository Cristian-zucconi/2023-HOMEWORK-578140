package it.uniroma3.diadia.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {

		
		Partita p = new Partita();
		Stanza s1 = new Stanza("Stanza1");
		Stanza s2 = new Stanza("Stanza2");
		Labirinto l = new Labirinto();
		Attrezzo a = new Attrezzo("osso", 4);

		@Test
		public void testGetStanzaAdiacente() {
			assertNull(s1.getStanzaAdiacente("nord"));
		}
		
		@Test
		public void testImpostaStanzaAdiacente() {
			s1.impostaStanzaAdiacente("nord", s2);
			assertEquals(s2, s1.getStanzaAdiacente("nord"));
		}

		@Test
		public void testAddAttrezzo() {
			s1.addAttrezzo(a);
			assertEquals(a, s1.getAttrezzo("osso"));
		}

	}
	
