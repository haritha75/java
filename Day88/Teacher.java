import java.util.Arrays;

public class Teacher {

    private String subName;
    private  String teacherName;
    private Government gvt[];
    private Private pvt[];

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


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

    @Override
    public String toString() {
        return "Teacher{" +
                "subName='" + subName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", gvt=" + Arrays.toString(gvt) +
                ", pvt=" + Arrays.toString(pvt) +
                '}';
    }
}
