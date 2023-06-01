package department;

public class Department {
    
    private String deptCode;
    private String deptPlace;
    private String deptMail;
    private long contantNum;
    DEPTNAME deptName;


    public DEPTNAME getDeptName() {
        return deptName;
    }

    public void setDeptName(DEPTNAME deptName) {
        this.deptName = deptName;
    }

    public long getContantNum() {
        return contantNum;
    }

    public void setContantNum(long contantNum) {
        this.contantNum = contantNum;
    }



    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptPlace() {
        return deptPlace;
    }

    public void setDeptPlace(String deptPlace) {
        this.deptPlace = deptPlace;
    }

    public String getDeptMail() {
        return deptMail;
    }

    public void setDeptMail(String deptMail) {
        this.deptMail = deptMail;
    }

    @Override
    public String toString() {
        return "Department{" +
                ", deptCode='" + deptCode + '\'' +
                ", deptPlace='" + deptPlace + '\'' +
                ", deptMail='" + deptMail + '\'' +
                ", contantNum=" + contantNum +
                ", deptname=" + deptName +
                '}';
    }
}
