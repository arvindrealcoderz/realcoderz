  function madeAjaxCall() {
  alert("save data clicked ");
	var name = $("#uname").val();
	var role = $("#role").val();
	var password = $("#password").val();
	var conformpassword = $("#conformpassword").val();
alert(name+" "+role+""+password+" " +conformpassword);
	$.ajax({
	    type : "post",
	    url : 'adminReg',
	    data : {
		name : name,
		role : role,
		pass : password,
		conformpassword : conformpassword,		
	    },
	    cache : false,
	    success : function(response) {
		$('#somediv').html(response);
		$('#div2').hide();
	    },
	    error : function() {
		$('#somediv').html(response);
		$("#div1").show();
	    }
	});
    }