package praticando.vendas.praticandovendas.rest.produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import praticando.vendas.praticandovendas.model.Produto;
import praticando.vendas.praticandovendas.model.repository.ProdutoRepository;

@RestController
@RequestMapping("api/produtos")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;

	@PostMapping
	public ProdutoFormRequest salvar(@RequestBody ProdutoFormRequest produto) {
		
		Produto entidadeProduto = produto.toModel();
		repository.save(entidadeProduto);
		return ProdutoFormRequest.fromModel(entidadeProduto);
	}
}
