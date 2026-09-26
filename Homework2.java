import java.util.Scanner;


class Student
{
    int studentId;
    String name;
    String major;
    long phone;

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setMajor(String major)
    {
        this.major = major;
    }
    public void setPhone(long phone)
    {
        this.phone = phone;
    }


    public int getStudentId()
    {
        return studentId;
    }
    public String getName()
    {
        return name;
    }
    public String getMajor()
    {
        return major;
    }
    public long getPhone()
    {
        return phone;
    }


    public String getFormattedPhone()
    {
        String phoneStr = "0" + Long.toString(this.phone);
        return phoneStr.substring(0, 3) + "-" + phoneStr.substring(3, 7) + "-" + phoneStr.substring(7);
    }
}


public class Homework2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        Student[] students = new Student[3];


        for (int i = 0; i < 3; i++)
        {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");


            String idStr = scanner.next();
            String name = scanner.next();
            String major = scanner.next();
            String phoneStr = scanner.next();


            int id = Integer.parseInt(idStr);
            long phone = Long.parseLong(phoneStr);


            students[i] = new Student();


            students[i].setStudentId(id);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhone(phone);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");


        for (int i = 0; i < 3; i++)
            System.out.printf("%d번째 학생: %d %s %s %s\n", (i + 1), students[i].getStudentId(), students[i].getName(), students[i].getMajor(), students[i].getFormattedPhone());



    }
}