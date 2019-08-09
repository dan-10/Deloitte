import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Customtag extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut(); 
		
		try {
			out.println("<h4>Address of Me</h4>");
			out.println("<h4>Don't know</h4>");
			out.println("<h4>Where I am</h4>");
			out.println("<h4>Staying know</h4>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}
