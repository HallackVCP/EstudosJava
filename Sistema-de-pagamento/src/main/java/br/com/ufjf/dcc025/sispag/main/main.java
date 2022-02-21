package br.com.ufjf.dcc025.sispag.main;

import br.com.ufjf.dcc025.sispag.entidades.Funcionario;
import br.com.ufjf.dcc025.sispag.entidades.Gerente;
import br.com.ufjf.dcc025.sispag.entidades.Vendedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String args[]){
        //menu
        int option;
        List<Vendedor> vendedores = new ArrayList<>();
        List<Gerente> gerentes = new ArrayList<>();
        do{
            System.out.println("Digite uma opção: ");
            System.out.println("1. Cadastrar Vendedor");
            System.out.println("2. Cadastrar Gerente");
            System.out.println("3. Associar Vendedor a um gerente");
            System.out.println("4. Registrar as vendas realizadas por um Vendedor");
            System.out.println("5. Mostrar dados de Vendedores e Gerentes");
            System.out.println("6. Sair");
            Scanner in = new Scanner(System.in);
            option = Integer.parseInt(in.nextLine());
            switch(option){
                case 1:
                    System.out.println("Digite o nome do vendedor: ");
                    String nomeF = in.nextLine();
                    System.out.println("Digite o salario diario do vendedor: ");
                    double salario = Double.parseDouble(in.nextLine());
                    Vendedor vendedor = new Vendedor(nomeF, salario);
                    vendedores.add(vendedor);
                    System.out.println("Vendedor cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o nome do gerente: ");
                    String nomeG = in.nextLine();
                    System.out.println("Digite o salario diario do gerente: ");
                    salario = Double.parseDouble(in.nextLine());
                    Gerente gerente = new Gerente(nomeG, salario);
                    gerentes.add(gerente);
                    System.out.println("Gerente cadastrado com sucesso!");


                    break;
                case 3:
                    System.out.println("Digite o nome do vendedor: ");
                    String nome = in.nextLine();
                    String nomeAux;
                    System.out.println("Digite o nome do gerente ao qual ira associar: ");
                    nomeAux = in.nextLine();
                    for (Gerente ger:
                         gerentes) {
                        if(ger.getNome().equals(nomeAux)){
                            for (Vendedor v:
                                 vendedores) {
                                //System.out.println(v.getNome());
                                if(v.getNome().equals(nome)){
                                    ger.setVendedores(v);
                                    System.out.println("Vendedor associado a gerente com sucesso!");
                                }
                                else{
                                    System.out.println("Vendedor nao encontrado");
                                }
                            }
                        }
                        else{
                            System.out.println("Gerente nao encontrado");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Digite o valor total da venda a ser registrada: ");
                    double valVenda = Double.parseDouble(in.nextLine());
                    System.out.println("Digite o nome do vendedor que realizou a venda: ");
                    nome=in.nextLine();
                    for (Vendedor vend:
                         vendedores) {
                        if(vend.getNome().equals(nome)){
                            System.out.println("Venda registrada com sucesso!");
                            vend.setVendas(valVenda);
                        }
                        else{
                            System.out.println("Vendedor nao encontrado");
                        }
                    }
                    break;

                case 5:
                    if(gerentes.size()>0){
                        for (Gerente ger:
                                gerentes) {
                            List<Vendedor> vends = ger.getVendedores();
                            for (Vendedor vend:
                                    vends) {
                                System.out.println(vend.getNome()+ " "+vend.getSalarioDiario());
                            }
                            System.out.println(ger.getNome() + " " + ger.getSalarioDiario());
                        }
                    }
                    else{
                        for (Vendedor vends:
                             vendedores) {
                            System.out.println(vends.getNome() + " " + vends.getSalarioDiario());
                        }
                    }

                    break;

                case 6:
                    break;

                default:
                    break;
            }

        }while(option!=6);
    }
}
