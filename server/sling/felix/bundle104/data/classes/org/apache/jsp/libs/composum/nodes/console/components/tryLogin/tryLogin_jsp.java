package org.apache.jsp.libs.composum.nodes.console.components.tryLogin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tryLogin_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\n");
      out.write("    #force-login {\n");
      out.write("        position: absolute;\n");
      out.write("        top: 0;\n");
      out.write("        bottom: 0;\n");
      out.write("        left: 0;\n");
      out.write("        right: 0;\n");
      out.write("        background: #eee;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #force-login,\n");
      out.write("    #force-login input,\n");
      out.write("    #force-login button {\n");
      out.write("        font-family: sans-serif;\n");
      out.write("        font-size: 16px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #force-login .modal-header button,\n");
      out.write("    #force-login .modal-footer .logout,\n");
      out.write("    #force-login .modal-footer .cancel {\n");
      out.write("        display: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #force-login .modal-content {\n");
      out.write("        width: 400px;\n");
      out.write("        margin: 100px auto;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #force-login .form-group {\n");
      out.write("        margin: 5px 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #force-login .form-group label {\n");
      out.write("        display: inline-block;\n");
      out.write("        width: 80px;\n");
      out.write("        margin-right: 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #force-login .form-group input {\n");
      out.write("        width: 200px;\n");
      out.write("        margin-right: 10px;\n");
      out.write("        border: 1px solid #666;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #force-login .modal-footer .login {\n");
      out.write("        width: 100px;\n");
      out.write("        margin: 10px 0 10px 193px;\n");
      out.write("        border: 1px solid #666;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<script type=\"application/javascript\">\n");
      out.write("    document.addEventListener('DOMContentLoaded', function () {\n");
      out.write("        if (!window.core || typeof window.core.getWidget !== 'function') {\n");
      out.write("            var loginDlg = document.getElementById('user-status-dialog');\n");
      out.write("            var ui = document.getElementById('ui');\n");
      out.write("            var loginForm = loginDlg.innerHTML;\n");
      out.write("            ui.innerHTML = '<div id=\"force-login\">' + loginForm + '</div>';\n");
      out.write("            var forceLogin = document.getElementById('force-login');\n");
      out.write("            var content = document.querySelector('#force-login .modal-content');\n");
      out.write("            content.innerHTML = \"<h3>Console assets not accessible...</h3>\"\n");
      out.write("                    + content.innerHTML\n");
      out.write("                    + \"<p>Check the ACLs. The assets located in<ul><li>'/lib/jslibs' and</li><li>'/libs/composum'</li></ul>must be accessible.</p>\"\n");
      out.write("                    + \"<p>Alternatively sign in with appropriate credentials.</p></div>\";\n");
      out.write("            var formContent = document.querySelector('#force-login .modal-content .modal-body');\n");
      out.write("            formContent.innerHTML = '<input type=\"hidden\" name=\"resource\" value=\"' + document.URL + '\"/>'\n");
      out.write("                    + formContent.innerHTML;\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("</script>");
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
