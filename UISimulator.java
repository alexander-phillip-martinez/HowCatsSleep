import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/*class ImgRepository {
	private BufferedImage img1;
	private BufferedImage img2;
	private int areaCode;
	
	public ImgRepository(int idNum) {
		//initialize area ID
		this.areaCode = idNum;
		//attempt to initialize images
		img1 = null;
		try {
		    img1 = ImageIO.read(new File("orange.jpg"));
		} catch (IOException e) {
			System.out.println("image not found");
		}
		img2 = null;
		try {
		    img2 = ImageIO.read(new File("pink_lady_apple.jpg"));
		} catch (IOException e) {
			System.out.println("image not found");
		}
	}
	
	public void setAreaCode(int num) {
		this.areaCode = num;
	}
	
	public BufferedImage getImage() {
		if (this.areaCode == 0) {
			return img1;
		}
		else {
			return img2;
		}
	}
}*/

public class UISimulator extends Component{

/*	BufferedImage img;
	
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, 800, 600, null);
	}
	
	public static void main(String[] args) {
		// initialize image repository
		ImgRepository IR = new ImgRepository(0);
		//attempt to display image
		
		
	}*/
	
//-----------------------------
	
	
    BufferedImage img;

    public void paint(Graphics g) {
        //g.drawImage(img, 0, 0, null);
    	g.drawImage(img, 0, 0, 800, 600, null);
    }

    public UISimulator() {
       try {
           img = ImageIO.read(new File("orange.jpg"));
       } catch (IOException e) {
    	   System.out.println("orange not working");
       }

    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }
    
    public void changeImg(int num) {
    	if (num == 1) {
    		try {
    			img = ImageIO.read(new File("pink_lady_apple.jpg"));
    		} catch (IOException e) {
    			System.out.println("apple not working");
    		}
    	}
    	else {
    		try {
    			img = ImageIO.read(new File("orange.jpg"));
    		} catch (IOException e) {
    			System.out.println("new orange not working");
    		}
    	}
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new UISimulator());
        f.pack();
        f.setVisible(true);
    }
}
