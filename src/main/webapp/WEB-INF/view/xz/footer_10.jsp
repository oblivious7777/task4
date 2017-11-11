<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<!--相当于response.setContentType("text/html; charset=UTF-8"); 通知浏览器以UTF-8进行中文解码   导入jar包-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@taglib prefix="" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib uri="/tags" prefix="date"%>
<html>
<div class="footer">
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-4 col-md-5 col-lg-5 up-1">
                <p><a>技能树-改变你我</a></p>
                <p><a href="#">关于我们 </a>|<a href="#"> 联系我们 </a>|<a href="#"> 合作企业 </a></p>
            </div>
            <div class="col-xs-12 col-sm-4 col-md-5 col-lg-5 up-2">
                <p>旗下网站</p>
                <ul class="list-inline">
                    <li><a href="#">草船云孵化器</a></li>
                    <li><a href="#">最强IT特训营</a><br></li>
                </ul>
                <ul class="list-inline">
                    <li><a href="#">葡萄藤轻游戏</a></li>
                    <li><a href="#">桌游精灵</a></li>
                </ul>
            </div>
            <div class="col-xs-12 col-sm-4 col-md-2 col-lg-2 up-3">
                <p>微信公众平台</p>
                <img alt="" src="${pageContext.request.contextPath}/t10/imges/2524.jpg">
            </div>
        </div>
    </div>
    <div class="container-fluid text-center">
        <p>Copyright &copy; 2015 北京葡萄藤信息技术有限公司 All Rights Reserved | 京ICP备15035574号-1</p>
    </div>
</div>
</html>