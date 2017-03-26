public class Magpie2 {
	public String getGreeting() {
		return "Hello, let's talk.";
	}
	public String getResponse(String statement) {
		String response = "";
		if(statement.length() == 0) {
			response = "Answer plz";
		}
		else if (findKeyword(statement, "no") >= 0) {
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0) {
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "fish") >= 0
				|| findKeyword(statement, "turtle") >= 0) {
					response = "Tell me more about your boring pet.";
		}
		else if (findKeyword(statement, "robinette") >= 0) {
			response = "I heard he doesn't know anything about cars...";
		}
		else {
			response = getRandomResponse();
		}
		return response;
	}
	private boolean isLetter(String c) {
		return (c.compareTo("a") >= 0 && c.compareTo("a") <= 25);
	}
	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = " " + statement.trim().toLowerCase() + " ";
		int psn = phrase.indexOf(goal, startPos);
		if(psn != -1 && (isLetter(phrase.substring(psn - 1, psn)) || isLetter(phrase.substring(psn + goal.length(), psn + goal.length() + 1))))
			return findKeyword(statement, goal, psn + 1);
		
		return psn;
	}
	private int findKeyword(String statement, String goal) {
		return findKeyword(statement, goal, 0);
	}
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";
		return response;
	}
}