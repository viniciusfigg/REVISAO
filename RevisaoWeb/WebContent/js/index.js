$(document).ready(function() {
	alert("Entrei na revisao !");
});

$.ajax({
	type : "GET",
	url : "http://localhost:9080/RevisaoWeb/revisaoRest/cliente/listaTudo",
	cache : false,
	async : false,
	dataType : 'json',
	success : function(resultCliente){
		
		var html = " <select id=clienteSelCBX> ";
		html += "<option value=''>Selecione</option>";

		for (var i = 0; i < resultCliente.length; i++) {

			html += "<option value=" + resultCliente[i].id + ">"
					+ resultCliente[i].nome + "</option>";

		}

		html += " </select> ";
		
		$("#idClienteSel").html(html);
 		
	}
});
