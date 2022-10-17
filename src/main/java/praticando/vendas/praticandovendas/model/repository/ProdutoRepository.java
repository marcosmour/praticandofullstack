package praticando.vendas.praticandovendas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import praticando.vendas.praticandovendas.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
