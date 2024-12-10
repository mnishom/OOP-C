package controlstatement;

public class SOAL1 {

    private static void soalTest() {
        System.out.println("Test");
    }

    //silahkan buat jawaban masing-masing
    private static void soal3() {
        for (int i = 1; i <= 100; i += 3) {
//            if (i + 3 <= 100){
//                System.out.print(i + ", ");
//            } else {
//            System.out.print(i);
//            }
            System.out.print(i < 100 ? i + "," : i);
        }
    }

    private static void soal2(){
        for (int i = 1; i <= 10e+6; i++) {
            if(i % 7 == 0 || i % 2 == 0) continue;
            System.out.print(i < 10e+6 - 1 ? i + "," : i);
        }
    }private static void soal5(){
        for (int i = 2; i<= 10; i +=2){
            System.out.print(i);
            
            if (i < 10){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    
    private static void soal4(){
        for (int i = 100; i >= 1; i -=5) {
            System.out.print(i + (i > 5 ? "," : " "));
            
        }
    }
    
    private static void soal1(){
        for (int i = 10; i >= 1; i--){
            if (i % 2 != 0){
            System.out.print(i > 1 ? i + ", " : 1);
            }    
   
        }
    }
    public static void main(String[] args) {
//        soalTest();
        soal1();
       
    }
}
