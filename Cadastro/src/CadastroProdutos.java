import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> produtos;

    public CadastroProdutos() {
        produtos = new ArrayList<>();
    }

    // Método para adicionar um produto à lista de produtos
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para listar todos os produtos cadastrados
    public void listarProdutos() {
        for (Produto produto : produtos) {
            produto.mostrarDetalhes();
            System.out.println();
        }
    }

    // Método para buscar um produto pelo ID
    public Produto buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null; // Retorna null se o produto não for encontrado
    }

    // Método para atualizar o nome e o preço de um produto pelo ID
    public boolean atualizarProduto(int id, String novoNome, double novoPreco) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setNome(novoNome);
                produto.setPreco(novoPreco);
                return true; // Retorna true se a atualização for bem-sucedida
            }
        }
        return false; // Retorna false se o produto não for encontrado
    }
}
