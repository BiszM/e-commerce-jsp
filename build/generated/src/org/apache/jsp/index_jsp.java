package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<title>Bootstrap E-commerce Templates</title>\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\n");
      out.write("\t\t<!-- bootstrap -->\n");
      out.write("\t\t<link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">      \n");
      out.write("\t\t<link href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\t\t\n");
      out.write("\t\t<link href=\"themes/css/bootstrappage.css\" rel=\"stylesheet\"/>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- global styles -->\n");
      out.write("\t\t<link href=\"themes/css/flexslider.css\" rel=\"stylesheet\"/>\n");
      out.write("\t\t<link href=\"themes/css/main.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("\t\t<!-- scripts -->\n");
      out.write("\t\t<script src=\"themes/js/jquery-1.7.2.min.js\"></script>\n");
      out.write("\t\t<script src=\"bootstrap/js/bootstrap.min.js\"></script>\t\t\t\t\n");
      out.write("\t\t<script src=\"themes/js/superfish.js\"></script>\t\n");
      out.write("\t\t<script src=\"themes/js/jquery.scrolltotop.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("    <body>\t\t\n");
      out.write("\t\t<div id=\"top-bar\" class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"span4\">\n");
      out.write("\t\t\t\t\t<form method=\"POST\" class=\"search_form\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"input-block-level search-query\" Placeholder=\"eg. T-sirt\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"span8\">\n");
      out.write("\t\t\t\t\t<div class=\"account pull-right\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"user-menu\">\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">My Account</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"cart.html\">Your Cart</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"checkout.html\">Checkout</a></li>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"register.html\">Login</a></li>\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"wrapper\" class=\"container\">\n");
      out.write("\t\t\t<section class=\"navbar main-menu\">\n");
      out.write("\t\t\t\t<div class=\"navbar-inner main-menu\">\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"index.html\" class=\"logo pull-left\"><img src=\"themes/images//logo.png\" class=\"site_logo\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<nav id=\"menu\" class=\"pull-right\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Woman</a>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Lacinia nibh</a></li>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Eget molestie</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Varius purus</a></li>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Man</a></li>\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Sport</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Gifts and Tech</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Ties and Hats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Cold Weather</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Hangbag</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Best Seller</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Top Seller</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\t\t\t\n");
      out.write("\t\t\t<section class=\"header_text sub\">\n");
      out.write("\t\t\t<img class=\"pageBanner\" src=\"themes/images/pageBanner.png\" alt=\"New products\" >\n");
      out.write("\t\t\t\t<h4><span>Login or Register</span></h4>\n");
      out.write("\t\t\t</section>\t\t\t\n");
      out.write("\t\t\t<section class=\"main-content\">\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"span5\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<h4 class=\"title\"><span class=\"text\"><strong>Login</strong> Form</span></h4>\n");
      out.write("\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"next\" value=\"/\">\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">Username</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Enter your username\" id=\"username\" class=\"input-xlarge\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">Username</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" placeholder=\"Enter your password\" id=\"password\" class=\"input-xlarge\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input tabindex=\"3\" class=\"btn btn-inverse large\" type=\"submit\" value=\"Sign into your account\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"reset\">Recover your <a tabindex=\"4\" href=\"#\" title=\"Recover your username or password\">username or password</a></p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t</form>\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"span7\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<h4 class=\"title\"><span class=\"text\"><strong>Register</strong> Form</span></h4>\n");
      out.write("\t\t\t\t\t\t<form action=\"#\" method=\"post\" class=\"form-stacked\">\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">Username</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Enter your username\" class=\"input-xlarge\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">Email address:</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" placeholder=\"Enter your email\" class=\"input-xlarge\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">Password:</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" placeholder=\"Enter your password\" class=\"input-xlarge\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t                            \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Now that we know who you are. I'm not a mistake! In a comic, you know how you can tell who the arch-villain's going to be?</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"actions\"><input tabindex=\"9\" class=\"btn btn-inverse large\" type=\"submit\" value=\"Create your account\"></div>\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t</form>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\t\t\t\n");
      out.write("\t\t\t<section id=\"footer-bar\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"span3\">\n");
      out.write("\t\t\t\t\t\t<h4>Navigation</h4>\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./index.html\">Homepage</a></li>  \n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./about.html\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./contact.html\">Contac Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./cart.html\">Your Cart</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./register.html\">Login</a></li>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"span4\">\n");
      out.write("\t\t\t\t\t\t<h4>My Account</h4>\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">My Account</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Order History</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Wish List</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Newsletter</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"span5\">\n");
      out.write("\t\t\t\t\t\t<p class=\"logo\"><img src=\"themes/images/logo.png\" class=\"site_logo\" alt=\"\"></p>\n");
      out.write("\t\t\t\t\t\t<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. the  Lorem Ipsum has been the industry's standard dummy text ever since the you.</p>\n");
      out.write("\t\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t\t<span class=\"social_icons\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"facebook\" href=\"#\">Facebook</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"twitter\" href=\"#\">Twitter</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"skype\" href=\"#\">Skype</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"vimeo\" href=\"#\">Vimeo</a>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<section id=\"copyright\">\n");
      out.write("\t\t\t\t<span>Copyright 2013 bootstrap page template  All right reserved.</span>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<script src=\"themes/js/common.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t$('#checkout').click(function (e) {\n");
      out.write("\t\t\t\t\tdocument.location.href = \"checkout.html\";\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\t\t\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
