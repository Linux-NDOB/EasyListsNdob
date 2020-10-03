import javax.swing.*;

public class nodex {

    public int id;
    public String name;
    public String gender;
    public int age;
    public String grade;
    public String parentName;
    public int parentNumber;
    public String parentEmail;


    //Apuntador
    nodex sig;

    public nodex(int id, String name, String gender, int age, String grade, String parentName, int parentNumber, String parentEmail) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
        this.parentName = parentName;
        this.parentNumber = parentNumber;
        this.parentEmail = parentEmail;
    }

    public void getseeNode(){
        String info="The student information is: \n";
        info += "Id: "+id+"\n";
        info += "Name: "+name+"\n";
        info += "Age: "+age+"\n";
        info += "Gender: "+gender+"\n";
        JOptionPane.showMessageDialog(null, info);
    }

    public void getseeParent(){
        String info="La información del Acudiente  es: \n";

        info += "Name: "+parentName+"\n";
        info += "Number: "+parentNumber+"\n";
        info += "Email: "+parentEmail +"gmail.com"+"\n";

        JOptionPane.showMessageDialog(null, info);
    }

    public void getseeSGrades(){
        String info="La información del Acudiente  es: \n";

        info += "Name: "+name+"\n";
        info += "gender: "+gender+"\n";

        JOptionPane.showMessageDialog(null, info);
    }

}
