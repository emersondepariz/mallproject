public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Shopping{" +
                "nome=" + nome +
                "endereco" + endereco +
                "lojas" + lojas +
                '}';
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidade = 0;
        for (Loja loja : lojas) {
            if (loja.getClass().getSimpleName().equalsIgnoreCase(StringUtils.removerAcentuacao(tipoLoja))) {
                quantidade++;
            }
        }

        // Condicão ternária
        return quantidade > 0 ? quantidade : -1;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null; // Qual a loja com o produto mais caro
        double maiorValorSeguro = 0.0; // qual o valor do produto mais caro
        for (Loja loja : lojas) {
            if (loja.getClass().getSimpleName().equals("Informatica")) {
                // Cast, parse = Conversao
                Informatica lojaInformatica = (Informatica) loja;
                double valorSeguro = lojaInformatica.getSeguroEletronicos();
                if (valorSeguro > maiorValorSeguro) {
                    maiorValorSeguro = valorSeguro;
                    lojaMaisCara = lojaInformatica;
                }
            }
        }
        return lojaMaisCara;
    }

}

// retorna a loja do tipo Informatica que paga omaior valor de seguro de
// eletrônicos do shopping.
