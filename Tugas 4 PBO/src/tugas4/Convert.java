package tugas4;

public class Convert extends Output{
    public String NilaiHuruf(){
        if (rata2 >=80 && rata2 <=100) return "A";
        else if(rata2 >= 75 && rata2 < 80) return "B+";
        else if(rata2 >= 65 && rata2 < 75) return "B";
        else if(rata2 >= 60 && rata2 < 65) return "C+";
        else if(rata2 >= 50 && rata2 < 60) return "C";
        else if(rata2 >= 20 && rata2 < 50) return "D";
        else if(rata2 >= 0 && rata2 < 20) return "E";
        else return "Error";
    }

}
