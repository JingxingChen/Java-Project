package My.cs455.homework1;
//Name:Jingxing Cheng
//USC NetID:chen642
//CS 455 PA1
//Spring 2018
import java.lang.String;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
/*
 * This class is used to drawing three bar on the frame and the labels under the bar.
 * 
 */
public class CoinSimComponent extends JComponent{
	//color of bar.
	private static final Color color1=Color.RED;
	private static final Color color2=Color.GREEN;
	private static final Color color3=Color.BLUE;
	//width of bar;
	private static final int width=60;
	//the distance between the bottom of label and the bottom of frame.
	private static final int vb=30;
	private int widthBetweenBar;
	//the vertical location of the bottom of label
	private int bottom;
	//the location of three bars which is measured by x coordinate
	private int left1;
	private int left2;
	private int left3;
	//the content of label 1,2,3
	private String label1;
	private String label2;
	private String label3;
	//the numbers of pixels in each unit.
	private double scale;
	private Bar bar1;
	private Bar bar2;
	private Bar bar3;
	//height of bar in unit
	private int barHeight1;
	private int barHeight2;
	private int barHeight3;
	private CoinTossSimulator simulator;
	private int trailTimes;
//A Constructor which needs one variable to initiate the trial times and run the simulator; 
	public CoinSimComponent(int trailTimes) {
		this.trailTimes=trailTimes;
		simulator=new CoinTossSimulator();
		simulator.run(trailTimes);
	}
	
	public int getTrailTimes() {
		return trailTimes;
	}

	public void setTrailTimes(int trailTimes) {
		this.trailTimes = trailTimes;
	}

	public int getVb() {
		return vb;
	}
	
	public String getLabel1() {
		return label1;
	}
	
	public String getLabel2() {
		return label1;
	}
	
	public String getLabel3() {
		return label1;
	}
	public CoinTossSimulator getCoinTossSimulator() {
		return simulator;
	}
	public int getWidthBetweenBar(){
		return widthBetweenBar;
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		//this variable represents the distance between each bar.
		widthBetweenBar=(this.getWidth()-3*width)/4;
	    //this is the bottom of label.
		bottom=this.getHeight()-vb;
		Font font=g2.getFont();
		FontRenderContext context=g2.getFontRenderContext();
		Rectangle2D labelBounds=font.getStringBounds("HelloWorld", context);
		//calculate the height of label, "HelloWorld" is just a random string.
		double heightOfLabel=labelBounds.getHeight();
		scale=(this.getHeight()-vb*2-heightOfLabel)/100;
		left1=this.widthBetweenBar;
		left2=this.widthBetweenBar*2+this.width;
		left3=this.widthBetweenBar*3+this.width*2;
		barHeight1=(simulator.getTwoHeads()*100)/simulator.getNumTrials();
		barHeight2=(simulator.getHeadTails()*100)/simulator.getNumTrials();
		barHeight3=(simulator.getTwoTails()*100)/simulator.getNumTrials();
		label1="Two heads:"+simulator.getTwoHeads()+"("+(int)barHeight1+"%)";
		label2="A Heads and a tail:"+simulator.getHeadTails()+"("+(int)barHeight2+"%)";
		label3="Two tails:"+simulator.getTwoTails()+"("+(int)barHeight3+"%)";
		//translate all the variables to the bar constructor.
		bar1=new Bar(bottom,left1,width,barHeight1,scale,color1,label1);
		bar2=new Bar(bottom,left2,width,barHeight2,scale,color2,label2);
		bar3=new Bar(bottom,left3,width,barHeight3,scale,color3,label3);
		bar1.draw(g2);
		bar2.draw(g2);
		bar3.draw(g2);
	}
}
