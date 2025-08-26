import java.awt.*;
import javax.accessibility.AccessibleContext;

public class LabelExample {
    public static void main(String[] args) {
        Frame f = new Frame("Label Example");

        // Create label
        Label lbl = new Label("Hello World");

        // 1. setText(String text)
        lbl.setText("Welcome to Java AWT Label");

        // 2. setAlignment(int alignment) - CENTER
        lbl.setAlignment(Label.CENTER);

        // 3. getText()
        System.out.println("Label text: " + lbl.getText());

        // 4. getAlignment()
        int align = lbl.getAlignment();
        System.out.println("Label alignment: " + align); // 0=LEFT,1=CENTER,2=RIGHT

        // 5. addNotify()
        lbl.addNotify(); 
        System.out.println("addNotify() called - peer created for label");

        // 6. getAccessibleContext()
        AccessibleContext ac = lbl.getAccessibleContext();
        System.out.println("Accessible context: " + ac);

        // 7. paramString() (protected method, accessed via subclass)
        class MyLabel extends Label {
            MyLabel(String text) {
                super(text);
            }
            public String showParamString() {
                return super.paramString();  // calling protected method
            }
        }
        MyLabel ml = new MyLabel("Custom Label");
        System.out.println("paramString() output: " + ml.showParamString());

        // Add label to frame
        f.add(lbl);

        // Frame settings
        f.setSize(400, 200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
