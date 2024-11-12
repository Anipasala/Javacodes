package Testing.Automation;

public class Finding_num_words {

	public static void main(String[] args) {
		String s1="no pain no gain no strain no stress no hard";
        int count=0;
        char s='n';
       
        for (int i=0;i<s1.length();i++){
           
            if (s1.charAt(i)==s){
                count++;
            }
           
        }
        System.out.println(count);
	}

}
