package com.six.cent.dix.neuf.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.six.cent.dix.neuf.app.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
}
