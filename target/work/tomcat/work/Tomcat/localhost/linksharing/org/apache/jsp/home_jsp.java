/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2015-02-18 18:19:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("        .Header\n");
      out.write("        {\n");
      out.write("            width: 100%;\n");
      out.write("            padding:1%  0px;\n");
      out.write("            color:white;\n");
      out.write("            background-color:rgba(117, 33, 46, 0.98);\n");
      out.write("        }\n");
      out.write("        .Header H1\n");
      out.write("        {\n");
      out.write("            padding-left: 1%;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .Menu\n");
      out.write("        {\n");
      out.write("            float: left;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .Menu,.Nav\n");
      out.write("        {\n");
      out.write("            width:48%;\n");
      out.write("            list-style-type: none;\n");
      out.write("            border:0px solid #000000;\n");
      out.write("            font-size: 88%;\n");
      out.write("            margin-top: 2px;\n");
      out.write("            margin-left: -2%;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .Nav\n");
      out.write("        {\n");
      out.write("            float: right;\n");
      out.write("            text-align: right;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .SignIn\n");
      out.write("        {\n");
      out.write("            float:right;\n");
      out.write("\n");
      out.write("            margin-left: 1%;\n");
      out.write("            border: 1px solid gray;\n");
      out.write("            padding:4px 5px ;\n");
      out.write("            background-color: rgba(117, 33, 46, 0.98);\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        .SignIn:hover\n");
      out.write("        {\n");
      out.write("            color:lightgray;\n");
      out.write("        }\n");
      out.write("        .Menu .MenuLi\n");
      out.write("        {\n");
      out.write("            display: inline-block;\n");
      out.write("            border:0px solid black;\n");
      out.write("            margin-left:-.6%;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .Menu .MenuLi a\n");
      out.write("        {\n");
      out.write("            padding-top: -1%;\n");
      out.write("            color:gray;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-right: 1px solid lightgray;\n");
      out.write("            padding: 10px 10px;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("        .Menu .MenuLi:hover,.Menu .MenuLi a:hover\n");
      out.write("        {\n");
      out.write("            background-color:rgba(117, 33, 46, 0.98);\n");
      out.write("            color:white;\n");
      out.write("        }\n");
      out.write("        .Text\n");
      out.write("        {\n");
      out.write("            border: 1px solid lightgray;\n");
      out.write("            padding: 5px 0px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .Button\n");
      out.write("        {\n");
      out.write("\n");
      out.write("            text-align: center;\n");
      out.write("            border:1px solid #AAA;\n");
      out.write("            padding:4px 0px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .Button:hover\n");
      out.write("        {\n");
      out.write("            color:white;\n");
      out.write("            background-color: rgba(117, 33, 46, 0.98);;\n");
      out.write("        }\n");
      out.write("        .Footer\n");
      out.write("        {\n");
      out.write("            width: 100%;\n");
      out.write("            color:white;\n");
      out.write("            background-color: rgba(117, 33, 46, 0.98);;\n");
      out.write("            padding: 2px 0px;\n");
      out.write("            margin-top: 17%;\n");
      out.write("            font-family: \"Open Sans\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n");
      out.write("            font-size: 90%;\n");
      out.write("            font-weight:bold;\n");
      out.write("        }\n");
      out.write("        .Footer a\n");
      out.write("        {\n");
      out.write("            color:white;\n");
      out.write("            float: right;\n");
      out.write("            padding-righ*t: 5px;\n");
      out.write("            text-decoration: none;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function openRegistration()\n");
      out.write("        {\n");
      out.write("            window.location.href=\"registration.jsp\"\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <title>Registration for Link Sharing</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header class=\"Header\">\n");
      out.write("    <h1>Link Sharing</h1>\n");
      out.write("</header>\n");
      out.write("<div>\n");
      out.write("    <ul class=\"Menu\">\n");
      out.write("        <li class=\"MenuLi\"><a href=\"\">Create New Topic</a></li>\n");
      out.write("        <li class=\"MenuLi\"><a href=\"\">Show Subscription</a></li>\n");
      out.write("        <li class=\"MenuLi\"><a href=\"\">Top Post</a></li>\n");
      out.write("        <li class=\"MenuLi\"><a href=\"\">Recent Post</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("<div class=\"Nav\">\n");
      out.write("\n");
      out.write("    <a href=\"\" ><img src=\"images/send.png\" width=\"5%\" style=\"margin-bottom:-1.7%;padding:0px 3px\"></a>\n");
      out.write("    <a href=\"\" ><img src=\"images/document.png\" width=\"4%\" style=\"margin-bottom:-1%;padding:0px 3px\"></a>\n");
      out.write("    <a href=\"\" ><img src=\"images/attachment1.png\" width=\"4%\" style=\"margin-bottom:-1%;padding:0px 3px\"></a>\n");
      out.write("    <input type=\"text\" class=\"Text\" placeholder=\"Search The Post\"><input type=\"submit\" class=\"Button\" value=\"Go!\">\n");
      out.write("    <a href=\"\" ><img src=\"images/user.png\" width=\"4.5%\" style=\"margin-bottom:-1.2%;padding:0px 3px\"></a>\n");
      out.write("    <a href=\"login.jsp\"  class=\"SignIn\">Sign in</a>\n");
      out.write("</div>\n");
      out.write("<footer class=\"Footer\">\n");
      out.write("    <span style=\"border-right: 2px solid;padding:0px 10px\">All Right Reserved</span>\n");
      out.write("    <span style=\"border-right: 2px solid;padding:0px 10px\">Powered By TO THE NEW DIGITAL</span>\n");
      out.write("    <span><a href=\"\">About us &nbsp;&nbsp;</a> </span>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
