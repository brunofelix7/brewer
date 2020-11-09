$(function() {
	//	Adiciona máscara de formatação para campos com casas decimais
	var decimal = $('.js-decimal');
	decimal.maskMoney();
	
	//	Adiciona máscara de formatação para campos inteiros
	var whole = $('.js-whole');
	whole.maskMoney({ precision: 0 });
	
	$('.js-status').bootstrapSwitch();
});