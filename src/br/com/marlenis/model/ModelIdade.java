package br.com.marlenis.model;

/**
 *
 * @author lukas
 */
public class ModelIdade {

    private int anoAtual;
    private int anoNascimento;

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public double getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getIdade() {
        return anoAtual-anoNascimento;
    }
}
