import java.util.Arrays;

public class Object_ORiented_Thinking1 {

    public static  void main(String[] args) {


        Profession p = new Profession();
        p.setProfessionName("Teacher");
        p.setExperience(5);

        Teacher t = new Teacher();
        t.setTeacherName("vimala");
        t.setSubName("Maths");

        Teacher t1 = new Teacher();
        t1.setTeacherName("vijaya");
        t1.setSubName("science");

        Teacher teacher[] = {t,t1};
        p.setTeacher(teacher);

        Government gvt1 =  new Government();
        gvt1.setDeptName("Mathmatics");
        gvt1.setSalary(40000);
        gvt1.setExperience(2);

        Government gvt[] = {gvt1};
        t.setGvt(gvt);

        Private pvt1 =  new Private();
        pvt1.setDeptName("Mathmatics");
        pvt1.setSalary(20000);
        pvt1.setExperience(5);

        Private pvt[] = {pvt1};
        t1.setPvt(pvt);

        Profession p1 = new Profession();
        p1.setProfessionName("Doctor");
        p1.setExperience(10);

        Doctor d1 = new Doctor();
        d1.setDoctorType("cardiologists");
        d1.setWorkingLocation("hyd");
        d1.eating();

        Hospital hos = new Hospital();
        hos.setHospitalName("Apollo");
        hos.setFounderName("PRathap C.Reddy");
        hos.setPlace("hyd");
        hos.setRating(5);
        hos.setConstructedYears(20);

        Hospital hospital[] = {hos};
        d1.setHospital(hospital);

        Private p2 = new Private();
        p2.setExperience(20);
        p2.setSalary(70000);

        Private pvt2[] = {p2};
        d1.setPvt(pvt2);
        Profession p7 = new Profession();
        p7.setProfessionName("Software");
        p7.setExperience(2);

        Doctor dc = new Doctor();
        dc.setDoctorType("dentists");
        dc.setWorkingLocation("banglore");

        Doctor dd[] = {d1,dc};
        p1.setDoctor(dd);

        Hospital hos1 = new Hospital();
        hos1.setHospitalName("AMILL");
        hos1.setFounderName("");
        hos1.setPlace("delhi");
        hos1.setRating(4);
        hos1.setConstructedYears(30);

        Hospital hospital1[] = {hos1};
        dc.setHospital(hospital1);

        Government gg = new Government();
        gg.setSalary(1_00_000);
        gg.setExperience(35);

        Government gvmt[] = {gg};
        dc.setGvt(gvmt);


        SoftWare s = new SoftWare();
        s.setName("Ramya");
        s.setBasedOn("java");
        s.setExperience(6);
        s.setJobRole("analyst");
        s.setWorkingPlace("banglore");

        SoftWare softWare[] = {s};
        p7.setSoftware(softWare);

        Private p4 = new Private();
        p4.setSalary(35000);
        p4.setExperience(3);

        Private pvt5[] = {p4};
        s.setPvt2(pvt5);


        System.out.println(p);
        System.out.println(p1);
        System.out.println(p7);




        
    }
    
}
class Profession {
    private String professionName;
    private  int experience;
    private Doctor doctor[];
    private Teacher teacher[];
    private SoftWare software[];

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Doctor[] getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor[] doctor) {
        this.doctor = doctor;
    }

    public Teacher[] getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher[] teacher) {
        this.teacher = teacher;
    }

    public SoftWare[] getSoftware() {
        return software;
    }

    public void setSoftware(SoftWare[] software) {
        this.software = software;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "professionName='" + professionName + '\'' +
                ", experience=" + experience +
                ", doctor=" + Arrays.toString(doctor) +
                ", teacher=" + Arrays.toString(teacher) +
                ", software=" + Arrays.toString(software) +
                '}';
    }
}