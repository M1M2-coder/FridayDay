(function(){
	switch (menu) {
	case "About Us":
		$('#about').addClass('active');
		break;
	case "Contact Us":
		$('#contact').addClass('active');
		break;
	case "All Products":
		$('#listProd').addClass('active');
		break;
	default:
		$('#listProd').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}
})();