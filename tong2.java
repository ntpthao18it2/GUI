//TÌM S=sqrt(1)+sqrt(2)+sqrt(3)+....+sqrt(n)
package demo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tong2 extends JFrame implements ActionListener {
	JLabel lblsoN;
	JTextField tfsoN;
	JLabel lblkq;
	JTextField tfkq;
	JButton btntinhTong;
	
public tong2() {
	lblsoN = new JLabel();
	lblsoN.setText("nhap so n");
	tfsoN= new JTextField(10);
	lblkq= new JLabel();
	lblkq.setText("ket qua");
	tfkq= new JTextField(15);
	btntinhTong = new JButton();
	btntinhTong.setText("tinh tong");
	btntinhTong.addActionListener(this);
	
	Container cont = this.getContentPane();
	setSize(450, 450);
	
	cont.setLayout(new FlowLayout());
	cont.add(lblsoN);
	cont.add(tfsoN);
	cont.add(lblkq);
	cont.add(tfkq);
	cont.add(btntinhTong);
	setVisible(true);
	
	
}
public void actionPerformed(ActionEvent e) {
	String soN = tfsoN.getText();
	int n = Integer.parseInt(soN);
	
	float s=0;
	for(int i=1;i<=n;i++) {
       s=s+(float)Math.sqrt(i);
	}
	tfkq.setText(String.valueOf(s));
}
	
	public static void main(String[] args) {
		tong2 obj = new tong2();
	}

}
