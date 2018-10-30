package demo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class dangnhap  extends JFrame implements ActionListener {
	JLabel lblten;
	JTextField tften;
	JLabel lblmk;
	JTextField tfmk;
	JButton btndn;
	JButton btnss;
public dangnhap() {
	lblten= new JLabel();
	lblten.setText("User Name");
	tften= new JTextField(15);
	lblmk= new JLabel ();
	lblmk.setText("Password");
	tfmk= new JTextField(15);
	btndn = new JButton();
	btndn.setText("Login");
	btndn.addActionListener(this);
	btnss= new JButton();
	btnss.setText("Register");
	btnss.addActionListener(this);
	
	Container cont = this.getContentPane();
	setSize(500, 500);
	
	cont.setLayout(new FlowLayout());
	cont.add(lblten);
	cont.add(tften);
	cont.add(lblmk);
	cont.add(tfmk);
	cont.add(btndn);
	cont.add(btnss);
	
	setVisible(true);
}
public void actionPerformed(ActionEvent e) {
	JOptionPane.showConfirmDialog(null,"" +tfmk.getText()+ tften.getText());
	
}

public static void main(String[] args) {
	dangnhap obj = new dangnhap();
}



}