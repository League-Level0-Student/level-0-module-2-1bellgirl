import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("How old are you?");
	int age= Integer.parseInt(input);
	if(age>17) {
		JOptionPane.showMessageDialog(null, "Who do you think the next president should be?");
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
	}
}
}
