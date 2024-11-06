import java.util.Scanner;

public class caulenhswitchcase {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n= ");
		n = sc.nextInt();
		switch (n) {
		case 2: {
			System.out.println("Monday: Thứ Hai.");
			break;

		}
		case 3: {
			System.out.println("Tuesday: Thứ Ba.");
			break;
		}
		case 4: {
			System.out.println("Wednesday: Thứ Tư");
			break;
		}
		case 5: {
			System.out.println("Thursday: Thứ Năm.");
			break;
		}
		case 6: {
			System.out.println("Friday: Thứ Sáu.");
			break;
		}
		case 7: {
			System.out.println("Saturday: Thứ Bảy.");
			break;
		}
		case 8: {
			System.out.println("Sunday: Chủ Nhật.");
			break;
		}

		default:
			System.out.println("Incorrect data entry");
		}
	}
}
