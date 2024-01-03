//Metodo começa em minusculo
//Classe começa com maiusculo
public class Cliente {
    
    private int codigo;
    private String nome;
    private String endereco;

    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereco;
    }
    public void setEndereço(String endereco) {
        this.endereco = endereco;
    }
    public void cadastrarEndereco(String endereco){
        setEndereço(endereco);
    }
}