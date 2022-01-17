public class Despesa implements MovimentacaoFinanceira{
    
    private int tipoDespesaId;
    private Currency valor;
    private LocalDate data;

    public int getTipoDespesaId() {
        return tipoDespesaId;
    }

    public void setTipoDespesaId(int tipoDespesaId) {
        this.tipoDespesaId = tipoDespesaId;
    }

    @Override
    public Currency getValor() {
        return valor;
    }
