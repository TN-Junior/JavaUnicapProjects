public class Produto {
    private static int proximoId = 1; // Variável estática para controlar o próximo ID a ser atribuído
    private int id;
    private String nome;
    private double preco;

    // Construtor com id, nome e preço
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        atualizarProximoId(id); // Atualiza o próximo ID com base no ID fornecido
    }

    // Construtor com nome e preço (gera id automaticamente)
    public Produto(String nome, double preco) {
        this.id = gerarIdAutomatico();
        this.nome = nome;
        this.preco = preco;
    }

    // Método para mostrar os detalhes do produto
    public void mostrarDetalhes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }

    // Método privado para gerar o ID automaticamente
    private int gerarIdAutomatico() {
        int novoId = proximoId;
        atualizarProximoId(novoId);
        return novoId;
    }

    // Método privado para atualizar o próximo ID
    private static void atualizarProximoId(int novoId) {
        proximoId = Math.max(novoId + 1, proximoId);
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
