/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-11-24 07:21:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("	.form-wrapper {\r\n");
      out.write("		display: flex;\r\n");
      out.write("		flex-direction: column;\r\n");
      out.write("		justify-content: center;\r\n");
      out.write("		align-items: center;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#joinForm {\r\n");
      out.write("		width: 250px;\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#joinForm .label-wrapper {\r\n");
      out.write("		margin-top: 20px;\r\n");
      out.write("		display: flex;\r\n");
      out.write("		justify-content: space-between;\r\n");
      out.write("		align-items: center;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#joinForm input {\r\n");
      out.write("		width: 100%;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#joinForm div {\r\n");
      out.write("		display: flex;\r\n");
      out.write("		align-items: center;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#btnIdCheck {\r\n");
      out.write("		width: 50px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }/header.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("	<div class=\"form-wrapper\">\r\n");
      out.write("		<form id=\"joinForm\" action=\"/user/join.do\" method=\"post\">\r\n");
      out.write("			<h3>회원가입</h3>\r\n");
      out.write("			<div class=\"label-wrapper\">\r\n");
      out.write("				<label for=\"userId\">아이디</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<input type=\"text\" id=\"userId\" name=\"userId\" required style=\"width: auto;\">\r\n");
      out.write("				<button type=\"button\" id=\"btnIdCheck\" style=\"width: 70px\">중복체크</button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"label-wrapper\">\r\n");
      out.write("				<label for=\"userPw\">비밀번호</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<input type=\"password\" id=\"userPw\" name=\"userPw\" required>\r\n");
      out.write("			<p id=\"pwValidation\" style=\"color:red; font-size:0.5rem;\">\r\n");
      out.write("				비밀번호는 영문자, 숫자, 특수문자 조합의 9자리 이상으로 설정해주세요.\r\n");
      out.write("			</p>\r\n");
      out.write("			<div class=\"label-wrapper\">\r\n");
      out.write("				<label for=\"userPwCheck\">비밀번호 확인</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<input type=\"password\" id=\"userPwCheck\" name=\"userPwCheck\" required>\r\n");
      out.write("			<p id=\"pwCheckResult\" style=\"font-size:0.8rem;\">\r\n");
      out.write("			</p>\r\n");
      out.write("			<div class=\"label-wrapper\">\r\n");
      out.write("				<label for=\"userNm\">이름</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<input type=\"text\" id=\"userNm\" name=\"userNm\" required>\r\n");
      out.write("			<div class=\"label-wrapper\">\r\n");
      out.write("				<label for=\"userMail\">이메일</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<input type=\"email\" id=\"userMail\" name=\"userMail\" required>\r\n");
      out.write("			<div class=\"label-wrapper\">\r\n");
      out.write("				<label for=\"userTel\">전화번호</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<input type=\"text\" id=\"userTel\" name=\"userTel\" placeholder=\"숫자만 입력하세요.\">\r\n");
      out.write("			<div style=\"display: block; margin: 20px auto;\">\r\n");
      out.write("				<button type=\"submit\">회원가입</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }/footer.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		\r\n");
      out.write("		$(function(){\r\n");
      out.write("			// id 중복체크 했는지 확인하는 플래그\r\n");
      out.write("			var checkId = false;\r\n");
      out.write("			// pw가 형식에 맞게 작성됐는지(특수문자+영문자+숫자8자리)\r\n");
      out.write("			var pwValidation = false;\r\n");
      out.write("			// pw가 확인란과 일치하는지\r\n");
      out.write("			var pwCheck = false;\r\n");
      out.write("			\r\n");
      out.write("			$(\"#pwValidation\").hide();\r\n");
      out.write("			$(\"#pwCheckResult\").hide();\r\n");
      out.write("			\r\n");
      out.write("			// id 중복체크\r\n");
      out.write("			$(\"#btnIdCheck\").on(\"click\",function(){\r\n");
      out.write("			/*\r\n");
      out.write("				$.ajax({\r\n");
      out.write("					url: '/user/test.do',\r\n");
      out.write("					type: 'post',\r\n");
      out.write("					data: $(\"#joinForm\").serialize(),\r\n");
      out.write("					success: function(obj){\r\n");
      out.write("						//json문자열로 온다\r\n");
      out.write("						console.log(obj);\r\n");
      out.write("						//json문자열을 json으로 변환\r\n");
      out.write("						var jsonObj = JSON.parse(obj);\r\n");
      out.write("						console.log(jsonObj.firstName);\r\n");
      out.write("						console.log(jsonObj.lastName);\r\n");
      out.write("						console.log(jsonObj.user);\r\n");
      out.write("						console.log(jsonObj.user.userId);\r\n");
      out.write("						console.log(jsonObj.user.userPw);\r\n");
      out.write("						\r\n");
      out.write("						//동적 태그를 만들어서 가져온 \r\n");
      out.write("					},\r\n");
      out.write("					error: function(e) {\r\n");
      out.write("						console.log(e);\r\n");
      out.write("					}\r\n");
      out.write("				})\r\n");
      out.write("			*/\r\n");
      out.write("			\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url: '/user/idCheck.do',\r\n");
      out.write("				type: 'post',\r\n");
      out.write("				data: $(\"#joinForm\").serialize(),\r\n");
      out.write("				success: function(obj){\r\n");
      out.write("					console.log(obj);\r\n");
      out.write("					\r\n");
      out.write("					if(obj == 'duplicatedId'){\r\n");
      out.write("						alert(\"중복된 아이디입니다.\");\r\n");
      out.write("						$(\"#userId\").focus();\r\n");
      out.write("					} else {\r\n");
      out.write("						if(confirm(\"사용 가능한 아이디입니다. \" + $(\"#userId\").val() + \r\n");
      out.write("								\"를(을) 사용하시겠습니다?\")) {\r\n");
      out.write("							checkId = true;\r\n");
      out.write("							$(\"#btnIdCheck\").attr(\"disabled\", true);\r\n");
      out.write("						}\r\n");
      out.write("					}	\r\n");
      out.write("				},\r\n");
      out.write("				error: function(e) {\r\n");
      out.write("					console.log(e);\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		});\r\n");
      out.write("		// id 중복체크 후 다시 id를 변경했을 때\r\n");
      out.write("		$(\"#userId\").on(\"change\",function(){\r\n");
      out.write("			checkId = false;\r\n");
      out.write("			$(\"#btnIdCheck\").attr(\"disabled\", false);\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// 비밀번호 유효성 검사\r\n");
      out.write("		function validatePassword(character){\r\n");
      out.write("			return /^(?=.*[a-zA-Z])(?=.*[!@#$%^&*+=-])(?=.*[0-9]).{9,}$/.test(character);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		// 비밀번호 입력될때마다 유호성 검사\r\n");
      out.write("		$(\"#userPw\").on(\"change\",function(){\r\n");
      out.write("			// 비밀번호 유호성 처리\r\n");
      out.write("			if(!validatePassword($(\"#userPw\").val())){\r\n");
      out.write("				pwValidation = false;\r\n");
      out.write("				$(\"#pwValidation\").show();\r\n");
      out.write("				$(\"#userPw\").focus();\r\n");
      out.write("			} else {\r\n");
      out.write("				pwValidation = true;\r\n");
      out.write("				$(\"#pwValidation\").hide();\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 비밀번호 확인까지 입력한 후 다시 비밀번호 재설정할 경우\r\n");
      out.write("			if($(\"#userPw\").val() == $(\"#userPwCheck\").val()){\r\n");
      out.write("				pwCheck = true;\r\n");
      out.write("				$(\"#pwCheckResult\").css(\"color\", \"green\");\r\n");
      out.write("				$(\"#pwCheckResult\").text(\"비밀번호가 일치합니다.\");\r\n");
      out.write("			} else {\r\n");
      out.write("				pwCheck = false;\r\n");
      out.write("				$(\"#pwCheckResult\").css(\"color\", \"red\");\r\n");
      out.write("				$(\"#pwCheckResult\").text(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// 비밀번호 확인란 입력할 때 일치하는지\r\n");
      out.write("		$(\"#userPwCheck\").on(\"change\", function(){\r\n");
      out.write("			$(\"#pwCheckResult\").show();\r\n");
      out.write("			\r\n");
      out.write("			if($(\"#userPw\").val() == $(\"#userPwCheck\").val()){\r\n");
      out.write("				pwCheck = true;\r\n");
      out.write("				$(\"#pwCheckResult\").css(\"color\", \"green\");\r\n");
      out.write("				$(\"#pwCheckResult\").text(\"비밀번호가 일치합니다.\");\r\n");
      out.write("			} else {\r\n");
      out.write("				pwCheck = false;\r\n");
      out.write("				$(\"#pwCheckResult\").css(\"color\", \"red\");\r\n");
      out.write("				$(\"#pwCheckResult\").text(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// 회원가입 진행\r\n");
      out.write("		// (e) 이벤트 객체 넣어주기\r\n");
      out.write("		$(\"#joinForm\").on(\"submit\", function(e){\r\n");
      out.write("			// 서브밋이 실핼될 때 구현할 동작\r\n");
      out.write("			// 아이디 중복체크가 안됐거나, 중복된 아이디 사용했을 때\r\n");
      out.write("			if(!checkId) {\r\n");
      out.write("				alert(\"아이디 중복체크를 진행하세요.\");\r\n");
      out.write("				$(\"#userId\").focus();\r\n");
      out.write("				e.preventDefault();\r\n");
      out.write("				return;\r\n");
      out.write("			} \r\n");
      out.write("			\r\n");
      out.write("			// 비밀번호 유효성 검사가 틀렸을 때\r\n");
      out.write("			if(!pwValidation){\r\n");
      out.write("				alert(\"비밀번호는 영문자, 숫자, 특수문자 조합의 9자리 이상으로 설정하세요.\");\r\n");
      out.write("				$(\"#userPw\").focus();\r\n");
      out.write("				e.preventDefault();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 비밀번호와 비밀번호 확인이 일치하지 않을 때\r\n");
      out.write("			if(!pwCheck) {\r\n");
      out.write("				alert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("				$(\"#userPwCheck\").focus();\r\n");
      out.write("				e.preventDefault();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 모두 true일 경우 아무것도 작성하지 X\r\n");
      out.write("			\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	});\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
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
