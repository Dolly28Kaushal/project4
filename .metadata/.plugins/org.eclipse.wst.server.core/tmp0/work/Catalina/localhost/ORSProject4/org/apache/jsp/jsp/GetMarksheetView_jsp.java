/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2020-11-23 07:07:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.GregorianCalendar;
import in.co.rays.proj4.ctl.GetMarksheetCtl;
import in.co.rays.proj4.util.DataUtility;
import in.co.rays.proj4.util.ServletUtility;
import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.ctl.LoginCtl;
import in.co.rays.proj4.bean.UserBean;
import in.co.rays.proj4.ctl.ORSView;
import java.util.Calendar;
import java.util.Calendar;

public final class GetMarksheetView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1606115266371L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1599663678000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.rays.proj4.ctl.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.proj4.ctl.ORSView");
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("java.util.GregorianCalendar");
    _jspx_imports_classes.add("in.co.rays.proj4.bean.UserBean");
    _jspx_imports_classes.add("in.co.rays.proj4.util.DataUtility");
    _jspx_imports_classes.add("in.co.rays.proj4.util.ServletUtility");
    _jspx_imports_classes.add("in.co.rays.proj4.ctl.GetMarksheetCtl");
    _jspx_imports_classes.add("in.co.rays.proj4.bean.RoleBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/ORSProject4/css/jquery-ui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("<script src=\"/ORSProject4/js/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"/ORSProject4/js/jquery-ui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#datepicker\").datepicker({\r\n");
      out.write("\t\t\tchangeMonth : true,\r\n");
      out.write("\t\t\tchangeYear : true,\r\n");
      out.write("\t\t\tdateFormat : 'mm/dd/yy',\r\n");
      out.write("\t\t\tyearRange:\"-57:-18\",\r\n");
      out.write("\t\t\tdefaultDate : \"01/01/1995\",\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#datesun\").datepicker({\r\n");
      out.write("\t\t\t beforeShowDay:\r\n");
      out.write("\t\t\t\tfunction(dt){\r\n");
      out.write("\t\t\t\treturn[dt.getDay()==0 ? false:true]     ///// to disable sunday\r\n");
      out.write("\t\t\t}, \r\n");
      out.write("\t\t\tchangeMonth:true,\r\n");
      out.write("\t\t\tchangeYear:true,\r\n");
      out.write("\t\t\tstepMonths: 12,\r\n");
      out.write("\t\t\tyearRange:'+0:+4',\r\n");
      out.write("\t\t\t//yearRange:\"+10:\"\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//defaultDate:\"01/01/2019\"\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#datefac\").datepicker({\r\n");
      out.write("\t\t\t beforeShowDay:\r\n");
      out.write("\t\t\t\tfunction(dt){\r\n");
      out.write("\t\t\t\treturn[dt.getDay()==0 ? false:true]     ///// to disable sunday\r\n");
      out.write("\t\t\t}, \r\n");
      out.write("\t\t\tchangeMonth:true,\r\n");
      out.write("\t\t\tchangeYear:true,\r\n");
      out.write("\t\t\tyearRange:\"-57:+0\",\t\r\n");
      out.write("\t\t\tdefaultDate:\"01/01/2018\"\r\n");
      out.write("\t\t\t//defaultDate:\"01/01/1999\"\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t}); \r\n");
      out.write("\t\r\n");
      out.write("    function selectAll(source) {\r\n");
      out.write("    \tcheckboxes = document.getElementsByName('ids');\r\n");
      out.write("    \tfor (var i = 0, n = checkboxes.length; i < n; i++) {\r\n");
      out.write("    \t\tcheckboxes[i].checked = source.checked;\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function selectone(so) {\r\n");
      out.write("    \tcheckboxes = document.getElementById('mainbox');\r\n");
      out.write("    \tunbox = document.getElementsByName('ids');\r\n");
      out.write("    \tvar box = false;\r\n");
      out.write("    \tfor (var i = 0, n = unbox.length; i < n; i++) {\r\n");
      out.write("    \t\tif (unbox[i].checked == true) {\r\n");
      out.write("    \t\t\tbox = true;\r\n");
      out.write("    \t\t} else {\r\n");
      out.write("    \t\t\tbox = false;\r\n");
      out.write("    \t\t\tbreak;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t}\r\n");
      out.write("    \tcheckboxes.checked = box;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".form-control{\r\n");
      out.write("margin-top:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tbl {\r\n");
      out.write(" border-collapse: collapse;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tbl td, .tbl th {\r\n");
      out.write("    border: 1px solid #A9A9A9;\r\n");
      out.write("    padding: 8px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tbl th {\r\n");
      out.write("    padding-top: 6px;\r\n");
      out.write("    padding-bottom: 6px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write(" /* background-color: #A9A9A9;  */\r\n");
      out.write("    color: black;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#customers {\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("\twidth: 70%;\r\n");
      out.write("\tmargin-right: 32px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#customers td, #customers th {\r\n");
      out.write("\tborder: 1px solid #A9A9A9;\r\n");
      out.write("\tpadding: 8px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#customer{\r\n");
      out.write("\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("\twidth: 70%;\r\n");
      out.write("\tmargin-top: 25px;\r\n");
      out.write("    margin-right: 32px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#customer td, #customer th {\r\n");
      out.write("\tborder: 1px solid #A9A9A9;\r\n");
      out.write("\tpadding: 8px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".heading{\r\n");
      out.write("height: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".msgval{\r\n");
      out.write("height: 5px; \r\n");
      out.write("padding-bottom: 25px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\r\n");
      out.write("\t");

		UserBean userBean = (UserBean) session.getAttribute("user");

		String welcomeMsg = "Hi, ";
		// if(userBean !=null) {
		//		userLoggedIn=true;
		// else {
		//		userLoggedIn=false; }
		boolean userLoggedIn = userBean != null;

		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userBean.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<table style=\"width:100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"90%\"><a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\"><b>Welcome</b></a> |\r\n");
      out.write("\t\t\t");
 if (userLoggedIn) { 
      out.write(" \r\n");
      out.write("\t\t\t<a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\"><b>Logout</b></a>\t\r\n");
      out.write("\t\t\t");
 } else { 
      out.write(" \r\n");
      out.write("\t\t\t<a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"><b>Login</b></a> \r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td rowspan=\"2\">\r\n");
      out.write("\t\t\t\t<h1 align=\"Right\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/customLogo.png\" width=\"250\" height=\"80\">\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr> <td> <h3>");
      out.print(welcomeMsg);
      out.write("</h3> </td> </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t");
 if (userLoggedIn) { 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><b>MyProfile</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><b>Change Password</b></a> |\r\n");
      out.write("\t\t\t\t");
 if (userBean.getRoleId() == RoleBean.ADMIN) { 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><b>GetMarksheet</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><b>Marksheet Merit List</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><b>Add Marksheet</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><b>Marksheet List</b></a> |\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\"><b>Add User</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\"><b>User List</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\"><b>Add College</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><b>College List</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><b>Add Student</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><b>Student List</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\"><b>Add Role</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\"><b>Role List</b></a> |\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><b>Add Course</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><b>Course List</b></a> |\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><b>Add Faculty</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><b>Faculty List</b></a> |\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><b>Add Subject</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"><b>Subject List</b></a>|\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.TIME_TABLE_CTL);
      out.write("\"><b>Add TimeTable</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.TIME_TABLE_LIST_CTL);
      out.write("\"><b>TimeTable List</b></a>| \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\" target=\"blank\"><b>Java Doc</b></a> |  \r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t ");
 if (userBean.getRoleId() == RoleBean.STUDENT) { 
      out.write("\r\n");
      out.write("\t\t\t \t<a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><b>GetMarksheet</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><b>Marksheet Merit List</b></a> |  \r\n");
      out.write("\t\t\t ");
      out.write("\r\n");
      out.write("\t\t\t \t<a href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\" target=\"blank\"><b>Java Doc</b></a> | \r\n");
      out.write("\t\t\t \t");
 } 
      out.write("\r\n");
      out.write("\t\t\t");
 if (userBean.getRoleId() == RoleBean.COLLAGE_SCHOOL) { 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><b>GetMarksheet</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><b>Marksheet Merit List</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><b>Add Marksheet</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><b>Marksheet List</b></a>  \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><b>Add Student</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><b>Student List</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><b>Faculty List</b></a>  | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.TIME_TABLE_LIST_CTL);
      out.write("\"><b>TimeTable List</b></a> |  \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><b>Course List</b></a> |\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\" target=\"blank\"><b>Java Doc</b></a> |  \r\n");
      out.write(" \t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t");
 if (userBean.getRoleId() == RoleBean.KIOSK) { 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><b>GetMarksheet</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><b>Marksheet Merit List</b></a> |  \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><b>College List</b></a> | \r\n");
      out.write("\t\t\t \t<a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><b>Course List</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.TIME_TABLE_LIST_CTL);
      out.write("\"><b>TimeTable List</b></a> |  \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\" target=\"blank\"><b>Java Doc</b></a> |  \r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t");
 if (userBean.getRoleId() == RoleBean.FACULTY) { 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><b>GetMarksheet</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><b>Marksheet Merit List</b></a> |  \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><b>Student List</b></a> |\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"><b>Subject List</b></a> | \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><b>Course List</b></a> |\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><b>Faculty List</b></a> |  \r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.TIME_TABLE_LIST_CTL);
      out.write("\"><b>TimeTable List</b></a> |\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\" target=\"blank\"><b>Java Doc</b></a> |   \r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</td>\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<HR >\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Get Marksheet</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      in.co.rays.proj4.bean.MarksheetBean bean = null;
      bean = (in.co.rays.proj4.bean.MarksheetBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.rays.proj4.bean.MarksheetBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<center  style=\"height: 540px;\">\r\n");
      out.write("\t\t\t<h1>Get Marksheet</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<H2>\r\n");
      out.write("\t\t\t\t<font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<font color=\"green\"> ");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font>\r\n");
      out.write("\t\t\t</H2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\">\r\n");
      out.write("\t\t\t<table align=\"center\" style=\"margin-left: 38%;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>RollNo :</th>&emsp;\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"rollNo\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(ServletUtility.getParameter("rollNo", request));
      out.write("\">&emsp;\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(GetMarksheetCtl.OP_GO);
      out.write("\">&nbsp; <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"submit\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(GetMarksheetCtl.OP_RESET);
      out.write("\">&nbsp; <font\r\n");
      out.write("\t\t\t\t\t\tcolor=\"red\">");
      out.print(ServletUtility.getErrorMessage("rollNo", request));
      out.write("</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br><br><br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				if (bean.getRollNo() != null && bean.getRollNo().trim().length() > 0) {

					String grade = null;
					String result = null;
					long phyMarks = DataUtility.getLong(bean.getPhysics());
					long chemMarks = DataUtility.getLong(bean.getChemistry());
					long MathMarks = DataUtility.getLong(bean.getMaths());
					long totalMarks = (phyMarks + chemMarks + MathMarks);
					float percentage = ((totalMarks) * 100) / 300;

					
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<table border=1 id=\"customers\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"4\"><b>Provisional Marksheet</b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Rollno :</td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">");
      out.print(DataUtility.getStringData(bean.getRollNo()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Name :</td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" class=\"space\">");
      out.print(DataUtility.getStringData(bean.getName()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><b>Subject:</b></td>\r\n");
      out.write("\t\t\t\t\t<td><b>Maximum Marks:</b></td>\r\n");
      out.write("\t\t\t\t\t<td><b>Minimum Marks:</b></td>\r\n");
      out.write("\t\t\t\t\t<td><b>Obtained Marks:</b></td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Physics</td>\r\n");
      out.write("\t\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t\t<td>35</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(DataUtility.getStringData(bean.getPhysics()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Chemistry</td>\r\n");
      out.write("\t\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t\t<td>35</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(DataUtility.getStringData(bean.getChemistry()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Math</td>\r\n");
      out.write("\t\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t\t<td>35</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(DataUtility.getStringData(bean.getMaths()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Total</td>\r\n");
      out.write("\t\t\t\t\t<td>300</td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(totalMarks);
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr><td>Percentage</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">");
      out.print(percentage);
      out.write("%</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Online Result System</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		Calendar c = Calendar.getInstance();
	
      out.write("\r\n");
      out.write("\t<div style=\"position: relative; height: 48px; width: 100%; text-align: center;\">\r\n");
      out.write("\t\t<HR>\r\n");
      out.write("\t\t<H4 style=\"margin: 10px\">\r\n");
      out.write("\t\t\t <b>Copyright &copy; ");
      out.print(c.getWeekYear());
      out.write(" Rays Technologies\r\n");
      out.write("\t\t\t</b> \r\n");
      out.write("\t\t</H4>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!-- color : #FADBD8 -->");
      out.write("\r\n");
      out.write("</html>");
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
