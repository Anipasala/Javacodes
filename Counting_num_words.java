package Testing.Automation;

public class Counting_num_words {

	public static void main(String[] args) {
		String s1="no pain no gain";
        int count=0;
       
        for (int i=0;i<s1.length();i++){
           
            if (s1.charAt(i)!=' '){
                count++;
            }
           
        }
        System.out.println(count + " Number of words");
	}

}
