// Program: Digital Watch Simulation
// Features: Nested loop (hours & minutes), stops manually at 13:00 using break

public class DigitalWatch {
    public static void main(String[] args) {

        for(int hour=0; hour<24; hour++){
            for(int min=0; min<60; min++){

                if(hour==13 && min==0){  // simulate power cut
                    System.out.println("\nPower cut! Watch stopped at 13:00");
                    break;
                }

                System.out.println(String.format("%02d:%02d", hour, min));
            }
            if(hour==13) break;
        }
    }
}
