package myFor;

import java.util.Iterator;

public class MyFor implements Iterable<Integer> {
	
	private int inizio, fine, incremento;
	
	public MyFor(int inizio, int fine, int incremento) {
		this.inizio = inizio;
		this.fine = fine;
		this.incremento = incremento;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int successiva = inizio;
			
			@Override
			public boolean hasNext() {
				return successiva < fine;
			}
			
			@Override
			public Integer next() {
				final int ritorno = successiva;
				successiva += incremento;		
				return ritorno;
			}
		};
	}
}