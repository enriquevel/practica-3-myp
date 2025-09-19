package myp.practica3.model;

import java.util.ArrayList;
import java.util.List;
import myp.practica3.builder.Package;
import myp.practica3.factory.TrainingCamp;

public class Group {
    private VolunteerNinja volunteer;
    private List<ApplicantNinja> applicants = new ArrayList<>();
    private Package pack;
    private TrainingCamp trainingCamp;


    public Group(VolunteerNinja volunteer, List<ApplicantNinja> applicants, Package pack, TrainingCamp trainingCamp) {
        this.volunteer = volunteer;
        this.applicants = applicants;
        this.pack = pack;
        this.trainingCamp = trainingCamp;
    }

}
