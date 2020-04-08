package tugas4;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame{
    static JButton Convert;
    static JTextField Nim,Nama,Matkul1,Matkul2,Nilai1,Nilai2;
    static Label LabelNim,LabelNama,LabelMatkul1,LabelMatkul2,LabelNilai1,LabelNilai2;

    public  void window(){
        //////////////Deklarasi Atribut GUI//////////////
        setTitle("Hitung Nilai");
        Convert = new JButton("Convert");
        Nim = new JTextField();
        Nama = new JTextField();
        Matkul1 = new JTextField();
        Matkul2 = new JTextField();
        Nilai1 = new JTextField();
        Nilai2 = new JTextField();
        LabelNim = new Label("NIM");
        LabelNama = new Label("Nama");
        LabelMatkul1 =  new Label("Mata Kuliah 1");
        LabelMatkul2 = new Label("Mata Kuliah 2");
        LabelNilai1 =  new Label("Nilai 1");
        LabelNilai2 =  new Label("Nilai 2");
        //////////////Deklarasi Atribut GUI//////////////

        //////////////Membuat Layout//////////////
        setLayout(null);
        add(Convert);
        add(Nim);
        add(Nama);
        add(Matkul1);
        add(Matkul2);
        add(Nilai1);
        add(Nilai2);
        add(LabelNim);
        add(LabelNama);
        add(LabelMatkul1);
        add(LabelMatkul2);
        add(LabelNilai1);
        add(LabelNilai2);
        //////////////Membuat Layout//////////////

        //////////////Meletakkan Layout//////////////
        LabelNim.setBounds(10,10,100,30);
        Nim.setBounds(110,10,210,30);
        LabelNama.setBounds(10,50,100,30);
        Nama.setBounds(110,50,210,30);
        LabelMatkul1.setBounds(10,90,100,30);
        Matkul1.setBounds(110,90,210,30);
        LabelNilai1.setBounds(10,130,100,30);
        Nilai1.setBounds(110,130,210,30);
        LabelMatkul2.setBounds(10,170,100,30);
        Matkul2.setBounds(110,170,210,30);
        LabelNilai2.setBounds(10,210,100,30);
        Nilai2.setBounds(110,210,210,30);

        Convert.setBounds(125,250,100,30);


        pack();
        setSize(350,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //////////////Meletakkan Layout//////////////

        //////////////Action Listerner untuk Output//////////////
        Output o = new Output();
        o.OutputForm();
        //////////////Action Listerner untuk Output//////////////


    }
}
