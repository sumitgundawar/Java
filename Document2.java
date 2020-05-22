class DemoApplication {
	public static void main(String[] args) {
		String user = "abcabcabc";
		String pat = "ad";
		boolean flag = true;

		for(int i = 0; i < user.length(); ) {

			for(int j =0; j< pat.length(); j++) {

				if (i >= user.length()) {
						flag = false;
						break;
				}

				if (i < user.length() && user.charAt(i++) != pat.charAt(j)) {
					flag = false;
					break;
				}
			}

			if(flag) {

				int start_index = i-pat.length();
				int end_index = i;
				System.out.println("Start " + start_index + " End " + end_index);
				char[] temp = new char[user.length()];
				int counter = 0;
				if (start_index == 0) {

					for(int j = i; j <user.length(); j++)
						temp[counter++] = user.charAt(j);

				}else if (end_index == user.length()) {

					for(int j = 0; j < start_index; j++)
						temp[counter++] = user.charAt(j);

				}else{

					for(int j = 0; j < start_index; j++)
						temp[counter++] = user.charAt(j);

					for(int j = end_index; j < user.length(); j++)
						temp[counter++] = user.charAt(j);

				}

				user = String.valueOf(temp);
				System.out.println( user + " " +user.length());
				i = 0;
			}
			flag = true;
		}
	}
}
