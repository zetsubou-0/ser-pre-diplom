package org.apache.jsp.libs.composum.nodes.console.components.navbar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

static private org.apache.sling.scripting.jsp.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.sling.scripting.jsp.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("cpn:url", com.composum.sling.cpnl.CpnlElFunctions.class, "url", new Class[] {org.apache.sling.api.SlingHttpServletRequest.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
    _jspx_dependants.add("tld:http://sling.composum.com/cpnl/1.0");
    _jspx_dependants.add("tld:http://java.sun.com/jsp/jstl/core");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fid;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fid = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fid.release();
    _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write('\n');
      //  cpn:component
      com.composum.sling.cpnl.ComponentTag _jspx_th_cpn_005fcomponent_005f0 = (com.composum.sling.cpnl.ComponentTag) _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fid.get(com.composum.sling.cpnl.ComponentTag.class);
      _jspx_th_cpn_005fcomponent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cpn_005fcomponent_005f0.setParent(null);
      // /libs/composum/nodes/console/components/navbar/navbar.jsp(6,0) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setId("status");
      // /libs/composum/nodes/console/components/navbar/navbar.jsp(6,0) name = type type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setType("com.composum.sling.nodes.console.Consoles");
      int _jspx_eval_cpn_005fcomponent_005f0 = _jspx_th_cpn_005fcomponent_005f0.doStartTag();
      if (_jspx_eval_cpn_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.composum.sling.nodes.console.Consoles status = null;
        if (_jspx_eval_cpn_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_cpn_005fcomponent_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_cpn_005fcomponent_005f0.doInitBody();
        }
        status = (com.composum.sling.nodes.console.Consoles) _jspx_page_context.findAttribute("status");
        do {
          out.write("\n");
          out.write("  <header class=\"navbar navbar-inverse navbar-fixed-top bs-docs-nav\" role=\"banner\">\n");
          out.write("    <div class=\"navbar-header\">\n");
          out.write("      <button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\" data-target=\".bs-navbar-collapse\">\n");
          out.write("        <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\n");
          out.write("        <span class=\"icon-bar\"></span>\n");
          out.write("      </button>\n");
          out.write("      <div id=\"composum-logo\" class=\"navbar-brand\">\n");
          out.write("        <a href=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpn:url(slingRequest,'/libs/composum/nodes/console/content')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
          out.write("\">\n");
          out.write("          ");
          if (_jspx_meth_cpn_005fclientlib_005f0(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        </a>\n");
          out.write("      </div>\n");
          out.write("    </div>\n");
          out.write("    <nav class=\"collapse navbar-collapse bs-navbar-collapse\" role=\"navigation\">\n");
          out.write("      <ul class=\"nav navbar-nav\">\n");
          out.write("        ");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("      </ul>\n");
          out.write("      <ul class=\"system nav navbar-nav navbar-right\">\n");
          out.write("        <li>\n");
          out.write("          <a class=\"nav-user-status\"><em>");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.currentUser}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</em></a>\n");
          out.write("          <span class=\"delimiter\">@</span>\n");
          out.write("          <a class=\"nav-workspace-menu\" data-toggle=\"dropdown\" title=\"System configuration...\"><em>");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.workspaceName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</em></a>\n");
          out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\n");
          out.write("            <li><a href=\"#\" class=\"workspaces\" title=\"Open workspaces tool\">Workspaces...</a></li>\n");
          out.write("          </ul>\n");
          out.write("        </li>\n");
          out.write("      </ul>\n");
          out.write("    </nav>\n");
          out.write("  </header>\n");
          int evalDoAfterBody = _jspx_th_cpn_005fcomponent_005f0.doAfterBody();
          status = (com.composum.sling.nodes.console.Consoles) _jspx_page_context.findAttribute("status");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_cpn_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_cpn_005fcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fid.reuse(_jspx_th_cpn_005fcomponent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fid.reuse(_jspx_th_cpn_005fcomponent_005f0);
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

  private boolean _jspx_meth_cpn_005fclientlib_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cpn:clientlib
    com.composum.sling.cpnl.ClientlibTag _jspx_th_cpn_005fclientlib_005f0 = (com.composum.sling.cpnl.ClientlibTag) _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody.get(com.composum.sling.cpnl.ClientlibTag.class);
    _jspx_th_cpn_005fclientlib_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cpn_005fclientlib_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/components/navbar/navbar.jsp(15,10) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_005fclientlib_005f0.setPath("/libs/composum/nodes/console/page/images/composum-nodes-logo-on-black.png");
    int _jspx_eval_cpn_005fclientlib_005f0 = _jspx_th_cpn_005fclientlib_005f0.doStartTag();
    if (_jspx_th_cpn_005fclientlib_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody.reuse(_jspx_th_cpn_005fclientlib_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody.reuse(_jspx_th_cpn_005fclientlib_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/components/navbar/navbar.jsp(21,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.sling.scripting.jsp.jasper.el.JspValueExpression("/libs/composum/nodes/console/components/navbar/navbar.jsp(21,8) '${status.consoles}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${status.consoles}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /libs/composum/nodes/console/components/navbar/navbar.jsp(21,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("console");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("          <li class=\"nav-item ");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${console.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" link\"><a href=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${console.url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${console.linkAttributes}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('>');
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${console.label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></li>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
