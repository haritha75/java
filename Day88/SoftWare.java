import java.util.Arrays;

public class SoftWare {

    private String workingPlace;
    private int experience;
    private String name;
    private String jobRole;

   private  Private  pvt2[];

    public Private[] getPvt2() {
        return pvt2;
    }

    public void setPvt2(Private[] pvt2) {
        this.pvt2 = pvt2;
    }

    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getBasedOn() {
        return basedOn;
    }

    public void setBasedOn(String basedOn) {
        this.basedOn = basedOn;
    }

    private String basedOn;

    @Override
    public String toString() {
        return "SoftWare{" +
                "workingPlace='" + workingPlace + '\'' +
                ", experience=" + experience +
                ", name='" + name + '\'' +
                ", jobRole='" + jobRole + '\'' +
                ", pvt2=" + Arrays.toString(pvt2) +
                ", basedOn='" + basedOn + '\'' +
                '}';
    }
}
