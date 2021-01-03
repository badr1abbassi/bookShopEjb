package ma.ensias.bookshop.persistance;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Commande implements Serializable{
	@Id @GeneratedValue
	private int numeroCommande;
	@OneToMany
	private List<LigneDeCommande> ligneCommandes;

	public Commande() {
		ligneCommandes=new ArrayList<LigneDeCommande>();
	}
	public void AddLigneCommande(LigneDeCommande lc) {
		ligneCommandes.add(lc);
	}

	public List<LigneDeCommande> getLigneCommande() {
		return ligneCommandes;
	}

	public void setLigneCommande(List<LigneDeCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	public int getNumeroCommande() {
		return numeroCommande;
	}

	public void setNumeroCommande(int numeroCommande) {
		this.numeroCommande = numeroCommande;
	}

}
