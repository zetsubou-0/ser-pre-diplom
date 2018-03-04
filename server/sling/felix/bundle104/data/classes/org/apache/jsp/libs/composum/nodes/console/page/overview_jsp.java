package org.apache.jsp.libs.composum.nodes.console.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class overview_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcpn_005flink_005fhref;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fid = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcpn_005flink_005fhref = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fid.release();
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.release();
    _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.release();
    _005fjspx_005ftagPool_005fcpn_005flink_005fhref.release();
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
      // /libs/composum/nodes/console/page/overview.jsp(6,0) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setId("status");
      // /libs/composum/nodes/console/page/overview.jsp(6,0) name = type type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("<html data-context-path=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${slingRequest.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write('\n');
          if (_jspx_meth_sling_005fcall_005f0(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write('\n');
          if (_jspx_meth_cpn_005fclientlib_005f0(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("<body id=\"overview\" class=\"console\">\n");
          out.write("  <div id=\"ui\">\n");
          out.write("    ");
          if (_jspx_meth_sling_005fcall_005f1(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_sling_005finclude_005f0(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    <div class=\"content\">\n");
          out.write("      <div class=\"row\">\n");
          out.write("        <div class=\"left col-md-3 col-sm-4 col-xs-12\">\n");
          out.write("          <img src=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpn:url(slingRequest,'/libs/composum/nodes/console/page/images/composum-nodes.png')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
          out.write("\" alt=\"Composum Sling nodes logo\" />\n");
          out.write("        </div>\n");
          out.write("        <div class=\"main col-md-9 col-sm-8 col-xs-12\">\n");
          out.write("          <h1>a 'Swiss Knife' <small>for the resource repository</small></h1>\n");
          out.write("          <p>\n");
          out.write("            The <name>Composum Sling 'nodes'</name> bundle gives you a tool to explore the repository and manage\n");
          out.write("            the content at the resource (JCR) level.\n");
          out.write("          </p>\n");
          out.write("        </div>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"row\">\n");
          out.write("        <div class=\"left col-md-3 col-sm-4 col-xs-12\">\n");
          out.write("          ");
          if (_jspx_meth_cpn_005flink_005f0(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("          <p>\n");
          out.write("            <ul class=\"list-group\">\n");
          out.write("              <li class=\"list-group-item\">repository tree with configurable filters</li>\n");
          out.write("              <li class=\"list-group-item\">node creation / deletion / move / reorder</li>\n");
          out.write("              <li class=\"list-group-item\">property manipulation</li>\n");
          out.write("              <li class=\"list-group-item\">binary data upload / download</li>\n");
          out.write("              <li class=\"list-group-item\">component rendering and asset view</li>\n");
          out.write("              <li class=\"list-group-item\">template based queries with history</li>\n");
          out.write("              <li class=\"list-group-item\">JSON view, download and upload</li>\n");
          out.write("              <li class=\"list-group-item\">ACL view and manipulation</li>\n");
          out.write("            </ul>\n");
          out.write("          </p>\n");
          out.write("        </div>\n");
          out.write("        <div class=\"main col-md-9 col-sm-8 col-xs-12\">\n");
          out.write("          <section>\n");
          out.write("            <p>\n");
          out.write("              With the browser you can deep dive through your respository.\n");
          out.write("            </p>\n");
          out.write("            <ul class=\"nav nav-tabs\">\n");
          out.write("              <li class=\"active\"><a data-toggle=\"pill\" href=\"#browser-props\">Repository Browser</a></li>\n");
          out.write("              <li><a data-toggle=\"pill\" href=\"#browser-view\">Render / Image View</a></li>\n");
          out.write("              <li><a data-toggle=\"pill\" href=\"#browser-code\">Code View and Editing</a></li>\n");
          out.write("            </ul>\n");
          out.write("            <div class=\"tab-content\">\n");
          out.write("              <div id=\"browser-props\" class=\"tab-pane fade active in\">\n");
          out.write("                <img class=\"img-responsive\" src=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpn:url(slingRequest,'/libs/composum/nodes/console/guide/browser/images/browser-props.png')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
          out.write("\" alt=\"Repository Browser and Query View\" />\n");
          out.write("              </div>\n");
          out.write("              <div id=\"browser-view\" class=\"tab-pane fade\">\n");
          out.write("                <img class=\"img-responsive\" src=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpn:url(slingRequest,'/libs/composum/nodes/console/guide/browser/images/browser-view.png')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
          out.write("\" alt=\"Repository Browser Render View\" />\n");
          out.write("              </div>\n");
          out.write("              <div id=\"browser-code\" class=\"tab-pane fade\">\n");
          out.write("                <img class=\"img-responsive\" src=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpn:url(slingRequest,'/libs/composum/nodes/console/guide/browser/images/browser-code.png')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
          out.write("\" alt=\"Repository Browser Code View\" />\n");
          out.write("              </div>\n");
          out.write("            </div>\n");
          out.write("          </section>\n");
          out.write("        </div>\n");
          out.write("      </div>\n");
          out.write("      ");
          out.write("\n");
          out.write("    </div>\n");
          out.write("  </div>\n");
          if (_jspx_meth_sling_005fcall_005f2(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write('\n');
          if (_jspx_meth_sling_005finclude_005f1(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("</body>\n");
          out.write("</html>\n");
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

  private boolean _jspx_meth_sling_005fcall_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f0 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/page/overview.jsp(8,0) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f0.setScript("head.jsp");
    int _jspx_eval_sling_005fcall_005f0 = _jspx_th_sling_005fcall_005f0.doStartTag();
    if (_jspx_th_sling_005fcall_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f0);
    return false;
  }

  private boolean _jspx_meth_cpn_005fclientlib_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cpn:clientlib
    com.composum.sling.cpnl.ClientlibTag _jspx_th_cpn_005fclientlib_005f0 = (com.composum.sling.cpnl.ClientlibTag) _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody.get(com.composum.sling.cpnl.ClientlibTag.class);
    _jspx_th_cpn_005fclientlib_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cpn_005fclientlib_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/page/overview.jsp(9,0) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_005fclientlib_005f0.setPath("composum/nodes/console/page/css/content.css");
    int _jspx_eval_cpn_005fclientlib_005f0 = _jspx_th_cpn_005fclientlib_005f0.doStartTag();
    if (_jspx_th_cpn_005fclientlib_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody.reuse(_jspx_th_cpn_005fclientlib_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcpn_005fclientlib_005fpath_005fnobody.reuse(_jspx_th_cpn_005fclientlib_005f0);
    return false;
  }

  private boolean _jspx_meth_sling_005fcall_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f1 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/page/overview.jsp(12,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f1.setScript("dialogs.jsp");
    int _jspx_eval_sling_005fcall_005f1 = _jspx_th_sling_005fcall_005f1.doStartTag();
    if (_jspx_th_sling_005fcall_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f1);
    return false;
  }

  private boolean _jspx_meth_sling_005finclude_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f0 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sling_005finclude_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/page/overview.jsp(13,4) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005finclude_005f0.setResourceType("composum/nodes/console/components/navbar");
    int _jspx_eval_sling_005finclude_005f0 = _jspx_th_sling_005finclude_005f0.doStartTag();
    if (_jspx_th_sling_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_cpn_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cpn:link
    com.composum.sling.cpnl.LinkTag _jspx_th_cpn_005flink_005f0 = (com.composum.sling.cpnl.LinkTag) _005fjspx_005ftagPool_005fcpn_005flink_005fhref.get(com.composum.sling.cpnl.LinkTag.class);
    _jspx_th_cpn_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cpn_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/page/overview.jsp(29,10) name = href type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_005flink_005f0.setHref("/bin/browser.html");
    int _jspx_eval_cpn_005flink_005f0 = _jspx_th_cpn_005flink_005f0.doStartTag();
    if (_jspx_eval_cpn_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cpn_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cpn_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cpn_005flink_005f0.doInitBody();
      }
      do {
        out.write("<h2>the Browser</h2>");
        int evalDoAfterBody = _jspx_th_cpn_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cpn_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cpn_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcpn_005flink_005fhref.reuse(_jspx_th_cpn_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcpn_005flink_005fhref.reuse(_jspx_th_cpn_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_sling_005fcall_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f2 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/page/overview.jsp(79,0) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f2.setScript("script.jsp");
    int _jspx_eval_sling_005fcall_005f2 = _jspx_th_sling_005fcall_005f2.doStartTag();
    if (_jspx_th_sling_005fcall_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f2);
    return false;
  }

  private boolean _jspx_meth_sling_005finclude_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f1 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_005finclude_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sling_005finclude_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/page/overview.jsp(80,0) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005finclude_005f1.setResourceType("composum/nodes/console/components/tryLogin");
    int _jspx_eval_sling_005finclude_005f1 = _jspx_th_sling_005finclude_005f1.doStartTag();
    if (_jspx_th_sling_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f1);
    return false;
  }
}
