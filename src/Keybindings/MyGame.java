package Keybindings;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;


public class MyGame extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    private static final String MOVE_UP = "move up";
    private static final String MOVE_DOWN = "move down";
    private static final String FIRE = "move fire";

    static JButton obj1 = new JButton("hoi");
    static JLabel obj2 = new JLabel("hoi");

    public MyGame() {


//      Do all the layout management and what not...

        obj1.getInputMap(IFW).put(KeyStroke.getKeyStroke("UP"), MOVE_UP);
        obj1.getInputMap(IFW).put(KeyStroke.getKeyStroke("DOWN"), MOVE_DOWN);
//      ...
        obj1.getInputMap(IFW).put(KeyStroke.getKeyStroke("control CONTROL"), FIRE);
        obj2.getInputMap(IFW).put(KeyStroke.getKeyStroke("W"), MOVE_UP);
        obj2.getInputMap(IFW).put(KeyStroke.getKeyStroke("S"), MOVE_DOWN);
//      ...
        obj2.getInputMap(IFW).put(KeyStroke.getKeyStroke("T"), FIRE);

        obj1.getActionMap().put(MOVE_UP, new MoveAction(1, 1));
        obj1.getActionMap().put(MOVE_DOWN, new MoveAction(2, 1));
//      ...
        obj1.getActionMap().put(FIRE, new FireAction(1));
        obj2.getActionMap().put(MOVE_UP, new MoveAction(1, 2));
        obj2.getActionMap().put(MOVE_DOWN, new MoveAction(2, 2));
//      ...
        obj2.getActionMap().put(FIRE, new FireAction(2));

//      In practice you would probably create your own objects instead of the JLabels.
//      Then you can create a convenience method obj.inputMapPut(String ks, String a)
//      equivalent to obj.getInputMap(IFW).put(KeyStroke.getKeyStroke(ks), a);
//      and something similar for the action map.

        add(obj1);
        add(obj2);
//      Do other GUI things...
    }

    static void rebindKey(KeyEvent ke, String oldKey) {

//      Depends on your GUI implementation.
//      Detecting the new key by a KeyListener is the way to go this time.
        obj1.getInputMap(IFW).remove(KeyStroke.getKeyStroke(oldKey));
//      Removing can also be done by assigning the action name "none".
        obj1.getInputMap(IFW).put(KeyStroke.getKeyStrokeForEvent(ke),
                 obj1.getInputMap(IFW).get(KeyStroke.getKeyStroke(oldKey)));
//      You can drop the remove action if you want a secondary key for the action.
    }

    public static void main(String[] args) {
        JFrame frame = new MyGame();
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(3);
        frame.setTitle("2048");
        frame.setContentPane(new Hoofdpaneel());
        frame.setVisible(true);
        new MyGame();
    }

    private class MoveAction extends AbstractAction {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		int direction;
        int player;

        MoveAction(int direction, int player) {

            this.direction = direction;
            this.player = player;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        	System.out.println("Something works!");
            // Same as the move method in the question code.
            // Player can be detected by e.getSource() instead and call its own move method.
        }
    }

    private class FireAction extends AbstractAction {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		int player;

        FireAction(int player) {

            this.player = player;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        	System.out.println("Something works!");
            // Same as the fire method in the question code.
            // Player can be detected by e.getSource() instead, and call its own fire method.
            // If so then remove the constructor.
        }
    }
}
