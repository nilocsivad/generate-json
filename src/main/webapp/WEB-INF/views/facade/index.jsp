<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/url.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<title>index | generate-json | Amaze UI</title>
<%@include file="./refrence-head.jsp"%>
<script type="text/javascript">
	var CUR_DATA_KEY = "home";
</script>
<link rel="stylesheet" href="${URL }/static_r/style/facade/index.css.css" />
</head>
<body>

	<%@include file="./header.jsp"%>


	<div class="get">
		<div class="am-container">
			<h1 class="get-title">Amaze UI For Generate-JSON</h1>
			<p>期待你的使用，提高您的开发效率</p>
			<p>
				<a href="<%=this.base_url( "u/json", "show/rule" )%>" class="am-btn am-btn-sm get-btn">获取新get技能√</a>
			</p>
		</div>
	</div>


	<div class="hope">
		<div class="am-g am-container">
			<div class="am-u-sm-6 hope-img"></div>
			<div class="am-u-sm-6">
				<h2 class="hope-title">同我们一起打造你的APP</h2>
				<p>在知识爆炸的年代，我们不愿成为知识的过客，拥抱开源文化，发挥社区的力量。</p>
			</div>
		</div>
	</div>


	<div class="about">
		<div class="am-container">
			<h2 class="about-title about-color">Generate-JSON 欢迎大家的使用</h2>
			<div class="am-g">
				<div class="am-u-sm-4"></div>

				<div class="am-u-sm-8">
					<h4 class="about-color">关于我们</h4>
					<p>关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们</p>
					<h4 class="about-color">团队介绍</h4>
					<p>团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍团队介绍</p>
				</div>
			</div>
		</div>
	</div>


	<%@include file="./footer.jsp"%>

</body>
<%@include file="./refrence-foot.jsp"%>
</html>
