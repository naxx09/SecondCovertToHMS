package helloProgram;

import java.util.Scanner;

public class SecondCoverHMS {
	public static void main(String[] args) {
		int secondIn;
		int hour;
		int min;
		int secondOut;
		Scanner in = new Scanner(System.in);

		System.out.print("Give me amount of second: ");
		secondIn = in.nextInt();

		if (secondIn > 3600) {
			// the time is more than 3600 seconds or 1 hour.
			hour = secondIn / 3600;
			min = secondIn % 3600 / 60;
			secondOut = secondIn - hour * 3600 - min * 60;
			System.out.printf("%d seconds = %d hour(s), %d minutes, " + "and %d seconds", secondIn, hour, min, secondOut);
		} else if (secondIn < 3600 && secondIn > 60) {
			// the time is less than 3600 seconds or 1 hour, but more than 60
			// seconds or 1 minutes.
			min = secondIn / 60;
			secondOut = secondIn - min * 60;
			System.out.printf("%d seconds = %d hour, %d minute(s), " + "and %d seconds", secondIn, 0, min, secondOut);
		} else {
			// the time is less than 60 seconds.
			System.out.printf("%d seconds = %d hour, %d minute, " + "and %d second(s)", secondIn, 0, 0, secondIn);
		}

	}
}
