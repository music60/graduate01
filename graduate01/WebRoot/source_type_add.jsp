<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%><!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
	<meta charset="utf-8" />
	<title>添加资源类型</title>
	<meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
	<!-- BEGIN GLOBAL MANDATORY STYLES -->
	<link href="media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/style-metro.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/style.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/style-responsive.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>
	<link href="media/css/uniform.default.css" rel="stylesheet" type="text/css"/>
	<!-- END GLOBAL MANDATORY STYLES -->		<link rel="stylesheet" type="text/css" href="media/css/jquery.tagsinput.css" />	<link rel="stylesheet" type="text/css" href="media/css/clockface.css" />	<link rel="stylesheet" type="text/css" href="media/css/bootstrap-wysihtml5.css" />	
	<link rel="shortcut icon" href="media/image/favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
	<!-- BEGIN HEADER -->
	<div class="header navbar navbar-inverse navbar-fixed-top">
		<!-- BEGIN TOP NAVIGATION BAR -->
		<div class="navbar-inner">
			<div class="container-fluid">
				<!-- BEGIN LOGO -->
				<a class="brand" href="index.jsp">
				<img src="media/image/logo.png" alt="logo" />
				</a>
				<!-- END LOGO -->
				<!-- BEGIN RESPONSIVE MENU TOGGLER -->
				<a href="javascript:;" class="btn-navbar collapsed" data-toggle="collapse" data-target=".nav-collapse">
				<img src="media/image/menu-toggler.png" alt="" />
				</a>          
				<!-- END RESPONSIVE MENU TOGGLER -->            
				<!-- BEGIN TOP NAVIGATION MENU -->              
				<ul class="nav pull-right">
					<!-- BEGIN NOTIFICATION DROPDOWN -->   
					<li class="dropdown" id="header_notification_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-warning-sign"></i>
						<span class="badge">6</span>
						</a>
						<ul class="dropdown-menu extended notification">
							<li>
								<p>You have 14 new notifications</p>
							</li>
							<li>
								<a href="#">
								<span class="label label-success"><i class="icon-plus"></i></span>
								New user registered. 
								<span class="time">Just now</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-important"><i class="icon-bolt"></i></span>
								Server #12 overloaded. 
								<span class="time">15 mins</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-warning"><i class="icon-bell"></i></span>
								Server #2 not respoding.
								<span class="time">22 mins</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-info"><i class="icon-bullhorn"></i></span>
								Application error.
								<span class="time">40 mins</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-important"><i class="icon-bolt"></i></span>
								Database overloaded 68%. 
								<span class="time">2 hrs</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-important"><i class="icon-bolt"></i></span>
								2 user IP blocked.
								<span class="time">5 hrs</span>
								</a>
							</li>
							<li class="external">
								<a href="#">See all notifications <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- END NOTIFICATION DROPDOWN -->
					<!-- BEGIN INBOX DROPDOWN -->
					<li class="dropdown" id="header_inbox_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-envelope"></i>
						<span class="badge">5</span>
						</a>
						<ul class="dropdown-menu extended inbox">
							<li>
								<p>You have 12 new messages</p>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo"><img src="media/image/avatar2.jpg" alt="" /></span>
								<span class="subject">
								<span class="from">Lisa Wong</span>
								<span class="time">Just Now</span>
								</span>
								<span class="message">
								Vivamus sed auctor nibh congue nibh. auctor nibh
								auctor nibh...
								</span>  
								</a>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo"><img src="media/image/avatar3.jpg" alt="" /></span>
								<span class="subject">
								<span class="from">Richard Doe</span>
								<span class="time">16 mins</span>
								</span>
								<span class="message">
								Vivamus sed congue nibh auctor nibh congue nibh. auctor nibh
								auctor nibh...
								</span>  
								</a>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo"><img src="media/image/avatar1.jpg" alt="" /></span>
								<span class="subject">
								<span class="from">Bob Nilson</span>
								<span class="time">2 hrs</span>
								</span>
								<span class="message">
								Vivamus sed nibh auctor nibh congue nibh. auctor nibh
								auctor nibh...
								</span>  
								</a>
							</li>
							<li class="external">
								<a href="inbox.html">See all messages <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- END INBOX DROPDOWN -->
					<!-- BEGIN TODO DROPDOWN -->
					<li class="dropdown" id="header_task_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-tasks"></i>
						<span class="badge">5</span>
						</a>
						<ul class="dropdown-menu extended tasks">
							<li>
								<p>You have 12 pending tasks</p>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">New release v1.2</span>
								<span class="percent">30%</span>
								</span>
								<span class="progress progress-success ">
								<span style="width: 30%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">Application deployment</span>
								<span class="percent">65%</span>
								</span>
								<span class="progress progress-danger progress-striped active">
								<span style="width: 65%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">Mobile app release</span>
								<span class="percent">98%</span>
								</span>
								<span class="progress progress-success">
								<span style="width: 98%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">Database migration</span>
								<span class="percent">10%</span>
								</span>
								<span class="progress progress-warning progress-striped">
								<span style="width: 10%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">Web server upgrade</span>
								<span class="percent">58%</span>
								</span>
								<span class="progress progress-info">
								<span style="width: 58%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">Mobile development</span>
								<span class="percent">85%</span>
								</span>
								<span class="progress progress-success">
								<span style="width: 85%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li class="external">
								<a href="#">See all tasks <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- END TODO DROPDOWN -->
					<!-- BEGIN USER LOGIN DROPDOWN -->
					<li class="dropdown user">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<img alt="" src="media/image/avatar1_small.jpg" />
						<span class="username">Bob Nilson</span>
						<i class="icon-angle-down"></i>
						</a>
						<ul class="dropdown-menu">
							<li><a href="extra_profile.html"><i class="icon-user"></i> My Profile</a></li>
							<li><a href="page_calendar.html"><i class="icon-calendar"></i> My Calendar</a></li>
							<li><a href="inbox.html"><i class="icon-envelope"></i> My Inbox(3)</a></li>
							<li><a href="#"><i class="icon-tasks"></i> My Tasks</a></li>
							<li class="divider"></li>
							<li><a href="extra_lock.html"><i class="icon-lock"></i> Lock Screen</a></li>
							<li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
						</ul>
					</li>
					<!-- END USER LOGIN DROPDOWN -->
				</ul>
				<!-- END TOP NAVIGATION MENU --> 
			</div>
		</div>
		<!-- END TOP NAVIGATION BAR -->
	</div>
	<!-- END HEADER -->
	<!-- BEGIN CONTAINER -->
	<div class="page-container row-fluid">
		<!-- BEGIN SIDEBAR -->
		<%@ include file="sidebar.html" %>
		<!-- END SIDEBAR -->
		<!-- BEGIN PAGE -->  
		<div class="page-content">
			<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
			<div id="portlet-config" class="modal hide">
				<div class="modal-header">
					<button data-dismiss="modal" class="close" type="button"></button>
					<h3>portlet Settings</h3>
				</div>
				<div class="modal-body">
					<p>Here will be a configuration form</p>
				</div>
			</div>
			<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
			<!-- BEGIN PAGE CONTAINER-->
			<div class="container-fluid">
				<!-- BEGIN PAGE HEADER-->   
				<div class="row-fluid">
					<div class="span12">
						<!-- BEGIN STYLE CUSTOMIZER -->
						<div class="color-panel hidden-phone">
							<div class="color-mode-icons icon-color"></div>
							<div class="color-mode-icons icon-color-close"></div>
							<div class="color-mode">
								<p>THEME COLOR</p>
								<ul class="inline">
									<li class="color-black current color-default" data-style="default"></li>
									<li class="color-blue" data-style="blue"></li>
									<li class="color-brown" data-style="brown"></li>
									<li class="color-purple" data-style="purple"></li>
									<li class="color-grey" data-style="grey"></li>
									<li class="color-white color-light" data-style="light"></li>
								</ul>
								<label>
									<span>Layout</span>
									<select class="layout-option m-wrap small">
										<option value="fluid" selected>Fluid</option>
										<option value="boxed">Boxed</option>
									</select>
								</label>
								<label>
									<span>Header</span>
									<select class="header-option m-wrap small">
										<option value="fixed" selected>Fixed</option>
										<option value="default">Default</option>
									</select>
								</label>
								<label>
									<span>Sidebar</span>
									<select class="sidebar-option m-wrap small">
										<option value="fixed">Fixed</option>
										<option value="default" selected>Default</option>
									</select>
								</label>
								<label>
									<span>Footer</span>
									<select class="footer-option m-wrap small">
										<option value="fixed">Fixed</option>
										<option value="default" selected>Default</option>
									</select>
								</label>
							</div>
						</div>
						<!-- END BEGIN STYLE CUSTOMIZER -->  
						<h3 class="page-title">
							添加资源类型
							 <small></small>
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.jsp">首页</a> 
								<span class="icon-angle-right"></span>
							</li>							<li>								<a href="index.jsp">类型管理</a> 								<span class="icon-angle-right"></span>							</li>							<li>								<a href="index.jsp">资源类型管理</a> 								<span class="icon-angle-right"></span>							</li>
							<li><a href="#">添加资源类型</a></li>
						</ul>
					</div>
				</div>
				<!-- END PAGE HEADER-->
				<!-- BEGIN PAGE CONTENT-->
				<div class="row-fluid">
					<div class="span12">
						<!-- BEGIN SAMPLE FORM PORTLET-->   
						<div class="portlet box blue tabbable">
							<div class="portlet-title">
								<div class="caption">
									<i class="icon-reorder"></i>
									<span class="hidden-480">请按照要求填写表格</span>
								</div>
							</div>
							<div class="portlet-body form">
								<div class="tabbable portlet-tabs">
									<ul class="nav nav-tabs">
										<li class="active"><a href="#portlet_tab1" data-toggle="tab">添加资源类型</a></li>
									</ul>
									<div class="tab-content">
										<div class="tab-pane active" id="portlet_tab1">
											<!-- BEGIN FORM-->
											<form  class="form-horizontal" action="sourceType/addSourceType.action" method="post">
												
												<div class="control-group">
													<label class="control-label">类型名称</label>
													<div class="controls">
														<input type="text" placeholder="请输入标题" class="m-wrap large" name="name"/>
														<span class="help-inline">请尽量限制在10字以内</span>
													</div>
												</div>																								<div class="control-group">													<label class="control-label">类型号</label>													<div class="controls">														<input type="text" placeholder="请输入类型号" class="m-wrap large" name="type"/>														<span class="help-inline">请输入4字符标识</span>													</div>												</div>																								<div class="control-group">													<label class="control-label">类别描述</label>													<div class="controls">														<textarea class="span12 wysihtml5 m-wrap" rows="6" name="remark"></textarea>													</div>												</div>																								
												<div class="form-actions">
													<button type="submit" class="btn blue"><i class="icon-ok"></i> 保存</button>
													<button type="button" class="btn" disabled="disabled">取消</button>
												</div>
											</form>
											<!-- END FORM-->  
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- END SAMPLE FORM PORTLET-->
					</div>
				</div>
				<!-- END PAGE CONTENT-->         
			</div>
			<!-- END PAGE CONTAINER-->
		</div>
		<!-- END PAGE -->  
	</div>
	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
	<div class="footer">
		<div class="footer-inner">
			2013 &copy; Metronic by keenthemes.
		</div>
		<div class="footer-tools">
			<span class="go-top">
			<i class="icon-angle-up"></i>
			</span>
		</div>
	</div>
	<!-- END FOOTER -->
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<!-- BEGIN CORE PLUGINS -->
	<script src="media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
	<script src="media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
	<script src="media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      
	<script src="media/js/bootstrap.min.js" type="text/javascript"></script>
	<!--[if lt IE 9]>
	<script src="media/js/excanvas.min.js"></script>
	<script src="media/js/respond.min.js"></script>  
	<![endif]-->   
	<script src="media/js/jquery.slimscroll.min.js" type="text/javascript"></script>
	<script src="media/js/jquery.blockui.min.js" type="text/javascript"></script>  
	<script src="media/js/jquery.cookie.min.js" type="text/javascript"></script>
	<script src="media/js/jquery.uniform.min.js" type="text/javascript" ></script>
	<!-- END CORE PLUGINS -->
	<script src="media/js/app.js"></script>		<script src="media/js/form-components.js"></script>     		<script type="text/javascript" src="media/js/wysihtml5-0.3.0.js"></script> 	<script type="text/javascript" src="media/js/bootstrap-wysihtml5.js"></script>	<script type="text/javascript" src="media/js/jquery.tagsinput.min.js"></script>     
	<script>
		jQuery(document).ready(function() {   
		   // initiate layout and plugins
		   App.init();		   		   FormComponents.init();
		});
	</script>
	<!-- END JAVASCRIPTS -->   
<script type="text/javascript">  var _gaq = _gaq || [];  _gaq.push(['_setAccount', 'UA-37564768-1']);  _gaq.push(['_setDomainName', 'keenthemes.com']);  _gaq.push(['_setAllowLinker', true]);  _gaq.push(['_trackPageview']);  (function() {    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);  })();</script></body>
<!-- END BODY -->
</html>