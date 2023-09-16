package controller;

import model.PilhaInt;

public class FatController {

	public FatController() {
		super();
	}
	
	static PilhaInt p = new PilhaInt();
	
	public long Fat (int N, int i) throws Exception{
		long X;
		if (i > N) {
			X = p.pop() * p.pop();
			return X;
		}
		else {
			p.push(i);
			X = Fat(N, i+1);
			if (!p.isEmpty()) {
				X = X * p.pop();
			}
			return X;
		}
	}

}
