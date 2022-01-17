public class Conta {
    
    private Currency saldo;
    private String titular;
    private String codigo;
    private List<MovimentacaoFinanceira> movimentacoes;

    public Currency getSaldo() {
        return saldo;
    }

    public void setSaldo(Currency saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<MovimentacaoFinanceira> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<MovimentacaoFinanceira> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }
    
}
