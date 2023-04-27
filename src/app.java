import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
import java.awt.BorderLayout;
import java.awt.*;


public class app{
     
     public static void main(String[] args) {
          loginUser main_form = new loginUser(1 , "Filipus", "manik");
          main_form.loginUser(150, 200);
     }

     public static void connect(){

     }

     // public static void main(String args[]) {
     //       JFrame frame = new JFrame("SpringLayout");
     //       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


     //       JPanel ok = new JPanel();

     //       JScrollPane scroll = new JScrollPane();
     //       // Container contentPane = frame.getContentPane();

     //      // JButton next = new JButton("Next");

     //      // JPanel buttonPanel = new JPanel();
     //      // buttonPanel.add(next);
     //       // SpringLayout layout = new SpringLayout();

     //       JPanel mainPanel = new JPanel();
     //       // mainPanel.setLayout(layout);
     //       // contentPane.setLayout(new BorderLayout());


     //       // int j = 25;
     //       // for(int i =0;i<18;i++){
     //       //     JLabel label = new JLabel("Enter Name " + i );
     //       //     JTextField text = new JTextField(15);

     //       // mainPanel.add(label);
     //       // mainPanel.add(text);

     //       // layout.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST,
     //       //                 contentPane);
     //       // layout.putConstraint(SpringLayout.NORTH, label, j, SpringLayout.NORTH,
     //       //                 contentPane);
     //       // layout.putConstraint(SpringLayout.NORTH, text, j, SpringLayout.NORTH,
     //       //                 contentPane);
     //       // layout.putConstraint(SpringLayout.WEST, text, 20, SpringLayout.EAST,
     //       //                 label);
     //       // j+=30;
     //       // }

     //       mainPanel.setPreferredSize(new Dimension(400, 1500));
     //       // scroll.setPreferredSize(new Dimension(500,500));
     //       scroll.setBounds(0,0,400,500);
     //       scroll.setViewportView(mainPanel);
     //       // contentPane.add(scroll);
     //       ok.setBounds(0,0,500,600);
     //       ok.setVisible(true);
     //       ok.add(scroll);
     //       frame.add(ok);
     //       // contentPane.add(buttonPanel,BorderLayout.SOUTH);
     //       //mainWindow.add(contentPane);
     //       frame.setSize(500, 600);
     //       frame.setVisible(true);
     // }
}
