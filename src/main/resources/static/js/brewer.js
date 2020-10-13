$(function() {
	var decimal = $('.js-decimal');
	decimal.maskMoney();
	
	var whole = $('.js-whole');
	whole.maskMoney({ precision: 0 });
});