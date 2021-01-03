package bookShop.bookshop.stateful;

import java.util.List;

import javax.ejb.Local;

import ma.ensias.bookshop.persistance.Article;
import ma.ensias.bookshop.persistance.Commande;
import ma.ensias.bookshop.persistance.LigneDeCommande;

@Local
public interface ShoppingCartBeanLocal {
	public List<Commande> getCommandes();
	public Commande getCommande(int id);	
	public void addLigneCommande(LigneDeCommande ligneDeCommande);
	public void removeLigneCommande(int numeroArticle);
	public List<Article> getAllArticlesInShoppingCart();
	public void validerAchat( Commande commande);
}
