import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Khor {


        public static void main (String[] args){

            try{


                int Option,Exit;
                String kali;

                Kotlin main = new Kotlin();

                do {

                    UIManager.put("OptionPane.messageFont", new Font("Montserrat", Font.BOLD, 14));
                    UIManager.put("OptionPane.buttonFont", new Font("Montserrat", Font.PLAIN, 12));

                    UIManager UI=new UIManager();
                    UIManager.put("OptionPane.background",new ColorUIResource(0,150,136));
                    UIManager.put("Panel.background",new ColorUIResource(238,238,238));



                    Option=Integer.parseInt(JOptionPane.showInputDialog(

                            "     ----------------Main Menu----------------\n"+"\n"+

                                    "1. Add at the beginning \n"+"\n"+

                                    "2. Add  at the end \n"+"\n"+

                                    "3. Search by id.  \n"+"\n"+

                                    "4. Search by name." +  "\n"+"\n"+

                                    "5. Delete by id  \n"+"\n"+

                                    "6. Show students with major age \n"+"\n"+

                                    "7. Show information of girls in 5th grade \n"+"\n"+

                                    "8. Show information of girls and boys in 1th grade \n"+"\n"+

                                    "9. Exit.\n"+"\n"+

                                    " Please enter an option : "));


                    switch(Option){
                        case 1:

                            try{


                                    main.setBeginning();



                            }catch(NullPointerException d){

                                d.printStackTrace();

                                JOptionPane.showMessageDialog(null, "please be logic ");
                            }

                            break;


                        case 2:

                            try{


                                main.setAddEnd();



                            }catch(NullPointerException d){

                                d.printStackTrace();

                                JOptionPane.showMessageDialog(null, "please be logic ");
                            }


                            break;

                        case 3:

                            try{

                                int  id =Integer.parseInt(JOptionPane.showInputDialog(
                                        "Enter the id to search: "));
                                main.getSeeId(id);

                            } catch(NumberFormatException b){
                                JOptionPane.showMessageDialog(null, "DO NOT INSERT LETERS, SIGNS\n"
                                        + "OR EXAGGERATE AMOUNT OF NUMBERS \n"
                                        +" IN THE LICENSE PLATE PLEASE");
                            }catch(NullPointerException d){

                                d.printStackTrace();

                                JOptionPane.showMessageDialog(null, "please be logic ");
                            }


                            break;

                        case 4:

                            try{

                                String name =JOptionPane.showInputDialog(
                                        "Enter the name to search: ");
                                main.getSeeName(name);

                            } catch(NumberFormatException b){
                                JOptionPane.showMessageDialog(null, "DO NOT INSERT LETERS, SIGNS\n"
                                        + "OR EXAGGERATE AMOUNT OF NUMBERS \n"
                                        +" IN THE LICENSE PLATE PLEASE");
                            }catch(NullPointerException d){

                                d.printStackTrace();

                                JOptionPane.showMessageDialog(null, "please be logic ");
                            }



                            break;

                        case 5:

                            try{

                                int  id =Integer.parseInt(JOptionPane.showInputDialog(
                                        "Enter the id to Delete: "));
                                main.setDeleteNode(id);



                            }catch(ArrayIndexOutOfBoundsException c){
                                JOptionPane.showMessageDialog(null,"Please be logic");
                            }

                            break;

                        case 6:


                            try{

                               main.setMajor5();
                               main.simple();
                               main.Major();
                               main.getSimple2();



                            }catch(ArrayIndexOutOfBoundsException c){
                                JOptionPane.showMessageDialog(null,"Please be logic");
                            }

                            break;

                        case 7:

                            main.girls5();

                            break;

                        case 8:

                            main.girls1();
                            main.boys1();

                            break;


                        case 9:
                            Exit=JOptionPane.showConfirmDialog(null, "¿Do you want to exit from the Menu?");
                            if (Exit==0) {


                                break;
                            }
                        default:

                            JOptionPane.showMessageDialog(null, "Non valid option ");
                            break;

                    }


                }while (Option != 9);


                System.exit(0);


            } catch(NumberFormatException a){

                JOptionPane.showMessageDialog(null, "BE LOGIC PLEASE");


            }
        }
}
