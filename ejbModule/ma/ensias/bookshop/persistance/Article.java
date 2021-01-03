package ma.ensias.bookshop.persistance;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Article
 *
 */
@Entity
public class Article implements Serializable {

	@Id @GeneratedValue
	private int numeroArticle;
	private int libelle;
	private float prix;
	private static final long serialVersionUID = 1L;

	public Article() {
	}
	
	public Article(int numeroArticle, int libelle, float prix) {
		super();
		this.numeroArticle = numeroArticle;
		this.libelle = libelle;
		this.prix = prix;
	}
	public Article( int libelle, float prix) {
		super();
		
		this.libelle = libelle;
		this.prix = prix;
	}
	public int getNumeroArticle() {
		return this.numeroArticle;
	}

	public void setNumeroArticle(int numeroArticle) {
		this.numeroArticle = numeroArticle;
	}   
	public int getLibelle() {
		return this.libelle;
	}

	public void setLibelle(int libelle) {
		this.libelle = libelle;
	}   
	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
   
}
