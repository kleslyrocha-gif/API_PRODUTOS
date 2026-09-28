package br.edu.ifpi.api_produtos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    @GetMapping("/produtos")
    public List<Produto> listar() {

        return List.of(
                new Produto(1L, "Mouse", "Informática", 80.0),
                new Produto(2L, "Teclado", "Informática", 120.0),
                new Produto(3L, "Monitor", "Informática", 900.0)
        );
    }

    @GetMapping("/produtos/{id}")
    public Produto buscar(@PathVariable Long id) {

        return new Produto(
                id,
                "Produto " + id,
                "Informática",
                100.0
        );
    }

    @GetMapping("/produtos/{id}/descricao")
    public String descricao(@PathVariable Long id) {

        return "Consultando informações do produto " + id;
    }
}