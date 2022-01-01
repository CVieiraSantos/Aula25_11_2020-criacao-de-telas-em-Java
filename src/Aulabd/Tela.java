package Aulabd;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Tela implements ActionListener  {
	
	private JFrame f;
	private JPanel p,pc,pu,ps,pb;
	private JLabel l0,l1,l2,l3,lm;
	private JTextField t0,t1,t2,t3;
	private JButton cadastrar, consultar, deletar;
	
	
	
	public void iniciarTela()
	{
		f=new JFrame();
		f.setTitle("Cadastro");
		p=new JPanel();
		pc=new JPanel();
		pu=new JPanel();
		ps=new JPanel();
		pb=new JPanel();
		l0=new JLabel("Nome");
		l1=new JLabel("Sobrenome");
		l2=new JLabel("Cep");
		l3 =new JLabel("Cidade");
		lm=new JLabel();
		lm.setForeground(Color.red);
		t0=new JTextField(20);
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(20);
        cadastrar=new JButton("cadastrar");
        cadastrar.addActionListener(this);
        consultar=new JButton("consultar");
        consultar.addActionListener(this);        
        deletar=new JButton("deletar");
        deletar.addActionListener(this);
                       
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        pc.add(l0);
        pc.add(t0);
        pu.add(l1);
        pu.add(t1);
        pu.add(l2);
        pu.add(t2);
        pu.add(l3);
        pu.add(t3);
        
        pb.add(consultar);
        pb.add(cadastrar);
        pb.add(deletar);
        p.add(pc);
        p.add(pu);
        
        
        
        p.add(pb);
        p.add(lm);
        f.getContentPane().add(p);
        f.setVisible(true);
        f.setSize(500,400);
        
                                               													            
        
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Conexao c = new Conexao();
		
		if(e.getSource()== cadastrar) {
			
			c.cadastrar(t0.getText(),t1.getText(),t2.getText(), t3.getText());
		}
		
		
		
		
		
		
	}
	
}
	
	


