package View;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexaobd {
	
	//Método para Conectar ao Banco de Dados Local chamado 'cadastro', usuário 'root' e senha em branco!
	public static Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bibliotecamusical", "root", "");
			return(c);
		} catch (ClassNotFoundException e) {
                        JOptionPane.showMessageDialog(null,"Problema na configuraÃ§Ã£o do Driver do MySQL!");
		} catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,"Problema na conexÃ£o com o banco de dados!");
		}
		return(null);
	}
	
	//Retorna o relatório contendo todas as Pessoa do Banco
	public static ResultSet relatorio(String sql) {
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeQuery(sql));
		} catch (SQLException e) {
			 JOptionPane.showMessageDialog(null,"Problema na consulta!");
		}
		return(null);
	}
	
	//Método para inserir no banco uma Pessoa passada como parâmetro
	public static int inserir(String ins) {
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(ins));
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Problema no cadastro!");
		}
		return(0);
	}
        
        public ResultSet pesquisaCompleta(String pesq){
        ResultSet resultado;
        Statement st;
        try{
            Connection con = conectar();
            st = con.createStatement();
            resultado = st.executeQuery(pesq);
            return resultado;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Problema interno, verifique o banco de dados!");
        }
        return (null); 
    }
       

   
       
}


















/*public class Conexaobd {
	
	//Método para Conectar ao Banco de Dados Local chamado 'cadastro', usuário 'root' e senha em branco!
	public static Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bibliotecamusical", "root", "");
			return(c);
		} catch (ClassNotFoundException e) {
			System.out.println("Problema na configuração do Driver do MySQL!");
		} catch (SQLException e) {
			System.out.println("Problema na conexão com o banco de dados!");
		}
		return(null);
	}
	
	//Retorna o relatório contendo todas as Pessoa do Banco
	public static ResultSet relatorio() {
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeQuery("SELECT * FROM genero;"));
		} catch (SQLException e) {
			System.out.println("Problema na consulta à tabela genero!");
		}
		return(null);
	}
	
	//Método para inserir no banco uma Pessoa passada como parâmetro
	public static int inserirGenero(Genero g) {
		String insercao = "INSERT INTO `genero` (`nome`) VALUES ('"+g.getNome()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da genero!, ou ja existe");
		}
		return(0);
	}
	public static int inserirArtista(Artista a) {
		String insercao = "INSERT INTO artista(nome,genero_id ) VALUES ('"+a.getNome()+"','"+a.getId()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da artista!, ou ja existe");
		}
		return(0);
	}
        
         public static int inserirAlbum(Album j) {
		String insercao = "INSERT INTO album (nome, ano, artista_id ) VALUES ('"+j.getNome()+"','"+j.getAno()+"','"+j.getId()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da Album!");
		}
		return(0);
	}
        public static int inserirMusica(Musica l) {
		String insercao = "INSERT INTO musica (nome, nota, duracao, album_id ) VALUES ('"+l.getNome()+"','"+l.getNota()+"','"+l.getDuracao()+"','"+l.getId()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da Musica!, ou ja existe");
		}
		return(0);
	}
        
        
        
        
        
       */
	
	/*//Método para remover do banco uma Pessoa pelo 'telefone'
	public static int removerGenero(String g) {
		String remocao = "DELETE FROM `genero` WHERE `nome` = '"+g+"'";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(remocao));
		} catch (SQLException e) {
			System.out.println("Problema na remoção da genero!");
		}
		return(0);
	}
	
	
	//Método para Atualizar os campos no banco uma Pessoa passada como parâmetro, buscando-a pelo nome atual!!!
	public static int atualizar(Genero g, String n) {
		String atualizacao = "UPDATE `genero` SET `nome` = '"+g.getNome()+"' WHERE `nome` = '"+n+"';";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(atualizacao));
		} catch (SQLException e) {
			System.out.println("Problema na atualização da genero!");
		}
		return(0);
	}

    
	
}*/

