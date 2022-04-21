import java.util.Scanner;

class TimeDemo_userinput {
    int hour; 
    int min; 
    int sec;

    void get_time() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hour = in.nextInt();
        System.out.print("Enter minutes: ");
        min = in.nextInt();
        System.out.print("Enter seconds: ");
        sec = in.nextInt();
    }

    void show_time() {
        System.out.println(hour + ":" + min + ":" + sec);
    }

    public static void main(String args[]) {
        TimeDemo_userinput obj = new TimeDemo_userinput();
        obj.get_time();
        obj.show_time();
    }
}


