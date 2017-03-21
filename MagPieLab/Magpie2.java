public class Magpie2 {
	public String getGreeting() {
		return "Hello, let's talk.";
	}
	public String getResponse(String statement) {
		String response = "";
		if(statement.length() == 0) {
			response = ("Answer plz");
		}
		else if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		}
		else if (statement.indexOf("Robinette") >= 0)
		{
			response = "I heard he doesn't know anyhting about cars.";
		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("turtle") >= 0)
		{
			response = "Tell me about your boring pets.";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else {
			response = getRandomResponse();
		}
		return response;
	}
	private int findKeyword(String statement, String goal, int startPos) {
		return -1;
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
