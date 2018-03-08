function init_all(data) {
	for(var i=0;i<data.length;i++){
		if(data.list[i].name == "hanGuanJiHe"){//其他
			$("input[name='hanGuanJiHe_a1']").val(data.list[i].hanGuanJiHe_a1);
			$("input[name='hanGuanJiHe_a2']").val(data.list[i].hanGuanJiHe_a2);
			$("input[name='hanGuanJiHe_a3']").val(data.list[i].hanGuanJiHe_a3);
			$("input[name='hanGuanJiHe_a4']").val(data.list[i].hanGuanJiHe_a4);

			$("input[name='hanGuanJiHe_b1']").val(data.list[i].hanGuanJiHe_b1);
			$("input[name='hanGuanJiHe_b2']").val(data.list[i].hanGuanJiHe_b2);
			$("input[name='hanGuanJiHe_b3']").val(data.list[i].hanGuanJiHe_b3);
			$("input[name='hanGuanJiHe_b4']").val(data.list[i].hanGuanJiHe_b4);
			$("input[name='hanGuanJiHe_b5']").val(data.list[i].hanGuanJiHe_b5);
			$("input[name='hanGuanJiHe_b6']").val(data.list[i].hanGuanJiHe_b6);
			$("input[name='hanGuanJiHe_b7']").val(data.list[i].hanGuanJiHe_b7);
			$("input[name='hanGuanJiHe_b8']").val(data.list[i].hanGuanJiHe_b8);
			$("input[name='hanGuanJiHe_b9']").val(data.list[i].hanGuanJiHe_b9);
			$("input[name='hanGuanJiHe_b10']").val(data.list[i].hanGuanJiHe_b10);
			$("input[name='hanGuanJiHe_b11']").val(data.list[i].hanGuanJiHe_b11);
			$("input[name='hanGuanJiHe_b12']").val(data.list[i].hanGuanJiHe_b12);
			$("input[name='hanGuanJiHe_b13']").val(data.list[i].hanGuanJiHe_b13);
			$("input[name='hanGuanJiHe_b14']").val(data.list[i].hanGuanJiHe_b14);
			$("input[name='hanGuanJiHe_b15']").val(data.list[i].hanGuanJiHe_b15);
			$("input[name='hanGuanJiHe_b16']").val(data.list[i].hanGuanJiHe_b16);

			$("input[name='hanGuanJiHe_c1']").val(data.list[i].hanGuanJiHe_c1);


			$("input[name='hanGuanJiHe_l1']").val(data.list[i].change[0].hanGuanJiHe_l1);
			$("input[name='hanGuanJiHe_l2']").val(data.list[i].change[0].hanGuanJiHe_l2);
			$("input[name='hanGuanJiHe_l3']").val(data.list[i].change[0].hanGuanJiHe_l3);
			$("input[name='hanGuanJiHe_l4']").val(data.list[i].change[0].hanGuanJiHe_l4);
			$("input[name='hanGuanJiHe_l5']").val(data.list[i].change[0].hanGuanJiHe_l5);
			$("input[name='hanGuanJiHe_l6']").val(data.list[i].change[0].hanGuanJiHe_l6);
			$("input[name='hanGuanJiHe_l7']").val(data.list[i].change[0].hanGuanJiHe_l7);
			$("input[name='hanGuanJiHe_l8']").val(data.list[i].change[0].hanGuanJiHe_l8);
			$("input[name='hanGuanJiHe_l9']").val(data.list[i].change[0].hanGuanJiHe_l9);
			$("input[name='hanGuanJiHe_l10']").val(data.list[i].change[0].hanGuanJiHe_l10);
			$("input[name='hanGuanJiHe_l11']").val(data.list[i].change[0].hanGuanJiHe_l11);
			$("input[name='hanGuanJiHe_l12']").val(data.list[i].change[0].hanGuanJiHe_l12);
			$("input[name='hanGuanJiHe_l13']").val(data.list[i].change[0].hanGuanJiHe_l13);
			$("input[name='hanGuanJiHe_l14']").val(data.list[i].change[0].hanGuanJiHe_l14);
			$("input[name='hanGuanJiHe_l15']").val(data.list[i].change[0].hanGuanJiHe_l15);
			$("input[name='hanGuanJiHe_l16']").val(data.list[i].change[0].hanGuanJiHe_l16);
			$("input[name='hanGuanJiHe_l17']").val(data.list[i].change[0].hanGuanJiHe_l17);
			$("input[name='hanGuanJiHe_l18']").val(data.list[i].change[0].hanGuanJiHe_l18);
			$("input[name='hanGuanJiHe_l19']").val(data.list[i].change[0].hanGuanJiHe_l19);
			$("input[name='hanGuanJiHe_l20']").val(data.list[i].change[0].hanGuanJiHe_l20);
			$("input[name='hanGuanJiHe_l21']").val(data.list[i].change[0].hanGuanJiHe_l21);
			$("input[name='hanGuanJiHe_l22']").val(data.list[i].change[0].hanGuanJiHe_l22);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l1" value="'+data.list[i].change[j].hanGuanJiHe_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l2" value="'+data.list[i].change[j].hanGuanJiHe_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l3" value="'+data.list[i].change[j].hanGuanJiHe_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l4" value="'+data.list[i].change[j].hanGuanJiHe_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l5" value="'+data.list[i].change[j].hanGuanJiHe_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l6" value="'+data.list[i].change[j].hanGuanJiHe_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l7" value="'+data.list[i].change[j].hanGuanJiHe_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l8" value="'+data.list[i].change[j].hanGuanJiHe_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l9" value="'+data.list[i].change[j].hanGuanJiHe_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l10" value="'+data.list[i].change[j].hanGuanJiHe_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l11" value="'+data.list[i].change[j].hanGuanJiHe_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l12" value="'+data.list[i].change[j].hanGuanJiHe_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l13" value="'+data.list[i].change[j].hanGuanJiHe_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l14" value="'+data.list[i].change[j].hanGuanJiHe_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l15" value="'+data.list[i].change[j].hanGuanJiHe_l15+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l16" value="'+data.list[i].change[j].hanGuanJiHe_l16+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l17" value="'+data.list[i].change[j].hanGuanJiHe_l17+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l18" value="'+data.list[i].change[j].hanGuanJiHe_l18+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l19" value="'+data.list[i].change[j].hanGuanJiHe_l19+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l20" value="'+data.list[i].change[j].hanGuanJiHe_l20+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l21" value="'+data.list[i].change[j].hanGuanJiHe_l21+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="hanGuanJiHe_l22" value="'+data.list[i].change[j].hanGuanJiHe_l22+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#hanGuanJiHe").before($str);
				}
			}
		}

		if(data.list[i].name == "wuFengGangGuan"){//其他
			$("input[name='wuFengGangGuan_a1']").val(data.list[i].wuFengGangGuan_a1);
			$("input[name='wuFengGangGuan_a2']").val(data.list[i].wuFengGangGuan_a2);
			$("input[name='wuFengGangGuan_a3']").val(data.list[i].wuFengGangGuan_a3);

			$("input[name='wuFengGangGuan_b1']").val(data.list[i].wuFengGangGuan_b1);
			$("input[name='wuFengGangGuan_b2']").val(data.list[i].wuFengGangGuan_b2);

			$("input[name='wuFengGangGuan_c1']").val(data.list[i].wuFengGangGuan_c1);
			$("input[name='wuFengGangGuan_c2']").val(data.list[i].wuFengGangGuan_c2);
			$("input[name='wuFengGangGuan_c3']").val(data.list[i].wuFengGangGuan_c3);
			$("input[name='wuFengGangGuan_c4']").val(data.list[i].wuFengGangGuan_c4);
			$("input[name='wuFengGangGuan_c5']").val(data.list[i].wuFengGangGuan_c5);
			$("input[name='wuFengGangGuan_c6']").val(data.list[i].wuFengGangGuan_c6);
			$("input[name='wuFengGangGuan_c7']").val(data.list[i].wuFengGangGuan_c7);
			$("input[name='wuFengGangGuan_c8']").val(data.list[i].wuFengGangGuan_c8);
			$("input[name='wuFengGangGuan_c9']").val(data.list[i].wuFengGangGuan_c9);
			$("input[name='wuFengGangGuan_c10']").val(data.list[i].wuFengGangGuan_c10);
			$("input[name='wuFengGangGuan_c11']").val(data.list[i].wuFengGangGuan_c11);


			$("input[name='wuFengGangGuan_l1']").val(data.list[i].change[0].wuFengGangGuan_l1);
			$("input[name='wuFengGangGuan_l2']").val(data.list[i].change[0].wuFengGangGuan_l2);
			$("input[name='wuFengGangGuan_l3']").val(data.list[i].change[0].wuFengGangGuan_l3);
			$("input[name='wuFengGangGuan_l4']").val(data.list[i].change[0].wuFengGangGuan_l4);
			$("input[name='wuFengGangGuan_l5']").val(data.list[i].change[0].wuFengGangGuan_l5);
			$("input[name='wuFengGangGuan_l6']").val(data.list[i].change[0].wuFengGangGuan_l6);
			$("input[name='wuFengGangGuan_l7']").val(data.list[i].change[0].wuFengGangGuan_l7);
			$("input[name='wuFengGangGuan_l8']").val(data.list[i].change[0].wuFengGangGuan_l8);
			$("input[name='wuFengGangGuan_l9']").val(data.list[i].change[0].wuFengGangGuan_l9);
			$("input[name='wuFengGangGuan_l10']").val(data.list[i].change[0].wuFengGangGuan_l10);
			$("input[name='wuFengGangGuan_l11']").val(data.list[i].change[0].wuFengGangGuan_l11);
			$("input[name='wuFengGangGuan_l12']").val(data.list[i].change[0].wuFengGangGuan_l12);
			$("input[name='wuFengGangGuan_l13']").val(data.list[i].change[0].wuFengGangGuan_l13);
			$("input[name='wuFengGangGuan_l14']").val(data.list[i].change[0].wuFengGangGuan_l14);
			$("input[name='wuFengGangGuan_l15']").val(data.list[i].change[0].wuFengGangGuan_l15);
			$("input[name='wuFengGangGuan_l16']").val(data.list[i].change[0].wuFengGangGuan_l16);
			$("input[name='wuFengGangGuan_l17']").val(data.list[i].change[0].wuFengGangGuan_l17);
			$("input[name='wuFengGangGuan_l18']").val(data.list[i].change[0].wuFengGangGuan_l18);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l1" value="'+data.list[i].change[j].wuFengGangGuan_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l2" value="'+data.list[i].change[j].wuFengGangGuan_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l3" value="'+data.list[i].change[j].wuFengGangGuan_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l4" value="'+data.list[i].change[j].wuFengGangGuan_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l5" value="'+data.list[i].change[j].wuFengGangGuan_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l6" value="'+data.list[i].change[j].wuFengGangGuan_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l7" value="'+data.list[i].change[j].wuFengGangGuan_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l8" value="'+data.list[i].change[j].wuFengGangGuan_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l9" value="'+data.list[i].change[j].wuFengGangGuan_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l10" value="'+data.list[i].change[j].wuFengGangGuan_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l11" value="'+data.list[i].change[j].wuFengGangGuan_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l12" value="'+data.list[i].change[j].wuFengGangGuan_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l13" value="'+data.list[i].change[j].wuFengGangGuan_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l14" value="'+data.list[i].change[j].wuFengGangGuan_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l15" value="'+data.list[i].change[j].wuFengGangGuan_l15+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l16" value="'+data.list[i].change[j].wuFengGangGuan_l16+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l17" value="'+data.list[i].change[j].wuFengGangGuan_l17+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wuFengGangGuan_l18" value="'+data.list[i].change[j].wuFengGangGuan_l18+'"/></td>';

				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#wuFengGangGuan").before($str);
				}
			}
		}


		if(data.list[i].name == "youTaoGuan"){//其他
			$("input[name='youTaoGuan_a1']").val(data.list[i].youTaoGuan_a1);
			$("input[name='youTaoGuan_a2']").val(data.list[i].youTaoGuan_a2);
			$("input[name='youTaoGuan_a3']").val(data.list[i].youTaoGuan_a3);

			$("input[name='youTaoGuan_b1']").val(data.list[i].youTaoGuan_b1);
			$("input[name='youTaoGuan_b2']").val(data.list[i].youTaoGuan_b2);

			$("input[name='youTaoGuan_c1']").val(data.list[i].youTaoGuan_c1);
			$("input[name='youTaoGuan_c2']").val(data.list[i].youTaoGuan_c2);
			$("input[name='youTaoGuan_c3']").val(data.list[i].youTaoGuan_c3);
			$("input[name='youTaoGuan_c4']").val(data.list[i].youTaoGuan_c4);
			$("input[name='youTaoGuan_c5']").val(data.list[i].youTaoGuan_c5);
			$("input[name='youTaoGuan_c6']").val(data.list[i].youTaoGuan_c6);
			$("input[name='youTaoGuan_c7']").val(data.list[i].youTaoGuan_c7);
			$("input[name='youTaoGuan_c8']").val(data.list[i].youTaoGuan_c8);

			$("input[name='youTaoGuan_d1']").val(data.list[i].youTaoGuan_d1);

			$("input[name='youTaoGuan_l1']").val(data.list[i].change[0].youTaoGuan_l1);
			$("input[name='youTaoGuan_l2']").val(data.list[i].change[0].youTaoGuan_l2);
			$("input[name='youTaoGuan_l3']").val(data.list[i].change[0].youTaoGuan_l3);
			$("input[name='youTaoGuan_l4']").val(data.list[i].change[0].youTaoGuan_l4);
			$("input[name='youTaoGuan_l5']").val(data.list[i].change[0].youTaoGuan_l5);
			$("input[name='youTaoGuan_l6']").val(data.list[i].change[0].youTaoGuan_l6);
			$("input[name='youTaoGuan_l7']").val(data.list[i].change[0].youTaoGuan_l7);
			$("input[name='youTaoGuan_l8']").val(data.list[i].change[0].youTaoGuan_l8);
			$("input[name='youTaoGuan_l9']").val(data.list[i].change[0].youTaoGuan_l9);
			$("input[name='youTaoGuan_l10']").val(data.list[i].change[0].youTaoGuan_l10);
			$("input[name='youTaoGuan_l11']").val(data.list[i].change[0].youTaoGuan_l11);
			$("input[name='youTaoGuan_l12']").val(data.list[i].change[0].youTaoGuan_l12);
			$("input[name='youTaoGuan_l13']").val(data.list[i].change[0].youTaoGuan_l13);
			$("input[name='youTaoGuan_l14']").val(data.list[i].change[0].youTaoGuan_l14);
			$("input[name='youTaoGuan_l15']").val(data.list[i].change[0].youTaoGuan_l15);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l1" value="'+data.list[i].change[j].youTaoGuan_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l2" value="'+data.list[i].change[j].youTaoGuan_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l3" value="'+data.list[i].change[j].youTaoGuan_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l4" value="'+data.list[i].change[j].youTaoGuan_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l5" value="'+data.list[i].change[j].youTaoGuan_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l6" value="'+data.list[i].change[j].youTaoGuan_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l7" value="'+data.list[i].change[j].youTaoGuan_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l8" value="'+data.list[i].change[j].youTaoGuan_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l9" value="'+data.list[i].change[j].youTaoGuan_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l10" value="'+data.list[i].change[j].youTaoGuan_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l11" value="'+data.list[i].change[j].youTaoGuan_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l12" value="'+data.list[i].change[j].youTaoGuan_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l13" value="'+data.list[i].change[j].youTaoGuan_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l14" value="'+data.list[i].change[j].youTaoGuan_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuan_l15" value="'+data.list[i].change[j].youTaoGuan_l15+'"/></td>';
				   
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#youTaoGuan").before($str);
				}
			}
		

		if(data.list[i].name == "wanGuanJiHe"){//其他
			$("input[name='wanGuanJiHe_a1']").val(data.list[i].wanGuanJiHe_a1);
			$("input[name='wanGuanJiHe_a2']").val(data.list[i].wanGuanJiHe_a2);
			$("input[name='wanGuanJiHe_a3']").val(data.list[i].wanGuanJiHe_a3);
			$("input[name='wanGuanJiHe_a4']").val(data.list[i].wanGuanJiHe_a4);

			$("input[name='wanGuanJiHe_b1']").val(data.list[i].wanGuanJiHe_b1);
			$("input[name='wanGuanJiHe_b2']").val(data.list[i].wanGuanJiHe_b2);
			$("input[name='wanGuanJiHe_b3']").val(data.list[i].wanGuanJiHe_b3);
			$("input[name='wanGuanJiHe_b4']").val(data.list[i].wanGuanJiHe_b4);
			$("input[name='wanGuanJiHe_b5']").val(data.list[i].wanGuanJiHe_b5);
			$("input[name='wanGuanJiHe_b6']").val(data.list[i].wanGuanJiHe_b6);
			$("input[name='wanGuanJiHe_b7']").val(data.list[i].wanGuanJiHe_b7);
			$("input[name='wanGuanJiHe_b8']").val(data.list[i].wanGuanJiHe_b8);
			$("input[name='wanGuanJiHe_b9']").val(data.list[i].wanGuanJiHe_b9);
			$("input[name='wanGuanJiHe_b10']").val(data.list[i].wanGuanJiHe_b10);
			$("input[name='wanGuanJiHe_b11']").val(data.list[i].wanGuanJiHe_b11);
			$("input[name='wanGuanJiHe_b12']").val(data.list[i].wanGuanJiHe_b12);
			$("input[name='wanGuanJiHe_b13']").val(data.list[i].wanGuanJiHe_b13);
			$("input[name='wanGuanJiHe_b14']").val(data.list[i].wanGuanJiHe_b14);

			$("input[name='wanGuanJiHe_c1']").val(data.list[i].wanGuanJiHe_c1);


			$("input[name='wanGuanJiHe_l1']").val(data.list[i].change[0].wanGuanJiHe_l1);
			$("input[name='wanGuanJiHe_l2']").val(data.list[i].change[0].wanGuanJiHe_l2);
			$("input[name='wanGuanJiHe_l3']").val(data.list[i].change[0].wanGuanJiHe_l3);
			$("input[name='wanGuanJiHe_l4']").val(data.list[i].change[0].wanGuanJiHe_l4);
			$("input[name='wanGuanJiHe_l5']").val(data.list[i].change[0].wanGuanJiHe_l5);
			$("input[name='wanGuanJiHe_l6']").val(data.list[i].change[0].wanGuanJiHe_l6);
			$("input[name='wanGuanJiHe_l7']").val(data.list[i].change[0].wanGuanJiHe_l7);
			$("input[name='wanGuanJiHe_l8']").val(data.list[i].change[0].wanGuanJiHe_l8);
			$("input[name='wanGuanJiHe_l9']").val(data.list[i].change[0].wanGuanJiHe_l9);
			$("input[name='wanGuanJiHe_l10']").val(data.list[i].change[0].wanGuanJiHe_l10);
			$("input[name='wanGuanJiHe_l11']").val(data.list[i].change[0].wanGuanJiHe_l11);
			$("input[name='wanGuanJiHe_l12']").val(data.list[i].change[0].wanGuanJiHe_l12);
			$("input[name='wanGuanJiHe_l13']").val(data.list[i].change[0].wanGuanJiHe_l13);
			$("input[name='wanGuanJiHe_l14']").val(data.list[i].change[0].wanGuanJiHe_l14);
			$("input[name='wanGuanJiHe_l15']").val(data.list[i].change[0].wanGuanJiHe_l15);
			$("input[name='wanGuanJiHe_l16']").val(data.list[i].change[0].wanGuanJiHe_l16);
			$("input[name='wanGuanJiHe_l17']").val(data.list[i].change[0].wanGuanJiHe_l17);
			$("input[name='wanGuanJiHe_l18']").val(data.list[i].change[0].wanGuanJiHe_l18);
			$("input[name='wanGuanJiHe_l19']").val(data.list[i].change[0].wanGuanJiHe_l19);
			$("input[name='wanGuanJiHe_l20']").val(data.list[i].change[0].wanGuanJiHe_l20);
			$("input[name='wanGuanJiHe_l21']").val(data.list[i].change[0].wanGuanJiHe_l21);
			$("input[name='wanGuanJiHe_l22']").val(data.list[i].change[0].wanGuanJiHe_l22);
			$("input[name='wanGuanJiHe_l23']").val(data.list[i].change[0].wanGuanJiHe_l23);
			$("input[name='wanGuanJiHe_l24']").val(data.list[i].change[0].wanGuanJiHe_l24);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l1" value="'+data.list[i].change[j].wanGuanJiHe_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l2" value="'+data.list[i].change[j].wanGuanJiHe_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l3" value="'+data.list[i].change[j].wanGuanJiHe_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l4" value="'+data.list[i].change[j].wanGuanJiHe_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l5" value="'+data.list[i].change[j].wanGuanJiHe_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l6" value="'+data.list[i].change[j].wanGuanJiHe_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l7" value="'+data.list[i].change[j].wanGuanJiHe_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l8" value="'+data.list[i].change[j].wanGuanJiHe_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l9" value="'+data.list[i].change[j].wanGuanJiHe_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l10" value="'+data.list[i].change[j].wanGuanJiHe_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l11" value="'+data.list[i].change[j].wanGuanJiHe_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l12" value="'+data.list[i].change[j].wanGuanJiHe_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l13" value="'+data.list[i].change[j].wanGuanJiHe_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l14" value="'+data.list[i].change[j].wanGuanJiHe_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l15" value="'+data.list[i].change[j].wanGuanJiHe_l15+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l16" value="'+data.list[i].change[j].wanGuanJiHe_l16+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l17" value="'+data.list[i].change[j].wanGuanJiHe_l17+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l18" value="'+data.list[i].change[j].wanGuanJiHe_l18+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l19" value="'+data.list[i].change[j].wanGuanJiHe_l19+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l20" value="'+data.list[i].change[j].wanGuanJiHe_l20+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l21" value="'+data.list[i].change[j].wanGuanJiHe_l21+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l22" value="'+data.list[i].change[j].wanGuanJiHe_l22+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l23" value="'+data.list[i].change[j].wanGuanJiHe_l23+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="wanGuanJiHe_l24" value="'+data.list[i].change[j].wanGuanJiHe_l24+'"/></td>';

				   
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#wanGuanJiHe").before($str);
				}
			}
		

		if(data.list[i].name == "jiuShiTou"){//其他
			$("input[name='jiuShiTou_a1']").val(data.list[i].jiuShiTou_a1);
			$("input[name='jiuShiTou_a2']").val(data.list[i].jiuShiTou_a2);
			$("input[name='jiuShiTou_a3']").val(data.list[i].jiuShiTou_a3);
			$("input[name='jiuShiTou_a4']").val(data.list[i].jiuShiTou_a4);

			$("input[name='jiuShiTou_b1']").val(data.list[i].jiuShiTou_b1);

			$("input[name='jiuShiTou_c1']").val(data.list[i].jiuShiTou_c1);
			$("input[name='jiuShiTou_c2']").val(data.list[i].jiuShiTou_c2);
			$("input[name='jiuShiTou_c3']").val(data.list[i].jiuShiTou_c3);
			$("input[name='jiuShiTou_c4']").val(data.list[i].jiuShiTou_c4);
			$("input[name='jiuShiTou_c5']").val(data.list[i].jiuShiTou_c5);
			$("input[name='jiuShiTou_c6']").val(data.list[i].jiuShiTou_c6);
			$("input[name='jiuShiTou_c7']").val(data.list[i].jiuShiTou_c7);
			$("input[name='jiuShiTou_c8']").val(data.list[i].jiuShiTou_c8);
			$("input[name='jiuShiTou_c9']").val(data.list[i].jiuShiTou_c9);
			$("input[name='jiuShiTou_c10']").val(data.list[i].jiuShiTou_c10);
			$("input[name='jiuShiTou_c11']").val(data.list[i].jiuShiTou_c11);

			$("input[name='jiuShiTou_d1']").val(data.list[i].jiuShiTou_d1);


			$("input[name='jiuShiTou_l1']").val(data.list[i].change[0].jiuShiTou_l1);
			$("input[name='jiuShiTou_l2']").val(data.list[i].change[0].jiuShiTou_l2);
			$("input[name='jiuShiTou_l3']").val(data.list[i].change[0].jiuShiTou_l3);
			$("input[name='jiuShiTou_l4']").val(data.list[i].change[0].jiuShiTou_l4);
			$("input[name='jiuShiTou_l5']").val(data.list[i].change[0].jiuShiTou_l5);
			$("input[name='jiuShiTou_l6']").val(data.list[i].change[0].jiuShiTou_l6);
			$("input[name='jiuShiTou_l7']").val(data.list[i].change[0].jiuShiTou_l7);
			$("input[name='jiuShiTou_l8']").val(data.list[i].change[0].jiuShiTou_l8);
			$("input[name='jiuShiTou_l9']").val(data.list[i].change[0].jiuShiTou_l9);
			$("input[name='jiuShiTou_l10']").val(data.list[i].change[0].jiuShiTou_l10);
			$("input[name='jiuShiTou_l11']").val(data.list[i].change[0].jiuShiTou_l11);
			$("input[name='jiuShiTou_l12']").val(data.list[i].change[0].jiuShiTou_l12);
			$("input[name='jiuShiTou_l13']").val(data.list[i].change[0].jiuShiTou_l13);
			$("input[name='jiuShiTou_l14']").val(data.list[i].change[0].jiuShiTou_l14);
			$("input[name='jiuShiTou_l15']").val(data.list[i].change[0].jiuShiTou_l15);
			$("input[name='jiuShiTou_l16']").val(data.list[i].change[0].jiuShiTou_l16);
			$("input[name='jiuShiTou_l17']").val(data.list[i].change[0].jiuShiTou_l17);
			$("input[name='jiuShiTou_l18']").val(data.list[i].change[0].jiuShiTou_l18);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l1" value="'+data.list[i].change[j].jiuShiTou_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l2" value="'+data.list[i].change[j].jiuShiTou_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l3" value="'+data.list[i].change[j].jiuShiTou_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l4" value="'+data.list[i].change[j].jiuShiTou_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l5" value="'+data.list[i].change[j].jiuShiTou_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l6" value="'+data.list[i].change[j].jiuShiTou_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l7" value="'+data.list[i].change[j].jiuShiTou_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l8" value="'+data.list[i].change[j].jiuShiTou_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l9" value="'+data.list[i].change[j].jiuShiTou_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l10" value="'+data.list[i].change[j].jiuShiTou_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l11" value="'+data.list[i].change[j].jiuShiTou_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l12" value="'+data.list[i].change[j].jiuShiTou_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l13" value="'+data.list[i].change[j].jiuShiTou_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l14" value="'+data.list[i].change[j].jiuShiTou_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l15" value="'+data.list[i].change[j].jiuShiTou_l15+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l16" value="'+data.list[i].change[j].jiuShiTou_l16+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l17" value="'+data.list[i].change[j].jiuShiTou_l17+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiTou_l18" value="'+data.list[i].change[j].jiuShiTou_l18+'"/></td>';

				   
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#jiuShiTou").before($str);
				}
			}
		

		if(data.list[i].name == "siShiWuTou"){//其他
			$("input[name='siShiWuTou_a1']").val(data.list[i].siShiWuTou_a1);
			$("input[name='siShiWuTou_a2']").val(data.list[i].siShiWuTou_a2);
			$("input[name='siShiWuTou_a3']").val(data.list[i].siShiWuTou_a3);
			$("input[name='siShiWuTou_a4']").val(data.list[i].siShiWuTou_a4);

			$("input[name='siShiWuTou_b1']").val(data.list[i].siShiWuTou_b1);

			$("input[name='siShiWuTou_c1']").val(data.list[i].siShiWuTou_c1);
			$("input[name='siShiWuTou_c2']").val(data.list[i].siShiWuTou_c2);
			$("input[name='siShiWuTou_c3']").val(data.list[i].siShiWuTou_c3);
			$("input[name='siShiWuTou_c4']").val(data.list[i].siShiWuTou_c4);
			$("input[name='siShiWuTou_c5']").val(data.list[i].siShiWuTou_c5);
			$("input[name='siShiWuTou_c6']").val(data.list[i].siShiWuTou_c6);
			$("input[name='siShiWuTou_c7']").val(data.list[i].siShiWuTou_c7);
			$("input[name='siShiWuTou_c8']").val(data.list[i].siShiWuTou_c8);
			$("input[name='siShiWuTou_c9']").val(data.list[i].siShiWuTou_c9);
			$("input[name='siShiWuTou_c10']").val(data.list[i].siShiWuTou_c10);
			$("input[name='siShiWuTou_c11']").val(data.list[i].siShiWuTou_c11);

			$("input[name='siShiWuTou_d1']").val(data.list[i].siShiWuTou_d1);


			$("input[name='siShiWuTou_l1']").val(data.list[i].change[0].siShiWuTou_l1);
			$("input[name='siShiWuTou_l2']").val(data.list[i].change[0].siShiWuTou_l2);
			$("input[name='siShiWuTou_l3']").val(data.list[i].change[0].siShiWuTou_l3);
			$("input[name='siShiWuTou_l4']").val(data.list[i].change[0].siShiWuTou_l4);
			$("input[name='siShiWuTou_l5']").val(data.list[i].change[0].siShiWuTou_l5);
			$("input[name='siShiWuTou_l6']").val(data.list[i].change[0].siShiWuTou_l6);
			$("input[name='siShiWuTou_l7']").val(data.list[i].change[0].siShiWuTou_l7);
			$("input[name='siShiWuTou_l8']").val(data.list[i].change[0].siShiWuTou_l8);
			$("input[name='siShiWuTou_l9']").val(data.list[i].change[0].siShiWuTou_l9);
			$("input[name='siShiWuTou_l10']").val(data.list[i].change[0].siShiWuTou_l10);
			$("input[name='siShiWuTou_l11']").val(data.list[i].change[0].siShiWuTou_l11);
			$("input[name='siShiWuTou_l12']").val(data.list[i].change[0].siShiWuTou_l12);
			$("input[name='siShiWuTou_l13']").val(data.list[i].change[0].siShiWuTou_l13);
			$("input[name='siShiWuTou_l14']").val(data.list[i].change[0].siShiWuTou_l14);
			$("input[name='siShiWuTou_l15']").val(data.list[i].change[0].siShiWuTou_l15);
			$("input[name='siShiWuTou_l16']").val(data.list[i].change[0].siShiWuTou_l16);
			$("input[name='siShiWuTou_l17']").val(data.list[i].change[0].siShiWuTou_l17);
			$("input[name='siShiWuTou_l18']").val(data.list[i].change[0].siShiWuTou_l18);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l1" value="'+data.list[i].change[j].siShiWuTou_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l2" value="'+data.list[i].change[j].siShiWuTou_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l3" value="'+data.list[i].change[j].siShiWuTou_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l4" value="'+data.list[i].change[j].siShiWuTou_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l5" value="'+data.list[i].change[j].siShiWuTou_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l6" value="'+data.list[i].change[j].siShiWuTou_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l7" value="'+data.list[i].change[j].siShiWuTou_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l8" value="'+data.list[i].change[j].siShiWuTou_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l9" value="'+data.list[i].change[j].siShiWuTou_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l10" value="'+data.list[i].change[j].siShiWuTou_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l11" value="'+data.list[i].change[j].siShiWuTou_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l12" value="'+data.list[i].change[j].siShiWuTou_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l13" value="'+data.list[i].change[j].siShiWuTou_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l14" value="'+data.list[i].change[j].siShiWuTou_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l15" value="'+data.list[i].change[j].siShiWuTou_l15+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l16" value="'+data.list[i].change[j].siShiWuTou_l16+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l17" value="'+data.list[i].change[j].siShiWuTou_l17+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="siShiWuTou_l18" value="'+data.list[i].change[j].siShiWuTou_l18+'"/></td>';

				   
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#siShiWuTou").before($str);
				}
			}
		

		if(data.list[i].name == "dengJingSanTong"){//其他
			$("input[name='dengJingSanTong_a1']").val(data.list[i].dengJingSanTong_a1);
			$("input[name='dengJingSanTong_a2']").val(data.list[i].dengJingSanTong_a2);
			$("input[name='dengJingSanTong_a3']").val(data.list[i].dengJingSanTong_a3);
			$("input[name='dengJingSanTong_a4']").val(data.list[i].dengJingSanTong_a4);

			$("input[name='dengJingSanTong_b1']").val(data.list[i].dengJingSanTong_b1);

			$("input[name='dengJingSanTong_c1']").val(data.list[i].dengJingSanTong_c1);
			$("input[name='dengJingSanTong_c2']").val(data.list[i].dengJingSanTong_c2);
			$("input[name='dengJingSanTong_c3']").val(data.list[i].dengJingSanTong_c3);
			$("input[name='dengJingSanTong_c4']").val(data.list[i].dengJingSanTong_c4);
			$("input[name='dengJingSanTong_c5']").val(data.list[i].dengJingSanTong_c5);
			$("input[name='dengJingSanTong_c6']").val(data.list[i].dengJingSanTong_c6);
			$("input[name='dengJingSanTong_c7']").val(data.list[i].dengJingSanTong_c7);
			$("input[name='dengJingSanTong_c8']").val(data.list[i].dengJingSanTong_c8);
			$("input[name='dengJingSanTong_c9']").val(data.list[i].dengJingSanTong_c9);
			$("input[name='dengJingSanTong_c10']").val(data.list[i].dengJingSanTong_c10);
			$("input[name='dengJingSanTong_c11']").val(data.list[i].dengJingSanTong_c11);
			$("input[name='dengJingSanTong_c12']").val(data.list[i].dengJingSanTong_c12);
			$("input[name='dengJingSanTong_c13']").val(data.list[i].dengJingSanTong_c13);
			$("input[name='dengJingSanTong_c14']").val(data.list[i].dengJingSanTong_c14);
			$("input[name='dengJingSanTong_c15']").val(data.list[i].dengJingSanTong_c15);
			$("input[name='dengJingSanTong_c16']").val(data.list[i].dengJingSanTong_c16);
			$("input[name='dengJingSanTong_c17']").val(data.list[i].dengJingSanTong_c17);
			$("input[name='dengJingSanTong_c18']").val(data.list[i].dengJingSanTong_c18);
			$("input[name='dengJingSanTong_c19']").val(data.list[i].dengJingSanTong_c19);
			$("input[name='dengJingSanTong_c20']").val(data.list[i].dengJingSanTong_c20);
			$("input[name='dengJingSanTong_c21']").val(data.list[i].dengJingSanTong_c21);

			$("input[name='dengJingSanTong_d1']").val(data.list[i].dengJingSanTong_d1);


			$("input[name='dengJingSanTong_l1']").val(data.list[i].change[0].dengJingSanTong_l1);
			$("input[name='dengJingSanTong_l2']").val(data.list[i].change[0].dengJingSanTong_l2);
			$("input[name='dengJingSanTong_l3']").val(data.list[i].change[0].dengJingSanTong_l3);
			$("input[name='dengJingSanTong_l4']").val(data.list[i].change[0].dengJingSanTong_l4);
			$("input[name='dengJingSanTong_l5']").val(data.list[i].change[0].dengJingSanTong_l5);
			$("input[name='dengJingSanTong_l6']").val(data.list[i].change[0].dengJingSanTong_l6);
			$("input[name='dengJingSanTong_l7']").val(data.list[i].change[0].dengJingSanTong_l7);
			$("input[name='dengJingSanTong_l8']").val(data.list[i].change[0].dengJingSanTong_l8);
			$("input[name='dengJingSanTong_l9']").val(data.list[i].change[0].dengJingSanTong_l9);
			$("input[name='dengJingSanTong_l10']").val(data.list[i].change[0].dengJingSanTong_l10);
			$("input[name='dengJingSanTong_l11']").val(data.list[i].change[0].dengJingSanTong_l11);
			$("input[name='dengJingSanTong_l12']").val(data.list[i].change[0].dengJingSanTong_l12);
			$("input[name='dengJingSanTong_l13']").val(data.list[i].change[0].dengJingSanTong_l13);
			$("input[name='dengJingSanTong_l14']").val(data.list[i].change[0].dengJingSanTong_l14);
			$("input[name='dengJingSanTong_l15']").val(data.list[i].change[0].dengJingSanTong_l15);
			$("input[name='dengJingSanTong_l16']").val(data.list[i].change[0].dengJingSanTong_l16);
			$("input[name='dengJingSanTong_l17']").val(data.list[i].change[0].dengJingSanTong_l17);
			$("input[name='dengJingSanTong_l18']").val(data.list[i].change[0].dengJingSanTong_l18);
			$("input[name='dengJingSanTong_l19']").val(data.list[i].change[0].dengJingSanTong_l19);
			$("input[name='dengJingSanTong_l20']").val(data.list[i].change[0].dengJingSanTong_l20);
			$("input[name='dengJingSanTong_l21']").val(data.list[i].change[0].dengJingSanTong_l21);
			$("input[name='dengJingSanTong_l22']").val(data.list[i].change[0].dengJingSanTong_l22);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l1" value="'+data.list[i].change[j].dengJingSanTong_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l2" value="'+data.list[i].change[j].dengJingSanTong_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l3" value="'+data.list[i].change[j].dengJingSanTong_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l4" value="'+data.list[i].change[j].dengJingSanTong_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l5" value="'+data.list[i].change[j].dengJingSanTong_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l6" value="'+data.list[i].change[j].dengJingSanTong_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l7" value="'+data.list[i].change[j].dengJingSanTong_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l8" value="'+data.list[i].change[j].dengJingSanTong_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l9" value="'+data.list[i].change[j].dengJingSanTong_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l10" value="'+data.list[i].change[j].dengJingSanTong_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l11" value="'+data.list[i].change[j].dengJingSanTong_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l12" value="'+data.list[i].change[j].dengJingSanTong_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l13" value="'+data.list[i].change[j].dengJingSanTong_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l14" value="'+data.list[i].change[j].dengJingSanTong_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l15" value="'+data.list[i].change[j].dengJingSanTong_l15+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l16" value="'+data.list[i].change[j].dengJingSanTong_l16+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l17" value="'+data.list[i].change[j].dengJingSanTong_l17+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l18" value="'+data.list[i].change[j].dengJingSanTong_l18+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l19" value="'+data.list[i].change[j].dengJingSanTong_l19+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l20" value="'+data.list[i].change[j].dengJingSanTong_l20+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l21" value="'+data.list[i].change[j].dengJingSanTong_l21+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingSanTong_l22" value="'+data.list[i].change[j].dengJingSanTong_l22+'"/></td>';

				   
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#dengJingSanTong").before($str);
				}
			}
		

		if(data.list[i].name == "yiJingSanTong"){//其他
			$("input[name='yiJingSanTong_a1']").val(data.list[i].yiJingSanTong_a1);
			$("input[name='yiJingSanTong_a2']").val(data.list[i].yiJingSanTong_a2);
			$("input[name='yiJingSanTong_a3']").val(data.list[i].yiJingSanTong_a3);
			$("input[name='yiJingSanTong_a4']").val(data.list[i].yiJingSanTong_a4);

			$("input[name='yiJingSanTong_b1']").val(data.list[i].yiJingSanTong_b1);

			$("input[name='yiJingSanTong_c1']").val(data.list[i].yiJingSanTong_c1);
			$("input[name='yiJingSanTong_c2']").val(data.list[i].yiJingSanTong_c2);
			$("input[name='yiJingSanTong_c3']").val(data.list[i].yiJingSanTong_c3);
			$("input[name='yiJingSanTong_c4']").val(data.list[i].yiJingSanTong_c4);
			$("input[name='yiJingSanTong_c5']").val(data.list[i].yiJingSanTong_c5);
			$("input[name='yiJingSanTong_c6']").val(data.list[i].yiJingSanTong_c6);
			$("input[name='yiJingSanTong_c7']").val(data.list[i].yiJingSanTong_c7);
			$("input[name='yiJingSanTong_c8']").val(data.list[i].yiJingSanTong_c8);
			$("input[name='yiJingSanTong_c9']").val(data.list[i].yiJingSanTong_c9);
			$("input[name='yiJingSanTong_c10']").val(data.list[i].yiJingSanTong_c10);
			$("input[name='yiJingSanTong_c11']").val(data.list[i].yiJingSanTong_c11);
			$("input[name='yiJingSanTong_c12']").val(data.list[i].yiJingSanTong_c12);
			$("input[name='yiJingSanTong_c13']").val(data.list[i].yiJingSanTong_c13);
			$("input[name='yiJingSanTong_c14']").val(data.list[i].yiJingSanTong_c14);
			$("input[name='yiJingSanTong_c15']").val(data.list[i].yiJingSanTong_c15);
			$("input[name='yiJingSanTong_c16']").val(data.list[i].yiJingSanTong_c16);
			$("input[name='yiJingSanTong_c17']").val(data.list[i].yiJingSanTong_c17);
			$("input[name='yiJingSanTong_c18']").val(data.list[i].yiJingSanTong_c18);
			$("input[name='yiJingSanTong_c19']").val(data.list[i].yiJingSanTong_c19);
			$("input[name='yiJingSanTong_c20']").val(data.list[i].yiJingSanTong_c20);
			$("input[name='yiJingSanTong_c21']").val(data.list[i].yiJingSanTong_c21);

			$("input[name='yiJingSanTong_d1']").val(data.list[i].yiJingSanTong_d1);


			$("input[name='yiJingSanTong_l1']").val(data.list[i].change[0].yiJingSanTong_l1);
			$("input[name='yiJingSanTong_l2']").val(data.list[i].change[0].yiJingSanTong_l2);
			$("input[name='yiJingSanTong_l3']").val(data.list[i].change[0].yiJingSanTong_l3);
			$("input[name='yiJingSanTong_l4']").val(data.list[i].change[0].yiJingSanTong_l4);
			$("input[name='yiJingSanTong_l5']").val(data.list[i].change[0].yiJingSanTong_l5);
			$("input[name='yiJingSanTong_l6']").val(data.list[i].change[0].yiJingSanTong_l6);
			$("input[name='yiJingSanTong_l7']").val(data.list[i].change[0].yiJingSanTong_l7);
			$("input[name='yiJingSanTong_l8']").val(data.list[i].change[0].yiJingSanTong_l8);
			$("input[name='yiJingSanTong_l9']").val(data.list[i].change[0].yiJingSanTong_l9);
			$("input[name='yiJingSanTong_l10']").val(data.list[i].change[0].yiJingSanTong_l10);
			$("input[name='yiJingSanTong_l11']").val(data.list[i].change[0].yiJingSanTong_l11);
			$("input[name='yiJingSanTong_l12']").val(data.list[i].change[0].yiJingSanTong_l12);
			$("input[name='yiJingSanTong_l13']").val(data.list[i].change[0].yiJingSanTong_l13);
			$("input[name='yiJingSanTong_l14']").val(data.list[i].change[0].yiJingSanTong_l14);
			$("input[name='yiJingSanTong_l15']").val(data.list[i].change[0].yiJingSanTong_l15);
			$("input[name='yiJingSanTong_l16']").val(data.list[i].change[0].yiJingSanTong_l16);
			$("input[name='yiJingSanTong_l17']").val(data.list[i].change[0].yiJingSanTong_l17);
			$("input[name='yiJingSanTong_l18']").val(data.list[i].change[0].yiJingSanTong_l18);
			$("input[name='yiJingSanTong_l19']").val(data.list[i].change[0].yiJingSanTong_l19);
			$("input[name='yiJingSanTong_l20']").val(data.list[i].change[0].yiJingSanTong_l20);
			$("input[name='yiJingSanTong_l21']").val(data.list[i].change[0].yiJingSanTong_l21);
			$("input[name='yiJingSanTong_l22']").val(data.list[i].change[0].yiJingSanTong_l22);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l1" value="'+data.list[i].change[j].yiJingSanTong_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l2" value="'+data.list[i].change[j].yiJingSanTong_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l3" value="'+data.list[i].change[j].yiJingSanTong_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l4" value="'+data.list[i].change[j].yiJingSanTong_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l5" value="'+data.list[i].change[j].yiJingSanTong_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l6" value="'+data.list[i].change[j].yiJingSanTong_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l7" value="'+data.list[i].change[j].yiJingSanTong_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l8" value="'+data.list[i].change[j].yiJingSanTong_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l9" value="'+data.list[i].change[j].yiJingSanTong_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l10" value="'+data.list[i].change[j].yiJingSanTong_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l11" value="'+data.list[i].change[j].yiJingSanTong_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l12" value="'+data.list[i].change[j].yiJingSanTong_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l13" value="'+data.list[i].change[j].yiJingSanTong_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l14" value="'+data.list[i].change[j].yiJingSanTong_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l15" value="'+data.list[i].change[j].yiJingSanTong_l15+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l16" value="'+data.list[i].change[j].yiJingSanTong_l16+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l17" value="'+data.list[i].change[j].yiJingSanTong_l17+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l18" value="'+data.list[i].change[j].yiJingSanTong_l18+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l19" value="'+data.list[i].change[j].yiJingSanTong_l19+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l20" value="'+data.list[i].change[j].yiJingSanTong_l20+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l21" value="'+data.list[i].change[j].yiJingSanTong_l21+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yiJingSanTong_l22" value="'+data.list[i].change[j].yiJingSanTong_l22+'"/></td>';

				   
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#yiJingSanTong").before($str);
				}
			}
		

		if(data.list[i].name == "tongXinYiJing"){//其他
			$("input[name='tongXinYiJing_a1']").val(data.list[i].tongXinYiJing_a1);
			$("input[name='tongXinYiJing_a2']").val(data.list[i].tongXinYiJing_a2);
			$("input[name='tongXinYiJing_a3']").val(data.list[i].tongXinYiJing_a3);
			$("input[name='tongXinYiJing_a4']").val(data.list[i].tongXinYiJing_a4);

			$("input[name='tongXinYiJing_b1']").val(data.list[i].tongXinYiJing_b1);

			$("input[name='tongXinYiJing_c1']").val(data.list[i].tongXinYiJing_c1);
			$("input[name='tongXinYiJing_c2']").val(data.list[i].tongXinYiJing_c2);
			$("input[name='tongXinYiJing_c3']").val(data.list[i].tongXinYiJing_c3);
			$("input[name='tongXinYiJing_c4']").val(data.list[i].tongXinYiJing_c4);
			$("input[name='tongXinYiJing_c5']").val(data.list[i].tongXinYiJing_c5);
			$("input[name='tongXinYiJing_c6']").val(data.list[i].tongXinYiJing_c6);
			$("input[name='tongXinYiJing_c7']").val(data.list[i].tongXinYiJing_c7);
			$("input[name='tongXinYiJing_c8']").val(data.list[i].tongXinYiJing_c8);
			$("input[name='tongXinYiJing_c9']").val(data.list[i].tongXinYiJing_c9);
			$("input[name='tongXinYiJing_c10']").val(data.list[i].tongXinYiJing_c10);
			$("input[name='tongXinYiJing_c11']").val(data.list[i].tongXinYiJing_c11);
			$("input[name='tongXinYiJing_c12']").val(data.list[i].tongXinYiJing_c12);
			$("input[name='tongXinYiJing_c13']").val(data.list[i].tongXinYiJing_c13);
			$("input[name='tongXinYiJing_c14']").val(data.list[i].tongXinYiJing_c14);
			$("input[name='tongXinYiJing_c15']").val(data.list[i].tongXinYiJing_c15);

			$("input[name='tongXinYiJing_d1']").val(data.list[i].tongXinYiJing_d1);


			$("input[name='tongXinYiJing_l1']").val(data.list[i].change[0].tongXinYiJing_l1);
			$("input[name='tongXinYiJing_l2']").val(data.list[i].change[0].tongXinYiJing_l2);
			$("input[name='tongXinYiJing_l3']").val(data.list[i].change[0].tongXinYiJing_l3);
			$("input[name='tongXinYiJing_l4']").val(data.list[i].change[0].tongXinYiJing_l4);
			$("input[name='tongXinYiJing_l5']").val(data.list[i].change[0].tongXinYiJing_l5);
			$("input[name='tongXinYiJing_l6']").val(data.list[i].change[0].tongXinYiJing_l6);
			$("input[name='tongXinYiJing_l7']").val(data.list[i].change[0].tongXinYiJing_l7);
			$("input[name='tongXinYiJing_l8']").val(data.list[i].change[0].tongXinYiJing_l8);
			$("input[name='tongXinYiJing_l9']").val(data.list[i].change[0].tongXinYiJing_l9);
			$("input[name='tongXinYiJing_l10']").val(data.list[i].change[0].tongXinYiJing_l10);
			$("input[name='tongXinYiJing_l11']").val(data.list[i].change[0].tongXinYiJing_l11);
			$("input[name='tongXinYiJing_l12']").val(data.list[i].change[0].tongXinYiJing_l12);
			$("input[name='tongXinYiJing_l13']").val(data.list[i].change[0].tongXinYiJing_l13);
			$("input[name='tongXinYiJing_l14']").val(data.list[i].change[0].tongXinYiJing_l14);
			$("input[name='tongXinYiJing_l15']").val(data.list[i].change[0].tongXinYiJing_l15);
			$("input[name='tongXinYiJing_l16']").val(data.list[i].change[0].tongXinYiJing_l16);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l1" value="'+data.list[i].change[j].tongXinYiJing_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l2" value="'+data.list[i].change[j].tongXinYiJing_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l3" value="'+data.list[i].change[j].tongXinYiJing_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l4" value="'+data.list[i].change[j].tongXinYiJing_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l5" value="'+data.list[i].change[j].tongXinYiJing_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l6" value="'+data.list[i].change[j].tongXinYiJing_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l7" value="'+data.list[i].change[j].tongXinYiJing_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l8" value="'+data.list[i].change[j].tongXinYiJing_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l9" value="'+data.list[i].change[j].tongXinYiJing_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l10" value="'+data.list[i].change[j].tongXinYiJing_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l11" value="'+data.list[i].change[j].tongXinYiJing_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l12" value="'+data.list[i].change[j].tongXinYiJing_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l13" value="'+data.list[i].change[j].tongXinYiJing_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l14" value="'+data.list[i].change[j].tongXinYiJing_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l15" value="'+data.list[i].change[j].tongXinYiJing_l15+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="tongXinYiJing_l16" value="'+data.list[i].change[j].tongXinYiJing_l16+'"/></td>';
				   
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#tongXinYiJing").before($str);
				}
			}
		

		if(data.list[i].name == "pianXinYiJing"){//其他
			$("input[name='pianXinYiJing_a1']").val(data.list[i].pianXinYiJing_a1);
			$("input[name='pianXinYiJing_a2']").val(data.list[i].pianXinYiJing_a2);
			$("input[name='pianXinYiJing_a3']").val(data.list[i].pianXinYiJing_a3);
			$("input[name='pianXinYiJing_a4']").val(data.list[i].pianXinYiJing_a4);


			$("input[name='pianXinYiJing_b1']").val(data.list[i].pianXinYiJing_b1);
			$("input[name='pianXinYiJing_b2']").val(data.list[i].pianXinYiJing_b2);
			$("input[name='pianXinYiJing_b3']").val(data.list[i].pianXinYiJing_b3);
			$("input[name='pianXinYiJing_b4']").val(data.list[i].pianXinYiJing_b4);
			$("input[name='pianXinYiJing_b5']").val(data.list[i].pianXinYiJing_b5);
			$("input[name='pianXinYiJing_b6']").val(data.list[i].pianXinYiJing_b6);
			$("input[name='pianXinYiJing_b7']").val(data.list[i].pianXinYiJing_b7);
			$("input[name='pianXinYiJing_b8']").val(data.list[i].pianXinYiJing_b8);
			$("input[name='pianXinYiJing_b9']").val(data.list[i].pianXinYiJing_b9);
			$("input[name='pianXinYiJing_b10']").val(data.list[i].pianXinYiJing_b10);
			$("input[name='pianXinYiJing_b11']").val(data.list[i].pianXinYiJing_b11);
			$("input[name='pianXinYiJing_b12']").val(data.list[i].pianXinYiJing_b12);

			$("input[name='pianXinYiJing_c1']").val(data.list[i].pianXinYiJing_c1);


			$("input[name='pianXinYiJing_l1']").val(data.list[i].change[0].pianXinYiJing_l1);
			$("input[name='pianXinYiJing_l2']").val(data.list[i].change[0].pianXinYiJing_l2);
			$("input[name='pianXinYiJing_l3']").val(data.list[i].change[0].pianXinYiJing_l3);
			$("input[name='pianXinYiJing_l4']").val(data.list[i].change[0].pianXinYiJing_l4);
			$("input[name='pianXinYiJing_l5']").val(data.list[i].change[0].pianXinYiJing_l5);
			$("input[name='pianXinYiJing_l6']").val(data.list[i].change[0].pianXinYiJing_l6);
			$("input[name='pianXinYiJing_l7']").val(data.list[i].change[0].pianXinYiJing_l7);
			$("input[name='pianXinYiJing_l8']").val(data.list[i].change[0].pianXinYiJing_l8);
			$("input[name='pianXinYiJing_l9']").val(data.list[i].change[0].pianXinYiJing_l9);
			$("input[name='pianXinYiJing_l10']").val(data.list[i].change[0].pianXinYiJing_l10);
			$("input[name='pianXinYiJing_l11']").val(data.list[i].change[0].pianXinYiJing_l11);
			$("input[name='pianXinYiJing_l12']").val(data.list[i].change[0].pianXinYiJing_l12);
			$("input[name='pianXinYiJing_l13']").val(data.list[i].change[0].pianXinYiJing_l13);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l1" value="'+data.list[i].change[j].pianXinYiJing_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l2" value="'+data.list[i].change[j].pianXinYiJing_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l3" value="'+data.list[i].change[j].pianXinYiJing_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l4" value="'+data.list[i].change[j].pianXinYiJing_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l5" value="'+data.list[i].change[j].pianXinYiJing_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l6" value="'+data.list[i].change[j].pianXinYiJing_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l7" value="'+data.list[i].change[j].pianXinYiJing_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l8" value="'+data.list[i].change[j].pianXinYiJing_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l9" value="'+data.list[i].change[j].pianXinYiJing_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l10" value="'+data.list[i].change[j].pianXinYiJing_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l11" value="'+data.list[i].change[j].pianXinYiJing_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l12" value="'+data.list[i].change[j].pianXinYiJing_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="pianXinYiJing_l13" value="'+data.list[i].change[j].pianXinYiJing_l13+'"/></td>';

				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#pianXinYiJing").before($str);
				}
			}
		

		if(data.list[i].name == "zhiGuanZuo"){//其他
			$("input[name='zhiGuanZuo_a1']").val(data.list[i].zhiGuanZuo_a1);
			$("input[name='zhiGuanZuo_a2']").val(data.list[i].zhiGuanZuo_a2);
			$("input[name='zhiGuanZuo_a3']").val(data.list[i].zhiGuanZuo_a3);
			$("input[name='zhiGuanZuo_a4']").val(data.list[i].zhiGuanZuo_a4);


			$("input[name='zhiGuanZuo_b1']").val(data.list[i].zhiGuanZuo_b1);
			$("input[name='zhiGuanZuo_b2']").val(data.list[i].zhiGuanZuo_b2);
			$("input[name='zhiGuanZuo_b3']").val(data.list[i].zhiGuanZuo_b3);
			$("input[name='zhiGuanZuo_b4']").val(data.list[i].zhiGuanZuo_b4);
			$("input[name='zhiGuanZuo_b5']").val(data.list[i].zhiGuanZuo_b5);

			$("input[name='zhiGuanZuo_c1']").val(data.list[i].zhiGuanZuo_c1);


			$("input[name='zhiGuanZuo_l1']").val(data.list[i].change[0].zhiGuanZuo_l1);
			$("input[name='zhiGuanZuo_l2']").val(data.list[i].change[0].zhiGuanZuo_l2);
			$("input[name='zhiGuanZuo_l3']").val(data.list[i].change[0].zhiGuanZuo_l3);
			$("input[name='zhiGuanZuo_l4']").val(data.list[i].change[0].zhiGuanZuo_l4);
			$("input[name='zhiGuanZuo_l5']").val(data.list[i].change[0].zhiGuanZuo_l5);
			$("input[name='zhiGuanZuo_l6']").val(data.list[i].change[0].zhiGuanZuo_l6);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zhiGuanZuo_l1" value="'+data.list[i].change[j].zhiGuanZuo_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zhiGuanZuo_l2" value="'+data.list[i].change[j].zhiGuanZuo_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zhiGuanZuo_l3" value="'+data.list[i].change[j].zhiGuanZuo_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zhiGuanZuo_l4" value="'+data.list[i].change[j].zhiGuanZuo_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zhiGuanZuo_l5" value="'+data.list[i].change[j].zhiGuanZuo_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zhiGuanZuo_l6" value="'+data.list[i].change[j].zhiGuanZuo_l6+'"/></td>';

				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#zhiGuanZuo").before($str);
				}
			}
		

		if(data.list[i].name == "jiuShiLuoWen"){//其他
			$("input[name='jiuShiLuoWen_a1']").val(data.list[i].jiuShiLuoWen_a1);
			$("input[name='jiuShiLuoWen_a2']").val(data.list[i].jiuShiLuoWen_a2);
			$("input[name='jiuShiLuoWen_a3']").val(data.list[i].jiuShiLuoWen_a3);
			$("input[name='jiuShiLuoWen_a4']").val(data.list[i].jiuShiLuoWen_a4);


			$("input[name='jiuShiLuoWen_b1']").val(data.list[i].jiuShiLuoWen_b1);
			$("input[name='jiuShiLuoWen_b2']").val(data.list[i].jiuShiLuoWen_b2);
			$("input[name='jiuShiLuoWen_b3']").val(data.list[i].jiuShiLuoWen_b3);
			$("input[name='jiuShiLuoWen_b4']").val(data.list[i].jiuShiLuoWen_b4);
			$("input[name='jiuShiLuoWen_b5']").val(data.list[i].jiuShiLuoWen_b5);
			$("input[name='jiuShiLuoWen_b6']").val(data.list[i].jiuShiLuoWen_b6);
			$("input[name='jiuShiLuoWen_b7']").val(data.list[i].jiuShiLuoWen_b7);
			$("input[name='jiuShiLuoWen_b8']").val(data.list[i].jiuShiLuoWen_b8);

			$("input[name='jiuShiLuoWen_c1']").val(data.list[i].jiuShiLuoWen_c1);


			$("input[name='jiuShiLuoWen_l1']").val(data.list[i].change[0].jiuShiLuoWen_l1);
			$("input[name='jiuShiLuoWen_l2']").val(data.list[i].change[0].jiuShiLuoWen_l2);
			$("input[name='jiuShiLuoWen_l3']").val(data.list[i].change[0].jiuShiLuoWen_l3);
			$("input[name='jiuShiLuoWen_l4']").val(data.list[i].change[0].jiuShiLuoWen_l4);
			$("input[name='jiuShiLuoWen_l5']").val(data.list[i].change[0].jiuShiLuoWen_l5);
			$("input[name='jiuShiLuoWen_l6']").val(data.list[i].change[0].jiuShiLuoWen_l6);
			$("input[name='jiuShiLuoWen_l7']").val(data.list[i].change[0].jiuShiLuoWen_l7);
			$("input[name='jiuShiLuoWen_l8']").val(data.list[i].change[0].jiuShiLuoWen_l8);
			$("input[name='jiuShiLuoWen_l9']").val(data.list[i].change[0].jiuShiLuoWen_l9);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiLuoWen_l1" value="'+data.list[i].change[j].jiuShiLuoWen_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiLuoWen_l2" value="'+data.list[i].change[j].jiuShiLuoWen_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiLuoWen_l3" value="'+data.list[i].change[j].jiuShiLuoWen_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiLuoWen_l4" value="'+data.list[i].change[j].jiuShiLuoWen_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiLuoWen_l5" value="'+data.list[i].change[j].jiuShiLuoWen_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiLuoWen_l6" value="'+data.list[i].change[j].jiuShiLuoWen_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiLuoWen_l7" value="'+data.list[i].change[j].jiuShiLuoWen_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiLuoWen_l8" value="'+data.list[i].change[j].jiuShiLuoWen_l8+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jiuShiLuoWen_l9" value="'+data.list[i].change[j].jiuShiLuoWen_l9+'"/></td>';

				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#jiuShiLuoWen").before($str);
				}
			}
		

		if(data.list[i].name == "shuangSiTou"){//其他
			$("input[name='shuangSiTou_a1']").val(data.list[i].shuangSiTou_a1);
			$("input[name='shuangSiTou_a2']").val(data.list[i].shuangSiTou_a2);
			$("input[name='shuangSiTou_a3']").val(data.list[i].shuangSiTou_a3);
			$("input[name='shuangSiTou_a4']").val(data.list[i].shuangSiTou_a4);


			$("input[name='shuangSiTou_b1']").val(data.list[i].shuangSiTou_b1);
			$("input[name='shuangSiTou_b2']").val(data.list[i].shuangSiTou_b2);
			$("input[name='shuangSiTou_b3']").val(data.list[i].shuangSiTou_b3);
			$("input[name='shuangSiTou_b4']").val(data.list[i].shuangSiTou_b4);
			$("input[name='shuangSiTou_b5']").val(data.list[i].shuangSiTou_b5);
			$("input[name='shuangSiTou_b6']").val(data.list[i].shuangSiTou_b6);
			$("input[name='shuangSiTou_b7']").val(data.list[i].shuangSiTou_b7);

			$("input[name='shuangSiTou_c1']").val(data.list[i].shuangSiTou_c1);


			$("input[name='shuangSiTou_l1']").val(data.list[i].change[0].shuangSiTou_l1);
			$("input[name='shuangSiTou_l2']").val(data.list[i].change[0].shuangSiTou_l2);
			$("input[name='shuangSiTou_l3']").val(data.list[i].change[0].shuangSiTou_l3);
			$("input[name='shuangSiTou_l4']").val(data.list[i].change[0].shuangSiTou_l4);
			$("input[name='shuangSiTou_l5']").val(data.list[i].change[0].shuangSiTou_l5);
			$("input[name='shuangSiTou_l6']").val(data.list[i].change[0].shuangSiTou_l6);
			$("input[name='shuangSiTou_l7']").val(data.list[i].change[0].shuangSiTou_l7);
			$("input[name='shuangSiTou_l8']").val(data.list[i].change[0].shuangSiTou_l8);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shuangSiTou_l1" value="'+data.list[i].change[j].shuangSiTou_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shuangSiTou_l2" value="'+data.list[i].change[j].shuangSiTou_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shuangSiTou_l3" value="'+data.list[i].change[j].shuangSiTou_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shuangSiTou_l4" value="'+data.list[i].change[j].shuangSiTou_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shuangSiTou_l5" value="'+data.list[i].change[j].shuangSiTou_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shuangSiTou_l6" value="'+data.list[i].change[j].shuangSiTou_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shuangSiTou_l7" value="'+data.list[i].change[j].shuangSiTou_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="shuangSiTou_l8" value="'+data.list[i].change[j].shuangSiTou_l8+'"/></td>';

				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#shuangSiTou").before($str);
				}
			}
		

		if(data.list[i].name == "danSiTou"){//其他
			$("input[name='danSiTou_a1']").val(data.list[i].danSiTou_a1);
			$("input[name='danSiTou_a2']").val(data.list[i].danSiTou_a2);
			$("input[name='danSiTou_a3']").val(data.list[i].danSiTou_a3);
			$("input[name='danSiTou_a4']").val(data.list[i].danSiTou_a4);


			$("input[name='danSiTou_b1']").val(data.list[i].danSiTou_b1);
			$("input[name='danSiTou_b2']").val(data.list[i].danSiTou_b2);
			$("input[name='danSiTou_b3']").val(data.list[i].danSiTou_b3);
			$("input[name='danSiTou_b4']").val(data.list[i].danSiTou_b4);
			$("input[name='danSiTou_b5']").val(data.list[i].danSiTou_b5);
			$("input[name='danSiTou_b6']").val(data.list[i].danSiTou_b6);

			$("input[name='danSiTou_c1']").val(data.list[i].danSiTou_c1);


			$("input[name='danSiTou_l1']").val(data.list[i].change[0].danSiTou_l1);
			$("input[name='danSiTou_l2']").val(data.list[i].change[0].danSiTou_l2);
			$("input[name='danSiTou_l3']").val(data.list[i].change[0].danSiTou_l3);
			$("input[name='danSiTou_l4']").val(data.list[i].change[0].danSiTou_l4);
			$("input[name='danSiTou_l5']").val(data.list[i].change[0].danSiTou_l5);
			$("input[name='danSiTou_l6']").val(data.list[i].change[0].danSiTou_l6);
			$("input[name='danSiTou_l7']").val(data.list[i].change[0].danSiTou_l7);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="danSiTou_l1" value="'+data.list[i].change[j].danSiTou_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="danSiTou_l2" value="'+data.list[i].change[j].danSiTou_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="danSiTou_l3" value="'+data.list[i].change[j].danSiTou_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="danSiTou_l4" value="'+data.list[i].change[j].danSiTou_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="danSiTou_l5" value="'+data.list[i].change[j].danSiTou_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="danSiTou_l6" value="'+data.list[i].change[j].danSiTou_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="danSiTou_l7" value="'+data.list[i].change[j].danSiTou_l7+'"/></td>';

				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#danSiTou").before($str);
				}
			}
		

		if(data.list[i].name == "luoWenHuo"){//其他
			$("input[name='luoWenHuo_a1']").val(data.list[i].luoWenHuo_a1);
			$("input[name='luoWenHuo_a2']").val(data.list[i].luoWenHuo_a2);
			$("input[name='luoWenHuo_a3']").val(data.list[i].luoWenHuo_a3);
			$("input[name='luoWenHuo_a4']").val(data.list[i].luoWenHuo_a4);


			$("input[name='luoWenHuo_b1']").val(data.list[i].luoWenHuo_b1);
			$("input[name='luoWenHuo_b2']").val(data.list[i].luoWenHuo_b2);
			$("input[name='luoWenHuo_b3']").val(data.list[i].luoWenHuo_b3);
			$("input[name='luoWenHuo_b4']").val(data.list[i].luoWenHuo_b4);
			$("input[name='luoWenHuo_b5']").val(data.list[i].luoWenHuo_b5);
			$("input[name='luoWenHuo_b6']").val(data.list[i].luoWenHuo_b6);
			$("input[name='luoWenHuo_b7']").val(data.list[i].luoWenHuo_b7);
			$("input[name='luoWenHuo_b8']").val(data.list[i].luoWenHuo_b8);
			$("input[name='luoWenHuo_b9']").val(data.list[i].luoWenHuo_b9);
			$("input[name='luoWenHuo_b10']").val(data.list[i].luoWenHuo_b10);
			$("input[name='luoWenHuo_b11']").val(data.list[i].luoWenHuo_b11);

			$("input[name='luoWenHuo_c1']").val(data.list[i].luoWenHuo_c1);


			$("input[name='luoWenHuo_l1']").val(data.list[i].change[0].luoWenHuo_l1);
			$("input[name='luoWenHuo_l2']").val(data.list[i].change[0].luoWenHuo_l2);
			$("input[name='luoWenHuo_l3']").val(data.list[i].change[0].luoWenHuo_l3);
			$("input[name='luoWenHuo_l4']").val(data.list[i].change[0].luoWenHuo_l4);
			$("input[name='luoWenHuo_l5']").val(data.list[i].change[0].luoWenHuo_l5);
			$("input[name='luoWenHuo_l6']").val(data.list[i].change[0].luoWenHuo_l6);
			$("input[name='luoWenHuo_l7']").val(data.list[i].change[0].luoWenHuo_l7);
			$("input[name='luoWenHuo_l8']").val(data.list[i].change[0].luoWenHuo_l8);
			$("input[name='luoWenHuo_l9']").val(data.list[i].change[0].luoWenHuo_l9);
			$("input[name='luoWenHuo_l10']").val(data.list[i].change[0].luoWenHuo_l10);
			$("input[name='luoWenHuo_l11']").val(data.list[i].change[0].luoWenHuo_l11);
			$("input[name='luoWenHuo_l12']").val(data.list[i].change[0].luoWenHuo_l12);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l1" value="'+data.list[i].change[j].luoWenHuo_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l2" value="'+data.list[i].change[j].luoWenHuo_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l3" value="'+data.list[i].change[j].luoWenHuo_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l4" value="'+data.list[i].change[j].luoWenHuo_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l5" value="'+data.list[i].change[j].luoWenHuo_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l6" value="'+data.list[i].change[j].luoWenHuo_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l7" value="'+data.list[i].change[j].luoWenHuo_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l8" value="'+data.list[i].change[j].luoWenHuo_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l9" value="'+data.list[i].change[j].luoWenHuo_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l10" value="'+data.list[i].change[j].luoWenHuo_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l11" value="'+data.list[i].change[j].luoWenHuo_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenHuo_l12" value="'+data.list[i].change[j].luoWenHuo_l12+'"/></td>';

				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#luoWenHuo").before($str);
				}
			}
		

		if(data.list[i].name == "guanMao"){//其他
			$("input[name='guanMao_a1']").val(data.list[i].guanMao_a1);
			$("input[name='guanMao_a2']").val(data.list[i].guanMao_a2);
			$("input[name='guanMao_a3']").val(data.list[i].guanMao_a3);
			$("input[name='guanMao_a4']").val(data.list[i].guanMao_a4);


			$("input[name='guanMao_b1']").val(data.list[i].guanMao_b1);

			$("input[name='guanMao_c1']").val(data.list[i].guanMao_c1);
			$("input[name='guanMao_c2']").val(data.list[i].guanMao_c2);
			$("input[name='guanMao_c3']").val(data.list[i].guanMao_c3);
			$("input[name='guanMao_c4']").val(data.list[i].guanMao_c4);
			$("input[name='guanMao_c5']").val(data.list[i].guanMao_c5);
			$("input[name='guanMao_c6']").val(data.list[i].guanMao_c6);
			$("input[name='guanMao_c7']").val(data.list[i].guanMao_c7);
			$("input[name='guanMao_c8']").val(data.list[i].guanMao_c8);

			$("input[name='guanMao_d1']").val(data.list[i].guanMao_d1);


			$("input[name='guanMao_l1']").val(data.list[i].change[0].guanMao_l1);
			$("input[name='guanMao_l2']").val(data.list[i].change[0].guanMao_l2);
			$("input[name='guanMao_l3']").val(data.list[i].change[0].guanMao_l3);
			$("input[name='guanMao_l4']").val(data.list[i].change[0].guanMao_l4);
			$("input[name='guanMao_l5']").val(data.list[i].change[0].guanMao_l5);
			$("input[name='guanMao_l6']").val(data.list[i].change[0].guanMao_l6);
			$("input[name='guanMao_l7']").val(data.list[i].change[0].guanMao_l7);
			$("input[name='guanMao_l8']").val(data.list[i].change[0].guanMao_l8);
			$("input[name='guanMao_l9']").val(data.list[i].change[0].guanMao_l9);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="guanMao_l1" value="'+data.list[i].change[j].guanMao_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="guanMao_l2" value="'+data.list[i].change[j].guanMao_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="guanMao_l3" value="'+data.list[i].change[j].guanMao_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="guanMao_l4" value="'+data.list[i].change[j].guanMao_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="guanMao_l5" value="'+data.list[i].change[j].guanMao_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="guanMao_l6" value="'+data.list[i].change[j].guanMao_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="guanMao_l7" value="'+data.list[i].change[j].guanMao_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="guanMao_l8" value="'+data.list[i].change[j].guanMao_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="guanMao_l9" value="'+data.list[i].change[j].guanMao_l9+'"/></td>';

				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#guanMao").before($str);
				}
			}
		

		if(data.list[i].name == "dengJingLuoWen"){//其他
			$("input[name='dengJingLuoWen_a1']").val(data.list[i].dengJingLuoWen_a1);
			$("input[name='dengJingLuoWen_a2']").val(data.list[i].dengJingLuoWen_a2);
			$("input[name='dengJingLuoWen_a3']").val(data.list[i].dengJingLuoWen_a3);
			$("input[name='dengJingLuoWen_a4']").val(data.list[i].dengJingLuoWen_a4);


			$("input[name='dengJingLuoWen_b1']").val(data.list[i].dengJingLuoWen_b1);

			$("input[name='dengJingLuoWen_c1']").val(data.list[i].dengJingLuoWen_c1);
			$("input[name='dengJingLuoWen_c2']").val(data.list[i].dengJingLuoWen_c2);
			$("input[name='dengJingLuoWen_c3']").val(data.list[i].dengJingLuoWen_c3);
			$("input[name='dengJingLuoWen_c4']").val(data.list[i].dengJingLuoWen_c4);
			$("input[name='dengJingLuoWen_c5']").val(data.list[i].dengJingLuoWen_c5);
			$("input[name='dengJingLuoWen_c6']").val(data.list[i].dengJingLuoWen_c6);
			$("input[name='dengJingLuoWen_c7']").val(data.list[i].dengJingLuoWen_c7);
			$("input[name='dengJingLuoWen_c8']").val(data.list[i].dengJingLuoWen_c8);
			$("input[name='dengJingLuoWen_c9']").val(data.list[i].dengJingLuoWen_c9);
			$("input[name='dengJingLuoWen_c10']").val(data.list[i].dengJingLuoWen_c10);
			$("input[name='dengJingLuoWen_c11']").val(data.list[i].dengJingLuoWen_c11);
			$("input[name='dengJingLuoWen_c12']").val(data.list[i].dengJingLuoWen_c12);
			$("input[name='dengJingLuoWen_c13']").val(data.list[i].dengJingLuoWen_c13);
			$("input[name='dengJingLuoWen_c14']").val(data.list[i].dengJingLuoWen_c14);
			$("input[name='dengJingLuoWen_c15']").val(data.list[i].dengJingLuoWen_c15);

			$("input[name='dengJingLuoWen_d1']").val(data.list[i].dengJingLuoWen_d1);


			$("input[name='dengJingLuoWen_l1']").val(data.list[i].change[0].dengJingLuoWen_l1);
			$("input[name='dengJingLuoWen_l2']").val(data.list[i].change[0].dengJingLuoWen_l2);
			$("input[name='dengJingLuoWen_l3']").val(data.list[i].change[0].dengJingLuoWen_l3);
			$("input[name='dengJingLuoWen_l4']").val(data.list[i].change[0].dengJingLuoWen_l4);
			$("input[name='dengJingLuoWen_l5']").val(data.list[i].change[0].dengJingLuoWen_l5);
			$("input[name='dengJingLuoWen_l6']").val(data.list[i].change[0].dengJingLuoWen_l6);
			$("input[name='dengJingLuoWen_l7']").val(data.list[i].change[0].dengJingLuoWen_l7);
			$("input[name='dengJingLuoWen_l8']").val(data.list[i].change[0].dengJingLuoWen_l8);
			$("input[name='dengJingLuoWen_l9']").val(data.list[i].change[0].dengJingLuoWen_l9);
			$("input[name='dengJingLuoWen_l10']").val(data.list[i].change[0].dengJingLuoWen_l10);
			$("input[name='dengJingLuoWen_l11']").val(data.list[i].change[0].dengJingLuoWen_l11);
			$("input[name='dengJingLuoWen_l12']").val(data.list[i].change[0].dengJingLuoWen_l12);
			$("input[name='dengJingLuoWen_l13']").val(data.list[i].change[0].dengJingLuoWen_l13);
			$("input[name='dengJingLuoWen_l14']").val(data.list[i].change[0].dengJingLuoWen_l14);
			$("input[name='dengJingLuoWen_l15']").val(data.list[i].change[0].dengJingLuoWen_l15);
			$("input[name='dengJingLuoWen_l16']").val(data.list[i].change[0].dengJingLuoWen_l16);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l1" value="'+data.list[i].change[j].dengJingLuoWen_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l2" value="'+data.list[i].change[j].dengJingLuoWen_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l3" value="'+data.list[i].change[j].dengJingLuoWen_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l4" value="'+data.list[i].change[j].dengJingLuoWen_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l5" value="'+data.list[i].change[j].dengJingLuoWen_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l6" value="'+data.list[i].change[j].dengJingLuoWen_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l7" value="'+data.list[i].change[j].dengJingLuoWen_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l8" value="'+data.list[i].change[j].dengJingLuoWen_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l9" value="'+data.list[i].change[j].dengJingLuoWen_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l10" value="'+data.list[i].change[j].dengJingLuoWen_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l11" value="'+data.list[i].change[j].dengJingLuoWen_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l12" value="'+data.list[i].change[j].dengJingLuoWen_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l13" value="'+data.list[i].change[j].dengJingLuoWen_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l14" value="'+data.list[i].change[j].dengJingLuoWen_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l15" value="'+data.list[i].change[j].dengJingLuoWen_l15+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="dengJingLuoWen_l16" value="'+data.list[i].change[j].dengJingLuoWen_l16+'"/></td>';

				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#dengJingLuoWen").before($str);
				}
			}
		
		if(data.list[i].name == "xiaoLuoWen"){//其他
			$("input[name='xiaoLuoWen_a1']").val(data.list[i].xiaoLuoWen_a1);
			$("input[name='xiaoLuoWen_a2']").val(data.list[i].xiaoLuoWen_a2);
			$("input[name='xiaoLuoWen_a3']").val(data.list[i].xiaoLuoWen_a3);
			$("input[name='xiaoLuoWen_a4']").val(data.list[i].xiaoLuoWen_a4);


			$("input[name='xiaoLuoWen_b1']").val(data.list[i].xiaoLuoWen_b1);
			$("input[name='xiaoLuoWen_b2']").val(data.list[i].xiaoLuoWen_b2);
			$("input[name='xiaoLuoWen_b3']").val(data.list[i].xiaoLuoWen_b3);
			$("input[name='xiaoLuoWen_b4']").val(data.list[i].xiaoLuoWen_b4);
			$("input[name='xiaoLuoWen_b5']").val(data.list[i].xiaoLuoWen_b5);
			$("input[name='xiaoLuoWen_b6']").val(data.list[i].xiaoLuoWen_b6);
			$("input[name='xiaoLuoWen_b7']").val(data.list[i].xiaoLuoWen_b7);

			$("input[name='xiaoLuoWen_c1']").val(data.list[i].xiaoLuoWen_c1);


			$("input[name='xiaoLuoWen_l1']").val(data.list[i].change[0].xiaoLuoWen_l1);
			$("input[name='xiaoLuoWen_l2']").val(data.list[i].change[0].xiaoLuoWen_l2);
			$("input[name='xiaoLuoWen_l3']").val(data.list[i].change[0].xiaoLuoWen_l3);
			$("input[name='xiaoLuoWen_l4']").val(data.list[i].change[0].xiaoLuoWen_l4);
			$("input[name='xiaoLuoWen_l5']").val(data.list[i].change[0].xiaoLuoWen_l5);
			$("input[name='xiaoLuoWen_l6']").val(data.list[i].change[0].xiaoLuoWen_l6);
			$("input[name='xiaoLuoWen_l7']").val(data.list[i].change[0].xiaoLuoWen_l7);
			$("input[name='xiaoLuoWen_l8']").val(data.list[i].change[0].xiaoLuoWen_l8);
			$("input[name='xiaoLuoWen_l9']").val(data.list[i].change[0].xiaoLuoWen_l9);
			$("input[name='xiaoLuoWen_l10']").val(data.list[i].change[0].xiaoLuoWen_l10);
			$("input[name='xiaoLuoWen_l11']").val(data.list[i].change[0].xiaoLuoWen_l11);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="xiaoLuoWen_l1" value="'+data.list[i].change[j].xiaoLuoWen_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="xiaoLuoWen_l2" value="'+data.list[i].change[j].xiaoLuoWen_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="xiaoLuoWen_l3" value="'+data.list[i].change[j].xiaoLuoWen_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="xiaoLuoWen_l4" value="'+data.list[i].change[j].xiaoLuoWen_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="xiaoLuoWen_l5" value="'+data.list[i].change[j].xiaoLuoWen_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="xiaoLuoWen_l6" value="'+data.list[i].change[j].xiaoLuoWen_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="xiaoLuoWen_l7" value="'+data.list[i].change[j].xiaoLuoWen_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="xiaoLuoWen_l8" value="'+data.list[i].change[j].xiaoLuoWen_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="xiaoLuoWen_l9" value="'+data.list[i].change[j].xiaoLuoWen_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="xiaoLuoWen_l10" value="'+data.list[i].change[j].xiaoLuoWen_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="xiaoLuoWen_l11" value="'+data.list[i].change[j].xiaoLuoWen_l11+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#xiaoLuoWen").before($str);
				}
			}
		

		if(data.list[i].name == "luoWenGuanTi"){//其他
			$("input[name='luoWenGuanTi_a1']").val(data.list[i].luoWenGuanTi_a1);
			$("input[name='luoWenGuanTi_a2']").val(data.list[i].luoWenGuanTi_a2);
			$("input[name='luoWenGuanTi_a3']").val(data.list[i].luoWenGuanTi_a3);
			$("input[name='luoWenGuanTi_a4']").val(data.list[i].luoWenGuanTi_a4);


			$("input[name='luoWenGuanTi_b1']").val(data.list[i].luoWenGuanTi_b1);
			$("input[name='luoWenGuanTi_b2']").val(data.list[i].luoWenGuanTi_b2);

			$("input[name='luoWenGuanTi_c1']").val(data.list[i].luoWenGuanTi_c1);
			$("input[name='luoWenGuanTi_c2']").val(data.list[i].luoWenGuanTi_c2);
			$("input[name='luoWenGuanTi_c3']").val(data.list[i].luoWenGuanTi_c3);
			$("input[name='luoWenGuanTi_c4']").val(data.list[i].luoWenGuanTi_c4);
			$("input[name='luoWenGuanTi_c5']").val(data.list[i].luoWenGuanTi_c5);
			$("input[name='luoWenGuanTi_c6']").val(data.list[i].luoWenGuanTi_c6);
			$("input[name='luoWenGuanTi_c7']").val(data.list[i].luoWenGuanTi_c7);
			$("input[name='luoWenGuanTi_c8']").val(data.list[i].luoWenGuanTi_c8);
			$("input[name='luoWenGuanTi_c9']").val(data.list[i].luoWenGuanTi_c9);
			$("input[name='luoWenGuanTi_c10']").val(data.list[i].luoWenGuanTi_c10);
			$("input[name='luoWenGuanTi_c11']").val(data.list[i].luoWenGuanTi_c11);
			$("input[name='luoWenGuanTi_c12']").val(data.list[i].luoWenGuanTi_c12);
			$("input[name='luoWenGuanTi_c13']").val(data.list[i].luoWenGuanTi_c13);
			$("input[name='luoWenGuanTi_c14']").val(data.list[i].luoWenGuanTi_c14);
			$("input[name='luoWenGuanTi_c15']").val(data.list[i].luoWenGuanTi_c15);


			$("input[name='luoWenGuanTi_d1']").val(data.list[i].luoWenGuanTi_d1);


			$("input[name='luoWenGuanTi_l1']").val(data.list[i].change[0].luoWenGuanTi_l1);
			$("input[name='luoWenGuanTi_l2']").val(data.list[i].change[0].luoWenGuanTi_l2);
			$("input[name='luoWenGuanTi_l3']").val(data.list[i].change[0].luoWenGuanTi_l3);
			$("input[name='luoWenGuanTi_l4']").val(data.list[i].change[0].luoWenGuanTi_l4);
			$("input[name='luoWenGuanTi_l5']").val(data.list[i].change[0].luoWenGuanTi_l5);
			$("input[name='luoWenGuanTi_l6']").val(data.list[i].change[0].luoWenGuanTi_l6);
			$("input[name='luoWenGuanTi_l7']").val(data.list[i].change[0].luoWenGuanTi_l7);
			$("input[name='luoWenGuanTi_l8']").val(data.list[i].change[0].luoWenGuanTi_l8);
			$("input[name='luoWenGuanTi_l9']").val(data.list[i].change[0].luoWenGuanTi_l9);
			$("input[name='luoWenGuanTi_l10']").val(data.list[i].change[0].luoWenGuanTi_l10);
			$("input[name='luoWenGuanTi_l11']").val(data.list[i].change[0].luoWenGuanTi_l11);
			$("input[name='luoWenGuanTi_l12']").val(data.list[i].change[0].luoWenGuanTi_l12);
			$("input[name='luoWenGuanTi_l13']").val(data.list[i].change[0].luoWenGuanTi_l13);
			$("input[name='luoWenGuanTi_l14']").val(data.list[i].change[0].luoWenGuanTi_l14);
			$("input[name='luoWenGuanTi_l15']").val(data.list[i].change[0].luoWenGuanTi_l15);
			$("input[name='luoWenGuanTi_l16']").val(data.list[i].change[0].luoWenGuanTi_l16);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l1" value="'+data.list[i].change[j].luoWenGuanTi_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l2" value="'+data.list[i].change[j].luoWenGuanTi_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l3" value="'+data.list[i].change[j].luoWenGuanTi_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l4" value="'+data.list[i].change[j].luoWenGuanTi_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l5" value="'+data.list[i].change[j].luoWenGuanTi_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l6" value="'+data.list[i].change[j].luoWenGuanTi_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l7" value="'+data.list[i].change[j].luoWenGuanTi_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l8" value="'+data.list[i].change[j].luoWenGuanTi_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l9" value="'+data.list[i].change[j].luoWenGuanTi_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l10" value="'+data.list[i].change[j].luoWenGuanTi_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l11" value="'+data.list[i].change[j].luoWenGuanTi_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l12" value="'+data.list[i].change[j].luoWenGuanTi_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l13" value="'+data.list[i].change[j].luoWenGuanTi_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l14" value="'+data.list[i].change[j].luoWenGuanTi_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l15" value="'+data.list[i].change[j].luoWenGuanTi_l15+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenGuanTi_l16" value="'+data.list[i].change[j].luoWenGuanTi_l16+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#luoWenGuanTi").before($str);
				}
			}
		

		if(data.list[i].name == "luoWenJieGu"){//其他
			$("input[name='luoWenJieGu_a1']").val(data.list[i].luoWenJieGu_a1);
			$("input[name='luoWenJieGu_a2']").val(data.list[i].luoWenJieGu_a2);
			$("input[name='luoWenJieGu_a3']").val(data.list[i].luoWenJieGu_a3);
			$("input[name='luoWenJieGu_a4']").val(data.list[i].luoWenJieGu_a4);


			$("input[name='luoWenJieGu_b1']").val(data.list[i].luoWenJieGu_b1);
			$("input[name='luoWenJieGu_b2']").val(data.list[i].luoWenJieGu_b2);

			$("input[name='luoWenJieGu_c1']").val(data.list[i].luoWenJieGu_c1);
			$("input[name='luoWenJieGu_c2']").val(data.list[i].luoWenJieGu_c2);
			$("input[name='luoWenJieGu_c3']").val(data.list[i].luoWenJieGu_c3);
			$("input[name='luoWenJieGu_c4']").val(data.list[i].luoWenJieGu_c4);
			$("input[name='luoWenJieGu_c5']").val(data.list[i].luoWenJieGu_c5);
			$("input[name='luoWenJieGu_c6']").val(data.list[i].luoWenJieGu_c6);
			$("input[name='luoWenJieGu_c7']").val(data.list[i].luoWenJieGu_c7);
			$("input[name='luoWenJieGu_c8']").val(data.list[i].luoWenJieGu_c8);
			$("input[name='luoWenJieGu_c9']").val(data.list[i].luoWenJieGu_c9);
			$("input[name='luoWenJieGu_c10']").val(data.list[i].luoWenJieGu_c10);
			$("input[name='luoWenJieGu_c11']").val(data.list[i].luoWenJieGu_c11);
			$("input[name='luoWenJieGu_c12']").val(data.list[i].luoWenJieGu_c12);
			$("input[name='luoWenJieGu_c13']").val(data.list[i].luoWenJieGu_c13);
			$("input[name='luoWenJieGu_c14']").val(data.list[i].luoWenJieGu_c14);
			$("input[name='luoWenJieGu_c15']").val(data.list[i].luoWenJieGu_c15);


			$("input[name='luoWenJieGu_d1']").val(data.list[i].luoWenJieGu_d1);


			$("input[name='luoWenJieGu_l1']").val(data.list[i].change[0].luoWenJieGu_l1);
			$("input[name='luoWenJieGu_l2']").val(data.list[i].change[0].luoWenJieGu_l2);
			$("input[name='luoWenJieGu_l3']").val(data.list[i].change[0].luoWenJieGu_l3);
			$("input[name='luoWenJieGu_l4']").val(data.list[i].change[0].luoWenJieGu_l4);
			$("input[name='luoWenJieGu_l5']").val(data.list[i].change[0].luoWenJieGu_l5);
			$("input[name='luoWenJieGu_l6']").val(data.list[i].change[0].luoWenJieGu_l6);
			$("input[name='luoWenJieGu_l7']").val(data.list[i].change[0].luoWenJieGu_l7);
			$("input[name='luoWenJieGu_l8']").val(data.list[i].change[0].luoWenJieGu_l8);
			$("input[name='luoWenJieGu_l9']").val(data.list[i].change[0].luoWenJieGu_l9);
			$("input[name='luoWenJieGu_l10']").val(data.list[i].change[0].luoWenJieGu_l10);
			$("input[name='luoWenJieGu_l11']").val(data.list[i].change[0].luoWenJieGu_l11);
			$("input[name='luoWenJieGu_l12']").val(data.list[i].change[0].luoWenJieGu_l12);
			$("input[name='luoWenJieGu_l13']").val(data.list[i].change[0].luoWenJieGu_l13);
			$("input[name='luoWenJieGu_l14']").val(data.list[i].change[0].luoWenJieGu_l14);
			$("input[name='luoWenJieGu_l15']").val(data.list[i].change[0].luoWenJieGu_l15);
			$("input[name='luoWenJieGu_l16']").val(data.list[i].change[0].luoWenJieGu_l16);
			$("input[name='luoWenJieGu_l17']").val(data.list[i].change[0].luoWenJieGu_l17);
			$("input[name='luoWenJieGu_l18']").val(data.list[i].change[0].luoWenJieGu_l18);
			$("input[name='luoWenJieGu_l19']").val(data.list[i].change[0].luoWenJieGu_l19);
			$("input[name='luoWenJieGu_l20']").val(data.list[i].change[0].luoWenJieGu_l20);
			$("input[name='luoWenJieGu_l21']").val(data.list[i].change[0].luoWenJieGu_l21);
			$("input[name='luoWenJieGu_l22']").val(data.list[i].change[0].luoWenJieGu_l22);
			$("input[name='luoWenJieGu_l23']").val(data.list[i].change[0].luoWenJieGu_l23);
			$("input[name='luoWenJieGu_l24']").val(data.list[i].change[0].luoWenJieGu_l24);
			$("input[name='luoWenJieGu_l25']").val(data.list[i].change[0].luoWenJieGu_l25);
			$("input[name='luoWenJieGu_l26']").val(data.list[i].change[0].luoWenJieGu_l26);
			$("input[name='luoWenJieGu_l27']").val(data.list[i].change[0].luoWenJieGu_l27);
			$("input[name='luoWenJieGu_l28']").val(data.list[i].change[0].luoWenJieGu_l28);
			$("input[name='luoWenJieGu_l29']").val(data.list[i].change[0].luoWenJieGu_l29);
			$("input[name='luoWenJieGu_l30']").val(data.list[i].change[0].luoWenJieGu_l30);
			$("input[name='luoWenJieGu_l31']").val(data.list[i].change[0].luoWenJieGu_l31);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l1" value="'+data.list[i].change[j].luoWenJieGu_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l2" value="'+data.list[i].change[j].luoWenJieGu_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l3" value="'+data.list[i].change[j].luoWenJieGu_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l4" value="'+data.list[i].change[j].luoWenJieGu_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l5" value="'+data.list[i].change[j].luoWenJieGu_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l6" value="'+data.list[i].change[j].luoWenJieGu_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l7" value="'+data.list[i].change[j].luoWenJieGu_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l8" value="'+data.list[i].change[j].luoWenJieGu_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l9" value="'+data.list[i].change[j].luoWenJieGu_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l10" value="'+data.list[i].change[j].luoWenJieGu_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l11" value="'+data.list[i].change[j].luoWenJieGu_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l12" value="'+data.list[i].change[j].luoWenJieGu_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l13" value="'+data.list[i].change[j].luoWenJieGu_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l14" value="'+data.list[i].change[j].luoWenJieGu_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l15" value="'+data.list[i].change[j].luoWenJieGu_l15+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l16" value="'+data.list[i].change[j].luoWenJieGu_l16+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l17" value="'+data.list[i].change[j].luoWenJieGu_l17+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l18" value="'+data.list[i].change[j].luoWenJieGu_l18+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l19" value="'+data.list[i].change[j].luoWenJieGu_l19+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l20" value="'+data.list[i].change[j].luoWenJieGu_l20+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l21" value="'+data.list[i].change[j].luoWenJieGu_l21+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l22" value="'+data.list[i].change[j].luoWenJieGu_l22+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l23" value="'+data.list[i].change[j].luoWenJieGu_l23+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l24" value="'+data.list[i].change[j].luoWenJieGu_l24+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l25" value="'+data.list[i].change[j].luoWenJieGu_l25+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l26" value="'+data.list[i].change[j].luoWenJieGu_l26+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l27" value="'+data.list[i].change[j].luoWenJieGu_l27+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l28" value="'+data.list[i].change[j].luoWenJieGu_l28+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l29" value="'+data.list[i].change[j].luoWenJieGu_l29+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l30" value="'+data.list[i].change[j].luoWenJieGu_l30+'"/></td>';
				    $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="luoWenJieGu_l31" value="'+data.list[i].change[j].luoWenJieGu_l31+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#luoWenJieGu").before($str);
				}
			}
		

		if(data.list[i].name == "chouYouGanTi"){//其他
			$("input[name='chouYouGanTi_a1']").val(data.list[i].chouYouGanTi_a1);
			$("input[name='chouYouGanTi_a2']").val(data.list[i].chouYouGanTi_a2);
			$("input[name='chouYouGanTi_a3']").val(data.list[i].chouYouGanTi_a3);
			$("input[name='chouYouGanTi_a4']").val(data.list[i].chouYouGanTi_a4);


			$("input[name='chouYouGanTi_b1']").val(data.list[i].chouYouGanTi_b1);

			$("input[name='chouYouGanTi_c1']").val(data.list[i].chouYouGanTi_c1);
			$("input[name='chouYouGanTi_c2']").val(data.list[i].chouYouGanTi_c2);
			$("input[name='chouYouGanTi_c3']").val(data.list[i].chouYouGanTi_c3);
			$("input[name='chouYouGanTi_c4']").val(data.list[i].chouYouGanTi_c4);
			$("input[name='chouYouGanTi_c5']").val(data.list[i].chouYouGanTi_c5);
			$("input[name='chouYouGanTi_c6']").val(data.list[i].chouYouGanTi_c6);
			$("input[name='chouYouGanTi_c7']").val(data.list[i].chouYouGanTi_c7);
			$("input[name='chouYouGanTi_c8']").val(data.list[i].chouYouGanTi_c8);
			$("input[name='chouYouGanTi_c9']").val(data.list[i].chouYouGanTi_c9);
			$("input[name='chouYouGanTi_c10']").val(data.list[i].chouYouGanTi_c10);
			$("input[name='chouYouGanTi_c11']").val(data.list[i].chouYouGanTi_c11);
			$("input[name='chouYouGanTi_c12']").val(data.list[i].chouYouGanTi_c12);
			$("input[name='chouYouGanTi_c13']").val(data.list[i].chouYouGanTi_c13);
			$("input[name='chouYouGanTi_c14']").val(data.list[i].chouYouGanTi_c14);


			$("input[name='chouYouGanTi_d1']").val(data.list[i].chouYouGanTi_d1);


			$("input[name='chouYouGanTi_l1']").val(data.list[i].change[0].chouYouGanTi_l1);
			$("input[name='chouYouGanTi_l2']").val(data.list[i].change[0].chouYouGanTi_l2);
			$("input[name='chouYouGanTi_l3']").val(data.list[i].change[0].chouYouGanTi_l3);
			$("input[name='chouYouGanTi_l4']").val(data.list[i].change[0].chouYouGanTi_l4);
			$("input[name='chouYouGanTi_l5']").val(data.list[i].change[0].chouYouGanTi_l5);
			$("input[name='chouYouGanTi_l6']").val(data.list[i].change[0].chouYouGanTi_l6);
			$("input[name='chouYouGanTi_l7']").val(data.list[i].change[0].chouYouGanTi_l7);
			$("input[name='chouYouGanTi_l8']").val(data.list[i].change[0].chouYouGanTi_l8);
			$("input[name='chouYouGanTi_l9']").val(data.list[i].change[0].chouYouGanTi_l9);
			$("input[name='chouYouGanTi_l10']").val(data.list[i].change[0].chouYouGanTi_l10);
			$("input[name='chouYouGanTi_l11']").val(data.list[i].change[0].chouYouGanTi_l11);
			$("input[name='chouYouGanTi_l12']").val(data.list[i].change[0].chouYouGanTi_l12);
			$("input[name='chouYouGanTi_l13']").val(data.list[i].change[0].chouYouGanTi_l13);
			$("input[name='chouYouGanTi_l14']").val(data.list[i].change[0].chouYouGanTi_l14);
			$("input[name='chouYouGanTi_l15']").val(data.list[i].change[0].chouYouGanTi_l15);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l1" value="'+data.list[i].change[j].chouYouGanTi_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l2" value="'+data.list[i].change[j].chouYouGanTi_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l3" value="'+data.list[i].change[j].chouYouGanTi_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l4" value="'+data.list[i].change[j].chouYouGanTi_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l5" value="'+data.list[i].change[j].chouYouGanTi_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l6" value="'+data.list[i].change[j].chouYouGanTi_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l7" value="'+data.list[i].change[j].chouYouGanTi_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l8" value="'+data.list[i].change[j].chouYouGanTi_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l9" value="'+data.list[i].change[j].chouYouGanTi_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l10" value="'+data.list[i].change[j].chouYouGanTi_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l11" value="'+data.list[i].change[j].chouYouGanTi_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l12" value="'+data.list[i].change[j].chouYouGanTi_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l13" value="'+data.list[i].change[j].chouYouGanTi_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l14" value="'+data.list[i].change[j].chouYouGanTi_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouGanTi_l15" value="'+data.list[i].change[j].chouYouGanTi_l15+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#chouYouGanTi").before($str);
				}
			}
		

		if(data.list[i].name == "chouYouJieGu"){//其他
			$("input[name='chouYouJieGu_a1']").val(data.list[i].chouYouJieGu_a1);
			$("input[name='chouYouJieGu_a2']").val(data.list[i].chouYouJieGu_a2);
			$("input[name='chouYouJieGu_a3']").val(data.list[i].chouYouJieGu_a3);
			$("input[name='chouYouJieGu_a4']").val(data.list[i].chouYouJieGu_a4);


			$("input[name='chouYouJieGu_b1']").val(data.list[i].chouYouJieGu_b1);

			$("input[name='chouYouJieGu_c1']").val(data.list[i].chouYouJieGu_c1);
			$("input[name='chouYouJieGu_c2']").val(data.list[i].chouYouJieGu_c2);
			$("input[name='chouYouJieGu_c3']").val(data.list[i].chouYouJieGu_c3);
			$("input[name='chouYouJieGu_c4']").val(data.list[i].chouYouJieGu_c4);
			$("input[name='chouYouJieGu_c5']").val(data.list[i].chouYouJieGu_c5);
			$("input[name='chouYouJieGu_c6']").val(data.list[i].chouYouJieGu_c6);
			$("input[name='chouYouJieGu_c7']").val(data.list[i].chouYouJieGu_c7);
			$("input[name='chouYouJieGu_c8']").val(data.list[i].chouYouJieGu_c8);
			$("input[name='chouYouJieGu_c9']").val(data.list[i].chouYouJieGu_c9);
			$("input[name='chouYouJieGu_c10']").val(data.list[i].chouYouJieGu_c10);
			$("input[name='chouYouJieGu_c11']").val(data.list[i].chouYouJieGu_c11);


			$("input[name='chouYouJieGu_d1']").val(data.list[i].chouYouJieGu_d1);


			$("input[name='chouYouJieGu_l1']").val(data.list[i].change[0].chouYouJieGu_l1);
			$("input[name='chouYouJieGu_l2']").val(data.list[i].change[0].chouYouJieGu_l2);
			$("input[name='chouYouJieGu_l3']").val(data.list[i].change[0].chouYouJieGu_l3);
			$("input[name='chouYouJieGu_l4']").val(data.list[i].change[0].chouYouJieGu_l4);
			$("input[name='chouYouJieGu_l5']").val(data.list[i].change[0].chouYouJieGu_l5);
			$("input[name='chouYouJieGu_l6']").val(data.list[i].change[0].chouYouJieGu_l6);
			$("input[name='chouYouJieGu_l7']").val(data.list[i].change[0].chouYouJieGu_l7);
			$("input[name='chouYouJieGu_l8']").val(data.list[i].change[0].chouYouJieGu_l8);
			$("input[name='chouYouJieGu_l9']").val(data.list[i].change[0].chouYouJieGu_l9);
			$("input[name='chouYouJieGu_l10']").val(data.list[i].change[0].chouYouJieGu_l10);
			$("input[name='chouYouJieGu_l11']").val(data.list[i].change[0].chouYouJieGu_l11);
			$("input[name='chouYouJieGu_l12']").val(data.list[i].change[0].chouYouJieGu_l12);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l1" value="'+data.list[i].change[j].chouYouJieGu_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l2" value="'+data.list[i].change[j].chouYouJieGu_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l3" value="'+data.list[i].change[j].chouYouJieGu_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l4" value="'+data.list[i].change[j].chouYouJieGu_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l5" value="'+data.list[i].change[j].chouYouJieGu_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l6" value="'+data.list[i].change[j].chouYouJieGu_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l7" value="'+data.list[i].change[j].chouYouJieGu_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l8" value="'+data.list[i].change[j].chouYouJieGu_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l9" value="'+data.list[i].change[j].chouYouJieGu_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l10" value="'+data.list[i].change[j].chouYouJieGu_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l11" value="'+data.list[i].change[j].chouYouJieGu_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="chouYouJieGu_l12" value="'+data.list[i].change[j].chouYouJieGu_l12+'"/></td>';					
			        $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#chouYouJieGu").before($str);
				}
			}
		

		if(data.list[i].name == "faMenFaLan"){//其他
			$("input[name='faMenFaLan_a1']").val(data.list[i].faMenFaLan_a1);
			$("input[name='faMenFaLan_a2']").val(data.list[i].faMenFaLan_a2);
			$("input[name='faMenFaLan_a3']").val(data.list[i].faMenFaLan_a3);
			$("input[name='faMenFaLan_a4']").val(data.list[i].faMenFaLan_a4);


			$("input[name='faMenFaLan_b1']").val(data.list[i].faMenFaLan_b1);
			$("input[name='faMenFaLan_b2']").val(data.list[i].faMenFaLan_b2);
			$("input[name='faMenFaLan_b3']").val(data.list[i].faMenFaLan_b3);
			$("input[name='faMenFaLan_b4']").val(data.list[i].faMenFaLan_b4);
			$("input[name='faMenFaLan_b5']").val(data.list[i].faMenFaLan_b5);
			$("input[name='faMenFaLan_b6']").val(data.list[i].faMenFaLan_b6);
			$("input[name='faMenFaLan_b7']").val(data.list[i].faMenFaLan_b7);
			$("input[name='faMenFaLan_b8']").val(data.list[i].faMenFaLan_b8);
			$("input[name='faMenFaLan_b9']").val(data.list[i].faMenFaLan_b9);
			$("input[name='faMenFaLan_b10']").val(data.list[i].faMenFaLan_b10);
			$("input[name='faMenFaLan_b11']").val(data.list[i].faMenFaLan_b11);
			$("input[name='faMenFaLan_b12']").val(data.list[i].faMenFaLan_b12);
			$("input[name='faMenFaLan_b13']").val(data.list[i].faMenFaLan_b13);


			$("input[name='faMenFaLan_c1']").val(data.list[i].faMenFaLan_c1);


			$("input[name='faMenFaLan_l1']").val(data.list[i].change[0].faMenFaLan_l1);
			$("input[name='faMenFaLan_l2']").val(data.list[i].change[0].faMenFaLan_l2);
			$("input[name='faMenFaLan_l3']").val(data.list[i].change[0].faMenFaLan_l3);
			$("input[name='faMenFaLan_l4']").val(data.list[i].change[0].faMenFaLan_l4);
			$("input[name='faMenFaLan_l5']").val(data.list[i].change[0].faMenFaLan_l5);
			$("input[name='faMenFaLan_l6']").val(data.list[i].change[0].faMenFaLan_l6);
			$("input[name='faMenFaLan_l7']").val(data.list[i].change[0].faMenFaLan_l7);
			$("input[name='faMenFaLan_l8']").val(data.list[i].change[0].faMenFaLan_l8);
			$("input[name='faMenFaLan_l9']").val(data.list[i].change[0].faMenFaLan_l9);
			$("input[name='faMenFaLan_l10']").val(data.list[i].change[0].faMenFaLan_l10);
			$("input[name='faMenFaLan_l11']").val(data.list[i].change[0].faMenFaLan_l11);
			$("input[name='faMenFaLan_l12']").val(data.list[i].change[0].faMenFaLan_l12);
			$("input[name='faMenFaLan_l13']").val(data.list[i].change[0].faMenFaLan_l13);
			$("input[name='faMenFaLan_l14']").val(data.list[i].change[0].faMenFaLan_l14);
			$("input[name='faMenFaLan_l15']").val(data.list[i].change[0].faMenFaLan_l15);
			$("input[name='faMenFaLan_l16']").val(data.list[i].change[0].faMenFaLan_l16);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l1" value="'+data.list[i].change[j].faMenFaLan_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l2" value="'+data.list[i].change[j].faMenFaLan_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l3" value="'+data.list[i].change[j].faMenFaLan_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l4" value="'+data.list[i].change[j].faMenFaLan_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l5" value="'+data.list[i].change[j].faMenFaLan_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l6" value="'+data.list[i].change[j].faMenFaLan_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l7" value="'+data.list[i].change[j].faMenFaLan_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l8" value="'+data.list[i].change[j].faMenFaLan_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l9" value="'+data.list[i].change[j].faMenFaLan_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l10" value="'+data.list[i].change[j].faMenFaLan_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l11" value="'+data.list[i].change[j].faMenFaLan_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l12" value="'+data.list[i].change[j].faMenFaLan_l12+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l13" value="'+data.list[i].change[j].faMenFaLan_l13+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l14" value="'+data.list[i].change[j].faMenFaLan_l14+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l15" value="'+data.list[i].change[j].faMenFaLan_l15+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenFaLan_l16" value="'+data.list[i].change[j].faMenFaLan_l16+'"/></td>';
			        $str+='<td align="center"></td>';					
				    $str+='</tr>';
				    $("#faMenFaLan").before($str);
				}
			}
		

		if(data.list[i].name == "faMenHanJie"){//其他
			$("input[name='faMenHanJie_a1']").val(data.list[i].faMenHanJie_a1);
			$("input[name='faMenHanJie_a2']").val(data.list[i].faMenHanJie_a2);
			$("input[name='faMenHanJie_a3']").val(data.list[i].faMenHanJie_a3);
			$("input[name='faMenHanJie_a4']").val(data.list[i].faMenHanJie_a4);


			$("input[name='faMenHanJie_b1']").val(data.list[i].faMenHanJie_b1);
			$("input[name='faMenHanJie_b2']").val(data.list[i].faMenHanJie_b2);
			$("input[name='faMenHanJie_b3']").val(data.list[i].faMenHanJie_b3);
			$("input[name='faMenHanJie_b4']").val(data.list[i].faMenHanJie_b4);
			$("input[name='faMenHanJie_b5']").val(data.list[i].faMenHanJie_b5);
			$("input[name='faMenHanJie_b6']").val(data.list[i].faMenHanJie_b6);
			$("input[name='faMenHanJie_b7']").val(data.list[i].faMenHanJie_b7);
			$("input[name='faMenHanJie_b8']").val(data.list[i].faMenHanJie_b8);
			$("input[name='faMenHanJie_b9']").val(data.list[i].faMenHanJie_b9);
			$("input[name='faMenHanJie_b10']").val(data.list[i].faMenHanJie_b10);
			$("input[name='faMenHanJie_b11']").val(data.list[i].faMenHanJie_b11);


			$("input[name='faMenHanJie_c1']").val(data.list[i].faMenHanJie_c1);


			$("input[name='faMenHanJie_l1']").val(data.list[i].change[0].faMenHanJie_l1);
			$("input[name='faMenHanJie_l2']").val(data.list[i].change[0].faMenHanJie_l2);
			$("input[name='faMenHanJie_l3']").val(data.list[i].change[0].faMenHanJie_l3);
			$("input[name='faMenHanJie_l4']").val(data.list[i].change[0].faMenHanJie_l4);
			$("input[name='faMenHanJie_l5']").val(data.list[i].change[0].faMenHanJie_l5);
			$("input[name='faMenHanJie_l6']").val(data.list[i].change[0].faMenHanJie_l6);
			$("input[name='faMenHanJie_l7']").val(data.list[i].change[0].faMenHanJie_l7);
			$("input[name='faMenHanJie_l8']").val(data.list[i].change[0].faMenHanJie_l8);
			$("input[name='faMenHanJie_l9']").val(data.list[i].change[0].faMenHanJie_l9);
			$("input[name='faMenHanJie_l10']").val(data.list[i].change[0].faMenHanJie_l10);
			$("input[name='faMenHanJie_l11']").val(data.list[i].change[0].faMenHanJie_l11);
			$("input[name='faMenHanJie_l12']").val(data.list[i].change[0].faMenHanJie_l12);
			$("input[name='faMenHanJie_l13']").val(data.list[i].change[0].faMenHanJie_l13);
			$("input[name='faMenHanJie_l14']").val(data.list[i].change[0].faMenHanJie_l14);
			$("input[name='faMenHanJie_l15']").val(data.list[i].change[0].faMenHanJie_l15);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l1" value="'+data.list[i].change[j].faMenHanJie_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l2" value="'+data.list[i].change[j].faMenHanJie_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l3" value="'+data.list[i].change[j].faMenHanJie_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l4" value="'+data.list[i].change[j].faMenHanJie_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l5" value="'+data.list[i].change[j].faMenHanJie_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l6" value="'+data.list[i].change[j].faMenHanJie_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l7" value="'+data.list[i].change[j].faMenHanJie_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l8" value="'+data.list[i].change[j].faMenHanJie_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l9" value="'+data.list[i].change[j].faMenHanJie_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l10" value="'+data.list[i].change[j].faMenHanJie_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l11" value="'+data.list[i].change[j].faMenHanJie_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l12" value="'+data.list[i].change[j].faMenHanJie_l12+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l13" value="'+data.list[i].change[j].faMenHanJie_l13+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l14" value="'+data.list[i].change[j].faMenHanJie_l14+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenHanJie_l15" value="'+data.list[i].change[j].faMenHanJie_l15+'"/></td>';
			        $str+='<td align="center"></td>';					
				    $str+='</tr>';
				    $("#faMenHanJie").before($str);
				}
			}
		

		if(data.list[i].name == "jueYuanJieTou"){//其他
			$("input[name='jueYuanJieTou_a1']").val(data.list[i].jueYuanJieTou_a1);
			$("input[name='jueYuanJieTou_a2']").val(data.list[i].jueYuanJieTou_a2);
			$("input[name='jueYuanJieTou_a3']").val(data.list[i].jueYuanJieTou_a3);
			$("input[name='jueYuanJieTou_a4']").val(data.list[i].jueYuanJieTou_a4);


			$("input[name='jueYuanJieTou_b1']").val(data.list[i].jueYuanJieTou_b1);
			$("input[name='jueYuanJieTou_b2']").val(data.list[i].jueYuanJieTou_b2);
			$("input[name='jueYuanJieTou_b3']").val(data.list[i].jueYuanJieTou_b3);
			$("input[name='jueYuanJieTou_b4']").val(data.list[i].jueYuanJieTou_b4);
			$("input[name='jueYuanJieTou_b5']").val(data.list[i].jueYuanJieTou_b5);
			$("input[name='jueYuanJieTou_b6']").val(data.list[i].jueYuanJieTou_b6);
			$("input[name='jueYuanJieTou_b7']").val(data.list[i].jueYuanJieTou_b7);
			$("input[name='jueYuanJieTou_b8']").val(data.list[i].jueYuanJieTou_b8);
			$("input[name='jueYuanJieTou_b9']").val(data.list[i].jueYuanJieTou_b9);
			$("input[name='jueYuanJieTou_b10']").val(data.list[i].jueYuanJieTou_b10);
			$("input[name='jueYuanJieTou_b11']").val(data.list[i].jueYuanJieTou_b11);
			$("input[name='jueYuanJieTou_b12']").val(data.list[i].jueYuanJieTou_b12);
			$("input[name='jueYuanJieTou_b13']").val(data.list[i].jueYuanJieTou_b13);
			$("input[name='jueYuanJieTou_b14']").val(data.list[i].jueYuanJieTou_b14);
			$("input[name='jueYuanJieTou_b15']").val(data.list[i].jueYuanJieTou_b15);
			$("input[name='jueYuanJieTou_b16']").val(data.list[i].jueYuanJieTou_b16);
			$("input[name='jueYuanJieTou_b17']").val(data.list[i].jueYuanJieTou_b17);
			$("input[name='jueYuanJieTou_b18']").val(data.list[i].jueYuanJieTou_b18);
			$("input[name='jueYuanJieTou_b19']").val(data.list[i].jueYuanJieTou_b19);
			$("input[name='jueYuanJieTou_b20']").val(data.list[i].jueYuanJieTou_b20);


			$("input[name='jueYuanJieTou_c1']").val(data.list[i].jueYuanJieTou_c1);
			$("input[name='jueYuanJieTou_c2']").val(data.list[i].jueYuanJieTou_c2);
			$("input[name='jueYuanJieTou_c3']").val(data.list[i].jueYuanJieTou_c3);

			$("input[name='jueYuanJieTou_d1']").val(data.list[i].jueYuanJieTou_d1);
			$("input[name='jueYuanJieTou_d2']").val(data.list[i].jueYuanJieTou_d2);
			$("input[name='jueYuanJieTou_d3']").val(data.list[i].jueYuanJieTou_d3);

			$("input[name='jueYuanJieTou_e1']").val(data.list[i].jueYuanJieTou_e1);
			$("input[name='jueYuanJieTou_e2']").val(data.list[i].jueYuanJieTou_e2);
			$("input[name='jueYuanJieTou_e3']").val(data.list[i].jueYuanJieTou_e3);

			$("input[name='jueYuanJieTou_f1']").val(data.list[i].jueYuanJieTou_f1);
			$("input[name='jueYuanJieTou_f2']").val(data.list[i].jueYuanJieTou_f2);
			$("input[name='jueYuanJieTou_f3']").val(data.list[i].jueYuanJieTou_f3);


			$("input[name='jueYuanJieTou_l1']").val(data.list[i].change[0].jueYuanJieTou_l1);
			$("input[name='jueYuanJieTou_l2']").val(data.list[i].change[0].jueYuanJieTou_l2);
			$("input[name='jueYuanJieTou_l3']").val(data.list[i].change[0].jueYuanJieTou_l3);
			$("input[name='jueYuanJieTou_l4']").val(data.list[i].change[0].jueYuanJieTou_l4);
			$("input[name='jueYuanJieTou_l5']").val(data.list[i].change[0].jueYuanJieTou_l5);
			$("input[name='jueYuanJieTou_l6']").val(data.list[i].change[0].jueYuanJieTou_l6);
			$("input[name='jueYuanJieTou_l7']").val(data.list[i].change[0].jueYuanJieTou_l7);
			$("input[name='jueYuanJieTou_l8']").val(data.list[i].change[0].jueYuanJieTou_l8);
			$("input[name='jueYuanJieTou_l9']").val(data.list[i].change[0].jueYuanJieTou_l9);
			$("input[name='jueYuanJieTou_l10']").val(data.list[i].change[0].jueYuanJieTou_l10);
			$("input[name='jueYuanJieTou_l11']").val(data.list[i].change[0].jueYuanJieTou_l11);
			$("input[name='jueYuanJieTou_l12']").val(data.list[i].change[0].jueYuanJieTou_l12);
			$("input[name='jueYuanJieTou_l13']").val(data.list[i].change[0].jueYuanJieTou_l13);
			$("input[name='jueYuanJieTou_l14']").val(data.list[i].change[0].jueYuanJieTou_l14);
			$("input[name='jueYuanJieTou_l15']").val(data.list[i].change[0].jueYuanJieTou_l15);
			$("input[name='jueYuanJieTou_l16']").val(data.list[i].change[0].jueYuanJieTou_l16);
			$("input[name='jueYuanJieTou_l17']").val(data.list[i].change[0].jueYuanJieTou_l17);
			$("input[name='jueYuanJieTou_l18']").val(data.list[i].change[0].jueYuanJieTou_l18);
			$("input[name='jueYuanJieTou_l19']").val(data.list[i].change[0].jueYuanJieTou_l19);
			$("input[name='jueYuanJieTou_l20']").val(data.list[i].change[0].jueYuanJieTou_l20);
			$("input[name='jueYuanJieTou_l21']").val(data.list[i].change[0].jueYuanJieTou_l21);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l1" value="'+data.list[i].change[j].jueYuanJieTou_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l2" value="'+data.list[i].change[j].jueYuanJieTou_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l3" value="'+data.list[i].change[j].jueYuanJieTou_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l4" value="'+data.list[i].change[j].jueYuanJieTou_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l5" value="'+data.list[i].change[j].jueYuanJieTou_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l6" value="'+data.list[i].change[j].jueYuanJieTou_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l7" value="'+data.list[i].change[j].jueYuanJieTou_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l8" value="'+data.list[i].change[j].jueYuanJieTou_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l9" value="'+data.list[i].change[j].jueYuanJieTou_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l10" value="'+data.list[i].change[j].jueYuanJieTou_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l11" value="'+data.list[i].change[j].jueYuanJieTou_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l12" value="'+data.list[i].change[j].jueYuanJieTou_l12+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l13" value="'+data.list[i].change[j].jueYuanJieTou_l13+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l14" value="'+data.list[i].change[j].jueYuanJieTou_l14+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l15" value="'+data.list[i].change[j].jueYuanJieTou_l15+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l16" value="'+data.list[i].change[j].jueYuanJieTou_l16+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l17" value="'+data.list[i].change[j].jueYuanJieTou_l17+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l18" value="'+data.list[i].change[j].jueYuanJieTou_l18+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l19" value="'+data.list[i].change[j].jueYuanJieTou_l19+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l20" value="'+data.list[i].change[j].jueYuanJieTou_l20+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="jueYuanJieTou_l21" value="'+data.list[i].change[j].jueYuanJieTou_l21+'"/></td>';
			        $str+='<td align="center"></td>';					
				    $str+='</tr>';
				    $("#jueYuanJieTou").before($str);
				}
			}
		

		if(data.list[i].name == "faLanJiHe"){//其他
			$("input[name='faLanJiHe_a1']").val(data.list[i].faLanJiHe_a1);
			$("input[name='faLanJiHe_a2']").val(data.list[i].faLanJiHe_a2);
			$("input[name='faLanJiHe_a3']").val(data.list[i].faLanJiHe_a3);


			$("input[name='faLanJiHe_b1']").val(data.list[i].faLanJiHe_b1);

			$("input[name='faLanJiHe_c1']").val(data.list[i].faLanJiHe_c1);
			$("input[name='faLanJiHe_c2']").val(data.list[i].faLanJiHe_c2);
			$("input[name='faLanJiHe_c3']").val(data.list[i].faLanJiHe_c3);
			$("input[name='faLanJiHe_c4']").val(data.list[i].faLanJiHe_c4);
			$("input[name='faLanJiHe_c5']").val(data.list[i].faLanJiHe_c5);
			$("input[name='faLanJiHe_c6']").val(data.list[i].faLanJiHe_c6);
			$("input[name='faLanJiHe_c7']").val(data.list[i].faLanJiHe_c7);
			$("input[name='faLanJiHe_c8']").val(data.list[i].faLanJiHe_c8);
			$("input[name='faLanJiHe_c9']").val(data.list[i].faLanJiHe_c9);
			$("input[name='faLanJiHe_c10']").val(data.list[i].faLanJiHe_c10);
			$("input[name='faLanJiHe_c11']").val(data.list[i].faLanJiHe_c11);
			$("input[name='faLanJiHe_c12']").val(data.list[i].faLanJiHe_c12);
			$("input[name='faLanJiHe_c13']").val(data.list[i].faLanJiHe_c13);


			$("input[name='faLanJiHe_d1']").val(data.list[i].faLanJiHe_d1);


			$("input[name='faLanJiHe_l1']").val(data.list[i].change[0].faLanJiHe_l1);
			$("input[name='faLanJiHe_l2']").val(data.list[i].change[0].faLanJiHe_l2);
			$("input[name='faLanJiHe_l3']").val(data.list[i].change[0].faLanJiHe_l3);
			$("input[name='faLanJiHe_l4']").val(data.list[i].change[0].faLanJiHe_l4);
			$("input[name='faLanJiHe_l5']").val(data.list[i].change[0].faLanJiHe_l5);
			$("input[name='faLanJiHe_l6']").val(data.list[i].change[0].faLanJiHe_l6);
			$("input[name='faLanJiHe_l7']").val(data.list[i].change[0].faLanJiHe_l7);
			$("input[name='faLanJiHe_l8']").val(data.list[i].change[0].faLanJiHe_l8);
			$("input[name='faLanJiHe_l9']").val(data.list[i].change[0].faLanJiHe_l9);
			$("input[name='faLanJiHe_l10']").val(data.list[i].change[0].faLanJiHe_l10);
			$("input[name='faLanJiHe_l11']").val(data.list[i].change[0].faLanJiHe_l11);
			$("input[name='faLanJiHe_l12']").val(data.list[i].change[0].faLanJiHe_l12);
			$("input[name='faLanJiHe_l13']").val(data.list[i].change[0].faLanJiHe_l13);
			$("input[name='faLanJiHe_l14']").val(data.list[i].change[0].faLanJiHe_l14);
			$("input[name='faLanJiHe_l15']").val(data.list[i].change[0].faLanJiHe_l15);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l1" value="'+data.list[i].change[j].faLanJiHe_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l2" value="'+data.list[i].change[j].faLanJiHe_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l3" value="'+data.list[i].change[j].faLanJiHe_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l4" value="'+data.list[i].change[j].faLanJiHe_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l5" value="'+data.list[i].change[j].faLanJiHe_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l6" value="'+data.list[i].change[j].faLanJiHe_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l7" value="'+data.list[i].change[j].faLanJiHe_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l8" value="'+data.list[i].change[j].faLanJiHe_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l9" value="'+data.list[i].change[j].faLanJiHe_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l10" value="'+data.list[i].change[j].faLanJiHe_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l11" value="'+data.list[i].change[j].faLanJiHe_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l12" value="'+data.list[i].change[j].faLanJiHe_l12+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l13" value="'+data.list[i].change[j].faLanJiHe_l13+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l14" value="'+data.list[i].change[j].faLanJiHe_l14+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanJiHe_l15" value="'+data.list[i].change[j].faLanJiHe_l15+'"/></td>';
			        $str+='<td align="center"></td>';					
				    $str+='</tr>';
				    $("#faLanJiHe").before($str);
				}
			}
		

		if(data.list[i].name == "fangFuGuan"){//其他
			$("input[name='fangFuGuan_a1']").val(data.list[i].fangFuGuan_a1);
			$("input[name='fangFuGuan_a2']").val(data.list[i].fangFuGuan_a2);
			$("input[name='fangFuGuan_a3']").val(data.list[i].fangFuGuan_a3);
			$("input[name='fangFuGuan_a4']").val(data.list[i].fangFuGuan_a4);


			$("input[name='fangFuGuan_b1']").val(data.list[i].fangFuGuan_b1);
			$("input[name='fangFuGuan_b2']").val(data.list[i].fangFuGuan_b2);
			$("input[name='fangFuGuan_b3']").val(data.list[i].fangFuGuan_b3);

			$("input[name='fangFuGuan_c1']").val(data.list[i].fangFuGuan_c1);
			$("input[name='fangFuGuan_c2']").val(data.list[i].fangFuGuan_c2);
			$("input[name='fangFuGuan_c3']").val(data.list[i].fangFuGuan_c3);

            $("input[name='fangFuGuan_d1']").val(data.list[i].fangFuGuan_d1);
			$("input[name='fangFuGuan_d2']").val(data.list[i].fangFuGuan_d2);
			$("input[name='fangFuGuan_d3']").val(data.list[i].fangFuGuan_d3);
			$("input[name='fangFuGuan_d4']").val(data.list[i].fangFuGuan_d4);
			$("input[name='fangFuGuan_d5']").val(data.list[i].fangFuGuan_d5);
			$("input[name='fangFuGuan_d6']").val(data.list[i].fangFuGuan_d6);

			$("input[name='fangFuGuan_e1']").val(data.list[i].fangFuGuan_e1);


			$("input[name='fangFuGuan_l1']").val(data.list[i].change[0].fangFuGuan_l1);
			$("input[name='fangFuGuan_l2']").val(data.list[i].change[0].fangFuGuan_l2);
			$("input[name='fangFuGuan_l3']").val(data.list[i].change[0].fangFuGuan_l3);
			$("input[name='fangFuGuan_l4']").val(data.list[i].change[0].fangFuGuan_l4);
			$("input[name='fangFuGuan_l5']").val(data.list[i].change[0].fangFuGuan_l5);
			$("input[name='fangFuGuan_l6']").val(data.list[i].change[0].fangFuGuan_l6);
			$("input[name='fangFuGuan_l7']").val(data.list[i].change[0].fangFuGuan_l7);
			$("input[name='fangFuGuan_l8']").val(data.list[i].change[0].fangFuGuan_l8);
			$("input[name='fangFuGuan_l9']").val(data.list[i].change[0].fangFuGuan_l9);
			$("input[name='fangFuGuan_l10']").val(data.list[i].change[0].fangFuGuan_l10);
			$("input[name='fangFuGuan_l11']").val(data.list[i].change[0].fangFuGuan_l11);
			$("input[name='fangFuGuan_l12']").val(data.list[i].change[0].fangFuGuan_l12);
			$("input[name='fangFuGuan_l13']").val(data.list[i].change[0].fangFuGuan_l13);
			$("input[name='fangFuGuan_l14']").val(data.list[i].change[0].fangFuGuan_l14);
			$("input[name='fangFuGuan_l15']").val(data.list[i].change[0].fangFuGuan_l15);
			$("input[name='fangFuGuan_l16']").val(data.list[i].change[0].fangFuGuan_l16);
			$("input[name='fangFuGuan_l17']").val(data.list[i].change[0].fangFuGuan_l17);
			$("input[name='fangFuGuan_l18']").val(data.list[i].change[0].fangFuGuan_l18);
			$("input[name='fangFuGuan_l19']").val(data.list[i].change[0].fangFuGuan_l19);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l1" value="'+data.list[i].change[j].fangFuGuan_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l2" value="'+data.list[i].change[j].fangFuGuan_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l3" value="'+data.list[i].change[j].fangFuGuan_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l4" value="'+data.list[i].change[j].fangFuGuan_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l5" value="'+data.list[i].change[j].fangFuGuan_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l6" value="'+data.list[i].change[j].fangFuGuan_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l7" value="'+data.list[i].change[j].fangFuGuan_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l8" value="'+data.list[i].change[j].fangFuGuan_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l9" value="'+data.list[i].change[j].fangFuGuan_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l10" value="'+data.list[i].change[j].fangFuGuan_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l11" value="'+data.list[i].change[j].fangFuGuan_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l12" value="'+data.list[i].change[j].fangFuGuan_l12+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l13" value="'+data.list[i].change[j].fangFuGuan_l13+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l14" value="'+data.list[i].change[j].fangFuGuan_l14+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l15" value="'+data.list[i].change[j].fangFuGuan_l15+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l16" value="'+data.list[i].change[j].fangFuGuan_l16+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l17" value="'+data.list[i].change[j].fangFuGuan_l17+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l18" value="'+data.list[i].change[j].fangFuGuan_l18+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fangFuGuan_l19" value="'+data.list[i].change[j].fangFuGuan_l19+'"/></td>';
			        $str+='<td align="center"></td>';					
				    $str+='</tr>';
				    $("#fangFuGuan").before($str);
				}
			}
		

		if(data.list[i].name == "youTaoGuanGuanTi"){//其他
			$("input[name='youTaoGuanGuanTi_a1']").val(data.list[i].youTaoGuanGuanTi_a1);
			$("input[name='youTaoGuanGuanTi_a2']").val(data.list[i].youTaoGuanGuanTi_a2);
			$("input[name='youTaoGuanGuanTi_a3']").val(data.list[i].youTaoGuanGuanTi_a3);
			$("input[name='youTaoGuanGuanTi_a4']").val(data.list[i].youTaoGuanGuanTi_a4);


			$("input[name='youTaoGuanGuanTi_b1']").val(data.list[i].youTaoGuanGuanTi_b1);
			$("input[name='youTaoGuanGuanTi_b2']").val(data.list[i].youTaoGuanGuanTi_b2);
			$("input[name='youTaoGuanGuanTi_b3']").val(data.list[i].youTaoGuanGuanTi_b3);

			$("input[name='youTaoGuanGuanTi_c1']").val(data.list[i].youTaoGuanGuanTi_c1);
			$("input[name='youTaoGuanGuanTi_c2']").val(data.list[i].youTaoGuanGuanTi_c2);
			$("input[name='youTaoGuanGuanTi_c3']").val(data.list[i].youTaoGuanGuanTi_c3);
			$("input[name='youTaoGuanGuanTi_c4']").val(data.list[i].youTaoGuanGuanTi_c4);
			$("input[name='youTaoGuanGuanTi_c5']").val(data.list[i].youTaoGuanGuanTi_c5);
			$("input[name='youTaoGuanGuanTi_c6']").val(data.list[i].youTaoGuanGuanTi_c6);
			$("input[name='youTaoGuanGuanTi_c7']").val(data.list[i].youTaoGuanGuanTi_c7);
			$("input[name='youTaoGuanGuanTi_c8']").val(data.list[i].youTaoGuanGuanTi_c8);
			$("input[name='youTaoGuanGuanTi_c9']").val(data.list[i].youTaoGuanGuanTi_c9);


			$("input[name='youTaoGuanGuanTi_d1']").val(data.list[i].youTaoGuanGuanTi_d1);


			$("input[name='youTaoGuanGuanTi_l1']").val(data.list[i].change[0].youTaoGuanGuanTi_l1);
			$("input[name='youTaoGuanGuanTi_l2']").val(data.list[i].change[0].youTaoGuanGuanTi_l2);
			$("input[name='youTaoGuanGuanTi_l3']").val(data.list[i].change[0].youTaoGuanGuanTi_l3);
			$("input[name='youTaoGuanGuanTi_l4']").val(data.list[i].change[0].youTaoGuanGuanTi_l4);
			$("input[name='youTaoGuanGuanTi_l5']").val(data.list[i].change[0].youTaoGuanGuanTi_l5);
			$("input[name='youTaoGuanGuanTi_l6']").val(data.list[i].change[0].youTaoGuanGuanTi_l6);
			$("input[name='youTaoGuanGuanTi_l7']").val(data.list[i].change[0].youTaoGuanGuanTi_l7);
			$("input[name='youTaoGuanGuanTi_l8']").val(data.list[i].change[0].youTaoGuanGuanTi_l8);
			$("input[name='youTaoGuanGuanTi_l9']").val(data.list[i].change[0].youTaoGuanGuanTi_l9);
			$("input[name='youTaoGuanGuanTi_l10']").val(data.list[i].change[0].youTaoGuanGuanTi_l10);
			$("input[name='youTaoGuanGuanTi_l11']").val(data.list[i].change[0].youTaoGuanGuanTi_l11);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanGuanTi_l1" value="'+data.list[i].change[j].youTaoGuanGuanTi_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanGuanTi_l2" value="'+data.list[i].change[j].youTaoGuanGuanTi_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanGuanTi_l3" value="'+data.list[i].change[j].youTaoGuanGuanTi_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanGuanTi_l4" value="'+data.list[i].change[j].youTaoGuanGuanTi_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanGuanTi_l5" value="'+data.list[i].change[j].youTaoGuanGuanTi_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanGuanTi_l6" value="'+data.list[i].change[j].youTaoGuanGuanTi_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanGuanTi_l7" value="'+data.list[i].change[j].youTaoGuanGuanTi_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanGuanTi_l8" value="'+data.list[i].change[j].youTaoGuanGuanTi_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanGuanTi_l9" value="'+data.list[i].change[j].youTaoGuanGuanTi_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanGuanTi_l10" value="'+data.list[i].change[j].youTaoGuanGuanTi_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanGuanTi_l11" value="'+data.list[i].change[j].youTaoGuanGuanTi_l11+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#youTaoGuanGuanTi").before($str);
				}
			}
		

		if(data.list[i].name == "youTaoGuanJieGu"){//其他
			$("input[name='youTaoGuanJieGu_a1']").val(data.list[i].youTaoGuanJieGu_a1);
			$("input[name='youTaoGuanJieGu_a2']").val(data.list[i].youTaoGuanJieGu_a2);
			$("input[name='youTaoGuanJieGu_a3']").val(data.list[i].youTaoGuanJieGu_a3);
			$("input[name='youTaoGuanJieGu_a4']").val(data.list[i].youTaoGuanJieGu_a4);


			$("input[name='youTaoGuanJieGu_b1']").val(data.list[i].youTaoGuanJieGu_b1);
			$("input[name='youTaoGuanJieGu_b2']").val(data.list[i].youTaoGuanJieGu_b2);
			$("input[name='youTaoGuanJieGu_b3']").val(data.list[i].youTaoGuanJieGu_b3);
			$("input[name='youTaoGuanJieGu_b4']").val(data.list[i].youTaoGuanJieGu_b4);

			$("input[name='youTaoGuanJieGu_c1']").val(data.list[i].youTaoGuanJieGu_c1);
			$("input[name='youTaoGuanJieGu_c2']").val(data.list[i].youTaoGuanJieGu_c2);
			$("input[name='youTaoGuanJieGu_c3']").val(data.list[i].youTaoGuanJieGu_c3);
			$("input[name='youTaoGuanJieGu_c4']").val(data.list[i].youTaoGuanJieGu_c4);
			$("input[name='youTaoGuanJieGu_c5']").val(data.list[i].youTaoGuanJieGu_c5);
			$("input[name='youTaoGuanJieGu_c6']").val(data.list[i].youTaoGuanJieGu_c6);
			$("input[name='youTaoGuanJieGu_c7']").val(data.list[i].youTaoGuanJieGu_c7);
			$("input[name='youTaoGuanJieGu_c8']").val(data.list[i].youTaoGuanJieGu_c8);
			$("input[name='youTaoGuanJieGu_c9']").val(data.list[i].youTaoGuanJieGu_c9);

			$("input[name='youTaoGuanJieGu_d1']").val(data.list[i].youTaoGuanJieGu_d1);


			$("input[name='youTaoGuanJieGu_l1']").val(data.list[i].change[0].youTaoGuanJieGu_l1);
			$("input[name='youTaoGuanJieGu_l2']").val(data.list[i].change[0].youTaoGuanJieGu_l2);
			$("input[name='youTaoGuanJieGu_l3']").val(data.list[i].change[0].youTaoGuanJieGu_l3);
			$("input[name='youTaoGuanJieGu_l4']").val(data.list[i].change[0].youTaoGuanJieGu_l4);
			$("input[name='youTaoGuanJieGu_l5']").val(data.list[i].change[0].youTaoGuanJieGu_l5);
			$("input[name='youTaoGuanJieGu_l6']").val(data.list[i].change[0].youTaoGuanJieGu_l6);
			$("input[name='youTaoGuanJieGu_l7']").val(data.list[i].change[0].youTaoGuanJieGu_l7);
			$("input[name='youTaoGuanJieGu_l8']").val(data.list[i].change[0].youTaoGuanJieGu_l8);
			$("input[name='youTaoGuanJieGu_l9']").val(data.list[i].change[0].youTaoGuanJieGu_l9);
			$("input[name='youTaoGuanJieGu_l10']").val(data.list[i].change[0].youTaoGuanJieGu_l10);
			$("input[name='youTaoGuanJieGu_l11']").val(data.list[i].change[0].youTaoGuanJieGu_l11);
			$("input[name='youTaoGuanJieGu_l12']").val(data.list[i].change[0].youTaoGuanJieGu_l12);
			$("input[name='youTaoGuanJieGu_l13']").val(data.list[i].change[0].youTaoGuanJieGu_l13);
			$("input[name='youTaoGuanJieGu_l14']").val(data.list[i].change[0].youTaoGuanJieGu_l14);
			$("input[name='youTaoGuanJieGu_l15']").val(data.list[i].change[0].youTaoGuanJieGu_l15);
			$("input[name='youTaoGuanJieGu_l16']").val(data.list[i].change[0].youTaoGuanJieGu_l16);
			$("input[name='youTaoGuanJieGu_l17']").val(data.list[i].change[0].youTaoGuanJieGu_l17);
			$("input[name='youTaoGuanJieGu_l18']").val(data.list[i].change[0].youTaoGuanJieGu_l18);
			$("input[name='youTaoGuanJieGu_l19']").val(data.list[i].change[0].youTaoGuanJieGu_l19);
			$("input[name='youTaoGuanJieGu_l20']").val(data.list[i].change[0].youTaoGuanJieGu_l20);
			$("input[name='youTaoGuanJieGu_l21']").val(data.list[i].change[0].youTaoGuanJieGu_l21);
			$("input[name='youTaoGuanJieGu_l22']").val(data.list[i].change[0].youTaoGuanJieGu_l22);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l1" value="'+data.list[i].change[j].youTaoGuanJieGu_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l2" value="'+data.list[i].change[j].youTaoGuanJieGu_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l3" value="'+data.list[i].change[j].youTaoGuanJieGu_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l4" value="'+data.list[i].change[j].youTaoGuanJieGu_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l5" value="'+data.list[i].change[j].youTaoGuanJieGu_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l6" value="'+data.list[i].change[j].youTaoGuanJieGu_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l7" value="'+data.list[i].change[j].youTaoGuanJieGu_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l8" value="'+data.list[i].change[j].youTaoGuanJieGu_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l9" value="'+data.list[i].change[j].youTaoGuanJieGu_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l10" value="'+data.list[i].change[j].youTaoGuanJieGu_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l11" value="'+data.list[i].change[j].youTaoGuanJieGu_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l12" value="'+data.list[i].change[j].youTaoGuanJieGu_l12+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l13" value="'+data.list[i].change[j].youTaoGuanJieGu_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l14" value="'+data.list[i].change[j].youTaoGuanJieGu_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l15" value="'+data.list[i].change[j].youTaoGuanJieGu_l15+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l16" value="'+data.list[i].change[j].youTaoGuanJieGu_l16+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l17" value="'+data.list[i].change[j].youTaoGuanJieGu_l17+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l18" value="'+data.list[i].change[j].youTaoGuanJieGu_l18+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l19" value="'+data.list[i].change[j].youTaoGuanJieGu_l19+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l20" value="'+data.list[i].change[j].youTaoGuanJieGu_l20+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l21" value="'+data.list[i].change[j].youTaoGuanJieGu_l21+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="youTaoGuanJieGu_l22" value="'+data.list[i].change[j].youTaoGuanJieGu_l22+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#youTaoGuanJieGu").before($str);
				}
			}
		

		if(data.list[i].name == "zuanJuLuoWen"){//其他
			$("input[name='zuanJuLuoWen_a1']").val(data.list[i].zuanJuLuoWen_a1);
			$("input[name='zuanJuLuoWen_a2']").val(data.list[i].zuanJuLuoWen_a2);

			$("input[name='zuanJuLuoWen_b1']").val(data.list[i].zuanJuLuoWen_b1);
			$("input[name='zuanJuLuoWen_b2']").val(data.list[i].zuanJuLuoWen_b2);

			$("input[name='zuanJuLuoWen_c1']").val(data.list[i].zuanJuLuoWen_c1);
			$("input[name='zuanJuLuoWen_c2']").val(data.list[i].zuanJuLuoWen_c2);
			$("input[name='zuanJuLuoWen_c3']").val(data.list[i].zuanJuLuoWen_c3);

			$("input[name='zuanJuLuoWen_d1']").val(data.list[i].zuanJuLuoWen_d1);

			$("input[name='zuanJuLuoWen_e1']").val(data.list[i].zuanJuLuoWen_e1);
			$("input[name='zuanJuLuoWen_e2']").val(data.list[i].zuanJuLuoWen_e2);
			$("input[name='zuanJuLuoWen_e3']").val(data.list[i].zuanJuLuoWen_e3);
			$("input[name='zuanJuLuoWen_e4']").val(data.list[i].zuanJuLuoWen_e4);
			$("input[name='zuanJuLuoWen_e5']").val(data.list[i].zuanJuLuoWen_e5);
			$("input[name='zuanJuLuoWen_e6']").val(data.list[i].zuanJuLuoWen_e6);
			$("input[name='zuanJuLuoWen_e7']").val(data.list[i].zuanJuLuoWen_e7);
			$("input[name='zuanJuLuoWen_e8']").val(data.list[i].zuanJuLuoWen_e8);
			$("input[name='zuanJuLuoWen_e9']").val(data.list[i].zuanJuLuoWen_e9);
			$("input[name='zuanJuLuoWen_e10']").val(data.list[i].zuanJuLuoWen_e10);
			$("input[name='zuanJuLuoWen_e11']").val(data.list[i].zuanJuLuoWen_e11);

			$("input[name='zuanJuLuoWen_f1']").val(data.list[i].zuanJuLuoWen_f1);
			$("input[name='zuanJuLuoWen_f2']").val(data.list[i].zuanJuLuoWen_f2);
			$("input[name='zuanJuLuoWen_f3']").val(data.list[i].zuanJuLuoWen_f3);
			$("input[name='zuanJuLuoWen_f4']").val(data.list[i].zuanJuLuoWen_f4);

			$("input[name='zuanJuLuoWen_g1']").val(data.list[i].zuanJuLuoWen_g1);
			$("input[name='zuanJuLuoWen_g2']").val(data.list[i].zuanJuLuoWen_g2);
			$("input[name='zuanJuLuoWen_g3']").val(data.list[i].zuanJuLuoWen_g3);
			$("input[name='zuanJuLuoWen_g4']").val(data.list[i].zuanJuLuoWen_g4);
			$("input[name='zuanJuLuoWen_g5']").val(data.list[i].zuanJuLuoWen_g5);
			$("input[name='zuanJuLuoWen_g6']").val(data.list[i].zuanJuLuoWen_g6);
			$("input[name='zuanJuLuoWen_g7']").val(data.list[i].zuanJuLuoWen_g7);
			$("input[name='zuanJuLuoWen_g8']").val(data.list[i].zuanJuLuoWen_g8);
			$("input[name='zuanJuLuoWen_g9']").val(data.list[i].zuanJuLuoWen_g9);
			$("input[name='zuanJuLuoWen_g10']").val(data.list[i].zuanJuLuoWen_g10);
			$("input[name='zuanJuLuoWen_g11']").val(data.list[i].zuanJuLuoWen_g11);

			$("input[name='zuanJuLuoWen_h1']").val(data.list[i].zuanJuLuoWen_h1);


			$("input[name='zuanJuLuoWen_l1']").val(data.list[i].change[0].zuanJuLuoWen_l1);
			$("input[name='zuanJuLuoWen_l2']").val(data.list[i].change[0].zuanJuLuoWen_l2);
			$("input[name='zuanJuLuoWen_l3']").val(data.list[i].change[0].zuanJuLuoWen_l3);
			$("input[name='zuanJuLuoWen_l4']").val(data.list[i].change[0].zuanJuLuoWen_l4);
			$("input[name='zuanJuLuoWen_l5']").val(data.list[i].change[0].zuanJuLuoWen_l5);
			$("input[name='zuanJuLuoWen_l6']").val(data.list[i].change[0].zuanJuLuoWen_l6);
			$("input[name='zuanJuLuoWen_l7']").val(data.list[i].change[0].zuanJuLuoWen_l7);
			$("input[name='zuanJuLuoWen_l8']").val(data.list[i].change[0].zuanJuLuoWen_l8);
			$("input[name='zuanJuLuoWen_l9']").val(data.list[i].change[0].zuanJuLuoWen_l9);
			$("input[name='zuanJuLuoWen_l10']").val(data.list[i].change[0].zuanJuLuoWen_l10);
			$("input[name='zuanJuLuoWen_l11']").val(data.list[i].change[0].zuanJuLuoWen_l11);
			$("input[name='zuanJuLuoWen_l12']").val(data.list[i].change[0].zuanJuLuoWen_l12);
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l1" value="'+data.list[i].change[j].zuanJuLuoWen_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l2" value="'+data.list[i].change[j].zuanJuLuoWen_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l3" value="'+data.list[i].change[j].zuanJuLuoWen_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l4" value="'+data.list[i].change[j].zuanJuLuoWen_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l5" value="'+data.list[i].change[j].zuanJuLuoWen_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l6" value="'+data.list[i].change[j].zuanJuLuoWen_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l7" value="'+data.list[i].change[j].zuanJuLuoWen_l7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l8" value="'+data.list[i].change[j].zuanJuLuoWen_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l9" value="'+data.list[i].change[j].zuanJuLuoWen_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l10" value="'+data.list[i].change[j].zuanJuLuoWen_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l11" value="'+data.list[i].change[j].zuanJuLuoWen_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_l12" value="'+data.list[i].change[j].zuanJuLuoWen_l12+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#zuanJuLuoWen1").before($str);
				}

			$("input[name='zuanJuLuoWen_ll1']").val(data.list[i].change2[0].zuanJuLuoWen_ll1);
		    $("input[name='zuanJuLuoWen_ll2']").val(data.list[i].change2[0].zuanJuLuoWen_ll2);
		    $("input[name='zuanJuLuoWen_ll3']").val(data.list[i].change2[0].zuanJuLuoWen_ll3);
	 	    $("input[name='zuanJuLuoWen_ll4']").val(data.list[i].change2[0].zuanJuLuoWen_ll4);
		    $("input[name='zuanJuLuoWen_ll5']").val(data.list[i].change2[0].zuanJuLuoWen_ll5);
		    $("input[name='zuanJuLuoWen_ll6']").val(data.list[i].change2[0].zuanJuLuoWen_ll6);
		    $("input[name='zuanJuLuoWen_ll7']").val(data.list[i].change2[0].zuanJuLuoWen_ll7);
		    $("input[name='zuanJuLuoWen_ll8']").val(data.list[i].change2[0].zuanJuLuoWen_ll8);
		    $("input[name='zuanJuLuoWen_ll9']").val(data.list[i].change2[0].zuanJuLuoWen_ll9);
		    $("input[name='zuanJuLuoWen_ll10']").val(data.list[i].change2[0].zuanJuLuoWen_ll10);
		    $("input[name='zuanJuLuoWen_ll11']").val(data.list[i].change2[0].zuanJuLuoWen_ll11);
		    $("input[name='zuanJuLuoWen_ll12']").val(data.list[i].change2[0].zuanJuLuoWen_ll12);
				for(var j=1;j<data.list[i].change2[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll1" value="'+data.list[i].change2[j].zuanJuLuoWen_ll1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll2" value="'+data.list[i].change2[j].zuanJuLuoWen_ll2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll3" value="'+data.list[i].change2[j].zuanJuLuoWen_ll3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll4" value="'+data.list[i].change2[j].zuanJuLuoWen_ll4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll5" value="'+data.list[i].change2[j].zuanJuLuoWen_ll5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll6" value="'+data.list[i].change2[j].zuanJuLuoWen_ll6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll7" value="'+data.list[i].change2[j].zuanJuLuoWen_ll7+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll8" value="'+data.list[i].change2[j].zuanJuLuoWen_ll8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll9" value="'+data.list[i].change2[j].zuanJuLuoWen_ll9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll10" value="'+data.list[i].change2[j].zuanJuLuoWen_ll10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll11" value="'+data.list[i].change2[j].zuanJuLuoWen_ll11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="zuanJuLuoWen_ll12" value="'+data.list[i].change2[j].zuanJuLuoWen_ll12+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#zuanJuLuoWen2").before($str);
				}

			}
		

		if(data.list[i].name == "gangBanWaiGuan"){//其他
			$("input[name='gangBanWaiGuan_a1']").val(data.list[i].gangBanWaiGuan_a1);
			$("input[name='gangBanWaiGuan_a2']").val(data.list[i].gangBanWaiGuan_a2);

			$("input[name='gangBanWaiGuan_b1']").val(data.list[i].gangBanWaiGuan_b1);
			$("input[name='gangBanWaiGuan_b2']").val(data.list[i].gangBanWaiGuan_b2);

			$("input[name='gangBanWaiGuan_c1']").val(data.list[i].gangBanWaiGuan_c1);

			$("input[name='gangBanWaiGuan_d1']").val(data.list[i].gangBanWaiGuan_d1);
			$("input[name='gangBanWaiGuan_d2']").val(data.list[i].gangBanWaiGuan_d2);
			$("input[name='gangBanWaiGuan_d3']").val(data.list[i].gangBanWaiGuan_d3);
			$("input[name='gangBanWaiGuan_d4']").val(data.list[i].gangBanWaiGuan_d4);
			$("input[name='gangBanWaiGuan_d5']").val(data.list[i].gangBanWaiGuan_d5);

			$("input[name='gangBanWaiGuan_e1']").val(data.list[i].gangBanWaiGuan_e1);


			$("input[name='gangBanWaiGuan_l1']").val(data.list[i].change[0].gangBanWaiGuan_l1);
			$("input[name='gangBanWaiGuan_l2']").val(data.list[i].change[0].gangBanWaiGuan_l2);
			$("input[name='gangBanWaiGuan_l3']").val(data.list[i].change[0].gangBanWaiGuan_l3);
			$("input[name='gangBanWaiGuan_l4']").val(data.list[i].change[0].gangBanWaiGuan_l4);
			$("input[name='gangBanWaiGuan_l5']").val(data.list[i].change[0].gangBanWaiGuan_l5);
			$("input[name='gangBanWaiGuan_l6']").val(data.list[i].change[0].gangBanWaiGuan_l6);
			$("input[name='gangBanWaiGuan_l7']").val(data.list[i].change[0].gangBanWaiGuan_l7);
			$("input[name='gangBanWaiGuan_l8']").val(data.list[i].change[0].gangBanWaiGuan_l8);
			$("input[name='gangBanWaiGuan_l9']").val(data.list[i].change[0].gangBanWaiGuan_l9);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="gangBanWaiGuan_l1" value="'+data.list[i].change[j].gangBanWaiGuan_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="gangBanWaiGuan_l2" value="'+data.list[i].change[j].gangBanWaiGuan_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="gangBanWaiGuan_l3" value="'+data.list[i].change[j].gangBanWaiGuan_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="gangBanWaiGuan_l4" value="'+data.list[i].change[j].gangBanWaiGuan_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="gangBanWaiGuan_l5" value="'+data.list[i].change[j].gangBanWaiGuan_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="gangBanWaiGuan_l6" value="'+data.list[i].change[j].gangBanWaiGuan_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="gangBanWaiGuan_l7" value="'+data.list[i].change[j].gangBanWaiGuan_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="gangBanWaiGuan_l8" value="'+data.list[i].change[j].gangBanWaiGuan_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="gangBanWaiGuan_l9" value="'+data.list[i].change[j].gangBanWaiGuan_l9+'"/></td>';
				    $str+='</tr>';
				    $("#gangBanWaiGuan").before($str);
				}
			}
		}

		if(data.list[i].name == "fengTouJiHe"){//其他
			$("input[name='fengTouJiHe_a1']").val(data.list[i].fengTouJiHe_a1);
			$("input[name='fengTouJiHe_a2']").val(data.list[i].fengTouJiHe_a2);

			$("input[name='fengTouJiHe_b1']").val(data.list[i].fengTouJiHe_b1);
			$("input[name='fengTouJiHe_b2']").val(data.list[i].fengTouJiHe_b2);

			$("input[name='fengTouJiHe_c1']").val(data.list[i].fengTouJiHe_c1);

			$("input[name='fengTouJiHe_d1'][value='" + data.list[i].fengTouJiHe_d1 + "']").attr("checked",true);

			$("input[name='fengTouJiHe_e1']").val(data.list[i].fengTouJiHe_e1);
			$("input[name='fengTouJiHe_e2']").val(data.list[i].fengTouJiHe_e2);
			$("input[name='fengTouJiHe_e3']").val(data.list[i].fengTouJiHe_e3);
			$("input[name='fengTouJiHe_e4']").val(data.list[i].fengTouJiHe_e4);
			$("input[name='fengTouJiHe_e5']").val(data.list[i].fengTouJiHe_e5);
			$("input[name='fengTouJiHe_e6']").val(data.list[i].fengTouJiHe_e6);

			$("input[name='fengTouJiHe_f1']").val(data.list[i].fengTouJiHe_f1);


			$("input[name='fengTouJiHe_l1']").val(data.list[i].change[0].fengTouJiHe_l1);
			$("input[name='fengTouJiHe_l2']").val(data.list[i].change[0].fengTouJiHe_l2);
			$("input[name='fengTouJiHe_l3']").val(data.list[i].change[0].fengTouJiHe_l3);
			$("input[name='fengTouJiHe_l4']").val(data.list[i].change[0].fengTouJiHe_l4);
			$("input[name='fengTouJiHe_l5']").val(data.list[i].change[0].fengTouJiHe_l5);
			$("input[name='fengTouJiHe_l6']").val(data.list[i].change[0].fengTouJiHe_l6);
			$("input[name='fengTouJiHe_l7']").val(data.list[i].change[0].fengTouJiHe_l7);
			$("input[name='fengTouJiHe_l8']").val(data.list[i].change[0].fengTouJiHe_l8);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fengTouJiHe_l1" value="'+data.list[i].change[j].fengTouJiHe_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fengTouJiHe_l2" value="'+data.list[i].change[j].fengTouJiHe_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fengTouJiHe_l3" value="'+data.list[i].change[j].fengTouJiHe_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fengTouJiHe_l4" value="'+data.list[i].change[j].fengTouJiHe_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fengTouJiHe_l5" value="'+data.list[i].change[j].fengTouJiHe_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fengTouJiHe_l6" value="'+data.list[i].change[j].fengTouJiHe_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fengTouJiHe_l7" value="'+data.list[i].change[j].fengTouJiHe_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="fengTouJiHe_l8" value="'+data.list[i].change[j].fengTouJiHe_l8+'"/></td>';
				    $str+='</tr>';
				    $("#fengTouJiHe").before($str);
				}
			}
		}

		if(data.list[i].name == "yaLiRongQi"){//其他
			$("input[name='yaLiRongQi_a1']").val(data.list[i].yaLiRongQi_a1);
			$("input[name='yaLiRongQi_a2']").val(data.list[i].yaLiRongQi_a2);

			$("input[name='yaLiRongQi_b1']").val(data.list[i].yaLiRongQi_b1);
			$("input[name='yaLiRongQi_b2']").val(data.list[i].yaLiRongQi_b2);

			$("input[name='yaLiRongQi_c1']").val(data.list[i].yaLiRongQi_c1);
			$("input[name='yaLiRongQi_c2']").val(data.list[i].yaLiRongQi_c2);
			$("input[name='yaLiRongQi_c3']").val(data.list[i].yaLiRongQi_c3);


			$("input[name='yaLiRongQi_d1'][value='" + data.list[i].yaLiRongQi_d1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_d2']").val(data.list[i].yaLiRongQi_d2);
			$("input[name='yaLiRongQi_d3']").val(data.list[i].yaLiRongQi_d3);
			$("input[name='yaLiRongQi_d4']").val(data.list[i].yaLiRongQi_d4);

			$("input[name='yaLiRongQi_e1']").val(data.list[i].yaLiRongQi_e1);
			$("input[name='yaLiRongQi_e2']").val(data.list[i].yaLiRongQi_e2);
			$("input[name='yaLiRongQi_e3']").val(data.list[i].yaLiRongQi_e3);

			$("input[name='yaLiRongQi_f1']").val(data.list[i].yaLiRongQi_f1);
			$("input[name='yaLiRongQi_f2']").val(data.list[i].yaLiRongQi_f2);
			$("input[name='yaLiRongQi_f3']").val(data.list[i].yaLiRongQi_f3);

			$("input[name='yaLiRongQi_g1']").val(data.list[i].yaLiRongQi_g1);
			$("input[name='yaLiRongQi_g2']").val(data.list[i].yaLiRongQi_g2);
			$("input[name='yaLiRongQi_g3']").val(data.list[i].yaLiRongQi_g3);

			$("input[name='yaLiRongQi_h1']").val(data.list[i].yaLiRongQi_h1);
			$("input[name='yaLiRongQi_h2']").val(data.list[i].yaLiRongQi_h2);
			$("input[name='yaLiRongQi_h3']").val(data.list[i].yaLiRongQi_h3);

			$("input[name='yaLiRongQi_i1']").val(data.list[i].yaLiRongQi_i1);
			$("input[name='yaLiRongQi_i2']").val(data.list[i].yaLiRongQi_i2);
			$("input[name='yaLiRongQi_i3']").val(data.list[i].yaLiRongQi_i3);

			$("input[name='yaLiRongQi_j1']").val(data.list[i].yaLiRongQi_j1);
			$("input[name='yaLiRongQi_j2']").val(data.list[i].yaLiRongQi_j2);
			$("input[name='yaLiRongQi_j3']").val(data.list[i].yaLiRongQi_j3);

			$("input[name='yaLiRongQi_k1']").val(data.list[i].yaLiRongQi_k1);
			$("input[name='yaLiRongQi_k2']").val(data.list[i].yaLiRongQi_k2);
			$("input[name='yaLiRongQi_k3']").val(data.list[i].yaLiRongQi_k3);

			$("input[name='yaLiRongQi_ff1']").val(data.list[i].yaLiRongQi_ff1);
			$("input[name='yaLiRongQi_ff2']").val(data.list[i].yaLiRongQi_ff2);
			$("input[name='yaLiRongQi_ff3']").val(data.list[i].yaLiRongQi_ff3);

			$("input[name='yaLiRongQi_m1']").val(data.list[i].yaLiRongQi_m1);
			$("input[name='yaLiRongQi_m2']").val(data.list[i].yaLiRongQi_m2);
			$("input[name='yaLiRongQi_m3']").val(data.list[i].yaLiRongQi_m3);

			$("input[name='yaLiRongQi_n1']").val(data.list[i].yaLiRongQi_n1);
			$("input[name='yaLiRongQi_n2']").val(data.list[i].yaLiRongQi_n2);
			$("input[name='yaLiRongQi_n3']").val(data.list[i].yaLiRongQi_n3);

			$("input[name='yaLiRongQi_o1']").val(data.list[i].yaLiRongQi_o1);
			$("input[name='yaLiRongQi_o2']").val(data.list[i].yaLiRongQi_o2);
			$("input[name='yaLiRongQi_o3']").val(data.list[i].yaLiRongQi_o3);

			$("input[name='yaLiRongQi_p1'][value='" + data.list[i].yaLiRongQi_p1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_p2']").val(data.list[i].yaLiRongQi_p2);

			$("input[name='yaLiRongQi_q1'][value='" + data.list[i].yaLiRongQi_q1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_q2']").val(data.list[i].yaLiRongQi_q2);

			$("input[name='yaLiRongQi_r1'][value='" + data.list[i].yaLiRongQi_r1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_r2']").val(data.list[i].yaLiRongQi_r2);

			$("input[name='yaLiRongQi_s1'][value='" + data.list[i].yaLiRongQi_s1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_s2']").val(data.list[i].yaLiRongQi_s2);

			$("input[name='yaLiRongQi_t1'][value='" + data.list[i].yaLiRongQi_t1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_t2']").val(data.list[i].yaLiRongQi_t2);

			$("input[name='yaLiRongQi_u1'][value='" + data.list[i].yaLiRongQi_u1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_u2']").val(data.list[i].yaLiRongQi_u2);

			$("input[name='yaLiRongQi_v1'][value='" + data.list[i].yaLiRongQi_v1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_v2'][value='" + data.list[i].yaLiRongQi_v2 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_v3']").val(data.list[i].yaLiRongQi_v3);

			$("input[name='yaLiRongQi_w1'][value='" + data.list[i].yaLiRongQi_w1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_w2']").val(data.list[i].yaLiRongQi_w2);

			$("input[name='yaLiRongQi_x1'][value='" + data.list[i].yaLiRongQi_x1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_x2']").val(data.list[i].yaLiRongQi_x2);

			$("input[name='yaLiRongQi_y1'][value='" + data.list[i].yaLiRongQi_y1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_y2']").val(data.list[i].yaLiRongQi_y2);

			$("input[name='yaLiRongQi_z1'][value='" + data.list[i].yaLiRongQi_z1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_z2']").val(data.list[i].yaLiRongQi_z2);

			$("input[name='yaLiRongQi_aa1'][value='" + data.list[i].yaLiRongQi_aa1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_aa2']").val(data.list[i].yaLiRongQi_aa2);

			$("input[name='yaLiRongQi_bb1']").val(data.list[i].yaLiRongQi_bb1);
			$("input[name='yaLiRongQi_bb2']").val(data.list[i].yaLiRongQi_bb2);
			$("input[name='yaLiRongQi_bb3']").val(data.list[i].yaLiRongQi_bb3);

			$("input[name='yaLiRongQi_cc1'][value='" + data.list[i].yaLiRongQi_cc1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_cc2']").val(data.list[i].yaLiRongQi_cc2);

			$("input[name='yaLiRongQi_dd1'][value='" + data.list[i].yaLiRongQi_dd1 + "']").attr("checked",true);
			$("input[name='yaLiRongQi_dd2']").val(data.list[i].yaLiRongQi_dd2);

			$("input[name='yaLiRongQi_ee1']").val(data.list[i].yaLiRongQi_ee1);


			$("input[name='yaLiRongQi_l1']").val(data.list[i].change[0].yaLiRongQi_l1);
			$("input[name='yaLiRongQi_l2']").val(data.list[i].change[0].yaLiRongQi_l2);
			$("input[name='yaLiRongQi_l3']").val(data.list[i].change[0].yaLiRongQi_l3);
			$("input[name='yaLiRongQi_l4']").val(data.list[i].change[0].yaLiRongQi_l4);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center" colspan="2"><input class="input_60 easyui-validatebox" type="text" name="yaLiRongQi_l1" value="'+data.list[i].change[j].yaLiRongQi_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yaLiRongQi_l2" value="'+data.list[i].change[j].yaLiRongQi_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yaLiRongQi_l3" value="'+data.list[i].change[j].yaLiRongQi_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="yaLiRongQi_l4" value="'+data.list[i].change[j].yaLiRongQi_l4+'"/></td>';
				    $str+='</tr>';
				    $("#yaLiRongQi").before($str);
				}
			}
		}

		if(data.list[i].name == "lengWanGuan"){//其他
			$("input[name='lengWanGuan_a1']").val(data.list[i].lengWanGuan_a1);
			$("input[name='lengWanGuan_a2']").val(data.list[i].lengWanGuan_a2);

			$("input[name='lengWanGuan_b1']").val(data.list[i].lengWanGuan_b1);
			$("input[name='lengWanGuan_b2']").val(data.list[i].lengWanGuan_b2);
			$("input[name='lengWanGuan_b3']").val(data.list[i].lengWanGuan_b3);
			$("input[name='lengWanGuan_b4']").val(data.list[i].lengWanGuan_b4);
			$("input[name='lengWanGuan_b5']").val(data.list[i].lengWanGuan_b5);
			$("input[name='lengWanGuan_b6']").val(data.list[i].lengWanGuan_b6);
			$("input[name='lengWanGuan_b7']").val(data.list[i].lengWanGuan_b7);
			$("input[name='lengWanGuan_b8']").val(data.list[i].lengWanGuan_b8);
			$("input[name='lengWanGuan_b9']").val(data.list[i].lengWanGuan_b9);
			$("input[name='lengWanGuan_b10']").val(data.list[i].lengWanGuan_b10);
			$("input[name='lengWanGuan_b11']").val(data.list[i].lengWanGuan_b11);
			$("input[name='lengWanGuan_b12']").val(data.list[i].lengWanGuan_b12);
			$("input[name='lengWanGuan_b13']").val(data.list[i].lengWanGuan_b13);
			$("input[name='lengWanGuan_b14']").val(data.list[i].lengWanGuan_b14);
			$("input[name='lengWanGuan_b15']").val(data.list[i].lengWanGuan_b15);

			$("input[name='lengWanGuan_c1']").val(data.list[i].lengWanGuan_c1);


			$("input[name='lengWanGuan_l1']").val(data.list[i].change[0].lengWanGuan_l1);
			$("input[name='lengWanGuan_l2']").val(data.list[i].change[0].lengWanGuan_l2);
			$("input[name='lengWanGuan_l3']").val(data.list[i].change[0].lengWanGuan_l3);
			$("input[name='lengWanGuan_l4']").val(data.list[i].change[0].lengWanGuan_l4);
			$("input[name='lengWanGuan_l5']").val(data.list[i].change[0].lengWanGuan_l5);
			$("input[name='lengWanGuan_l6']").val(data.list[i].change[0].lengWanGuan_l6);
			$("input[name='lengWanGuan_l7']").val(data.list[i].change[0].lengWanGuan_l7);
			$("input[name='lengWanGuan_l8']").val(data.list[i].change[0].lengWanGuan_l8);
			$("input[name='lengWanGuan_l9']").val(data.list[i].change[0].lengWanGuan_l9);
			$("input[name='lengWanGuan_l10']").val(data.list[i].change[0].lengWanGuan_l10);
			$("input[name='lengWanGuan_l11']").val(data.list[i].change[0].lengWanGuan_l11);
			$("input[name='lengWanGuan_l12']").val(data.list[i].change[0].lengWanGuan_l12);
			$("input[name='lengWanGuan_l13']").val(data.list[i].change[0].lengWanGuan_l13);
			$("input[name='lengWanGuan_l14']").val(data.list[i].change[0].lengWanGuan_l14);
			$("input[name='lengWanGuan_l15']").val(data.list[i].change[0].lengWanGuan_l15);
			$("input[name='lengWanGuan_l16']").val(data.list[i].change[0].lengWanGuan_l16);
			$("input[name='lengWanGuan_l17']").val(data.list[i].change[0].lengWanGuan_l17);
			$("input[name='lengWanGuan_l18']").val(data.list[i].change[0].lengWanGuan_l18);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l1" value="'+data.list[i].change[j].lengWanGuan_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l2" value="'+data.list[i].change[j].lengWanGuan_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l3" value="'+data.list[i].change[j].lengWanGuan_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l4" value="'+data.list[i].change[j].lengWanGuan_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l5" value="'+data.list[i].change[j].lengWanGuan_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l6" value="'+data.list[i].change[j].lengWanGuan_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l7" value="'+data.list[i].change[j].lengWanGuan_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l8" value="'+data.list[i].change[j].lengWanGuan_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l9" value="'+data.list[i].change[j].lengWanGuan_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l10" value="'+data.list[i].change[j].lengWanGuan_l10+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l11" value="'+data.list[i].change[j].lengWanGuan_l11+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l12" value="'+data.list[i].change[j].lengWanGuan_l12+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l13" value="'+data.list[i].change[j].lengWanGuan_l13+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l14" value="'+data.list[i].change[j].lengWanGuan_l14+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l15" value="'+data.list[i].change[j].lengWanGuan_l15+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l16" value="'+data.list[i].change[j].lengWanGuan_l16+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l17" value="'+data.list[i].change[j].lengWanGuan_l17+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="lengWanGuan_l18" value="'+data.list[i].change[j].lengWanGuan_l18+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#lengWanGuan").before($str);
				}
			}
		}

		if(data.list[i].name == "baZiMangBan"){//其他
			$("input[name='baZiMangBan_a1']").val(data.list[i].baZiMangBan_a1);
			$("input[name='baZiMangBan_a2']").val(data.list[i].baZiMangBan_a2);

			$("input[name='baZiMangBan_b1']").val(data.list[i].baZiMangBan_b1);
			$("input[name='baZiMangBan_b2']").val(data.list[i].baZiMangBan_b2);

			$("input[name='baZiMangBan_c1']").val(data.list[i].baZiMangBan_c1);
			$("input[name='baZiMangBan_c2']").val(data.list[i].baZiMangBan_c2);

			$("input[name='baZiMangBan_d1']").val(data.list[i].baZiMangBan_d1);
			$("input[name='baZiMangBan_d2']").val(data.list[i].baZiMangBan_d2);
			$("input[name='baZiMangBan_d3']").val(data.list[i].baZiMangBan_d3);
			$("input[name='baZiMangBan_d4']").val(data.list[i].baZiMangBan_d4);
			$("input[name='baZiMangBan_d5']").val(data.list[i].baZiMangBan_d5);
			$("input[name='baZiMangBan_d6']").val(data.list[i].baZiMangBan_d6);
			$("input[name='baZiMangBan_d7']").val(data.list[i].baZiMangBan_d7);

			$("input[name='baZiMangBan_e1']").val(data.list[i].baZiMangBan_e1);


			$("input[name='baZiMangBan_l1']").val(data.list[i].change[0].baZiMangBan_l1);
			$("input[name='baZiMangBan_l2']").val(data.list[i].change[0].baZiMangBan_l2);
			$("input[name='baZiMangBan_l3']").val(data.list[i].change[0].baZiMangBan_l3);
			$("input[name='baZiMangBan_l4']").val(data.list[i].change[0].baZiMangBan_l4);
			$("input[name='baZiMangBan_l5']").val(data.list[i].change[0].baZiMangBan_l5);
			$("input[name='baZiMangBan_l6']").val(data.list[i].change[0].baZiMangBan_l6);
			$("input[name='baZiMangBan_l7']").val(data.list[i].change[0].baZiMangBan_l7);
			$("input[name='baZiMangBan_l8']").val(data.list[i].change[0].baZiMangBan_l8);
			$("input[name='baZiMangBan_l9']").val(data.list[i].change[0].baZiMangBan_l9);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="baZiMangBan_l1" value="'+data.list[i].change[j].baZiMangBan_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="baZiMangBan_l2" value="'+data.list[i].change[j].baZiMangBan_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="baZiMangBan_l3" value="'+data.list[i].change[j].baZiMangBan_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="baZiMangBan_l4" value="'+data.list[i].change[j].baZiMangBan_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="baZiMangBan_l5" value="'+data.list[i].change[j].baZiMangBan_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="baZiMangBan_l6" value="'+data.list[i].change[j].baZiMangBan_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="baZiMangBan_l7" value="'+data.list[i].change[j].baZiMangBan_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="baZiMangBan_l8" value="'+data.list[i].change[j].baZiMangBan_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="baZiMangBan_l9" value="'+data.list[i].change[j].baZiMangBan_l9+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#baZiMangBan").before($str);
				}
			}
		}

		if(data.list[i].name == "faLanGai"){//其他
			$("input[name='faLanGai_a1']").val(data.list[i].faLanGai_a1);
			$("input[name='faLanGai_a2']").val(data.list[i].faLanGai_a2);
			$("input[name='faLanGai_a3']").val(data.list[i].faLanGai_a3);

			$("input[name='faLanGai_b1']").val(data.list[i].faLanGai_b1);
			$("input[name='faLanGai_b2']").val(data.list[i].faLanGai_b2);
			$("input[name='faLanGai_b3']").val(data.list[i].faLanGai_b3);

			$("input[name='faLanGai_c1']").val(data.list[i].faLanGai_c1);
			$("input[name='faLanGai_c2']").val(data.list[i].faLanGai_c2);
			$("input[name='faLanGai_c3']").val(data.list[i].faLanGai_c3);
			$("input[name='faLanGai_c4']").val(data.list[i].faLanGai_c4);
			$("input[name='faLanGai_c5']").val(data.list[i].faLanGai_c5);
			$("input[name='faLanGai_c6']").val(data.list[i].faLanGai_c6);
			$("input[name='faLanGai_c7']").val(data.list[i].faLanGai_c7);
			$("input[name='faLanGai_c8']").val(data.list[i].faLanGai_c8);
			$("input[name='faLanGai_c9']").val(data.list[i].faLanGai_c9);

			$("input[name='faLanGai_d1']").val(data.list[i].faLanGai_d1);
		

			$("input[name='faLanGai_l1']").val(data.list[i].change[0].faLanGai_l1);
			$("input[name='faLanGai_l2']").val(data.list[i].change[0].faLanGai_l2);
			$("input[name='faLanGai_l3']").val(data.list[i].change[0].faLanGai_l3);
			$("input[name='faLanGai_l4']").val(data.list[i].change[0].faLanGai_l4);
			$("input[name='faLanGai_l5']").val(data.list[i].change[0].faLanGai_l5);
			$("input[name='faLanGai_l6']").val(data.list[i].change[0].faLanGai_l6);
			$("input[name='faLanGai_l7']").val(data.list[i].change[0].faLanGai_l7);
			$("input[name='faLanGai_l8']").val(data.list[i].change[0].faLanGai_l8);
			$("input[name='faLanGai_l9']").val(data.list[i].change[0].faLanGai_l9);
			$("input[name='faLanGai_l10']").val(data.list[i].change[0].faLanGai_l10);
			$("input[name='faLanGai_l11']").val(data.list[i].change[0].faLanGai_l11);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanGai_l1" value="'+data.list[i].change[j].faLanGai_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanGai_l2" value="'+data.list[i].change[j].faLanGai_l2+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanGai_l3" value="'+data.list[i].change[j].faLanGai_l3+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanGai_l4" value="'+data.list[i].change[j].faLanGai_l4+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanGai_l5" value="'+data.list[i].change[j].faLanGai_l5+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanGai_l6" value="'+data.list[i].change[j].faLanGai_l6+'"/></td>';
			        $str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanGai_l7" value="'+data.list[i].change[j].faLanGai_l7+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanGai_l8" value="'+data.list[i].change[j].faLanGai_l8+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanGai_l9" value="'+data.list[i].change[j].faLanGai_l9+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanGai_l10" value="'+data.list[i].change[j].faLanGai_l10+'"/></td>';
					$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faLanGai_l11" value="'+data.list[i].change[j].faLanGai_l11+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#faLanGai").before($str);
				}
			}
		}
	}
}

		

	
