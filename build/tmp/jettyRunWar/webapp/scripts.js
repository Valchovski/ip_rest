// Load table on ready document
$(document).on('ready', getData);

// Sends a GET request to the web server and populates the table
function getData() {
	$.ajax({
		url: "http://localhost:8080/rest/api/cpus",
		type: "GET",
		dataType: "json",
		success: function(data) {
			console.log(data);
			
			$.each(data, function(index){
				var tr = $('<tr>');
				tr.append('<td>' + data[index].name + '</td>');
				tr.append('<td>' + data[index].clock + '</td>');
				tr.append('<td>' + data[index].cache + '</td>');
				tr.append('<td>' + data[index].cores + '</td>');
				tr.append('<td>' + data[index].threads + '</td>');
				tr.append('<td>' + data[index].tdp + '</td>');
				tr.append('</tr>');
				$('#cpusTable').append(tr);
			});
		}
	});
}

$('#add').on('click', function () {
	var data = $('#addForm').serializeArray().reduce(function (data, prop) {
		data[prop.name] = prop.value;
		return data;
	}, {});

	$.post({
		contentType: 'application/json',
		url: 'http://localhost:8080/rest/api/cpus',
		dataType: "json",
		data: JSON.stringify(data),
		success: function(response) {
			console.log(response);
			var l = response.itemList.length - 1;
			
			var tr = $('<tr>');
			tr.append('<td>' + response.itemList[l].name + '</td>');
			tr.append('<td>' + response.itemList[l].clock + '</td>');
			tr.append('<td>' + response.itemList[l].cache + '</td>');
			tr.append('<td>' + response.itemList[l].cores + '</td>');
			tr.append('<td>' + response.itemList[l].threads + '</td>');
			tr.append('<td>' + response.itemList[l].tdp + '</td>');
			tr.append('</tr>');
			$('#cpusTable').append(tr);
		}
	})
}); 