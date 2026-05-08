public class Cliente {

    private String nome;
    private String cpf;
    private String senha;

    public Cliente(String nome, String cpf, String senha) {

        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public boolean autenticar(String senha) {

        return this.senha.equals(senha);
    }

    public String getNome() {

        return nome;
    }

    public String getCpf() {

        return cpf;
    }
}
