import java.util.Scanner;

public class chuyendoinhiphan {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên n>0 ");
		n = sc.nextInt();
		String nhiPhan = "";
		while (n > 0) {
			nhiPhan = (n % 2) + nhiPhan;
			n = n / 2;
		}
		System.out.println("Hệ nhị phân " + nhiPhan);
	}
}
