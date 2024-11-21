// I gave a working example of a student!
public class Main {
    public static void main(String[] args){

        student MelC = new student("Melissa","Senior",3.4,102);
        student Mickey = new student("Mickey","Sophomore",4.0,105);
        student Victor = new student("Victor","Sophomore",3.6,107);
        student Pablo = new student("Pablo","Sophomore",3.2,101);
        student David = new student("David","Senior",2.8,109);
        student Nick = new student("Nick","Junior",0.0,108);


        MelC.HonorRoll();
        Mickey.HonorRoll();
        Victor.HonorRoll();
        Pablo.HonorRoll();
        David.HonorRoll();
        Nick.HonorRoll();

        System.out.println();
        
        MelC.FreeLunch();
        Mickey.FreeLunch();
        Victor.FreeLunch();
        Pablo.FreeLunch();
        David.FreeLunch();
        Nick.FreeLunch();

    }
}








