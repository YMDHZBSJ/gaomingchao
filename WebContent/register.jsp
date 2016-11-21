<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link href="css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="files/register/styles.css" type="text/css" rel="stylesheet"/>
<title>Insert title here</title>
</head>
<body>
<div id="base" align="center" style="position:absolute;left:10%">
 <div id="u120" class="ax_default box_3">
        <div id="u120_div" class=""></div>
        <div id="u121" class="text" style="visibility: visible;">
          <p><span>注 册</span></p>
        </div>
      </div>
      <div id="u122" class="ax_default box_1">
        <div id="u122_div" class=""></div>
        <div id="u123" class="text" style="display: none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>
<form action="UserServlet?action=add" method="post">
<tr>
<td><div id="u124" class="ax_default label">
        <div id="u124_div" class=""></div>
        <div id="u125" class="text" style="visibility: visible;">
          <p><span>ID：</span></p>
        </div>
      </div></td>
<td><div id="u126" class="ax_default text_field">
        <input id="u126_input" type="text" name="user_id" value=""/>
      </div></td>
<td><div id="u150" class="ax_default label">
        <div id="u150_div" class=""></div>
        <div id="u151" class="text" style="visibility: visible;">
          <p><span>14位工号</span></p>
        </div>
      </div></td>
</tr>
<tr>
<td><div id="u127" class="ax_default label">
        <div id="u127_div" class=""></div>
        <div id="u128" class="text" style="visibility: visible;">
          <p><span>姓名：</span></p>
        </div>
      </div></td>
<td> <div id="u129" class="ax_default text_field">
        <input id="u129_input" type="text" name="user_name" value=""/>
      </div></td>
<td><div id="u152" class="ax_default label">
        <div id="u152_div" class=""></div>
        <div id="u153" class="text" style="visibility: visible;">
          <p><span>6-18位字符串</span></p>
        </div>
      </div></td>
</tr>
<tr>
<td><div id="u130" class="ax_default label">
        <div id="u130_div" class=""></div>
        <div id="u131" class="text" style="visibility: visible;">
          <p><span>密码：</span></p>
        </div>
      </div></td>
<td><div id="u132" class="ax_default text_field">
        <input id="u132_input" type="password" name="user_password" value=""/>
      </div></td>
<td><div id="u154" class="ax_default label">
        <div id="u154_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u155" class="text" style="visibility: visible;">
          <p><span>6-18位字符串</span></p>
        </div>
      </div></td>
</tr>
<tr>
<td><div id="u133" class="ax_default label">
        <div id="u133_div" class=""></div>
        <div id="u134" class="text" style="visibility: visible;">
          <p><span>系别：</span></p>
        </div>
      </div></td>
<td><div id="u135" class="ax_default text_field">
        <input id="u135_input" type="text" name="user_dept" value=""/>
      </div></td>
<td></td>
</tr>
<tr>
<td><div id="u136" class="ax_default label">
        <div id="u136_div" class=""></div>
        <div id="u137" class="text" style="visibility: visible;">
          <p><span>性别：</span></p>
        </div>
      </div></td>
<td><div id="u138" class="ax_default radio_button">
        <label for="u138_input">
          <div id="u139" class="text" style="visibility: visible;">
            <p><span>男</span></p>
          </div>
        </label>
        <input id="u138_input" type="radio" value="radio" name="user_sex" checked/>
      </div>
      <div id="u140" class="ax_default radio_button">
        <label for="u140_input">
          <div id="u141" class="text" style="visibility: visible;">
            <p><span>女</span></p>
          </div>
        </label>
        <input id="u140_input" type="radio" value="radio" name="user_sex"/>
      </div></td>
<td></td>
</tr>
<tr>
<td><div id="u142" class="ax_default label">
        <div id="u142_div" class=""></div>
        <div id="u143" class="text" style="visibility: visible;">
          <p><span>职称：</span></p>
        </div>
      </div></td>
<td><div id="u144" class="ax_default text_field">
        <input id="u144_input" type="text" name="user_job" value=""/>
      </div></td>
<td></td>
</tr>
<tr>
<td><div id="u145" class="ax_default label">
        <div id="u145_div" class=""></div>
        <div id="u146" class="text" style="visibility: visible;">
          <p><span>类别：</span></p>
        </div>
      </div></td>
<td><div id="u149" class="ax_default droplist">
        <select id="u149_input" name="user_type">
          <option selected value="普通用户">普通用户</option>
          <option value="管理员">管理员</option>
        </select>
      </div></td>
<td></td>
</tr>
<tr>
<td><div id="u147" class="ax_default html_button">
        <input id="u147_input" type="submit" value="提交"/>
      </div></td>
<td> <div id="u148" class="ax_default html_button">
        <input id="u148_input" type="submit" value="重置"/>
      </div></td>
<td></td>
</tr>
</form>
</div>
</body>
</html>