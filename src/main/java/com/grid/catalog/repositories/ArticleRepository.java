package com.grid.catalog.repositories;

import com.grid.catalog.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {

    Optional<Article> findByUniqId(String uniq_id);

    List<Article> findBySku(String sku);

}
