function showTime(){
		var timeSpan = document.getElementById("timeSpan");
		var date  = new Date().toLocaleString();
		timeSpan.innerHTML = date.fontcolor("red");
	}
	
function hideTime(){
	var timeSpan = document.getElementById("timeSpan");
	timeSpan.innerHTML = "";
}