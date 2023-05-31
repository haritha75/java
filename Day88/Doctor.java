import java.util.Arrays;

public class Doctor {

  private  String workingLocation;
  private  String doctorType;
  private  int experience;
  private Hospital[] hospital;
  private Government gvt[];
  private Private pvt[];



    public Government[] getGvt() {
        return gvt;
    }

    public void setGvt(Government[] gvt) {
        this.gvt = gvt;
    }

    public Private[] getPvt() {
        return pvt;
    }

    public void setPvt(Private[] pvt) {
        this.pvt = pvt;
    }


    public Hospital[] getHospital() {
        return hospital;
    }

    public void setHospital(Hospital[] hospital) {
        this.hospital = hospital;
    }

    public String getWorkingLocation() {
        return workingLocation;
    }

    public void setWorkingLocation(String workingLocation) {
        this.workingLocation = workingLocation;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void eating() {
        System.out.println("doctors takes healthy food");
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "workingLocation='" + workingLocation + '\'' +
                ", doctorType='" + doctorType + '\'' +
                ", experience=" + experience +
                ", hospital=" + Arrays.toString(hospital) +
                ", gvt=" + Arrays.toString(gvt) +
                ", pvt=" + Arrays.toString(pvt) +
                '}';
    }
}
