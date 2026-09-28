package br.edu.ifpi.api_produtos;

public record Produto(
        Long id,
        String nome,
        String categoria,
        Double preco
) {
}