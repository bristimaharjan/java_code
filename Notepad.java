package GUI;

import javax.swing.*;
import java.awt.*;

public class Notepad extends JFrame {
    JMenuBar menu;
    JMenu File,Edit,Format,View,Help;
    JMenuItem i1,i2,i3,i4;
    JMenuItem i5,i6,i7,i8;
    JScrollBar j1,j2;

    JScrollPane p1;

    Notepad(){

        setTitle("Notepad");
        menu=new JMenuBar();
        setJMenuBar(menu);
        File=new JMenu("File");
        Edit=new JMenu("Edit");
        Format=new JMenu("Format");
        View=new JMenu("View");
        Help=new JMenu("Help");
        i1=new JMenuItem("New");
        i2=new JMenuItem("Open");
        i3=new JMenuItem("Save");
        i4=new JMenuItem("Exit");
        i5=new JMenuItem("Replace");
        i6=new JMenuItem("Wrap text");
        i7=new JMenuItem("Zoom");
        i8=new JMenuItem("View help");
        j1=new JScrollBar();
       // add(j1,BorderLayout.EAST);

        j2=new JScrollBar(Adjustable.HORIZONTAL);//add(j2,BorderLayout.SOUTH);
        p1=new JScrollPane(new JTextArea());


       add(p1);
        menu.add(File);
        File.add(i1);
        File.add(i2);
        File.add(i3);
        File.add(i4);
        menu.add(Edit);
        Edit.add(i5);
        menu.add(Format);
        Format.add(i6);
        menu.add(View);
        View.add(i7);
        menu.add(Help);
        Help.add(i8);




        setSize(200,200);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Notepad();

    }
}
