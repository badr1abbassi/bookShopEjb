package ma.ensias.bookshop.persistance;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class LigneDeCommande implements Serializable {
	@Id @GeneratedValue
	private int id;
	private int quantite;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Article article;
	
	
	public LigneDeCommande() {
	
	}
	
	public LigneDeCommande( int quantite) {
		super();
		this.quantite = quantite;
	}

	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
}
