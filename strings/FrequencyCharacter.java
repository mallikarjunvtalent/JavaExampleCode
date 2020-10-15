package strings;

public class FrequencyCharacter {
	public static void main(String[] args)
	{
		String input="Welcome to Java session Session Session"; 		//Input String	
		
		input =input.toLowerCase();
		
		String[] words=input.split(" ");	//Split the word from String
		int wrc=1;							//Variable for getting Repeated word count
		
		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
		{
			for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
			{
				
			if(words[i].equals(words[j]))	//Checking for both strings are equal
				{
					wrc++;				//if equal increment the count
					words[j]="0";			//Replace repeated words by zero
				}
			}
			if(words[i]!="0")
			System.out.print(words[i]+"--"+wrc+" ");	//Printing the word along with count
			wrc=1;
			
	     }  
		
		System.out.println();
		
		 String str = "picture perfect";    
	        int[] freq = new int[str.length()];    
	        int i, j;    
	            
	        //Converts given string into character array    
	        char string[] = str.toCharArray();    
	            
	        for(i = 0; i <str.length(); i++) {    
	            freq[i] = 1;    
	            for(j = i+1; j <str.length(); j++) {    
	                if(string[i] == string[j]) {    
	                    freq[i]++;    
	                        
	                    //Set string[j] to 0 to avoid printing visited character    
	                    string[j] = '0';    
	                }    
	            }    
	        }    
	        //Displays the each character and their corresponding frequency    
	        System.out.println("Characters and their corresponding frequencies");    
	        for(i = 0; i <freq.length; i++) {    
	            if(string[i] != ' ' && string[i] != '0')    
	                System.out.print(string[i] + "-" + freq[i]+" ");    
	        } 
			
	}
}
