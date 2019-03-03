package com.six.cent.dix.neuf.app.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "produits")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produit")
    private Long id;

    private String nom_produit;
    
    private String description;
    
    @ManyToMany
    private Set<User> users;
    
    @OneToOne(mappedBy = "produit")
    private DetailsProduit detail_produit;
    
    public DetailsProduit getDetail_produit() {
		return detail_produit;
	}

	public void setDetail_produit(DetailsProduit detail_produit) {
		this.detail_produit = detail_produit;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@ManyToOne
    @JoinColumn
    private Categorie categorie;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}

	public int getNombre_articles_disponibles() {
		return nombre_articles_disponibles;
	}

	public void setNombre_articles_disponibles(int nombre_articles_disponibles) {
		this.nombre_articles_disponibles = nombre_articles_disponibles;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private int nombre_articles_disponibles;
}
