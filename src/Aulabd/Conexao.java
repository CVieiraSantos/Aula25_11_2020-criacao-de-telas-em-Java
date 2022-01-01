package Aulabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {	
	private Connection c;
	private Statement s;
	private Connection d;
	private Statement g;
	
	public Conexao(){
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			c=DriverManager.getConnection("jdbc:mysql://localhost:3311/Aulabd","root","root");
            s=c.createStatement();
		}
		
		catch (SQLException e) {		
			e.printStackTrace();
		}
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} 
		
		catch (ClassNotFoundException e) {		
			e.printStackTrace();
		}
		
		
		try {
			d=DriverManager.getConnection("jdbc:mysql://localhost:3311/Aulabd","root","root");
            g=c.createStatement();
		} 
		
		catch (SQLException e) {			
			e.printStackTrace();
		}
		
		
	}
	
	public void cadastrar(String nome, String sobrenome, String cep, String cidade) {
		
		try {
			s.executeUpdate ("insert into Cadastro values('"+nome+"','"+sobrenome+"','"+cep+"','"+cidade+"')");
		} 
		
		catch (SQLException e) {		
			e.printStackTrace();
		}
		
	}
	
	
				
	
	public void deletarCadastro(String nome, String sobrenome, String cep, String cidade) {
		   try {
				g.executeUpdate ("delete from Cadastro where nome = ('"+nome+"','"+sobrenome+"','"+cep+"', '"+cidade+"')");
			} 
		   
		   catch (SQLException e) {				
				e.printStackTrace();
			}
		   
	   }
	
	
	
}