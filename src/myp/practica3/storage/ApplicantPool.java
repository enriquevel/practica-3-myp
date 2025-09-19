package myp.practica3.storage;

import java.util.Hashtable;
import java.util.Iterator;
import myp.practica3.iterator.ApplicantIterator;
import myp.practica3.model.ApplicantNinja;

public class ApplicantPool implements Iterable<ApplicantNinja> {

	private Hashtable<String, ApplicantNinja> applicants;
	
	public ApplicantPool() {
		this.applicants = new Hashtable<>();
	}

	/**
	 * @return 
	 */
	@Override
	public Iterator<ApplicantNinja> iterator() {
		return new ApplicantIterator(this.applicants);
	}

	public void addApplicant(ApplicantNinja applicant) {

	}
}