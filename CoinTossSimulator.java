package My.cs455.homework1;

import java.util.Random;

//Name:Jingxing Cheng
//USC NetID:chen642
//CS 455 PA1
//Spring 2018

/**
* class CoinTossSimulator
* 
* Simulates trials of repeatedly tossing two coins and allows the user to access the
* cumulative results.
* 
* NOTE: we have provided the public interface for this class.  Do not change
* the public interface.  You can add private instance variables, constants, 
* and private methods to the class.  You will also be completing the 
* implementation of the methods given. 
* 
* Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
* 
*/
public class CoinTossSimulator {
private int totalNumber;
private int twoHeads;
private int twoTails;
private int headTails;

/**
   Creates a coin toss simulator with no trials done yet.
*/
public CoinTossSimulator() {

}


/**
   Runs the simulation for numTrials more trials. Multiple calls to this method
   without a reset() between them *add* these trials to the current simulation.
   
   @param numTrials  number of trials to for simulation; must be >= 1
 */
public void run(int numTrials) {
	this.totalNumber=this.totalNumber+numTrials;
	Random generator=new Random();
	for(int i=0;i<numTrials;i++){
		int rand=generator.nextInt(2);
		int rand1=generator.nextInt(2);
		if(rand==0&&rand1==0)this.twoHeads++;
		else if((rand==0&&rand1==1)||(rand==1&&rand1==0))this.headTails++;
		else this.twoTails++;
	}
}


/**
   Get number of trials performed since last reset.
*/
public int getNumTrials() {
    return totalNumber; // DUMMY CODE TO GET IT TO COMPILE
}


/**
   Get number of trials that came up two heads since last reset.
*/
public int getTwoHeads() {
    return twoHeads; // DUMMY CODE TO GET IT TO COMPILE
}


/**
  Get number of trials that came up two tails since last reset.
*/  
public int getTwoTails() {
    return twoTails; // DUMMY CODE TO GET IT TO COMPILE
}


/**
  Get number of trials that came up one head and one tail since last reset.
*/
public int getHeadTails() {
    return headTails; // DUMMY CODE TO GET IT TO COMPILE
}


/**
   Resets the simulation, so that subsequent runs start from 0 trials done.
 */
public void reset() {
	this.headTails=0;
	this.twoTails=0;
	this.twoHeads=0;
	this.totalNumber=0;
}
}
