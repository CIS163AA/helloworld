import javax.swing.JOptionPane;

public class helloworld {

  public static void main(String[] args) {


String c="What is your name?";
String d="how are you feeling?";
   c = JOptionPane.showInputDialog(
   "What is your name?");
  d = JOptionPane.showInputDialog("how are you feeling?");
System.out.println(c); 
System.out.println(d);
   }
}