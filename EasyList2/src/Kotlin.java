/*
  Agregar la información de un estudiante al final de la lista.

        Insertar la información de un nuevo estudiante, entre dos nodos existentes.

	Agregar la información de un estudiante al principio de la lista (agregar nodos por la cabeza de la lista).

        Buscar la información de un estudiante por identificación.

	Buscar la información de un estudiante nombre. Visualizar la información de contacto del acudiente.

	Eliminar la información de los estudiantes, una vez finalicen el grado quinto de primaria.
 */

import javax.swing.*;


public class Kotlin {



        nodex cab;
        int amount;


        public Kotlin(){ cab=null; }


        public int getLonglista(){
            int cont=0;
            nodex p=cab;
            if(cab==null)
                return 0;
            else{
                while(p!=null){
                    cont++;
                    p=p.sig;
                }
                return cont;
            }
        }



        public nodex getSearchId(int id){

            nodex search=null;

            if(cab==null)

                return null;

            else{

                search=cab;

                while(search!=null){

                    if( search.id == id )

                        return search;

                    search = search.sig;

                }

                return null;

            }

        }



    public nodex getSearchName(String  name) {

        nodex search = null;

        if (cab == null)

            return null;

        else {

            search = cab;

            while (search != null) {

                if (search.name.equals(name))

                    return search;

                search = search.sig;

            }

            return null;

        }
    }

        public nodex getCreateNode(){

            int id , age, parentNumber;
            String name,parentEmail,gender,parentName ,  grade ;

            nodex b=null;

            do{

                id = Integer.parseInt(JOptionPane.showInputDialog(
                        "Please enter the student id: "));

                b=getSearchId(id);

                if(b!=null)

                    JOptionPane.showMessageDialog(null,
                            "The id is registered , please try again!");

                age = Integer.parseInt(JOptionPane.showInputDialog(
                        "Please enter the student age: "));

                if (age < 6){JOptionPane.showMessageDialog(null,
                        "The required age is 6 years old!");

                break;
                 }


            }while(b!=null && age > 6);

            name = JOptionPane.showInputDialog("Please enter the student name");

            Object[] tySex = new Object[]{"M","F"};

            Object xSex = JOptionPane.showInputDialog(null,
                    "Please choose the student sex",
                    "Gender Selection",
                    JOptionPane.QUESTION_MESSAGE,null,tySex ,tySex[0]);

            gender = xSex.toString();

            Object[] tyGrad = new Object[]{"1","2","3","4","5"};

            Object xGrad = JOptionPane.showInputDialog(null,
                    "Please choose the student grade",
                    "Grade Selection",
                    JOptionPane.QUESTION_MESSAGE,null,tyGrad ,tyGrad[0]);

            grade = xGrad.toString();





            parentName = JOptionPane.showInputDialog("please enter the name of the student parent ");

            parentEmail = JOptionPane.showInputDialog("please enter the name of the student parent Email");

            parentNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter the student parent number"));

            if (gender.equals("F") && grade.equals("5")){
                amount++;

            }


                         nodex info = new nodex (
                                 id, name , gender , age, grade,parentName,  parentNumber,
                                  parentEmail);
                         return info;
        }

        public void setBeginning(){

            nodex info = getCreateNode();

            if(cab==null){

                cab=info;

                JOptionPane.showMessageDialog(null,
                        "The node has been added , the list was empty!");

            }else{

                info.sig = cab;

                cab = info;

                JOptionPane.showMessageDialog(null,
                        "Node added at the start of the list");


            }
        }

        public void setAddEnd(){

            nodex info=getCreateNode();

            nodex p=null;

            if(cab==null){

                cab=info;

                JOptionPane.showMessageDialog(null,
                        "The node has been added , the list was empty!");

            }else{

                p=cab;

                while(p.sig!=null)

                    p=p.sig;

                    p.sig=info;

                JOptionPane.showMessageDialog(null,
                        "Element added at the end of the list!");

            }
        }

        public boolean getEmpty(){
            return cab==null?true:false;
        }



        public void getSeeId(int id){

            if(cab==null)

                JOptionPane.showMessageDialog(null,
                        "The list is empty");

            else{

                nodex p=getSearchId(id);


                if(p==null)
                    JOptionPane.showMessageDialog(null,
                            "The element does not exist");

                else

                    p.getseeNode();

            }
        }

    public void getSeeName(String name){

        if(cab==null)

            JOptionPane.showMessageDialog(null,
                    "The list was empty");

        else{

            nodex p=getSearchName(name);

            if(p==null)
                JOptionPane.showMessageDialog(null,
                        "The name does not exist");
            else
                p.getseeParent();

        }
    }

        //Este método retonar un nodo apuntando detrás de p.
        public nodex getBack(nodex p){
            nodex q=cab;
            while(q.sig!=p)
                q=q.sig;
            return q;
        }

        public void setDeleteNode(int id){
            if(getEmpty())
                JOptionPane.showMessageDialog(null,
                        "Empty list");
            else{
                nodex q=null;
                nodex p=getSearchId(id);
                if(p==null)
                    JOptionPane.showMessageDialog(null,
                            "The element does not exist");
                else{
                    if((p==cab)&&(cab.sig==null)){
                        cab=null;
                        JOptionPane.showMessageDialog(null,
                                "The unique element of the has been deleted");
                    }
                    else if((cab.sig!=null)&&(p==cab)){
                        cab=cab.sig;
                        p.sig=null;
                        p=null;
                        JOptionPane.showMessageDialog(null,
                                "Element deleted ath the beginning of the list");
                    }
                    else if(p.sig==null){
                        q=getBack(p);
                        q.sig=null;
                        p=null;
                        JOptionPane.showMessageDialog(null,
                                "Element deleted at the end of the list");
                    }else{
                        q=getBack(p);
                        q.sig=p.sig;
                        p.sig=null;
                        p=null;
                        JOptionPane.showMessageDialog(null,
                                "Element deleted between two nodes");
                    }
                }
            }
        }

        public float getSum5(){
            float sum;
            nodex q;
            if(getEmpty())
                return 0;
            else{
                sum=0;
                q=cab;
                while(q!=null){
                    if (q.gender.equals("F") && q.grade.equals("5")) {
                        sum += q.age;
                        q = q.sig;
                    }
                }
                return sum;
            }
        }

        public float getAverage5(){
            if(cab==null)
                return 0;
            else{
                float tam=(float) getLonglista();
                return getSum5()/ amount;
            }
        }



    public void Major( ){
        nodex temp=null;
        if(getEmpty())
            JOptionPane.showMessageDialog(null,
                    "empty List");
        else{
            nodex p,q;
            p=cab;
            while(p!=null){
                q=cab;
                while(q.sig!=null){
                    if(q.grade.equals("1") && q.age < q.sig.age){
                        temp=new nodex(
                                q.id,
                                q.name,
                                q.gender,
                                q.age,
                                q.grade,
                                q.parentName,
                                q.parentNumber,
                                q.parentEmail
                        );
                        //Empieza el intercambio


                        q.id = q.sig.id;
                        q.name = q.sig. name;
                        q.gender = q.sig.gender;
                        q.age = q.sig.age;
                        q.grade =  q.sig.grade;
                        q.parentName = q.sig.parentName;
                        q.parentNumber = q.sig.parentNumber;
                        q.parentEmail = q.sig.parentEmail;


                        q.sig.id = temp.id;
                        q.sig.name = temp.name;
                        q.sig.gender = temp.gender;
                        q.sig.age = temp.age;
                        q.sig.grade= temp.grade;
                        q.sig.parentName = temp.parentName;
                        q.parentNumber = q.sig.parentNumber;
                        q.sig.parentEmail= temp.parentEmail;

                    }
                    q=q.sig;
                }
                p=p.sig;

            }
        }
    }



    public void setMajor5( ){
        nodex temp=null;
        if(getEmpty())
            JOptionPane.showMessageDialog(null,
                    "Lista vacía!!!");
        else{
            nodex p,q;
            p=cab;
            while(p!=null){
                q=cab;
                while(q.sig!=null){
                    if(q.grade.equals("5") && q.age < q.sig.age){
                        temp=new nodex(
                                q.id,
                                q.name,
                                q.gender,
                                q.age,
                                q.grade,
                                q.parentName,
                                q.parentNumber,
                                q.parentEmail
                        );
                        //Empieza el intercambio


                        q.id = q.sig.id;
                        q.name = q.sig. name;
                        q.gender = q.sig.gender;
                        q.age = q.sig.age;
                        q.grade =  q.sig.grade;
                        q.parentName = q.sig.parentName;
                        q.parentNumber = q.sig.parentNumber;
                        q.parentEmail = q.sig.parentEmail;


                        q.sig.id = temp.id;
                        q.sig.name = temp.name;
                        q.sig.gender = temp.gender;
                        q.sig.age = temp.age;
                        q.sig.grade= temp.grade;
                        q.sig.parentName = temp.parentName;
                        q.parentNumber = q.sig.parentNumber;
                        q.sig.parentEmail= temp.parentEmail;
                    }
                    q=q.sig;
                }
                p=p.sig;

            }
        }
    }
    public void simple() {

        nodex p=null;
        if(getEmpty())
            JOptionPane.showMessageDialog(null,
                    "Empty list");
        else{
            p=cab;
            while(p!=null){
                if (p.grade.equals("1"))
                    p.getseeSGrades();
                p=p.sig;
            }

        }
    }
    public void getSimple2(){
        nodex p=null;
        if(getEmpty())
            JOptionPane.showMessageDialog(null,
                    "Empty list!");
        else{
            p=cab;
            while(p!=null){
                if (p.grade.equals("5"))
                    p.getseeSGrades();
                p=p.sig;
            }

        }
    }

    public void boys1 () {

        nodex p = null;
        if (getEmpty())
            JOptionPane.showMessageDialog(null,
                    "La lista no tiene elementos!");
        else {
            p = cab;
            while (p != null) {
                String info = "La información del Acudiente  es: \n";
                if (p.gender.equals("M") && p.grade.equals("1"))
                    info += "Id: " + p.id + "\n";
                info += "Name: " + p.name +"\n";
                info += "Age: " + p.age + "\n";
                info += "Gender: " + p.gender + "\n";

                JOptionPane.showMessageDialog(null, info);
                p = p.sig;
            }
            JOptionPane.showMessageDialog(null,
                    "Se mostraron todos los elementos de la lista, "
                            + "la lista tiene: " + getLonglista() + " elementos.");
        }


    }
    public void girls1 () {

        nodex p = null;
        if (getEmpty())
            JOptionPane.showMessageDialog(null,
                    "Empty List");
        else {
            p = cab;
            while (p != null) {
                String info = "the studen information is: \n";
                if (p.gender.equals("F") && p.grade.equals("1"))
                    info += "Id: " + p.id + "\n";
                info += "Nombre: " + p.name + "\n";
                info += "Edad: " + p.age + "\n";
                info += "sexo: " + p.gender + "\n";

                JOptionPane.showMessageDialog(null, info);
                p = p.sig;
            }

        }


    }

    public void girls5 () {

        nodex p = null;
        if (getEmpty())
            JOptionPane.showMessageDialog(null,
                    "Empty List");
        else {
            p = cab;
            while (p != null) {
                String info = "The girls information is: \n";
                if (p.gender.equals("F") && p.grade.equals("5"))
                    info += "Id: " + p.id + "\n";
                info += "Name: " + p.name + "\n";
                info += "Age: " + p.age + "\n";
                info += "Gender: " + p.gender + "\n";
                info += "Amount: " + amount + "\n";
                info += "age Average: " + getAverage5() + "\n";

                JOptionPane.showMessageDialog(null, info);
                p = p.sig;
            }

        }


    }
    }

