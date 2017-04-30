import	java.util.Scanner;

public class lePlusGrand {
	public static void main(String[] args) {
		int nb1;
		int nb2;
		int nb3;
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez le premier nombre a comparer");
		nb1 = sc.nextInt();
		System.out.println("entrez le deuxieme nombre a comparer");
		nb2 = sc.nextInt();
		System.out.println("entrez le troisieme nombre a comparer");
		nb3 = sc.nextInt();
		if(nb1 > nb2 && nb2 > nb3)
			System.out.println(nb1+">"+nb2+">"+nb3);
		else if(nb1 > nb3 && nb3 > nb2)
			System.out.println(nb1+">"+nb3+">"+nb2);
		else if(nb2 > nb1 && nb1 > nb3)
			System.out.println(nb2+">"+nb1+">"+nb3);
		else if(nb2 > nb3 && nb3 > nb1)
			System.out.println(nb2+">"+nb3+">"+nb1);
		else if(nb3 > nb1 && nb1 > nb2)
			System.out.println(nb3+">"+nb1+">"+nb2);
		else if(nb3 > nb2 && nb2 > nb1)
			System.out.println(nb3+">"+nb2+">"+nb1);
		else
			System.out.println("Error");
	}
}
