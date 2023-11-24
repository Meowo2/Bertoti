package modelo;

public class Membro {
    
    private String nome;
    private Data dataNascimento;
    private int codigo;

    public Membro(String nome, Data dataNascimento, int codigo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getInformacoes(){
        return "Nome: " + nome + "\n" +
               "Data de Nascimento: " + dataNascimento.formataData() + "\n" +
               "Código de Membro: " + codigo + "\n";
    }
    
}
