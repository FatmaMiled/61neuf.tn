package com.six.cent.dix.neuf.app.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categorie")
    private Long id;

    private String nom_categorie;
   
    @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
    private Set<SousCategorie> sous_categories;
    
    @OneToMany(mappedBy = "categorie")
    private Set<SousCategorie> produits;
    
    public Set<SousCategorie> getProduits() {
		return produits;
	}

	public void setProduits(Set<SousCategorie> produits) {
		this.produits = produits;
	}

	public Set<SousCategorie> getSous_categories() {
		return sous_categories;
	}

	public void setSous_categories(Set<SousCategorie> sous_categories) {
		this.sous_categories = sous_categories;
	}


	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public String getNom_categorie() {
		return nom_categorie;
	}

	public void setNom_categorie(String nom_sous_categorie) {
		this.nom_categorie = nom_sous_categorie;
	}
}
