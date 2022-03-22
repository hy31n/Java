import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		String	id = JOptionPane.showInputDialog("아이디를 입력하세요");
		String	meseeage = id + "님, 반갑습니다.";
		JOptionPane.showMessageDialog(null, meseeage);
	}

}
