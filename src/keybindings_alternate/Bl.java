package keybindings_alternate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Bl implements ActionListener{
	
	JTextField dataField;
	
	public Bl (JTextField datafield){
		this.dataField = datafield;
	}

	
    public void actionPerformed( ActionEvent bp )
    {
        // provides feedback to the console to show that the enter button
        // was pressed
        System.out.println( "The enter button was pressed." );

        // focus must be returned to the text field in order for the
        // selectAll() method to work.
        dataField.requestFocusInWindow();
        dataField.selectAll();
        
    } // end method actionPerformed()


    
} // end class ButtonListener