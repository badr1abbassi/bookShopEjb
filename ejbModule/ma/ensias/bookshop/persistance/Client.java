package ma.ensias.bookshop.persistance;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{
	@Id @GeneratedValue
	private int identifiant;
	private String nom;
	private String prenom;
	private String motDePasse;
	@OneToMany
	private List<Commande> commandes;
	
	public Client() {
	}
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommande(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
}
