
import java.io.IOException;

import org.jsoup.*;
public class kki {
public static void main(String args[]) throws IOException
{
	final org.jsoup.nodes.Document document=Jsoup.connect("http://www.mituniversity.edu.in/").get();
	System.out.println(document);
	}
}
