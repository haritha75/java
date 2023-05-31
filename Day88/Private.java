public class Private {
    private String deptName;
    private int salary;
    private int experience;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Private{" +
                "deptName='" + deptName + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
