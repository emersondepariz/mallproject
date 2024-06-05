public class Loja {
    // (visibilidade tipo etiqueta) = atributo
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        //primeiro método construtor
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    // TODO: e se converter os argumentos?
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        //segundo método construtor, usando uma categoria do polimorfismo chamado sobrecarga.
        this(nome, quantidadeFuncionarios, -1, endereco, dataFundacao);
    }

    public String getNome() {
        // getter
        return nome;
    }

    public void setNome(String nome) {
        // setter
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco () {
        return endereco; 
    }

    public void setEndereco (Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao () {
        return dataFundacao;
    }

    public void setDataFundacao (Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", endereco=" + endereco + 
                ", dataFundacao=" + dataFundacao +
                '}';
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
}