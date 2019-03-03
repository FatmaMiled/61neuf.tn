package com.six.cent.dix.neuf.app.model;

import javax.persistence.*;

@Entity
@Table(name = "sous_categories")
public class SousCategorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sous_categorie")
    private Long id;

    private String nom_sous_categorie;
    
    @ManyToOne
    @JoinColumn
    private Categorie categorie;

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public String getNom_sous_categorie() {
		return nom_sous_categorie;
	}

	public void setNom_sous_categorie(String nom_sous_categorie) {
		this.nom_sous_categorie = nom_sous_categorie;
	}
}
