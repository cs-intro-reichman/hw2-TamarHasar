public class TimeCalc {
    public static void main(String[] args) {
        int originalHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1)); //4685 / 60 = 78;
        int originalMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));//(10 hours * 60 minutes) + 30 minutes + 4055 minutes = 4685 minutes;
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (originalHours * 60) + originalMinutes + minutesToAdd;
        int totalHours = (totalMinutes / 60);
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        if (newHours < 10 ){
            System.out.print("0" + newHours + ":");
        }
        else{
            System.out.print(newHours + ":");
        }

        if (newMinutes < 10){
            System.out.println("0" + newMinutes);
        }

        else{ 
            System.out.println(newMinutes);       
        }
    }
}
