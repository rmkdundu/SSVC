package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer1.jsp");
  }

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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Indian Army</title>\r\n");
      out.write("</head>\r\n");
      out.write("    ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>INDIAN ARMY &mdash; Colorlib Website Template</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:400,700|Work+Sans:300,400,700\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/mediaelement@4.2.7/build/mediaelementplayer.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/flaticon/font/flaticon.css\">\r\n");
      out.write("  \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/aos.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"site-wrap\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"site-mobile-menu\">\r\n");
      out.write("      <div class=\"site-mobile-menu-header\">\r\n");
      out.write("        <div class=\"site-mobile-menu-close mt-3\">\r\n");
      out.write("          <span class=\"icon-close2 js-menu-toggle\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"site-mobile-menu-body\"></div>\r\n");
      out.write("    </div> <!-- .site-mobile-menu -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"site-navbar-wrap js-site-navbar bg-white\">\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"site-navbar bg-light\">\r\n");
      out.write("          <div class=\"py-1\">\r\n");
      out.write("            <div class=\"row align-items-center\">\r\n");
      out.write("              <div class=\"col-2\">\r\n");
      out.write("                <h2 class=\"mb-0 site-logo\"><a href=\"index.html\">Indian Army</a></h2>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-10\">\r\n");
      out.write("                <nav class=\"site-navigation text-right\" role=\"navigation\">\r\n");
      out.write("                  <div class=\"container\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"d-inline-block d-lg-none  ml-md-0 mr-auto py-3\"><a href=\"#\" class=\"site-menu-toggle js-menu-toggle\"><span class=\"icon-menu h3\"></span></a></div>\r\n");
      out.write("                    \r\n");
      out.write("                    ");

                    String type=session.getAttribute("type").toString();
                    
                    if(type.equalsIgnoreCase("admin"))
                    {
                    
                    
                    
                    
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    <ul class=\"site-menu js-clone-nav d-none d-lg-block\">\r\n");
      out.write("                      <li class=\"\">\r\n");
      out.write("                        <a href=\"adminhome.jsp\">Home</a>\r\n");
      out.write("                      <a href=\"about.jsp\">About</a>\r\n");
      out.write("                         <a href=\"adcommando.jsp\">Add Commando</a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                     \r\n");
      out.write("                      <li><a href=\"adteam.jsp\">Create Team</a></li>\r\n");
      out.write("                     \r\n");
      out.write("                       <li><a href=\"adsndntfn.jsp\">Send Notification</a></li>\r\n");
      out.write("                     <!-- <li class=\"active\"><a href=\"contact.html\">Contact</a></li>-->\r\n");
      out.write("                      <li class=\"has-children\">\r\n");
      out.write("                        <a href=\"adviewcmndo.jsp\">View Commandos</a>\r\n");
      out.write("                        <ul class=\"dropdown arrow-top\">\r\n");
      out.write("                          <li><a href=\"view_memebers.jsp\">View Team Members</a></li>\r\n");
      out.write("                          <li><a href=\"adviewntfn.jsp\">View Notification & Updates</a></li>\r\n");
      out.write("                          <li><a href=\"adviewcmplnt.jsp\">View Complaints & Reply</a></li>\r\n");
      out.write("                          <li class=\"has-children\">\r\n");
      out.write("                          <!--  <a href=\"classes.html\">More</a>\r\n");
      out.write("                            <ul class=\"dropdown\">\r\n");
      out.write("                              <li><a href=\"classes.html\">Yoga Dance</a></li>\r\n");
      out.write("                              <li><a href=\"classes.html\">Bare Workout</a></li>\r\n");
      out.write("                              <li><a href=\"classes.html\">Peace of Mind</a></li>\r\n");
      out.write("                            </ul>-->\r\n");
      out.write("                          </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                      </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    ");

                    }
                    
                    else if(type.equalsIgnoreCase("commando"))
                    {
                        
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                          <ul class=\"site-menu js-clone-nav d-none d-lg-block\">\r\n");
      out.write("                      <li class=\"\">\r\n");
      out.write("                        <a href=\"index.html\">Home</a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                      \r\n");
      out.write("                      <li><a href=\"cmdo_viewprofile.jsp\">Profile</a></li>\r\n");
      out.write("                      <li><a href=\"cmdo_viewteam.jsp\">Team Members</a></li>\r\n");
      out.write("                      <li><a href=\"cmdo_sndcmplnt.jsp\"> Send Complaint</a></li>\r\n");
      out.write("                        <li><a href=\"cmdo_viewrply.jsp\"> View Reply</a></li>\r\n");
      out.write("                     <!-- <li class=\"has-children\">\r\n");
      out.write("                        <a href=\"classes.html\">Yoga Classes</a>\r\n");
      out.write("                        <ul class=\"dropdown arrow-top\">\r\n");
      out.write("                          <li><a href=\"classes.html\">Yoga Dance</a></li>\r\n");
      out.write("                          <li><a href=\"classes.html\">Bare Workout</a></li>\r\n");
      out.write("                          <li><a href=\"classes.html\">Peace of Mind</a></li>\r\n");
      out.write("                         <li class=\"has-children\">\r\n");
      out.write("                            <a href=\"classes.html\">More</a>\r\n");
      out.write("                            <ul class=\"dropdown\">\r\n");
      out.write("                              <li><a href=\"classes.html\">Yoga Dance</a></li>\r\n");
      out.write("                              <li><a href=\"classes.html\">Bare Workout</a></li>\r\n");
      out.write("                              <li><a href=\"classes.html\">Peace of Mind</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                          </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                      </li>-->\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        ");

                    }
                    
                    else if(type.equalsIgnoreCase("military_officer"))
                    {
                        
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        <ul class=\"site-menu js-clone-nav d-none d-lg-block\">\r\n");
      out.write("                      <li class=\"\">\r\n");
      out.write("                        <a href=\"Mo_home\">Home</a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                       <li><a href=\"mo_prfleview.jsp\">Profile</a></li>\r\n");
      out.write("                      <li><a href=\"mo_viewmbrs.jsp\">View All Members</a></li>\r\n");
      out.write("                      <li><a href=\"mo_viewntfn.jsp\">  Notifications</a></li>\r\n");
      out.write("                     <!-- <li class=\"has-children\">\r\n");
      out.write("                        <a href=\"classes.html\">Yoga Classes</a>\r\n");
      out.write("                        <ul class=\"dropdown arrow-top\">\r\n");
      out.write("                          <li><a href=\"classes.html\">Yoga Dance</a></li>\r\n");
      out.write("                          <li><a href=\"classes.html\">Bare Workout</a></li>\r\n");
      out.write("                          <li><a href=\"classes.html\">Peace of Mind</a></li>\r\n");
      out.write("                          <li class=\"has-children\">\r\n");
      out.write("                            <a href=\"classes.html\">More</a>\r\n");
      out.write("                            <ul class=\"dropdown\">\r\n");
      out.write("                              <li><a href=\"classes.html\">Yoga Dance</a></li>\r\n");
      out.write("                              <li><a href=\"classes.html\">Bare Workout</a></li>\r\n");
      out.write("                              <li><a href=\"classes.html\">Peace of Mind</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                          </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                      </li>-->\r\n");
      out.write("                     \r\n");
      out.write("                     <li><a href=\"mo_viewcmplnt.jsp\">View Complaints</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        ");

                    }
                    
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("      \r\n");
      out.write("      <div class=\"site-blocks-cover overlay\" style=\"background-image: url(images/hero_3.jpg);\" data-aos=\"fade\" data-stellar-background-ratio=\"0.5\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row align-items-center justify-content-center\">\r\n");
      out.write("            <div class=\"col-md-7 text-center\" data-aos=\"fade\">\r\n");
      out.write("              <h2 class=\"caption mb-2\">Join</h2>\r\n");
      out.write("              <h1 class=\"\">Indian Army</h1>\r\n");
      out.write("              \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>  \r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    <div class=\"site-section site-section-sm\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("       \r\n");
      out.write("          <div class=\"col-md-12 col-lg-8 mb-5\">");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
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
