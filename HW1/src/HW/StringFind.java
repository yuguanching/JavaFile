package HW;

public class StringFind {

	public static void main(String[] args) {
		

		
//		宣告字串讀取XML內容
		String str1 = args[0];
		
		String sum ;
		sum = str1 ;
		
//		取出tag標籤內的內容
		String temp  ;
		temp = sum.substring(sum.indexOf(">",1)+1,sum.indexOf("<",2)) ;
		
//		存取Temp的長度
		int length1 = temp.length() ;
		
//		依照if的敘述印出最後結果
		String result = "\0" ;
		
		if((sum.charAt(sum.indexOf(temp,20)+length1)!='>'))
			{
				if(sum.charAt(sum.indexOf(">",sum.indexOf(temp,20))-1)!='/')
					{
						result = sum.substring(sum.indexOf(temp,20)+length1,sum.indexOf(">",sum.indexOf(temp,20)));
					}
				else
					{
						
					result = sum.substring(sum.indexOf(temp,20)+length1,sum.indexOf("/>",sum.indexOf(temp,20)));
					}

			}
				
		System.out.println(result);
	}

}
