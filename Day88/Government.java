public class Government {

    private String deptName;
    private int experience;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;

    @Override
    public String toString() {
        return "Government{" +
                "deptName='" + deptName + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }
}
