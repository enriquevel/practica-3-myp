package myp.practica3.model;

import java.util.List;
import myp.practica3.builder.package;
public class Group {
    private VolunteerNinja volunteer;
    private List<ApplicantNinja> applicants = new ArrayList<>
    private Package package;
    private TrainingCamp trainingCamp;


    public Group(VolunteerNinja volunteer, List<ApplicantNinja> applicants, Package package, TrainingCamp trainingCamp) {
        this.volunteer = volunteer;
        this.applicants = applicants;
        this.package = package;
        this.trainingCamp = trainingCamp;
    }

}
