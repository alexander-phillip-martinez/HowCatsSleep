import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.concurrent.TimeUnit;

public class HelloWorld{

    public JPanel createContentPane (){

        // We create a bottom JPanel to place everything on.
        /*JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        // Creation of a Panel to contain the JLabels
        JPanel textPanel = new JPanel();
        textPanel.setLayout(null);
        textPanel.setLocation(10, 0);
        textPanel.setSize(260, 30);
        totalGUI.add(textPanel);

        // First JLabel, outputs "Red".
        // Added to the 'textPanel' JPanel
        JLabel redLabel = new JLabel("Red");
        redLabel.setLocation(0, 0);
        redLabel.setSize(50, 40);
        redLabel.setHorizontalAlignment(0);
        textPanel.add(redLabel);

        // Creates a panel to hold the following panels.
        JPanel panelForPanels = new JPanel();
        panelForPanels.setLayout(null);
        panelForPanels.setLocation(10, 40);
        panelForPanels.setSize(260, 50);
        totalGUI.add(panelForPanels);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setLocation(0, 0);
        redPanel.setSize(50, 50);
        panelForPanels.add(redPanel);*/
        
        //our code: create and return practiceGUI
        JPanel practiceGUI = new JPanel();
        practiceGUI.setLayout(null);

        ImageIcon image = new ImageIcon(((new ImageIcon("orange.jpg")).getImage()).getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH));
        JLabel label = new JLabel("", image, JLabel.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add( label, BorderLayout.CENTER );
        panel.setSize(800,600);
        practiceGUI.add(panel);
        

        
        //totalGUI.setOpaque(true);
        practiceGUI.setOpaque(true);
        return practiceGUI;
        //return totalGUI;
    }
    
    public JPanel changeContentPane() {
    	JPanel practiceGUI = new JPanel();
    	practiceGUI.setLayout(null);
    	
        ImageIcon image = new ImageIcon(((new ImageIcon("pink_lady_apple.jpg")).getImage()).getScaledInstance(800,600,java.awt.Image.SCALE_SMOOTH));
        JLabel label = new JLabel("", image, JLabel.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add( label, BorderLayout.CENTER );
        panel.setSize(800,600);
        practiceGUI.add(panel);
        
        practiceGUI.setOpaque(true);
        return practiceGUI;
    }

    private static void createAndShowGUI(JFrame frame) {

        //JFrame.setDefaultLookAndFeelDecorated(true);
        //JFrame frame = new JFrame("[=] Display [=]");

        //Create and set up the content pane.
        HelloWorld demo = new HelloWorld();
        frame.setContentPane(demo.createContentPane());

        // The other bits and pieces that make our program a bit more stable.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        
    }
    
    private static void changeAndShowGUI(JFrame frame) {

        //JFrame.setDefaultLookAndFeelDecorated(true);
        //JFrame frame = new JFrame("[=] Display [=]");

        //Create and set up the content pane.
        HelloWorld demo = new HelloWorld();
        frame.setContentPane(demo.changeContentPane());

        // The other bits and pieces that make our program a bit more stable.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
    	//TC: Try setting up JFrame here for future manipulation
        JFrame.setDefaultLookAndFeelDecorated(true);
    	final JFrame testframe = new JFrame("[=] Display [=]");
    	
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(testframe);
            }
        });
        
        //Attempt to change image on content pane.
        try {
			TimeUnit.SECONDS.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("changing image");
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	changeAndShowGUI(testframe);
            }
        });
        System.out.println("done");
    }
}
