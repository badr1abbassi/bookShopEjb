package bookShop.bookshop.stateful;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.ensias.bookshop.persistance.Article;
import ma.ensias.bookshop.persistance.Commande;
import ma.ensias.bookshop.persistance.LigneDeCommande;

@Stateful
@LocalBean
public class ShoppingCartBean implements ShoppingCartBeanRemote, ShoppingCartBeanLocal {

	
	@PersistenceContext(unitName = "bookShopUnit")
	protected EntityManager em;
	Commande commande;
	
	public ShoppingCartBean() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void initialize() {
		commande = new Commande();
	}

	@Override
	public Commande getCommande(int id) {
		return em.find(Commande.class, id);
	}

	@Override
	public void addLigneCommande(LigneDeCommande ligneDeCommande) {
		em.persist(ligneDeCommande);
	}

	@Override
	public void removeLigneCommande(int id) {
		em.createQuery("delete from lignedecommande ld where ld.id=:id").setParameter("id", id).executeUpdate();
	}

	@Override
	public List<Article> getAllArticlesInShoppingCart() {
		List<Article> listArticles=new ArrayList<Article>();
		listArticles.add(new Article(11, 11, 110));
		listArticles.add(new Article(2, 2, 120));
		listArticles.add(new Article(3, 3, 130));
		listArticles.add(new Article(110, 110, 1100));
		listArticles.add(new Article(120, 120, 1200));
		listArticles.add(new Article(130, 130, 1300));
		return listArticles;
		
	}

	@Override
	public void validerAchat(Commande commande) {
		em.persist(commande);		
	}

	@Override
	public List<Commande> getCommandes() {
		Query req=em.createQuery("select c from Commande c");
		return req.getResultList();
	}

}
