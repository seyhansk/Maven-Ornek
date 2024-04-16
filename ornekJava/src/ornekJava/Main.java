package ornekJava;
import org.apache.commons.lang3.StringUtils;
public class Main {
	
	public static void main (String[] args) {
		
		String orijinalMetin = "aa        bb ccccc";
		String duzeltilmisMetin = StringUtils.deleteWhitespace(orijinalMetin);
		System.out.println("\"" + orijinalMetin + "\" -> \"" + duzeltilmisMetin + "\"");

}
}
