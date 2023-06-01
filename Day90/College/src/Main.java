import classroom.Classroom;
import computerlab.ComputerLab;
import computerlab.LabSubjects;
import department.DEPTNAME;
import department.Department;
import library.Books;
import library.Fiction;
import library.Library;
import staff.GENDER;
import staff.Staff;
import staff.non_teaching.Non_Teaching;
import staff.non_teaching.POSTNAME;
import staff.teaching.STAFFSUBJECT;
import staff.teaching.Teaching;
import students.Student;

import java.awt.print.Book;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Department department = new Department();
        department.setDeptName(DEPTNAME.MCA);
        department.setDeptCode("20202");
        department.setContantNum(8903885612L);
        department.setDeptMail("mca.org");
        department.setDeptPlace("Tirupati");


        Student student = new Student();
        student.setStudentName("Reddyrani");
        student.setAge(21);
        student.setGender(GENDER.FEMALE);
        student.setSection("A");
        student.setRollNumber(601216312);
        student.setApplicantID(201233568L);

        Teaching teaching = new Teaching();
        teaching.setName("vijayalakshmi");
        teaching.setSalary(1_00_000);
        teaching.setGender(GENDER.FEMALE);
        teaching.setExperience(6);
        teaching.setStaffsubject(STAFFSUBJECT.CHEMISTRY);
        teaching.setContantNum(7856439867L);


        Non_Teaching nonTeaching = new Non_Teaching();
        nonTeaching.setName("ramesh");
        nonTeaching.setGender(GENDER.MALE);
        nonTeaching.setSalary(35000);
        nonTeaching.setPostname(POSTNAME.ATTENDER);
        nonTeaching.setContantNum(78956436787L);

        Library library = new Library();
        library.setReadingChairs(10);
        library.setShelves(30);

        Books book = new Books();
        book.setFiction(Fiction.FANTASY);

        Classroom classroom = new Classroom();
        classroom.setAC(false);
        classroom.setBenches(23);
        classroom.setChairs(12);
        classroom.setProjector(2);

        ComputerLab computerLab = new ComputerLab();
        computerLab.setComputers(44);
        computerLab.setLabSubjects(LabSubjects.JAVA);
        computerLab.setincharge("shalini");


        System.out.println(department);
        System.out.println(student);
        System.out.println(teaching);
        System.out.println(nonTeaching);
        System.out.println(library);
        System.out.println(book);
        System.out.println(classroom);
        System.out.println(computerLab);





    }
}