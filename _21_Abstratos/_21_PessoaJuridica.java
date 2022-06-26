package JavaCompleto.Exercicios._21_Abstratos;

public class _21_PessoaJuridica extends _21_Pessoa{

  private int numeroFuncionarios;

  public _21_PessoaJuridica(){}

  public int getNumeroFuncionarios() {
    return numeroFuncionarios;
  }

  public void setNumeroFuncionarios(int numeroFuncionarios) {
    this.numeroFuncionarios = numeroFuncionarios;
  }

  @Override
  public Double pagarImposto() {
    if(numeroFuncionarios < 10) {
      return (super.getRendaAnual() * 0.16);
    } else {
      return (super.getRendaAnual() * 0.14);
    }
  }
}
