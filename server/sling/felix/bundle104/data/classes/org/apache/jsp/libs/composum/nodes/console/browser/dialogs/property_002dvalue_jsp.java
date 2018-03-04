package org.apache.jsp.libs.composum.nodes.console.browser.dialogs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class property_002dvalue_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<div class=\"form-group widget property-value-widget\">\n");
      out.write("  <label class=\"control-label\">Value</label>\n");
      out.write("  <div class=\"multi-form-content\">\n");
      out.write("    <div class=\"multi-form-item\">\n");
      out.write("      <input class=\"default widget text-field-widget form-control\" type=\"text\" />\n");
      out.write("      <textarea class=\"plaintext widget text-area-widget form-control hidden\" rows=\"4\"></textarea>\n");
      out.write("      <div class=\"richtext composum-widgets-richtext richtext-widget widget form-control hidden\">\n");
      out.write("        <textarea class=\"composum-widgets-richtext_value rich-editor\"></textarea>\n");
      out.write("      </div>\n");
      out.write("      <input class=\"name widget repository-name-widget form-control hidden\" type=\"text\" />\n");
      out.write("      <input class=\"boolean widget checkbox-widget form-control hidden\" type=\"checkbox\" />\n");
      out.write("      <input class=\"number widget number-field-widget form-control hidden\" type=\"text\" />\n");
      out.write("      <div class=\"datetime widget date-time-widget input-group hidden\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" />\n");
      out.write("        <span class=\"input-group-addon\">\n");
      out.write("            <span class=\"glyphicon glyphicon-calendar\"></span>\n");
      out.write("        </span>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"path widget path-widget input-group hidden\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"Select path...\">\n");
      out.write("        <span class=\"input-group-btn\">\n");
      out.write("          <button class=\"select btn btn-default\" type=\"button\" title=\"Select Repository Path\">...</button>\n");
      out.write("        </span>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"reference widget reference-widget input-group hidden\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"Select referenceable...\">\n");
      out.write("        <span class=\"input-group-btn\">\n");
      out.write("          <button class=\"select btn btn-default fa fa-link\" type=\"button\" title=\"Select Repository Path\"></button>\n");
      out.write("        </span>\n");
      out.write("      </div>\n");
      out.write("      <input class=\"jcr-primaryType widget primary-type-widget form-control hidden\" type=\"text\" />\n");
      out.write("      <input class=\"jcr-mixinTypes widget mixin-type-widget form-control hidden\" type=\"text\" />\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"binary widget file-upload-widget hidden\">\n");
      out.write("    <input class=\"form-control\" type=\"file\">\n");
      out.write("  </div>\n");
      out.write("</div>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
