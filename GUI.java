package program;
import java.awt.*;
import java.awt.event.*;
public class Gui {
	public static void main(String[] args) {
        // Create frame
        Frame f = new Frame("Simple AWT Example");
        f.setSize(400, 300);
        f.setLayout(new FlowLayout());

        // Create components
        TextField tf = new TextField(20);
        Button b = new Button("Add");
        List list = new List();

        // Add components
        f.add(tf);
        f.add(b);
        f.add(list);

        // Button action
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText().trim();
                if (!text.isEmpty()) {
                    list.add(text);
                    tf.setText(""); // clear after adding
                }
            }
        });

        // Close window properly
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });

        // Show frame
        f.setVisible(true);
    }

}
 