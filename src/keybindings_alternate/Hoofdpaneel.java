package keybindings_alternate;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;


public class Hoofdpaneel extends JPanel{
    // declares the components used to create the JFrame's content and
    // the actions that will occur when the enter button is selected

    
    JTextField dataField = new JTextField( 15 );
    Bl buttonListener = new Bl(dataField);
    JButton enterButton = new JButton( "Enter" );
    public Hoofdpaneel(){
    	enterButton.addActionListener( buttonListener );
        // defines an AbstractAction item that will program the action to occur
        // when the enter key is pressed
       EnterAction enterAction = new EnterAction(enterButton);

        // the following two lines do the magic of key binding. the first line
        // gets the dataField's InputMap and pairs the "ENTER" key to the
        // action "doEnterAction" . . .
        dataField.getInputMap().put( KeyStroke.getKeyStroke( "ENTER" ),
               "doEnterAction" );

        // . . . then this line pairs the AbstractAction enterAction to the
        // action "doEnterAction"
       dataField.getActionMap().put( "doEnterAction", enterAction );

        // the following commented line 'seems' to have the same affect as the
        // two previous lines. this may be an acceptable approach when only a  
        // single action is required.
        // dataField.setAction( enterAction );
        
        // add the components to the JPanel and return the completed product
        add( dataField );
        add( enterButton );
    }
    
    

    

}
