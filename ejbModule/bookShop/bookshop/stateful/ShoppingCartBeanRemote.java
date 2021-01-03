package bookShop.bookshop.stateful;

import java.util.List;

import javax.ejb.Remote;

import ma.ensias.bookshop.persistance.Commande;
import ma.ensias.bookshop.persistance.LigneDeCommande;

@Remote
public interface ShoppingCartBeanRemote {
	public List<Commande> getCommandes();
	public Commande getCommande(int id);
	public void addLigneCommande(LigneDeCommande ligneDeCommande);
	public void removeLigneCommande(int numeroArticle);
	public void validerAchat(Commande commande);
}
