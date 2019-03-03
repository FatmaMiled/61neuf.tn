package com.six.cent.dix.neuf.app.model;

import javax.persistence.*;

@Entity
@Table(name = "details_produits")
public class DetailsProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_details_produit")
    private Long id;
    
    private Boolean est_nouvelle_collection;
    
    private Boolean est_solde;

    private Boolean est_offre_speciale;
    
    private int poucentage_solde;
    
    private double prix;
    
	private int nombre_articles_disponibles;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Produit produit;

    
    public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Boolean getEst_nouvelle_collection() {
		return est_nouvelle_collection;
	}

	public void setEst_nouvelle_collection(Boolean est_nouvelle_collection) {
		this.est_nouvelle_collection = est_nouvelle_collection;
	}

	public Boolean getEst_solde() {
		return est_solde;
	}

	public void setEst_solde(Boolean est_solde) {
		this.est_solde = est_solde;
	}

	public Boolean getEst_offre_speciale() {
		return est_offre_speciale;
	}

	public void setEst_offre_speciale(Boolean est_offre_speciale) {
		this.est_offre_speciale = est_offre_speciale;
	}

	public int getPoucentage_solde() {
		return poucentage_solde;
	}

	public void setPoucentage_solde(int poucentage_solde) {
		this.poucentage_solde = poucentage_solde;
	}

	public int getNombre_articles_disponibles() {
		return nombre_articles_disponibles;
	}

	public void setNombre_articles_disponibles(int nombre_articles_disponibles) {
		this.nombre_articles_disponibles = nombre_articles_disponibles;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}
