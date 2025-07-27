int hours;
	int minutes;
	int seconds;
	
 void inputTime(Scanner sc) {
	System.out.println("\nEnter Hours:");
	hours=sc.nextInt();
	System.out.println("\nEnter Minutes:");
	minutes=sc.nextInt();
	System.out.println("\nEnter Seconds:");
	seconds=sc.nextInt();
}
void add(Time t1,Time t2) {
	
	seconds=t1.seconds+t2.seconds;
	minutes=t1.minutes+t2.minutes;
	hours=t1.hours+t2.hours;
	
	if(seconds>=60) {
	  seconds-=60;
	  minutes++;
	}
	if(minutes>=60) {
		minutes-=60;
		hours++;
	}
}

void display() {
	System.out.println(hours+":"+minutes+":"+seconds);
	
}

public static void main(String[] args) {

	Scanner in=new Scanner(System.in);
	
	Time t1=new Time();
	Time t2=new Time();
	
	Time result=new Time();
	
	System.out.println("Enter time t1:");
	t1.inputTime(in);
	System.out.println("Enter time t2:");
	t2.inputTime(in);
	
	result.add(t1, t2);
	
	System.out.println("\nTime t1:");
	t1.display();
	System.out.println("\nTime t2:");
	t2.display();
	System.out.println("\nSum of t1 and t2:");
	result.display();
	
	
}



output 


Enter time t1:

Enter Hours:
7

Enter Minutes:
50

Enter Seconds:
22
Enter time t2:

Enter Hours:
10

Enter Minutes:
32

Enter Seconds:
40

Time t1:
7:50:22

Time t2:
10:32:40

Sum of t1 and t2:
18:23:2