$(function(){
	$("#sendBtn").click(send_letter);
	$(".close").click(delete_msg);
});

function send_letter() {
	$("#sendModal").modal("hide");
	$("#hintModal").modal("show");
	setTimeout(function(){
		$("#hintModal").modal("hide");
	}, 2000);
}

function delete_msg() {
	// sudo pip install dash==0.29.0TODO 删除数据
	$(this).parents(".media").remove();
}