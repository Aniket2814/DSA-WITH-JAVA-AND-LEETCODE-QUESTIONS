import java.util.HashMap;
import java.util.ArrayList;
class MaxFreqCharacter
{
public static void main(String ar[])
{
	System.out.println(maxfreq("ababsabaaaac"));
	
}
public static char maxfreq(String s)
{
	HashMap<Character,Integer> h=new HashMap<>();
	for(int i=0;i<s.length();i++)
	{
	if(h.containsKey(s.charAt(i)))
	{
		int of=h.get(s.charAt(i));
		int nf=of+1;
		h.put(s.charAt(i),nf);
	}
	else
	{
		h.put(s.charAt(i),1);
		
	}
	}
	System.out.println(h);
	ArrayList<Character>  al=new ArrayList<>(h.keySet());
	char curr=' ';
	int max=0;
	for(char ch:al)
	{
		if(h.get(ch)>max)
		{
			max=h.get(ch);
			curr=ch;
		}
	}
	
	return curr;
	
	
}
}