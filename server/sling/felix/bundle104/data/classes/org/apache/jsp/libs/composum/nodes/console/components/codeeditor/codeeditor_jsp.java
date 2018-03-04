package org.apache.jsp.libs.composum.nodes.console.components.codeeditor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class codeeditor_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
    _jspx_dependants.add("tld:http://sling.composum.com/cpnl/1.0");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.release();
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  sling:defineObjects
      org.apache.sling.scripting.jsp.taglib.DefineObjectsTag _jspx_th_sling_005fdefineObjects_005f0 = (org.apache.sling.scripting.jsp.taglib.DefineObjectsTag) _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.get(org.apache.sling.scripting.jsp.taglib.DefineObjectsTag.class);
      _jspx_th_sling_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sling_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_sling_005fdefineObjects_005f0 = _jspx_th_sling_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_sling_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.reuse(_jspx_th_sling_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.reuse(_jspx_th_sling_005fdefineObjects_005f0);
      org.apache.sling.api.SlingHttpServletRequest slingRequest = null;
      org.apache.sling.api.SlingHttpServletResponse slingResponse = null;
      org.apache.sling.api.resource.Resource resource = null;
      javax.jcr.Node currentNode = null;
      org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
      org.apache.sling.api.scripting.SlingScriptHelper sling = null;
      org.slf4j.Logger log = null;
      org.apache.sling.api.scripting.SlingBindings bindings = null;
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");
      out.write("\n");
      out.write("<div class=\"modal-content widget code-editor-widget\">\n");
      out.write("\n");
      out.write("    <div class=\"code-editor-widget_header modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span\n");
      out.write("                aria-hidden=\"true\">&times;</span></button>\n");
      out.write("        <h4 class=\"code-editor-widget_title modal-title\"></h4>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"code-editor-widget_body modal-body\">\n");
      out.write("        <div class=\"code-editor-widget_editor code-editor\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"code-editor-widget_footer modal-footer buttons\">\n");
      out.write("        <div class=\"code-editor-widget_toolbar toolbar\">\n");
      out.write("            <div class=\"search input-group input-group-sm text-group\">\n");
      out.write("                <input type=\"text\" class=\"find-text form-control\" placeholder=\"search in text\">\n");
      out.write("                <span class=\"find-prev fa fa-chevron-left input-group-addon\" title=\"find previous\"></span>\n");
      out.write("                <span class=\"find-next fa fa-chevron-right input-group-addon\" title=\"find next\"></span>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"checkbox\" class=\"match-case form-control\" title=\"regex\"><span\n");
      out.write("                class=\"checkbox-label\">match case</span>\n");
      out.write("            <input type=\"checkbox\" class=\"find-regex form-control\" title=\"regex\"><span\n");
      out.write("                class=\"checkbox-label\">regex</span>\n");
      out.write("            <div class=\"replace input-group input-group-sm text-group\">\n");
      out.write("                <input type=\"text\" class=\"replace-text form-control\" placeholder=\"replace with...\">\n");
      out.write("                <span class=\"replace fa fa-play input-group-addon\" title=\"replace this\"></span>\n");
      out.write("                <span class=\"replace-all fa fa-fast-forward input-group-addon\" title=\"replace all\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
      out.write("                <button type=\"button\" class=\"undo fa fa-undo btn btn-default\" title=\"Undo last change\"><span\n");
      out.write("                        class=\"label\">Undo</span></button>\n");
      out.write("                <button type=\"button\" class=\"redo fa fa-repeat btn btn-default\" title=\"Redo last undo\"><span\n");
      out.write("                        class=\"label\">Redo</span></button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <button type=\"button\" class=\"btn btn-default cancel\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary save\">Save</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-default save-and-close\">Save & Close</button>\n");
      out.write("    </div>\n");
      out.write("\n");
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
