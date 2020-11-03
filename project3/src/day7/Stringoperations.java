package day7;
public class Stringoperations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			doOperation("Lavanya", "Add");
			doOperation("Lavanya", "Replace");
			doOperation("Lavanya", "Remove");
			doOperation("lavanya", "Change");

		}

		public static String doOperation(String inputStr, String operation) {
			String outputStr = "";
			StringBuilder sb = new StringBuilder();

			if ("Add".equals(operation)) {
				outputStr = inputStr.concat(inputStr);
			} else if ("Remove".equals(operation)) {
				char[] chars = inputStr.toCharArray();
				boolean repeatedChar;
				for (int i = 0; i < chars.length; i++) {
				    repeatedChar = false;
				    for (int j = i + 1; j < chars.length; j++) {
				        if (chars[i] == chars[j]) {
				            repeatedChar = true;
				            break;
				        }
				    }
				    if (!repeatedChar) {
				        sb.append(chars[i]);
				    }
				}
				outputStr = sb.toString();

			} else {
				int realindex = 0;
				int num = 0;
				for (int i = 0; i < inputStr.length(); i++) {
					char currChar = inputStr.charAt(i);
					if (realindex % 2 == 0) {
						num++;
						
						if ("Replace".equals(operation)) {
							currChar = '#';
						} else {
							currChar = Character.toUpperCase(currChar);
						}

					}
					realindex++;
					sb.append(currChar);
					outputStr = sb.toString();
				}
			}

			System.out.println("outputStr :: " + outputStr);

			return outputStr;
		}
}
	

