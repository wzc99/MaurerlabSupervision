$(function(){
	var ShenHeJiLuIndex = 2;
	$("#addShenHeJiLu").click(function(){
		var tempDelFileInfoId = "ShenHeJiLuIndex" + ++ShenHeJiLuIndex;
	    $str='';
        $str+='<tr>';
		$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shenHeJiLu_l1" /></td>';
		$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shenHeJiLu_l2" /></td>';
		$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shenHeJiLu_l3" /></td>';
		$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shenHeJiLu_l4" /></td>';
		$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shenHeJiLu_l5" /></td>';
		$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
	    $str+='</tr>';
	    $("#shenHeJiLu").before($str);

	});

});

function delTr(tempTdId){//删除
	var obj  = $("#" + tempTdId);
	$(obj).parent().parent().remove();  
}