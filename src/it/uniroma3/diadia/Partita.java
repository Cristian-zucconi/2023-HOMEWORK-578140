package it.uniroma3.diadia;


import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;


/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {

	static final private int CFU_INIZIALI = 20;

	
	private boolean finita;
	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
//	private Giocatore giocatore;
	//private int cfu;
	Labirinto lab = new Labirinto();
	Giocatore giocatore = new Giocatore();
	
	public Partita(){
		lab.creaStanze();
		this.stanzaCorrente = lab.entrata;
		this.stanzaVincente = lab.uscita;
		this.finita = false;
		giocatore.setCfu(CFU_INIZIALI);

	}

    /**
     * Crea tutte le stanze e le porte di collegamento
     */

	public Stanza getStanzaVincente() {
		return stanzaVincente;
	}

	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}

	public Stanza getStanzaCorrente() {
		return this.stanzaCorrente;
	}
	
	public Giocatore getGiocatore() {
		return giocatore;
	}
	
    
	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return getStanzaCorrente() == getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (giocatore.getCfu() == 0);

	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}

}