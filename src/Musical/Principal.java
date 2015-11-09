package Musical;


import View.Conexaobd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;
/*
public class Principal {

	public static void main(String[] args) {
            String nome;
            int nota,duracao,ano, opc;

		//==============================
		//Exemplo de inserção de 1 Genero SGBD
		//==============================
            /* Scanner s = new Scanner(System.in);
             
             do{ opc = Integer.parseInt(JOptionPane.showInputDialog("Informe a OPÇÂO:\n1.Inserir Genero\n2.Inserir Artista\n3.Inserir Album\n4.Iserir Musica\n5.Sair"));
		 switch(opc){
               case 1:

             do{
                       opc = Integer.parseInt(JOptionPane.showInputDialog("Informe a OPÇÂO:\n4.Conta Pessoa F.\n5.Conta Pessoa J.\n6.Sair"));
                       switch(opc){
                            case 1:
                                Scanner genero = new Scanner(System.in);
                                System.out.println("Infome o Genero: ");
                                String nomeGenero = genero.nextLine();
                                Genero r =new Genero(nomeGenero);
               
                                if(Conexaobd.inserirGenero(r)!=0) {
                                System.out.println("Genero inserido sucesso no banco!");
                            } else {
                                System.out.println("Erro na inserção!");
                                }
                                break;
                            case 2:
                                Scanner artista = new Scanner(System.in);
                                System.out.println("Infome o nome do  Artista: ");
                                String nomeArtista = artista.nextLine();

                                System.out.println("Infome o ID do Genero: ");
                                int generoId = artista.nextInt();

                                Artista m =new Artista(nomeArtista,generoId);

                                if(Conexaobd.inserirArtista(m)!=0) {
                                        System.out.println("Artista  inserida com sucesso no banco!");
                                } else {
                                        System.out.println("Erro na inserção!");
                                }
                                break;
                            case 3:
                                 Scanner album = new Scanner(System.in);
                                    System.out.println("Infome o nome do  Album: ");
                                    String nomeAlbum = album.nextLine();

                                    System.out.println("Infome o Ano: ");
                                    int anoAlbum = album.nextInt();

                                    System.out.println("Infome o Id Artista: ");
                                    int idArtista = album.nextInt();
                                    Album j =new Album(nomeAlbum,anoAlbum,idArtista);
                                    if(Conexaobd.inserirAlbum(j)!=0) {
                                            System.out.println("Album  inserido com sucesso no banco!");
                                    } else {
                                            System.out.println("Erro na inserção!");
                                    }
                            case 4:
                                Scanner musica = new Scanner(System.in);
                                System.out.println("Infome o Nome da Musica: ");
                                String nomeMusica = musica.nextLine();

                                System.out.println("Infome o Nota: ");
                                int notaMusica = musica.nextInt();

                                System.out.println("Infome o Duracao da Musica: ");
                                int duracaoMusica = musica.nextInt();

                                System.out.println("Infome o Id do Album: ");
                                int albumId = musica.nextInt();

                                Musica c =new Musica(nomeMusica,notaMusica, duracaoMusica, albumId);
                                if(Conexaobd.inserirMusica(c)!=0) {
                                        System.out.println("Musica inserida com sucesso no banco!");
                                } else {
                                        System.out.println("Erro na inserção!");
                                }
                                break;
                            default:
                                System.out.println("OPÇÂO INVALIDA!");
                       }
                   }while(opc!=6);
        
           }
       }while(opc!=3);
    }
}*/

             
             
             
             /*
             
                Scanner genero = new Scanner(System.in);
                System.out.println("Infome o Genero: ");
                String nomeGenero = genero.nextLine();
                Genero r =new Genero(nomeGenero);
               
		if(Conexaobd.inserirGenero(r)!=0) {
			System.out.println("Genero inserido sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
             
                
        
                
		//==============================
		//Exemplo de inserção de outro Genero no SGBD
		//==============================
                 
               Scanner artista = new Scanner(System.in);
                System.out.println("Infome o nome do  Artista: ");
                String nomeArtista = artista.nextLine();
                
                System.out.println("Infome o ID do Genero: ");
                int generoId = artista.nextInt();
                
                Artista m =new Artista(nomeArtista,generoId);
               
		if(Conexaobd.inserirArtista(m)!=0) {
			System.out.println("Artista  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                
                Scanner album = new Scanner(System.in);
                System.out.println("Infome o nome do  Album: ");
                String nomeAlbum = album.nextLine();
               
                System.out.println("Infome o Ano: ");
                int anoAlbum = album.nextInt();
               
                System.out.println("Infome o Id Artista: ");
                int idArtista = album.nextInt();
                Album j =new Album(nomeAlbum,anoAlbum,idArtista);
		if(Conexaobd.inserirAlbum(j)!=0) {
			System.out.println("Album  inserido com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                
                Scanner musica = new Scanner(System.in);
                System.out.println("Infome o Nome da Musica: ");
                String nomeMusica = genero.nextLine();
                
                System.out.println("Infome o Nota: ");
                int notaMusica = musica.nextInt();
                
                System.out.println("Infome o Duracao da Musica: ");
                int duracaoMusica = musica.nextInt();
                
                System.out.println("Infome o Id do Album: ");
                int albumId = musica.nextInt();
                
                Musica c =new Musica(nomeMusica,notaMusica, duracaoMusica, albumId);
		if(Conexaobd.inserirMusica(c)!=0) {
			System.out.println("Musica inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
             
		//==============================
		//Exemplo de inserção de outra Pessoa no SGBD
		//==============================
		/*Pessoa z = new Pessoa("Fulano Açucena", "5678-1234", 27);
		if(Conexao.inserir(z)!=0) {
			System.out.println("Pessoa inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
		*/
		
		//==============================
		//Exemplo de remoção de Pessoa pelo Telefone
		//==============================
		/*String tel = "1234-5678";
		if(Conexao.removerPeloTelefone(tel)!=0) {
			System.out.println("Pessoa removida com sucesso do banco!");
		} else {
			System.out.println("Erro na inserção!");
		}

		*/
		//==============================
		//Exemplo de atualização da Pessoa no SGBD, buscando-a pelo nome atual!!!
		//==============================
		/*z.setIdade(65);
		String nomeAtual = z.getNome();
		z.setNome("Fulano Açucena Mais Velho");
		if(Conexao.atualizar(z, nomeAtual)!=0) {
			System.out.println("Pessoa atualizada com sucesso no banco!");
		} else {
			System.out.println("Erro na atualização!");
		}
		*/
		
		//==============================
		//Exemplo de listagem de todas Pessoas do SGBD
		//==============================



		/*ResultSet res = Conexaobd.relatorio();
		if(res!=null) {
			try {
				while(res.next()) {
					System.out.println("Nome: "+res.getString("nome"));
					//System.out.println("Idade: "+res.getInt("idade"));
					//System.out.println("Telefone: "+res.getString("telefone"));
					//System.out.println("==========");
				}
			} catch (SQLException e) {
				System.out.println("Problema para exibir registros!");
			}
		} else {
			System.out.println("A pesquisa não retornou nenhum registro!");
		}
	
		
	}

}*/