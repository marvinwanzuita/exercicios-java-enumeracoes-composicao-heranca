package JavaCompleto.Exercicios._21_Abstratos;

public class _21_PessoaFisica extends _21_Pessoa{

  private Double gastosSaude;

  public _21_PessoaFisica(){}


  public Double getGastosSaude() {
    return gastosSaude;
  }

  public void setGastosSaude(Double gastosSaude) {
    this.gastosSaude = gastosSaude;
  }

  @Override
  public Double pagarImposto() {
    if (super.getRendaAnual() < 20000){
      return (super.getRendaAnual() * 0.15) - (gastosSaude * 0.5);
    } else {
     return (super.getRendaAnual() * 0.25) - (gastosSaude * 0.5);
    }
  }

}
