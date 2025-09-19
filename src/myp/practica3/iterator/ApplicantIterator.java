package myp.practica3.iterator;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import myp.practica3.model.ApplicantNinja;

public class ApplicantIterator implements Iterator<ApplicantNinja> {

	private Iterator<ApplicantNinja> iterator;

	public ApplicantIterator(Hashtable<String, ApplicantNinja> applicants) {
		this.iterator = applicants.values().iterator();
	}

	/**
	 * @return 
	 */
	@Override
	public boolean hasNext() {
		return this.iterator.hasNext();
	}

	/**
	 * @return
	 */
	@Override
	public ApplicantNinja next() {
		if (!this.iterator.hasNext())
			throw new NoSuchElementException("No hay más aspirantes por iterar.");

		return this.iterator.next();
	}
}
