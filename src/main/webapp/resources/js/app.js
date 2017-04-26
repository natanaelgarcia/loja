function valida(){
	if (depreciacao.codigo.value == ""){
		alert("Opis! Este campo deve ser preenchido");
		depreciacao.codigo.focus();
		return false;
	}
}
