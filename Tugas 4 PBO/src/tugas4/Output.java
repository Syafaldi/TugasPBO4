package tugas4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Output extends GUI {
    static double rata2;
    public void OutputForm(){
        Convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String DataNim = Nim.getText();
                System.out.println("Nim : "+DataNim);

                String DataNama = Nama.getText();
                System.out.println("Nama : "+DataNama);

                String DataMatkul1 = Matkul1.getText();
                System.out.println("Matkul 1 : "+DataMatkul1);
                String DataNilai1 = Nilai1.getText();
                int IntNilai1 = Integer.parseInt(DataNilai1);


                String DataMatkul2 = Matkul2.getText();
                System.out.println("Matkul 2 : "+DataMatkul2);
                String DataNilai2 = Nilai2.getText();
                int IntNilai2 = Integer.parseInt(DataNilai2);

                rata2 = (IntNilai1+IntNilai2)/2.0;
                System.out.println("Nilai rata-rata :"+rata2);

                Convert c = new Convert();
                System.out.println("Nilai Huruf : "+c.NilaiHuruf());
            }
        });
    }
}
