function init_all(data) {
	for(var i=0;i<data.length;i++){
		if(data.list[i].name == "shenHeJiLu"){//其他
			$("input[name='shenHeJiLu_a1']").val(data.list[i].shenHeJiLu_a1);
			$("input[name='shenHeJiLu_a2']").val(data.list[i].shenHeJiLu_a2);

			$("input[name='shenHeJiLu_b1']").val(data.list[i].shenHeJiLu_b1);

			$("input[name='shenHeJiLu_c1']").val(data.list[i].shenHeJiLu_c1);

			$("input[name='shenHeJiLu_d1']").val(data.list[i].shenHeJiLu_d1);
		

			$("input[name='shenHeJiLu_l1']").val(data.list[i].change[0].shenHeJiLu_l1);
			$("input[name='shenHeJiLu_l2']").val(data.list[i].change[0].shenHeJiLu_l2);
			$("input[name='shenHeJiLu_l3']").val(data.list[i].change[0].shenHeJiLu_l3);
			$("input[name='shenHeJiLu_l4']").val(data.list[i].change[0].shenHeJiLu_l4);
			$("input[name='shenHeJiLu_l5']").val(data.list[i].change[0].shenHeJiLu_l5);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shenHeJiLu_l1" value="'+data.list[i].change[j].shenHeJiLu_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shenHeJiLu_l2" value="'+data.list[i].change[j].shenHeJiLu_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shenHeJiLu_l3" value="'+data.list[i].change[j].shenHeJiLu_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shenHeJiLu_l4" value="'+data.list[i].change[j].shenHeJiLu_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shenHeJiLu_l5" value="'+data.list[i].change[j].shenHeJiLu_l5+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#shenHeJiLu").before($str);
				}
			}
		}
	}

}