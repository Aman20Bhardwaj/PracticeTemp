package package1;

import MyPracticeJava.Google;

public class YouTube extends Google {
	protected void addAdvertisement(boolean addAdver) {
		havePremiunAcc = addAdver;
	}

	String skipAdvertisement() {
		if (!havePremiunAcc) {
			return "allow add";
		} else {
			return "do not allow";
		}
	}

	public static void main(String[] args) {
		YouTube youTube = new YouTube();
		youTube.addAdvertisement(true);
		System.out.println(youTube.skipAdvertisement());
	}
}
