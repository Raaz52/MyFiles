import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Label extends JFrame implements ActionListener {
    JPanel panel;
    JLabel title,firstname,secondname,gender,dob,ct,addr;
    JTextField ftxt,ltxt,dbtxt;
    JRadioButton male,female;
    ButtonGroup bg;
    JComboBox city;
    JButton submit,reset,cancel;
    JTextArea adress;
    public Label()
    {}
    public void setComponents()
    {
    panel=new JPanel();
    title=new JLabel("Information");
    firstname=new JLabel("First Name");
    secondname=new JLabel("Second Name");
    addr=new JLabel("Permanent Adresss");
    adress=new JTextArea(10,20);
    ftxt=new JTextField(5);
    ltxt=new JTextField(5);
    dbtxt=new JTextField(5);
    male=new JRadioButton("Male");
    female=new JRadioButton("Female");
    bg=new ButtonGroup();
    gender=new JLabel("Gender");
    dob=new JLabel("Date Of Birth");
    ct=new JLabel("City");
    submit=new JButton("Submit");
    reset=new JButton("Reset");
    cancel=new JButton("Cancel");
    city=new JComboBox();
    city.addItem("Select");
    city.addItem("Bhopal");
    city.addItem("Indore");
    city.addItem("Delhi");
    city.addItem("Patna");
    city.addItem("Mumbai");
    city.addItem("Chennai");
    city.addItem("Banglore");
    
    panel.setLayout(null);
    title.setBounds(100,0,100,20);
    firstname.setBounds(50,30,100,20);
    secondname.setBounds(50,50,100,20);
    ftxt.setBounds(150,30,100,20);
    ltxt.setBounds(150,50,100,20);
    dbtxt.setBounds(150,90,100,20);
    gender.setBounds(50,70,100,20);
    male.setBounds(150,70,100,20);
    female.setBounds(250,70,100,20);
    dob.setBounds(50,90,100,20);
    ct.setBounds(50,110,100,20);
    city.setBounds(150,110,100,20);
    submit.setBounds(50,170,100,20);
    reset.setBounds(200,170,100,20);
    cancel.setBounds(120,200,100,20);
    addr.setBounds(50,140,130,20);
    adress.setBounds(170,140,100,30);
    panel.add(title);
    panel.add(firstname);
    panel.add(ftxt);
    //ftxt.setSize(500,100);
    panel.add(secondname);
    panel.add(ltxt);
    panel.add(dbtxt);
    panel.add(gender);
    bg.add(male);
    bg.add(female);
    panel.add(male);
    panel.add(female);
    panel.add(dob);
    panel.add(ct);
    panel.add(city);
    panel.add(submit);
    panel.add(reset);
    panel.add(cancel);
    panel.add(addr);
    panel.add(adress);
    //ltxt.setSize(500,100);
    setTitle("Registration");
    setVisible(true);
    setSize(300,300);
    add(panel);
    reset.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
    if(e.getSource()==reset)
    {
    ftxt.setText(null);
    ltxt.setText(null);
    dbtxt.setText(null);
    adress.setText(null);
    }
    }
    public static void main(String[] args)
    {
    Label lb=new Label();
    lb.setComponents();
    }
}
