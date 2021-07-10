package day22;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonTest extends Frame {
	
	public ButtonTest() {
		super("�͸� Ŭ���� �׽�Ʈ");
		Button btn = new Button("����!");
		add(btn);
		setSize(500,500);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				System.out.println("��ư �������!");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonTest();
		}
	}
