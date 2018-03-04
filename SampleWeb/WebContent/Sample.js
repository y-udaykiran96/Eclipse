/**
 * 
 */
outp = document.getElementById('demo');
outp.innerHTML="Hello jk";
outp.innerHTML= Date()+"jk";
var s="String";
outp.innerHTML = s.length;
var ob = {fname:"firstname",lname:"lastname",age:22};
var ob1 = ob;
ob1.age=23;
outp.innerHTML = ob1.age;
document.write("<b>hello</b>");

var a = document.getElementById('inp');
function func() {
	//window.prompt();
	//window.alert();
	if(!a.checkValidity())outp.innerHTML = a.validationMessage;
	else outp.innerHTML = "OK";
	
}





