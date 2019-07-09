package paveldejimas;

import java.util.Random;

public abstract class Skaicius {
	Random rand = new Random();
	int min = 20;
	int max = 100;
	int rng = rand.nextInt((max - min)+1)+min;
//	System.out.println(rng);
	public int getRng() {
		return rng;
	}
	public void setRng(int rng) {
		this.rng = rng;
	}
}
