$('#page-sidebar-menu li ul li').bind('click',function(){
	
//	$('#page-sidebar-menu li ul li').removeClass('active start');
//	$(this).addClass('start active');
	$(this).parent().parent().addClass("active");
	
});