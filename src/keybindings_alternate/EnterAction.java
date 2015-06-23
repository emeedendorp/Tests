package keybindings_alternate;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;


// class EnterAction is an AbstractAction that defines what will occur
// when the enter key is pressed. 
public class EnterAction extends AbstractAction
{
	JButton enterButton;
	
	public EnterAction(JButton enterButton){
		this.enterButton = enterButton;
	}
    public void actionPerformed( ActionEvent tf )
    {
        // provides feedback to the console to show that the enter key has
        // been pressed
        System.out.println( "The Enter key has been pressed." );
        
		// pressing the enter key then 'presses' the enter button by calling
        // the button's doClick() method
        enterButton.doClick();
        
    } // end method actionPerformed()


    
} // end class EnterAction