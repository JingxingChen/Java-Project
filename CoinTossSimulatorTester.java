package My.cs455.homework1;

//Name:Jingxing Cheng
//USC NetID:chen642
//CS 455 PA1
//Spring 2018
/**
 * Test if the CoinTossSimulator is bug free.
 * 
 */
public class CoinTossSimulatorTester {
	public static void main(String[] args) {
		CoinTossSimulator cts=new CoinTossSimulator();
		System.out.println("After constructor");
		System.out.println("Number of trials [exp:0]:"+cts.getNumTrials());
		System.out.println("Two-head tosses: "+cts.getTwoHeads());
		System.out.println("Two-tail tosses: "+cts.getTwoTails());
		System.out.println("One-head one-tail tosses: "+cts.getHeadTails());
		System.out.println("Tosses add up correctly?"+(cts.getTwoHeads()+cts.getTwoTails()+cts.getHeadTails()==cts.getNumTrials()));
		//Test the run();
		cts.run(1500);
		System.out.println("After run(1500)");
		System.out.println("Number of trials [exp:1500]:"+cts.getNumTrials());
		System.out.println("Two-head tosses: "+cts.getTwoHeads());
		System.out.println("Two-tail tosses: "+cts.getTwoTails());
		System.out.println("One-head one-tail tosses: "+cts.getHeadTails());
		System.out.println("Tosses add up correctly?"+(cts.getTwoHeads()+cts.getTwoTails()+cts.getHeadTails()==cts.getNumTrials()));
		cts.run(1000);
		System.out.println("After run(1000)");
		System.out.println("Number of trials [exp:2500]:"+cts.getNumTrials());
		System.out.println("Two-head tosses: "+cts.getTwoHeads());
		System.out.println("Two-tail tosses: "+cts.getTwoTails());
		System.out.println("One-head one-tail tosses: "+cts.getHeadTails());
		System.out.println("Tosses add up correctly?"+(cts.getTwoHeads()+cts.getTwoTails()+cts.getHeadTails()==cts.getNumTrials()));
		cts.run(500);
		System.out.println("After run(500)");
		System.out.println("Number of trials [exp:3000]:"+cts.getNumTrials());
		System.out.println("Two-head tosses: "+cts.getTwoHeads());
		System.out.println("Two-tail tosses: "+cts.getTwoTails());
		System.out.println("One-head one-tail tosses: "+cts.getHeadTails());
		System.out.println("Tosses add up correctly?"+(cts.getTwoHeads()+cts.getTwoTails()+cts.getHeadTails()==cts.getNumTrials()));
		//Test the reset().
		cts.reset();
		System.out.println("After reset:");
		cts.run(1500);
		System.out.println("After run(1500)");
		System.out.println("Number of trials [exp:1500]:"+cts.getNumTrials());
		System.out.println("Two-head tosses: "+cts.getTwoHeads());
		System.out.println("Two-tail tosses: "+cts.getTwoTails());
		System.out.println("One-head one-tail tosses: "+cts.getHeadTails());
		System.out.println("Tosses add up correctly?"+(cts.getTwoHeads()+cts.getTwoTails()+cts.getHeadTails()==cts.getNumTrials()));
	}
}
