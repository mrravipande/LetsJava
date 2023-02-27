public class forLoop {
    public static void main(String args[]) {

        for(int i=5; i<20; i++) {
            System.out.println(i/2);
        }

        String []car  = {"Honda", "Suzuki", "Kia", "Audi"};
        for(String i : car) {
            if(i=="Kia") {
                break;
            }
            System.out.println(i);
        }


        for (String i : car) {
            if(i=="kia") {
                continue;
            }
            System.out.println(i);
        }
    }
}
