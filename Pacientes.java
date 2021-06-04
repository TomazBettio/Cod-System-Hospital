/**
 * Sistema ficticio que simula um programa para manipular dados de pacientes de um hospital. Sistema apresenta os nomes com maior numero de vogais.
 *
 * @author (Tomaz Bettio e Eduardo Balzan)
 * @version (Oficial - classe construtora)
 */

import java.util.*;
import java.lang.*;

public class Pacientes
{       
  private String nome, fone, convenio, diagnostico;
  private int numConsultasMes;
  private double custo;
  private long cpf;
  
  public Pacientes(String nome, long cpf, String fone, String convenio, String diagnostico, int numConsultasMes, double custo)
  {
    this.nome = nome;
    this.cpf = cpf;
    this.fone = fone;
    this.convenio = convenio;
    this.diagnostico = diagnostico;
    this.numConsultasMes = numConsultasMes;
    this.custo = custo;
  }

  public String toString()
  {
    return "Nome: " + nome + "\n" + "CPF: " + cpf + "\n" + "Telefone: " + fone + "\n" + "Convênio: " + convenio + "\n" + "Diagnóstico: " + diagnostico + "\n" + "Quantidade de consultas no mês: " + numConsultasMes + "\nValor a pagar: " + custo;
  }
  
  //GETTERS
  public String getNome(){return nome;}
  public long getCpf(){return cpf;}
  public String getFone(){return fone;}
  public String getConvenio(){return convenio;}
  public String getDiagnostico(){return diagnostico;}
  public int getNumConsultasMes(){return numConsultasMes;}
  public double getCusto(){return custo;}
  
  //SETTERS
  public void setNome(String nome) { this.nome = nome;}
  public void setCpf(long cpf){this.cpf = cpf;}
  public void setFone(String fone) {this.fone = fone;}
  public void setConvenio(String convenio) { this.convenio = convenio;}
  public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico;}
  public void setNumConsultasMes(int numConsultasMes) { this.numConsultasMes = numConsultasMes;}
  public void setCusto(double custo){this.custo = custo;}
}