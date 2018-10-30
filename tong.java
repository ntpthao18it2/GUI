//TIM    S=1+1/2+1/3+....+1/N
package demo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tong extends JFrame implements ActionListener {
   
	JLabel lblsoN;
	JTextField tfsoN;
	JLabel lblkq;
	JTextField tfkq;
	JButton btntinhTong;
	
public tong() {
	lblsoN= new JLabel();
	lblsoN.setText("Nhap so N");
	tfsoN= new JTextField(10);
	lblkq= new JLabel();
	lblkq.setText("Ket qua");
	tfkq= new JTextField(15);
	btntinhTong= new JButton();
	btntinhTong.setText("Tinh Tong");
	btntinhTong.addActionListener(this);
	
	Container cont = this.getContentPane();
	setSize(500, 500);
	
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
	int n= Integer.parseInt(soN);
	float s=0;
	for(int i=1;i<=n;i++) {
		s=s+(float)1/i;
		
		
	}
	tfkq.setText(String.valueOf(s));
	
}
public static void main(String[] args) {
	tong obj = new tong();
}
}
