package MorseCode;

public class MainFunction {

	public static void main(String[] args) {
		
//args = new String[] {"A=.-;B=-...;C=-.-.;D=-..;E=.;F=..-.;G=--.;H=....;I=..;J=.---;K=-.-;L=.-..;M=--;N=-.;O=---;P=.--.;Q=--.-;R=.-.;S=...;T=-;U=..-;V=...-;W=.--;X=-..-;Y=-.--;Z=--..;","encode","JAVA GO"} ;

		if(args[1].equals("encode"))
		{
			MorseCode.morseTable(args[0]);
			String stringResult1 ;
			stringResult1 = MorseCode.encode(args[2]);
			System.out.println(stringResult1);
			
		}
		else if(args[1].equals("decode"))
		{
			MorseCode.morseTable(args[0]);
			String stringResult2 ;
			stringResult2 = MorseCode.decode(args[2]);
			System.out.println(stringResult2);
		}
	}

}
