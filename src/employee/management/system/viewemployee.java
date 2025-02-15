package employee.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class viewemployee extends JFrame implements ActionListener {

    Choice  choiceEmp;
    JTable table;
    JButton searchbtn, print, update, back;

    viewemployee(){

        getContentPane().setBackground(new Color(255,131,122));
        JLabel search = new JLabel("Search by employee id");
        search.setBounds(20,20,150,20);
        add(search);

        choiceEmp = new Choice();
        choiceEmp.setBounds(180,20,150,20);
        add(choiceEmp);

        try{
            con con = new con();
            ResultSet resultSet = con.statement.executeQuery("select * from employee");
            while (resultSet.next()){
                choiceEmp.add(resultSet.getString("empid"));
            }

        }catch (Exception E){
            E.printStackTrace();
        }

        table = new JTable();
        try {
            con con = new con();
            ResultSet resultSet = con.statement.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception E){
            E.printStackTrace();
        }

        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(0,100,900,600);
        add(jScrollPane);


        searchbtn = new JButton("Search");
        searchbtn.setBounds(20,70,80,20);
        searchbtn.addActionListener(this);
        add(searchbtn);

        print = new JButton("Print");
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print);

        update = new JButton("Update");
        update.setBounds(220,70,80,20);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(320,70,80,20);
        back.addActionListener(this);
        add(back);

        setSize(900,700);
        setLayout(null);
        setLocation(300,100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==searchbtn){
            String query = "select * from employee where empid = '"+choiceEmp.getSelectedItem()+"' ";
            try {
                con con = new con();
                ResultSet resultSet = con.statement.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource()== print) {
            try{
                table.print();
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource()==update) {
            setVisible(false);
            new updateemployee(choiceEmp.getSelectedItem());
            
        }else{
            setVisible(false);
            new mainclass();
        }
    }

    public static void main(String[] args) {
        new viewemployee();

    }

}
