package org.sid.eboutique.entities.dao;

import java.util.List;

import org.sid.eboutique.entities.*;

public interface IBoutiqueDAO {
	
	public Long ajouterCategorie(Categorie c);
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
	public void supprimerCategorie(Long idCat);
	public void modifierCategorie(Categorie c);
	
	public Long ajouterProduit(Produit p, Long idCat);
	public List<Produit> listProduit();
	public List<Produit> produitParMotCle(String mc);
	public List<Produit> produitParCategorie(Long idCa);
	public List<Produit> produitSelectionnes();
	public Produit getProduit(Long idP);
	public void supprimerProduit(Long idP);
	public void modifierProduit(Produit p);
	
	public void ajouterUser(User u);
	public void attribuerRole(Role r, Long userID);
	public Commande enregistrerCommande(Panier p, Client c);	
	

}
