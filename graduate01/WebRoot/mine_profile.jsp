<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%><!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
	<meta charset="utf-8" />
	<title>Metronic | Extra - User Profile</title>
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
	<!-- END GLOBAL MANDATORY STYLES -->
	<!-- BEGIN PAGE LEVEL STYLES -->
	<link href="media/css/bootstrap-fileupload.css" rel="stylesheet" type="text/css" />
	<link href="media/css/chosen.css" rel="stylesheet" type="text/css" />
	<link href="media/css/profile.css" rel="stylesheet" type="text/css" />
	<!-- END PAGE LEVEL STYLES -->
	<link rel="shortcut icon" href="media/image/favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
	<!-- BEGIN HEADER -->	
	<%@ include file="header.jsp" %>
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
						<!-- BEGIN PAGE TITLE & BREADCRUMB-->
						<h3 class="page-title">
							我的档案 <small></small>
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.html">首页</a> 
								<i class="icon-angle-right"></i>
							</li>
							<li>
								<a href="#">个人中心</a>
								<i class="icon-angle-right"></i>
							</li>
							<li><a href="#">个人信息</a></li>
						</ul>
						<!-- END PAGE TITLE & BREADCRUMB-->
					</div>
				</div>
				<!-- END PAGE HEADER-->
				<!-- BEGIN PAGE CONTENT-->
				<div class="row-fluid profile">
					<div class="span12">
						<!--BEGIN TABS-->
						<div class="tabbable tabbable-custom tabbable-full-width">
							<ul class="nav nav-tabs">
								<li class="active"><a href="#tab_1_1" data-toggle="tab">概要</a></li>
								<li><a href="#tab_1_2" data-toggle="tab">用户详情</a></li>
								<li><a href="#tab_1_6" data-toggle="tab">帮助</a></li>
							</ul>
							<div class="tab-content">
								<div class="tab-pane row-fluid active" id="tab_1_1">
									<ul class="unstyled profile-nav span3">
										<li><img src="media/image/profile-img.png" alt="" /> <a href="#" class="profile-edit">edit</a></li>
									<!-- 	<li><a href="#">Projects</a></li> -->
										<li><a href="#">消息 <span>3</span></a></li>
										<li><a href="#">朋友</a></li>
										<li><a href="#">设置</a></li>
									</ul>
									<div class="span9">
										<div class="row-fluid">
											<div class="span8 profile-info">
												<h1>John Doe</h1>
												<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt laoreet dolore magna aliquam tincidunt erat volutpat laoreet dolore magna aliquam tincidunt erat volutpat.</p>
												<p><a href="#">www.mywebsite.com</a></p>
												<ul class="unstyled inline">
													<li><i class="icon-map-marker"></i> Spain</li>
													<li><i class="icon-calendar"></i> 18 Jan 1982</li>
													<li><i class="icon-briefcase"></i> Design</li>
													<li><i class="icon-star"></i> Top Seller</li>
													<li><i class="icon-heart"></i> BASE Jumping</li>
												</ul>
											</div>
											<!--end span8-->
											<div class="span4">
												<div class="portlet sale-summary">
													<div class="portlet-title">
														<div class="caption">我的成就</div>
														<div class="tools">
															<a class="reload" href="javascript:;"></a>
														</div>
													</div>
													<ul class="unstyled">
														<li>
															<span class="sale-info">累计学习时间<i class="icon-img-up"></i></span> 
															<span class="sale-num">230小时</span>
														</li>
														<li>
															<span class="sale-info">累计阅读文章<i class="icon-img-down"></i></span> 
															<span class="sale-num">87篇</span>
														</li>
														<li>
															<span class="sale-info">累计观看视频</span> 
															<span class="sale-num">237篇</span>
														</li>
														<li>
															<span class="sale-info">累计完成计划</span> 
															<span class="sale-num">15次</span>
														</li>
													</ul>
												</div>
											</div>
											<!--end span4-->
										</div>
										<!--end row-fluid-->
										<div class="tabbable tabbable-custom tabbable-custom-profile">
											<ul class="nav nav-tabs">
												<li class="active"><a href="#tab_1_11" data-toggle="tab">我的计划</a></li>
												<!-- <li class=""><a href="#tab_1_22" data-toggle="tab">Feeds</a></li> -->
											</ul>
											<div class="tab-content">
												<div class="tab-pane active" id="tab_1_11">
													<div class="portlet-body" style="display: block;">
														<table class="table table-striped table-bordered table-advance table-hover">
															<thead>
																<tr>
																	<th><i class="icon-briefcase"></i> 任务</th>
																	<th class="hidden-phone"><i class="icon-question-sign"></i> 描述</th>
																	<th><i class="icon-bookmark"></i> 完成时间</th>
																	<th></th>
																</tr>
															</thead>
															<tbody>
																<tr>
																	<td><a href="#">Pixel Ltd</a></td>
																	<td class="hidden-phone">Server hardware purchase</td>
																	<td>52560.10$ <span class="label label-success label-mini">成功</span></td>
																	<td><a class="btn mini green-stripe" href="#">查看详情</a></td>
																</tr>
																<tr>
																	<td>
																		<a href="#">
																		Smart House
																		</a>  
																	</td>
																	<td class="hidden-phone">Office furniture purchase</td>
																	<td>5760.00$ <span class="label label-warning label-mini">进行中</span></td>
																	<td><a class="btn mini blue-stripe" href="#">查看详情</a></td>
																</tr>																																							<tr>																	<td>																		<a href="#">																		Smart House																		</a>  																	</td>																	<td class="hidden-phone">Office furniture purchase</td>																	<td>5760.00$ <span class="label label-failure label-mini">失败</span></td>																	<td><a class="btn mini blue-stripe" href="#">查看详情</a></td>																</tr>
															</tbody>
														</table>
													</div>
												</div>
												<!--tab-pane-->
												<!--tab-pane-->
											</div>
										</div>
									</div>
									<!--end span9-->
								</div>
								<!--end tab-pane-->
								<div class="tab-pane profile-classic row-fluid" id="tab_1_2">
									<div class="span2"><img src="media/image/profile-img.png" alt="" /> <a href="#" class="profile-edit">edit</a></div>
									<ul class="unstyled span10">
										<li><span>User Name:</span> JDuser</li>
										<li><span>First Name:</span> John</li>
										<li><span>Last Name:</span> Doe</li>
										<li><span>Counrty:</span> Spain</li>
										<li><span>Birthday:</span> 18 Jan 1982</li>
										<li><span>Occupation:</span> Web Developer</li>
										<li><span>Email:</span> <a href="#">john@mywebsite.com</a></li>
										<li><span>Interests:</span> Design, Web etc.</li>
										<li><span>Website Url:</span> <a href="#">http://www.mywebsite.com</a></li>
										<li><span>Mobile Number:</span> +1 646 580 DEMO (6284)</li>
										<li><span>About:</span> Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.</li>
									</ul>
								</div>
								<!--tab_1_2-->
								<div class="tab-pane row-fluid" id="tab_1_6">
									<div class="row-fluid">
										<div class="span12">
											<div class="span3">
												<ul class="ver-inline-menu tabbable margin-bottom-10">
													<li class="active">
														<a data-toggle="tab" href="#tab_1">
														<i class="icon-briefcase"></i> 
														General Questions
														</a> 
														<span class="after"></span>                                    
													</li>
													<li><a data-toggle="tab" href="#tab_2"><i class="icon-group"></i> Membership</a></li>
													<li><a data-toggle="tab" href="#tab_3"><i class="icon-leaf"></i> Terms Of Service</a></li>
													<li><a data-toggle="tab" href="#tab_1"><i class="icon-info-sign"></i> License Terms</a></li>
													<li><a data-toggle="tab" href="#tab_2"><i class="icon-tint"></i> Payment Rules</a></li>
													<li><a data-toggle="tab" href="#tab_3"><i class="icon-plus"></i> Other Questions</a></li>
												</ul>
											</div>
											<div class="span9">
												<div class="tab-content">
													<div id="tab_1" class="tab-pane active">
														<div style="height: auto;" id="accordion1" class="accordion collapse">
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_1" data-parent="#accordion1" data-toggle="collapse" class="accordion-toggle collapsed">
																	Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry ?
																	</a>
																</div>
																<div class="accordion-body collapse in" id="collapse_1">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_2" data-parent="#accordion1" data-toggle="collapse" class="accordion-toggle collapsed">
																	Pariatur cliche reprehenderit enim eiusmod highr brunch ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_2">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_3" data-parent="#accordion1" data-toggle="collapse" class="accordion-toggle collapsed">
																	Food truck quinoa nesciunt laborum eiusmod nim eiusmod high life accusamus  ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_3">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_4" data-parent="#accordion1" data-toggle="collapse" class="accordion-toggle collapsed">
																	High life accusamus terry richardson ad ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_4">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_5" data-parent="#accordion1" data-toggle="collapse" class="accordion-toggle collapsed">
																	Reprehenderit enim eiusmod high life accusamus terry quinoa nesciunt laborum eiusmod ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_5">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_6" data-parent="#accordion1" data-toggle="collapse" class="accordion-toggle collapsed">
																	Wolf moon officia aute non cupidatat skateboard dolor brunch ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_6">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
														</div>
													</div>
													<div id="tab_2" class="tab-pane">
														<div style="height: auto;" id="accordion2" class="accordion collapse">
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_2_1" data-parent="#accordion2" data-toggle="collapse" class="accordion-toggle collapsed">
																	Cliche reprehenderit, enim eiusmod high life accusamus enim eiusmod ?
																	</a>
																</div>
																<div class="accordion-body collapse in" id="collapse_2_1">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_2_2" data-parent="#accordion2" data-toggle="collapse" class="accordion-toggle collapsed">
																	Pariatur cliche reprehenderit enim eiusmod high life non cupidatat skateboard dolor brunch ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_2_2">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_2_3" data-parent="#accordion2" data-toggle="collapse" class="accordion-toggle collapsed">
																	Food truck quinoa nesciunt laborum eiusmod ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_2_3">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_2_4" data-parent="#accordion2" data-toggle="collapse" class="accordion-toggle collapsed">
																	High life accusamus terry richardson ad squid enim eiusmod high ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_2_4">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_2_5" data-parent="#accordion2" data-toggle="collapse" class="accordion-toggle collapsed">
																	Reprehenderit enim eiusmod high life accusamus terry quinoa nesciunt laborum eiusmod ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_2_5">
																	<div class="accordion-inner">
																		<p>
																			Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																		</p>
																		<p> 
																			moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmodBrunch 3 wolf moon tempor
																		</p>
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_2_6" data-parent="#accordion2" data-toggle="collapse" class="accordion-toggle collapsed">
																	Wolf moon officia aute non cupidatat skateboard dolor brunch ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_2_6">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_2_7" data-parent="#accordion2" data-toggle="collapse" class="accordion-toggle collapsed">
																	Reprehenderit enim eiusmod high life accusamus terry quinoa nesciunt laborum eiusmod ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_2_7">
																	<div class="accordion-inner">
																		<p>
																			Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																		</p>
																		<p> 
																			moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmodBrunch 3 wolf moon tempor
																		</p>
																	</div>
																</div>
															</div>
														</div>
													</div>
													<div id="tab_3" class="tab-pane">
														<div style="height: auto;" id="accordion3" class="accordion collapse">
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_3_1" data-parent="#accordion3" data-toggle="collapse" class="accordion-toggle collapsed">
																	Cliche reprehenderit, enim eiusmod ?
																	</a>
																</div>
																<div class="accordion-body collapse in" id="collapse_3_1">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_3_2" data-parent="#accordion3" data-toggle="collapse" class="accordion-toggle collapsed">
																	Pariatur skateboard dolor brunch ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_3_2">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_3_3" data-parent="#accordion3" data-toggle="collapse" class="accordion-toggle collapsed">
																	Food truck quinoa nesciunt laborum eiusmod ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_3_3">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_3_4" data-parent="#accordion3" data-toggle="collapse" class="accordion-toggle collapsed">
																	High life accusamus terry richardson ad squid enim eiusmod high ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_3_4">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_3_5" data-parent="#accordion3" data-toggle="collapse" class="accordion-toggle collapsed">
																	Reprehenderit enim eiusmod high  eiusmod ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_3_5">
																	<div class="accordion-inner">
																		<p>
																			Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																		</p>
																		<p> 
																			moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmodBrunch 3 wolf moon tempor
																		</p>
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_3_6" data-parent="#accordion3" data-toggle="collapse" class="accordion-toggle collapsed">
																	Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_3_6">
																	<div class="accordion-inner">
																		Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_3_7" data-parent="#accordion3" data-toggle="collapse" class="accordion-toggle collapsed">
																	Reprehenderit enim eiusmod high life accusamus aborum eiusmod ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_3_7">
																	<div class="accordion-inner">
																		<p>
																			Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																		</p>
																		<p> 
																			moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmodBrunch 3 wolf moon tempor
																		</p>
																	</div>
																</div>
															</div>
															<div class="accordion-group">
																<div class="accordion-heading">
																	<a href="#collapse_3_8" data-parent="#accordion3" data-toggle="collapse" class="accordion-toggle collapsed">
																	Reprehenderit enim eiusmod high life accusamus terry quinoa nesciunt laborum eiusmod ?
																	</a>
																</div>
																<div class="accordion-body collapse" id="collapse_3_8">
																	<div class="accordion-inner">
																		<p>
																			Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor.
																		</p>
																		<p> 
																			moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmodBrunch 3 wolf moon tempor
																		</p>
																	</div>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
											<!--end span9-->                                   
										</div>
									</div>
								</div>
								<!--end tab-pane-->
							</div>
						</div>
						<!--END TABS-->
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
			2013 &copy; Metronic by keenthemes.custom made by studyjun
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
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script type="text/javascript" src="media/js/bootstrap-fileupload.js"></script>
	<script type="text/javascript" src="media/js/chosen.jquery.min.js"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="media/js/app.js"></script>      
	<!-- END PAGE LEVEL SCRIPTS -->
	<script>
		jQuery(document).ready(function() {       
		   // initiate layout and plugins
		   App.init();
		});
	</script>
	<!-- END JAVASCRIPTS -->
<script type="text/javascript">  var _gaq = _gaq || [];  _gaq.push(['_setAccount', 'UA-37564768-1']);  _gaq.push(['_setDomainName', 'keenthemes.com']);  _gaq.push(['_setAllowLinker', true]);  _gaq.push(['_trackPageview']);  (function() {    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);  })();</script></body>
<!-- END BODY -->
</html>