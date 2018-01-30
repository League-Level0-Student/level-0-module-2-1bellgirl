import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String input=JOptionPane.showInputDialog("What is your height in inches?");	
int Height=Integer.parseInt(input);
if(Height>47) {
	JOptionPane.showMessageDialog(null, "You can ride!");
}
else {
	JOptionPane.showMessageDialog(null, "You are not tall enough to ride, sorry.");
}
}
}

