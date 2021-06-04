/**
 * Sistema ficticio que simula um programa para manipular dados de pacientes de um hospital. O sistema também apresenta os nomes com maior numero de vogais.
 *
 * @author (Tomaz Bettio e Eduardo Balzan)
 * @version (Oficial - codigo funcional)
 */

import java.util.*;
import java.lang.*;

public class AppPacientes
{      
  public static int contaVogais(String vogais)//CONTADOR DE VOGAIS
  {
            int contador = vogais.length() - 1;

            int qntVogais = 0;
                    
            while(contador >= 0)
            {
                if(
                vogais.charAt(contador) == 'a'
                || vogais.charAt(contador) == 'e'
                || vogais.charAt(contador) == 'i'
                || vogais.charAt(contador) == 'o'
                || vogais.charAt(contador) == 'u'
                || vogais.charAt(contador) == 'A'
                || vogais.charAt(contador) == 'E'
                || vogais.charAt(contador) == 'I'
                || vogais.charAt(contador) == 'O'
                || vogais.charAt(contador) == 'U'
                )
                {
                        
                  qntVogais += 1;
                        
                }
                        
                contador--;
            }
            
            return qntVogais;
  }
    
  //MÉTODO MAIN
  public static void main(String[] args)
  {   
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    Pacientes um = new Pacientes("Maria", (long) (10000000000l + Math.random() * 99999999999l), "+55 51 9", "Estrela", "Febre", 2, 300);
    Pacientes dois = new Pacientes("Joao", (long) (10000000000l + Math.random() * 99999999999l), "+55 51 9", "Girasaude", "Taquicardia", 3, 450); 
    Pacientes tres = new Pacientes("", 0, "+55 51 9", "", "", 0, 0);
    
    //MENU
    String[] menuO = {
      "1-Buscar dados dos pacientes",
      "2-Alterar dados do paciente",
      "3-Adicionar novos pacientes",
      "4-Nome com mais vogais",
      "5-Sair"
    };
    
    System.out.println("SEJA BEM-VINDO(A) AO SISTEMA DO HOSPITAL BALZAMAZ\n");
    
    System.out.println(menuO[0]);
    System.out.println(menuO[1]);
    System.out.println(menuO[2]);
    System.out.println(menuO[3]);
    System.out.println(menuO[4]);
    
    //SISTEMA FUNCIONAL DO MENU
    for(int i = 0; i < 3; i++)
    {
           System.out.print("\n" + "Opção escolhida: ");
           int opcaoU = input.nextInt();
            
           //CASE DE OPÇÕES
           switch(opcaoU)
           {
              case 1:
                //OPÇÃO 1 //Buscar dados dos pacientes
                    System.out.println(menuO[0]);
                
                    System.out.println("\nEscreva o nome do paciente: ");
                    
                    String cpf1 = String.valueOf(um.getCpf());
                    String cpf2 = String.valueOf(dois.getCpf());
                    String fone1 = cpf1.substring(0, 8);
                    String fone2 = cpf2.substring(3, 11);
                    um.setFone("+55 51 9" + fone1);
                    dois.setFone("+55 51 9" + fone2);
                    
                    String nomePaciente1 = input.next();
                            
                    if(nomePaciente1.equalsIgnoreCase(um.getNome()))
                    {
                       System.out.println(um);
                       System.out.println("\nEscolha uma opção novamente: ");
                    }
                    else if(nomePaciente1.equalsIgnoreCase(dois.getNome()))
                    {
                       System.out.println(dois);
                       System.out.println("\nEscolha uma opção novamente: ");
                    }
                    else if(nomePaciente1.equalsIgnoreCase(tres.getNome()))
                    {
                        System.out.println(tres);
                        System.out.println("\nEscolha uma opção novamente: ");
                    }
                    else
                    {  
                        System.out.println("Paciente não encontrado");
                        System.out.println("\nReniciando");
                        System.out.println("\nEscolha uma opção novamente: ");
                    }
              break;
                    
              case 2:
                 //OPÇÃO 2 //2-Alterar dados do paciente
                     System.out.println(menuO[1]);
                     System.out.println("Nome do paciente a ser alterado: ");
                     
                     String[] dados = {
                         "1- Nome",
                         "2- CPF",
                         "3- Telefone",
                         "4- Convênio",
                         "5- Diagnóstico",
                         "6- Quantidade de consultas realizadas",
                     };
                     
                     String nomePaciente2 = input.next();
                     
                    if(nomePaciente2.equalsIgnoreCase(um.getNome()))
                    {
                       System.out.println("Tipo de dado a ser alterado: ");
                       
                       System.out.println(dados[0]);
                       System.out.println(dados[1]);
                       System.out.println(dados[2]);
                       System.out.println(dados[3]);
                       System.out.println(dados[4]);
                       System.out.println(dados[5]);
                       
                       int tipoDeDado = input.nextInt();
                        switch(tipoDeDado)
                        {
                            case 1:
                                 //NOME
                                 System.out.println("Insira o novo nome: ");
                                 String nomeNovo = input.nextLine();
                                 um.setNome(nomeNovo);
                                 System.out.println("Alterado com sucesso!");
                                 System.out.println(um);
                            break;
                            
                            case 2:
                                //CPF
                                 System.out.println("Insira o novo CPF: ");
                                 long cpfNovo = input.nextLong();
                                 um.setCpf(cpfNovo);
                                 System.out.println("Alterado com sucesso!");
                                 System.out.println(um);
                            break;
                            
                            case 3:
                                //TELEFONE
                                System.out.println("Insira o novo telefone: ");
                                long foneNovo = input.nextLong();
                                String foneNovoS = String.valueOf(foneNovo);
                                um.setFone("+55 51 9" + foneNovoS);
                                System.out.println("Alterado com sucesso!");
                                System.out.println(um);
                            break;
                            
                            case 4:
                                //CONVENIO
                                System.out.println("Insira o novo convenio: ");
                                String convNovo = input.nextLine();
                                um.setConvenio(convNovo);
                                System.out.println("Alterado com sucesso!");
                                System.out.println(um);
                            break;
                            
                            case 5:
                                //DIAGNOTISCO
                                System.out.println("Insira o novo diagnostico: ");
                                String diagnosticoNovo = input.nextLine();
                                um.setDiagnostico(diagnosticoNovo);
                                System.out.println("Alterado com sucesso!");
                                System.out.println(um);
                            break;
                            
                            case 6:
                                //CONSULTAS
                                System.out.println("Insira a nova quantidade de consultas realizadas: ");
                                int consultasNovo = input.nextInt();
                                um.setNumConsultasMes(consultasNovo);
                                System.out.println("Alterado com sucesso!");
                                System.out.println(um);
                                System.out.println("Custo das consultas do mês: ");
                                um.setCusto(consultasNovo * 150);
                            break;
                            
                            default:
                                System.out.println(dados[0]);
                                System.out.println(dados[1]);
                                System.out.println(dados[2]);
                                System.out.println(dados[3]);
                                System.out.println(dados[4]);
                                System.out.println(dados[5]);
                        }
                    }
                    else if(nomePaciente2.equalsIgnoreCase(dois.getNome()))
                    {
                        System.out.println("Tipo de dado a ser alterado: ");
                       
                        System.out.println(dados[0]);
                        System.out.println(dados[1]);
                        System.out.println(dados[2]);
                        System.out.println(dados[3]);
                        System.out.println(dados[4]);
                        System.out.println(dados[5]);
                        
                        int tipoDeDado2 = input.nextInt();
                        
                        switch(tipoDeDado2)
                        {
                            case 1:
                                 //NOME
                                 System.out.println("Insira o novo nome: ");
                                 String nomeNovo = input.nextLine();
                                 dois.setNome(nomeNovo);
                                 System.out.println("Alterado com sucesso!");
                                 System.out.println(dois);
                            break;
                            
                            case 2:
                                //CPF
                                 System.out.println("Insira o novo CPF: ");
                                 long cpfNovo = input.nextLong();
                                 dois.setCpf(cpfNovo);
                                 System.out.println("Alterado com sucesso!");
                                 System.out.println(dois);
                            break;
                            
                            case 3:
                                //TELEFONE
                                System.out.println("Insira o novo telefone: ");
                                long foneNovo = input.nextLong();
                                String foneNovoS = String.valueOf(foneNovo);
                                dois.setFone("+55 51 9" + foneNovoS);
                                System.out.println("Alterado com sucesso!");
                                System.out.println(dois);
                            break;
                            
                            case 4:
                                //CONVENIO
                                System.out.println("Insira o novo convenio: ");
                                String convNovo = input.nextLine();
                                dois.setConvenio(convNovo);
                                System.out.println("Alterado com sucesso!");
                                System.out.println(dois);
                            break;
                            
                            case 5:
                                //DIAGNOTISCO
                                System.out.println("Insira o novo diagnostico: ");
                                String diagNovo = input.nextLine();
                                dois.setDiagnostico(diagNovo);
                                System.out.println("Alterado com sucesso!");
                                System.out.println(dois);
                            break;
                            
                            case 6:
                                //CONSULTAS
                                System.out.println("Insira a nova quantidade de consultas realizadas: ");
                                int consultasNovo = input.nextInt();
                                dois.setNumConsultasMes(consultasNovo);
                                System.out.println("Alterado com sucesso!");
                                System.out.println(dois);
                                System.out.println("Custo das consultas do mês: ");
                                dois.setCusto(consultasNovo * 150);
                            break;
                            
                            default:
                                System.out.println(dados[0]);
                                System.out.println(dados[1]);
                                System.out.println(dados[2]);
                                System.out.println(dados[3]);
                                System.out.println(dados[4]);
                                System.out.println(dados[5]);
                        }
                    }
                    else
                    {  
                        System.out.println("Paciente não encontrado");
                        System.out.println("\nReniciando");
                        System.out.println("\nEscolha uma opção novamente: ");
                    }
              break;

              case 3:
                  //OPÇÃO 3 //3-Adicionar novos pacientes",
                      System.out.println(menuO[2]);   
                     //NOME
                     System.out.print("\nNome: ");
                     String nomePaciente = input.next();
                     
                     //CPF
                     System.out.print("\nCPF: ");
                     long cpf = input.nextLong();
                     
                     //TELEFONE
                     System.out.print("\nTelefone: ");
                     System.out.print("+55 51 9");
                     long telefone = input.nextLong();
                     
                     
                     //CONVÊNIO
                     System.out.print("\nConvênio: ");
                     String convenio = input.next();
                     
                     //DIAGNOSTICO
                     System.out.print("\nDiagnostico: ");
                     String diagnostico = input.next();
                     
                     //CONSULTAS NO MÊS
                     System.out.print("\nQuantidade de consultas no mês: ");
                     int numConsultasMes = input.nextInt();
                     
                     double custo = numConsultasMes * 150;
                     
                     tres.setNome(nomePaciente);
                     tres.setCpf(cpf);
                     tres.setFone("+55 51 9" + telefone);
                     tres.setConvenio(convenio);
                     tres.setNumConsultasMes(numConsultasMes);
                     tres.setCusto(custo);
                     
                     //RESUMO DA INFORMAÇÕES INSERIDAS
                     System.out.println("\nNome: " + nomePaciente + "\n" + "CPF: " + cpf + "\n" 
                     + "Telefone: " + telefone + "\n" + "Convênio: " + convenio + "\n" 
                     + "Diagnostico:" + diagnostico + "\n" + "Quantidade de consultas no mês: " 
                     + numConsultasMes + "\nCusto do mês: " + custo);
              break;
              
              case 4:
                    //OPÇÃO 4 //4-Nome com mais vogais
                    System.out.println(menuO[3]);   
                    
                    int vogais1 = contaVogais(um.getNome());
                    int vogais2 = contaVogais(dois.getNome());
                    int vogais3 = contaVogais(tres.getNome());
                    
                    if(vogais1 > vogais2 && vogais1 > vogais3)
                    {
                        System.out.println(um.getNome());
                    }
                    else if(vogais2 > vogais1 && vogais2 > vogais3)
                    {
                        System.out.println(dois.getNome());
                    }
                    else if(vogais3 > vogais1 && vogais3 > vogais2)
                    {
                        System.out.println(tres.getNome());
                    }
                    else if(vogais1 == vogais2 && vogais1 == vogais3 && vogais2 == vogais3)
                    {
                        System.out.println("\n" + um.getNome() + "\n" + dois.getNome() + "\n" + tres.getNome());
                    }
                    else if(vogais1 == vogais2)
                    {
                        System.out.println("\n" + um.getNome() + "\n" + dois.getNome());
                    }
                    else if(vogais1 == vogais3)
                    {
                        System.out.println("\n" + um.getNome() + "\n" + tres.getNome());
                    }
                    else if(vogais2 == vogais3)
                    {
                        System.out.println("\n" + dois.getNome() + "\n" + tres.getNome());
                    }
              break;    
                  
              case 5:
                  //OPÇÃO 5
                  //SAIR
                  System.out.println("Saindo, até mais!");
                  System.exit(opcaoU);
              break;  
                  
              default:
                 System.out.println(menuO[0]);
                 System.out.println(menuO[1]);
                 System.out.println(menuO[2]);
                 System.out.println(menuO[3]);
                 System.out.println(menuO[4]);
            }
    }
  }
}