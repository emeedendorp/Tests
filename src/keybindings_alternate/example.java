package keybindings_alternate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/*  File: KeyBindingExample.java
 *  
 *  Description: This class was created to provide a simple example of the
 *               application of KeyBinding to a Swing component. In this
 *               example, a JTextField and JButton are displayed on a JPanel in
 *               a JFrame. When the the focus is on the JTextField and an Enter
 *               key is pressed, the JButton action will occur as though the
 *               button had been pressed.
 *               
 *               The behavior shown in this simple example:
 *               1.  When the window first appears, the text field has focus.
 *                   Any keys typed will be entered as data in the text field;
 *               2.  Pressing Enter while the text field has focus will cause
 *                   the data typed to be selected so that any additional typing
 *                   will replace the existing. this behavior is useful for
 *                   multiple entries; and 
 *               3.  If the user presses the Enter button, focus is immediately
 *                   transferred back to the text field and the data in the 
 *                   field is selected.  
 *
 *  Source: Java Tutorials and Swing component APIs as needed. 
 *
 *  Author: GregBrannon, August 2011
 */
public class example
{
    private static JFrame mainFrame;
    private static JTextField dataField;
    private static JButton enterButton;
    private static JPanel mainPanel;
    private static Action enterAction;
  
    
    // the main() method creates a simple JFrame to demonstrate the
    // key binding of the enter key to the component button "enter" 
    public static void main( String[] args )
    {
        mainFrame = new JFrame( "Key Binding Example" );

        mainFrame.add( new Hoofdpaneel() );
        mainFrame.setLocationRelativeTo( null );
        mainFrame.setSize( 200, 100 );
        mainFrame.setResizable( false );
        mainFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        mainFrame.setVisible( true );

    } // end method main()
    


    


} // end class KeyBindingExample

