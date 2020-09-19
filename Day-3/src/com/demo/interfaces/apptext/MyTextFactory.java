package com.demo.interfaces.apptext;
import com.demo.interfaces.text.Writer;
public class MyTextFactory {
	
	
	public static Writer getWriter(String ttype)
	{
		
		if(ttype.equals("Plain"))
			return new PlainText();
		
		else if(ttype.equals("Decorate"))
			return new DecoratedText();
		else if(ttype.equals("Html"))
			return new HtmlText();
		else
			return null;
		
		
	}

}
