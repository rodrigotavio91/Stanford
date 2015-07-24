import acm.program.*;

public class StringReplacement extends ConsoleProgram {
	
	private String replaceFirstOccurence(String str, String orig, String repl) {
		int index = str.indexOf(orig);
		if (index != -1) {
			str = str.substring(0, index) +
				  repl +
				  str.substring(index + orig.length());
		}
		return str;
	}
	
	private String stanfordize(String str) {
		str = replaceFirstOccurence(str, "florence moore", "flomo");
		str = replaceFirstOccurence(str, "memorial church", "memchu");
		str = replaceFirstOccurence(str, "computer science", "cs");
		str = replaceFirstOccurence(str, "psychology", "psych");
		str = replaceFirstOccurence(str, "economics", "econ");
		str = replaceFirstOccurence(str, "my most fun class", "cs106A");
		return str;
	}
	
	public void run() {
		setFont("Times New Roman 24");
		while (true) {
			String line = readLine("Enter line to \"Stanfordize\": ");
			if (line.equals("")) break;
			println("As Stanford, we say: " + stanfordize(line));
		}
		println("Thank you for visiting Stanford");
	}

}
