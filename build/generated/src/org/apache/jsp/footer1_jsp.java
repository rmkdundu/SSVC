package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div class=\"site-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 mx-auto text-center mb-5 section-heading\">\n");
      out.write("            <h2 class=\"mb-5\">The Indian Army</h2>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 col-lg-4 mb-5\">\n");
      out.write("            <div class=\"hotel-room text-center\">\n");
      out.write("              <a href=\"#\" class=\"d-block mb-4 thumbnail\"><img src=\"images/person_1.jpg\" alt=\"Image\" class=\"img-fluid  rounded-circle w-50\"></a>\n");
      out.write("              <div class=\"p-4\">\n");
      out.write("                <h3 class=\"heading mb-0 h5 \"><a href=\"#\" class=\"text-black\">Angella Lopez</a></h3>\n");
      out.write("                <p class=\"mb-3\">Vinyasa Flow, Hatha, Meditation</p>\n");
      out.write("                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta labore recusandae soluta quis.</p>\n");
      out.write("                <p><a href=\"#\" class=\"text-primary\">Read More <span class=\"icon-arrow-right small\"></span></a></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("         <!--<div class=\"col-md-6 col-lg-4 mb-5\">\n");
      out.write("            <div class=\"hotel-room text-center\">\n");
      out.write("              <a href=\"#\" class=\"d-block mb-4 thumbnail\"><img src=\"images/person_2.jpg\" alt=\"Image\" class=\"img-fluid  rounded-circle w-50\"></a>\n");
      out.write("              <div class=\"p-4\">\n");
      out.write("              <h3 class=\"heading mb-0 h5 \"><a href=\"#\" class=\"text-black\">Marina Stalks</a></h3>\n");
      out.write("              <p class=\"mb-3\">Vinyasa Flow, Yin, Meditation</p>\n");
      out.write("              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta labore recusandae soluta quis.</p>\n");
      out.write("              <p><a href=\"#\" class=\"text-primary\">Read More <span class=\"icon-arrow-right small\"></span></a></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 col-lg-4 mb-5\">\n");
      out.write("            <div class=\"hotel-room text-center\">\n");
      out.write("              <a href=\"#\" class=\"d-block mb-4 thumbnail\"><img src=\"images/person_3.jpg\" alt=\"Image\" class=\"img-fluid  rounded-circle w-50\"></a>\n");
      out.write("              <div class=\"p-4\">\n");
      out.write("              <h3 class=\"heading mb-0 h5 \"><a href=\"#\" class=\"text-black\">Ethan Hoover</a></h3>\n");
      out.write("              <p class=\"mb-3\">Vinyasa Flow, Hatha, Meditation</p>\n");
      out.write("              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta labore recusandae soluta quis.</p>\n");
      out.write("              <p><a href=\"#\" class=\"text-primary\">Read More <span class=\"icon-arrow-right small\"></span></a></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-md-6 col-lg-4 mb-5\">\n");
      out.write("            <div class=\"hotel-room text-center\">\n");
      out.write("              <a href=\"#\" class=\"d-block mb-4 thumbnail\"><img src=\"images/person_4.jpg\" alt=\"Image\" class=\"img-fluid  rounded-circle w-50\"></a>\n");
      out.write("              <div class=\"p-4\">\n");
      out.write("              <h3 class=\"heading mb-0 h5 \"><a href=\"#\" class=\"text-black\">Megan Pearson</a></h3>\n");
      out.write("              <p class=\"mb-3\">Vinyasa Flow, Yin, Meditation</p>\n");
      out.write("              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta labore recusandae soluta quis.</p>\n");
      out.write("              <p><a href=\"#\" class=\"text-primary\">Read More <span class=\"icon-arrow-right small\"></span></a></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 col-lg-4 mb-5\">\n");
      out.write("            <div class=\"hotel-room text-center\">\n");
      out.write("              <a href=\"#\" class=\"d-block mb-4 thumbnail\"><img src=\"images/person_1.jpg\" alt=\"Image\" class=\"img-fluid  rounded-circle w-50\"></a>\n");
      out.write("              <div class=\"p-4\">\n");
      out.write("              <h3 class=\"heading mb-0 h5 \"><a href=\"#\" class=\"text-black\">Cristine Smith</a></h3>\n");
      out.write("              <p class=\"mb-3\">Vinyasa Flow, Hatha, Meditation</p>\n");
      out.write("              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta labore recusandae soluta quis.</p>\n");
      out.write("              <p><a href=\"#\" class=\"text-primary\">Read More <span class=\"icon-arrow-right small\"></span></a></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 col-lg-4 mb-5\">\n");
      out.write("            <div class=\"hotel-room text-center\">\n");
      out.write("              <a href=\"#\" class=\"d-block mb-4 thumbnail\"><img src=\"images/person_2.jpg\" alt=\"Image\" class=\"img-fluid rounded-circle w-50\"></a>\n");
      out.write("              <div class=\"p-4\">\n");
      out.write("              <h3 class=\"heading mb-0 h5 \"><a href=\"#\" class=\"text-black\">Marina Stalks</a></h3>\n");
      out.write("              <p class=\"mb-3\">Vinyasa Flow, Hatha, Meditation</p>\n");
      out.write("              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta labore recusandae soluta quis.</p>\n");
      out.write("              <p><a href=\"#\" class=\"text-primary\">Read More <span class=\"icon-arrow-right small\"></span></a></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>-->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"site-section bg-light\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 mx-auto text-center mb-5 section-heading\">\n");
      out.write("            <h2 class=\"mb-5\">Yoga Features</h2>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-sm-6 col-md-4 col-lg-3\">\n");
      out.write("            <div class=\"text-center item\">\n");
      out.write("              <span class=\"flaticon-001-stone display-3 mb-3 d-block text-primary\"></span>\n");
      out.write("              <h2 class=\"h5\">Peace of Mind</h2>\n");
      out.write("              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Unde temporibus</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-sm-6 col-md-4 col-lg-3\">\n");
      out.write("            <div class=\"text-center item\">\n");
      out.write("              <span class=\"flaticon-002-lotus display-3 mb-3 d-block text-primary\"></span>\n");
      out.write("              <h2 class=\"h5\">Mindfullness</h2>\n");
      out.write("              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Unde temporibus</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-sm-6 col-md-4 col-lg-3\">\n");
      out.write("            <div class=\"text-center item\">\n");
      out.write("              <span class=\"flaticon-003-meditation display-3 mb-3 d-block text-primary\"></span>\n");
      out.write("              <h2 class=\"h5\">Meditation</h2>\n");
      out.write("              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Unde temporibus</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-sm-6 col-md-4 col-lg-3\">\n");
      out.write("            <div class=\"text-center item\">\n");
      out.write("              <span class=\"flaticon-004-carpet display-3 mb-3 d-block text-primary\"></span>\n");
      out.write("              <h2 class=\"h5\">Yoga Carpet</h2>\n");
      out.write("              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Unde temporibus</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    <footer class=\"site-footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <h3 class=\"footer-heading mb-4 text-white\">About</h3>\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellat quos rem ullam, placeat amet.</p>\n");
      out.write("            <p><a href=\"#\" class=\"btn btn-primary pill text-white px-4\">Read More</a></p>\n");
      out.write("          </div>\n");
      out.write("        <!--  <div class=\"col-md-6\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-6\">\n");
      out.write("                <h3 class=\"footer-heading mb-4 text-white\">Quick Menu</h3>\n");
      out.write("                  <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"#\">About</a></li>\n");
      out.write("                    <li><a href=\"#\">Features</a></li>\n");
      out.write("                    <li><a href=\"#\">Approach</a></li>\n");
      out.write("                    <li><a href=\"#\">Events</a></li>\n");
      out.write("                    <li><a href=\"#\">Classes</a></li>\n");
      out.write("                    <li><a href=\"#\">Careers</a></li>\n");
      out.write("                  </ul>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-6\">\n");
      out.write("                <h3 class=\"footer-heading mb-4 text-white\">Ministries</h3>\n");
      out.write("                  <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"#\">Yoga for Health</a></li>\n");
      out.write("                    <li><a href=\"#\">Yoga for Resilience</a></li>\n");
      out.write("                    <li><a href=\"#\">Yoga Class</a></li>\n");
      out.write("                    <li><a href=\"#\">Meditation</a></li>\n");
      out.write("                    <li><a href=\"#\">Mind Balance</a></li>\n");
      out.write("                  </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("       </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row pt-5 mt-5 text-center\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <p>\n");
      out.write("            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("            Copyright &copy; <script data-cfasync=\"false\" src=\"/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js\"></script><script>document.write(new Date().getFullYear());</script> All Rights Reserved \n");
      out.write("            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("  <script src=\"js/popper.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.countdown.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("  <script src=\"js/aos.js\"></script>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <script src=\"js/mediaelement-and-player.min.js\"></script>\n");
      out.write("\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("      document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("                var mediaElements = document.querySelectorAll('video, audio'), total = mediaElements.length;\n");
      out.write("\n");
      out.write("                for (var i = 0; i < total; i++) {\n");
      out.write("                    new MediaElementPlayer(mediaElements[i], {\n");
      out.write("                        pluginPath: 'https://cdn.jsdelivr.net/npm/mediaelement@4.2.7/build/',\n");
      out.write("                        shimScriptAccess: 'always',\n");
      out.write("                        success: function () {\n");
      out.write("                            var target = document.body.querySelectorAll('.player'), targetTotal = target.length;\n");
      out.write("                            for (var j = 0; j < targetTotal; j++) {\n");
      out.write("                                target[j].style.visibility = 'visible';\n");
      out.write("                            }\n");
      out.write("                  }\n");
      out.write("                });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>");
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
