<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link href="css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="files/login/styles.css" type="text/css" rel="stylesheet"/>
<title>登陆界面</title>
</head>
<script type="text/javascript">
function regist(){
	location.assign('register.jsp')
}
function note(){
	alert("该版块正在开发中，敬请期待！")
}
</script>
<body>
<div id="base" style="position:absolute;left:15%;top:10%" align="center">
<div id="u0" class="ax_default box_2">
        <div id="u0_div" class=""></div>
        <div id="u1" class="text" style="display: none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>
 <div id="u2" class="ax_default box_1">
        <div id="u2_div" class=""></div>
        <div id="u3" class="text" style="display: none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>
      <form action="UserServlet?action=login" method="post">
<div id="u0" class="ax_default box_2" align="center"><div id="u5" class="text" style="visibility: visible;"><span><h3>登陆</h3></span></div></div>
<div id="u7" class="ax_default label"><div id="u8" class="text" style="visibility: visible;">ID：</div></div>  <div id="u6" class="ax_default text_field"><input id="u6_input" type="text" name="username" /></div><br/>
<div id="u9" class="ax_default label"><div id="u10" class="text" style="visibility: visible;">密码：</div></div> <div id="u11" class="ax_default text_field"><input id="u11_input" type="password" name="userpassword"/></div>
<div id="u12" class="ax_default label"><div id="u12_div" class=""></div><div id="u13" class="text" style="visibility: visible;"><p><span><a href="" onclick="note()" style='text-decoration:none;'>忘记密码？</a></span></p></div></div>
<div id="u14" class="ax_default html_button"><input id="u14_input" type="button" onclick="regist()" value="注册"/></div><br/>
<div id="u15" class="ax_default html_button"><input id="u15_input" type="submit" value="登陆"/></div><br/>
</form></div>
</body>
</html>