package JavaCompleto.Exercicios._21_Abstratos;

public abstract class _21_Pessoa {

  private String nomePessoa;
  private Double rendaAnual;


  public String getNomePessoa() {
    return nomePessoa;
  }

  public void setNomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
  }

  public Double getRendaAnual() {
    return rendaAnual;
  }

  public void setRendaAnual(Double rendaAnual) {
    this.rendaAnual = rendaAnual;
  }

  public abstract Double pagarImposto();

}
