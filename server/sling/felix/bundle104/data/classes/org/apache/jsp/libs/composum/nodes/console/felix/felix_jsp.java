package org.apache.jsp.libs.composum.nodes.console.felix;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class felix_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
    _jspx_dependants.add("tld:http://java.sun.com/jsp/jstl/core");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.release();
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.release();
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
      out.write("<html data-context-path=\"");
      out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${slingRequest.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("<head>\n");
      out.write("  ");
      if (_jspx_meth_sling_005fcall_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <style>\n");
      out.write("    html, body, #ui { width: 100%; height: 100%; }\n");
      out.write("    body { position: relative; }\n");
      out.write("    #content-wrapper {\n");
      out.write("      position: absolute;\n");
      out.write("      top: 48px;\n");
      out.write("      left: -4%;\n");
      out.write("      right: -4%;\n");
      out.write("      bottom: 7px;\n");
      out.write("      overflow-y: scroll;\n");
      out.write("      overflow-x: hidden;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body id=\"felix\" class=\"console\">\n");
      out.write("  <div id=\"ui\">\n");
      out.write("    ");
      if (_jspx_meth_sling_005fcall_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_sling_005finclude_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <div id=\"content-wrapper\">\n");
      out.write("      <iframe width=\"100%\" height=\"100%\" src=\"\"></iframe>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  ");
      if (_jspx_meth_sling_005fcall_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <script>\n");
      out.write("    (function(core) {\n");
      out.write("        'use strict';\n");
      out.write("        core.felix = core.felix || {};\n");
      out.write("\n");
      out.write("    (function(felix) {\n");
      out.write("\n");
      out.write("        felix.View = Backbone.View.extend({\n");
      out.write("\n");
      out.write("            initialize: function(options) {\n");
      out.write("                this.$iframe=$('#content-wrapper iframe');\n");
      out.write("                this.$iframe.load(_.bind (this.onFrameLoad, this));\n");
      out.write("                var url = core.console.getProfile().get('felix','url','/system/console/bundles');\n");
      out.write("                this.$iframe.attr('src', core.getContextUrl(url));\n");
      out.write("            },\n");
      out.write("\n");
      out.write("            onFrameLoad: function(event) {\n");
      out.write("                var url = event.currentTarget.contentDocument.URL;\n");
      out.write("                url = url.replace(new RegExp('https?://[^/]+/'), '/');\n");
      out.write("                core.console.getProfile().set('felix','url',url);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        felix.view = core.getView('#felix', felix.View);\n");
      out.write("\n");
      out.write("    })(core.felix);\n");
      out.write("    })(window.core);\n");
      out.write("  </script>\n");
      if (_jspx_meth_sling_005finclude_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_sling_005fcall_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f0 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f0.setParent(null);
    // /libs/composum/nodes/console/felix/felix.jsp(7,2) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f0.setScript("/libs/composum/nodes/console/page/head.jsp");
    int _jspx_eval_sling_005fcall_005f0 = _jspx_th_sling_005fcall_005f0.doStartTag();
    if (_jspx_th_sling_005fcall_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f0);
    return false;
  }

  private boolean _jspx_meth_sling_005fcall_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f1 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f1.setParent(null);
    // /libs/composum/nodes/console/felix/felix.jsp(24,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f1.setScript("/libs/composum/nodes/console/page/dialogs.jsp");
    int _jspx_eval_sling_005fcall_005f1 = _jspx_th_sling_005fcall_005f1.doStartTag();
    if (_jspx_th_sling_005fcall_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f1);
    return false;
  }

  private boolean _jspx_meth_sling_005finclude_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f0 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sling_005finclude_005f0.setParent(null);
    // /libs/composum/nodes/console/felix/felix.jsp(25,4) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005finclude_005f0.setResourceType("composum/nodes/console/components/navbar");
    int _jspx_eval_sling_005finclude_005f0 = _jspx_th_sling_005finclude_005f0.doStartTag();
    if (_jspx_th_sling_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_sling_005fcall_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f2 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f2.setParent(null);
    // /libs/composum/nodes/console/felix/felix.jsp(30,2) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f2.setScript("/libs/composum/nodes/console/page/script.jsp");
    int _jspx_eval_sling_005fcall_005f2 = _jspx_th_sling_005fcall_005f2.doStartTag();
    if (_jspx_th_sling_005fcall_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f2);
    return false;
  }

  private boolean _jspx_meth_sling_005finclude_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f1 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_005finclude_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sling_005finclude_005f1.setParent(null);
    // /libs/composum/nodes/console/felix/felix.jsp(59,0) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
