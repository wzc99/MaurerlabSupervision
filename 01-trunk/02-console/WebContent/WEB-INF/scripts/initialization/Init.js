function init_all(data){
	for(var i=0;i<data.length;i++){
		if(data.list[i].name == "oilPipeQiTa"){//其他
			$("input[name='oilPipeQiTa_a1']").val(data.list[i].oilPipeQiTa_a1);
			$("input[name='oilPipeQiTa_a2']").val(data.list[i].oilPipeQiTa_a2);
			$("input[name='oilPipeQiTa_b1']").val(data.list[i].oilPipeQiTa_b1);
			$("input[name='oilPipeQiTa_b2']").val(data.list[i].oilPipeQiTa_b2);
			$("input[name='oilPipeQiTa_b3']").val(data.list[i].oilPipeQiTa_b3);
			$("input[name='oilPipeQiTa_c1']").val(data.list[i].oilPipeQiTa_c1);
			$("input[name='oilPipeQiTa_c2']").val(data.list[i].oilPipeQiTa_c2);
			$("input[name='oilPipeQiTa_c3']").val(data.list[i].oilPipeQiTa_c3);
			$("input[name='oilPipeQiTa_c4']").val(data.list[i].oilPipeQiTa_c4);
			$("input[name='oilPipeQiTa_d1']").val(data.list[i].oilPipeQiTa_d1);
			$("input[name='oilPipeQiTa_f1']").val(data.list[i].oilPipeQiTa_f1);
			$("input[name='oilPipeQiTa_l1']").val(data.list[i].change[0].oilPipeQiTa_l1);
			$("input[name='oilPipeQiTa_l2']").val(data.list[i].change[0].oilPipeQiTa_l2);
			$("input[name='oilPipeQiTa_l3']").val(data.list[i].change[0].oilPipeQiTa_l3);
			$("input[name='oilPipeQiTa_l4']").val(data.list[i].change[0].oilPipeQiTa_l4);
			$("input[name='oilPipeQiTa_l5']").val(data.list[i].change[0].oilPipeQiTa_l5);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="oilPipeQiTa_l1" value="'+data.list[i].change[j].oilPipeQiTa_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="oilPipeQiTa_l2" value="'+data.list[i].change[j].oilPipeQiTa_l2+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="oilPipeQiTa_l3" value="'+data.list[i].change[j].oilPipeQiTa_l3+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="oilPipeQiTa_l4" value="'+data.list[i].change[j].oilPipeQiTa_l4+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="oilPipeQiTa_l5" value="'+data.list[i].change[j].oilPipeQiTa_l5+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#oilPipeQiTa").before($str);
				}
			}
		}

		if(data.list[i].name == "oilPipeTouLiao"){	
			$("input[name='oilPipeTouLiao_a1']").val(data.list[i].oilPipeTouLiao_a1);

			$("input[name='oilPipeTouLiao_l1']").val(data.list[i].change[0].oilPipeTouLiao_l1);
			$("input[name='oilPipeTouLiao_l2']").val(data.list[i].change[0].oilPipeTouLiao_l2);
			$("input[name='oilPipeTouLiao_l3']").val(data.list[i].change[0].oilPipeTouLiao_l3);
			$("input[name='oilPipeTouLiao_l4']").val(data.list[i].change[0].oilPipeTouLiao_l4);
			$("input[name='oilPipeTouLiao_l5']").val(data.list[i].change[0].oilPipeTouLiao_l5);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTouLiao_l1" value="'+data.list[i].change[j].oilPipeTouLiao_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTouLiao_l2" value="'+data.list[i].change[j].oilPipeTouLiao_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTouLiao_l3" value="'+data.list[i].change[j].oilPipeTouLiao_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTouLiao_l4" value="'+data.list[i].change[j].oilPipeTouLiao_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTouLiao_l5" value="'+data.list[i].change[j].oilPipeTouLiao_l5+'"/></td>';
					$str+='<td align="center"><a </td>';
			    $str+='</tr>';
			    $("#oilPipe_touLiao").before($str);
				}
			}
		}
		//石油专用管  成型焊接
		if(data.list[i].name == "oilPipeChengXing"){
			$("input[name='oilPipeChengXing_a1'][value='" + data.list[i].oilPipeChengXing_a1 + "']").attr("checked",true);
			$("input[name='oilPipeChengXing_a2'][value='" + data.list[i].oilPipeChengXing_a2 + "']").attr("checked",true);
			$("input[name='oilPipeChengXing_a3'][value='" + data.list[i].oilPipeChengXing_a3 + "']").attr("checked",true);
			$("input[name='oilPipeChengXing_a4'][value='" + data.list[i].oilPipeChengXing_a4 + "']").attr("checked",true);
			$("input[name='oilPipeChengXing_l1']").val(data.list[i].change[0].oilPipeChengXing_l1);
			$("input[name='oilPipeChengXing_l2']").val(data.list[i].change[0].oilPipeChengXing_l2);
			$("input[name='oilPipeChengXing_l3']").val(data.list[i].change[0].oilPipeChengXing_l3);
			$("input[name='oilPipeChengXing_l4']").val(data.list[i].change[0].oilPipeChengXing_l4);
			$("input[name='oilPipeChengXing_l5']").val(data.list[i].change[0].oilPipeChengXing_l5);
			$("input[name='oilPipeChengXing_l6']").val(data.list[i].change[0].oilPipeChengXing_l6);
			$("input[name='oilPipeChengXing_b1']").val(data.list[i].oilPipeChengXing_b1);
			$("input[name='oilPipeChengXing_b2']").val(data.list[i].oilPipeChengXing_b2);
			$("input[name='oilPipeChengXing_b3']").val(data.list[i].oilPipeChengXing_b3);
			$("input[name='oilPipeChengXing_b4']").val(data.list[i].oilPipeChengXing_b4);
			$("input[name='oilPipeChengXing_b5']").val(data.list[i].oilPipeChengXing_b5);
			$("input[name='oilPipeChengXing_a6'][value='" + data.list[i].oilPipeChengXing_a6 + "']").attr("checked",true);
			$("input[name='oilPipeChengXing_a7'][value='" + data.list[i].oilPipeChengXing_a7 + "']").attr("checked",true);
			$("input[name='oilPipeChengXing_c1']").val(data.list[i].oilPipeChengXing_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l1" value="'+data.list[i].change[j].oilPipeChengXing_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l2" value="'+data.list[i].change[j].oilPipeChengXing_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l3" value="'+data.list[i].change[j].oilPipeChengXing_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l4" value="'+data.list[i].change[j].oilPipeChengXing_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l5" value="'+data.list[i].change[j].oilPipeChengXing_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l6" value="'+data.list[i].change[j].oilPipeChengXing_l6+'"/></td>';
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#oilPipe_chengXing").before($str);
				}
			}
		}

		if(data.list[i].name == "oilPipeReZha"){//石油专用管   热轧、外购管坯
			$("input[name='oilPipeReZha_l1']").val(data.list[i].change[0].oilPipeReZha_l1);
			$("input[name='oilPipeReZha_l2']").val(data.list[i].change[0].oilPipeReZha_l2);
			$("input[name='oilPipeReZha_l3']").val(data.list[i].change[0].oilPipeReZha_l3);
			$("input[name='oilPipeReZha_l4']").val(data.list[i].change[0].oilPipeReZha_l4);
			$("input[name='oilPipeReZha_l5']").val(data.list[i].change[0].oilPipeReZha_l5);
			$("input[name='oilPipeReZha_a1']").val(data.list[i].oilPipeReZha_a1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReZha_l1"  value="'+data.list[i].change[j].oilPipeReZha_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReZha_l2"  value="'+data.list[i].change[j].oilPipeReZha_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReZha_l3"  value="'+data.list[i].change[j].oilPipeReZha_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReZha_l4"  value="'+data.list[i].change[j].oilPipeReZha_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReZha_l5"  value="'+data.list[i].change[j].oilPipeReZha_l5+'"/></td>';
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#oilPipe_reZha").before($str);
				}
			}
		}

			if(data.list[i].name == "oilPipeGuanDuan"){	
				$("input[name='oilPipeGuanDuan_a1']").val(data.list[i].oilPipeGuanDuan_a1);
				$("input[name='oilPipeGuanDuan_l1']").val(data.list[i].change[0].oilPipeGuanDuan_l1);
				$("input[name='oilPipeGuanDuan_l2']").val(data.list[i].change[0].oilPipeGuanDuan_l2);
				$("input[name='oilPipeGuanDuan_l3']").val(data.list[i].change[0].oilPipeGuanDuan_l3);
				$("input[name='oilPipeGuanDuan_l4']").val(data.list[i].change[0].oilPipeGuanDuan_l4);
				$("input[name='oilPipeGuanDuan_l5']").val(data.list[i].change[0].oilPipeGuanDuan_l5);

				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeGuanDuan_l1" value="'+data.list[i].change[j].oilPipeGuanDuan_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeGuanDuan_l2" value="'+data.list[i].change[j].oilPipeGuanDuan_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeGuanDuan_l3" value="'+data.list[i].change[j].oilPipeGuanDuan_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeGuanDuan_l4" value="'+data.list[i].change[j].oilPipeGuanDuan_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeGuanDuan_l5" value="'+data.list[i].change[j].oilPipeGuanDuan_l5+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#oilPipe_guanDuan").before($str);
					}
				}
			}
			
			if(data.list[i].name == "oilPipeReChuLi"){//石油专用管 
				$("input[name='oilPipeReChuLi_a1'][value='"+data.list[i].oilPipeReChuLi_a1+"']").attr("checked",true);
				$("input[name='oilPipeReChuLi_a2'][value='"+data.list[i].oilPipeReChuLi_a2+"']").attr("checked",true);
				$("input[name='oilPipeReChuLi_a3'][value='"+data.list[i].oilPipeReChuLi_a3+"']").attr("checked",true);
				$("input[name='oilPipeReChuLi_a4'][value='"+data.list[i].oilPipeReChuLi_a4+"']").attr("checked",true);
				$("input[name='oilPipeReChuLi_l1']").val(data.list[i].change[0].oilPipeReChuLi_l1);
				$("input[name='oilPipeReChuLi_l2']").val(data.list[i].change[0].oilPipeReChuLi_l2);
				$("input[name='oilPipeReChuLi_l3']").val(data.list[i].change[0].oilPipeReChuLi_l3);
				$("input[name='oilPipeReChuLi_l4']").val(data.list[i].change[0].oilPipeReChuLi_l4);
				$("input[name='oilPipeReChuLi_l5']").val(data.list[i].change[0].oilPipeReChuLi_l5);
				$("input[name='oilPipeReChuLi_b1']").val(data.list[i].oilPipeReChuLi_b1);
				$("input[name='oilPipeReChuLi_b2']").val(data.list[i].oilPipeReChuLi_b2);
				$("input[name='oilPipeReChuLi_b3']").val(data.list[i].oilPipeReChuLi_b3);
				$("input[name='oilPipeReChuLi_b4']").val(data.list[i].oilPipeReChuLi_b4);
				$("input[name='oilPipeReChuLi_b5']").val(data.list[i].oilPipeReChuLi_b5);
				$("input[name='oilPipeReChuLi_b6'][value='"+data.list[i].oilPipeReChuLi_b6+"']").attr("checked",true);
				$("input[name='oilPipeReChuLi_c1']").val(data.list[i].oilPipeReChuLi_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReChuLi_l1"  value="'+data.list[i].change[j].oilPipeReChuLi_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReChuLi_l2"  value="'+data.list[i].change[j].oilPipeReChuLi_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReChuLi_l3"  value="'+data.list[i].change[j].oilPipeReChuLi_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReChuLi_l4"  value="'+data.list[i].change[j].oilPipeReChuLi_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReChuLi_l5"  value="'+data.list[i].change[j].oilPipeReChuLi_l5+'"/></td>';
						$str+='<td align="center">/td>';
				    $str+='</tr>';
				    $("#oilPipe_reChuLi").before($str);
					}
				}
			}

			if(data.list[i].name == "oilPipeChaoShengBo"){	//输送管  超声波检测（连探、手探）
				$("input[name='oilPipeChaoShengBo_b1']").val(data.list[i].oilPipeChaoShengBo_b1);
				$("input[name='oilPipeChaoShengBo_a1'][value='"+data.list[i].oilPipeChaoShengBo_a1+"']").attr("checked",true); 
				$("input[name='oilPipeChaoShengBo_a2'][value='"+data.list[i].oilPipeChaoShengBo_a2+"']").attr("checked",true);
				$("input[name='oilPipeChaoShengBo_a3'][value='"+data.list[i].oilPipeChaoShengBo_a3+"']").attr("checked",true); 
				$("input[name='oilPipeChaoShengBo_a4'][value='"+data.list[i].oilPipeChaoShengBo_a4+"']").attr("checked",true);
				$("input[name='oilPipeChaoShengBo_a5'][value='"+data.list[i].oilPipeChaoShengBo_a5+"']").attr("checked",true);
				$("input[name='oilPipeChaoShengBo_l1']").val(data.list[i].change[0].oilPipeChaoShengBo_l1);
				$("select[name='oilPipeChaoShengBo_l2']").val(data.list[i].change[0].oilPipeChaoShengBo_l2);
				$("input[name='oilPipeChaoShengBo_l3']").val(data.list[i].change[0].oilPipeChaoShengBo_l3);
				$("input[name='oilPipeChaoShengBo_l4']").val(data.list[i].change[0].oilPipeChaoShengBo_l4);
				$("input[name='oilPipeChaoShengBo_l5']").val(data.list[i].change[0].oilPipeChaoShengBo_l5);
				$("input[name='oilPipeChaoShengBo_l6']").val(data.list[i].change[0].oilPipeChaoShengBo_l6);
				$("input[name='oilPipeChaoShengBo_ll1']").val(data.list[i].change2[0].oilPipeChaoShengBo_ll1);
				$("input[name='oilPipeChaoShengBo_ll2']").val(data.list[i].change2[0].oilPipeChaoShengBo_ll2);
				$("input[name='oilPipeChaoShengBo_ll3']").val(data.list[i].change2[0].oilPipeChaoShengBo_ll3);
				$("select[name='oilPipeChaoShengBo_ll4']").val(data.list[i].change2[0].oilPipeChaoShengBo_ll4);
				$("select[name='oilPipeChaoShengBo_ll5']").val(data.list[i].change2[0].oilPipeChaoShengBo_ll5);
				$("input[name='oilPipeChaoShengBo_ll6']").val(data.list[i].change2[0].oilPipeChaoShengBo_ll6);
				$("input[name='oilPipeChaoShengBo_ll7']").val(data.list[i].change2[0].oilPipeChaoShengBo_ll7);
				$("input[name='oilPipeChaoShengBo_ll8']").val(data.list[i].change2[0].oilPipeChaoShengBo_ll8);
		
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_l1" value="'+data.list[i].change[j].oilPipeChaoShengBo_l1+'"/></td>';
						if (data.list[i].change[j].oilPipeChaoShengBo_l3 == "连探") {
							$str+='<td align="center"><select name="oilPipeChaoShengBo_l2"><option value="连探" selected>连探</option><option value="手探">手探</option></select></td>';
						}else{
							$str+='<td align="center"><select name="oilPipeChaoShengBo_l2"><option value="连探">连探</option><option value="手探" selected>手探</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_l3" value="'+data.list[i].change[j].oilPipeChaoShengBo_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_l4" value="'+data.list[i].change[j].oilPipeChaoShengBo_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_l5" value="'+data.list[i].change[j].oilPipeChaoShengBo_l5+'"/></td>';
						$str+='<td align="center" colspan="3"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_l6" value="'+data.list[i].change[j].oilPipeChaoShengBo_l6+'"/></td>';
						$str+='<td align="center" ></td>';
				    $str+='</tr>';
				    $("#oilPipe_chaoShengBo1").before($str);
					}
				}
				if(data.list[i].change2[0].length>1){
					for(var j=1;j<data.list[i].change2[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll1" value="'+data.list[i].change2[j].oilPipeChaoShengBo_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll2" value="'+data.list[i].change2[j].oilPipeChaoShengBo_ll2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll3" value="'+data.list[i].change2[j].oilPipeChaoShengBo_ll3+'"/></td>';
						if (data.list[i].change2[j].oilPipeChaoShengBo_ll4 == "符合") {
							$str+='<td align="center"><select name="oilPipeChaoShengBo_ll4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="oilPipeChaoShengBo_ll4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if (data.list[i].change2[j].oilPipeChaoShengBo_ll5 == "符合") {
							$str+='<td align="center"><select name="oilPipeChaoShengBo_ll5"><option value="符合"selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="oilPipeChaoShengBo_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll6" value="'+data.list[i].change2[j].oilPipeChaoShengBo_ll6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll7" value="'+data.list[i].change2[j].oilPipeChaoShengBo_ll7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll8" value="'+data.list[i].change2[j].oilPipeChaoShengBo_ll8+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#oilPipe_chaoShengBo2").before($str);
					}
				}
			}
			if(data.list[i].name == "oilPipeCiFenJianCe"){//阀门 磁粉检测
				$("input[name='oilPipeCiFenJianCe_a1'][value='"+data.list[i].oilPipeCiFenJianCe_a1+"']").attr("checked",true); 
				$("input[name='oilPipeCiFenJianCe_a2'][value='"+data.list[i].oilPipeCiFenJianCe_a2+"']").attr("checked",true);
				$("input[name='oilPipeCiFenJianCe_a3'][value='"+data.list[i].oilPipeCiFenJianCe_a3+"']").attr("checked",true);
				$("input[name='oilPipeCiFenJianCe_a4'][value='"+data.list[i].oilPipeCiFenJianCe_a4+"']").attr("checked",true);
				$("input[name='oilPipeCiFenJianCe_b1'][value='"+data.list[i].oilPipeCiFenJianCe_b1+"']").attr("checked",true);
				
				$("input[name='oilPipeCiFenJianCe_l1']").val(data.list[i].change[0].oilPipeCiFenJianCe_l1);
				$("input[name='oilPipeCiFenJianCe_l2']").val(data.list[i].change[0].oilPipeCiFenJianCe_l2);
				$("input[name='oilPipeCiFenJianCe_l3']").val(data.list[i].change[0].oilPipeCiFenJianCe_l3);
				$("input[name='oilPipeCiFenJianCe_l4']").val(data.list[i].change[0].oilPipeCiFenJianCe_l4);
				$("input[name='oilPipeCiFenJianCe_l5']").val(data.list[i].change[0].oilPipeCiFenJianCe_l5);
				
				$("input[name='oilPipeCiFenJianCe_ll1']").val(data.list[i].change2[0].oilPipeCiFenJianCe_ll1);
				$("input[name='oilPipeCiFenJianCe_ll2']").val(data.list[i].change2[0].oilPipeCiFenJianCe_ll2);
				$("input[name='oilPipeCiFenJianCe_ll3']").val(data.list[i].change2[0].oilPipeCiFenJianCe_ll3);
				$("input[name='oilPipeCiFenJianCe_ll4']").val(data.list[i].change2[0].oilPipeCiFenJianCe_ll4);
				$("input[name='oilPipeCiFenJianCe_ll5']").val(data.list[i].change2[0].oilPipeCiFenJianCe_ll5);
				$("select[name='oilPipeCiFenJianCe_ll6']").val(data.list[i].change2[0].oilPipeCiFenJianCe_ll6);
				$("input[name='oilPipeCiFenJianCe_ll7']").val(data.list[i].change2[0].oilPipeCiFenJianCe_ll7);
				$("input[name='oilPipeCiFenJianCe_c1']").val(data.list[i].oilPipeCiFenJianCe_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						 $str='';
					        $str+='<tr>';
					        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_l1" value="'+data.list[i].change[j].oilPipeCiFenJianCe_l1+'"/></td>';
					        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_l2" value="'+data.list[i].change[j].oilPipeCiFenJianCe_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_l3" value="'+data.list[i].change[j].oilPipeCiFenJianCe_l3+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_l4" value="'+data.list[i].change[j].oilPipeCiFenJianCe_l4+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_l5" value="'+data.list[i].change[j].oilPipeCiFenJianCe_l5+'"/></td>';
						    $str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#oilPipeCiFenJianCe1").before($str);
					}
				}
				if(data.list[i].change2[0].length>1){
					for(var j=1;j<data.list[i].change2[0].length;j++){
						 $str='';
					        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll1" value="'+data.list[i].change2[j].oilPipeCiFenJianCe_ll1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll2" value="'+data.list[i].change2[j].oilPipeCiFenJianCe_ll5+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll3" value="'+data.list[i].change2[j].oilPipeCiFenJianCe_ll3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll4" value="'+data.list[i].change2[j].oilPipeCiFenJianCe_ll4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll5" value="'+data.list[i].change2[j].oilPipeCiFenJianCe_ll5+'"/></td>';
							
							if(data.list[i].change2[j].oilPipeCiFenJianCe_ll6=="符合"){
								$str+='<td align="center"><select name="oilPipeCiFenJianCe_ll6" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="oilPipeCiFenJianCe_ll6" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll7" value="'+data.list[i].change2[j].oilPipeCiFenJianCe_ll7+'"/></td>';
							$str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#oilPipeCiFenJianCe2").before($str);
					}
				}
			}
			if(data.list[i].name == "oilPipeShenTouJianCe"){//阀门 渗透检测
				$("input[name='oilPipeShenTouJianCe_a1'][value='"+data.list[i].oilPipeShenTouJianCe_a1+"']").attr("checked",true); 
				$("input[name='oilPipeShenTouJianCe_a2'][value='"+data.list[i].oilPipeShenTouJianCe_a2+"']").attr("checked",true);
				$("input[name='oilPipeShenTouJianCe_a3'][value='"+data.list[i].oilPipeShenTouJianCe_a3+"']").attr("checked",true);
				$("input[name='oilPipeShenTouJianCe_b1'][value='"+data.list[i].oilPipeShenTouJianCe_b1+"']").attr("checked",true);
				
				$("input[name='oilPipeShenTouJianCe_l1']").val(data.list[i].change[0].oilPipeShenTouJianCe_l1);
				$("input[name='oilPipeShenTouJianCe_l2']").val(data.list[i].change[0].oilPipeShenTouJianCe_l2);
				$("input[name='oilPipeShenTouJianCe_l3']").val(data.list[i].change[0].oilPipeShenTouJianCe_l3);
				$("input[name='oilPipeShenTouJianCe_l4']").val(data.list[i].change[0].oilPipeShenTouJianCe_l4);
				
				$("input[name='oilPipeShenTouJianCe_ll1']").val(data.list[i].change2[0].oilPipeShenTouJianCe_ll1);
				$("input[name='oilPipeShenTouJianCe_ll2']").val(data.list[i].change2[0].oilPipeShenTouJianCe_ll2);
				$("input[name='oilPipeShenTouJianCe_ll3']").val(data.list[i].change2[0].oilPipeShenTouJianCe_ll3);
				$("input[name='oilPipeShenTouJianCe_ll4']").val(data.list[i].change2[0].oilPipeShenTouJianCe_ll4);
				$("select[name='oilPipeShenTouJianCe_ll5']").val(data.list[i].change2[0].oilPipeShenTouJianCe_ll5);
				$("input[name='oilPipeShenTouJianCe_ll6']").val(data.list[i].change2[0].oilPipeShenTouJianCe_ll6);
				$("input[name='oilPipeShenTouJianCe_ll7']").val(data.list[i].change2[0].oilPipeShenTouJianCe_ll7);
				$("input[name='oilPipeShenTouJianCe_c1']").val(data.list[i].oilPipeShenTouJianCe_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						  $str='';
					        $str+='<tr>';
					        $str+='<td align="center" colspan="1"><input class="input_140 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_l1" value="'+data.list[i].change[j].oilPipeShenTouJianCe_l1+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_l2" value="'+data.list[i].change[j].oilPipeShenTouJianCe_l2+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_l3" value="'+data.list[i].change[j].oilPipeShenTouJianCe_l3+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_l4" value="'+data.list[i].change[j].oilPipeShenTouJianCe_l4+'"/></td>';
						    $str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#oilPipeShenTouJianCe1").before($str);
					}
				}
				if(data.list[i].change2[0].length>1){
					for(var j=1;j<data.list[i].change2[0].length;j++){
						 $str='';
					        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll1" value="'+data.list[i].change2[j].oilPipeShenTouJianCe_ll1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll2" value="'+data.list[i].change2[j].oilPipeShenTouJianCe_ll2+'" /></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll3" value="'+data.list[i].change2[j].oilPipeShenTouJianCe_ll3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll4" value="'+data.list[i].change2[j].oilPipeShenTouJianCe_ll4+'"/></td>';
							if(data.list[i].change2[j].oilPipeShenTouJianCe_ll5=="符合"){
								$str+='<td align="center"><select name="oilPipeShenTouJianCe_ll5" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="oilPipeShenTouJianCe_ll5" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll6" value="'+data.list[i].change2[j].oilPipeShenTouJianCe_ll6+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll7" value="'+data.list[i].change2[j].oilPipeShenTouJianCe_ll7+'"/></td>';
							$str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#oilPipeShenTouJianCe2").before($str);
					}
				}
			}
			if(data.list[i].name == "oilPipeNingJie"){	//石油专用管   拧接岗位
				$("input[name='oilPipeNingJie_a1'][value='"+data.list[i].oilPipeNingJie_a1 + "']").attr("checked",true);
				$("input[name='oilPipeNingJie_a2'][value='"+data.list[i].oilPipeNingJie_a2 + "']").attr("checked",true);
				$("input[name='oilPipeNingJie_a3'][value='"+data.list[i].oilPipeNingJie_a3 + "']").attr("checked",true);
				$("input[name='oilPipeNingJie_a4'][value='"+data.list[i].oilPipeNingJie_a4 + "']").attr("checked",true);
				
				$("input[name='oilPipeNingJie_a5']").val(data.list[i].oilPipeNingJie_a5);
				$("input[name='oilPipeNingJie_a6'][value='"+data.list[i].oilPipeNingJie_a6 + "']").attr("checked",true);
				$("input[name='oilPipeNingJie_a7'][value='"+data.list[i].oilPipeNingJie_a7 + "']").attr("checked",true);
				$("input[name='oilPipeNingJie_a8'][value='"+data.list[i].oilPipeNingJie_a8 + "']").attr("checked",true);
				
				$("input[name='oilPipeNingJie_l1']").val(data.list[i].change[0].oilPipeNingJie_l1);
				$("input[name='oilPipeNingJie_l2']").val(data.list[i].change[0].oilPipeNingJie_l2);
				$("input[name='oilPipeNingJie_l3']").val(data.list[i].change[0].oilPipeNingJie_l3);
				$("select[name='oilPipeNingJie_l4']").val(data.list[i].change[0].oilPipeNingJie_l4);
				$("input[name='oilPipeNingJie_l5']").val(data.list[i].change[0].oilPipeNingJie_l5);
				$("input[name='oilPipeNingJie_l6']").val(data.list[i].change[0].oilPipeNingJie_l6);
				$("input[name='oilPipeNingJie_b1']").val(data.list[i].oilPipeNingJie_b1);
				$("input[name='oilPipeNingJie_b2']").val(data.list[i].oilPipeNingJie_b2);
				$("input[name='oilPipeNingJie_b3']").val(data.list[i].oilPipeNingJie_b3);
				$("input[name='oilPipeNingJie_b4']").val(data.list[i].oilPipeNingJie_b4);
				$("input[name='oilPipeNingJie_b5']").val(data.list[i].oilPipeNingJie_b5);
				$("input[name='oilPipeNingJie_c1']").val(data.list[i].oilPipeNingJie_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeNingJie_l1"  value="'+data.list[i].change[j].oilPipeNingJie_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeNingJie_l2"  value="'+data.list[i].change[j].oilPipeNingJie_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeNingJie_l3"  value="'+data.list[i].change[j].oilPipeNingJie_l3+'"/></td>';
						if (data.list[i].change[j].oilPipeNingJie_l4 == "手动") {
							$str+='<td align="center"><select name="oilPipeNingJie_l4"><option value="手动" selected>手动</option><option value="自动">自动</option></select></td>';
						}else{
							$str+='<td align="center"><select name="oilPipeNingJie_l4"><option value="手动">手动</option><option value="自动" selected>自动</option></select></td>';
						}
						
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeNingJie_l5"  value="'+data.list[i].change[j].oilPipeNingJie_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeNingJie_l6"  value="'+data.list[i].change[j].oilPipeNingJie_l6+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#oilPipe_ningJie").before($str);
					}
				}
			}
			if(data.list[i].name == "oilPipeTongJing"){	//石油专用管  通径试验
				$("input[name='oilPipeTongJing_a1'][value='"+data.list[i].oilPipeTongJing_a1+"']").attr("checked",true);
				$("input[name='oilPipeTongJing_a2'][value='"+data.list[i].oilPipeTongJing_a2+"']").attr("checked",true);
				$("input[name='oilPipeTongJing_c1']").val(data.list[i].oilPipeTongJing_c1);
				$("input[name='oilPipeTongJing_c2']").val(data.list[i].oilPipeTongJing_c2);
				$("input[name='oilPipeTongJing_l1']").val(data.list[i].change[0].oilPipeTongJing_l1);
				$("select[name='oilPipeTongJing_l2']").val(data.list[i].change[0].oilPipeTongJing_l2);
				$("input[name='oilPipeTongJing_l3']").val(data.list[i].change[0].oilPipeTongJing_l3);
				$("input[name='oilPipeTongJing_l4']").val(data.list[i].change[0].oilPipeTongJing_l4);
				$("input[name='oilPipeTongJing_b1']").val(data.list[i].oilPipeTongJing_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTongJing_l1" value="'+data.list[i].change[j].oilPipeTongJing_l1+'"/></td>';
						if (data.list[i].change[j].oilPipeTongJing_l2 == "全长通径") {
							$str+='<td align="center"><select name="oilPipeTongJing_l2"><option value="全长通径" selected>全长通径</option><option value="拧接端通径">拧接端通径</option></select></td>';
						}else{
							$str+='<td align="center"><select name="oilPipeTongJing_l2"><option value="全长通径">全长通径</option><option value="拧接端通径" selected>拧接端通径</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTongJing_l3" value="'+data.list[i].change[j].oilPipeTongJing_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTongJing_l4" value="'+data.list[i].change[j].oilPipeTongJing_l4+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#oilPipe_tongJing").before($str);
					}
				}
			}
			if(data.list[i].name == "oilPipeShuiYa"){//石油专用管  水压试验
				$("input[name='oilPipeShuiYa_a1'][value='"+data.list[i].oilPipeShuiYa_a1+"']").attr("checked",true);
				$("input[name='oilPipeShuiYa_a2'][value='"+data.list[i].oilPipeShuiYa_a2+"']").attr("checked",true);
				$("input[name='oilPipeShuiYa_a3'][value='"+data.list[i].oilPipeShuiYa_a3+"']").attr("checked",true);
				$("input[name='oilPipeShuiYa_a4'][value='"+data.list[i].oilPipeShuiYa_a4+"']").attr("checked",true);
				$("input[name='oilPipeShuiYa_l1']").val(data.list[i].change[0].oilPipeShuiYa_l1);
				$("input[name='oilPipeShuiYa_l2']").val(data.list[i].change[0].oilPipeShuiYa_l2);
				$("input[name='oilPipeShuiYa_l3']").val(data.list[i].change[0].oilPipeShuiYa_l3);
				$("input[name='oilPipeShuiYa_l4']").val(data.list[i].change[0].oilPipeShuiYa_l4);
				$("input[name='oilPipeShuiYa_b1']").val(data.list[i].oilPipeShuiYa_b1);
				$("input[name='oilPipeShuiYa_b2']").val(data.list[i].oilPipeShuiYa_b2);
				$("input[name='oilPipeShuiYa_b3']").val(data.list[i].oilPipeShuiYa_b3);
				$("input[name='oilPipeShuiYa_c1']").val(data.list[i].oilPipeShuiYa_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShuiYa_l1" value="'+data.list[i].change[j].oilPipeShuiYa_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShuiYa_l2" value="'+data.list[i].change[j].oilPipeShuiYa_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShuiYa_l3" value="'+data.list[i].change[j].oilPipeShuiYa_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShuiYa_l4" value="'+data.list[i].change[j].oilPipeShuiYa_l4+'"/></td>';
						$str+='<td align="center">/td>';
				    $str+='</tr>';
				    $("#oilPipe_shuiYa").before($str);
					}
				}
			}
			if(data.list[i].name == "oilPipeBaoZhuang"){//
				$("input[name='oilPipeBaoZhuang_a1']").val(data.list[i].oilPipeBaoZhuang_a1);
				$("input[name='oilPipeBaoZhuang_a2'][value='"+data.list[i].oilPipeBaoZhuang_a2+"']").attr("checked",true);
				$("input[name='oilPipeBaoZhuang_l1']").val(data.list[i].change[0].oilPipeBaoZhuang_l1);
				$("select[name='oilPipeBaoZhuang_l2']").val(data.list[i].change[0].oilPipeBaoZhuang_l2);
				$("select[name='oilPipeBaoZhuang_l3']").val(data.list[i].change[0].oilPipeBaoZhuang_l3);
				$("select[name='oilPipeBaoZhuang_l4']").val(data.list[i].change[0].oilPipeBaoZhuang_l4);
				$("select[name='oilPipeBaoZhuang_l5']").val(data.list[i].change[0].oilPipeBaoZhuang_l5);
				$("input[name='oilPipeBaoZhuang_l6']").val(data.list[i].change[0].oilPipeBaoZhuang_l6);
				$("input[name='oilPipeBaoZhuang_b1']").val(data.list[i].oilPipeBaoZhuang_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeBaoZhuang_l1" value="'+data.list[i].change[j].oilPipeBaoZhuang_l1+'"/></td>';
						if (data.list[i].change[j].oilPipeBaoZhuang_l2 == "符合") {
							$str+='<td align="center"><select name="oilPipeBaoZhuang_l2"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="oilPipeBaoZhuang_l2"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if (data.list[i].change[j].oilPipeBaoZhuang_l3 == "符合") {
							$str+='<td align="center"><select name="oilPipeBaoZhuang_l3"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="oilPipeBaoZhuang_l3"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if (data.list[i].change[j].oilPipeBaoZhuang_l4 == "符合") {
							$str+='<td align="center"><select name="oilPipeBaoZhuang_l4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="oilPipeBaoZhuang_l4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if (data.list[i].change[j].oilPipeBaoZhuang_l5 == "符合") {
							$str+='<td align="center"><select name="oilPipeBaoZhuang_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="oilPipeBaoZhuang_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeBaoZhuang_l6" value="'+data.list[i].change[j].oilPipeBaoZhuang_l6+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#oilPipe_baoZhuang").before($str);
					}
				}
			}
			if(data.list[i].name == "oilPipeHuaXue"){//化学成分
				$("input[name='oilPipeHuaXue_a1'][value='"+data.list[i].oilPipeHuaXue_a1+"']").attr("checked",true); 
				$("input[name='oilPipeHuaXue_a2'][value='"+data.list[i].oilPipeHuaXue_a2+"']").attr("checked",true);
				$("input[name='oilPipeHuaXue_b1']").val(data.list[i].oilPipeHuaXue_b1);
				$("input[name='oilPipeHuaXue_b2']").val(data.list[i].oilPipeHuaXue_b2);
				$("input[name='oilPipeHuaXue_b3']").val(data.list[i].oilPipeHuaXue_b3);
				$("input[name='oilPipeHuaXue_b4']").val(data.list[i].oilPipeHuaXue_b4);
				$("input[name='oilPipeHuaXue_c1']").val(data.list[i].oilPipeHuaXue_c1);
				$("input[name='oilPipeHuaXue_c2']").val(data.list[i].oilPipeHuaXue_c2);
				$("input[name='oilPipeHuaXue_c3']").val(data.list[i].oilPipeHuaXue_c3);
				$("input[name='oilPipeHuaXue_c4']").val(data.list[i].oilPipeHuaXue_c4);
				$("input[name='oilPipeHuaXue_d1']").val(data.list[i].oilPipeHuaXue_d1);
				$("input[name='oilPipeHuaXue_d2']").val(data.list[i].oilPipeHuaXue_d2);
				$("input[name='oilPipeHuaXue_d3']").val(data.list[i].oilPipeHuaXue_d3);
				$("input[name='oilPipeHuaXue_d4']").val(data.list[i].oilPipeHuaXue_d4);
				$("input[name='oilPipeHuaXue_e1']").val(data.list[i].oilPipeHuaXue_e1);
				$("input[name='oilPipeHuaXue_e2']").val(data.list[i].oilPipeHuaXue_e2);
				$("input[name='oilPipeHuaXue_e3']").val(data.list[i].oilPipeHuaXue_e3);
				$("input[name='oilPipeHuaXue_e4']").val(data.list[i].oilPipeHuaXue_e4);
				$("input[name='oilPipeHuaXue_f1']").val(data.list[i].oilPipeHuaXue_f1);
			}
			if(data.list[i].name == "oilPipeLaShenXingNeng"){//阀门 拉伸性能
				$("input[name='oilPipeLaShenXingNeng_a1'][value='"+data.list[i].oilPipeLaShenXingNeng_a1+"']").attr("checked",true); 
				$("input[name='oilPipeLaShenXingNeng_a2'][value='"+data.list[i].oilPipeLaShenXingNeng_a2+"']").attr("checked",true);
				$("input[name='oilPipeLaShenXingNeng_a3'][value='"+data.list[i].oilPipeLaShenXingNeng_a3+"']").attr("checked",true); 
				$("input[name='oilPipeLaShenXingNeng_a4'][value='"+data.list[i].oilPipeLaShenXingNeng_a4+"']").attr("checked",true);
				$("input[name='oilPipeLaShenXingNeng_l1']").val(data.list[i].change[0].oilPipeLaShenXingNeng_l1);
				$("input[name='oilPipeLaShenXingNeng_l2']").val(data.list[i].change[0].oilPipeLaShenXingNeng_l2);
				$("input[name='oilPipeLaShenXingNeng_l3']").val(data.list[i].change[0].oilPipeLaShenXingNeng_l3);
				$("input[name='oilPipeLaShenXingNeng_l4']").val(data.list[i].change[0].oilPipeLaShenXingNeng_l4);
				$("input[name='oilPipeLaShenXingNeng_l5']").val(data.list[i].change[0].oilPipeLaShenXingNeng_l5);
				$("input[name='oilPipeLaShenXingNeng_l6']").val(data.list[i].change[0].oilPipeLaShenXingNeng_l6);
				$("input[name='oilPipeLaShenXingNeng_l7']").val(data.list[i].change[0].oilPipeLaShenXingNeng_l7);
				$("input[name='oilPipeLaShenXingNeng_b1']").val(data.list[i].oilPipeLaShenXingNeng_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						 $str='';
					        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l1" value="'+data.list[i].change[j].oilPipeLaShenXingNeng_l1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l2" value="'+data.list[i].change[j].oilPipeLaShenXingNeng_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l3" value="'+data.list[i].change[j].oilPipeLaShenXingNeng_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l4" value="'+data.list[i].change[j].oilPipeLaShenXingNeng_l4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l5" value="'+data.list[i].change[j].oilPipeLaShenXingNeng_l5+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l6" value="'+data.list[i].change[j].oilPipeLaShenXingNeng_l6+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l7" value="'+data.list[i].change[j].oilPipeLaShenXingNeng_l7+'"/></td>';
							$str+='<td align="center">/td>';
						    $str+='</tr>';
						    $("#oilPipeLaShenXingNeng").before($str);
					}
				}
			}
			if(data.list[i].name == "oilPipeChongJi"){//
				$("input[name='oilPipeChongJi_a1'][value='"+data.list[i].oilPipeChongJi_a1+"']").attr("checked",true); 
				$("input[name='oilPipeChongJi_a2'][value='"+data.list[i].oilPipeChongJi_a2+"']").attr("checked",true);
				$("input[name='oilPipeChongJi_a3'][value='"+data.list[i].oilPipeChongJi_a3+"']").attr("checked",true); 
				$("input[name='oilPipeChongJi_a4'][value='"+data.list[i].oilPipeChongJi_a4+"']").attr("checked",true);
				$("input[name='oilPipeChongJi_b1']").val(data.list[i].oilPipeChongJi_b1);
				$("input[name='oilPipeChongJi_b2']").val(data.list[i].oilPipeChongJi_b2);
				$("input[name='oilPipeChongJi_c1']").val(data.list[i].oilPipeChongJi_c1);
				$("input[name='oilPipeChongJi_c2']").val(data.list[i].oilPipeChongJi_c2);
				$("input[name='oilPipeChongJi_c3']").val(data.list[i].oilPipeChongJi_c3);
				$("input[name='oilPipeChongJi_c4']").val(data.list[i].oilPipeChongJi_c4);
				$("input[name='oilPipeChongJi_d1']").val(data.list[i].oilPipeChongJi_d1);
				$("input[name='oilPipeChongJi_d2']").val(data.list[i].oilPipeChongJi_d2);
				$("input[name='oilPipeChongJi_d3']").val(data.list[i].oilPipeChongJi_d3);
				$("input[name='oilPipeChongJi_d4']").val(data.list[i].oilPipeChongJi_d4);
				$("input[name='oilPipeChongJi_e1']").val(data.list[i].oilPipeChongJi_e1);
				$("input[name='oilPipeChongJi_e2']").val(data.list[i].oilPipeChongJi_e2);
				$("input[name='oilPipeChongJi_e3']").val(data.list[i].oilPipeChongJi_e3);
				$("input[name='oilPipeChongJi_e4']").val(data.list[i].oilPipeChongJi_e4);
				$("input[name='oilPipeChongJi_f1']").val(data.list[i].oilPipeChongJi_f1);
				$("input[name='oilPipeChongJi_f2']").val(data.list[i].oilPipeChongJi_f2);
				$("input[name='oilPipeChongJi_f3']").val(data.list[i].oilPipeChongJi_f3);
				$("input[name='oilPipeChongJi_f4']").val(data.list[i].oilPipeChongJi_f4);
				$("input[name='oilPipeChongJi_g1']").val(data.list[i].oilPipeChongJi_g1);
				$("input[name='oilPipeChongJi_g2']").val(data.list[i].oilPipeChongJi_g2);
				$("input[name='oilPipeChongJi_g3']").val(data.list[i].oilPipeChongJi_g3);
				$("input[name='oilPipeChongJi_g4']").val(data.list[i].oilPipeChongJi_g4);
				$("input[name='oilPipeChongJi_h1']").val(data.list[i].oilPipeChongJi_h1);
				$("input[name='oilPipeChongJi_h2']").val(data.list[i].oilPipeChongJi_h2);
				$("input[name='oilPipeChongJi_h3']").val(data.list[i].oilPipeChongJi_h3);
				$("input[name='oilPipeChongJi_h4']").val(data.list[i].oilPipeChongJi_h4);
				$("input[name='oilPipeChongJi_i1']").val(data.list[i].oilPipeChongJi_i1);
			}
			if(data.list[i].name == "oilPipeWanQu"){//
				$("input[name='oilPipeWanQu_a1'][value='"+data.list[i].oilPipeWanQu_a1+"']").attr("checked",true); 
				$("input[name='oilPipeWanQu_a2'][value='"+data.list[i].oilPipeWanQu_a2+"']").attr("checked",true);
				$("input[name='oilPipeWanQu_a3'][value='"+data.list[i].oilPipeWanQu_a3+"']").attr("checked",true); 
				$("input[name='oilPipeWanQu_a4'][value='"+data.list[i].oilPipeWanQu_a4+"']").attr("checked",true);
				$("input[name='oilPipeWanQu_b1']").val(data.list[i].oilPipeWanQu_b1);
				$("input[name='oilPipeWanQu_b2']").val(data.list[i].oilPipeWanQu_b2);
				$("input[name='oilPipeWanQu_c1']").val(data.list[i].oilPipeWanQu_c1);
				$("input[name='oilPipeWanQu_c2']").val(data.list[i].oilPipeWanQu_c2);
				$("input[name='oilPipeWanQu_c3']").val(data.list[i].oilPipeWanQu_c3);
				$("input[name='oilPipeWanQu_c4']").val(data.list[i].oilPipeWanQu_c4);
				$("input[name='oilPipeWanQu_d1']").val(data.list[i].oilPipeWanQu_d1);
				$("input[name='oilPipeWanQu_d2']").val(data.list[i].oilPipeWanQu_d2);
				$("input[name='oilPipeWanQu_d3']").val(data.list[i].oilPipeWanQu_d3);
				$("input[name='oilPipeWanQu_d4']").val(data.list[i].oilPipeWanQu_d4);
				$("input[name='oilPipeWanQu_e1']").val(data.list[i].oilPipeWanQu_e1);
				$("input[name='oilPipeWanQu_e2']").val(data.list[i].oilPipeWanQu_e2);
				$("input[name='oilPipeWanQu_e3']").val(data.list[i].oilPipeWanQu_e3);
				$("input[name='oilPipeWanQu_e4']").val(data.list[i].oilPipeWanQu_e4);
				$("input[name='oilPipeWanQu_f1']").val(data.list[i].oilPipeWanQu_f1);
				$("input[name='oilPipeWanQu_f2']").val(data.list[i].oilPipeWanQu_f2);
				$("input[name='oilPipeWanQu_f3']").val(data.list[i].oilPipeWanQu_f3);
				$("input[name='oilPipeWanQu_f4']").val(data.list[i].oilPipeWanQu_f4);
				$("input[name='oilPipeWanQu_g1']").val(data.list[i].oilPipeWanQu_g1);
			}
			if(data.list[i].name == "oilPipeJinXiang"){//
				$("input[name='oilPipeJinXiang_a1'][value='"+data.list[i].oilPipeJinXiang_a1+"']").attr("checked",true); 
				$("input[name='oilPipeJinXiang_a2'][value='"+data.list[i].oilPipeJinXiang_a2+"']").attr("checked",true);
				$("input[name='oilPipeJinXiang_a3'][value='"+data.list[i].oilPipeJinXiang_a3+"']").attr("checked",true); 
				$("input[name='oilPipeJinXiang_a4'][value='"+data.list[i].oilPipeJinXiang_a4+"']").attr("checked",true);
				$("input[name='oilPipeJinXiang_b1']").val(data.list[i].oilPipeJinXiang_b1);
				$("input[name='oilPipeJinXiang_b2']").val(data.list[i].oilPipeJinXiang_b2);
				$("input[name='oilPipeJinXiang_b3']").val(data.list[i].oilPipeJinXiang_b3);
				$("input[name='oilPipeJinXiang_b4']").val(data.list[i].oilPipeJinXiang_b4);
				$("input[name='oilPipeJinXiang_c1']").val(data.list[i].oilPipeJinXiang_c1);
				$("input[name='oilPipeJinXiang_c2']").val(data.list[i].oilPipeJinXiang_c2);
				$("input[name='oilPipeJinXiang_c3']").val(data.list[i].oilPipeJinXiang_c3);
				$("input[name='oilPipeJinXiang_c4']").val(data.list[i].oilPipeJinXiang_c4);
				$("input[name='oilPipeJinXiang_d1']").val(data.list[i].oilPipeJinXiang_d1);
				$("input[name='oilPipeJinXiang_d2']").val(data.list[i].oilPipeJinXiang_d2);
				$("input[name='oilPipeJinXiang_d3']").val(data.list[i].oilPipeJinXiang_d3);
				$("input[name='oilPipeJinXiang_d4']").val(data.list[i].oilPipeJinXiang_d4);
				$("input[name='oilPipeJinXiang_e1']").val(data.list[i].oilPipeJinXiang_e1);
				$("input[name='oilPipeJinXiang_e2']").val(data.list[i].oilPipeJinXiang_e2);
				$("input[name='oilPipeJinXiang_e3']").val(data.list[i].oilPipeJinXiang_e3);
				$("input[name='oilPipeJinXiang_e4']").val(data.list[i].oilPipeJinXiang_e4);
				$("input[name='oilPipeJinXiang_f1']").val(data.list[i].oilPipeJinXiang_f1);
			}
			if(data.list[i].name == "oilPipeHuaXue1"){//化学成分
				$("input[name='oilPipeHuaXue1_a1'][value='"+data.list[i].oilPipeHuaXue1_a1+"']").attr("checked",true); 
				$("input[name='oilPipeHuaXue1_a2'][value='"+data.list[i].oilPipeHuaXue1_a2+"']").attr("checked",true);
				$("input[name='oilPipeHuaXue1_b1']").val(data.list[i].oilPipeHuaXue1_b1);
				$("input[name='oilPipeHuaXue1_b2']").val(data.list[i].oilPipeHuaXue1_b2);
				$("input[name='oilPipeHuaXue1_b3']").val(data.list[i].oilPipeHuaXue1_b3);
				$("input[name='oilPipeHuaXue1_b4']").val(data.list[i].oilPipeHuaXue1_b4);
				$("input[name='oilPipeHuaXue1_c1']").val(data.list[i].oilPipeHuaXue1_c1);
				$("input[name='oilPipeHuaXue1_c2']").val(data.list[i].oilPipeHuaXue1_c2);
				$("input[name='oilPipeHuaXue1_c3']").val(data.list[i].oilPipeHuaXue1_c3);
				$("input[name='oilPipeHuaXue1_c4']").val(data.list[i].oilPipeHuaXue1_c4);
				$("input[name='oilPipeHuaXue1_d1']").val(data.list[i].oilPipeHuaXue1_d1);
			}
			if(data.list[i].name == "oilPipeLaShenXingNeng1"){//阀门 拉伸性能
				$("input[name='oilPipeLaShenXingNeng1_a1'][value='"+data.list[i].oilPipeLaShenXingNeng1_a1+"']").attr("checked",true); 
				$("input[name='oilPipeLaShenXingNeng1_a2'][value='"+data.list[i].oilPipeLaShenXingNeng1_a2+"']").attr("checked",true);
				$("input[name='oilPipeLaShenXingNeng1_a3'][value='"+data.list[i].oilPipeLaShenXingNeng1_a3+"']").attr("checked",true); 
				$("input[name='oilPipeLaShenXingNeng1_a4'][value='"+data.list[i].oilPipeLaShenXingNeng1_a4+"']").attr("checked",true);
				$("input[name='oilPipeLaShenXingNeng1_l1']").val(data.list[i].change[0].oilPipeLaShenXingNeng1_l1);
				$("input[name='oilPipeLaShenXingNeng1_l2']").val(data.list[i].change[0].oilPipeLaShenXingNeng1_l2);
				$("input[name='oilPipeLaShenXingNeng1_l3']").val(data.list[i].change[0].oilPipeLaShenXingNeng1_l3);
				$("input[name='oilPipeLaShenXingNeng1_l4']").val(data.list[i].change[0].oilPipeLaShenXingNeng1_l4);
				$("input[name='oilPipeLaShenXingNeng1_l5']").val(data.list[i].change[0].oilPipeLaShenXingNeng1_l5);
				$("input[name='oilPipeLaShenXingNeng1_l6']").val(data.list[i].change[0].oilPipeLaShenXingNeng1_l6);
				$("input[name='oilPipeLaShenXingNeng1_b1']").val(data.list[i].oilPipeLaShenXingNeng1_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						 $str='';
					        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l1" value="'+data.list[i].change[j].oilPipeLaShenXingNeng1_l1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l2" value="'+data.list[i].change[j].oilPipeLaShenXingNeng1_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l3" value="'+data.list[i].change[j].oilPipeLaShenXingNeng1_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l4" value="'+data.list[i].change[j].oilPipeLaShenXingNeng1_l4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l5" value="'+data.list[i].change[j].oilPipeLaShenXingNeng1_l5+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l6" value="'+data.list[i].change[j].oilPipeLaShenXingNeng1_l6+'"/></td>';
							$str+='<td align="center">/td>';
						    $str+='</tr>';
						    $("#oilPipeLaShenXingNeng1").before($str);
					}
				}
			}
			if(data.list[i].name == "oilPipeChongJi1"){//
				$("input[name='oilPipeChongJi1_a1'][value='"+data.list[i].oilPipeChongJi1_a1+"']").attr("checked",true); 
				$("input[name='oilPipeChongJi1_a2'][value='"+data.list[i].oilPipeChongJi1_a2+"']").attr("checked",true);
				$("input[name='oilPipeChongJi1_a3'][value='"+data.list[i].oilPipeChongJi1_a3+"']").attr("checked",true); 
				$("input[name='oilPipeChongJi1_a4'][value='"+data.list[i].oilPipeChongJi1_a4+"']").attr("checked",true);
				$("input[name='oilPipeChongJi1_b1']").val(data.list[i].oilPipeChongJi1_b1);
				$("input[name='oilPipeChongJi1_b2']").val(data.list[i].oilPipeChongJi1_b2);
				$("input[name='oilPipeChongJi1_c1']").val(data.list[i].oilPipeChongJi1_c1);
				$("input[name='oilPipeChongJi1_c2']").val(data.list[i].oilPipeChongJi1_c2);
				$("input[name='oilPipeChongJi1_c3']").val(data.list[i].oilPipeChongJi1_c3);
				$("input[name='oilPipeChongJi1_c4']").val(data.list[i].oilPipeChongJi1_c4);
				$("input[name='oilPipeChongJi1_d1']").val(data.list[i].oilPipeChongJi1_d1);
				$("input[name='oilPipeChongJi1_d2']").val(data.list[i].oilPipeChongJi1_d2);
				$("input[name='oilPipeChongJi1_d3']").val(data.list[i].oilPipeChongJi1_d3);
				$("input[name='oilPipeChongJi1_d4']").val(data.list[i].oilPipeChongJi1_d4);
				$("input[name='oilPipeChongJi1_e1']").val(data.list[i].oilPipeChongJi1_e1);
				$("input[name='oilPipeChongJi1_e2']").val(data.list[i].oilPipeChongJi1_e2);
				$("input[name='oilPipeChongJi1_e3']").val(data.list[i].oilPipeChongJi1_e3);
				$("input[name='oilPipeChongJi1_e4']").val(data.list[i].oilPipeChongJi1_e4);
				$("input[name='oilPipeChongJi1_f1']").val(data.list[i].oilPipeChongJi1_f1);
				$("input[name='oilPipeChongJi1_f2']").val(data.list[i].oilPipeChongJi1_f2);
				$("input[name='oilPipeChongJi1_f3']").val(data.list[i].oilPipeChongJi1_f3);
				$("input[name='oilPipeChongJi1_f4']").val(data.list[i].oilPipeChongJi1_f4);
				$("input[name='oilPipeChongJi1_g1']").val(data.list[i].oilPipeChongJi1_g1);
				$("input[name='oilPipeChongJi1_g2']").val(data.list[i].oilPipeChongJi1_g2);
				$("input[name='oilPipeChongJi1_g3']").val(data.list[i].oilPipeChongJi1_g3);
				$("input[name='oilPipeChongJi1_g4']").val(data.list[i].oilPipeChongJi1_g4);
				$("input[name='oilPipeChongJi1_h1']").val(data.list[i].oilPipeChongJi_h1);
			}

			if(data.list[i].name == "oilPipeWanQu1"){//
				$("input[name='oilPipeWanQu1_a1'][value='"+data.list[i].oilPipeWanQu1_a1+"']").attr("checked",true); 
				$("input[name='oilPipeWanQu1_a2'][value='"+data.list[i].oilPipeWanQu1_a2+"']").attr("checked",true);
				$("input[name='oilPipeWanQu1_a3'][value='"+data.list[i].oilPipeWanQu1_a3+"']").attr("checked",true); 
				$("input[name='oilPipeWanQu1_a4'][value='"+data.list[i].oilPipeWanQu1_a4+"']").attr("checked",true);
				$("input[name='oilPipeWanQu1_b1']").val(data.list[i].oilPipeWanQu1_b1);
				$("input[name='oilPipeWanQu1_b2']").val(data.list[i].oilPipeWanQu1_b2);
				$("input[name='oilPipeWanQu1_c1']").val(data.list[i].oilPipeWanQu1_c1);
				$("input[name='oilPipeWanQu1_c2']").val(data.list[i].oilPipeWanQu1_c2);
				$("input[name='oilPipeWanQu1_c3']").val(data.list[i].oilPipeWanQu1_c3);
				$("input[name='oilPipeWanQu1_c4']").val(data.list[i].oilPipeWanQu1_c4);
				$("input[name='oilPipeWanQu1_e1']").val(data.list[i].oilPipeWanQu1_e1);
				$("input[name='oilPipeWanQu1_e2']").val(data.list[i].oilPipeWanQu1_e2);
				$("input[name='oilPipeWanQu1_e3']").val(data.list[i].oilPipeWanQu1_e3);
				$("input[name='oilPipeWanQu1_e4']").val(data.list[i].oilPipeWanQu1_e4);
				$("input[name='oilPipeWanQu1_f1']").val(data.list[i].oilPipeWanQu1_f1);
				$("input[name='oilPipeWanQu1_f2']").val(data.list[i].oilPipeWanQu1_f2);
				$("input[name='oilPipeWanQu1_f3']").val(data.list[i].oilPipeWanQu1_f3);
				$("input[name='oilPipeWanQu1_f4']").val(data.list[i].oilPipeWanQu1_f4);
				$("input[name='oilPipeWanQu1_g1']").val(data.list[i].oilPipeWanQu1_g1);
			}

			if(data.list[i].name == "oilPipeLuochui"){//弯管 
					$("input[name='oilPipeLuochui_a1'][value='"+data.list[i].oilPipeLuochui_a1+"']").attr("checked",true); 
					$("input[name='oilPipeLuochui_a2'][value='"+data.list[i].oilPipeLuochui_a2+"']").attr("checked",true);
					$("input[name='oilPipeLuochui_a3'][value='"+data.list[i].oilPipeLuochui_a3+"']").attr("checked",true); 
					$("input[name='oilPipeLuochui_a4'][value='"+data.list[i].oilPipeLuochui_a4+"']").attr("checked",true);
					$("input[name='oilPipeLuochui_a5']").val(data.list[i].oilPipeLuochui_a5);
					$("input[name='oilPipeLuochui_b1']").val(data.list[i].oilPipeLuochui_b1);
					$("input[name='oilPipeLuochui_b2']").val(data.list[i].oilPipeLuochui_b2);
					$("input[name='oilPipeLuochui_b3']").val(data.list[i].oilPipeLuochui_b3);
					$("input[name='oilPipeLuochui_b4']").val(data.list[i].oilPipeLuochui_b4);
					$("input[name='oilPipeLuochui_c1']").val(data.list[i].oilPipeLuochui_c1);
					$("input[name='oilPipeLuochui_c2']").val(data.list[i].oilPipeLuochui_c2);
					$("input[name='oilPipeLuochui_c3']").val(data.list[i].oilPipeLuochui_c3);
					$("input[name='oilPipeLuochui_c4']").val(data.list[i].oilPipeLuochui_c4);
					$("input[name='oilPipeLuochui_d1']").val(data.list[i].oilPipeLuochui_d1);
					$("input[name='oilPipeLuochui_d2']").val(data.list[i].oilPipeLuochui_d2);
					$("input[name='oilPipeLuochui_d3']").val(data.list[i].oilPipeLuochui_d3);
					$("input[name='oilPipeLuochui_d4']").val(data.list[i].oilPipeLuochui_d4);
					$("input[name='oilPipeLuochui_e1']").val(data.list[i].oilPipeLuochui_e1);
					$("input[name='oilPipeLuochui_e2']").val(data.list[i].oilPipeLuochui_e2);
					$("input[name='oilPipeLuochui_e3']").val(data.list[i].oilPipeLuochui_e3);
					$("input[name='oilPipeLuochui_e4']").val(data.list[i].oilPipeLuochui_e4);
					$("input[name='oilPipeLuochui_f1']").val(data.list[i].oilPipeLuochui_f1);
					$("input[name='oilPipeLuochui_f2']").val(data.list[i].oilPipeLuochui_f2);
					$("input[name='oilPipeLuochui_f3']").val(data.list[i].oilPipeLuochui_f3);
					$("input[name='oilPipeLuochui_f4']").val(data.list[i].oilPipeLuochui_f4);
					$("input[name='oilPipeLuochui_g1']").val(data.list[i].oilPipeLuochui_g1);
				}

			if(data.list[i].name == "oilPipeJinXiang1"){//
				$("input[name='oilPipeJinXiang1_a1'][value='"+data.list[i].oilPipeJinXiang1_a1+"']").attr("checked",true); 
				$("input[name='oilPipeJinXiang1_a2'][value='"+data.list[i].oilPipeJinXiang1_a2+"']").attr("checked",true);
				$("input[name='oilPipeJinXiang1_a3'][value='"+data.list[i].oilPipeJinXiang1_a3+"']").attr("checked",true); 
				$("input[name='oilPipeJinXiang1_a4'][value='"+data.list[i].oilPipeJinXiang1_a4+"']").attr("checked",true);
				$("input[name='oilPipeJinXiang1_b1']").val(data.list[i].oilPipeJinXiang1_b1);
				$("input[name='oilPipeJinXiang1_b2']").val(data.list[i].oilPipeJinXiang1_b2);
				$("input[name='oilPipeJinXiang1_b3']").val(data.list[i].oilPipeJinXiang1_b3);
				$("input[name='oilPipeJinXiang1_b4']").val(data.list[i].oilPipeJinXiang1_b4);
				$("input[name='oilPipeJinXiang1_c1']").val(data.list[i].oilPipeJinXiang1_c1);
				$("input[name='oilPipeJinXiang1_c2']").val(data.list[i].oilPipeJinXiang1_c2);
				$("input[name='oilPipeJinXiang1_c3']").val(data.list[i].oilPipeJinXiang1_c3);
				$("input[name='oilPipeJinXiang1_c4']").val(data.list[i].oilPipeJinXiang1_c4);
				$("input[name='oilPipeJinXiang1_d1']").val(data.list[i].oilPipeJinXiang1_d1);
				$("input[name='oilPipeJinXiang1_d2']").val(data.list[i].oilPipeJinXiang1_d2);
				$("input[name='oilPipeJinXiang1_d3']").val(data.list[i].oilPipeJinXiang1_d3);
				$("input[name='oilPipeJinXiang1_d4']").val(data.list[i].oilPipeJinXiang1_d4);
				$("input[name='oilPipeJinXiang1_e1']").val(data.list[i].oilPipeJinXiang1_e1);
				$("input[name='oilPipeJinXiang1_e2']").val(data.list[i].oilPipeJinXiang1_e2);
				$("input[name='oilPipeJinXiang1_e3']").val(data.list[i].oilPipeJinXiang1_e3);
				$("input[name='oilPipeJinXiang1_e4']").val(data.list[i].oilPipeJinXiang1_e4);
				$("input[name='oilPipeJinXiang1_f1']").val(data.list[i].oilPipeJinXiang1_f1);
			}

		if(data.list[i].name == "bendQiTa"){//其他
			$("input[name='bendQiTa_a1'").val(data.list[i].bendQiTa_a1);
			$("input[name='bendQiTa_a2'").val(data.list[i].bendQiTa_a2);
			$("input[name='bendQiTa_b1'").val(data.list[i].bendQiTa_b1);
			$("input[name='bendQiTa_b2'").val(data.list[i].bendQiTa_b2);
			$("input[name='bendQiTa_b3'").val(data.list[i].bendQiTa_b3);
			$("input[name='bendQiTa_c1'").val(data.list[i].bendQiTa_c1);
			$("input[name='bendQiTa_c2'").val(data.list[i].bendQiTa_c2);
			$("input[name='bendQiTa_c3'").val(data.list[i].bendQiTa_c3);
			$("input[name='bendQiTa_c4'").val(data.list[i].bendQiTa_c4);
			$("input[name='bendQiTa_d1'").val(data.list[i].bendQiTa_d1);
			$("input[name='bendQiTa_f1'").val(data.list[i].bendQiTa_f1);
			$("input[name='bendQiTa_l1'").val(data.list[i].change[0].bendQiTa_l1);
			$("input[name='bendQiTa_l2'").val(data.list[i].change[0].bendQiTa_l2);
			$("input[name='bendQiTa_l3'").val(data.list[i].change[0].bendQiTa_l3);
			$("input[name='bendQiTa_l4'").val(data.list[i].change[0].bendQiTa_l4);
			$("input[name='bendQiTa_l5'").val(data.list[i].change[0].bendQiTa_l5);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="bendQiTa_l1" value="'+data.list[i].change[j].bendQiTa_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="bendQiTa_l2" value="'+data.list[i].change[j].bendQiTa_l2+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="bendQiTa_l3" value="'+data.list[i].change[j].bendQiTa_l3+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="bendQiTa_l4" value="'+data.list[i].change[j].bendQiTa_l4+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="bendQiTa_l5" value="'+data.list[i].change[j].bendQiTa_l5+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#bendQiTa").before($str);
				}
			}
		}

		//弯管
		if(data.list[i].name == "wanGuanMuGuan"){//
			$("input[name='wanGuanMuGuan_a1']").val(data.list[i].wanGuanMuGuan_a1);
			$("input[name='wanGuanMuGuan_a2']").val(data.list[i].wanGuanMuGuan_a2);
			$("input[name='wanGuanMuGuan_a3']").val(data.list[i].wanGuanMuGuan_a3);
			$("input[name='wanGuanMuGuan_b1']").val(data.list[i].wanGuanMuGuan_b1);
			$("input[name='wanGuanMuGuan_b2']").val(data.list[i].wanGuanMuGuan_b2);
			$("input[name='wanGuanMuGuan_b3']").val(data.list[i].wanGuanMuGuan_b3);
			$("input[name='wanGuanMuGuan_c1']").val(data.list[i].wanGuanMuGuan_b1);
			$("input[name='wanGuanMuGuan_c2']").val(data.list[i].wanGuanMuGuan_b2);
			$("input[name='wanGuanMuGuan_c3']").val(data.list[i].wanGuanMuGuan_b3);
			$("input[name='wanGuanMuGuan_d1']").val(data.list[i].wanGuanMuGuan_d1);
		}
		if(data.list[i].name == "wanGuanWeiZhi"){//煨制
			$("input[name='wanGuanWeiZhi_a1'][value='"+data.list[i].wanGuanWeiZhi_a1+"']").attr("checked",true); 
			$("input[name='wanGuanWeiZhi_a2'][value='"+data.list[i].wanGuanWeiZhi_a2+"']").attr("checked",true);
			$("input[name='wanGuanWeiZhi_l1']").val(data.list[i].change[0].wanGuanWeiZhi_l1);
			$("input[name='wanGuanWeiZhi_l2']").val(data.list[i].change[0].wanGuanWeiZhi_l2);
			$("input[name='wanGuanWeiZhi_l3']").val(data.list[i].change[0].wanGuanWeiZhi_l3);
			$("input[name='wanGuanWeiZhi_l4']").val(data.list[i].change[0].wanGuanWeiZhi_l4);
			$("input[name='wanGuanWeiZhi_l5']").val(data.list[i].change[0].wanGuanWeiZhi_l5);
			$("input[name='wanGuanWeiZhi_b1']").val(data.list[i].wanGuanWeiZhi_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					    $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWeiZhi_l1" value="'+data.list[i].change[j].wanGuanWeiZhi_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWeiZhi_l2" value="'+data.list[i].change[j].wanGuanWeiZhi_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWeiZhi_l3" value="'+data.list[i].change[j].wanGuanWeiZhi_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWeiZhi_l4" value="'+data.list[i].change[j].wanGuanWeiZhi_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWeiZhi_l5" value="'+data.list[i].change[j].wanGuanWeiZhi_l5+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#wanGuan_weiZhi").before($str);
				}
			}
		}
		if(data.list[i].name == "wanGuanReChuLi"){//热处理
			$("input[name='wanGuanReChuLi_a1'][value='"+data.list[i].wanGuanReChuLi_a1+"']").attr("checked",true); 
			$("input[name='wanGuanReChuLi_a2'][value='"+data.list[i].wanGuanReChuLi_a2+"']").attr("checked",true);
			$("input[name='wanGuanReChuLi_l1']").val(data.list[i].change[0].wanGuanReChuLi_l1);
			$("input[name='wanGuanReChuLi_l2']").val(data.list[i].change[0].wanGuanReChuLi_l2);
			$("input[name='wanGuanReChuLi_l3']").val(data.list[i].change[0].wanGuanReChuLi_l3);
			$("input[name='wanGuanReChuLi_l4']").val(data.list[i].change[0].wanGuanReChuLi_l4);
			$("input[name='wanGuanReChuLi_l5']").val(data.list[i].change[0].wanGuanReChuLi_l5);
			$("input[name='wanGuanReChuLi_l6']").val(data.list[i].change[0].wanGuanReChuLi_l6);
			$("input[name='wanGuanReChuLi_b1']").val(data.list[i].wanGuanReChuLi_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l1" value="'+data.list[i].change[j].wanGuanReChuLi_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l2" value="'+data.list[i].change[j].wanGuanReChuLi_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l3" value="'+data.list[i].change[j].wanGuanReChuLi_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l4" value="'+data.list[i].change[j].wanGuanReChuLi_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l5" value="'+data.list[i].change[j].wanGuanReChuLi_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l6" value="'+data.list[i].change[j].wanGuanReChuLi_l6+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#wanGuan_reChuLi").before($str);
				}
			}
		}
		if(data.list[i].name == "wanGuanSheXianGuoCheng"){		//设备 射线检测过程
			$("input[name='wanGuanSheXianGuoCheng_b1']").val(data.list[i].wanGuanSheXianGuoCheng_b1);
			$("input[name='wanGuanSheXianGuoCheng_a1'][value='"+data.list[i].wanGuanSheXianGuoCheng_a1+"']").attr("checked",true); 
			$("input[name='wanGuanSheXianGuoCheng_a2'][value='"+data.list[i].wanGuanSheXianGuoCheng_a2+"']").attr("checked",true);
			$("input[name='wanGuanSheXianGuoCheng_a3'][value='"+data.list[i].wanGuanSheXianGuoCheng_a3+"']").attr("checked",true); 
			$("input[name='wanGuanSheXianGuoCheng_a4'][value='"+data.list[i].wanGuanSheXianGuoCheng_a4+"']").attr("checked",true);

			$("input[name='wanGuanSheXianGuoCheng_l1']").val(data.list[i].change[0].wanGuanSheXianGuoCheng_l1);
			$("input[name='wanGuanSheXianGuoCheng_l2']").val(data.list[i].change[0].wanGuanSheXianGuoCheng_l2);
			$("input[name='wanGuanSheXianGuoCheng_l3']").val(data.list[i].change[0].wanGuanSheXianGuoCheng_l3);
			$("input[name='wanGuanSheXianGuoCheng_l4']").val(data.list[i].change[0].wanGuanSheXianGuoCheng_l4);
			$("select[name='wanGuanSheXianGuoCheng_l5']").val(data.list[i].change[0].wanGuanSheXianGuoCheng_l5);
			$("input[name='wanGuanSheXianGuoCheng_l6']").val(data.list[i].change[0].wanGuanSheXianGuoCheng_l6);
			$("select[name='wanGuanSheXianGuoCheng_l7']").val(data.list[i].change[0].wanGuanSheXianGuoCheng_l7);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianGuoCheng_l1" value="'+data.list[i].change[j].wanGuanSheXianGuoCheng_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianGuoCheng_l2" value="'+data.list[i].change[j].wanGuanSheXianGuoCheng_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianGuoCheng_l3" value="'+data.list[i].change[j].wanGuanSheXianGuoCheng_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianGuoCheng_l4" value="'+data.list[i].change[j].wanGuanSheXianGuoCheng_l4+'"/></td>';
					if (data.list[i].change[j].wanGuanSheXianGuoCheng_l5 == "符合") {
						$str+='<td align="center"><select name="wanGuanSheXianGuoCheng_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="wanGuanSheXianGuoCheng_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianGuoCheng_l6" value="'+data.list[i].change[j].wanGuanSheXianGuoCheng_l6+'"/></td>';
					if (data.list[i].change[j].wanGuanSheXianGuoCheng_l7 == "符合") {
						$str+='<td align="center"><select name="wanGuanSheXianGuoCheng_l7"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="wanGuanSheXianGuoCheng_l7"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#wanGuan_sheXianGuoCheng").before($str);
				}
			}
		}

		if(data.list[i].name == "wanGuanChaoShengBo"){
			$("input[name='wanGuanChaoShengBo_a1'][value='"+data.list[i].wanGuanChaoShengBo_a1+"']").attr("checked",true); 
			$("input[name='wanGuanChaoShengBo_a2'][value='"+data.list[i].wanGuanChaoShengBo_a2+"']").attr("checked",true);
			$("input[name='wanGuanChaoShengBo_a3'][value='"+data.list[i].wanGuanChaoShengBo_a3+"']").attr("checked",true);
			$("input[name='wanGuanChaoShengBo_a4'][value='"+data.list[i].wanGuanChaoShengBo_a4+"']").attr("checked",true);
			$("input[name='wanGuanChaoShengBo_b1'][value='"+data.list[i].wanGuanChaoShengBo_b1+"']").attr("checked",true);
			
			$("input[name='wanGuanChaoShengBo_l1']").val(data.list[i].change[0].wanGuanChaoShengBo_l1);
			$("input[name='wanGuanChaoShengBo_l2']").val(data.list[i].change[0].wanGuanChaoShengBo_l2);
			$("input[name='wanGuanChaoShengBo_l3']").val(data.list[i].change[0].wanGuanChaoShengBo_l3);
			$("input[name='wanGuanChaoShengBo_l4']").val(data.list[i].change[0].wanGuanChaoShengBo_l4);
			$("input[name='wanGuanChaoShengBo_l5']").val(data.list[i].change[0].wanGuanChaoShengBo_l5);
			
			$("input[name='wanGuanChaoShengBo_ll1']").val(data.list[i].change2[0].wanGuanChaoShengBo_ll1);
			$("input[name='wanGuanChaoShengBo_ll2']").val(data.list[i].change2[0].wanGuanChaoShengBo_ll2);
			$("input[name='wanGuanChaoShengBo_ll3']").val(data.list[i].change2[0].wanGuanChaoShengBo_ll3);
			$("select[name='wanGuanChaoShengBo_ll4']").val(data.list[i].change2[0].wanGuanChaoShengBo_ll4);
			$("select[name='wanGuanChaoShengBo_ll5']").val(data.list[i].change2[0].wanGuanChaoShengBo_ll5);
			$("input[name='wanGuanChaoShengBo_ll6']").val(data.list[i].change2[0].wanGuanChaoShengBo_ll6);
			$("input[name='wanGuanChaoShengBo_ll7']").val(data.list[i].change2[0].wanGuanChaoShengBo_ll7);
			$("input[name='wanGuanChaoShengBo_c1']").val(data.list[i].wanGuanChaoShengBo_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_l1" value="'+data.list[i].change[j].wanGuanChaoShengBo_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_l2" value="'+data.list[i].change[j].wanGuanChaoShengBo_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_l3" value="'+data.list[i].change[j].wanGuanChaoShengBo_l3+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanChaoShengBo_l4" value="'+data.list[i].change[j].wanGuanChaoShengBo_l4+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanChaoShengBo_l5" value="'+data.list[i].change[j].wanGuanChaoShengBo_l5+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#wanGuanChaoShengBo1").before($str);
				}
			}
			if (data.list[i].change2[0].length>1) {
				for(var j=1;j<data.list[i].change2[0].length;j++){
					  $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_ll1" value="'+data.list[i].change2[j].wanGuanChaoShengBo_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_ll2" value="'+data.list[i].change2[j].wanGuanChaoShengBo_ll2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_ll3" value="'+data.list[i].change2[j].wanGuanChaoShengBo_ll3+'"/></td>';
						if(data.list[i].change2[j].wanGuanChaoShengBo_ll4=="符合"){
							$str+='<td align="center"><select name="wanGuanChaoShengBo_ll4" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="wanGuanChaoShengBo_ll4" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change2[j].wanGuanChaoShengBo_ll5=="符合"){
							$str+='<td align="center"><select name="wanGuanChaoShengBo_ll5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="wanGuanChaoShengBo_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_ll6" value="'+data.list[i].change2[j].wanGuanChaoShengBo_ll6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_ll7" value="'+data.list[i].change2[j].wanGuanChaoShengBo_ll7+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#wanGuanChaoShengBo2").before($str);
				}
			}
		}

		if(data.list[i].name == "wanGuanCiFenJianCe"){//阀门 磁粉检测
			$("input[name='wanGuanCiFenJianCe_a1'][value='"+data.list[i].wanGuanCiFenJianCe_a1+"']").attr("checked",true); 
			$("input[name='wanGuanCiFenJianCe_a2'][value='"+data.list[i].wanGuanCiFenJianCe_a2+"']").attr("checked",true);
			$("input[name='wanGuanCiFenJianCe_a3'][value='"+data.list[i].wanGuanCiFenJianCe_a3+"']").attr("checked",true);
			$("input[name='wanGuanCiFenJianCe_a4'][value='"+data.list[i].wanGuanCiFenJianCe_a4+"']").attr("checked",true);
			$("input[name='wanGuanCiFenJianCe_b1'][value='"+data.list[i].wanGuanCiFenJianCe_b1+"']").attr("checked",true);
			
			$("input[name='wanGuanCiFenJianCe_l1']").val(data.list[i].change[0].wanGuanCiFenJianCe_l1);
			$("input[name='wanGuanCiFenJianCe_l2']").val(data.list[i].change[0].wanGuanCiFenJianCe_l2);
			$("input[name='wanGuanCiFenJianCe_l3']").val(data.list[i].change[0].wanGuanCiFenJianCe_l3);
			$("input[name='wanGuanCiFenJianCe_l4']").val(data.list[i].change[0].wanGuanCiFenJianCe_l4);
			$("input[name='wanGuanCiFenJianCe_l5']").val(data.list[i].change[0].wanGuanCiFenJianCe_l5);
			
			$("input[name='wanGuanCiFenJianCe_ll1']").val(data.list[i].change2[0].wanGuanCiFenJianCe_ll1);
			$("input[name='wanGuanCiFenJianCe_ll2']").val(data.list[i].change2[0].wanGuanCiFenJianCe_ll2);
			$("input[name='wanGuanCiFenJianCe_ll3']").val(data.list[i].change2[0].wanGuanCiFenJianCe_ll3);
			$("select[name='wanGuanCiFenJianCe_ll4']").val(data.list[i].change2[0].wanGuanCiFenJianCe_ll4);
			$("select[name='wanGuanCiFenJianCe_ll5']").val(data.list[i].change2[0].wanGuanCiFenJianCe_ll5);
			$("input[name='wanGuanCiFenJianCe_ll6']").val(data.list[i].change2[0].wanGuanCiFenJianCe_ll6);
			$("input[name='wanGuanCiFenJianCe_c1']").val(data.list[i].wanGuanCiFenJianCe_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_l1" value="'+data.list[i].change[j].wanGuanCiFenJianCe_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_l2" value="'+data.list[i].change[j].wanGuanCiFenJianCe_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_l3" value="'+data.list[i].change[j].wanGuanCiFenJianCe_l3+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_l4" value="'+data.list[i].change[j].wanGuanCiFenJianCe_l4+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_l5" value="'+data.list[i].change[j].wanGuanCiFenJianCe_l5+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#wanGuanCiFenJianCe1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_ll1" value="'+data.list[i].change2[j].wanGuanCiFenJianCe_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_ll2" value="'+data.list[i].change2[j].wanGuanCiFenJianCe_ll5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_ll3" value="'+data.list[i].change2[j].wanGuanCiFenJianCe_ll3+'"/></td>';
						if(data.list[i].change2[j].wanGuanCiFenJianCe_ll4=="符合"){
							$str+='<td align="center"><select name="wanGuanCiFenJianCe_ll4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="wanGuanCiFenJianCe_ll4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change2[j].wanGuanCiFenJianCe_ll5=="符合"){
							$str+='<td align="center"><select name="wanGuanCiFenJianCe_ll5" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="wanGuanCiFenJianCe_ll5" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_ll6" value="'+data.list[i].change2[j].wanGuanCiFenJianCe_ll6+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#wanGuanCiFenJianCe2").before($str);
				}
			}
		}

		if(data.list[i].name == "wanGuanShenTouJianCe"){//阀门 渗透检测
			$("input[name='wanGuanShenTouJianCe_a1'][value='"+data.list[i].wanGuanShenTouJianCe_a1+"']").attr("checked",true); 
			$("input[name='wanGuanShenTouJianCe_a2'][value='"+data.list[i].wanGuanShenTouJianCe_a2+"']").attr("checked",true);
			$("input[name='wanGuanShenTouJianCe_a3'][value='"+data.list[i].wanGuanShenTouJianCe_a3+"']").attr("checked",true);
			$("input[name='wanGuanShenTouJianCe_b1'][value='"+data.list[i].wanGuanShenTouJianCe_b1+"']").attr("checked",true);
			
			$("input[name='wanGuanShenTouJianCe_l1']").val(data.list[i].change[0].wanGuanShenTouJianCe_l1);
			$("input[name='wanGuanShenTouJianCe_l2']").val(data.list[i].change[0].wanGuanShenTouJianCe_l2);
			$("input[name='wanGuanShenTouJianCe_l3']").val(data.list[i].change[0].wanGuanShenTouJianCe_l3);
			$("input[name='wanGuanShenTouJianCe_l4']").val(data.list[i].change[0].wanGuanShenTouJianCe_l4);
			
			$("input[name='wanGuanShenTouJianCe_ll1']").val(data.list[i].change2[0].wanGuanShenTouJianCe_ll1);
			$("input[name='wanGuanShenTouJianCe_ll2']").val(data.list[i].change2[0].wanGuanShenTouJianCe_ll2);
			$("input[name='wanGuanShenTouJianCe_ll3']").val(data.list[i].change2[0].wanGuanShenTouJianCe_ll3);
			$("input[name='wanGuanShenTouJianCe_ll4']").val(data.list[i].change2[0].wanGuanShenTouJianCe_ll4);
			$("select[name='wanGuanShenTouJianCe_ll5']").val(data.list[i].change2[0].wanGuanShenTouJianCe_ll5);
			$("input[name='wanGuanShenTouJianCe_ll6']").val(data.list[i].change2[0].wanGuanShenTouJianCe_ll6);
			$("input[name='wanGuanShenTouJianCe_c1']").val(data.list[i].wanGuanShenTouJianCe_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					  $str='';
				        $str+='<tr>';
				        $str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_l1" value="'+data.list[i].change[j].wanGuanShenTouJianCe_l1+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_l2" value="'+data.list[i].change[j].wanGuanShenTouJianCe_l2+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_l3" value="'+data.list[i].change[j].wanGuanShenTouJianCe_l3+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_l4" value="'+data.list[i].change[j].wanGuanShenTouJianCe_l4+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#wanGuanShenTouJianCe1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_ll1" value="'+data.list[i].change2[j].wanGuanShenTouJianCe_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_ll2" value="'+data.list[i].change2[j].wanGuanShenTouJianCe_ll2+'" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_ll3" value="'+data.list[i].change2[j].wanGuanShenTouJianCe_ll3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_ll4" value="'+data.list[i].change2[j].wanGuanShenTouJianCe_ll4+'"/></td>';
						if(data.list[i].change2[j].wanGuanShenTouJianCe_ll5=="符合"){
							$str+='<td align="center"><select name="wanGuanShenTouJianCe_ll5" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="wanGuanShenTouJianCe_ll5" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_ll6" value="'+data.list[i].change2[j].wanGuanShenTouJianCe_ll6+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#wanGuanShenTouJianCe2").before($str);
				}
			}
		}

		if(data.list[i].name == "wanGuanSheXianDiPian"){//
			$("input[name='wanGuanSheXianDiPian_a1'][value='"+data.list[i].wanGuanSheXianDiPian_a1+"']").attr("checked",true); 
			$("input[name='wanGuanSheXianDiPian_a2'][value='"+data.list[i].wanGuanSheXianDiPian_a2+"']").attr("checked",true);
			$("input[name='wanGuanSheXianDiPian_a3'][value='"+data.list[i].wanGuanSheXianDiPian_a3+"']").attr("checked",true);
			$("input[name='wanGuanSheXianDiPian_a4'][value='"+data.list[i].wanGuanSheXianDiPian_a4+"']").attr("checked",true);
			$("input[name='wanGuanSheXianDiPian_b1']").val(data.list[i].wanGuanSheXianDiPian_b1);
			$("input[name='wanGuanSheXianDiPian_l1']").val(data.list[i].change[0].wanGuanSheXianDiPian_l1);
			$("input[name='wanGuanSheXianDiPian_l2']").val(data.list[i].change[0].wanGuanSheXianDiPian_l2);
			$("input[name='wanGuanSheXianDiPian_l3']").val(data.list[i].change[0].wanGuanSheXianDiPian_l3);
			$("input[name='wanGuanSheXianDiPian_l4']").val(data.list[i].change[0].wanGuanSheXianDiPian_l4);
			$("input[name='wanGuanSheXianDiPian_l5']").val(data.list[i].change[0].wanGuanSheXianDiPian_l5);
			$("input[name='wanGuanSheXianDiPian_l6']").val(data.list[i].change[0].wanGuanSheXianDiPian_l6);
			$("input[name='wanGuanSheXianDiPian_l7']").val(data.list[i].change[0].wanGuanSheXianDiPian_l7);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l1"  value="'+data.list[i].change[j].wanGuanSheXianDiPian_l7+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l2"  value="'+data.list[i].change[j].wanGuanSheXianDiPian_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l3"  value="'+data.list[i].change[j].wanGuanSheXianDiPian_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l4"  value="'+data.list[i].change[j].wanGuanSheXianDiPian_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l5"  value="'+data.list[i].change[j].wanGuanSheXianDiPian_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l6"  value="'+data.list[i].change[j].wanGuanSheXianDiPian_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l7"  value="'+data.list[i].change[j].wanGuanSheXianDiPian_l7+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#wanGuanSheXianDiPian").before($str);
				}
			}
		}

		if(data.list[i].name == "wanGuanShuiYaShiYan"){// 管件  水压试验 
			$("input[name='wanGuanShuiYaShiYan_a1'][value='"+data.list[i].wanGuanShuiYaShiYan_a1+"']").attr("checked",true); 
			$("input[name='wanGuanShuiYaShiYan_a2'][value='"+data.list[i].wanGuanShuiYaShiYan_a2+"']").attr("checked",true);
			$("input[name='wanGuanShuiYaShiYan_a3'][value='"+data.list[i].wanGuanShuiYaShiYan_a3+"']").attr("checked",true);
			$("input[name='wanGuanShuiYaShiYan_a4'][value='"+data.list[i].wanGuanShuiYaShiYan_a4+"']").attr("checked",true);
			$("input[name='wanGuanShuiYaShiYan_l1']").val(data.list[i].change[0].wanGuanShuiYaShiYan_l1);
			$("input[name='wanGuanShuiYaShiYan_l2']").val(data.list[i].change[0].wanGuanShuiYaShiYan_l2);
			$("input[name='wanGuanShuiYaShiYan_l3']").val(data.list[i].change[0].wanGuanShuiYaShiYan_l3);
			$("input[name='wanGuanShuiYaShiYan_l4']").val(data.list[i].change[0].wanGuanShuiYaShiYan_l4);
			$("input[name='wanGuanShuiYaShiYan_l5']").val(data.list[i].change[0].wanGuanShuiYaShiYan_l5);
			$("select[name='wanGuanShuiYaShiYan_l6']").val(data.list[i].change[0].wanGuanShuiYaShiYan_l6);
			$("input[name='wanGuanShuiYaShiYan_l7']").val(data.list[i].change[0].wanGuanShuiYaShiYan_l7);
			$("input[name='wanGuanShuiYaShiYan_l8']").val(data.list[i].change[0].wanGuanShuiYaShiYan_l8);
			$("input[name='wanGuanShuiYaShiYan_b1']").val(data.list[i].wanGuanShuiYaShiYan_b1);
			$("input[name='wanGuanShuiYaShiYan_b2']").val(data.list[i].wanGuanShuiYaShiYan_b2);
			$("input[name='wanGuanShuiYaShiYan_b3']").val(data.list[i].wanGuanShuiYaShiYan_b3);
			$("input[name='wanGuanShuiYaShiYan_b4']").val(data.list[i].wanGuanShuiYaShiYan_b4);
			$("input[name='wanGuanShuiYaShiYan_b5']").val(data.list[i].wanGuanShuiYaShiYan_b5);
			$("input[name='wanGuanShuiYaShiYan_b6']").val(data.list[i].wanGuanShuiYaShiYan_b6);
			$("input[name='wanGuanShuiYaShiYan_b7']").val(data.list[i].wanGuanShuiYaShiYan_b7);
			$("input[name='wanGuanShuiYaShiYan_c1']").val(data.list[i].wanGuanShuiYaShiYan_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l1" value="'+data.list[i].change[j].wanGuanShuiYaShiYan_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l2" value="'+data.list[i].change[j].wanGuanShuiYaShiYan_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l3" value="'+data.list[i].change[j].wanGuanShuiYaShiYan_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l4" value="'+data.list[i].change[j].wanGuanShuiYaShiYan_l4+'"/></td>';
					if(data.list[i].change[j].wanGuanShuiYaShiYan_l5 == "符合"){
						$str+='<td align="center"><select name="wanGuanShuiYaShiYan_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="wanGuanShuiYaShiYan_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l6" value="'+data.list[i].change[j].wanGuanShuiYaShiYan_l7+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l7" value="'+data.list[i].change[j].wanGuanShuiYaShiYan_l7+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l8" value="'+data.list[i].change[j].wanGuanShuiYaShiYan_l8+'"/></td>';
					$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#wanGuan_shuiYaShiYan").before($str);
				}
			}
		}

		if(data.list[i].name == "wanGuanFang"){
			$("input[name='wanGuanFang_a1'][value='"+data.list[i].wanGuanFang_a1+"']").attr("checked",true); 
			$("input[name='wanGuanFang_a2'][value='"+data.list[i].wanGuanFang_a2+"']").attr("checked",true);
			$("input[name='wanGuanFang_b1']").val(data.list[i].wanGuanFang_b1);
			$("input[name='wanGuanFang_b2']").val(data.list[i].wanGuanFang_b2);
			$("input[name='wanGuanFang_b3']").val(data.list[i].wanGuanFang_b3);
			$("input[name='wanGuanFang_b4']").val(data.list[i].wanGuanFang_b4);
			$("input[name='wanGuanFang_b5']").val(data.list[i].wanGuanFang_b5);
			$("input[name='wanGuanFang_b6']").val(data.list[i].wanGuanFang_b6);
			$("input[name='wanGuanFang_b7']").val(data.list[i].wanGuanFang_b7);
		}

		if(data.list[i].name == "wanGuanQingJie"){//弯管 弯管清洁
			$("input[name='wanGuanQingJie_l1']").val(data.list[i].change[0].wanGuanQingJie_l1);
			$("input[name='wanGuanQingJie_l2']").val(data.list[i].change[0].wanGuanQingJie_l2);
			$("input[name='wanGuanQingJie_l3']").val(data.list[i].change[0].wanGuanQingJie_l3);
			$("input[name='wanGuanQingJie_l4']").val(data.list[i].change[0].wanGuanQingJie_l4);
			$("input[name='wanGuanQingJie_l5']").val(data.list[i].change[0].wanGuanQingJie_l5);
			$("input[name='wanGuanQingJie_l6']").val(data.list[i].change[0].wanGuanQingJie_l6);
			$("input[name='wanGuanQingJie_l7']").val(data.list[i].change[0].wanGuanQingJie_l7);
			$("input[name='wanGuanQingJie_a1']").val(data.list[i].wanGuanQingJie_a1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l1" value="'+data.list[i].change[j].wanGuanQingJie_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l2" value="'+data.list[i].change[j].wanGuanQingJie_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l3" value="'+data.list[i].change[j].wanGuanQingJie_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l4" value="'+data.list[i].change[j].wanGuanQingJie_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l5" value="'+data.list[i].change[j].wanGuanQingJie_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l6" value="'+data.list[i].change[j].wanGuanQingJie_l6+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l7" value="'+data.list[i].change[j].wanGuanQingJie_l7+'"/></td>';
					$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#wanGuan_qingJie").before($str);
				}
			}
		}
		if(data.list[i].name == "wanGuanTuFu"){//弯管 弯管涂覆
			$("input[name='wanGuanTuFu_a1'][value='"+data.list[i].wanGuanTuFu_a1+"']").attr("checked",true); 
			$("input[name='wanGuanTuFu_a2'][value='"+data.list[i].wanGuanTuFu_a2+"']").attr("checked",true);
			$("input[name='wanGuanTuFu_l1']").val(data.list[i].change[0].wanGuanTuFu_l1);
			$("input[name='wanGuanTuFu_l2']").val(data.list[i].change[0].wanGuanTuFu_l2);
			$("input[name='wanGuanTuFu_l3']").val(data.list[i].change[0].wanGuanTuFu_l3);
			$("input[name='wanGuanTuFu_l4']").val(data.list[i].change[0].wanGuanTuFu_l4);
			$("input[name='wanGuanTuFu_l5']").val(data.list[i].change[0].wanGuanTuFu_l5);
			$("input[name='wanGuanTuFu_l6']").val(data.list[i].change[0].wanGuanTuFu_l6);
			$("input[name='wanGuanTuFu_b1']").val(data.list[i].wanGuanTuFu_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l1" value="'+data.list[i].change[j].wanGuanTuFu_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l2" value="'+data.list[i].change[j].wanGuanTuFu_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l3" value="'+data.list[i].change[j].wanGuanTuFu_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l4" value="'+data.list[i].change[j].wanGuanTuFu_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l5" value="'+data.list[i].change[j].wanGuanTuFu_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l6" value="'+data.list[i].change[j].wanGuanTuFu_l6+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#wanGuan_tuFu").before($str);
				}
			}
		}

		if(data.list[i].name == "wanGuanXingNeng"){//弯管 防腐层性能检验
			$("input[name='wanGuanXingNeng_a1'][value='"+data.list[i].wanGuanXingNeng_a1+"'").attr("checked",true); 
			$("input[name='wanGuanXingNeng_a2'][value='"+data.list[i].wanGuanXingNeng_a2+"'").attr("checked",true);
			$("input[name='wanGuanXingNeng_l1']").val(data.list[i].change[0].wanGuanXingNeng_l1);
			$("input[name='wanGuanXingNeng_l2']").val(data.list[i].change[0].wanGuanXingNeng_l2);
			$("input[name='wanGuanXingNeng_l3']").val(data.list[i].change[0].wanGuanXingNeng_l3);
			$("input[name='wanGuanXingNeng_l4']").val(data.list[i].change[0].wanGuanXingNeng_l4);
			$("input[name='wanGuanXingNeng_l5']").val(data.list[i].change[0].wanGuanXingNeng_l5);
			$("input[name='wanGuanXingNeng_l6']").val(data.list[i].change[0].wanGuanXingNeng_l6);
			$("input[name='wanGuanXingNeng_l7']").val(data.list[i].change[0].wanGuanXingNeng_l7);
			$("input[name='wanGuanXingNeng_l8']").val(data.list[i].change[0].wanGuanXingNeng_l8);
			$("input[name='wanGuanXingNeng_l9']").val(data.list[i].change[0].wanGuanXingNeng_l9);
			$("input[name='wanGuanXingNeng_b1']").val(data.list[i].wanGuanXingNeng_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l1" value="'+data.list[i].change[j].wanGuanXingNeng_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l2" value="'+data.list[i].change[j].wanGuanXingNeng_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l3" value="'+data.list[i].change[j].wanGuanXingNeng_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l4" value="'+data.list[i].change[j].wanGuanXingNeng_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l5" value="'+data.list[i].change[j].wanGuanXingNeng_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l6" value="'+data.list[i].change[j].wanGuanXingNeng_l6+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l7" value="'+data.list[i].change[j].wanGuanXingNeng_l7+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l8" value="'+data.list[i].change[j].wanGuanXingNeng_l8+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l9" value="'+data.list[i].change[j].wanGuanXingNeng_l9+'"/></td>';
					$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#wanGuan_xingNeng").before($str);
				}
			}
		}
		if(data.list[i].name == "wanGuanWaiGuan"){//弯管 防腐层外观尺寸
			$("input[name='wanGuanWaiGuan_a2'][value='"+data.list[i].wanGuanWaiGuan_a2+"']").attr("checked",true);
			$("input[name='wanGuanWaiGuan_a3'][value='"+data.list[i].wanGuanWaiGuan_a3+"']").attr("checked",true); 
			$("input[name='wanGuanWaiGuan_a4'][value='"+data.list[i].wanGuanWaiGuan_a4+"']").attr("checked",true);
			$("input[name='wanGuanWaiGuan_a1']").val(data.list[i].wanGuanWaiGuan_a1);
			$("input[name='wanGuanWaiGuan_l1']").val(data.list[i].change[0].wanGuanWaiGuan_l1);
			$("input[name='wanGuanWaiGuan_l2']").val(data.list[i].change[0].wanGuanWaiGuan_l2);
			$("input[name='wanGuanWaiGuan_l3']").val(data.list[i].change[0].wanGuanWaiGuan_l3);
			$("input[name='wanGuanWaiGuan_l4']").val(data.list[i].change[0].wanGuanWaiGuan_l4);
			$("input[name='wanGuanWaiGuan_l5']").val(data.list[i].change[0].wanGuanWaiGuan_l5);
			$("input[name='wanGuanWaiGuan_l6']").val(data.list[i].change[0].wanGuanWaiGuan_l6);
			$("input[name='wanGuanWaiGuan_l7']").val(data.list[i].change[0].wanGuanWaiGuan_l7);
			$("input[name='wanGuanWaiGuan_l8']").val(data.list[i].change[0].wanGuanWaiGuan_l8);
			$("input[name='wanGuanWaiGuan_b1']").val(data.list[i].wanGuanWaiGuan_b1);
			$("input[name='wanGuanWaiGuan_b2']").val(data.list[i].wanGuanWaiGuan_b2);
			$("input[name='wanGuanWaiGuan_b3']").val(data.list[i].wanGuanWaiGuan_b3);
			$("input[name='wanGuanWaiGuan_b4']").val(data.list[i].wanGuanWaiGuan_b4);
			$("input[name='wanGuanWaiGuan_b5']").val(data.list[i].wanGuanWaiGuan_b5);
			$("input[name='wanGuanWaiGuan_b6']").val(data.list[i].wanGuanWaiGuan_b6);
			$("input[name='wanGuanWaiGuan_b7']").val(data.list[i].wanGuanWaiGuan_b7);
			$("input[name='wanGuanWaiGuan_c1']").val(data.list[i].wanGuanWaiGuan_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l1" value="'+data.list[i].change[j].wanGuanWaiGuan_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l2" value="'+data.list[i].change[j].wanGuanWaiGuan_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l3" value="'+data.list[i].change[j].wanGuanWaiGuan_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l4" value="'+data.list[i].change[j].wanGuanWaiGuan_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l5" value="'+data.list[i].change[j].wanGuanWaiGuan_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l6" value="'+data.list[i].change[j].wanGuanWaiGuan_l6+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l7" value="'+data.list[i].change[j].wanGuanWaiGuan_l7+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l8" value="'+data.list[i].change[j].wanGuanWaiGuan_l8+'"/></td>';
					$str+='<td align="center"><</td>';
				    $str+='</tr>';
				    $("#wanGuan_waiGuan").before($str);
				}
			}
		}

		if(data.list[i].name == "wanGuanDui"){//弯管 防腐层外观尺寸
			$("input[name='wanGuanDui_a1']").val(data.list[i].wanGuanDui_a1);
			$("input[name='wanGuanDui_a2']").val(data.list[i].wanGuanDui_a2);
			$("input[name='wanGuanDui_a3'][value='"+data.list[i].wanGuanDui_a3+"']").attr("checked",true); 
			$("input[name='wanGuanDui_a4'][value='"+data.list[i].wanGuanDui_a4+"']").attr("checked",true);
			$("input[name='wanGuanDui_a5'][value='"+data.list[i].wanGuanDui_a5+"']").attr("checked",true); 
			$("input[name='wanGuanDui_a6'][value='"+data.list[i].wanGuanDui_a6+"']").attr("checked",true);
			$("input[name='wanGuanDui_a7']").val(data.list[i].wanGuanDui_a7);
		}

		if(data.list[i].name == "wanGuanBaoZhuang"){//弯管 包装发运
			$("input[name='wanGuanBaoZhuang_a1'][value='"+data.list[i].wanGuanBaoZhuang_a1+"']").attr("checked",true); 
			$("input[name='wanGuanBaoZhuang_a2'][value='"+data.list[i].wanGuanBaoZhuang_a2+"']").attr("checked",true);
			$("input[name='wanGuanBaoZhuang_l1']").val(data.list[i].change[0].wanGuanBaoZhuang_l1);
			$("input[name='wanGuanBaoZhuang_l2']").val(data.list[i].change[0].wanGuanBaoZhuang_l2);
			$("select[name='wanGuanBaoZhuang_l3'").val(data.list[i].change[0].wanGuanBaoZhuang_l3);
			$("select[name='wanGuanBaoZhuang_l4'").val(data.list[i].change[0].wanGuanBaoZhuang_l4);
			$("select[name='wanGuanBaoZhuang_l5'").val(data.list[i].change[0].wanGuanBaoZhuang_l5);
			$("select[name='wanGuanBaoZhuang_l6'").val(data.list[i].change[0].wanGuanBaoZhuang_l6);
			$("select[name='wanGuanBaoZhuang_l7'").val(data.list[i].change[0].wanGuanBaoZhuang_l7);
			$("input[name='wanGuanBaoZhuang_b1']").val(data.list[i].wanGuanBaoZhuang_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanBaoZhuang_l1" value="'+data.list[i].change[j].wanGuanBaoZhuang_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanBaoZhuang_l2" value="'+data.list[i].change[j].wanGuanBaoZhuang_l2+'"/></td>';
						if(data.list[i].change[j].wanGuanBaoZhuang_l3=="防腐"){
							$str+='<td align="center"><select name="wanGuanBaoZhuang_l3"><option value="防腐" selected>防腐</option><option value="光管">光管</option></select></td>';
						}else{
							$str+='<td align="center"><select name="wanGuanBaoZhuang_l3"><option value="防腐">防腐</option><option value="光管" selected>光管</option></select></td>';
						}
						if(data.list[i].change[j].wanGuanBaoZhuang_l4=="符合"){
							$str+='<td align="center"><select name="wanGuanBaoZhuang_l4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="wanGuanBaoZhuang_l4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].wanGuanBaoZhuang_l5=="符合"){
							$str+='<td align="center"><select name="wanGuanBaoZhuang_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="wanGuanBaoZhuang_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].wanGuanBaoZhuang_l6=="符合"){
							$str+='<td align="center"><select name="wanGuanBaoZhuang_l6"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="wanGuanBaoZhuang_l6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].wanGuanBaoZhuang_l7=="符合"){
							$str+='<td align="center"><select name="wanGuanBaoZhuang_l7"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="wanGuanBaoZhuang_l7"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#wanGuan_baoZhuang").before($str);
				}
			}
		}

		if(data.list[i].name == "wanGuanHuaXue"){//弯管 
			$("input[name='wanGuanHuaXue_a1'][value='"+data.list[i].wanGuanHuaXue_a1+"']").attr("checked",true); 
			$("input[name='wanGuanHuaXue_a2'][value='"+data.list[i].wanGuanHuaXue_a2+"']").attr("checked",true);
			$("input[name='wanGuanHuaXue_a3'][value='"+data.list[i].wanGuanHuaXue_a3+"']").attr("checked",true); 
			$("input[name='wanGuanHuaXue_a4'][value='"+data.list[i].wanGuanHuaXue_a4+"']").attr("checked",true);
			$("input[name='wanGuanHuaXue_b1']").val(data.list[i].wanGuanHuaXue_b1);
			$("input[name='wanGuanHuaXue_b2']").val(data.list[i].wanGuanHuaXue_b2);
			$("input[name='wanGuanHuaXue_b3']").val(data.list[i].wanGuanHuaXue_b3);
			$("input[name='wanGuanHuaXue_b4']").val(data.list[i].wanGuanHuaXue_b4);
			$("input[name='wanGuanHuaXue_b5']").val(data.list[i].wanGuanHuaXue_b5);
			$("input[name='wanGuanHuaXue_b6']").val(data.list[i].wanGuanHuaXue_b6);
			$("input[name='wanGuanHuaXue_b7']").val(data.list[i].wanGuanHuaXue_b7);
			$("input[name='wanGuanHuaXue_b8']").val(data.list[i].wanGuanHuaXue_b8);
			$("input[name='wanGuanHuaXue_b9']").val(data.list[i].wanGuanHuaXue_b9);
		}

		if(data.list[i].name == "wanGuanLaShen"){//弯管 
			$("input[name='wanGuanLaShen_a1'][value='"+data.list[i].wanGuanLaShen_a1+"'").attr("checked",true); 
			$("input[name='wanGuanLaShen_a2'][value='"+data.list[i].wanGuanLaShen_a2+"'").attr("checked",true);
			$("input[name='wanGuanLaShen_a3'][value='"+data.list[i].wanGuanLaShen_a3+"'").attr("checked",true); 
			$("input[name='wanGuanLaShen_a4'][value='"+data.list[i].wanGuanLaShen_a4+"'").attr("checked",true);
			$("input[name='wanGuanLaShen_a5']").val(data.list[i].wanGuanLaShen_a5);
			$("input[name='wanGuanLaShen_a6']").val(data.list[i].wanGuanLaShen_a6);
			$("input[name='wanGuanLaShen_b1']").val(data.list[i].wanGuanLaShen_b1);
			$("input[name='wanGuanLaShen_b2']").val(data.list[i].wanGuanLaShen_b2);
			$("input[name='wanGuanLaShen_b3']").val(data.list[i].wanGuanLaShen_b3);
			$("input[name='wanGuanLaShen_b4']").val(data.list[i].wanGuanLaShen_b4);
			$("input[name='wanGuanLaShen_b5']").val(data.list[i].wanGuanLaShen_b5);
			$("input[name='wanGuanLaShen_b6']").val(data.list[i].wanGuanLaShen_b6);
			$("input[name='wanGuanLaShen_b7']").val(data.list[i].wanGuanLaShen_b7);
			$("input[name='wanGuanLaShen_b8']").val(data.list[i].wanGuanLaShen_b8);
			$("input[name='wanGuanLaShen_c1']").val(data.list[i].wanGuanLaShen_c1);
			$("input[name='wanGuanLaShen_c2']").val(data.list[i].wanGuanLaShen_c2);
			$("input[name='wanGuanLaShen_c3']").val(data.list[i].wanGuanLaShen_c3);
			$("input[name='wanGuanLaShen_c4']").val(data.list[i].wanGuanLaShen_c4);
			$("input[name='wanGuanLaShen_c5']").val(data.list[i].wanGuanLaShen_c5);
			$("input[name='wanGuanLaShen_c6']").val(data.list[i].wanGuanLaShen_c6);
			$("input[name='wanGuanLaShen_c7']").val(data.list[i].wanGuanLaShen_c7);
			$("input[name='wanGuanLaShen_c8']").val(data.list[i].wanGuanLaShen_c8);
			$("input[name='wanGuanLaShen_d1']").val(data.list[i].wanGuanLaShen_d1);
			$("input[name='wanGuanLaShen_d2']").val(data.list[i].wanGuanLaShen_d2);
			$("input[name='wanGuanLaShen_d3']").val(data.list[i].wanGuanLaShen_d3);
			$("input[name='wanGuanLaShen_d4']").val(data.list[i].wanGuanLaShen_d4);
			$("input[name='wanGuanLaShen_d5']").val(data.list[i].wanGuanLaShen_d5);
			$("input[name='wanGuanLaShen_d6']").val(data.list[i].wanGuanLaShen_d6);
			$("input[name='wanGuanLaShen_d7']").val(data.list[i].wanGuanLaShen_d7);
			$("input[name='wanGuanLaShen_d8']").val(data.list[i].wanGuanLaShen_d8);
			$("input[name='wanGuanLaShen_e1']").val(data.list[i].wanGuanLaShen_e1);
			$("input[name='wanGuanLaShen_e2']").val(data.list[i].wanGuanLaShen_e2);
			$("input[name='wanGuanLaShen_e3']").val(data.list[i].wanGuanLaShen_e3);
			$("input[name='wanGuanLaShen_e4']").val(data.list[i].wanGuanLaShen_e4);
			$("input[name='wanGuanLaShen_e5']").val(data.list[i].wanGuanLaShen_e5);
			$("input[name='wanGuanLaShen_e6']").val(data.list[i].wanGuanLaShen_e6);
			$("input[name='wanGuanLaShen_e7']").val(data.list[i].wanGuanLaShen_e7);
			$("input[name='wanGuanLaShen_e8']").val(data.list[i].wanGuanLaShen_e8);
			$("input[name='wanGuanLaShen_f1']").val(data.list[i].wanGuanLaShen_f1);
			$("input[name='wanGuanLaShen_f2']").val(data.list[i].wanGuanLaShen_f2);
			$("input[name='wanGuanLaShen_f3']").val(data.list[i].wanGuanLaShen_f3);
			$("input[name='wanGuanLaShen_f4']").val(data.list[i].wanGuanLaShen_f4);
			$("input[name='wanGuanLaShen_f5']").val(data.list[i].wanGuanLaShen_f5);
			$("input[name='wanGuanLaShen_f6']").val(data.list[i].wanGuanLaShen_f6);
			$("input[name='wanGuanLaShen_f7']").val(data.list[i].wanGuanLaShen_f7);
			$("input[name='wanGuanLaShen_f8']").val(data.list[i].wanGuanLaShen_f8);
			$("input[name='wanGuanLaShen_f9']").val(data.list[i].wanGuanLaShen_f9);
		}

		if(data.list[i].name == "wanGuanChongJi"){//弯管 
			$("input[name='wanGuanChongJi_a1'][value='"+data.list[i].wanGuanChongJi_a1+"']").attr("checked",true); 
			$("input[name='wanGuanChongJi_a2'][value='"+data.list[i].wanGuanChongJi_a2+"']").attr("checked",true);
			$("input[name='wanGuanChongJi_a3'][value='"+data.list[i].wanGuanChongJi_a3+"']").attr("checked",true); 
			$("input[name='wanGuanChongJi_a4'][value='"+data.list[i].wanGuanChongJi_a4+"']").attr("checked",true);
			$("input[name='wanGuanChongJi_a5']").val(data.list[i].wanGuanChongJi_a5);
			$("input[name='wanGuanChongJi_a6']").val(data.list[i].wanGuanChongJi_a6);
			$("input[name='wanGuanChongJi_a7']").val(data.list[i].wanGuanChongJi_a7);
			$("input[name='wanGuanChongJi_b1']").val(data.list[i].wanGuanChongJi_b1);
			$("input[name='wanGuanChongJi_b2']").val(data.list[i].wanGuanChongJi_b2);
			$("input[name='wanGuanChongJi_b3']").val(data.list[i].wanGuanChongJi_b3);
			$("input[name='wanGuanChongJi_b4']").val(data.list[i].wanGuanChongJi_b4);
			$("input[name='wanGuanChongJi_b5']").val(data.list[i].wanGuanChongJi_b5);
			$("input[name='wanGuanChongJi_b6']").val(data.list[i].wanGuanChongJi_b6);
			$("input[name='wanGuanChongJi_b7']").val(data.list[i].wanGuanChongJi_b7);
			$("input[name='wanGuanChongJi_b8']").val(data.list[i].wanGuanChongJi_b8);
			$("input[name='wanGuanChongJi_c1']").val(data.list[i].wanGuanChongJi_c1);
			$("input[name='wanGuanChongJi_c2']").val(data.list[i].wanGuanChongJi_c2);
			$("input[name='wanGuanChongJi_c3']").val(data.list[i].wanGuanChongJi_c3);
			$("input[name='wanGuanChongJi_c4']").val(data.list[i].wanGuanChongJi_c4);
			$("input[name='wanGuanChongJi_c5']").val(data.list[i].wanGuanChongJi_c5);
			$("input[name='wanGuanChongJi_c6']").val(data.list[i].wanGuanChongJi_c6);
			$("input[name='wanGuanChongJi_c7']").val(data.list[i].wanGuanChongJi_c7);
			$("input[name='wanGuanChongJi_c8']").val(data.list[i].wanGuanChongJi_c8);
			$("input[name='wanGuanChongJi_d1']").val(data.list[i].wanGuanChongJi_d1);
			$("input[name='wanGuanChongJi_d2']").val(data.list[i].wanGuanChongJi_d2);
			$("input[name='wanGuanChongJi_d3']").val(data.list[i].wanGuanChongJi_d3);
			$("input[name='wanGuanChongJi_d4']").val(data.list[i].wanGuanChongJi_d4);
			$("input[name='wanGuanChongJi_d5']").val(data.list[i].wanGuanChongJi_d5);
			$("input[name='wanGuanChongJi_d6']").val(data.list[i].wanGuanChongJi_d6);
			$("input[name='wanGuanChongJi_d7']").val(data.list[i].wanGuanChongJi_d7);
			$("input[name='wanGuanChongJi_d8']").val(data.list[i].wanGuanChongJi_d8);
			$("input[name='wanGuanChongJi_e1']").val(data.list[i].wanGuanChongJi_e1);
			$("input[name='wanGuanChongJi_e2']").val(data.list[i].wanGuanChongJi_e2);
			$("input[name='wanGuanChongJi_e3']").val(data.list[i].wanGuanChongJi_e3);
			$("input[name='wanGuanChongJi_e4']").val(data.list[i].wanGuanChongJi_e4);
			$("input[name='wanGuanChongJi_e5']").val(data.list[i].wanGuanChongJi_e5);
			$("input[name='wanGuanChongJi_e6']").val(data.list[i].wanGuanChongJi_e6);
			$("input[name='wanGuanChongJi_e7']").val(data.list[i].wanGuanChongJi_e7);
			$("input[name='wanGuanChongJi_e8']").val(data.list[i].wanGuanChongJi_e8);
			$("input[name='wanGuanChongJi_f1']").val(data.list[i].wanGuanChongJi_f1);
			$("input[name='wanGuanChongJi_f2']").val(data.list[i].wanGuanChongJi_f2);
			$("input[name='wanGuanChongJi_f3']").val(data.list[i].wanGuanChongJi_f3);
			$("input[name='wanGuanChongJi_f4']").val(data.list[i].wanGuanChongJi_f4);
			$("input[name='wanGuanChongJi_f5']").val(data.list[i].wanGuanChongJi_f5);
			$("input[name='wanGuanChongJi_f6']").val(data.list[i].wanGuanChongJi_f6);
			$("input[name='wanGuanChongJi_f7']").val(data.list[i].wanGuanChongJi_f7);
			$("input[name='wanGuanChongJi_f8']").val(data.list[i].wanGuanChongJi_f8);
			$("input[name='wanGuanChongJi_f9']").val(data.list[i].wanGuanChongJi_f9);
		}

		if(data.list[i].name == "wanGuanHuaXue1"){//弯管 
			$("input[name='wanGuanHuaXue1_a1'][value='"+data.list[i].wanGuanHuaXue1_a1+"']").attr("checked",true); 
			$("input[name='wanGuanHuaXue1_a2'][value='"+data.list[i].wanGuanHuaXue1_a2+"']").attr("checked",true);
			$("input[name='wanGuanHuaXue1_a3'][value='"+data.list[i].wanGuanHuaXue1_a3+"']").attr("checked",true); 
			$("input[name='wanGuanHuaXue1_a4'][value='"+data.list[i].wanGuanHuaXue1_a4+"']").attr("checked",true);
			$("input[name='wanGuanHuaXue1_b1']").val(data.list[i].wanGuanHuaXue1_b1);
			$("input[name='wanGuanHuaXue1_b2']").val(data.list[i].wanGuanHuaXue1_b2);
			$("input[name='wanGuanHuaXue1_b3']").val(data.list[i].wanGuanHuaXue1_b3);
			$("input[name='wanGuanHuaXue1_b4']").val(data.list[i].wanGuanHuaXue1_b4);
			$("input[name='wanGuanHuaXue1_b5']").val(data.list[i].wanGuanHuaXue1_b5);
			$("input[name='wanGuanHuaXue1_b6']").val(data.list[i].wanGuanHuaXue1_b6);
			$("input[name='wanGuanHuaXue1_b7']").val(data.list[i].wanGuanHuaXue1_b7);
			$("input[name='wanGuanHuaXue1_b8']").val(data.list[i].wanGuanHuaXue1_b8);
			$("input[name='wanGuanHuaXue1_b9']").val(data.list[i].wanGuanHuaXue1_b9);
		}

		if(data.list[i].name == "wanGuanJinXiang"){//
			$("input[name='wanGuanJinXiang_a1'][value='"+data.list[i].wanGuanJinXiang_a1+"']").attr("checked",true); 
			$("input[name='wanGuanJinXiang_a2'][value='"+data.list[i].wanGuanJinXiang_a2+"']").attr("checked",true);
			$("input[name='wanGuanJinXiang_a3'][value='"+data.list[i].wanGuanJinXiang_a3+"']").attr("checked",true); 
			$("input[name='wanGuanJinXiang_a4'][value='"+data.list[i].wanGuanJinXiang_a4+"']").attr("checked",true);
			$("input[name='wanGuanJinXiang_b1']").val(data.list[i].wanGuanJinXiang_b1);
			$("input[name='wanGuanJinXiang_b2']").val(data.list[i].wanGuanJinXiang_b2);
			$("input[name='wanGuanJinXiang_b3']").val(data.list[i].wanGuanJinXiang_b3);
			$("input[name='wanGuanJinXiang_b4']").val(data.list[i].wanGuanJinXiang_b4);
			$("input[name='wanGuanJinXiang_c1']").val(data.list[i].wanGuanJinXiang_c1);
			$("input[name='wanGuanJinXiang_c2']").val(data.list[i].wanGuanJinXiang_c2);
			$("input[name='wanGuanJinXiang_c3']").val(data.list[i].wanGuanJinXiang_c3);
			$("input[name='wanGuanJinXiang_c4']").val(data.list[i].wanGuanJinXiang_c4);
			$("input[name='wanGuanJinXiang_d1']").val(data.list[i].wanGuanJinXiang_d1);
			$("input[name='wanGuanJinXiang_d2']").val(data.list[i].wanGuanJinXiang_d2);
			$("input[name='wanGuanJinXiang_d3']").val(data.list[i].wanGuanJinXiang_d3);
			$("input[name='wanGuanJinXiang_d4']").val(data.list[i].wanGuanJinXiang_d4);
			$("input[name='wanGuanJinXiang_f1']").val(data.list[i].wanGuanJinXiang_f1);
		}
		if(data.list[i].name == "wanGuanLaShenXingNeng"){//阀门 拉伸性能
			$("input[name='wanGuanLaShenXingNeng_a1'][value='"+data.list[i].wanGuanLaShenXingNeng_a1+"']").attr("checked",true); 
			$("input[name='wanGuanLaShenXingNeng_a2'][value='"+data.list[i].wanGuanLaShenXingNeng_a2+"']").attr("checked",true);
			$("input[name='wanGuanLaShenXingNeng_a3'][value='"+data.list[i].wanGuanLaShenXingNeng_a3+"']").attr("checked",true); 
			$("input[name='wanGuanLaShenXingNeng_a4'][value='"+data.list[i].wanGuanLaShenXingNeng_a4+"']").attr("checked",true);
			$("input[name='wanGuanLaShenXingNeng_l1']").val(data.list[i].change[0].wanGuanLaShenXingNeng_l1);
			$("input[name='wanGuanLaShenXingNeng_l2']").val(data.list[i].change[0].wanGuanLaShenXingNeng_l2);
			$("input[name='wanGuanLaShenXingNeng_l3']").val(data.list[i].change[0].wanGuanLaShenXingNeng_l3);
			$("input[name='wanGuanLaShenXingNeng_l4']").val(data.list[i].change[0].wanGuanLaShenXingNeng_l4);
			$("input[name='wanGuanLaShenXingNeng_l5']").val(data.list[i].change[0].wanGuanLaShenXingNeng_l5);
			$("input[name='wanGuanLaShenXingNeng_l6']").val(data.list[i].change[0].wanGuanLaShenXingNeng_l6);
			$("input[name='wanGuanLaShenXingNeng_b1']").val(data.list[i].wanGuanLaShenXingNeng_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l1" value="'+data.list[i].change[j].wanGuanLaShenXingNeng_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l2" value="'+data.list[i].change[j].wanGuanLaShenXingNeng_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l3" value="'+data.list[i].change[j].wanGuanLaShenXingNeng_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l4" value="'+data.list[i].change[j].wanGuanLaShenXingNeng_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l5" value="'+data.list[i].change[j].wanGuanLaShenXingNeng_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l6" value="'+data.list[i].change[j].wanGuanLaShenXingNeng_l6+'"/></td>';
						$str+='<td align="center">/td>';
					    $str+='</tr>';
					    $("#wanGuanLaShenXingNeng").before($str);
				}
			}
		}
			if(data.list[i].name == "wanGuanChongJi1"){//弯管 
				$("input[name='wanGuanChongJi1_a1'][value='"+data.list[i].wanGuanChongJi1_a1+"']").attr("checked",true); 
				$("input[name='wanGuanChongJi1_a2'][value='"+data.list[i].wanGuanChongJi1_a2+"']").attr("checked",true);
				$("input[name='wanGuanChongJi1_a3'][value='"+data.list[i].wanGuanChongJi1_a3+"']").attr("checked",true); 
				$("input[name='wanGuanChongJi1_a4'][value='"+data.list[i].wanGuanChongJi1_a4+"']").attr("checked",true);
				$("input[name='wanGuanChongJi1_a5']").val(data.list[i].wanGuanChongJi1_a5);
				$("input[name='wanGuanChongJi1_a6']").val(data.list[i].wanGuanChongJi1_a6);
				$("input[name='wanGuanChongJi1_b1']").val(data.list[i].wanGuanChongJi1_b1);
				$("input[name='wanGuanChongJi1_b2']").val(data.list[i].wanGuanChongJi1_b2);
				$("input[name='wanGuanChongJi1_b3']").val(data.list[i].wanGuanChongJi1_b3);
				$("input[name='wanGuanChongJi1_b4']").val(data.list[i].wanGuanChongJi1_b4);
				$("input[name='wanGuanChongJi1_c1']").val(data.list[i].wanGuanChongJi1_c1);
				$("input[name='wanGuanChongJi1_c2']").val(data.list[i].wanGuanChongJi1_c2);
				$("input[name='wanGuanChongJi1_c3']").val(data.list[i].wanGuanChongJi1_c3);
				$("input[name='wanGuanChongJi1_c4']").val(data.list[i].wanGuanChongJi1_c4);
				$("input[name='wanGuanChongJi1_d1']").val(data.list[i].wanGuanChongJi1_d1);
				$("input[name='wanGuanChongJi1_d2']").val(data.list[i].wanGuanChongJi1_d2);
				$("input[name='wanGuanChongJi1_d3']").val(data.list[i].wanGuanChongJi1_d3);
				$("input[name='wanGuanChongJi1_d4']").val(data.list[i].wanGuanChongJi1_d4);
				$("input[name='wanGuanChongJi1_e1']").val(data.list[i].wanGuanChongJi1_e1);
				$("input[name='wanGuanChongJi1_e2']").val(data.list[i].wanGuanChongJi1_e2);
				$("input[name='wanGuanChongJi1_e3']").val(data.list[i].wanGuanChongJi1_e3);
				$("input[name='wanGuanChongJi1_e4']").val(data.list[i].wanGuanChongJi1_e4);
				$("input[name='wanGuanChongJi1_f1']").val(data.list[i].wanGuanChongJi1_f1);
				$("input[name='wanGuanChongJi1_f2']").val(data.list[i].wanGuanChongJi1_f2);
				$("input[name='wanGuanChongJi1_f3']").val(data.list[i].wanGuanChongJi1_f3);
				$("input[name='wanGuanChongJi1_f4']").val(data.list[i].wanGuanChongJi1_f4);
				$("input[name='wanGuanChongJi1_h1']").val(data.list[i].wanGuanChongJi1_h1);
				$("input[name='wanGuanChongJi1_h2']").val(data.list[i].wanGuanChongJi1_h2);
				$("input[name='wanGuanChongJi1_h3']").val(data.list[i].wanGuanChongJi1_h3);
				$("input[name='wanGuanChongJi1_h4']").val(data.list[i].wanGuanChongJi1_h4);
				$("input[name='wanGuanChongJi1_g1']").val(data.list[i].wanGuanChongJi1_g1);
			}


		if(data.list[i].name == "wanGuanWanQu"){//
			$("input[name='wanGuanWanQu_a1'][value='"+data.list[i].wanGuanWanQu_a1+"']").attr("checked",true); 
			$("input[name='wanGuanWanQu_a2'][value='"+data.list[i].wanGuanWanQu_a2+"']").attr("checked",true);
			$("input[name='wanGuanWanQu_a3'][value='"+data.list[i].wanGuanWanQu_a3+"']").attr("checked",true); 
			$("input[name='wanGuanWanQu_a4'][value='"+data.list[i].wanGuanWanQu_a4+"']").attr("checked",true);
			$("input[name='wanGuanWanQu_b1']").val(data.list[i].wanGuanWanQu_b1);
			$("input[name='wanGuanWanQu_b2']").val(data.list[i].wanGuanWanQu_b2);
			$("input[name='wanGuanWanQu_c1']").val(data.list[i].wanGuanWanQu_c1);
			$("input[name='wanGuanWanQu_c2']").val(data.list[i].wanGuanWanQu_c2);
			$("input[name='wanGuanWanQu_c3']").val(data.list[i].wanGuanWanQu_c3);
			$("input[name='wanGuanWanQu_c4']").val(data.list[i].wanGuanWanQu_c4);
			$("input[name='wanGuanWanQu_e1']").val(data.list[i].wanGuanWanQu_e1);
			$("input[name='wanGuanWanQu_e2']").val(data.list[i].wanGuanWanQu_e2);
			$("input[name='wanGuanWanQu_e3']").val(data.list[i].wanGuanWanQu_e3);
			$("input[name='wanGuanWanQu_e4']").val(data.list[i].wanGuanWanQu_e4);
			$("input[name='wanGuanWanQu_f1']").val(data.list[i].wanGuanWanQu_f1);
			$("input[name='wanGuanWanQu_f2']").val(data.list[i].wanGuanWanQu_f2);
			$("input[name='wanGuanWanQu_f3']").val(data.list[i].wanGuanWanQu_f3);
			$("input[name='wanGuanWanQu_f4']").val(data.list[i].wanGuanWanQu_f4);
			$("input[name='wanGuanWanQu_g1']").val(data.list[i].wanGuanWanQu_g1);
		}

		if(data.list[i].name == "wanGuanLuochui"){//弯管 
			$("input[name='wanGuanLuochui_a1'][value='"+data.list[i].wanGuanLuochui_a1+"']").attr("checked",true); 
			$("input[name='wanGuanLuochui_a2'][value='"+data.list[i].wanGuanLuochui_a2+"']").attr("checked",true);
			$("input[name='wanGuanLuochui_a3'][value='"+data.list[i].wanGuanLuochui_a3+"']").attr("checked",true); 
			$("input[name='wanGuanLuochui_a4'][value='"+data.list[i].wanGuanLuochui_a4+"']").attr("checked",true);
			$("input[name='wanGuanLuochui_a5']").val(data.list[i].wanGuanLuochui_a5);
			$("input[name='wanGuanLuochui_b1']").val(data.list[i].wanGuanLuochui_b1);
			$("input[name='wanGuanLuochui_b2']").val(data.list[i].wanGuanLuochui_b2);
			$("input[name='wanGuanLuochui_b3']").val(data.list[i].wanGuanLuochui_b3);
			$("input[name='wanGuanLuochui_b4']").val(data.list[i].wanGuanLuochui_b4);
			$("input[name='wanGuanLuochui_d1']").val(data.list[i].wanGuanLuochui_d1);
			$("input[name='wanGuanLuochui_d2']").val(data.list[i].wanGuanLuochui_d2);
			$("input[name='wanGuanLuochui_d3']").val(data.list[i].wanGuanLuochui_d3);
			$("input[name='wanGuanLuochui_d4']").val(data.list[i].wanGuanLuochui_d4);
			$("input[name='wanGuanLuochui_e1']").val(data.list[i].wanGuanLuochui_e1);
			$("input[name='wanGuanLuochui_e2']").val(data.list[i].wanGuanLuochui_e2);
			$("input[name='wanGuanLuochui_e3']").val(data.list[i].wanGuanLuochui_e3);
			$("input[name='wanGuanLuochui_e4']").val(data.list[i].wanGuanLuochui_e4);
			$("input[name='wanGuanLuochui_f1']").val(data.list[i].wanGuanLuochui_f1);
			$("input[name='wanGuanLuochui_f2']").val(data.list[i].wanGuanLuochui_f2);
			$("input[name='wanGuanLuochui_f3']").val(data.list[i].wanGuanLuochui_f3);
			$("input[name='wanGuanLuochui_f4']").val(data.list[i].wanGuanLuochui_f4);
			$("input[name='wanGuanLuochui_g1']").val(data.list[i].wanGuanLuochui_g1);
		}
		if(data.list[i].name == "wanGuanJinXiang1"){//弯管 
			$("input[name='wanGuanJinXiang1_a1'][value='"+data.list[i].wanGuanJinXiang1_a1+"']").attr("checked",true); 
			$("input[name='wanGuanJinXiang1_a2'][value='"+data.list[i].wanGuanJinXiang1_a2+"']").attr("checked",true);
			$("input[name='wanGuanJinXiang1_a3'][value='"+data.list[i].wanGuanJinXiang1_a3+"']").attr("checked",true); 
			$("input[name='wanGuanJinXiang1_a4'][value='"+data.list[i].wanGuanJinXiang1_a4+"']").attr("checked",true);
			$("input[name='wanGuanJinXiang1_b1']").val(data.list[i].wanGuanJinXiang1_b1);
			$("input[name='wanGuanJinXiang1_b2']").val(data.list[i].wanGuanJinXiang1_b2);
			$("input[name='wanGuanJinXiang1_b3']").val(data.list[i].wanGuanJinXiang1_b3);
			$("input[name='wanGuanJinXiang1_b4']").val(data.list[i].wanGuanJinXiang1_b4);
			$("input[name='wanGuanJinXiang1_c1']").val(data.list[i].wanGuanJinXiang1_c1);
			$("input[name='wanGuanJinXiang1_c2']").val(data.list[i].wanGuanJinXiang1_c2);
			$("input[name='wanGuanJinXiang1_c3']").val(data.list[i].wanGuanJinXiang1_c3);
			$("input[name='wanGuanJinXiang1_c4']").val(data.list[i].wanGuanJinXiang1_c4);
			$("input[name='wanGuanJinXiang1_d1']").val(data.list[i].wanGuanJinXiang1_d1);
			$("input[name='wanGuanJinXiang1_d2']").val(data.list[i].wanGuanJinXiang1_d2);
			$("input[name='wanGuanJinXiang1_d3']").val(data.list[i].wanGuanJinXiang1_d3);
			$("input[name='wanGuanJinXiang1_d4']").val(data.list[i].wanGuanJinXiang1_d4);
			$("input[name='wanGuanJinXiang1_f1']").val(data.list[i].wanGuanJinXiang1_f1);
		}

		if(data.list[i].name == "guanJianQiTa"){//其他
			$("input[name='guanJianQiTa_a1']").val(data.list[i].guanJianQiTa_a1);
			$("input[name='guanJianQiTa_a2']").val(data.list[i].guanJianQiTa_a2);
			$("input[name='guanJianQiTa_b1']").val(data.list[i].guanJianQiTa_b1);
			$("input[name='guanJianQiTa_b2']").val(data.list[i].guanJianQiTa_b2);
			$("input[name='guanJianQiTa_b3']").val(data.list[i].guanJianQiTa_b3);
			$("input[name='guanJianQiTa_c1']").val(data.list[i].guanJianQiTa_c1);
			$("input[name='guanJianQiTa_c2']").val(data.list[i].guanJianQiTa_c2);
			$("input[name='guanJianQiTa_c3']").val(data.list[i].guanJianQiTa_c3);
			$("input[name='guanJianQiTa_c4']").val(data.list[i].guanJianQiTa_c4);
			$("input[name='guanJianQiTa_d1']").val(data.list[i].guanJianQiTa_d1);
			$("input[name='guanJianQiTa_f1']").val(data.list[i].guanJianQiTa_f1);
			$("input[name='guanJianQiTa_l1']").val(data.list[i].change[0].guanJianQiTa_l1);
			$("input[name='guanJianQiTa_l2']").val(data.list[i].change[0].guanJianQiTa_l2);
			$("input[name='guanJianQiTa_l3']").val(data.list[i].change[0].guanJianQiTa_l3);
			$("input[name='guanJianQiTa_l4']").val(data.list[i].change[0].guanJianQiTa_l4);
			$("input[name='guanJianQiTa_l5']").val(data.list[i].change[0].guanJianQiTa_l5);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="guanJianQiTa_l1" value="'+data.list[i].change[j].guanJianQiTa_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="guanJianQiTa_l2" value="'+data.list[i].change[j].guanJianQiTa_l2+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="guanJianQiTa_l3" value="'+data.list[i].change[j].guanJianQiTa_l3+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="guanJianQiTa_l4" value="'+data.list[i].change[j].guanJianQiTa_l4+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="guanJianQiTa_l5" value="'+data.list[i].change[j].guanJianQiTa_l5+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#guanJianQiTa").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianYuZhiChengXing"){//预制成型
			$("input[name='guanJianYuZhiChengXing_a1'][value='" + data.list[i].guanJianYuZhiChengXing_a1 + "']").attr("checked",true); 
			$("input[name='guanJianYuZhiChengXing_a2'][value='" + data.list[i].guanJianYuZhiChengXing_a2 + "']").attr("checked",true);
			$("input[name='guanJianYuZhiChengXing_l1']").val(data.list[i].change[0].guanJianYuZhiChengXing_l1);
			$("input[name='guanJianYuZhiChengXing_l2']").val(data.list[i].change[0].guanJianYuZhiChengXing_l2);
			$("select[name='guanJianYuZhiChengXing_l3']").val(data.list[i].change[0].guanJianYuZhiChengXing_l3);
			$("input[name='guanJianYuZhiChengXing_l4']").val(data.list[i].change[0].guanJianYuZhiChengXing_l4);
			$("input[name='guanJianYuZhiChengXing_l5']").val(data.list[i].change[0].guanJianYuZhiChengXing_l5);
			$("input[name='guanJianYuZhiChengXing_l6']").val(data.list[i].change[0].guanJianYuZhiChengXing_l6);
			$("input[name='guanJianYuZhiChengXing_c1']").val(data.list[i].guanJianYuZhiChengXing_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
				    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianYuZhiChengXing_l1" value="'+data.list[i].change[j].guanJianYuZhiChengXing_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianYuZhiChengXing_l2" value="'+data.list[i].change[j].guanJianYuZhiChengXing_l2+'"/></td>';
					if(data.list[i].change[j].guanJianYuZhiChengXing_l3=="符合"){
						$str+='<td align="center"><select name="guanJianYuZhiChengXing_l3"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="guanJianYuZhiChengXing_l3"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianYuZhiChengXing_l4" value="'+data.list[i].change[j].guanJianYuZhiChengXing_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianYuZhiChengXing_l5" value="'+data.list[i].change[j].guanJianYuZhiChengXing_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianYuZhiChengXing_l6" value="'+data.list[i].change[j].guanJianYuZhiChengXing_l6+'"/></td>';
					$str+='<td align="center"></td>';
					$str+='</tr>';
					$("#guanJian_yuZhiChengXing").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianReChuLi"){//热处理
			$("input[name='guanJianReChuLi_a1'][value='" + data.list[i].guanJianReChuLi_a1 + "']").attr("checked",true); 
			$("input[name='guanJianReChuLi_a2'][value='" + data.list[i].guanJianReChuLi_a2 + "']").attr("checked",true);
			
			$("input[name='guanJianReChuLi_l1']").val(data.list[i].change[0].guanJianReChuLi_l1);
			$("input[name='guanJianReChuLi_l2']").val(data.list[i].change[0].guanJianReChuLi_l2);
			$("input[name='guanJianReChuLi_l3']").val(data.list[i].change[0].guanJianReChuLi_l3);
			$("input[name='guanJianReChuLi_l4']").val(data.list[i].change[0].guanJianReChuLi_l4);
			$("select[name='guanJianReChuLi_l5']").val(data.list[i].change[0].guanJianReChuLi_l5);
			$("input[name='guanJianReChuLi_l6']").val(data.list[i].change[0].guanJianReChuLi_l6);
			$("input[name='guanJianReChuLi_b1']").val(data.list[i].guanJianReChuLi_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianReChuLi_l1" value="'+data.list[i].change[j].guanJianReChuLi_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianReChuLi_l2" value="'+data.list[i].change[j].guanJianReChuLi_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianReChuLi_l3" value="'+data.list[i].change[j].guanJianReChuLi_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianReChuLi_l4" value="'+data.list[i].change[j].guanJianReChuLi_l4+'"/></td>';
						if(data.list[i].change[j].guanJianReChuLi_l5 == "符合"){
							$str+='<td align="center"><select name="guanJianReChuLi_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="guanJianReChuLi_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianReChuLi_l6" value="'+data.list[i].change[j].guanJianReChuLi_l6+'"/></td>';
						
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#guanJian_reChuLi").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianHanJie"){//
			$("input[name='guanJianHanJie_a1'][value='" + data.list[i].guanJianHanJie_a1 + "']").attr("checked",true); 
			$("input[name='guanJianHanJie_a2'][value='" + data.list[i].guanJianHanJie_a2 + "']").attr("checked",true);
			$("input[name='guanJianHanJie_a3'][value='" + data.list[i].guanJianHanJie_a3 + "']").attr("checked",true); 
			$("input[name='guanJianHanJie_a4'][value='" + data.list[i].guanJianHanJie_a4 + "']").attr("checked",true);
			$("input[name='guanJianHanJie_l1']").val(data.list[i].change[0].guanJianHanJie_l1);
			$("input[name='guanJianHanJie_l2']").val(data.list[i].change[0].guanJianHanJie_l2);
			$("input[name='guanJianHanJie_l3']").val(data.list[i].change[0].guanJianHanJie_l3);
			$("select[name='guanJianHanJie_l4']").val(data.list[i].change[0].guanJianHanJie_l4);
			$("select[name='guanJianHanJie_l5']").val(data.list[i].change[0].guanJianHanJie_l5);
			$("input[name='guanJianHanJie_l6']").val(data.list[i].change[0].guanJianHanJie_l6);
			$("input[name='guanJianHanJie_b1']").val(data.list[i].guanJianHanJie_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianHanJie_l1" value="'+data.list[i].change[j].guanJianHanJie_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianHanJie_l2" value="'+data.list[i].change[j].guanJianHanJie_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianHanJie_l3" value="'+data.list[i].change[j].guanJianHanJie_l3+'"/></td>';
						if(data.list[i].change[j].guanJianHanJie_l4 == "符合"){
							$str+='<td align="center"><select name="guanJianHanJie_l4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}
						else{
							$str+='<td align="center"><select name="guanJianHanJie_l4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].guanJianHanJie_l5 == "符合"){
							$str+='<td align="center"><select name="guanJianHanJie_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="guanJianHanJie_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianHanJie_l6" value="'+data.list[i].change[j].guanJianHanJie_l6+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#guanJian_hanJie").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianSheXianGuoCheng"){		//射线检测过程
			$("input[name='guanJianSheXianGuoCheng_b1']").val(data.list[i].guanJianSheXianGuoCheng_b1);
			$("input[name='guanJianSheXianGuoCheng_a1'][value='" + data.list[i].guanJianSheXianGuoCheng_a1 + "']").attr("checked",true); 
			$("input[name='guanJianSheXianGuoCheng_a2'][value='" + data.list[i].guanJianSheXianGuoCheng_a2 + "']").attr("checked",true);
			$("input[name='guanJianSheXianGuoCheng_a3'][value='" + data.list[i].guanJianSheXianGuoCheng_a3 + "']").attr("checked",true); 
			$("input[name='guanJianSheXianGuoCheng_a4'][value='" + data.list[i].guanJianSheXianGuoCheng_a4 + "']").attr("checked",true);

			$("input[name='guanJianSheXianGuoCheng_l1']").val(data.list[i].change[0].guanJianSheXianGuoCheng_l1);
			$("input[name='guanJianSheXianGuoCheng_l2']").val(data.list[i].change[0].guanJianSheXianGuoCheng_l2);
			$("input[name='guanJianSheXianGuoCheng_l3']").val(data.list[i].change[0].guanJianSheXianGuoCheng_l3);
			$("input[name='guanJianSheXianGuoCheng_l4']").val(data.list[i].change[0].guanJianSheXianGuoCheng_l4);
			$("select[name='guanJianSheXianGuoCheng_l5']").val(data.list[i].change[0].guanJianSheXianGuoCheng_l5);
			$("input[name='guanJianSheXianGuoCheng_l6']").val(data.list[i].change[0].guanJianSheXianGuoCheng_l6);
			$("select[name='guanJianSheXianGuoCheng_l7']").val(data.list[i].change[0].guanJianSheXianGuoCheng_l7);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianGuoCheng_l1" value="'+data.list[i].change[j].guanJianSheXianGuoCheng_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianGuoCheng_l2" value="'+data.list[i].change[j].guanJianSheXianGuoCheng_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianGuoCheng_l3" value="'+data.list[i].change[j].guanJianSheXianGuoCheng_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianGuoCheng_l4" value="'+data.list[i].change[j].guanJianSheXianGuoCheng_l4+'"/></td>';
					if (data.list[i].change[j].guanJianSheXianGuoCheng_l5 == "符合") {
						$str+='<td align="center"><select name="guanJianSheXianGuoCheng_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="guanJianSheXianGuoCheng_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianGuoCheng_l6" value="'+data.list[i].change[j].guanJianSheXianGuoCheng_l6+'"/></td>';
					if (data.list[i].change[j].guanJianSheXianGuoCheng_l7 == "符合") {
						$str+='<td align="center"><select name="guanJianSheXianGuoCheng_l7"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="guanJianSheXianGuoCheng_l7"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#guanJian_sheXianGuoCheng").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianChaoShengBo"){
			$("input[name='guanJianChaoShengBo_a1'][value='" + data.list[i].guanJianChaoShengBo_a1 + "']").attr("checked",true); 
			$("input[name='guanJianChaoShengBo_a2'][value='" + data.list[i].guanJianChaoShengBo_a2 + "']").attr("checked",true);
			$("input[name='guanJianChaoShengBo_a3'][value='" + data.list[i].guanJianChaoShengBo_a3 + "']").attr("checked",true);
			$("input[name='guanJianChaoShengBo_a4'][value='" + data.list[i].guanJianChaoShengBo_a4 + "']").attr("checked",true);
			$("input[name='guanJianChaoShengBo_b1'][value='" + data.list[i].guanJianChaoShengBo_b1 + "']").attr("checked",true);
			
			$("input[name='guanJianChaoShengBo_l1']").val(data.list[i].change[0].guanJianChaoShengBo_l1);
			$("input[name='guanJianChaoShengBo_l2']").val(data.list[i].change[0].guanJianChaoShengBo_l2);
			$("input[name='guanJianChaoShengBo_l3']").val(data.list[i].change[0].guanJianChaoShengBo_l3);
			$("input[name='guanJianChaoShengBo_l4']").val(data.list[i].change[0].guanJianChaoShengBo_l4);
			$("input[name='guanJianChaoShengBo_l5']").val(data.list[i].change[0].guanJianChaoShengBo_l5);
			
			$("input[name='guanJianChaoShengBo_ll1']").val(data.list[i].change2[0].guanJianChaoShengBo_ll1);
			$("input[name='guanJianChaoShengBo_ll2']").val(data.list[i].change2[0].guanJianChaoShengBo_ll2);
			$("input[name='guanJianChaoShengBo_ll3']").val(data.list[i].change2[0].guanJianChaoShengBo_ll3);
			$("input[name='guanJianChaoShengBo_ll4']").val(data.list[i].change2[0].guanJianChaoShengBo_ll4);
			$("select[name='guanJianChaoShengBo_ll5']").val(data.list[i].change2[0].guanJianChaoShengBo_ll5);
			$("select[name='guanJianChaoShengBo_ll6']").val(data.list[i].change2[0].guanJianChaoShengBo_ll6);
			$("input[name='guanJianChaoShengBo_ll7']").val(data.list[i].change2[0].guanJianChaoShengBo_ll7);
			$("select[name='guanJianChaoShengBo_ll8']").val(data.list[i].change2[0].guanJianChaoShengBo_ll8);
			$("input[name='guanJianChaoShengBo_ll9']").val(data.list[i].change2[0].guanJianChaoShengBo_ll9);
			$("input[name='guanJianChaoShengBo_c1']").val(data.list[i].guanJianChaoShengBo_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center" colspan="1"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_l1" value="'+data.list[i].change[j].guanJianChaoShengBo_l1+'"/></td>';
				        $str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_l2" value="'+data.list[i].change[j].guanJianChaoShengBo_l2+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_l3" value="'+data.list[i].change[j].guanJianChaoShengBo_l3+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianChaoShengBo_l4" value="'+data.list[i].change[j].guanJianChaoShengBo_l4+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianChaoShengBo_l5" value="'+data.list[i].change[j].guanJianChaoShengBo_l5+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#guanJianChaoShengBo1").before($str);
				}
			}
			if (data.list[i].change2[0].length>1) {
				for(var j=1;j<data.list[i].change2[0].length;j++){
					  $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll1" value="'+data.list[i].change2[j].guanJianChaoShengBo_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll2" value="'+data.list[i].change2[j].guanJianChaoShengBo_ll2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll3" value="'+data.list[i].change2[j].guanJianChaoShengBo_ll3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll4" value="'+data.list[i].change2[j].guanJianChaoShengBo_ll4+'"/></td>';
						if(data.list[i].change2[j].guanJianChaoShengBo_ll5=="符合"){
							$str+='<td align="center"><select name="guanJianChaoShengBo_ll5" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="guanJianChaoShengBo_ll5" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change2[j].guanJianChaoShengBo_ll6=="符合"){
							$str+='<td align="center"><select name="guanJianChaoShengBo_ll6"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="guanJianChaoShengBo_ll6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll7" value="'+data.list[i].change2[j].guanJianChaoShengBo_ll7+'"/></td>';
						if(data.list[i].change2[j].guanJianChaoShengBo_ll8=="符合"){
							$str+='<td align="center"><select name="guanJianChaoShengBo_ll8"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="guanJianChaoShengBo_ll8"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll9" value="'+data.list[i].change2[j].guanJianChaoShengBo_ll9+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#guanJianChaoShengBo2").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianCiFenJianCe"){//磁粉检测
			$("input[name='guanJianCiFenJianCe_a1'][value='" + data.list[i].guanJianCiFenJianCe_a1 + "']").attr("checked",true); 
			$("input[name='guanJianCiFenJianCe_a2'][value='" + data.list[i].guanJianCiFenJianCe_a2 + "']").attr("checked",true);
			$("input[name='guanJianCiFenJianCe_a3'][value='" + data.list[i].guanJianCiFenJianCe_a3 + "']").attr("checked",true);
			$("input[name='guanJianCiFenJianCe_a4'][value='" + data.list[i].guanJianCiFenJianCe_a4 + "']").attr("checked",true);
			$("input[name='guanJianCiFenJianCe_b1'][value='" + data.list[i].guanJianCiFenJianCe_b1 + "']").attr("checked",true);
			
			$("input[name='guanJianCiFenJianCe_l1']").val(data.list[i].change[0].guanJianCiFenJianCe_l1);
			$("input[name='guanJianCiFenJianCe_l2']").val(data.list[i].change[0].guanJianCiFenJianCe_l2);
			$("input[name='guanJianCiFenJianCe_l3']").val(data.list[i].change[0].guanJianCiFenJianCe_l3);
			$("input[name='guanJianCiFenJianCe_l4']").val(data.list[i].change[0].guanJianCiFenJianCe_l4);
			$("input[name='guanJianCiFenJianCe_l5']").val(data.list[i].change[0].guanJianCiFenJianCe_l5);
			
			$("input[name='guanJianCiFenJianCe_ll1']").val(data.list[i].change2[0].guanJianCiFenJianCe_ll1);
			$("input[name='guanJianCiFenJianCe_ll2']").val(data.list[i].change2[0].guanJianCiFenJianCe_ll2);
			$("input[name='guanJianCiFenJianCe_ll3']").val(data.list[i].change2[0].guanJianCiFenJianCe_ll3);
			$("input[name='guanJianCiFenJianCe_ll4']").val(data.list[i].change2[0].guanJianCiFenJianCe_ll4);
			$("select[name='guanJianCiFenJianCe_ll5']").val(data.list[i].change2[0].guanJianCiFenJianCe_ll5);
			$("select[name='guanJianCiFenJianCe_ll6']").val(data.list[i].change2[0].guanJianCiFenJianCe_ll6);
			$("input[name='guanJianCiFenJianCe_ll7']").val(data.list[i].change2[0].guanJianCiFenJianCe_ll7);
			$("select[name='guanJianCiFenJianCe_ll8']").val(data.list[i].change2[0].guanJianCiFenJianCe_ll8);
			$("input[name='guanJianCiFenJianCe_ll9']").val(data.list[i].change2[0].guanJianCiFenJianCe_ll9);
			
			$("input[name='guanJianCiFenJianCe_c1']").val(data.list[i].guanJianCiFenJianCe_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center" colspan="1"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_l1" value="'+data.list[i].change[j].guanJianCiFenJianCe_l1+'"/></td>';
				        $str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_l2" value="'+data.list[i].change[j].guanJianCiFenJianCe_l2+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_l3" value="'+data.list[i].change[j].guanJianCiFenJianCe_l3+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianCiFenJianCe_l4" value="'+data.list[i].change[j].guanJianCiFenJianCe_l4+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianCiFenJianCe_l5" value="'+data.list[i].change[j].guanJianCiFenJianCe_l5+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#guanJianCiFenJianCe1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll1" value="'+data.list[i].change2[j].guanJianCiFenJianCe_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll2" value="'+data.list[i].change2[j].guanJianCiFenJianCe_ll5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll3" value="'+data.list[i].change2[j].guanJianCiFenJianCe_ll3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll4" value="'+data.list[i].change2[j].guanJianCiFenJianCe_ll4+'"/></td>';
						if(data.list[i].change2[j].guanJianCiFenJianCe_ll5=="符合"){
							$str+='<td align="center"><select name="guanJianCiFenJianCe_ll5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="guanJianCiFenJianCe_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change2[j].guanJianCiFenJianCe_ll6=="符合"){
							$str+='<td align="center"><select name="guanJianCiFenJianCe_ll6" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="guanJianCiFenJianCe_ll6" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll7" value="'+data.list[i].change2[j].guanJianCiFenJianCe_ll7+'"/></td>';
						if(data.list[i].change2[j].guanJianCiFenJianCe_ll8=="符合"){
							$str+='<td align="center"><select name="guanJianCiFenJianCe_ll8" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="guanJianCiFenJianCe_ll8" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll9" value="'+data.list[i].change2[j].guanJianCiFenJianCe_ll9+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#guanJianCiFenJianCe2").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianShenTouJianCe"){//阀门 渗透检测
			$("input[name='guanJianShenTouJianCe_a1'][value='" + data.list[i].guanJianShenTouJianCe_a1 + "']").attr("checked",true); 
			$("input[name='guanJianShenTouJianCe_a2'][value='" + data.list[i].guanJianShenTouJianCe_a2 + "']").attr("checked",true);
			$("input[name='guanJianShenTouJianCe_a3'][value='" + data.list[i].guanJianShenTouJianCe_a3 + "']").attr("checked",true);
			$("input[name='guanJianShenTouJianCe_a4'][value='" + data.list[i].guanJianShenTouJianCe_a4 + "']").attr("checked",true);
			$("input[name='guanJianShenTouJianCe_b1'][value='" + data.list[i].guanJianShenTouJianCe_b1 + "']").attr("checked",true);
			
			$("input[name='guanJianShenTouJianCe_l1']").val(data.list[i].change[0].guanJianShenTouJianCe_l1);
			$("input[name='guanJianShenTouJianCe_l2']").val(data.list[i].change[0].guanJianShenTouJianCe_l2);
			$("input[name='guanJianShenTouJianCe_l3']").val(data.list[i].change[0].guanJianShenTouJianCe_l3);
			$("input[name='guanJianShenTouJianCe_l4']").val(data.list[i].change[0].guanJianShenTouJianCe_l4);
			
			$("input[name='guanJianShenTouJianCe_ll1']").val(data.list[i].change2[0].guanJianShenTouJianCe_ll1);
			$("input[name='guanJianShenTouJianCe_ll2']").val(data.list[i].change2[0].guanJianShenTouJianCe_ll2);
			$("input[name='guanJianShenTouJianCe_ll3']").val(data.list[i].change2[0].guanJianShenTouJianCe_ll3);
			$("input[name='guanJianShenTouJianCe_ll4']").val(data.list[i].change2[0].guanJianShenTouJianCe_ll4);
			$("input[name='guanJianShenTouJianCe_ll5']").val(data.list[i].change2[0].guanJianShenTouJianCe_ll5);
			$("input[name='guanJianShenTouJianCe_ll6']").val(data.list[i].change2[0].guanJianShenTouJianCe_ll6);
			$("input[name='guanJianShenTouJianCe_ll7']").val(data.list[i].change2[0].guanJianShenTouJianCe_ll7);
			$("select[name='guanJianShenTouJianCe_ll8']").val(data.list[i].change2[0].guanJianShenTouJianCe_ll8);
			$("input[name='guanJianShenTouJianCe_ll9']").val(data.list[i].change2[0].guanJianShenTouJianCe_ll9);
			$("input[name='guanJianShenTouJianCe_c1']").val(data.list[i].guanJianShenTouJianCe_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					  $str='';
				        $str+='<tr>';
				        $str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianShenTouJianCe_l1" value="'+data.list[i].change[j].guanJianShenTouJianCe_l1+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianShenTouJianCe_l2" value="'+data.list[i].change[j].guanJianShenTouJianCe_l2+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianShenTouJianCe_l3" value="'+data.list[i].change[j].guanJianShenTouJianCe_l3+'"/></td>';
						$str+='<td align="center" colspan="3"><input class="input_140 easyui-validatebox" type="text" name="guanJianShenTouJianCe_l4" value="'+data.list[i].change[j].guanJianShenTouJianCe_l4+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#guanJianShenTouJianCe1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll1" value="'+data.list[i].change2[j].guanJianShenTouJianCe_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll2" value="'+data.list[i].change2[j].guanJianShenTouJianCe_ll2+'" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll3" value="'+data.list[i].change2[j].guanJianShenTouJianCe_ll3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll4" value="'+data.list[i].change2[j].guanJianShenTouJianCe_ll4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll5" value="'+data.list[i].change2[j].guanJianShenTouJianCe_ll5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll6" value="'+data.list[i].change2[j].guanJianShenTouJianCe_ll6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll7" value="'+data.list[i].change2[j].guanJianShenTouJianCe_ll7+'"/></td>';
						if(data.list[i].change2[j].guanJianShenTouJianCe_ll8=="符合"){
							$str+='<td align="center"><select name="guanJianShenTouJianCe_ll8" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="guanJianShenTouJianCe_ll8" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll9" value="'+data.list[i].change2[j].guanJianShenTouJianCe_ll9+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#guanJianShenTouJianCe2").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianSheXianDiPian"){//
			$("input[name='guanJianSheXianDiPian_a1'][value='" + data.list[i].guanJianSheXianDiPian_a1 + "']").attr("checked",true); 
			$("input[name='guanJianSheXianDiPian_a2'][value='" + data.list[i].guanJianSheXianDiPian_a2 + "']").attr("checked",true);
			$("input[name='guanJianSheXianDiPian_a3'][value='" + data.list[i].guanJianSheXianDiPian_a3 + "']").attr("checked",true);
			$("input[name='guanJianSheXianDiPian_a4'][value='" + data.list[i].guanJianSheXianDiPian_a4 + "']").attr("checked",true);
			$("input[name='guanJianSheXianDiPian_b1']").val(data.list[i].guanJianSheXianDiPian_b1);
			$("input[name='guanJianSheXianDiPian_l1']").val(data.list[i].change[0].guanJianSheXianDiPian_l1);
			$("input[name='guanJianSheXianDiPian_l2']").val(data.list[i].change[0].guanJianSheXianDiPian_l2);
			$("input[name='guanJianSheXianDiPian_l3']").val(data.list[i].change[0].guanJianSheXianDiPian_l3);
			$("input[name='guanJianSheXianDiPian_l4']").val(data.list[i].change[0].guanJianSheXianDiPian_l4);
			$("input[name='guanJianSheXianDiPian_l5']").val(data.list[i].change[0].guanJianSheXianDiPian_l5);
			$("input[name='guanJianSheXianDiPian_l6']").val(data.list[i].change[0].guanJianSheXianDiPian_l6);
			$("input[name='guanJianSheXianDiPian_l7']").val(data.list[i].change[0].guanJianSheXianDiPian_l7);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l1"  value="'+data.list[i].change[j].guanJianSheXianDiPian_l7+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l2"  value="'+data.list[i].change[j].guanJianSheXianDiPian_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l3"  value="'+data.list[i].change[j].guanJianSheXianDiPian_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l4"  value="'+data.list[i].change[j].guanJianSheXianDiPian_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l5"  value="'+data.list[i].change[j].guanJianSheXianDiPian_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l6"  value="'+data.list[i].change[j].guanJianSheXianDiPian_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l7"  value="'+data.list[i].change[j].guanJianSheXianDiPian_l7+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#guanJianSheXianDiPian").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianShuiYaShiYan"){// 管件  水压试验 
			$("input[name='guanJianShuiYaShiYan_a1'][value='" + data.list[i].guanJianShuiYaShiYan_a1 + "']").attr("checked",true); 
			$("input[name='guanJianShuiYaShiYan_a2'][value='" + data.list[i].guanJianShuiYaShiYan_a2 + "']").attr("checked",true);
			$("input[name='guanJianShuiYaShiYan_a3'][value='" + data.list[i].guanJianShuiYaShiYan_a3 + "']").attr("checked",true);
			$("input[name='guanJianShuiYaShiYan_a4'][value='" + data.list[i].guanJianShuiYaShiYan_a4 + "']").attr("checked",true);
			$("input[name='guanJianShuiYaShiYan_l1']").val(data.list[i].change[0].guanJianShuiYaShiYan_l1);
			$("input[name='guanJianShuiYaShiYan_l2']").val(data.list[i].change[0].guanJianShuiYaShiYan_l2);
			$("input[name='guanJianShuiYaShiYan_l3']").val(data.list[i].change[0].guanJianShuiYaShiYan_l3);
			$("input[name='guanJianShuiYaShiYan_l4']").val(data.list[i].change[0].guanJianShuiYaShiYan_l4);
			$("input[name='guanJianShuiYaShiYan_l5']").val(data.list[i].change[0].guanJianShuiYaShiYan_l5);
			$("select[name='guanJianShuiYaShiYan_l6']").val(data.list[i].change[0].guanJianShuiYaShiYan_l6);
			$("input[name='guanJianShuiYaShiYan_l7']").val(data.list[i].change[0].guanJianShuiYaShiYan_l7);
			$("input[name='guanJianShuiYaShiYan_l8']").val(data.list[i].change[0].guanJianShuiYaShiYan_l8);
			$("input[name='guanJianShuiYaShiYan_l9']").val(data.list[i].change[0].guanJianShuiYaShiYan_l9);
			$("input[name='guanJianShuiYaShiYan_b1']").val(data.list[i].guanJianShuiYaShiYan_b1);
			$("input[name='guanJianShuiYaShiYan_b2']").val(data.list[i].guanJianShuiYaShiYan_b2);
			$("input[name='guanJianShuiYaShiYan_b3']").val(data.list[i].guanJianShuiYaShiYan_b3);
			$("input[name='guanJianShuiYaShiYan_b4']").val(data.list[i].guanJianShuiYaShiYan_b4);
			$("input[name='guanJianShuiYaShiYan_b5']").val(data.list[i].guanJianShuiYaShiYan_b5);
			$("input[name='guanJianShuiYaShiYan_b6']").val(data.list[i].guanJianShuiYaShiYan_b6);
			$("input[name='guanJianShuiYaShiYan_b7']").val(data.list[i].guanJianShuiYaShiYan_b7);
			$("input[name='guanJianShuiYaShiYan_c1']").val(data.list[i].guanJianShuiYaShiYan_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l1" value="'+data.list[i].change[j].guanJianShuiYaShiYan_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l2" value="'+data.list[i].change[j].guanJianShuiYaShiYan_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l3" value="'+data.list[i].change[j].guanJianShuiYaShiYan_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l4" value="'+data.list[i].change[j].guanJianShuiYaShiYan_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l5" value="'+data.list[i].change[j].guanJianShuiYaShiYan_l5+'"/></td>';
					if(data.list[i].change[j].guanJianShuiYaShiYan_l6 == "符合"){
						$str+='<td align="center"><select name="guanJianShuiYaShiYan_l6"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="guanJianShuiYaShiYan_l6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l7" value="'+data.list[i].change[j].guanJianShuiYaShiYan_l7+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l8" value="'+data.list[i].change[j].guanJianShuiYaShiYan_l8+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l9" value="'+data.list[i].change[j].guanJianShuiYaShiYan_l9+'"/></td>';
					$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#guanJian_shuiYaShiYan").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianChuXiu"){//管件 除锈油漆、标识
			$("input[name='guanJianChuXiu_l1']").val(data.list[i].change[0].guanJianChuXiu_l1);
			$("input[name='guanJianChuXiu_l2']").val(data.list[i].change[0].guanJianChuXiu_l2);
			$("input[name='guanJianChuXiu_l3']").val(data.list[i].change[0].guanJianChuXiu_l3);
			$("input[name='guanJianChuXiu_l4']").val(data.list[i].change[0].guanJianChuXiu_l4);
			$("input[name='guanJianChuXiu_l5']").val(data.list[i].change[0].guanJianChuXiu_l5);
			$("input[name='guanJianChuXiu_a1']").val(data.list[i].guanJianChuXiu_a1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChuXiu_l1" value="'+data.list[i].change[j].guanJianChuXiu_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChuXiu_l2" value="'+data.list[i].change[j].guanJianChuXiu_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChuXiu_l3" value="'+data.list[i].change[j].guanJianChuXiu_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChuXiu_l4" value="'+data.list[i].change[j].guanJianChuXiu_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChuXiu_l5" value="'+data.list[i].change[j].guanJianChuXiu_l5+'"/></td>';
					
					$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#guanJian_chuXiu").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianFaYun"){//
			$("input[name='guanJianFaYun_a1']").val(data.list[i].guanJianFaYun_a1);
			$("input[name='guanJianFaYun_a2']").val(data.list[i].guanJianFaYun_a2);
			$("input[name='guanJianFaYun_a3']").val(data.list[i].guanJianFaYun_a3);
			$("input[name='guanJianFaYun_a4']").val(data.list[i].guanJianFaYun_a4);
			$("input[name='guanJianFaYun_a5'][value='" + data.list[i].guanJianFaYun_a5 + "']").attr("checked",true); 
			$("input[name='guanJianFaYun_a6'][value='" + data.list[i].guanJianFaYun_a6 + "']").attr("checked",true);
			$("input[name='guanJianFaYun_a7'][value='" + data.list[i].guanJianFaYun_a7 + "']").attr("checked",true); 
			$("input[name='guanJianFaYun_a8'][value='" + data.list[i].guanJianFaYun_a8 + "']").attr("checked",true);
			
			$("input[name='guanJianFaYun_b1']").val(data.list[i].guanJianFaYun_b1);
			
		}

		if(data.list[i].name == "guanJianHuaXue"){//化学成分
			$("input[name='guanJianHuaXue_a1'][value='" + data.list[i].guanJianHuaXue_a1 + "']").attr("checked",true); 
			$("input[name='guanJianHuaXue_a2'][value='" + data.list[i].guanJianHuaXue_a2 + "']").attr("checked",true);
			$("input[name='guanJianHuaXue_b1']").val(data.list[i].guanJianHuaXue_b1);
			$("input[name='guanJianHuaXue_b2']").val(data.list[i].guanJianHuaXue_b2);
			$("input[name='guanJianHuaXue_b3']").val(data.list[i].guanJianHuaXue_b3);
			$("input[name='guanJianHuaXue_b4']").val(data.list[i].guanJianHuaXue_b4);
			$("input[name='guanJianHuaXue_c1']").val(data.list[i].guanJianHuaXue_c1);
			$("input[name='guanJianHuaXue_c2']").val(data.list[i].guanJianHuaXue_c2);
			$("input[name='guanJianHuaXue_c3']").val(data.list[i].guanJianHuaXue_c3);
			$("input[name='guanJianHuaXue_c4']").val(data.list[i].guanJianHuaXue_c4);
			$("input[name='guanJianHuaXue_d1']").val(data.list[i].guanJianHuaXue_d1);
			$("input[name='guanJianHuaXue_d2']").val(data.list[i].guanJianHuaXue_d2);
			$("input[name='guanJianHuaXue_d3']").val(data.list[i].guanJianHuaXue_d3);
			$("input[name='guanJianHuaXue_d4']").val(data.list[i].guanJianHuaXue_d4);
			$("input[name='guanJianHuaXue_e1']").val(data.list[i].guanJianHuaXue_e1);
			$("input[name='guanJianHuaXue_e2']").val(data.list[i].guanJianHuaXue_e2);
			$("input[name='guanJianHuaXue_e3']").val(data.list[i].guanJianHuaXue_e3);
			$("input[name='guanJianHuaXue_e4']").val(data.list[i].guanJianHuaXue_e4);
			$("input[name='guanJianHuaXue_f1']").val(data.list[i].guanJianHuaXue_f1);
		}

		if(data.list[i].name == "guanJianLaShenXingNeng"){//阀门 拉伸性能
			$("input[name='guanJianLaShenXingNeng_a1'][value='" + data.list[i].guanJianLaShenXingNeng_a1 + "']").attr("checked",true); 
			$("input[name='guanJianLaShenXingNeng_a2'][value='" + data.list[i].guanJianLaShenXingNeng_a2 + "']").attr("checked",true);
			$("input[name='guanJianLaShenXingNeng_a3'][value='" + data.list[i].guanJianLaShenXingNeng_a3 + "']").attr("checked",true); 
			$("input[name='guanJianLaShenXingNeng_a4'][value='" + data.list[i].guanJianLaShenXingNeng_a4 + "']").attr("checked",true);
			$("input[name='guanJianLaShenXingNeng_l1']").val(data.list[i].change[0].guanJianLaShenXingNeng_l1);
			$("input[name='guanJianLaShenXingNeng_l2']").val(data.list[i].change[0].guanJianLaShenXingNeng_l2);
			$("input[name='guanJianLaShenXingNeng_l3']").val(data.list[i].change[0].guanJianLaShenXingNeng_l3);
			$("input[name='guanJianLaShenXingNeng_l4']").val(data.list[i].change[0].guanJianLaShenXingNeng_l4);
			$("input[name='guanJianLaShenXingNeng_l5']").val(data.list[i].change[0].guanJianLaShenXingNeng_l5);
			$("input[name='guanJianLaShenXingNeng_l6']").val(data.list[i].change[0].guanJianLaShenXingNeng_l6);
			$("input[name='guanJianLaShenXingNeng_l7']").val(data.list[i].change[0].guanJianLaShenXingNeng_l7);
			$("input[name='guanJianLaShenXingNeng_b1']").val(data.list[i].guanJianLaShenXingNeng_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l1" value="'+data.list[i].change[j].guanJianLaShenXingNeng_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l2" value="'+data.list[i].change[j].guanJianLaShenXingNeng_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l3" value="'+data.list[i].change[j].guanJianLaShenXingNeng_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l4" value="'+data.list[i].change[j].guanJianLaShenXingNeng_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l5" value="'+data.list[i].change[j].guanJianLaShenXingNeng_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l6" value="'+data.list[i].change[j].guanJianLaShenXingNeng_l6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l7" value="'+data.list[i].change[j].guanJianLaShenXingNeng_l7+'"/></td>';
						$str+='<td align="center">/td>';
					    $str+='</tr>';
					    $("#guanJianLaShenXingNeng").before($str);
				}
			}
		}

		if(data.list[i].name == "guanJianChongJi"){//
			$("input[name='guanJianChongJi_a1'][value='"+data.list[i].guanJianChongJi_a1+"']").attr("checked",true); 
			$("input[name='guanJianChongJi_a2'][value='"+data.list[i].guanJianChongJi_a2+"']").attr("checked",true);
			$("input[name='guanJianChongJi_a3'][value='"+data.list[i].guanJianChongJi_a3+"']").attr("checked",true); 
			$("input[name='guanJianChongJi_a4'][value='"+data.list[i].guanJianChongJi_a4+"']").attr("checked",true);
			$("input[name='guanJianChongJi_b1']").val(data.list[i].guanJianChongJi_b1);
			$("input[name='guanJianChongJi_b2']").val(data.list[i].guanJianChongJi_b2);
			$("input[name='guanJianChongJi_c1']").val(data.list[i].guanJianChongJi_c1);
			$("input[name='guanJianChongJi_c2']").val(data.list[i].guanJianChongJi_c2);
			$("input[name='guanJianChongJi_c3']").val(data.list[i].guanJianChongJi_c3);
			$("input[name='guanJianChongJi_c4']").val(data.list[i].guanJianChongJi_c4);
			$("input[name='guanJianChongJi_d1']").val(data.list[i].guanJianChongJi_d1);
			$("input[name='guanJianChongJi_d2']").val(data.list[i].guanJianChongJi_d2);
			$("input[name='guanJianChongJi_d3']").val(data.list[i].guanJianChongJi_d3);
			$("input[name='guanJianChongJi_d4']").val(data.list[i].guanJianChongJi_d4);
			$("input[name='guanJianChongJi_e1']").val(data.list[i].guanJianChongJi_e1);
			$("input[name='guanJianChongJi_e2']").val(data.list[i].guanJianChongJi_e2);
			$("input[name='guanJianChongJi_e3']").val(data.list[i].guanJianChongJi_e3);
			$("input[name='guanJianChongJi_e4']").val(data.list[i].guanJianChongJi_e4);
			$("input[name='guanJianChongJi_f1']").val(data.list[i].guanJianChongJi_f1);
			$("input[name='guanJianChongJi_f2']").val(data.list[i].guanJianChongJi_f2);
			$("input[name='guanJianChongJi_f3']").val(data.list[i].guanJianChongJi_f3);
			$("input[name='guanJianChongJi_f4']").val(data.list[i].guanJianChongJi_f4);
			$("input[name='guanJianChongJi_g1']").val(data.list[i].guanJianChongJi_g1);
			$("input[name='guanJianChongJi_g2']").val(data.list[i].guanJianChongJi_g2);
			$("input[name='guanJianChongJi_g3']").val(data.list[i].guanJianChongJi_g3);
			$("input[name='guanJianChongJi_g4']").val(data.list[i].guanJianChongJi_g4);
			$("input[name='guanJianChongJi_h1']").val(data.list[i].guanJianChongJi_h1);
			$("input[name='guanJianChongJi_i1']").val(data.list[i].guanJianChongJi_i1);
			$("input[name='guanJianChongJi_i2']").val(data.list[i].guanJianChongJi_i2);
			$("input[name='guanJianChongJi_i3']").val(data.list[i].guanJianChongJi_i3);
			$("input[name='guanJianChongJi_i4']").val(data.list[i].guanJianChongJi_i4);
		}

		if(data.list[i].name == "guanJianWanQu"){//
			$("input[name='guanJianWanQu_a1'][value='"+data.list[i].guanJianWanQu_a1+"']").attr("checked",true); 
			$("input[name='guanJianWanQu_a2'][value='"+data.list[i].guanJianWanQu_a2+"']").attr("checked",true);
			$("input[name='guanJianWanQu_a3'][value='"+data.list[i].guanJianWanQu_a3+"']").attr("checked",true); 
			$("input[name='guanJianWanQu_a4'][value='"+data.list[i].guanJianWanQu_a4+"']").attr("checked",true);
			$("input[name='guanJianWanQu_b1']").val(data.list[i].guanJianWanQu_b1);
			$("input[name='guanJianWanQu_b2']").val(data.list[i].guanJianWanQu_b2);
			$("input[name='guanJianWanQu_c1']").val(data.list[i].guanJianWanQu_c1);
			$("input[name='guanJianWanQu_c2']").val(data.list[i].guanJianWanQu_c2);
			$("input[name='guanJianWanQu_c3']").val(data.list[i].guanJianWanQu_c3);
			$("input[name='guanJianWanQu_c4']").val(data.list[i].guanJianWanQu_c4);
			$("input[name='guanJianWanQu_d1']").val(data.list[i].guanJianWanQu_d1);
			$("input[name='guanJianWanQu_d2']").val(data.list[i].guanJianWanQu_d2);
			$("input[name='guanJianWanQu_d3']").val(data.list[i].guanJianWanQu_d3);
			$("input[name='guanJianWanQu_d4']").val(data.list[i].guanJianWanQu_d4);
			$("input[name='guanJianWanQu_e1']").val(data.list[i].guanJianWanQu_e1);
			$("input[name='guanJianWanQu_e2']").val(data.list[i].guanJianWanQu_e2);
			$("input[name='guanJianWanQu_e3']").val(data.list[i].guanJianWanQu_e3);
			$("input[name='guanJianWanQu_e4']").val(data.list[i].guanJianWanQu_e4);
			$("input[name='guanJianWanQu_f1']").val(data.list[i].guanJianWanQu_f1);
			$("input[name='guanJianWanQu_f2']").val(data.list[i].guanJianWanQu_f2);
			$("input[name='guanJianWanQu_f3']").val(data.list[i].guanJianWanQu_f3);
			$("input[name='guanJianWanQu_f4']").val(data.list[i].guanJianWanQu_f4);
			$("input[name='guanJianWanQu_g1']").val(data.list[i].guanJianWanQu_g1);
		}

		if(data.list[i].name == "guanJianJinXiang"){//
			$("input[name='guanJianJinXiang_a1'][value='"+data.list[i].guanJianJinXiang_a1+"']").attr("checked",true); 
			$("input[name='guanJianJinXiang_a2'][value='"+data.list[i].guanJianJinXiang_a2+"']").attr("checked",true);
			$("input[name='guanJianJinXiang_a3'][value='"+data.list[i].guanJianJinXiang_a3+"']").attr("checked",true); 
			$("input[name='guanJianJinXiang_a4'][value='"+data.list[i].guanJianJinXiang_a4+"']").attr("checked",true);
			$("input[name='guanJianJinXiang_b1']").val(data.list[i].guanJianJinXiang_b1);
			$("input[name='guanJianJinXiang_b2']").val(data.list[i].guanJianJinXiang_b2);
			$("input[name='guanJianJinXiang_b3']").val(data.list[i].guanJianJinXiang_b3);
			$("input[name='guanJianJinXiang_b4']").val(data.list[i].guanJianJinXiang_b4);
			$("input[name='guanJianJinXiang_c1']").val(data.list[i].guanJianJinXiang_c1);
			$("input[name='guanJianJinXiang_c2']").val(data.list[i].guanJianJinXiang_c2);
			$("input[name='guanJianJinXiang_c3']").val(data.list[i].guanJianJinXiang_c3);
			$("input[name='guanJianJinXiang_c4']").val(data.list[i].guanJianJinXiang_c4);
			$("input[name='guanJianJinXiang_d1']").val(data.list[i].guanJianJinXiang_d1);
			$("input[name='guanJianJinXiang_d2']").val(data.list[i].guanJianJinXiang_d2);
			$("input[name='guanJianJinXiang_d3']").val(data.list[i].guanJianJinXiang_d3);
			$("input[name='guanJianJinXiang_d4']").val(data.list[i].guanJianJinXiang_d4);
			$("select[name='guanJianJinXiang_e1']").val(data.list[i].guanJianJinXiang_e1);
			$("select[name='guanJianJinXiang_e2']").val(data.list[i].guanJianJinXiang_e2);
			$("select[name='guanJianJinXiang_e3']").val(data.list[i].guanJianJinXiang_e3);
			$("select[name='guanJianJinXiang_e4']").val(data.list[i].guanJianJinXiang_e4);
			$("input[name='guanJianJinXiang_f1']").val(data.list[i].guanJianJinXiang_f1);
		}


		if(data.list[i].name == "shebeiQiTa"){//其他
			$("input[name='shebeiQiTa_a1']").val(data.list[i].shebeiQiTa_a1);
			$("input[name='shebeiQiTa_a2']").val(data.list[i].shebeiQiTa_a2);
			$("input[name='shebeiQiTa_b1']").val(data.list[i].shebeiQiTa_b1);
			$("input[name='shebeiQiTa_b2']").val(data.list[i].shebeiQiTa_b2);
			$("input[name='shebeiQiTa_b3']").val(data.list[i].shebeiQiTa_b3);
			$("input[name='shebeiQiTa_c1']").val(data.list[i].shebeiQiTa_c1);
			$("input[name='shebeiQiTa_c2']").val(data.list[i].shebeiQiTa_c2);
			$("input[name='shebeiQiTa_c3']").val(data.list[i].shebeiQiTa_c3);
			$("input[name='shebeiQiTa_c4']").val(data.list[i].shebeiQiTa_c4);
			$("input[name='shebeiQiTa_d1']").val(data.list[i].shebeiQiTa_d1);
			$("input[name='shebeiQiTa_f1']").val(data.list[i].shebeiQiTa_f1);
			$("input[name='shebeiQiTa_l1']").val(data.list[i].change[0].shebeiQiTa_l1);
			$("input[name='shebeiQiTa_l2']").val(data.list[i].change[0].shebeiQiTa_l2);
			$("input[name='shebeiQiTa_l3']").val(data.list[i].change[0].shebeiQiTa_l3);
			$("input[name='shebeiQiTa_l4']").val(data.list[i].change[0].shebeiQiTa_l4);
			$("input[name='shebeiQiTa_l5']").val(data.list[i].change[0].shebeiQiTa_l5);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="shebeiQiTa_l1" value="'+data.list[i].change[j].shebeiQiTa_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="shebeiQiTa_l2" value="'+data.list[i].change[j].shebeiQiTa_l2+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="shebeiQiTa_l3" value="'+data.list[i].change[j].shebeiQiTa_l3+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="shebeiQiTa_l4" value="'+data.list[i].change[j].shebeiQiTa_l4+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="shebeiQiTa_l5" value="'+data.list[i].change[j].shebeiQiTa_l5+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#shebeiQiTa").before($str);
				}
			}
		}
		if(data.list[i].name == "sheBeiQuDong"){		//设备 
			$("input[name='sheBeiQuDong_b1']").val(data.list[i].sheBeiQuDong_b1);
			$("input[name='sheBeiQuDong_a1']").val(data.list[i].sheBeiQuDong_a1);
			$("input[name='sheBeiQuDong_a2']").val(data.list[i].sheBeiQuDong_a2);
			$("input[name='sheBeiQuDong_a3']").val(data.list[i].sheBeiQuDong_a3);
			$("input[name='sheBeiQuDong_a4']").val(data.list[i].sheBeiQuDong_a4);
			$("input[name='sheBeiQuDong_a5']").val(data.list[i].sheBeiQuDong_a5);

			$("input[name='sheBeiQuDong_l1']").val(data.list[i].change[0].sheBeiQuDong_l1);
			$("input[name='sheBeiQuDong_l2']").val(data.list[i].change[0].sheBeiQuDong_l2);
			$("input[name='sheBeiQuDong_l3']").val(data.list[i].change[0].sheBeiQuDong_l3);
			$("input[name='sheBeiQuDong_l4']").val(data.list[i].change[0].sheBeiQuDong_l4);
			$("input[name='sheBeiQuDong_l5']").val(data.list[i].change[0].sheBeiQuDong_l5);
			$("input[name='sheBeiQuDong_l6']").val(data.list[i].change[0].sheBeiQuDong_l6);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
			$str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l1" value="'+data.list[i].change[j].sheBeiQuDong_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l2" value="'+data.list[i].change[j].sheBeiQuDong_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l3" value="'+data.list[i].change[j].sheBeiQuDong_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l4" value="'+data.list[i].change[j].sheBeiQuDong_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l5" value="'+data.list[i].change[j].sheBeiQuDong_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l6" value="'+data.list[i].change[j].sheBeiQuDong_l6+'"/></td>';
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#sheBei_quDong").before($str);
				}
			}
		}
		//设备 下料
		if(data.list[i].name == "sheBeiXiaLiao"){
			$("input[name='sheBeiXiaLiao_l1']").val(data.list[i].change[0].sheBeiXiaLiao_l1);
			$("input[name='sheBeiXiaLiao_l2']").val(data.list[i].change[0].sheBeiXiaLiao_l2);
			$("input[name='sheBeiXiaLiao_l3']").val(data.list[i].change[0].sheBeiXiaLiao_l3);
			$("input[name='sheBeiXiaLiao_l4']").val(data.list[i].change[0].sheBeiXiaLiao_l4);
			$("select[name='sheBeiXiaLiao_l5']").val(data.list[i].change[0].sheBeiXiaLiao_l5);
			$("select[name='sheBeiXiaLiao_l6']").val(data.list[i].change[0].sheBeiXiaLiao_l6);
			$("input[name='sheBeiXiaLiao_a1']").val(data.list[i].sheBeiXiaLiao_a1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiXiaLiao_l1" value="'+data.list[i].change[j].sheBeiXiaLiao_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiXiaLiao_l2" value="'+data.list[i].change[j].sheBeiXiaLiao_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiXiaLiao_l3" value="'+data.list[i].change[j].sheBeiXiaLiao_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiXiaLiao_l4" value="'+data.list[i].change[j].sheBeiXiaLiao_l4+'"/></td>';
						if(data.list[i].change[j].sheBeiXiaLiao_l5 == "符合"){
							$str+='<td align="center"><select name="sheBeiXiaLiao_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiXiaLiao_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].sheBeiXiaLiao_l6 == "符合"){
							$str+='<td align="center"><select name="sheBeiXiaLiao_l6"><option value="符合" selected>符合</option><option value="不符合" >不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiXiaLiao_l6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBei_xiaLiao").before($str);
				}
			}
		}

		if(data.list[i].name == "sheBeiTongTi"){//设备 筒体成型校圆
			$("input[name='sheBeiTongTi_l1']").val(data.list[i].change[0].sheBeiTongTi_l1);
			$("input[name='sheBeiTongTi_l2']").val(data.list[i].change[0].sheBeiTongTi_l2);
			$("input[name='sheBeiTongTi_l3']").val(data.list[i].change[0].sheBeiTongTi_l3);
			$("input[name='sheBeiTongTi_l4']").val(data.list[i].change[0].sheBeiTongTi_l4);
			$("input[name='sheBeiTongTi_l5']").val(data.list[i].change[0].sheBeiTongTi_l5);
			$("input[name='sheBeiTongTi_l6']").val(data.list[i].change[0].sheBeiTongTi_l6);
			$("input[name='sheBeiTongTi_l7']").val(data.list[i].change[0].sheBeiTongTi_l7);
			$("input[name='sheBeiTongTi_l8']").val(data.list[i].change[0].sheBeiTongTi_l8);
			$("input[name='sheBeiTongTi_a1']").val(data.list[i].sheBeiTongTi_a1);
			$("input[name='sheBeiTongTi_a2']").val(data.list[i].sheBeiTongTi_a2);
			$("input[name='sheBeiTongTi_a3']").val(data.list[i].sheBeiTongTi_a3);
			$("input[name='sheBeiTongTi_a4']").val(data.list[i].sheBeiTongTi_a4);
			$("input[name='sheBeiTongTi_a5']").val(data.list[i].sheBeiTongTi_a5);
			$("input[name='sheBeiTongTi_a6']").val(data.list[i].sheBeiTongTi_a6);
			$("input[name='sheBeiTongTi_b1']").val(data.list[i].sheBeiTongTi_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 	$str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l1" value="'+data.list[i].change[j].sheBeiTongTi_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l2" value="'+data.list[i].change[j].sheBeiTongTi_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l3" value="'+data.list[i].change[j].sheBeiTongTi_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l4" value="'+data.list[i].change[j].sheBeiTongTi_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l5" value="'+data.list[i].change[j].sheBeiTongTi_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l6" value="'+data.list[i].change[j].sheBeiTongTi_l6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l7" value="'+data.list[i].change[j].sheBeiTongTi_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l8" value="'+data.list[i].change[j].sheBeiTongTi_l8+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBei_tongTi").before($str);
				}
			}
		}

		if(data.list[i].name == "sheBeiHanJie"){//设备 焊接
			$("input[name='sheBeiHanJie_a1'][value='" + data.list[i].sheBeiHanJie_a1 + "']").attr("checked",true); 
			$("input[name='sheBeiHanJie_a2'][value='" + data.list[i].sheBeiHanJie_a2 + "']").attr("checked",true);
			$("input[name='sheBeiHanJie_a3'][value='" + data.list[i].sheBeiHanJie_a3 + "']").attr("checked",true); 
			$("input[name='sheBeiHanJie_a4'][value='" + data.list[i].sheBeiHanJie_a4 + "']").attr("checked",true);
			$("input[name='sheBeiHanJie_l1']").val(data.list[i].change[0].sheBeiHanJie_l1);
			$("input[name='sheBeiHanJie_l2']").val(data.list[i].change[0].sheBeiHanJie_l2);
			$("select[name='sheBeiHanJie_l3']").val(data.list[i].change[0].sheBeiHanJie_l3);
			$("input[name='sheBeiHanJie_l4']").val(data.list[i].change[0].sheBeiHanJie_l4);
			$("input[name='sheBeiHanJie_l5']").val(data.list[i].change[0].sheBeiHanJie_l5);
			$("select[name='sheBeiHanJie_l6']").val(data.list[i].change[0].sheBeiHanJie_l6);
			$("input[name='sheBeiHanJie_ll1']").val(data.list[i].change2[0].sheBeiHanJie_ll1);
			$("input[name='sheBeiHanJie_ll2']").val(data.list[i].change2[0].sheBeiHanJie_ll2);
			$("input[name='sheBeiHanJie_ll3']").val(data.list[i].change2[0].sheBeiHanJie_ll3);
			$("select[name='sheBeiHanJie_ll4']").val(data.list[i].change2[0].sheBeiHanJie_ll4);
			$("select[name='sheBeiHanJie_ll5']").val(data.list[i].change2[0].sheBeiHanJie_ll5);
			$("input[name='sheBeiHanJie_ll6']").val(data.list[i].change2[0].sheBeiHanJie_ll6);
			$("input[name='sheBeiHanJie_ll7']").val(data.list[i].change2[0].sheBeiHanJie_ll7);
			$("input[name='sheBeiHanJie_b1']").val(data.list[i].sheBeiHanJie_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 	$str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_l1" value="'+data.list[i].change[j].sheBeiHanJie_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_l2" value="'+data.list[i].change[j].sheBeiHanJie_l2+'"/></td>';
						if(data.list[i].change[j].sheBeiHanJie_l3 =="符合"){
							$str+='<td align="center"><select name="sheBeiHanJie_l3"><option value="符合" selected>符合</option><option value="不符合" >不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiHanJie_l3"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_l4" value="'+data.list[i].change[j].sheBeiHanJie_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_l5" value="'+data.list[i].change[j].sheBeiHanJie_l5+'"/></td>';
						if(data.list[i].change[j].sheBeiHanJie_l6 =="符合"){
							$str+='<td align="center" colspan="2"><select name="sheBeiHanJie_l6" selected><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center" colspan="2"><select name="sheBeiHanJie_l6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBei_hanJie1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_ll1"  value="'+data.list[i].change2[j].sheBeiHanJie_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_ll2"  value="'+data.list[i].change2[j].sheBeiHanJie_ll2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_ll3" value="'+data.list[i].change2[j].sheBeiHanJie_ll3+'"/></td>';
						if(data.list[i].change2[j].sheBeiHanJie_ll4 == "符合"){
							$str+='<td align="center"><select name="sheBeiHanJie_ll4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiHanJie_ll4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change2[j].sheBeiHanJie_ll5 == "符合"){
							$str+='<td align="center"><select name="sheBeiHanJie_ll5"><option value="符合" selected>符合</option><option value="不符合" >不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiHanJie_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_ll6" value="'+data.list[i].change2[j].sheBeiHanJie_ll6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_ll7" value="'+data.list[i].change2[j].sheBeiHanJie_ll7+'"/></td>';
						$str+='<td align="center">/td>';
					    $str+='</tr>';
					    $("#sheBei_hanJie2").before($str);
				}
			}
		}

		if(data.list[i].name == "sheBeiSheXianGuoCheng"){		//设备 射线检测过程
			$("input[name='sheBeiSheXianGuoCheng_b1']").val(data.list[i].sheBeiSheXianGuoCheng_b1);
			$("input[name='sheBeiSheXianGuoCheng_a1'][value='" + data.list[i].sheBeiSheXianGuoCheng_a1 + "']").attr("checked",true); 
			$("input[name='sheBeiSheXianGuoCheng_a2'][value='" + data.list[i].sheBeiSheXianGuoCheng_a2 + "']").attr("checked",true);
			$("input[name='sheBeiSheXianGuoCheng_a3'][value='" + data.list[i].sheBeiSheXianGuoCheng_a3 + "']").attr("checked",true); 
			$("input[name='sheBeiSheXianGuoCheng_a4'][value='" + data.list[i].sheBeiSheXianGuoCheng_a4 + "']").attr("checked",true);

			$("input[name='sheBeiSheXianGuoCheng_l1']").val(data.list[i].change[0].sheBeiSheXianGuoCheng_l1);
			$("input[name='sheBeiSheXianGuoCheng_l2']").val(data.list[i].change[0].sheBeiSheXianGuoCheng_l2);
			$("input[name='sheBeiSheXianGuoCheng_l3']").val(data.list[i].change[0].sheBeiSheXianGuoCheng_l3);
			$("input[name='sheBeiSheXianGuoCheng_l4']").val(data.list[i].change[0].sheBeiSheXianGuoCheng_l4);
			$("select[name='sheBeiSheXianGuoCheng_l5']").val(data.list[i].change[0].sheBeiSheXianGuoCheng_l5);
			$("input[name='sheBeiSheXianGuoCheng_l6']").val(data.list[i].change[0].sheBeiSheXianGuoCheng_l6);
			$("select[name='sheBeiSheXianGuoCheng_l7']").val(data.list[i].change[0].sheBeiSheXianGuoCheng_l7);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianGuoCheng_l1" value="'+data.list[i].change[j].sheBeiSheXianGuoCheng_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianGuoCheng_l2" value="'+data.list[i].change[j].sheBeiSheXianGuoCheng_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianGuoCheng_l3" value="'+data.list[i].change[j].sheBeiSheXianGuoCheng_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianGuoCheng_l4" value="'+data.list[i].change[j].sheBeiSheXianGuoCheng_l4+'"/></td>';
					if (data.list[i].change[j].sheBeiSheXianGuoCheng_l5 == "符合") {
						$str+='<td align="center"><select name="sheBeiSheXianGuoCheng_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="sheBeiSheXianGuoCheng_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianGuoCheng_l6" value="'+data.list[i].change[j].sheBeiSheXianGuoCheng_l6+'"/></td>';
					if (data.list[i].change[j].sheBeiSheXianGuoCheng_l7 == "符合") {
						$str+='<td align="center"><select name="sheBeiSheXianGuoCheng_l7"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="sheBeiSheXianGuoCheng_l7"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#sheBei_sheXianGuoCheng").before($str);
				}
			}
		}

		if(data.list[i].name == "sheBeiChaoShengBo"){
			$("input[name='sheBeiChaoShengBo_a1'][value='" + data.list[i].sheBeiChaoShengBo_a1 + "']").attr("checked",true); 
			$("input[name='sheBeiChaoShengBo_a2'][value='" + data.list[i].sheBeiChaoShengBo_a2 + "']").attr("checked",true);
			$("input[name='sheBeiChaoShengBo_a3'][value='" + data.list[i].sheBeiChaoShengBo_a3 + "']").attr("checked",true);
			$("input[name='sheBeiChaoShengBo_a4'][value='" + data.list[i].sheBeiChaoShengBo_a4 + "']").attr("checked",true);
			$("input[name='sheBeiChaoShengBo_b1'][value='" + data.list[i].sheBeiChaoShengBo_b1 + "']").attr("checked",true);
			
			$("input[name='sheBeiChaoShengBo_l1']").val(data.list[i].change[0].sheBeiChaoShengBo_l1);
			$("input[name='sheBeiChaoShengBo_l2']").val(data.list[i].change[0].sheBeiChaoShengBo_l2);
			$("input[name='sheBeiChaoShengBo_l3']").val(data.list[i].change[0].sheBeiChaoShengBo_l3);
			$("input[name='sheBeiChaoShengBo_l4']").val(data.list[i].change[0].sheBeiChaoShengBo_l4);
			$("input[name='sheBeiChaoShengBo_l5']").val(data.list[i].change[0].sheBeiChaoShengBo_l5);
			
			$("input[name='sheBeiChaoShengBo_ll1']").val(data.list[i].change2[0].sheBeiChaoShengBo_ll1);
			$("input[name='sheBeiChaoShengBo_ll2']").val(data.list[i].change2[0].sheBeiChaoShengBo_ll2);
			$("input[name='sheBeiChaoShengBo_ll3']").val(data.list[i].change2[0].sheBeiChaoShengBo_ll3);
			$("select[name='sheBeiChaoShengBo_ll4']").val(data.list[i].change2[0].sheBeiChaoShengBo_ll4);
			$("select[name='sheBeiChaoShengBo_ll5']").val(data.list[i].change2[0].sheBeiChaoShengBo_ll5);
			$("input[name='sheBeiChaoShengBo_ll6']").val(data.list[i].change2[0].sheBeiChaoShengBo_ll6);
			$("input[name='sheBeiChaoShengBo_ll7']").val(data.list[i].change2[0].sheBeiChaoShengBo_ll7);
			$("input[name='sheBeiChaoShengBo_c1']").val(data.list[i].sheBeiChaoShengBo_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_l1" value="'+data.list[i].change[j].sheBeiChaoShengBo_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_l2" value="'+data.list[i].change[j].sheBeiChaoShengBo_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_l3" value="'+data.list[i].change[j].sheBeiChaoShengBo_l3+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiChaoShengBo_l4" value="'+data.list[i].change[j].sheBeiChaoShengBo_l4+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiChaoShengBo_l5" value="'+data.list[i].change[j].sheBeiChaoShengBo_l5+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBeiChaoShengBo1").before($str);
				}
			}
			if (data.list[i].change2[0].length>1) {
				for(var j=1;j<data.list[i].change2[0].length;j++){
					  $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_ll1" value="'+data.list[i].change2[j].sheBeiChaoShengBo_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_ll2" value="'+data.list[i].change2[j].sheBeiChaoShengBo_ll2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_ll3" value="'+data.list[i].change2[j].sheBeiChaoShengBo_ll3+'"/></td>';
						if(data.list[i].change2[j].sheBeiChaoShengBo_ll4=="符合"){
							$str+='<td align="center"><select name="sheBeiChaoShengBo_ll4" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiChaoShengBo_ll4" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change2[j].sheBeiChaoShengBo_ll5=="符合"){
							$str+='<td align="center"><select name="sheBeiChaoShengBo_ll5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiChaoShengBo_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_ll6" value="'+data.list[i].change2[j].sheBeiChaoShengBo_ll6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_ll7" value="'+data.list[i].change2[j].sheBeiChaoShengBo_ll7+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBeiChaoShengBo2").before($str);
				}
			}
		}

		if(data.list[i].name == "sheBeiCiFenJianCe"){//阀门 磁粉检测
			$("input[name='sheBeiCiFenJianCe_a1'][value='" + data.list[i].sheBeiCiFenJianCe_a1+ "']").attr("checked",true); 
			$("input[name='sheBeiCiFenJianCe_a2'][value='" + data.list[i].sheBeiCiFenJianCe_a2+ "']").attr("checked",true);
			$("input[name='sheBeiCiFenJianCe_a3'][value='" + data.list[i].sheBeiCiFenJianCe_a3+ "']").attr("checked",true);
			$("input[name='sheBeiCiFenJianCe_a4'][value='" + data.list[i].sheBeiCiFenJianCe_a4+ "']").attr("checked",true);
			$("input[name='sheBeiCiFenJianCe_b1'][value='" + data.list[i].sheBeiCiFenJianCe_b1+ "']").attr("checked",true);
			
			$("input[name='sheBeiCiFenJianCe_l1']").val(data.list[i].change[0].sheBeiCiFenJianCe_l1);
			$("input[name='sheBeiCiFenJianCe_l2']").val(data.list[i].change[0].sheBeiCiFenJianCe_l2);
			$("input[name='sheBeiCiFenJianCe_l3']").val(data.list[i].change[0].sheBeiCiFenJianCe_l3);
			$("input[name='sheBeiCiFenJianCe_l4']").val(data.list[i].change[0].sheBeiCiFenJianCe_l4);
			$("input[name='sheBeiCiFenJianCe_l5']").val(data.list[i].change[0].sheBeiCiFenJianCe_l5);
			
			$("input[name='sheBeiCiFenJianCe_ll1']").val(data.list[i].change2[0].sheBeiCiFenJianCe_ll1);
			$("input[name='sheBeiCiFenJianCe_ll2']").val(data.list[i].change2[0].sheBeiCiFenJianCe_ll2);
			$("input[name='sheBeiCiFenJianCe_ll3']").val(data.list[i].change2[0].sheBeiCiFenJianCe_ll3);
			$("select[name='sheBeiCiFenJianCe_ll4']").val(data.list[i].change2[0].sheBeiCiFenJianCe_ll4);
			$("select[name='sheBeiCiFenJianCe_ll5']").val(data.list[i].change2[0].sheBeiCiFenJianCe_ll5);
			$("input[name='sheBeiCiFenJianCe_ll6']").val(data.list[i].change2[0].sheBeiCiFenJianCe_ll6);
			$("input[name='sheBeiCiFenJianCe_c1']").val(data.list[i].sheBeiCiFenJianCe_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiCiFenJianCe_l1" value="'+data.list[i].change[j].sheBeiCiFenJianCe_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiCiFenJianCe_l2" value="'+data.list[i].change[j].sheBeiCiFenJianCe_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiCiFenJianCe_l3" value="'+data.list[i].change[j].sheBeiCiFenJianCe_l3+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiCiFenJianCe_l4" value="'+data.list[i].change[j].sheBeiCiFenJianCe_l4+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiCiFenJianCe_l5" value="'+data.list[i].change[j].sheBeiCiFenJianCe_l5+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBeiCiFenJianCe1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiCiFenJianCe_ll1" value="'+data.list[i].change2[j].sheBeiCiFenJianCe_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiCiFenJianCe_ll2" value="'+data.list[i].change2[j].sheBeiCiFenJianCe_ll2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiCiFenJianCe_ll3" value="'+data.list[i].change2[j].sheBeiCiFenJianCe_ll3+'"/></td>';
						if(data.list[i].change2[j].sheBeiCiFenJianCe_ll4=="符合"){
							$str+='<td align="center"><select name="sheBeiCiFenJianCe_ll4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiCiFenJianCe_ll4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change2[j].sheBeiCiFenJianCe_ll5=="符合"){
							$str+='<td align="center"><select name="sheBeiCiFenJianCe_ll5" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiCiFenJianCe_ll5" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiCiFenJianCe_ll6" value="'+data.list[i].change2[j].sheBeiCiFenJianCe_ll6+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBeiCiFenJianCe2").before($str);
				}
			}
		}

		if(data.list[i].name == "sheBeiShenTouJianCe"){//阀门 渗透检测
			$("input[name='sheBeiShenTouJianCe_a1'][value='"+data.list[i].sheBeiShenTouJianCe_a1+"']").attr("checked",true); 
			$("input[name='sheBeiShenTouJianCe_a2'][value='"+data.list[i].sheBeiShenTouJianCe_a2+"']").attr("checked",true);
			$("input[name='sheBeiShenTouJianCe_a3'][value='"+data.list[i].sheBeiShenTouJianCe_a3+"']").attr("checked",true);
			$("input[name='sheBeiShenTouJianCe_b1'][value='"+data.list[i].sheBeiShenTouJianCe_b1+"']").attr("checked",true);
			
			$("input[name='sheBeiShenTouJianCe_l1']").val(data.list[i].change[0].sheBeiShenTouJianCe_l1);
			$("input[name='sheBeiShenTouJianCe_l2']").val(data.list[i].change[0].sheBeiShenTouJianCe_l2);
			$("input[name='sheBeiShenTouJianCe_l3']").val(data.list[i].change[0].sheBeiShenTouJianCe_l3);
			$("input[name='sheBeiShenTouJianCe_l4']").val(data.list[i].change[0].sheBeiShenTouJianCe_l4);
			
			$("input[name='sheBeiShenTouJianCe_ll1']").val(data.list[i].change2[0].sheBeiShenTouJianCe_ll1);
			$("input[name='sheBeiShenTouJianCe_ll2']").val(data.list[i].change2[0].sheBeiShenTouJianCe_ll2);
			$("input[name='sheBeiShenTouJianCe_ll3']").val(data.list[i].change2[0].sheBeiShenTouJianCe_ll3);
			$("input[name='sheBeiShenTouJianCe_ll4']").val(data.list[i].change2[0].sheBeiShenTouJianCe_ll4);
			$("select[name='sheBeiShenTouJianCe_ll5']").val(data.list[i].change2[0].sheBeiShenTouJianCe_ll5);
			$("input[name='sheBeiShenTouJianCe_ll6']").val(data.list[i].change2[0].sheBeiShenTouJianCe_ll6);
			$("input[name='sheBeiShenTouJianCe_c1']").val(data.list[i].sheBeiShenTouJianCe_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					  $str='';
				        $str+='<tr>';
				        $str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_l1" value="'+data.list[i].change[j].sheBeiShenTouJianCe_l1+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_l2" value="'+data.list[i].change[j].sheBeiShenTouJianCe_l2+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_l3" value="'+data.list[i].change[j].sheBeiShenTouJianCe_l3+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_l4" value="'+data.list[i].change[j].sheBeiShenTouJianCe_l4+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBeiShenTouJianCe1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_ll1" value="'+data.list[i].change2[j].sheBeiShenTouJianCe_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_ll2" value="'+data.list[i].change2[j].sheBeiShenTouJianCe_ll2+'" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_ll3" value="'+data.list[i].change2[j].sheBeiShenTouJianCe_ll3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_ll4" value="'+data.list[i].change2[j].sheBeiShenTouJianCe_ll4+'"/></td>';
						if(data.list[i].change2[j].sheBeiShenTouJianCe_ll5=="符合"){
							$str+='<td align="center"><select name="sheBeiShenTouJianCe_ll5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiShenTouJianCe_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_ll6" value="'+data.list[i].change2[j].sheBeiShenTouJianCe_ll6+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBeiShenTouJianCe2").before($str);
				}
			}
		}


		if(data.list[i].name == "sheBeiSheXianDiPian"){
			$("input[name='sheBeiSheXianDiPian_a1'][value='" + data.list[i].sheBeiSheXianDiPian_a1+ "']").attr("checked",true); 
			$("input[name='sheBeiSheXianDiPian_a2'][value='" + data.list[i].sheBeiSheXianDiPian_a2+ "']").attr("checked",true);
			$("input[name='sheBeiSheXianDiPian_a3'][value='" + data.list[i].sheBeiSheXianDiPian_a3+ "']").attr("checked",true);
			$("input[name='sheBeiSheXianDiPian_a4'][value='" + data.list[i].sheBeiSheXianDiPian_a4+ "']").attr("checked",true);
			$("input[name='sheBeiSheXianDiPian_b1']").val(data.list[i].sheBeiSheXianDiPian_b1);
			
			$("input[name='sheBeiSheXianDiPian_l1']").val(data.list[i].change[0].sheBeiSheXianDiPian_l1);
			$("input[name='sheBeiSheXianDiPian_l2']").val(data.list[i].change[0].sheBeiSheXianDiPian_l2);
			$("input[name='sheBeiSheXianDiPian_l3']").val(data.list[i].change[0].sheBeiSheXianDiPian_l3);
			$("input[name='sheBeiSheXianDiPian_l4']").val(data.list[i].change[0].sheBeiSheXianDiPian_l4);
			$("input[name='sheBeiSheXianDiPian_l5']").val(data.list[i].change[0].sheBeiSheXianDiPian_l5);
			$("input[name='sheBeiSheXianDiPian_l6']").val(data.list[i].change[0].sheBeiSheXianDiPian_l6);
			$("input[name='sheBeiSheXianDiPian_l7']").val(data.list[i].change[0].sheBeiSheXianDiPian_l7);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l1" value="'+data.list[i].change[j].sheBeiSheXianDiPian_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l2" value="'+data.list[i].change[j].sheBeiSheXianDiPian_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l3" value="'+data.list[i].change[j].sheBeiSheXianDiPian_l3+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l4" value="'+data.list[i].change[j].sheBeiSheXianDiPian_l4+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l5" value="'+data.list[i].change[j].sheBeiSheXianDiPian_l5+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l6" value="'+data.list[i].change[j].sheBeiSheXianDiPian_l6+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l7" value="'+data.list[i].change[j].sheBeiSheXianDiPian_l7+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBeiSheXianDiPian1").before($str);
				}
			}
		}

		if(data.list[i].name == "sheBeiHuaXian"){//
			$("input[name='sheBeiHuaXian_a1'][value='" + data.list[i].sheBeiHuaXian_a1+ "']").attr("checked",true); 
			$("input[name='sheBeiHuaXian_a2'][value='" + data.list[i].sheBeiHuaXian_a2+ "']").attr("checked",true);
			$("input[name='sheBeiHuaXian_b1']").val(data.list[i].sheBeiHuaXian_b1);
			
			$("input[name='sheBeiHuaXian_l1']").val(data.list[i].change[0].sheBeiHuaXian_l1);
			$("input[name='sheBeiHuaXian_l2']").val(data.list[i].change[0].sheBeiHuaXian_l2);
			$("select[name='sheBeiHuaXian_l3']").val(data.list[i].change[0].sheBeiHuaXian_l3);
			$("input[name='sheBeiHuaXian_l4']").val(data.list[i].change[0].sheBeiHuaXian_l4);
			$("input[name='sheBeiHuaXian_l5']").val(data.list[i].change[0].sheBeiHuaXian_l5);
			$("input[name='sheBeiHuaXian_l6']").val(data.list[i].change[0].sheBeiHuaXian_l6);
			$("input[name='sheBeiHuaXian_l7']").val(data.list[i].change[0].sheBeiHuaXian_l7);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHuaXian_l1" value="'+data.list[i].change[j].sheBeiHuaXian_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHuaXian_l2" value="'+data.list[i].change[j].sheBeiHuaXian_l2+'"/></td>';
				        if(data.list[i].change[j].sheBeiHuaXian_l3=="符合"){
							$str+='<td align="center"><select name="sheBeiShenTouJianCe_ll5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiShenTouJianCe_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiHuaXian_l4" value="'+data.list[i].change[j].sheBeiHuaXian_l4+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiHuaXian_l5" value="'+data.list[i].change[j].sheBeiHuaXian_l5+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiHuaXian_l6" value="'+data.list[i].change[j].sheBeiHuaXian_l6+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiHuaXian_l7" value="'+data.list[i].change[j].sheBeiHuaXian_l7+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBei_huaXian").before($str);
				}
			}
		}

		if(data.list[i].name == "sheBeiReChuLi"){//
			$("input[name='sheBeiReChuLi_a1'][value='" + data.list[i].sheBeiReChuLi_a1+ "']").attr("checked",true); 
			$("input[name='sheBeiReChuLi_a2'][value='" + data.list[i].sheBeiReChuLi_a2+ "']").attr("checked",true);
			$("input[name='sheBeiReChuLi_b1']").val(data.list[i].sheBeiReChuLi_b1);
			
			$("input[name='sheBeiReChuLi_l1']").val(data.list[i].change[0].sheBeiReChuLi_l1);
			$("input[name='sheBeiReChuLi_l2']").val(data.list[i].change[0].sheBeiReChuLi_l2);
			$("input[name='sheBeiReChuLi_l3']").val(data.list[i].change[0].sheBeiReChuLi_l3);
			$("input[name='sheBeiReChuLi_l4']").val(data.list[i].change[0].sheBeiReChuLi_l4);
			$("input[name='sheBeiReChuLi_l5']").val(data.list[i].change[0].sheBeiReChuLi_l5);
			$("input[name='sheBeiReChuLi_l6']").val(data.list[i].change[0].sheBeiReChuLi_l6);
			$("input[name='sheBeiReChuLi_l7']").val(data.list[i].change[0].sheBeiReChuLi_l7);
			$("input[name='sheBeiReChuLi_l8']").val(data.list[i].change[0].sheBeiReChuLi_l8);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiReChuLi_l1" value="'+data.list[i].change[j].sheBeiReChuLi_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiReChuLi_l2" value="'+data.list[i].change[j].sheBeiReChuLi_l2+'"/></td>';
				   
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiReChuLi_l3" value="'+data.list[i].change[j].sheBeiReChuLi_l3+'"/></td>';
						
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiReChuLi_l4" value="'+data.list[i].change[j].sheBeiReChuLi_l4+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiReChuLi_l5" value="'+data.list[i].change[j].sheBeiReChuLi_l5+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiReChuLi_l6" value="'+data.list[i].change[j].sheBeiReChuLi_l6+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiReChuLi_l7" value="'+data.list[i].change[j].sheBeiReChuLi_l7+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiReChuLi_l8" value="'+data.list[i].change[j].sheBeiReChuLi_l8+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBei_reChuLi").before($str);
				}
			}
		}


		if(data.list[i].name == "sheBeiShuiYa"){//
			$("input[name='sheBeiShuiYa_a1'][value='" + data.list[i].sheBeiShuiYa_a1+ "']").attr("checked",true); 
			$("input[name='sheBeiShuiYa_a2'][value='" + data.list[i].sheBeiShuiYa_a2+ "']").attr("checked",true);
			$("input[name='sheBeiShuiYa_b1']").val(data.list[i].sheBeiShuiYa_b1);
			$("input[name='sheBeiShuiYa_b2']").val(data.list[i].sheBeiShuiYa_b2);
			$("input[name='sheBeiShuiYa_b3']").val(data.list[i].sheBeiShuiYa_b3);
			$("input[name='sheBeiShuiYa_b4']").val(data.list[i].sheBeiShuiYa_b4);
			$("input[name='sheBeiShuiYa_b5']").val(data.list[i].sheBeiShuiYa_b5);
			$("input[name='sheBeiShuiYa_b6']").val(data.list[i].sheBeiShuiYa_b6);
			$("input[name='sheBeiShuiYa_b7']").val(data.list[i].sheBeiShuiYa_b7);
			$("input[name='sheBeiShuiYa_c1']").val(data.list[i].sheBeiShuiYa_c1);
			
			$("input[name='sheBeiShuiYa_l1']").val(data.list[i].change[0].sheBeiShuiYa_l1);
			$("input[name='sheBeiShuiYa_l2']").val(data.list[i].change[0].sheBeiShuiYa_l2);
			$("input[name='sheBeiShuiYa_l3']").val(data.list[i].change[0].sheBeiShuiYa_l3);
			$("select[name='sheBeiShuiYa_l4']").val(data.list[i].change[0].sheBeiShuiYa_l4);
			$("input[name='sheBeiShuiYa_l5']").val(data.list[i].change[0].sheBeiShuiYa_l5);
			$("select[name='sheBeiShuiYa_l6']").val(data.list[i].change[0].sheBeiShuiYa_l6);
			$("input[name='sheBeiShuiYa_l7']").val(data.list[i].change[0].sheBeiShuiYa_l7);
			$("select[name='sheBeiShuiYa_l8']").val(data.list[i].change[0].sheBeiShuiYa_l8);
			$("input[name='sheBeiShuiYa_l9']").val(data.list[i].change[0].sheBeiShuiYa_l9);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShuiYa_l1" value="'+data.list[i].change[j].sheBeiShuiYa_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShuiYa_l2" value="'+data.list[i].change[j].sheBeiShuiYa_l2+'"/></td>';
				   
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShuiYa_l3" value="'+data.list[i].change[j].sheBeiShuiYa_l7+'"/></td>';
						if(data.list[i].change[j].sheBeiShuiYa_l4=="立"){
							$str+='<td align="center"><select name="sheBeiShuiYa_l4"><option value="立" selected>立</option><option value="卧">卧</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiShuiYa_l4"><option value="立">立</option><option value="卧" selected>卧</option></select></td>';
						}
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShuiYa_l5" value="'+data.list[i].change[j].sheBeiShuiYa_l5+'"/></td>';
						if(data.list[i].change[j].sheBeiShuiYa_l6=="符合"){
							$str+='<td align="center"><select name="sheBeiShuiYa_l6"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiShuiYa_l6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShuiYa_l7" value="'+data.list[i].change[j].sheBeiShuiYa_l7+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShuiYa_l8" value="'+data.list[i].change[j].sheBeiShuiYa_l8+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShuiYa_l9" value="'+data.list[i].change[j].sheBeiShuiYa_l9+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBei_shuiYa").before($str);
				}
			}
		}

		if(data.list[i].name == "sheBeiChuXiu"){//
			$("input[name='sheBeiChuXiu_a1']").val(data.list[i].sheBeiChuXiu_a1);
			$("input[name='sheBeiChuXiu_b1']").val(data.list[i].sheBeiChuXiu_b1);
			
			$("input[name='sheBeiChuXiu_l1']").val(data.list[i].change[0].sheBeiChuXiu_l1);
			$("input[name='sheBeiChuXiu_l2']").val(data.list[i].change[0].sheBeiChuXiu_l2);
			$("input[name='sheBeiChuXiu_l3']").val(data.list[i].change[0].sheBeiChuXiu_l3);
			$("select[name='sheBeiChuXiu_l4']").val(data.list[i].change[0].sheBeiChuXiu_l4);
			$("select[name='sheBeiChuXiu_l5']").val(data.list[i].change[0].sheBeiChuXiu_l5);
			$("select[name='sheBeiChuXiu_l6']").val(data.list[i].change[0].sheBeiChuXiu_l6);
			$("input[name='sheBeiChuXiu_l7']").val(data.list[i].change[0].sheBeiChuXiu_l7);
			$("input[name='sheBeiChuXiu_l8']").val(data.list[i].change[0].sheBeiChuXiu_l8);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChuXiu_l1" value="'+data.list[i].change[j].sheBeiChuXiu_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChuXiu_l2" value="'+data.list[i].change[j].sheBeiChuXiu_l2+'"/></td>';
				   
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiChuXiu_l3" value="'+data.list[i].change[j].sheBeiChuXiu_l7+'"/></td>';
						if(data.list[i].change[j].sheBeiChuXiu_l4=="符合"){
							$str+='<td align="center"><select name="sheBeiChuXiu_l4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiChuXiu_l4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].sheBeiChuXiu_l5=="符合"){
							$str+='<td align="center"><select name="sheBeiChuXiu_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiChuXiu_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].sheBeiChuXiu_l6=="符合"){
							$str+='<td align="center"><select name="sheBeiChuXiu_l6"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiChuXiu_l6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiChuXiu_l7" value="'+data.list[i].change[j].sheBeiChuXiu_l7+'"/></td>';
						$str+='<td align="center"><input class="input_140 easyui-validatebox" type="text" name="sheBeiChuXiu_l8" value="'+data.list[i].change[j].sheBeiChuXiu_l8+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBei_chuXiu").before($str);
				}
			}
		}


		if(data.list[i].name == "sheBeiBaoZhuang"){//
			$("input[name='sheBeiBaoZhuang_a1']").val(data.list[i].sheBeiBaoZhuang_a1);
			
			$("input[name='sheBeiBaoZhuang_l1']").val(data.list[i].change[0].sheBeiBaoZhuang_l1);
			$("input[name='sheBeiBaoZhuang_l2']").val(data.list[i].change[0].sheBeiBaoZhuang_l2);
			$("select[name='sheBeiBaoZhuang_l3']").val(data.list[i].change[0].sheBeiBaoZhuang_l3);
			$("select[name='sheBeiBaoZhuang_l4']").val(data.list[i].change[0].sheBeiBaoZhuang_l4);
			$("select[name='sheBeiBaoZhuang_l5']").val(data.list[i].change[0].sheBeiBaoZhuang_l5);
			$("select[name='sheBeiBaoZhuang_l6']").val(data.list[i].change[0].sheBeiBaoZhuang_l6);
			$("select[name='sheBeiBaoZhuang_l7']").val(data.list[i].change[0].sheBeiBaoZhuang_l7);
			$("select[name='sheBeiBaoZhuang_l8']").val(data.list[i].change[0].sheBeiBaoZhuang_l8);
			$("select[name='sheBeiBaoZhuang_l9']").val(data.list[i].change[0].sheBeiBaoZhuang_l9);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiBaoZhuang_l1" value="'+data.list[i].change[j].sheBeiBaoZhuang_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiBaoZhuang_l2" value="'+data.list[i].change[j].sheBeiBaoZhuang_l2+'"/></td>';
				   
						if(data.list[i].change[j].sheBeiBaoZhuang_l4=="整体"){
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l4"><option value="整体" selected>整体</option><option value="分段">分段</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l4"><option value="整体">整体</option><option value="分段" selected>分段</option></select></td>';
						}
						if(data.list[i].change[j].sheBeiBaoZhuang_l4=="符合"){
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].sheBeiBaoZhuang_l5=="符合"){
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].sheBeiBaoZhuang_l6=="符合"){
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l6"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].sheBeiBaoZhuang_l7=="符合"){
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l7"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l7"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].sheBeiBaoZhuang_l8=="符合"){
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l8"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l8"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].sheBeiBaoZhuang_l9=="符合"){
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l9"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="sheBeiBaoZhuang_l9"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#sheBei_baoZhuang").before($str);
				}
			}
		}

		if(data.list[i].name == "sheBeiHuaXue"){//化学成分
			$("input[name='sheBeiHuaXue_a1'][value='"+data.list[i].sheBeiHuaXue_a1+"']").attr("checked",true); 
			$("input[name='sheBeiHuaXue_a2'][value='"+data.list[i].sheBeiHuaXue_a2+"']").attr("checked",true);
			$("input[name='sheBeiHuaXue_b1']").val(data.list[i].sheBeiHuaXue_b1);
			$("input[name='sheBeiHuaXue_b2']").val(data.list[i].sheBeiHuaXue_b2);
			$("input[name='sheBeiHuaXue_b3']").val(data.list[i].sheBeiHuaXue_b3);
			$("input[name='sheBeiHuaXue_b4']").val(data.list[i].sheBeiHuaXue_b4);
			$("input[name='sheBeiHuaXue_c1']").val(data.list[i].sheBeiHuaXue_c1);
			$("input[name='sheBeiHuaXue_c2']").val(data.list[i].sheBeiHuaXue_c2);
			$("input[name='sheBeiHuaXue_c3']").val(data.list[i].sheBeiHuaXue_c3);
			$("input[name='sheBeiHuaXue_c4']").val(data.list[i].sheBeiHuaXue_c4);
			$("input[name='sheBeiHuaXue_d1']").val(data.list[i].sheBeiHuaXue_d1);
			$("input[name='sheBeiHuaXue_d2']").val(data.list[i].sheBeiHuaXue_d2);
			$("input[name='sheBeiHuaXue_d3']").val(data.list[i].sheBeiHuaXue_d3);
			$("input[name='sheBeiHuaXue_d4']").val(data.list[i].sheBeiHuaXue_d4);
			$("input[name='sheBeiHuaXue_e1']").val(data.list[i].sheBeiHuaXue_e1);
			$("input[name='sheBeiHuaXue_e2']").val(data.list[i].sheBeiHuaXue_e2);
			$("input[name='sheBeiHuaXue_e3']").val(data.list[i].sheBeiHuaXue_e3);
			$("input[name='sheBeiHuaXue_e4']").val(data.list[i].sheBeiHuaXue_e4);
			$("input[name='sheBeiHuaXue_f1']").val(data.list[i].sheBeiHuaXue_f1);
		}

		if(data.list[i].name == "sheBeiLaShen"){//拉伸性能
			$("input[name='sheBeiLaShen_a1'][value='"+data.list[i].sheBeiLaShen_a1+"']").attr("checked",true); 
			$("input[name='sheBeiLaShen_a2'][value='"+data.list[i].sheBeiLaShen_a2+"']").attr("checked",true);
			$("input[name='sheBeiLaShen_a3'][value='"+data.list[i].sheBeiLaShen_a3+"']").attr("checked",true); 
			$("input[name='sheBeiLaShen_a4'][value='"+data.list[i].sheBeiLaShen_a4+"']").attr("checked",true);
			$("input[name='sheBeiLaShen_l1']").val(data.list[i].change[0].sheBeiLaShen_l1);
			$("input[name='sheBeiLaShen_l2']").val(data.list[i].change[0].sheBeiLaShen_l2);
			$("input[name='sheBeiLaShen_l3']").val(data.list[i].change[0].sheBeiLaShen_l3);
			$("input[name='sheBeiLaShen_l4']").val(data.list[i].change[0].sheBeiLaShen_l4);
			$("input[name='sheBeiLaShen_l5']").val(data.list[i].change[0].sheBeiLaShen_l5);
			$("input[name='sheBeiLaShen_l6']").val(data.list[i].change[0].sheBeiLaShen_l6);
			$("input[name='sheBeiLaShen_l7']").val(data.list[i].change[0].sheBeiLaShen_l7);
			$("input[name='sheBeiLaShen_b1']").val(data.list[i].sheBeiLaShen_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l1" value="'+data.list[i].change[j].sheBeiLaShen_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l2" value="'+data.list[i].change[j].sheBeiLaShen_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l3" value="'+data.list[i].change[j].sheBeiLaShen_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l4" value="'+data.list[i].change[j].sheBeiLaShen_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l5" value="'+data.list[i].change[j].sheBeiLaShen_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l6" value="'+data.list[i].change[j].sheBeiLaShen_l6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l7" value="'+data.list[i].change[j].sheBeiLaShen_l7+'"/></td>';
						$str+='<td align="center">/td>';
					    $str+='</tr>';
					    $("#sheBei_laShen").before($str);
				}
			}
		}

		if(data.list[i].name == "sheBeiChongJi"){//
			$("input[name='sheBeiChongJi_a1'][value='" + data.list[i].sheBeiChongJi_a1 +"']").attr("checked",true); 
			$("input[name='sheBeiChongJi_a2'][value='" + data.list[i].sheBeiChongJi_a2 +"']").attr("checked",true);
			$("input[name='sheBeiChongJi_a3'][value='" + data.list[i].sheBeiChongJi_a3 +"']").attr("checked",true); 
			$("input[name='sheBeiChongJi_a4'][value='" + data.list[i].sheBeiChongJi_a4 +"']").attr("checked",true);
			$("input[name='sheBeiChongJi_b1']").val(data.list[i].sheBeiChongJi_b1);
			$("input[name='sheBeiChongJi_b2']").val(data.list[i].sheBeiChongJi_b2);
			$("input[name='sheBeiChongJi_c1']").val(data.list[i].sheBeiChongJi_c1);
			$("input[name='sheBeiChongJi_c2']").val(data.list[i].sheBeiChongJi_c2);
			$("input[name='sheBeiChongJi_c3']").val(data.list[i].sheBeiChongJi_c3);
			$("input[name='sheBeiChongJi_c4']").val(data.list[i].sheBeiChongJi_c4);
			$("input[name='sheBeiChongJi_d1']").val(data.list[i].sheBeiChongJi_d1);
			$("input[name='sheBeiChongJi_d2']").val(data.list[i].sheBeiChongJi_d2);
			$("input[name='sheBeiChongJi_d3']").val(data.list[i].sheBeiChongJi_d3);
			$("input[name='sheBeiChongJi_d4']").val(data.list[i].sheBeiChongJi_d4);
			$("input[name='sheBeiChongJi_e1']").val(data.list[i].sheBeiChongJi_e1);
			$("input[name='sheBeiChongJi_e2']").val(data.list[i].sheBeiChongJi_e2);
			$("input[name='sheBeiChongJi_e3']").val(data.list[i].sheBeiChongJi_e3);
			$("input[name='sheBeiChongJi_e4']").val(data.list[i].sheBeiChongJi_e4);
			$("input[name='sheBeiChongJi_f1']").val(data.list[i].sheBeiChongJi_f1);
			$("input[name='sheBeiChongJi_f2']").val(data.list[i].sheBeiChongJi_f2);
			$("input[name='sheBeiChongJi_f3']").val(data.list[i].sheBeiChongJi_f3);
			$("input[name='sheBeiChongJi_f4']").val(data.list[i].sheBeiChongJi_f4);
			$("input[name='sheBeiChongJi_g1']").val(data.list[i].sheBeiChongJi_g1);
			$("input[name='sheBeiChongJi_g2']").val(data.list[i].sheBeiChongJi_g2);
			$("input[name='sheBeiChongJi_g3']").val(data.list[i].sheBeiChongJi_g3);
			$("input[name='sheBeiChongJi_g4']").val(data.list[i].sheBeiChongJi_g4);
			$("input[name='sheBeiChongJi_h1']").val(data.list[i].sheBeiChongJi_h1);
		}

		if(data.list[i].name == "sheBeiWanQu"){//
			$("input[name='sheBeiWanQu_a1'][value='" + data.list[i].sheBeiWanQu_a1 + "']").attr("checked",true); 
			$("input[name='sheBeiWanQu_a2'][value='" + data.list[i].sheBeiWanQu_a2 + "']").attr("checked",true);
			$("input[name='sheBeiWanQu_a3'][value='" + data.list[i].sheBeiWanQu_a3 + "']").attr("checked",true); 
			$("input[name='sheBeiWanQu_a4'][value='" + data.list[i].sheBeiWanQu_a4 + "']").attr("checked",true);
			$("input[name='sheBeiWanQu_b1']").val(data.list[i].sheBeiWanQu_b1);
			$("input[name='sheBeiWanQu_b2']").val(data.list[i].sheBeiWanQu_b2);
			$("input[name='sheBeiWanQu_c1']").val(data.list[i].sheBeiWanQu_c1);
			$("input[name='sheBeiWanQu_c2']").val(data.list[i].sheBeiWanQu_c2);
			$("input[name='sheBeiWanQu_c3']").val(data.list[i].sheBeiWanQu_c3);
			$("input[name='sheBeiWanQu_c4']").val(data.list[i].sheBeiWanQu_c4);
			$("input[name='sheBeiWanQu_d1']").val(data.list[i].sheBeiWanQu_d1);
			$("input[name='sheBeiWanQu_d2']").val(data.list[i].sheBeiWanQu_d2);
			$("input[name='sheBeiWanQu_d3']").val(data.list[i].sheBeiWanQu_d3);
			$("input[name='sheBeiWanQu_d4']").val(data.list[i].sheBeiWanQu_d4);
			$("input[name='sheBeiWanQu_e1']").val(data.list[i].sheBeiWanQu_e1);
			$("input[name='sheBeiWanQu_e2']").val(data.list[i].sheBeiWanQu_e2);
			$("input[name='sheBeiWanQu_e3']").val(data.list[i].sheBeiWanQu_e3);
			$("input[name='sheBeiWanQu_e4']").val(data.list[i].sheBeiWanQu_e4);
			$("input[name='sheBeiWanQu_f1']").val(data.list[i].sheBeiWanQu_f1);
			$("input[name='sheBeiWanQu_f2']").val(data.list[i].sheBeiWanQu_f2);
			$("input[name='sheBeiWanQu_f3']").val(data.list[i].sheBeiWanQu_f3);
			$("input[name='sheBeiWanQu_f4']").val(data.list[i].sheBeiWanQu_f4);
			$("input[name='sheBeiWanQu_g1']").val(data.list[i].sheBeiWanQu_g1);
		}

		if(data.list[i].name == "sheBeiJinXiang"){//
			$("input[name='sheBeiJinXiang_a1'][value='" + data.list[i].sheBeiJinXiang_a1 + "']").attr("checked",true); 
			$("input[name='sheBeiJinXiang_a2'][value='" + data.list[i].sheBeiJinXiang_a2 + "']").attr("checked",true);
			$("input[name='sheBeiJinXiang_a3'][value='" + data.list[i].sheBeiJinXiang_a3 + "']").attr("checked",true); 
			$("input[name='sheBeiJinXiang_a4'][value='" + data.list[i].sheBeiJinXiang_a4 + "']").attr("checked",true);
			$("input[name='sheBeiJinXiang_b1']").val(data.list[i].sheBeiJinXiang_b1);
			$("input[name='sheBeiJinXiang_b2']").val(data.list[i].sheBeiJinXiang_b2);
			$("input[name='sheBeiJinXiang_b3']").val(data.list[i].sheBeiJinXiang_b3);
			$("input[name='sheBeiJinXiang_b4']").val(data.list[i].sheBeiJinXiang_b4);
			$("input[name='sheBeiJinXiang_c1']").val(data.list[i].sheBeiJinXiang_c1);
			$("input[name='sheBeiJinXiang_c2']").val(data.list[i].sheBeiJinXiang_c2);
			$("input[name='sheBeiJinXiang_c3']").val(data.list[i].sheBeiJinXiang_c3);
			$("input[name='sheBeiJinXiang_c4']").val(data.list[i].sheBeiJinXiang_c4);
			$("input[name='sheBeiJinXiang_d1']").val(data.list[i].sheBeiJinXiang_d1);
			$("input[name='sheBeiJinXiang_d2']").val(data.list[i].sheBeiJinXiang_d2);
			$("input[name='sheBeiJinXiang_d3']").val(data.list[i].sheBeiJinXiang_d3);
			$("input[name='sheBeiJinXiang_d4']").val(data.list[i].sheBeiJinXiang_d4);
			$("input[name='sheBeiJinXiang_e1']").val(data.list[i].sheBeiJinXiang_e1);
			$("input[name='sheBeiJinXiang_e2']").val(data.list[i].sheBeiJinXiang_e2);
			$("input[name='sheBeiJinXiang_e3']").val(data.list[i].sheBeiJinXiang_e3);
			$("input[name='sheBeiJinXiang_e4']").val(data.list[i].sheBeiJinXiang_e4);
			$("input[name='sheBeiJinXiang_f1']").val(data.list[i].sheBeiJinXiang_f1);
		}

		if(data.list[i].name == "deliveryQiTa"){//其他
			$("input[name='deliveryQiTa_a1']").val(data.list[i].deliveryQiTa_a1);
			$("input[name='deliveryQiTa_a2']").val(data.list[i].deliveryQiTa_a2);
			$("input[name='deliveryQiTa_b1']").val(data.list[i].deliveryQiTa_b1);
			$("input[name='deliveryQiTa_b2']").val(data.list[i].deliveryQiTa_b2);
			$("input[name='deliveryQiTa_b3']").val(data.list[i].deliveryQiTa_b3);
			$("input[name='deliveryQiTa_c1']").val(data.list[i].deliveryQiTa_c1);
			$("input[name='deliveryQiTa_c2']").val(data.list[i].deliveryQiTa_c2);
			$("input[name='deliveryQiTa_c3']").val(data.list[i].deliveryQiTa_c3);
			$("input[name='deliveryQiTa_c4']").val(data.list[i].deliveryQiTa_c4);
			$("input[name='deliveryQiTa_d1']").val(data.list[i].deliveryQiTa_d1);
			$("input[name='deliveryQiTa_f1']").val(data.list[i].deliveryQiTa_f1);
			$("input[name='deliveryQiTa_l1']").val(data.list[i].change[0].deliveryQiTa_l1);
			$("input[name='deliveryQiTa_l2']").val(data.list[i].change[0].deliveryQiTa_l2);
			$("input[name='deliveryQiTa_l3']").val(data.list[i].change[0].deliveryQiTa_l3);
			$("input[name='deliveryQiTa_l4']").val(data.list[i].change[0].deliveryQiTa_l4);
			$("input[name='deliveryQiTa_l5']").val(data.list[i].change[0].deliveryQiTa_l5);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa_l1" value="'+data.list[i].change[j].deliveryQiTa_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa_l2" value="'+data.list[i].change[j].deliveryQiTa_l2+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa_l3" value="'+data.list[i].change[j].deliveryQiTa_l3+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa_l4" value="'+data.list[i].change[j].deliveryQiTa_l4+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa_l5" value="'+data.list[i].change[j].deliveryQiTa_l5+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#deliveryQiTa").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryReZha"){	//输送管  热轧
			$("input[name='deliveryReZha_b1']").val(data.list[i].deliveryReZha_b1);
			$("input[name='deliveryReZha_a1'][value='"+data.list[i].deliveryReZha_a1+"']").attr("checked",true); 
			$("input[name='deliveryReZha_a2'][value='"+data.list[i].deliveryReZha_a2+"']").attr("checked",true);
			$("input[name='deliveryReZha_l1']").val(data.list[i].change[0].deliveryReZha_l1);
			$("input[name='deliveryReZha_l2']").val(data.list[i].change[0].deliveryReZha_l2);
			$("input[name='deliveryReZha_l3']").val(data.list[i].change[0].deliveryReZha_l3);
			$("select[name='deliveryReZha_l4']").val(data.list[i].change[0].deliveryReZha_l4);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReZha_l1" value="'+data.list[i].change[j].deliveryReZha_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReZha_l2" value="'+data.list[i].change[j].deliveryReZha_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReZha_l3" value="'+data.list[i].change[j].deliveryReZha_l3+'"/></td>';
					if (data.list[i].change[j].deliveryReZha_l4 == "符合") {
						$str+='<td align="center"><select name="deliveryReZha_l4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryReZha_l4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center" ></td>';
			    $str+='</tr>';
			    $("#delivery_reZha").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryReChuLi"){	//输送管 热处理
			$("input[name='deliveryReChuLi_a1'][value='"+data.list[i].deliveryReChuLi_a1+"']").attr("checked",true); 
			$("input[name='deliveryReChuLi_a2'][value='"+data.list[i].deliveryReChuLi_a2+"']").attr("checked",true);
			$("input[name='deliveryReChuLi_l1']").val(data.list[i].change[0].deliveryReChuLi_l1);
			$("input[name='deliveryReChuLi_l2']").val(data.list[i].change[0].deliveryReChuLi_l2);
			$("input[name='deliveryReChuLi_l3']").val(data.list[i].change[0].deliveryReChuLi_l3);
			$("input[name='deliveryReChuLi_l4']").val(data.list[i].change[0].deliveryReChuLi_l4);
			$("input[name='deliveryReChuLi_l5']").val(data.list[i].change[0].deliveryReChuLi_l5);
			$("input[name='deliveryReChuLi_l6']").val(data.list[i].change[0].deliveryReChuLi_l6);
			$("input[name='deliveryReChuLi_l7']").val(data.list[i].change[0].deliveryReChuLi_l7);
			$("input[name='deliveryReChuLi_b1']").val(data.list[i].deliveryReChuLi_b1);
			$("input[name='deliveryReChuLi_b2']").val(data.list[i].deliveryReChuLi_b2);
			$("input[name='deliveryReChuLi_b3']").val(data.list[i].deliveryReChuLi_b3);
			$("input[name='deliveryReChuLi_b4']").val(data.list[i].deliveryReChuLi_b4);
			$("input[name='deliveryReChuLi_c1']").val(data.list[i].deliveryReChuLi_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l1" value="'+data.list[i].change[j].deliveryReChuLi_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l2" value="'+data.list[i].change[j].deliveryReChuLi_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l3" value="'+data.list[i].change[j].deliveryReChuLi_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l4" value="'+data.list[i].change[j].deliveryReChuLi_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l5" value="'+data.list[i].change[j].deliveryReChuLi_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l6" value="'+data.list[i].change[j].deliveryReChuLi_l6+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l7" value="'+data.list[i].change[j].deliveryReChuLi_l7+'"/></td>';
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#delivery_reChuLi").before($str);
				}
			}
		}
		if(data.list[i].name == "deliveryWuFengChaoShengBo"){	//输送管  无缝钢管 超声波检测
			$("input[name='deliveryWuFengChaoShengBo_b1']").val(data.list[i].deliveryWuFengChaoShengBo_b1);
			$("input[name='deliveryWuFengChaoShengBo_a1'][value='"+data.list[i].deliveryWuFengChaoShengBo_a1+"']").attr("checked",true); 
			$("input[name='deliveryWuFengChaoShengBo_a2'][value='"+data.list[i].deliveryWuFengChaoShengBo_a2+"']").attr("checked",true);
			$("input[name='deliveryWuFengChaoShengBo_a3'][value='"+data.list[i].deliveryWuFengChaoShengBo_a3+"']").attr("checked",true); 
			$("input[name='deliveryWuFengChaoShengBo_a4'][value='"+data.list[i].deliveryWuFengChaoShengBo_a4+"']").attr("checked",true);
			$("input[name='deliveryWuFengChaoShengBo_a5'][value='"+data.list[i].deliveryWuFengChaoShengBo_a5+"']").attr("checked",true);
			$("input[name='deliveryWuFengChaoShengBo_l1']").val(data.list[i].change[0].deliveryWuFengChaoShengBo_l1);
			$("input[name='deliveryWuFengChaoShengBo_l2']").val(data.list[i].change[0].deliveryWuFengChaoShengBo_l2);
			$("input[name='deliveryWuFengChaoShengBo_l3']").val(data.list[i].change[0].deliveryWuFengChaoShengBo_l3);
			$("input[name='deliveryWuFengChaoShengBo_l4']").val(data.list[i].change[0].deliveryWuFengChaoShengBo_l4);
			$("input[name='deliveryWuFengChaoShengBo_l5']").val(data.list[i].change[0].deliveryWuFengChaoShengBo_l5);
			$("input[name='deliveryWuFengChaoShengBo_ll1']").val(data.list[i].change2[0].deliveryWuFengChaoShengBo_ll1);
			$("input[name='deliveryWuFengChaoShengBo_ll2']").val(data.list[i].change2[0].deliveryWuFengChaoShengBo_ll2);
			$("input[name='deliveryWuFengChaoShengBo_ll3']").val(data.list[i].change2[0].deliveryWuFengChaoShengBo_ll3);
			$("input[name='deliveryWuFengChaoShengBo_ll4']").val(data.list[i].change2[0].deliveryWuFengChaoShengBo_ll4);
			$("input[name='deliveryWuFengChaoShengBo_ll5']").val(data.list[i].change2[0].deliveryWuFengChaoShengBo_ll5);
			$("select[name='deliveryWuFengChaoShengBo_ll6']").val(data.list[i].change2[0].deliveryWuFengChaoShengBo_ll6);
			$("input[name='deliveryWuFengChaoShengBo_ll7']").val(data.list[i].change2[0].deliveryWuFengChaoShengBo_ll7);
			$("select[name='deliveryWuFengChaoShengBo_ll8']").val(data.list[i].change2[0].deliveryWuFengChaoShengBo_ll8);

			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_l1" value="'+data.list[i].change[j].deliveryWuFengChaoShengBo_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_l2" value="'+data.list[i].change[j].deliveryWuFengChaoShengBo_l2+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_l3" value="'+data.list[i].change[j].deliveryWuFengChaoShengBo_l3+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_l4" value="'+data.list[i].change[j].deliveryWuFengChaoShengBo_l4+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_l5" value="'+data.list[i].change[j].deliveryWuFengChaoShengBo_l5+'"/></td>';
					$str+='<td align="center" ><a</td>';
		    	$str+='</tr>';
		    	$("#delivery_wuFengChaoShengBo1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll1" value="'+data.list[i].change2[j].deliveryWuFengChaoShengBo_ll1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll2" value="'+data.list[i].change2[j].deliveryWuFengChaoShengBo_ll2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll3" value="'+data.list[i].change2[j].deliveryWuFengChaoShengBo_ll3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll4" value="'+data.list[i].change2[j].deliveryWuFengChaoShengBo_ll4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll5" value="'+data.list[i].change2[j].deliveryWuFengChaoShengBo_ll5+'"/></td>';
					if (data.list[i].change2[j].deliveryWuFengChaoShengBo_ll6 == "符合") {
						$str+='<td align="center"><select name="deliveryWuFengChaoShengBo_ll6"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryWuFengChaoShengBo_ll6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll7" value="'+data.list[i].change2[j].deliveryWuFengChaoShengBo_ll7+'"/></td>';
					if (data.list[i].change2[j].deliveryWuFengChaoShengBo_ll8 == "符合") {
						$str+='<td align="center"><select name="deliveryWuFengChaoShengBo_ll8"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryWuFengChaoShengBo_ll8"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"></td>';
		    	$str+='</tr>';
		    	$("#delivery_wuFengChaoShengBo2").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryWuFengCiFen"){			//输送管  无缝钢管 磁粉检测
			$("input[name='deliveryWuFengCiFen_b1']").val(data.list[i].deliveryWuFengCiFen_b1);
			$("input[name='deliveryWuFengCiFen_a1'][value='"+data.list[i].deliveryWuFengCiFen_a1+"']").attr("checked",true); 
			$("input[name='deliveryWuFengCiFen_a2'][value='"+data.list[i].deliveryWuFengCiFen_a2+"']").attr("checked",true);
			$("input[name='deliveryWuFengCiFen_a3'][value='"+data.list[i].deliveryWuFengCiFen_a3+"']").attr("checked",true); 
			$("input[name='deliveryWuFengCiFen_a4'][value='"+data.list[i].deliveryWuFengCiFen_a4+"']").attr("checked",true);
			$("input[name='deliveryWuFengCiFen_a5'][value='"+data.list[i].deliveryWuFengCiFen_a5+"']").attr("checked",true);
			$("input[name='deliveryWuFengCiFen_l1']").val(data.list[i].change[0].deliveryWuFengCiFen_l1);
			$("input[name='deliveryWuFengCiFen_l2']").val(data.list[i].change[0].deliveryWuFengCiFen_l2);
			$("input[name='deliveryWuFengCiFen_l3']").val(data.list[i].change[0].deliveryWuFengCiFen_l3);
			$("input[name='deliveryWuFengCiFen_l4']").val(data.list[i].change[0].deliveryWuFengCiFen_l4);
			$("input[name='deliveryWuFengCiFen_l5']").val(data.list[i].change[0].deliveryWuFengCiFen_l5);
			$("input[name='deliveryWuFengCiFen_ll1']").val(data.list[i].change2[0].deliveryWuFengCiFen_ll1);
			$("input[name='deliveryWuFengCiFen_ll2']").val(data.list[i].change2[0].deliveryWuFengCiFen_ll2);
			$("input[name='deliveryWuFengCiFen_ll3']").val(data.list[i].change2[0].deliveryWuFengCiFen_ll3);
			$("input[name='deliveryWuFengCiFen_ll4']").val(data.list[i].change2[0].deliveryWuFengCiFen_ll4);
			$("input[name='deliveryWuFengCiFen_ll5']").val(data.list[i].change2[0].deliveryWuFengCiFen_ll5);
			$("select[name='deliveryWuFengCiFen_ll6']").val(data.list[i].change2[0].deliveryWuFengCiFen_ll6);
			$("input[name='deliveryWuFengCiFen_ll7']").val(data.list[i].change2[0].deliveryWuFengCiFen_ll7);
			$("select[name='deliveryWuFengCiFen_ll8']").val(data.list[i].change2[0].deliveryWuFengCiFen_ll8);

			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_l1" value="'+data.list[i].change[j].deliveryWuFengCiFen_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_l2" value="'+data.list[i].change[j].deliveryWuFengCiFen_l2+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_l3" value="'+data.list[i].change[j].deliveryWuFengCiFen_l3+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_l4" value="'+data.list[i].change[j].deliveryWuFengCiFen_l4+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_l5" value="'+data.list[i].change[j].deliveryWuFengCiFen_l5+'"/></td>';
					$str+='<td align="center" ></td>';
			    $str+='</tr>';
			    $("#delivery_wuFengCiFen1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll1" value="'+data.list[i].change2[j].deliveryWuFengCiFen_ll1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll2" value="'+data.list[i].change2[j].deliveryWuFengCiFen_ll2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll3" value="'+data.list[i].change2[j].deliveryWuFengCiFen_ll3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll4" value="'+data.list[i].change2[j].deliveryWuFengCiFen_ll4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll5" value="'+data.list[i].change2[j].deliveryWuFengCiFen_ll5+'"/></td>';
					if (data.list[i].change2[j].deliveryWuFengCiFen_ll6 == "符合") {
						$str+='<td align="center"><select name="deliveryWuFengCiFen_ll6"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryWuFengCiFen_ll6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll7" value="'+data.list[i].change2[j].deliveryWuFengCiFen_ll7+'"/></td>';
					if (data.list[i].change2[j].deliveryWuFengCiFen_ll8 == "符合") {
						$str+='<td align="center"><select name="deliveryWuFengCiFen_ll8"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryWuFengCiFen_ll8"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#delivery_wuFengCiFen2").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryWoLiu"){//输送管  无缝钢管 涡流检测
			$("input[name='deliveryWoLiu_b1']").val(data.list[i].deliveryWoLiu_b1);
			$("input[name='deliveryWoLiu_a1'][value='"+data.list[i].deliveryWoLiu_a1+"']").attr("checked",true); 
			$("input[name='deliveryWoLiu_a2'][value='"+data.list[i].deliveryWoLiu_a2+"']").attr("checked",true);
			$("input[name='deliveryWoLiu_a3'][value='"+data.list[i].deliveryWoLiu_a3+"']").attr("checked",true); 
			$("input[name='deliveryWoLiu_a4'][value='"+data.list[i].deliveryWoLiu_a4+"']").attr("checked",true);
			$("input[name='deliveryWoLiu_a5'][value='"+data.list[i].deliveryWoLiu_a5+"']").attr("checked",true);
			$("input[name='deliveryWoLiu_l1']").val(data.list[i].change[0].deliveryWoLiu_l1);
			$("input[name='deliveryWoLiu_l2']").val(data.list[i].change[0].deliveryWoLiu_l2);
			$("input[name='deliveryWoLiu_l3']").val(data.list[i].change[0].deliveryWoLiu_l3);
			$("input[name='deliveryWoLiu_l4']").val(data.list[i].change[0].deliveryWoLiu_l4);
			$("input[name='deliveryWoLiu_l5']").val(data.list[i].change[0].deliveryWoLiu_l5);
			$("input[name='deliveryWoLiu_ll1']").val(data.list[i].change2[0].deliveryWoLiu_ll1);
			$("input[name='deliveryWoLiu_ll2']").val(data.list[i].change2[0].deliveryWoLiu_ll2);
			$("input[name='deliveryWoLiu_ll3']").val(data.list[i].change2[0].deliveryWoLiu_ll3);
			$("input[name='deliveryWoLiu_ll4']").val(data.list[i].change2[0].deliveryWoLiu_ll4);
			$("input[name='deliveryWoLiu_ll5']").val(data.list[i].change2[0].deliveryWoLiu_ll5);
			$("select[name='deliveryWoLiu_ll6']").val(data.list[i].change2[0].deliveryWoLiu_ll6);
			$("input[name='deliveryWoLiu_ll7']").val(data.list[i].change2[0].deliveryWoLiu_ll7);
			$("select[name='deliveryWoLiu_ll8']").val(data.list[i].change2[0].deliveryWoLiu_ll8);

			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_l1" value="'+data.list[i].change[j].deliveryWoLiu_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_l2" value="'+data.list[i].change[j].deliveryWoLiu_l2+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_l3" value="'+data.list[i].change[j].deliveryWoLiu_l3+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_l4" value="'+data.list[i].change[j].deliveryWoLiu_l4+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_l5" value="'+data.list[i].change[j].deliveryWoLiu_l5+'"/></td>';
					$str+='<td align="center" ></td>';
			    $str+='</tr>';
			    $("#delivery_woLiu1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll1" value="'+data.list[i].change2[j].deliveryWoLiu_ll1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll2" value="'+data.list[i].change2[j].deliveryWoLiu_ll2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll3" value="'+data.list[i].change2[j].deliveryWoLiu_ll3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll4" value="'+data.list[i].change2[j].deliveryWoLiu_ll4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll5" value="'+data.list[i].change2[j].deliveryWoLiu_ll5+'"/></td>';
					if (data.list[i].change2[j].deliveryWoLiu_ll6 == "符合") {
						$str+='<td align="center"><select name="deliveryWoLiu_ll6"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryWoLiu_ll6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll7" value="'+data.list[i].change2[j].deliveryWoLiu_ll7+'"/></td>';
					if (data.list[i].change2[j].deliveryWoLiu_ll8 == "符合") {
						$str+='<td align="center"><select name="deliveryWoLiu_ll8"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryWoLiu_ll8"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#delivery_woLiu2").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryLouCi"){	//输送管  无缝钢管 漏磁检测
			$("input[name='deliveryLouCi_b1']").val(data.list[i].deliveryLouCi_b1);
			$("input[name='deliveryLouCi_a1'][value='"+data.list[i].deliveryLouCi_a1+"']").attr("checked",true); 
			$("input[name='deliveryLouCi_a2'][value='"+data.list[i].deliveryLouCi_a2+"']").attr("checked",true);
			$("input[name='deliveryLouCi_a3'][value='"+data.list[i].deliveryLouCi_a3+"']").attr("checked",true); 
			$("input[name='deliveryLouCi_a4'][value='"+data.list[i].deliveryLouCi_a4+"']").attr("checked",true);
			$("input[name='deliveryLouCi_a5'][value='"+data.list[i].deliveryLouCi_a5+"']").attr("checked",true);
			$("input[name='deliveryLouCi_l1']").val(data.list[i].change[0].deliveryLouCi_l1);
			$("input[name='deliveryLouCi_l2']").val(data.list[i].change[0].deliveryLouCi_l2);
			$("input[name='deliveryLouCi_l3']").val(data.list[i].change[0].deliveryLouCi_l3);
			$("input[name='deliveryLouCi_l4']").val(data.list[i].change[0].deliveryLouCi_l4);
			$("input[name='deliveryLouCi_l5']").val(data.list[i].change[0].deliveryLouCi_l5);
			$("input[name='deliveryLouCi_ll1']").val(data.list[i].change2[0].deliveryLouCi_ll1);
			$("input[name='deliveryLouCi_ll2']").val(data.list[i].change2[0].deliveryLouCi_ll2);
			$("input[name='deliveryLouCi_ll3']").val(data.list[i].change2[0].deliveryLouCi_ll3);
			$("input[name='deliveryLouCi_ll4']").val(data.list[i].change2[0].deliveryLouCi_ll4);
			$("input[name='deliveryLouCi_ll5']").val(data.list[i].change2[0].deliveryLouCi_ll5);
			$("select[name='deliveryLouCi_ll6']").val(data.list[i].change2[0].deliveryLouCi_ll6);
			$("input[name='deliveryLouCi_ll7']").val(data.list[i].change2[0].deliveryLouCi_ll7);
			$("select[name='deliveryLouCi_ll8']").val(data.list[i].change2[0].deliveryLouCi_ll8);

			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_l1" value="'+data.list[i].change[j].deliveryLouCi_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_l2" value="'+data.list[i].change[j].deliveryLouCi_l2+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_l3" value="'+data.list[i].change[j].deliveryLouCi_l3+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_l4" value="'+data.list[i].change[j].deliveryLouCi_l4+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_l5" value="'+data.list[i].change[j].deliveryLouCi_l5+'"/></td>';
					$str+='<td align="center" ></td>';
			    $str+='</tr>';
			    $("#delivery_louCi1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll1" value="'+data.list[i].change2[j].deliveryLouCi_ll1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll2" value="'+data.list[i].change2[j].deliveryLouCi_ll2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll3" value="'+data.list[i].change2[j].deliveryLouCi_ll3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll4" value="'+data.list[i].change2[j].deliveryLouCi_ll4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll5" value="'+data.list[i].change2[j].deliveryLouCi_ll5+'"/></td>';
					if (data.list[i].change2[j].deliveryLouCi_ll6 == "符合") {
						$str+='<td align="center"><select name="deliveryLouCi_ll6"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryLouCi_ll6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll7" value="'+data.list[i].change2[j].deliveryLouCi_ll7+'"/></td>';
					if(data.list[i].change2[j].deliveryLouCi_ll8 == "符合"){
						$str+='<td align="center"><select name="deliveryLouCi_ll8"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryLouCi_ll8"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#delivery_louCi2").before($str);
				}
			}
		}


		if(data.list[i].name == "deliveryShuiYa"){	//输送管  无缝钢管 漏磁检测
			$("input[name='deliveryShuiYa_b1']").val(data.list[i].deliveryShuiYa_b1);
			$("input[name='deliveryShuiYa_a1'][value='"+data.list[i].deliveryShuiYa_a1+"']").attr("checked",true); 
			$("input[name='deliveryShuiYa_a2'][value='"+data.list[i].deliveryShuiYa_a2+"']").attr("checked",true);
			$("input[name='deliveryShuiYa_a3'][value='"+data.list[i].deliveryShuiYa_a3+"']").attr("checked",true); 
			$("input[name='deliveryShuiYa_a4'][value='"+data.list[i].deliveryShuiYa_a4+"']").attr("checked",true);
			$("input[name='deliveryShuiYa_l1']").val(data.list[i].change[0].deliveryShuiYa_l1);
			$("input[name='deliveryShuiYa_l2']").val(data.list[i].change[0].deliveryShuiYa_l2);
			$("input[name='deliveryShuiYa_l3']").val(data.list[i].change[0].deliveryShuiYa_l3);
			$("input[name='deliveryShuiYa_l4']").val(data.list[i].change[0].deliveryShuiYa_l4);
			$("input[name='deliveryShuiYa_l5']").val(data.list[i].change[0].deliveryShuiYa_l5);
			$("input[name='deliveryShuiYa_l6']").val(data.list[i].change[0].deliveryShuiYa_l6);
			$("input[name='deliveryShuiYa_l7']").val(data.list[i].change[0].deliveryShuiYa_l7);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l1" value="'+data.list[i].change[j].deliveryShuiYa_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l2" value="'+data.list[i].change[j].deliveryShuiYa_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l3" value="'+data.list[i].change[j].deliveryShuiYa_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l4" value="'+data.list[i].change[j].deliveryShuiYa_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l5" value="'+data.list[i].change[j].deliveryShuiYa_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l6" value="'+data.list[i].change[j].deliveryShuiYa_l6+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l7" value="'+data.list[i].change[j].deliveryShuiYa_l7+'"/></td>';
					$str+='<td align="center" ></td>';
			    $str+='</tr>';
			    $("#delivery_shuiYa").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryFaYun"){	//输送管 
			$("input[name='deliveryFaYun_a1']").val(data.list[i].deliveryFaYun_a1);
			$("input[name='deliveryFaYun_a2']").val(data.list[i].deliveryFaYun_a2);
			$("input[name='deliveryFaYun_a3']").val(data.list[i].deliveryFaYun_a3);
			$("input[name='deliveryFaYun_a4']").val(data.list[i].deliveryFaYun_a4);
			$("input[name='deliveryFaYun_a5'][value='"+data.list[i].deliveryFaYun_a5+"']").attr("checked",true); 
			$("input[name='deliveryFaYun_a6'][value='"+data.list[i].deliveryFaYun_a6+"']").attr("checked",true);
			$("input[name='deliveryFaYun_a7'][value='"+data.list[i].deliveryFaYun_a7+"']").attr("checked",true); 
			$("input[name='deliveryFaYun_a8']").val(data.list[i].deliveryFaYun_a8);
		}

		if(data.list[i].name == "deliveryHuaXue"){	//输送管 
			
			$("input[name='deliveryHuaXue_a1'][value='"+data.list[i].deliveryHuaXue_a1+"']").attr("checked",true); 
			$("input[name='deliveryHuaXue_a2'][value='"+data.list[i].deliveryHuaXue_a2+"']").attr("checked",true);
			$("input[name='deliveryHuaXue_b1']").val(data.list[i].deliveryHuaXue_b1);
			$("input[name='deliveryHuaXue_b2']").val(data.list[i].deliveryHuaXue_b2);
			$("input[name='deliveryHuaXue_b3']").val(data.list[i].deliveryHuaXue_b3);
			$("input[name='deliveryHuaXue_b4']").val(data.list[i].deliveryHuaXue_b4);
			$("input[name='deliveryHuaXue_c1']").val(data.list[i].deliveryHuaXue_c1);
			$("input[name='deliveryHuaXue_c2']").val(data.list[i].deliveryHuaXue_c2);
			$("input[name='deliveryHuaXue_c3']").val(data.list[i].deliveryHuaXue_c3);
			$("input[name='deliveryHuaXue_c4']").val(data.list[i].deliveryHuaXue_c4);
			$("input[name='deliveryHuaXue_d1']").val(data.list[i].deliveryHuaXue_d1);
		}
		if(data.list[i].name == "deliveryLaShen"){
			$("input[name='deliveryLaShen_b1']").val(data.list[i].deliveryLaShen_b1);
			$("input[name='deliveryLaShen_a1'][value='"+data.list[i].deliveryLaShen_a1+"']").attr("checked",true); 
			$("input[name='deliveryLaShen_a2'][value='"+data.list[i].deliveryLaShen_a2+"']").attr("checked",true);
			$("input[name='deliveryLaShen_a3'][value='"+data.list[i].deliveryLaShen_a3+"']").attr("checked",true); 
			$("input[name='deliveryLaShen_a4'][value='"+data.list[i].deliveryLaShen_a4+"']").attr("checked",true);
			$("input[name='deliveryLaShen_a5'][value='"+data.list[i].deliveryLaShen_a5+"']").attr("checked",true);
			$("input[name='deliveryLaShen_a6'][value='"+data.list[i].deliveryLaShen_a6+"']").attr("checked",true);
			$("input[name='deliveryLaShen_a7'][value='"+data.list[i].deliveryLaShen_a7+"']").attr("checked",true);
			$("input[name='deliveryLaShen_l1']").val(data.list[i].change[0].deliveryLaShen_l1);
			$("input[name='deliveryLaShen_l2']").val(data.list[i].change[0].deliveryLaShen_l2);
			$("input[name='deliveryLaShen_l3']").val(data.list[i].change[0].deliveryLaShen_l3);
			$("input[name='deliveryLaShen_l4']").val(data.list[i].change[0].deliveryLaShen_l4);
			$("input[name='deliveryLaShen_l5']").val(data.list[i].change[0].deliveryLaShen_l5);
			$("input[name='deliveryLaShen_l6']").val(data.list[i].change[0].deliveryLaShen_l6);
			$("input[name='deliveryLaShen_l7']").val(data.list[i].change[0].deliveryLaShen_l7);

			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l1" value="'+data.list[i].change[j].deliveryLaShen_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l2" value="'+data.list[i].change[j].deliveryLaShen_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l3" value="'+data.list[i].change[j].deliveryLaShen_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l4" value="'+data.list[i].change[j].deliveryLaShen_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l5" value="'+data.list[i].change[j].deliveryLaShen_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l6" value="'+data.list[i].change[j].deliveryLaShen_l6+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l7" value="'+data.list[i].change[j].deliveryLaShen_l7+'"/></td>';
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#delivery_laShen").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryChongJi"){
			$("input[name='deliveryChongJi_b1']").val(data.list[i].deliveryChongJi_b1);
			$("input[name='deliveryChongJi_b2']").val(data.list[i].deliveryChongJi_b2);
			$("input[name='deliveryChongJi_a1'][value='"+data.list[i].deliveryChongJi_a1+"']").attr("checked",true); 
			$("input[name='deliveryChongJi_a2'][value='"+data.list[i].deliveryChongJi_a2+"']").attr("checked",true);
			$("input[name='deliveryChongJi_a3'][value='"+data.list[i].deliveryChongJi_a3+"']").attr("checked",true); 
			$("input[name='deliveryChongJi_h1']").val(data.list[i].deliveryChongJi_h1);
			
			$("input[name='deliveryChongJi_l1']").val(data.list[i].change[0].deliveryChongJi_l1);
			$("input[name='deliveryChongJi_l2']").val(data.list[i].change[0].deliveryChongJi_l2);
			$("input[name='deliveryChongJi_l3']").val(data.list[i].change[0].deliveryChongJi_l3);
			$("input[name='deliveryChongJi_l4']").val(data.list[i].change[0].deliveryChongJi_l4);
			$("input[name='deliveryChongJi_l5']").val(data.list[i].change[0].deliveryChongJi_l5);
			$("input[name='deliveryChongJi_l6']").val(data.list[i].change[0].deliveryChongJi_l6);
			$("input[name='deliveryChongJi_l7']").val(data.list[i].change[0].deliveryChongJi_l7);

			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l1" value="'+data.list[i].change[j].deliveryChongJi_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l2" value="'+data.list[i].change[j].deliveryChongJi_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l3" value="'+data.list[i].change[j].deliveryChongJi_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l4" value="'+data.list[i].change[j].deliveryChongJi_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l5" value="'+data.list[i].change[j].deliveryChongJi_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l6" value="'+data.list[i].change[j].deliveryChongJi_l6+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l7" value="'+data.list[i].change[j].deliveryChongJi_l7+'"/></td>';
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#delivery_ChongJi").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryJinXiang"){	//输送管  无缝钢管 金相硬度
			$("input[name='deliveryJinXiang_b1']").val(data.list[i].deliveryJinXiang_b1);
			$("input[name='deliveryJinXiang_a1'][value='"+data.list[i].deliveryJinXiang_a1+"']").attr("checked",true); 
			$("input[name='deliveryJinXiang_a2'][value='"+data.list[i].deliveryJinXiang_a2+"']").attr("checked",true);
			$("input[name='deliveryJinXiang_a3'][value='"+data.list[i].deliveryJinXiang_a3+"']").attr("checked",true); 
			$("input[name='deliveryJinXiang_a4'][value='"+data.list[i].deliveryJinXiang_a4+"']").attr("checked",true);
			$("input[name='deliveryJinXiang_l1']").val(data.list[i].change[0].deliveryJinXiang_l1);
			$("input[name='deliveryJinXiang_l2']").val(data.list[i].change[0].deliveryJinXiang_l2);
			$("input[name='deliveryJinXiang_l3']").val(data.list[i].change[0].deliveryJinXiang_l3);
			$("input[name='deliveryJinXiang_l4']").val(data.list[i].change[0].deliveryJinXiang_l4);
			$("input[name='deliveryJinXiang_l5']").val(data.list[i].change[0].deliveryJinXiang_l5);
			$("input[name='deliveryJinXiang_l6']").val(data.list[i].change[0].deliveryJinXiang_l6);
			$("input[name='deliveryJinXiang_l7']").val(data.list[i].change[0].deliveryJinXiang_l7);

			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l1" value="'+data.list[i].change[j].deliveryJinXiang_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l2" value="'+data.list[i].change[j].deliveryJinXiang_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l3" value="'+data.list[i].change[j].deliveryJinXiang_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l4" value="'+data.list[i].change[j].deliveryJinXiang_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l5" value="'+data.list[i].change[j].deliveryJinXiang_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l6" value="'+data.list[i].change[j].deliveryJinXiang_l6+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l7" value="'+data.list[i].change[j].deliveryJinXiang_l7+'"/></td>';
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#delivery_jinXiang").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryYaBian"){	
			$("input[name='deliveryYaBian_a1'][value='"+data.list[i].deliveryYaBian_a1+"']").attr("checked",true); 
			$("input[name='deliveryYaBian_a2'][value='"+data.list[i].deliveryYaBian_a2+"']").attr("checked",true);
			$("input[name='deliveryYaBian_a3'][value='"+data.list[i].deliveryYaBian_a3+"']").attr("checked",true); 
			$("input[name='deliveryYaBian_a4'][value='"+data.list[i].deliveryYaBian_a4+"']").attr("checked",true);
			$("input[name='deliveryYaBian_b1']").val(data.list[i].deliveryYaBian_b1);
			$("input[name='deliveryYaBian_b2']").val(data.list[i].deliveryYaBian_b2);
			$("input[name='deliveryYaBian_b3']").val(data.list[i].deliveryYaBian_b3);
			$("input[name='deliveryYaBian_b4']").val(data.list[i].deliveryYaBian_b4);
			$("input[name='deliveryYaBian_b5']").val(data.list[i].deliveryYaBian_b5);
			$("input[name='deliveryYaBian_b6']").val(data.list[i].deliveryYaBian_b6);
			$("input[name='deliveryYaBian_b7']").val(data.list[i].deliveryYaBian_b7);
			$("input[name='deliveryYaBian_b8']").val(data.list[i].deliveryYaBian_b8);
		}

		if(data.list[i].name == "deliveryQiTa2"){//其他
			$("input[name='deliveryQiTa2_a1']").val(data.list[i].deliveryQiTa2_a1);
			$("input[name='deliveryQiTa2_a2']").val(data.list[i].deliveryQiTa2_a2);
			$("input[name='deliveryQiTa2_b1']").val(data.list[i].deliveryQiTa2_b1);
			$("input[name='deliveryQiTa2_b2']").val(data.list[i].deliveryQiTa2_b2);
			$("input[name='deliveryQiTa2_b3']").val(data.list[i].deliveryQiTa2_b3);
			$("input[name='deliveryQiTa2_c1']").val(data.list[i].deliveryQiTa2_c1);
			$("input[name='deliveryQiTa2_c2']").val(data.list[i].deliveryQiTa2_c2);
			$("input[name='deliveryQiTa2_c3']").val(data.list[i].deliveryQiTa2_c3);
			$("input[name='deliveryQiTa2_c4']").val(data.list[i].deliveryQiTa2_c4);
			$("input[name='deliveryQiTa2_d1']").val(data.list[i].deliveryQiTa2_d1);
			$("input[name='deliveryQiTa2_f1']").val(data.list[i].deliveryQiTa2_f1);
			$("input[name='deliveryQiTa2_l1']").val(data.list[i].change[0].deliveryQiTa2_l1);
			$("input[name='deliveryQiTa2_l2']").val(data.list[i].change[0].deliveryQiTa2_l2);
			$("input[name='deliveryQiTa2_l3']").val(data.list[i].change[0].deliveryQiTa2_l3);
			$("input[name='deliveryQiTa2_l4']").val(data.list[i].change[0].deliveryQiTa2_l4);
			$("input[name='deliveryQiTa2_l5']").val(data.list[i].change[0].deliveryQiTa2_l5);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa2_l1" value="'+data.list[i].change[j].deliveryQiTa2_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa2_l2" value="'+data.list[i].change[j].deliveryQiTa2_l2+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa2_l3" value="'+data.list[i].change[j].deliveryQiTa2_l3+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa2_l4" value="'+data.list[i].change[j].deliveryQiTa2_l4+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa2_l5" value="'+data.list[i].change[j].deliveryQiTa2_l5+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#deliveryQiTa2").before($str);
				}
			}
		}

		//输送管 投料
		if(data.list[i].name == "deliveryTouLiao"){
			$("input[name='deliveryTouLiao_a1']").val(data.list[i].deliveryTouLiao_a1);
			$("input[name='deliveryTouLiao_l1']").val(data.list[i].change[0].deliveryTouLiao_l1);
			$("input[name='deliveryTouLiao_l2']").val(data.list[i].change[0].deliveryTouLiao_l2);
			$("input[name='deliveryTouLiao_l3']").val(data.list[i].change[0].deliveryTouLiao_l3);
			$("input[name='deliveryTouLiao_l4']").val(data.list[i].change[0].deliveryTouLiao_l4);
			$("input[name='deliveryTouLiao_l5']").val(data.list[i].change[0].deliveryTouLiao_l5);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryTouLiao_l1" value="'+data.list[i].change[j].deliveryTouLiao_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryTouLiao_l2" value="'+data.list[i].change[j].deliveryTouLiao_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryTouLiao_l3" value="'+data.list[i].change[j].deliveryTouLiao_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryTouLiao_l4" value="'+data.list[i].change[j].deliveryTouLiao_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryTouLiao_l5" value="'+data.list[i].change[j].deliveryTouLiao_l5+'"/></td>';
					$str+='<td align="center"><a </td>';
			    $str+='</tr>';
			    $("#delivery_touLiao").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryChengXing"){	//输送管 成型焊接
			$("input[name='deliveryChengXing_c1']").val(data.list[i].deliveryChengXing_c1);
			$("input[name='deliveryChengXing_a1'][value='"+data.list[i].deliveryChengXing_a1+"']").attr("checked",true); 
			$("input[name='deliveryChengXing_a2'][value='"+data.list[i].deliveryChengXing_a2+"']").attr("checked",true);
			$("input[name='deliveryChengXing_a3'][value='"+data.list[i].deliveryChengXing_a3+"']").attr("checked",true); 
			$("input[name='deliveryChengXing_a4'][value='"+data.list[i].deliveryChengXing_a4+"']").attr("checked",true);
			$("input[name='deliveryChengXing_l1']").val(data.list[i].change[0].deliveryChengXing_l1);
			$("input[name='deliveryChengXing_l2']").val(data.list[i].change[0].deliveryChengXing_l2);
			$("input[name='deliveryChengXing_l3']").val(data.list[i].change[0].deliveryChengXing_l3);
			$("input[name='deliveryChengXing_l4']").val(data.list[i].change[0].deliveryChengXing_l4);
			$("input[name='deliveryChengXing_l5']").val(data.list[i].change[0].deliveryChengXing_l5);
			$("input[name='deliveryChengXing_l6']").val(data.list[i].change[0].deliveryChengXing_l6);
			$("input[name='deliveryChengXing_b1']").val(data.list[i].deliveryChengXing_l1);
			$("input[name='deliveryChengXing_b2']").val(data.list[i].deliveryChengXing_b2);
			$("input[name='deliveryChengXing_b3']").val(data.list[i].deliveryChengXing_b3);
			$("input[name='deliveryChengXing_b4']").val(data.list[i].deliveryChengXing_b4);
			//$("input[name='deliveryChengXing_b5']").val(data.list[i].deliveryChengXing_b5);
			$("input[name='deliveryChengXing_b5'][value='"+data.list[i].deliveryChengXing_b5+"']").attr("checked",true);
			$("input[name='deliveryChengXing_b6']").val(data.list[i].deliveryChengXing_b6);
			$("input[name='deliveryChengXing_b7']").val(data.list[i].deliveryChengXing_b7);
			$("input[name='deliveryChengXing_b8']").val(data.list[i].deliveryChengXing_b8);

			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l1" value="'+data.list[i].change[j].deliveryChengXing_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l2" value="'+data.list[i].change[j].deliveryChengXing_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l3" value="'+data.list[i].change[j].deliveryChengXing_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l4" value="'+data.list[i].change[j].deliveryChengXing_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l5" value="'+data.list[i].change[j].deliveryChengXing_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l6" value="'+data.list[i].change[j].deliveryChengXing_l6+'"/></td>';
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#delivery_chengXing").before($str);
				}
			}
		}
		if(data.list[i].name == "deliverySheXian"){	//输送管  射线检测
			$("input[name='deliverySheXian_b1']").val(data.list[i].deliverySheXian_b1);
			$("input[name='deliverySheXian_a1'][value='"+data.list[i].deliverySheXian_a1+"']").attr("checked",true); 
			$("input[name='deliverySheXian_a2'][value='"+data.list[i].deliverySheXian_a2+"']").attr("checked",true);
			$("input[name='deliverySheXian_a3'][value='"+data.list[i].deliverySheXian_a3+"']").attr("checked",true); 
			$("input[name='deliverySheXian_a4'][value='"+data.list[i].deliverySheXian_a4+"']").attr("checked",true);
			$("input[name='deliverySheXian_a5'][value='"+data.list[i].deliverySheXian_a5+"']").attr("checked",true);
			$("input[name='deliverySheXian_l1']").val(data.list[i].change[0].deliverySheXian_l1);
			$("input[name='deliverySheXian_l2']").val(data.list[i].change[0].deliverySheXian_l2);
			$("input[name='deliverySheXian_l3']").val(data.list[i].change[0].deliverySheXian_l3);
			$("input[name='deliverySheXian_l4']").val(data.list[i].change[0].deliverySheXian_l4);
			$("input[name='deliverySheXian_l5']").val(data.list[i].change[0].deliverySheXian_l5);
			$("input[name='deliverySheXian_l6']").val(data.list[i].change[0].deliverySheXian_l6);
			$("input[name='deliverySheXian_ll1']").val(data.list[i].change2[0].deliverySheXian_ll1);
			$("input[name='deliverySheXian_ll2']").val(data.list[i].change2[0].deliverySheXian_ll2);
			$("select[name='deliverySheXian_ll3']").val(data.list[i].change2[0].deliverySheXian_ll3);
			$("input[name='deliverySheXian_ll4']").val(data.list[i].change2[0].deliverySheXian_ll4);
			$("select[name='deliverySheXian_ll5']").val(data.list[i].change2[0].deliverySheXian_ll5);
			$("input[name='deliverySheXian_ll6']").val(data.list[i].change2[0].deliverySheXian_ll6);

			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l1" value="'+data.list[i].change[j].deliverySheXian_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l2" value="'+data.list[i].change[j].deliverySheXian_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l3" value="'+data.list[i].change[j].deliverySheXian_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l4" value="'+data.list[i].change[j].deliverySheXian_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l5" value="'+data.list[i].change[j].deliverySheXian_l5+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l6" value="'+data.list[i].change[j].deliverySheXian_l6+'"/></td>';
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#delivery_sheXian1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
		    	$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_ll1" value="'+data.list[i].change2[j].deliverySheXian_ll1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_ll2" value="'+data.list[i].change2[j].deliverySheXian_ll2+'"/></td>';
					if (data.list[i].change2[j].deliverySheXian_ll3 == "符合") {
							$str+='<td align="center"><select name="deliverySheXian_ll3"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
								$str+='<td align="center"><select name="deliverySheXian_ll3"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
				
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_ll4" value="'+data.list[i].change2[j].deliverySheXian_ll4+'"/></td>';
					if (data.list[i].change2[j].deliverySheXian_ll5 == "符合") {
						$str+='<td align="center"><select name="deliverySheXian_ll5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliverySheXian_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_ll6" value="'+data.list[i].change2[j].deliverySheXian_ll6+'"/></td>';
					$str+='<td align="center"></td>';
				  $str+='</tr>';
		    	$("#delivery_sheXian2").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryChaoShengBo"){	//输送管  超声波检测（连探、手探）
			$("input[name='deliveryChaoShengBo_b1']").val(data.list[i].deliveryChaoShengBo_b1);
			$("input[name='deliveryChaoShengBo_a1'][value='"+data.list[i].deliveryChaoShengBo_a1+"']").attr("checked",true); 
			$("input[name='deliveryChaoShengBo_a2'][value='"+data.list[i].deliveryChaoShengBo_a2+"']").attr("checked",true);
			$("input[name='deliveryChaoShengBo_a3'][value='"+data.list[i].deliveryChaoShengBo_a3+"']").attr("checked",true); 
			$("input[name='deliveryChaoShengBo_a4'][value='"+data.list[i].deliveryChaoShengBo_a4+"']").attr("checked",true);
			$("input[name='deliveryChaoShengBo_a5'][value='"+data.list[i].deliveryChaoShengBo_a5+"']").attr("checked",true);
			$("input[name='deliveryChaoShengBo_l1']").val(data.list[i].change[0].deliveryChaoShengBo_l1);
			$("select[name='deliveryChaoShengBo_l2']").val(data.list[i].change[0].deliveryChaoShengBo_l2);
			$("input[name='deliveryChaoShengBo_l3']").val(data.list[i].change[0].deliveryChaoShengBo_l3);
			$("input[name='deliveryChaoShengBo_l4']").val(data.list[i].change[0].deliveryChaoShengBo_l4);
			$("input[name='deliveryChaoShengBo_l5']").val(data.list[i].change[0].deliveryChaoShengBo_l5);
			$("input[name='deliveryChaoShengBo_l6']").val(data.list[i].change[0].deliveryChaoShengBo_l6);
			$("input[name='deliveryChaoShengBo_ll1']").val(data.list[i].change2[0].deliveryChaoShengBo_ll1);
			$("input[name='deliveryChaoShengBo_ll2']").val(data.list[i].change2[0].deliveryChaoShengBo_ll2);
			$("select[name='deliveryChaoShengBo_ll3']").val(data.list[i].change2[0].deliveryChaoShengBo_ll3);
			$("select[name='deliveryChaoShengBo_ll4']").val(data.list[i].change2[0].deliveryChaoShengBo_ll4);
			$("input[name='deliveryChaoShengBo_ll5']").val(data.list[i].change2[0].deliveryChaoShengBo_ll5);
			$("select[name='deliveryChaoShengBo_ll6']").val(data.list[i].change2[0].deliveryChaoShengBo_ll6);
			$("input[name='deliveryChaoShengBo_ll7']").val(data.list[i].change2[0].deliveryChaoShengBo_ll7);

			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_l1" value="'+data.list[i].change[j].deliveryChaoShengBo_l1+'"/></td>';
					if (data.list[i].change[j].deliveryChaoShengBo_l2 == "连探") {
						$str+='<td align="center"><select name="deliveryChaoShengBo_l2"><option value="连探" selected>连探</option><option value="手探">手探</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryChaoShengBo_l2"><option value="连探">连探</option><option value="手探" selected>手探</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_l3" value="'+data.list[i].change[j].deliveryChaoShengBo_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_l4" value="'+data.list[i].change[j].deliveryChaoShengBo_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_l5" value="'+data.list[i].change[j].deliveryChaoShengBo_l5+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_l6" value="'+data.list[i].change[j].deliveryChaoShengBo_l6+'"/></td>';
					$str+='<td align="center" ></td>';
			    $str+='</tr>';
			    $("#delivery_chaoShengBo1").before($str);
				}
			}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_ll1" value="'+data.list[i].change2[j].deliveryChaoShengBo_ll1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_ll2" value="'+data.list[i].change2[j].deliveryChaoShengBo_ll2+'"/></td>';
					if (data.list[i].change2[j].deliveryChaoShengBo_ll3 == "符合") {
						$str+='<td align="center"><select name="deliveryChaoShengBo_ll3"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryChaoShengBo_ll3"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					if (data.list[i].change2[j].deliveryChaoShengBo_ll4 == "符合") {
						$str+='<td align="center"><select name="deliveryChaoShengBo_ll4"><option value="符合"selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryChaoShengBo_ll4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_ll5" value="'+data.list[i].change2[j].deliveryChaoShengBo_ll5+'"/></td>';
					if (data.list[i].change2[j].deliveryChaoShengBo_ll6 == "符合") {
						$str+='<td align="center"><select name="deliveryChaoShengBo_ll6"><option value="符合"selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryChaoShengBo_ll6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_ll7" value="'+data.list[i].change2[j].deliveryChaoShengBo_ll7+'"/></td>';
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#delivery_chaoShengBo2").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryCiFen"){// 管件  磁粉检测
			$("input[name='deliveryCiFen_a1'][value='"+data.list[i].deliveryCiFen_a1+"']").attr("checked",true); 
			$("input[name='deliveryCiFen_a2'][value='"+data.list[i].deliveryCiFen_a2+"']").attr("checked",true);
			$("input[name='deliveryCiFen_a3'][value='"+data.list[i].deliveryCiFen_a3+"']").attr("checked",true);
			$("input[name='deliveryCiFen_a4'][value='"+data.list[i].deliveryCiFen_a4+"']").attr("checked",true);
			$("input[name='deliveryCiFen_a5'][value='"+data.list[i].deliveryCiFen_a5+"']").attr("checked",true);
			$("input[name='deliveryCiFen_l1']").val(data.list[i].change[0].deliveryCiFen_l1);
			$("input[name='deliveryCiFen_l2']").val(data.list[i].change[0].deliveryCiFen_l2);
			$("input[name='deliveryCiFen_l3']").val(data.list[i].change[0].deliveryCiFen_l3);
			$("input[name='deliveryCiFen_l4']").val(data.list[i].change[0].deliveryCiFen_l4);
			$("input[name='deliveryCiFen_l5']").val(data.list[i].change[0].deliveryCiFen_l5);
			$("input[name='deliveryCiFen_ll1']").val(data.list[i].change2[0].deliveryCiFen_ll1);
			$("input[name='deliveryCiFen_ll2']").val(data.list[i].change2[0].deliveryCiFen_ll2);
			$("input[name='deliveryCiFen_ll3']").val(data.list[i].change2[0].deliveryCiFen_ll3);
			$("input[name='deliveryCiFen_ll4']").val(data.list[i].change2[0].deliveryCiFen_ll4);
			$("select[name='deliveryCiFen_ll5']").val(data.list[i].change2[0].deliveryCiFen_ll5);
			$("input[name='deliveryCiFen_ll6']").val(data.list[i].change2[0].deliveryCiFen_ll6);
			$("input[name='deliveryCiFen_ll7']").val(data.list[i].change2[0].deliveryCiFen_ll7);
			$("input[name='deliveryCiFen_b1']").val(data.list[i].deliveryCiFen_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					  $str='';
				        $str+='<tr>';
				        $str+='<td align="center" ><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_l1" value="'+data.list[i].change[j].deliveryCiFen_l1+'"/></td>';
				        $str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_l2" value="'+data.list[i].change[j].deliveryCiFen_l2+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_l3" value="'+data.list[i].change[j].deliveryCiFen_l3+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="deliveryCiFen_l4" value="'+data.list[i].change[j].deliveryCiFen_l4+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="deliveryCiFen_l5" value="'+data.list[i].change[j].deliveryCiFen_l5+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#delivery_ciFen1").before($str);
				}
				}
			if(data.list[i].change2[0].length>1){
				for(var j=1;j<data.list[i].change2[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll1" value="'+data.list[i].change2[j].deliveryCiFen_ll1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll2" value="'+data.list[i].change2[j].deliveryCiFen_ll2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll3" value="'+data.list[i].change2[j].deliveryCiFen_ll3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll4" value="'+data.list[i].change2[j].deliveryCiFen_ll4+'"/></td>';
					if(data.list[i].change2[j].deliveryCiFen_ll5 == "符合"){
						$str+='<td align="center"><select name="deliveryCiFen_ll5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="deliveryCiFen_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll6" value="'+data.list[i].change2[j].deliveryCiFen_ll6+'"/></td>';
					$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll7" value="'+data.list[i].change2[j].deliveryCiFen_ll7+'"/></td>';
					$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#delivery_ciFen2").before($str);
				}
			}
		}


		if(data.list[i].name == "deliveryShuiYaShiYan2"){// 管件  水压试验 
			$("input[name='deliveryShuiYaShiYan2_a1'][value='"+data.list[i].deliveryShuiYaShiYan2_a1+"']").attr("checked",true); 
			$("input[name='deliveryShuiYaShiYan2_a2'][value='"+data.list[i].deliveryShuiYaShiYan2_a2+"']").attr("checked",true);
			$("input[name='deliveryShuiYaShiYan2_a3']").val(data.list[i].deliveryShuiYaShiYan2_a3);
			$("input[name='deliveryShuiYaShiYan2_a4'][value='"+data.list[i].deliveryShuiYaShiYan2_a4+"']").attr("checked",true);
			$("input[name='deliveryShuiYaShiYan2_l1']").val(data.list[i].change[0].deliveryShuiYaShiYan2_l1);
			$("input[name='deliveryShuiYaShiYan2_l2']").val(data.list[i].change[0].deliveryShuiYaShiYan2_l2);
			$("input[name='deliveryShuiYaShiYan2_l3']").val(data.list[i].change[0].deliveryShuiYaShiYan2_l3);
			$("input[name='deliveryShuiYaShiYan2_l4']").val(data.list[i].change[0].deliveryShuiYaShiYan2_l4);
			$("input[name='deliveryShuiYaShiYan2_l5']").val(data.list[i].change[0].deliveryShuiYaShiYan2_l5);
			
			$("input[name='deliveryShuiYaShiYan2_b1']").val(data.list[i].deliveryShuiYaShiYan2_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYaShiYan2_l1" value="'+data.list[i].change[j].deliveryShuiYaShiYan2_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYaShiYan2_l2" value="'+data.list[i].change[j].deliveryShuiYaShiYan2_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYaShiYan2_l3" value="'+data.list[i].change[j].deliveryShuiYaShiYan2_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYaShiYan2_l4" value="'+data.list[i].change[j].deliveryShuiYaShiYan2_l4+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYaShiYan2_l5" value="'+data.list[i].change[j].deliveryShuiYaShiYan2_l5+'"/></td>';
					$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#delivery2_shuiYaShiYan").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryGuangGuan"){	//输送管 
			$("input[name='deliveryGuangGuan_a1']").val(data.list[i].deliveryGuangGuan_a1);
			$("input[name='deliveryGuangGuan_a2']").val(data.list[i].deliveryGuangGuan_a2);
			$("input[name='deliveryGuangGuan_a3']").val(data.list[i].deliveryGuangGuan_a3);
			$("input[name='deliveryGuangGuan_a4']").val(data.list[i].deliveryGuangGuan_a4);
			$("input[name='deliveryGuangGuan_a5'][value='"+data.list[i].deliveryGuangGuan_a5+"']").attr("checked",true); 
			$("input[name='deliveryGuangGuan_a6'][value='"+data.list[i].deliveryGuangGuan_a6+"']").attr("checked",true);
			$("input[name='deliveryGuangGuan_a7'][value='"+data.list[i].deliveryGuangGuan_a7+"']").attr("checked",true); 
			$("input[name='deliveryGuangGuan_a8']").val(data.list[i].deliveryGuangGuan_a8);
			$("input[name='deliveryGuangGuan_b1']").val(data.list[i].deliveryGuangGuan_b1);

		}

		if(data.list[i].name == "deliveryHuaXue1"){//弯管 
			$("input[name='deliveryHuaXue1_a1'][value='"+data.list[i].deliveryHuaXue1_a1+"']").attr("checked",true); 
			$("input[name='deliveryHuaXue1_a2'][value='"+data.list[i].deliveryHuaXue1_a2+"']").attr("checked",true);
			$("input[name='deliveryHuaXue1_b1']").val(data.list[i].deliveryHuaXue1_b1);
			$("input[name='deliveryHuaXue1_b2']").val(data.list[i].deliveryHuaXue1_b2);
			$("input[name='deliveryHuaXue1_b3']").val(data.list[i].deliveryHuaXue1_b3);
			$("input[name='deliveryHuaXue1_b4']").val(data.list[i].deliveryHuaXue1_b4);
			$("input[name='deliveryHuaXue1_b5']").val(data.list[i].deliveryHuaXue1_b5);
			$("input[name='deliveryHuaXue1_b6']").val(data.list[i].deliveryHuaXue1_b6);
			$("input[name='deliveryHuaXue1_b7']").val(data.list[i].deliveryHuaXue1_b7);
			$("input[name='deliveryHuaXue1_b8']").val(data.list[i].deliveryHuaXue1_b8);
			$("input[name='deliveryHuaXue1_b9']").val(data.list[i].deliveryHuaXue1_b9);
		}

		if(data.list[i].name == "deliveryLaShenXingNeng"){//阀门 拉伸性能
			$("input[name='deliveryLaShenXingNeng_a1'][value='"+data.list[i].deliveryLaShenXingNeng_a1+"']").attr("checked",true); 
			$("input[name='deliveryLaShenXingNeng_a2'][value='"+data.list[i].deliveryLaShenXingNeng_a2+"']").attr("checked",true);
			$("input[name='deliveryLaShenXingNeng_a3'][value='"+data.list[i].deliveryLaShenXingNeng_a3+"']").attr("checked",true); 
			$("input[name='deliveryLaShenXingNeng_a4'][value='"+data.list[i].deliveryLaShenXingNeng_a4+"']").attr("checked",true);
			$("input[name='deliveryLaShenXingNeng_l1']").val(data.list[i].change[0].deliveryLaShenXingNeng_l1);
			$("input[name='deliveryLaShenXingNeng_l2']").val(data.list[i].change[0].deliveryLaShenXingNeng_l2);
			$("input[name='deliveryLaShenXingNeng_l3']").val(data.list[i].change[0].deliveryLaShenXingNeng_l3);
			$("input[name='deliveryLaShenXingNeng_l4']").val(data.list[i].change[0].deliveryLaShenXingNeng_l4);
			$("input[name='deliveryLaShenXingNeng_l5']").val(data.list[i].change[0].deliveryLaShenXingNeng_l5);
			$("input[name='deliveryLaShenXingNeng_l6']").val(data.list[i].change[0].deliveryLaShenXingNeng_l6);
			$("input[name='deliveryLaShenXingNeng_b1']").val(data.list[i].deliveryLaShenXingNeng_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l1" value="'+data.list[i].change[j].deliveryLaShenXingNeng_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l2" value="'+data.list[i].change[j].deliveryLaShenXingNeng_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l3" value="'+data.list[i].change[j].deliveryLaShenXingNeng_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l4" value="'+data.list[i].change[j].deliveryLaShenXingNeng_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l5" value="'+data.list[i].change[j].deliveryLaShenXingNeng_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l6" value="'+data.list[i].change[j].deliveryLaShenXingNeng_l6+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#deliveryLaShenXingNeng").before($str);
				}
			}
		}

		if(data.list[i].name == "deliveryChongJi1"){//
			$("input[name='deliveryChongJi1_a1'][value='"+data.list[i].deliveryChongJi1_a1+"']").attr("checked",true); 
			$("input[name='deliveryChongJi1_a2'][value='"+data.list[i].deliveryChongJi1_a2+"']").attr("checked",true);
			$("input[name='deliveryChongJi1_a3'][value='"+data.list[i].deliveryChongJi1_a3+"']").attr("checked",true); 
			$("input[name='deliveryChongJi1_a4'][value='"+data.list[i].deliveryChongJi1_a4+"']").attr("checked",true);
			$("input[name='deliveryChongJi1_b1']").val(data.list[i].deliveryChongJi1_b1);
			$("input[name='deliveryChongJi1_b2']").val(data.list[i].deliveryChongJi1_b2);
			$("input[name='deliveryChongJi1_c1']").val(data.list[i].deliveryChongJi1_c1);
			$("input[name='deliveryChongJi1_c2']").val(data.list[i].deliveryChongJi1_c2);
			$("input[name='deliveryChongJi1_c3']").val(data.list[i].deliveryChongJi1_c3);
			$("input[name='deliveryChongJi1_c4']").val(data.list[i].deliveryChongJi1_c4);
			$("input[name='deliveryChongJi1_d1']").val(data.list[i].deliveryChongJi1_d1);
			$("input[name='deliveryChongJi1_d2']").val(data.list[i].deliveryChongJi1_d2);
			$("input[name='deliveryChongJi1_d3']").val(data.list[i].deliveryChongJi1_d3);
			$("input[name='deliveryChongJi1_d4']").val(data.list[i].deliveryChongJi1_d4);
			$("input[name='deliveryChongJi1_e1']").val(data.list[i].deliveryChongJi1_e1);
			$("input[name='deliveryChongJi1_e2']").val(data.list[i].deliveryChongJi1_e2);
			$("input[name='deliveryChongJi1_e3']").val(data.list[i].deliveryChongJi1_e3);
			$("input[name='deliveryChongJi1_e4']").val(data.list[i].deliveryChongJi1_e4);
			$("input[name='deliveryChongJi1_f1']").val(data.list[i].deliveryChongJi1_f1);
			$("input[name='deliveryChongJi1_f2']").val(data.list[i].deliveryChongJi1_f2);
			$("input[name='deliveryChongJi1_f3']").val(data.list[i].deliveryChongJi1_f3);
			$("input[name='deliveryChongJi1_f4']").val(data.list[i].deliveryChongJi1_f4);
			$("select[name='deliveryChongJi1_g1']").val(data.list[i].deliveryChongJi1_g1);
			$("select[name='deliveryChongJi1_g2']").val(data.list[i].deliveryChongJi1_g2);
			$("select[name='deliveryChongJi1_g3']").val(data.list[i].deliveryChongJi1_g3);
			$("select[name='deliveryChongJi1_g4']").val(data.list[i].deliveryChongJi1_g4);
			$("input[name='deliveryChongJi1_h1']").val(data.list[i].deliveryChongJi1_h1);
		}

		if(data.list[i].name == "deliveryWanQu"){//
			$("input[name='deliveryWanQu_a1'][value='"+data.list[i].deliveryWanQu_a1+"']").attr("checked",true); 
			$("input[name='deliveryWanQu_a2'][value='"+data.list[i].deliveryWanQu_a2+"']").attr("checked",true);
			$("input[name='deliveryWanQu_a3'][value='"+data.list[i].deliveryWanQu_a3+"']").attr("checked",true); 
			$("input[name='deliveryWanQu_a4'][value='"+data.list[i].deliveryWanQu_a4+"']").attr("checked",true);
			$("input[name='deliveryWanQu_b1']").val(data.list[i].deliveryWanQu_b1);
			$("input[name='deliveryWanQu_b2']").val(data.list[i].deliveryWanQu_b2);
			$("input[name='deliveryWanQu_c1']").val(data.list[i].deliveryWanQu_c1);
			$("input[name='deliveryWanQu_c2']").val(data.list[i].deliveryWanQu_c2);
			$("input[name='deliveryWanQu_c3']").val(data.list[i].deliveryWanQu_c3);
			$("input[name='deliveryWanQu_c4']").val(data.list[i].deliveryWanQu_c4);
			$("input[name='deliveryWanQu_e1']").val(data.list[i].deliveryWanQu_e1);
			$("input[name='deliveryWanQu_e2']").val(data.list[i].deliveryWanQu_e2);
			$("input[name='deliveryWanQu_e3']").val(data.list[i].deliveryWanQu_e3);
			$("input[name='deliveryWanQu_e4']").val(data.list[i].deliveryWanQu_e4);
			$("input[name='deliveryWanQu_f1']").val(data.list[i].deliveryWanQu_f1);
			$("input[name='deliveryWanQu_f2']").val(data.list[i].deliveryWanQu_f2);
			$("input[name='deliveryWanQu_f3']").val(data.list[i].deliveryWanQu_f3);
			$("input[name='deliveryWanQu_f4']").val(data.list[i].deliveryWanQu_f4);
			$("input[name='deliveryWanQu_g1']").val(data.list[i].deliveryWanQu_g1);
		}

		if(data.list[i].name == "deliveryLuochui"){//弯管 
			$("input[name='deliveryLuochui_a1'][value='"+data.list[i].deliveryLuochui_a1+"']").attr("checked",true); 
			$("input[name='deliveryLuochui_a2'][value='"+data.list[i].deliveryLuochui_a2+"']").attr("checked",true);
			$("input[name='deliveryLuochui_a3'][value='"+data.list[i].deliveryLuochui_a3+"']").attr("checked",true); 
			$("input[name='deliveryLuochui_a4'][value='"+data.list[i].deliveryLuochui_a4+"']").attr("checked",true);
			$("input[name='deliveryLuochui_a5']").val(data.list[i].deliveryLuochui_a5);
			$("input[name='deliveryLuochui_b1']").val(data.list[i].deliveryLuochui_b1);
			$("input[name='deliveryLuochui_b2']").val(data.list[i].deliveryLuochui_b2);
			$("input[name='deliveryLuochui_b3']").val(data.list[i].deliveryLuochui_b3);
			$("input[name='deliveryLuochui_b4']").val(data.list[i].deliveryLuochui_b4);
			$("input[name='deliveryLuochui_d1']").val(data.list[i].deliveryLuochui_d1);
			$("input[name='deliveryLuochui_d2']").val(data.list[i].deliveryLuochui_d2);
			$("input[name='deliveryLuochui_d3']").val(data.list[i].deliveryLuochui_d3);
			$("input[name='deliveryLuochui_d4']").val(data.list[i].deliveryLuochui_d4);
			$("input[name='deliveryLuochui_e1']").val(data.list[i].deliveryLuochui_e1);
			$("input[name='deliveryLuochui_e2']").val(data.list[i].deliveryLuochui_e2);
			$("input[name='deliveryLuochui_e3']").val(data.list[i].deliveryLuochui_e3);
			$("input[name='deliveryLuochui_e4']").val(data.list[i].deliveryLuochui_e4);
			$("input[name='deliveryLuochui_f1']").val(data.list[i].deliveryLuochui_f1);
			$("input[name='deliveryLuochui_f2']").val(data.list[i].deliveryLuochui_f2);
			$("input[name='deliveryLuochui_f3']").val(data.list[i].deliveryLuochui_f3);
			$("input[name='deliveryLuochui_f4']").val(data.list[i].deliveryLuochui_f4);
			$("input[name='deliveryLuochui_g1']").val(data.list[i].deliveryLuochui_g1);
		}

		if(data.list[i].name == "deliveryJinXiang1"){//
			$("input[name='deliveryJinXiang1_a1'][value='"+data.list[i].deliveryJinXiang1_a1+"']").attr("checked",true); 
			$("input[name='deliveryJinXiang1_a2'][value='"+data.list[i].deliveryJinXiang1_a2+"']").attr("checked",true);
			$("input[name='deliveryJinXiang1_a3'][value='"+data.list[i].deliveryJinXiang1_a3+"']").attr("checked",true); 
			$("input[name='deliveryJinXiang1_a4'][value='"+data.list[i].deliveryJinXiang1_a4+"']").attr("checked",true);
			$("input[name='deliveryJinXiang1_b1']").val(data.list[i].deliveryJinXiang1_b1);
			$("input[name='deliveryJinXiang1_b2']").val(data.list[i].deliveryJinXiang1_b2);
			$("input[name='deliveryJinXiang1_b3']").val(data.list[i].deliveryJinXiang1_b3);
			$("input[name='deliveryJinXiang1_b4']").val(data.list[i].deliveryJinXiang1_b4);
			$("input[name='deliveryJinXiang1_d1']").val(data.list[i].deliveryJinXiang1_d1);
			$("input[name='deliveryJinXiang1_d2']").val(data.list[i].deliveryJinXiang1_d2);
			$("input[name='deliveryJinXiang1_d3']").val(data.list[i].deliveryJinXiang1_d3);
			$("input[name='deliveryJinXiang1_d4']").val(data.list[i].deliveryJinXiang1_d4);
			$("input[name='deliveryJinXiang1_e1']").val(data.list[i].deliveryJinXiang1_e1);
			$("input[name='deliveryJinXiang1_e2']").val(data.list[i].deliveryJinXiang1_e2);
			$("input[name='deliveryJinXiang1_e3']").val(data.list[i].deliveryJinXiang1_e3);
			$("input[name='deliveryJinXiang1_e4']").val(data.list[i].deliveryJinXiang1_e4);
			$("input[name='deliveryJinXiang1_f1']").val(data.list[i].deliveryJinXiang1_f1);
		}

		if(data.list[i].name == "drillQiTa"){//其他
			$("input[name='drillQiTa_a1']").val(data.list[i].drillQiTa_a1);
			$("input[name='drillQiTa_a2']").val(data.list[i].drillQiTa_a2);
			$("input[name='drillQiTa_b1']").val(data.list[i].drillQiTa_b1);
			$("input[name='drillQiTa_b2']").val(data.list[i].drillQiTa_b2);
			$("input[name='drillQiTa_b3']").val(data.list[i].drillQiTa_b3);
			$("input[name='drillQiTa_c1']").val(data.list[i].drillQiTa_c1);
			$("input[name='drillQiTa_c2']").val(data.list[i].drillQiTa_c2);
			$("input[name='drillQiTa_c3']").val(data.list[i].drillQiTa_c3);
			$("input[name='drillQiTa_c4']").val(data.list[i].drillQiTa_c4);
			$("input[name='drillQiTa_d1']").val(data.list[i].drillQiTa_d1);
			$("input[name='drillQiTa_f1']").val(data.list[i].drillQiTa_f1);
			$("input[name='drillQiTa_l1']").val(data.list[i].change[0].drillQiTa_l1);
			$("input[name='drillQiTa_l2']").val(data.list[i].change[0].drillQiTa_l2);
			$("input[name='drillQiTa_l3']").val(data.list[i].change[0].drillQiTa_l3);
			$("input[name='drillQiTa_l4']").val(data.list[i].change[0].drillQiTa_l4);
			$("input[name='drillQiTa_l5']").val(data.list[i].change[0].drillQiTa_l5);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="drillQiTa_l1" value="'+data.list[i].change[j].drillQiTa_l1+'"/></td>';
			        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="drillQiTa_l2" value="'+data.list[i].change[j].drillQiTa_l2+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="drillQiTa_l3" value="'+data.list[i].change[j].drillQiTa_l3+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="drillQiTa_l4" value="'+data.list[i].change[j].drillQiTa_l4+'"/></td>';
					$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="drillQiTa_l5" value="'+data.list[i].change[j].drillQiTa_l5+'"/></td>';
				    $str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#drillQiTa").before($str);
				}
			}
		}

		//钻具 管端加厚
				if(data.list[i].name == "drillGuanDuan"){	
					$("input[name='drillGuanDuan_a1']").val(data.list[i].drillGuanDuan_a1);
					$("input[name='drillGuanDuan_l1']").val(data.list[i].change[0].drillGuanDuan_l1);
					$("input[name='drillGuanDuan_l2']").val(data.list[i].change[0].drillGuanDuan_l2);
					$("input[name='drillGuanDuan_l3']").val(data.list[i].change[0].drillGuanDuan_l3);
					$("input[name='drillGuanDuan_l4']").val(data.list[i].change[0].drillGuanDuan_l4);
					$("input[name='drillGuanDuan_l5']").val(data.list[i].change[0].drillGuanDuan_l5);
					$("input[name='drillGuanDuan_l6']").val(data.list[i].change[0].drillGuanDuan_l6);

					if(data.list[i].change[0].length>1){
						for(var j=1;j<data.list[i].change[0].length;j++){
							$str='';
			        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l1" value="'+data.list[i].change[j].drillGuanDuan_l1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l2" value="'+data.list[i].change[j].drillGuanDuan_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l3" value="'+data.list[i].change[j].drillGuanDuan_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l4" value="'+data.list[i].change[j].drillGuanDuan_l4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l5" value="'+data.list[i].change[j].drillGuanDuan_l5+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l6" value="'+data.list[i].change[j].drillGuanDuan_l6+'"/></td>';
							$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#drill_guanDuan").before($str);
						}
					}
				}

				if(data.list[i].name == "drillMoCaHan"){	//钻具 摩擦焊
					$("input[name='drillMoCaHan_a1'][value='"+data.list[i].drillMoCaHan_a1 + "']").attr("checked",true); 
					$("input[name='drillMoCaHan_a2'][value='"+data.list[i].drillMoCaHan_a2 + "']").attr("checked",true);
					$("input[name='drillMoCaHan_a3'][value='"+data.list[i].drillMoCaHan_a3 + "']").attr("checked",true); 

					$("input[name='drillMoCaHan_l1']").val(data.list[i].change[0].drillMoCaHan_l1);
					$("input[name='drillMoCaHan_l2']").val(data.list[i].change[0].drillMoCaHan_l2);
					$("input[name='drillMoCaHan_l3']").val(data.list[i].change[0].drillMoCaHan_l3);
					$("input[name='drillMoCaHan_l4']").val(data.list[i].change[0].drillMoCaHan_l4);
					$("input[name='drillMoCaHan_l5']").val(data.list[i].change[0].drillMoCaHan_l5);
					$("input[name='drillMoCaHan_l6']").val(data.list[i].change[0].drillMoCaHan_l6);
					$("input[name='drillMoCaHan_l7']").val(data.list[i].change[0].drillMoCaHan_l7);
					$("input[name='drillMoCaHan_l8']").val(data.list[i].change[0].drillMoCaHan_l8);

					$("input[name='drillMoCaHan_b1']").val(data.list[i].drillMoCaHan_b1);
					$("input[name='drillMoCaHan_b2'][value='"+data.list[i].drillMoCaHan_b2 + "']").attr("checked",true);
					$("input[name='drillMoCaHan_b3'][value='"+data.list[i].drillMoCaHan_b3 + "']").attr("checked",true);
					$("input[name='drillMoCaHan_b4']").val(data.list[i].drillMoCaHan_b4);

					if(data.list[i].change[0].length>1){
						for(var j=1;j<data.list[i].change[0].length;j++){
							$str='';
			        		$str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l1" value="'+data.list[i].change[j].drillMoCaHan_l1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l2" value="'+data.list[i].change[j].drillMoCaHan_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l3" value="'+data.list[i].change[j].drillMoCaHan_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l4" value="'+data.list[i].change[j].drillMoCaHan_l4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l5" value="'+data.list[i].change[j].drillMoCaHan_l5+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l6" value="'+data.list[i].change[j].drillMoCaHan_l6+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l7" value="'+data.list[i].change[j].drillMoCaHan_l7+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l8" value="'+data.list[i].change[j].drillMoCaHan_l8+'"/></td>';
							$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#drill_moCaHan").before($str);
						}
					}
				}
				if(data.list[i].name == "drillHanQu"){		//钻具 焊区机加工
					$("input[name='drillHanQu_a1'][value='" + data.list[i].drillHanQu_a1 + "']").attr("checked",true); 
					$("input[name='drillHanQu_a2'][value='" + data.list[i].drillHanQu_a2 + "']").attr("checked",true);
					$("input[name='drillHanQu_a3'][value='" + data.list[i].drillHanQu_a3 + "']").attr("checked",true); 
					$("input[name='drillHanQu_l1']").val(data.list[i].change[0].drillHanQu_l1);
					$("input[name='drillHanQu_l2']").val(data.list[i].change[0].drillHanQu_l2);
					$("select[name='drillHanQu_l3']").val(data.list[i].change[0].drillHanQu_l3);
					$("select[name='drillHanQu_l4']").val(data.list[i].change[0].drillHanQu_l4);
					$("input[name='drillHanQu_b1']").val(data.list[i].drillHanQu_b1);
					if(data.list[i].change[0].length>1){
						for(var j=1;j<data.list[i].change[0].length;j++){
							$str='';
			        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillHanQu_l1" value="'+data.list[i].change[j].drillHanQu_l1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillHanQu_l2" value="'+data.list[i].change[j].drillHanQu_l2+'"/></td>';
							if (data.list[i].change[j].drillHanQu_l3 == "符合") {
								$str+='<td align="center"><select name="drillHanQu_l3"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="drillHanQu_l3"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							if (data.list[i].change[j].drillHanQu_l4 == "符合") {
								$str+='<td align="center"><select name="drillHanQu_l4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="drillHanQu_l4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#drill_hanQu").before($str);
						}
					}
				}

				if(data.list[i].name == "drillReChuLi"){//钻具 热处理
							$("input[name='drillReChuLi_a1'][value='" + data.list[i].drillReChuLi_a1 + "']").attr("checked",true); 
							$("input[name='drillReChuLi_a2'][value='" + data.list[i].drillReChuLi_a2 + "']").attr("checked",true);
							$("input[name='drillReChuLi_a3'][value='" + data.list[i].drillReChuLi_a3 + "']").attr("checked",true); 
							$("input[name='drillReChuLi_a4'][value='" + data.list[i].drillReChuLi_a4 + "']").attr("checked",true); 
							$("input[name='drillReChuLi_a5'][value='" + data.list[i].drillReChuLi_a5 + "']").attr("checked",true); 
							$("input[name='drillReChuLi_l1']").val(data.list[i].change[0].drillReChuLi_l1);
							$("input[name='drillReChuLi_l2']").val(data.list[i].change[0].drillReChuLi_l2);
							$("input[name='drillReChuLi_l3']").val(data.list[i].change[0].drillReChuLi_l3);
							$("input[name='drillReChuLi_l4']").val(data.list[i].change[0].drillReChuLi_l4);
							$("input[name='drillReChuLi_l5']").val(data.list[i].change[0].drillReChuLi_l5);
							$("input[name='drillReChuLi_l6']").val(data.list[i].change[0].drillReChuLi_l6);
							$("input[name='drillReChuLi_ll1']").val(data.list[i].change2[0].drillReChuLi_ll1);
							$("input[name='drillReChuLi_ll2']").val(data.list[i].change2[0].drillReChuLi_ll2);
							$("input[name='drillReChuLi_ll3']").val(data.list[i].change2[0].drillReChuLi_ll3);
							$("input[name='drillReChuLi_ll4']").val(data.list[i].change2[0].drillReChuLi_ll4);
							$("input[name='drillReChuLi_ll5']").val(data.list[i].change2[0].drillReChuLi_ll5);
							$("input[name='drillReChuLi_ll6']").val(data.list[i].change2[0].drillReChuLi_ll6);
							$("input[name='drillReChuLi_lll1']").val(data.list[i].change3[0].drillReChuLi_lll1);
							$("input[name='drillReChuLi_lll2']").val(data.list[i].change3[0].drillReChuLi_lll2);
							$("input[name='drillReChuLi_lll3']").val(data.list[i].change3[0].drillReChuLi_lll3);
							$("input[name='drillReChuLi_lll4']").val(data.list[i].change3[0].drillReChuLi_lll4);
							$("input[name='drillReChuLi_lll5']").val(data.list[i].change3[0].drillReChuLi_lll5);
							$("input[name='drillReChuLi_lll6']").val(data.list[i].change3[0].drillReChuLi_lll6);
							$("input[name='drillReChuLi_b1']").val(data.list[i].drillReChuLi_b1);
							if(data.list[i].change[0].length>1){
								for(var j=1;j<data.list[i].change[0].length;j++){
									$str='';
					       			$str+='<tr>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l1" value="'+data.list[i].change[j].drillReChuLi_l1+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l2" value="'+data.list[i].change[j].drillReChuLi_l2+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l3" value="'+data.list[i].change[j].drillReChuLi_l3+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l4" value="'+data.list[i].change[j].drillReChuLi_l4+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l5" value="'+data.list[i].change[j].drillReChuLi_l5+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l6" value="'+data.list[i].change[j].drillReChuLi_l6+'"/></td>';
									$str+='<td align="center"></td>';
							    $str+='</tr>';
							    $("#drill_reChuLi1").before($str);
								}
							}
							if(data.list[i].change2[0].length>1){
								for(var j=1;j<data.list[i].change2[0].length;j++){
									$str='';
					        $str+='<tr>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll1" value="'+data.list[i].change2[j].drillReChuLi_ll1+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll2" value="'+data.list[i].change2[j].drillReChuLi_ll2+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll3" value="'+data.list[i].change2[j].drillReChuLi_ll3+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll4" value="'+data.list[i].change2[j].drillReChuLi_ll4+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll5" value="'+data.list[i].change2[j].drillReChuLi_ll5+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll6" value="'+data.list[i].change2[j].drillReChuLi_ll6+'"/></td>';
									$str+='<td align="center"></td>';
							    $str+='</tr>';
							    $("#drill_reChuLi2").before($str);
								}
							}
							if(data.list[i].change3[0].length>1){
								for(var j=1;j<data.list[i].change3[0].length;j++){
									$str='';
					        $str+='<tr>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll1" value="'+data.list[i].change3[j].drillReChuLi_lll1+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll2" value="'+data.list[i].change3[j].drillReChuLi_lll2+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll3" value="'+data.list[i].change3[j].drillReChuLi_lll3+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll4" value="'+data.list[i].change3[j].drillReChuLi_lll4+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll5" value="'+data.list[i].change3[j].drillReChuLi_lll5+'"/></td>';
									$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll6" value="'+data.list[i].change3[j].drillReChuLi_lll6+'"/></td>';
									$str+='<td align="center"></td>';
							    $str+='</tr>';
							    $("#drill_reChuLi3").before($str);
								}
							}
						}
						if(data.list[i].name == "drillFaMenChongJi"){//
							$("input[name='drillFaMenChongJi_a1'][value='" + data.list[i].drillFaMenChongJi_a1 + "']").attr("checked",true); 
							$("input[name='drillFaMenChongJi_a2'][value='" + data.list[i].drillFaMenChongJi_a2 + "']").attr("checked",true);
							$("input[name='drillFaMenChongJi_a3'][value='" + data.list[i].drillFaMenChongJi_a3 + "']").attr("checked",true); 
							$("input[name='drillFaMenChongJi_a4'][value='" + data.list[i].drillFaMenChongJi_a4 + "']").attr("checked",true);
							$("input[name='drillFaMenChongJi_b1']").val(data.list[i].drillFaMenChongJi_b1);
							$("input[name='drillFaMenChongJi_b2']").val(data.list[i].drillFaMenChongJi_b2);
							$("input[name='drillFaMenChongJi_c1']").val(data.list[i].drillFaMenChongJi_c1);
							$("input[name='drillFaMenChongJi_c2']").val(data.list[i].drillFaMenChongJi_c2);
							$("input[name='drillFaMenChongJi_c3']").val(data.list[i].drillFaMenChongJi_c3);
							$("input[name='drillFaMenChongJi_c4']").val(data.list[i].drillFaMenChongJi_c4);
							$("input[name='drillFaMenChongJi_d1']").val(data.list[i].drillFaMenChongJi_d1);
							$("input[name='drillFaMenChongJi_d2']").val(data.list[i].drillFaMenChongJi_d2);
							$("input[name='drillFaMenChongJi_d3']").val(data.list[i].drillFaMenChongJi_d3);
							$("input[name='drillFaMenChongJi_d4']").val(data.list[i].drillFaMenChongJi_d4);
							$("input[name='drillFaMenChongJi_e1']").val(data.list[i].drillFaMenChongJi_e1);
							$("input[name='drillFaMenChongJi_e2']").val(data.list[i].drillFaMenChongJi_e2);
							$("input[name='drillFaMenChongJi_e3']").val(data.list[i].drillFaMenChongJi_e3);
							$("input[name='drillFaMenChongJi_e4']").val(data.list[i].drillFaMenChongJi_e4);
							$("input[name='drillFaMenChongJi_f1']").val(data.list[i].drillFaMenChongJi_f1);
							$("input[name='drillFaMenChongJi_f2']").val(data.list[i].drillFaMenChongJi_f2);
							$("input[name='drillFaMenChongJi_f3']").val(data.list[i].drillFaMenChongJi_f3);
							$("input[name='drillFaMenChongJi_f4']").val(data.list[i].drillFaMenChongJi_f4);
							$("input[name='drillFaMenChongJi_g1']").val(data.list[i].drillFaMenChongJi_g1);
							$("input[name='drillFaMenChongJi_g2']").val(data.list[i].drillFaMenChongJi_g2);
							$("input[name='drillFaMenChongJi_g3']").val(data.list[i].drillFaMenChongJi_g3);
							$("input[name='drillFaMenChongJi_g4']").val(data.list[i].drillFaMenChongJi_g4);
							$("input[name='drillFaMenChongJi_h1']").val(data.list[i].drillFaMenChongJi_h1);
							$("input[name='drillFaMenChongJi_h2']").val(data.list[i].drillFaMenChongJi_h2);
							$("input[name='drillFaMenChongJi_h3']").val(data.list[i].drillFaMenChongJi_h3);
							$("input[name='drillFaMenChongJi_h4']").val(data.list[i].drillFaMenChongJi_h4);
							$("input[name='drillFaMenChongJi_i1']").val(data.list[i].drillFaMenChongJi_i1);
						}

						if(data.list[i].name == "drillBiaoMian"){//钻具 
									$("input[name='drillBiaoMian_a1'][value='" + data.list[i].drillBiaoMian_a1 + "']").attr("checked",true); 
									$("input[name='drillBiaoMian_a2'][value='" + data.list[i].drillBiaoMian_a2 + "']").attr("checked",true);
									$("input[name='drillBiaoMian_b1']").val(data.list[i].drillBiaoMian_b1);
									$("input[name='drillBiaoMian_b2']").val(data.list[i].drillBiaoMian_b2);
									$("input[name='drillBiaoMian_b3']").val(data.list[i].drillBiaoMian_b3);
									$("input[name='drillBiaoMian_b4']").val(data.list[i].drillBiaoMian_b4);
									$("input[name='drillBiaoMian_c1']").val(data.list[i].drillBiaoMian_c1);
									$("input[name='drillBiaoMian_c2']").val(data.list[i].drillBiaoMian_c2);
									$("input[name='drillBiaoMian_c3']").val(data.list[i].drillBiaoMian_c3);
									$("input[name='drillBiaoMian_c4']").val(data.list[i].drillBiaoMian_c4);
									$("input[name='drillBiaoMian_d1']").val(data.list[i].drillBiaoMian_d1);
								}


						if(data.list[i].name == "drillChaoShengBo"){	//输送管  超声波检测（连探、手探）
									$("input[name='drillChaoShengBo_b1']").val(data.list[i].drillChaoShengBo_b1);
									$("input[name='drillChaoShengBo_a1'][value='" + data.list[i].drillChaoShengBo_a1 + "']").attr("checked",true); 
									$("input[name='drillChaoShengBo_a2'][value='" + data.list[i].drillChaoShengBo_a2 + "']").attr("checked",true);
									$("input[name='drillChaoShengBo_a3'][value='" + data.list[i].drillChaoShengBo_a3 + "']").attr("checked",true); 
									$("input[name='drillChaoShengBo_a4'][value='" + data.list[i].drillChaoShengBo_a4 + "']").attr("checked",true);
									$("input[name='drillChaoShengBo_a5'][value='" + data.list[i].drillChaoShengBo_a5 + "']").attr("checked",true);
									$("input[name='drillChaoShengBo_l1']").val(data.list[i].change[0].drillChaoShengBo_l1);
									$("select[name='drillChaoShengBo_l2']").val(data.list[i].change[0].drillChaoShengBo_l2);
									$("input[name='drillChaoShengBo_l3']").val(data.list[i].change[0].drillChaoShengBo_l3);
									$("input[name='drillChaoShengBo_l4']").val(data.list[i].change[0].drillChaoShengBo_l4);
									$("input[name='drillChaoShengBo_l5']").val(data.list[i].change[0].drillChaoShengBo_l5);
									$("input[name='drillChaoShengBo_l6']").val(data.list[i].change[0].drillChaoShengBo_l6);
									$("input[name='drillChaoShengBo_ll1']").val(data.list[i].change2[0].drillChaoShengBo_ll1);
									$("input[name='drillChaoShengBo_ll2']").val(data.list[i].change2[0].drillChaoShengBo_ll2);
									$("select[name='drillChaoShengBo_ll3']").val(data.list[i].change2[0].drillChaoShengBo_ll3);
									$("select[name='drillChaoShengBo_ll4']").val(data.list[i].change2[0].drillChaoShengBo_ll4);
									$("input[name='drillChaoShengBo_ll5']").val(data.list[i].change2[0].drillChaoShengBo_ll5);
									$("select[name='drillChaoShengBo_ll6']").val(data.list[i].change2[0].drillChaoShengBo_ll6);
									$("input[name='drillChaoShengBo_ll7']").val(data.list[i].change2[0].drillChaoShengBo_ll7);

									if(data.list[i].change[0].length>1){
										for(var j=1;j<data.list[i].change[0].length;j++){
											$str='';
							        $str+='<tr>';
											$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_l1" value="'+data.list[i].change[j].drillChaoShengBo_l1+'"/></td>';
											if (data.list[i].change[j].drillChaoShengBo_l3 == "连探") {
												$str+='<td align="center"><select name="drillChaoShengBo_l2"><option value="连探" selected>连探</option><option value="手探">手探</option></select></td>';
											}else{
												$str+='<td align="center"><select name="drillChaoShengBo_l2"><option value="连探">连探</option><option value="手探" selected>手探</option></select></td>';
											}
											$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_l3" value="'+data.list[i].change[j].drillChaoShengBo_l3+'"/></td>';
											$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_l4" value="'+data.list[i].change[j].drillChaoShengBo_l4+'"/></td>';
											$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_l5" value="'+data.list[i].change[j].drillChaoShengBo_l5+'"/></td>';
											$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_l6" value="'+data.list[i].change[j].drillChaoShengBo_l6+'"/></td>';
											$str+='<td align="center" ></td>';
									    $str+='</tr>';
									    $("#drill_chaoShengBo1").before($str);
										}
									}
									if(data.list[i].change2[0].length>1){
										for(var j=1;j<data.list[i].change2[0].length;j++){
											$str='';
							        $str+='<tr>';
											$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_ll1" value="'+data.list[i].change2[j].drillChaoShengBo_ll1+'"/></td>';
											$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_ll2" value="'+data.list[i].change2[j].drillChaoShengBo_ll2+'"/></td>';
											if (data.list[i].change2[j].drillChaoShengBo_ll3 == "符合") {
												$str+='<td align="center"><select name="drillChaoShengBo_ll3"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
											}else{
												$str+='<td align="center"><select name="drillChaoShengBo_ll3"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
											}
											if (data.list[i].change2[j].drillChaoShengBo_ll4 == "符合") {
												$str+='<td align="center"><select name="drillChaoShengBo_ll4"><option value="符合"selected>符合</option><option value="不符合">不符合</option></select></td>';
											}else{
												$str+='<td align="center"><select name="drillChaoShengBo_ll4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
											}
											$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_ll5" value="'+data.list[i].change2[j].drillChaoShengBo_ll5+'"/></td>';
											if (data.list[i].change2[j].drillChaoShengBo_ll6 == "符合") {
												$str+='<td align="center"><select name="drillChaoShengBo_ll6"><option value="符合"selected>符合</option><option value="不符合">不符合</option></select></td>';
											}else{
												$str+='<td align="center"><select name="drillChaoShengBo_ll6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
											}
											$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_ll7" value="'+data.list[i].change2[j].drillChaoShengBo_ll7+'"/></td>';
											$str+='<td align="center"></td>';
									    $str+='</tr>';
									    $("#drill_chaoShengBo2").before($str);
										}
									}
								}

						if(data.list[i].name == "drillCiFenJianCe"){//阀门 磁粉检测
							$("input[name='drillCiFenJianCe_a1'][value='" + data.list[i].drillCiFenJianCe_a1 + "']").attr("checked",true); 
							$("input[name='drillCiFenJianCe_a2'][value='" + data.list[i].drillCiFenJianCe_a2 + "']").attr("checked",true);
							$("input[name='drillCiFenJianCe_a3'][value='" + data.list[i].drillCiFenJianCe_a3 + "']").attr("checked",true);
							$("input[name='drillCiFenJianCe_a4'][value='" + data.list[i].drillCiFenJianCe_a4 + "']").attr("checked",true);
							$("input[name='drillCiFenJianCe_b1'][value='" + data.list[i].drillCiFenJianCe_b1 + "']").attr("checked",true);
							
							$("input[name='drillCiFenJianCe_l1']").val(data.list[i].change[0].drillCiFenJianCe_l1);
							$("input[name='drillCiFenJianCe_l2']").val(data.list[i].change[0].drillCiFenJianCe_l2);
							$("input[name='drillCiFenJianCe_l3']").val(data.list[i].change[0].drillCiFenJianCe_l3);
							$("input[name='drillCiFenJianCe_l4']").val(data.list[i].change[0].drillCiFenJianCe_l4);
							$("input[name='drillCiFenJianCe_l5']").val(data.list[i].change[0].drillCiFenJianCe_l5);
							
							$("input[name='drillCiFenJianCe_ll1']").val(data.list[i].change2[0].drillCiFenJianCe_ll1);
							$("input[name='drillCiFenJianCe_ll2']").val(data.list[i].change2[0].drillCiFenJianCe_ll2);
							$("input[name='drillCiFenJianCe_ll3']").val(data.list[i].change2[0].drillCiFenJianCe_ll3);
							$("input[name='drillCiFenJianCe_ll4']").val(data.list[i].change2[0].drillCiFenJianCe_ll4);
							$("select[name='drillCiFenJianCe_ll5']").val(data.list[i].change2[0].drillCiFenJianCe_ll5);
							$("select[name='drillCiFenJianCe_ll6']").val(data.list[i].change2[0].drillCiFenJianCe_ll6);
							$("input[name='drillCiFenJianCe_ll7']").val(data.list[i].change2[0].drillCiFenJianCe_ll7);
							$("input[name='drillCiFenJianCe_c1']").val(data.list[i].drillCiFenJianCe_c1);
							if(data.list[i].change[0].length>1){
								for(var j=1;j<data.list[i].change[0].length;j++){
									 $str='';
								        $str+='<tr>';
								        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_l1" value="'+data.list[i].change[j].drillCiFenJianCe_l1+'"/></td>';
								        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_l2" value="'+data.list[i].change[j].drillCiFenJianCe_l2+'"/></td>';
										$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_l3" value="'+data.list[i].change[j].drillCiFenJianCe_l3+'"/></td>';
										$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="drillCiFenJianCe_l4" value="'+data.list[i].change[j].drillCiFenJianCe_l4+'"/></td>';
										$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="drillCiFenJianCe_l5" value="'+data.list[i].change[j].drillCiFenJianCe_l5+'"/></td>';
									    $str+='<td align="center"></td>';
									    $str+='</tr>';
									    $("#drillCiFenJianCe1").before($str);
								}
							}
							if(data.list[i].change2[0].length>1){
								for(var j=1;j<data.list[i].change2[0].length;j++){
									 $str='';
								        $str+='<tr>';
										$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_ll1" value="'+data.list[i].change2[j].drillCiFenJianCe_ll1+'"/></td>';
										$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_ll2" value="'+data.list[i].change2[j].drillCiFenJianCe_ll5+'"/></td>';
										$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_ll3" value="'+data.list[i].change2[j].drillCiFenJianCe_ll3+'"/></td>';
										$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_ll4" value="'+data.list[i].change2[j].drillCiFenJianCe_ll4+'"/></td>';
										if(data.list[i].change2[j].drillCiFenJianCe_ll5=="符合"){
											$str+='<td align="center"><select name="drillCiFenJianCe_ll5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
										}else{
											$str+='<td align="center"><select name="drillCiFenJianCe_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
										}
										if(data.list[i].change2[j].drillCiFenJianCe_ll6=="符合"){
											$str+='<td align="center"><select name="drillCiFenJianCe_ll6" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
										}else{
											$str+='<td align="center"><select name="drillCiFenJianCe_ll6" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
										}
										$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_ll7" value="'+data.list[i].change2[j].drillCiFenJianCe_ll7+'"/></td>';
										$str+='<td align="center"></td>';
									    $str+='</tr>';
									    $("#drillCiFenJianCe2").before($str);
								}
							}
						}
						if(data.list[i].name == "drillCiFenJianCe2"){//阀门 磁粉检测
							$("input[name='drillCiFenJianCe2_a1'][value='" + data.list[i].drillCiFenJianCe2_a1 + "']").attr("checked",true); 
							$("input[name='drillCiFenJianCe2_a2'][value='" + data.list[i].drillCiFenJianCe2_a2 + "']").attr("checked",true);
							$("input[name='drillCiFenJianCe2_a3'][value='" + data.list[i].drillCiFenJianCe2_a3 + "']").attr("checked",true);
							$("input[name='drillCiFenJianCe2_a4'][value='" + data.list[i].drillCiFenJianCe2_a4 + "']").attr("checked",true);
							$("input[name='drillCiFenJianCe2_b1'][value='" + data.list[i].drillCiFenJianCe2_b1 + "']").attr("checked",true);
							
							$("input[name='drillCiFenJianCe2_l1']").val(data.list[i].change[0].drillCiFenJianCe2_l1);
							$("input[name='drillCiFenJianCe2_l2']").val(data.list[i].change[0].drillCiFenJianCe2_l2);
							$("input[name='drillCiFenJianCe2_l3']").val(data.list[i].change[0].drillCiFenJianCe2_l3);
							$("input[name='drillCiFenJianCe2_l4']").val(data.list[i].change[0].drillCiFenJianCe2_l4);
							$("input[name='drillCiFenJianCe2_l5']").val(data.list[i].change[0].drillCiFenJianCe2_l5);
							
							$("input[name='drillCiFenJianCe2_ll1']").val(data.list[i].change2[0].drillCiFenJianCe2_ll1);
							$("input[name='drillCiFenJianCe2_ll2']").val(data.list[i].change2[0].drillCiFenJianCe2_ll2);
							$("input[name='drillCiFenJianCe2_ll3']").val(data.list[i].change2[0].drillCiFenJianCe2_ll3);
							$("select[name='drillCiFenJianCe2_ll4']").val(data.list[i].change2[0].drillCiFenJianCe2_ll4);
							$("select[name='drillCiFenJianCe2_ll5']").val(data.list[i].change2[0].drillCiFenJianCe2_ll5);
							$("input[name='drillCiFenJianCe2_ll6']").val(data.list[i].change2[0].drillCiFenJianCe2_ll6);
							$("input[name='drillCiFenJianCe2_c1']").val(data.list[i].drillCiFenJianCe2_c1);
							if(data.list[i].change[0].length>1){
								for(var j=1;j<data.list[i].change[0].length;j++){
									 $str='';
								        $str+='<tr>';
								        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_l1" value="'+data.list[i].change[j].drillCiFenJianCe2_l1+'"/></td>';
								        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_l2" value="'+data.list[i].change[j].drillCiFenJianCe2_l2+'"/></td>';
										$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_l3" value="'+data.list[i].change[j].drillCiFenJianCe2_l3+'"/></td>';
										$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="drillCiFenJianCe2_l4" value="'+data.list[i].change[j].drillCiFenJianCe2_l4+'"/></td>';
										$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="drillCiFenJianCe2_l5" value="'+data.list[i].change[j].drillCiFenJianCe2_l5+'"/></td>';
									    $str+='<td align="center"></td>';
									    $str+='</tr>';
									    $("#drillCiFenJianCe21").before($str);
								}
							}
							if(data.list[i].change2[0].length>1){
								for(var j=1;j<data.list[i].change2[0].length;j++){
									 $str='';
								        $str+='<tr>';
										$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_ll1" value="'+data.list[i].change2[j].drillCiFenJianCe2_ll1+'"/></td>';
										$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_ll2" value="'+data.list[i].change2[j].drillCiFenJianCe2_ll2+'"/></td>';
										$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_ll3" value="'+data.list[i].change2[j].drillCiFenJianCe2_ll3+'"/></td>';
										if(data.list[i].change2[j].drillCiFenJianCe2_ll4=="符合"){
											$str+='<td align="center"><select name="drillCiFenJianCe2_ll4" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
										}else{
											$str+='<td align="center"><select name="drillCiFenJianCe2_ll4" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
										}
										if(data.list[i].change2[j].drillCiFenJianCe2_ll5=="符合"){
											$str+='<td align="center"><select name="drillCiFenJianCe2_ll5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
										}else{
											$str+='<td align="center"><select name="drillCiFenJianCe2_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
										}
										
										$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_ll6" value="'+data.list[i].change2[j].drillCiFenJianCe2_ll6+'"/></td>';
										$str+='<td align="center"></td>';
									    $str+='</tr>';
									    $("#drillCiFenJianCe22").before($str);
								}
							}
						}

								if(data.list[i].name == "drillNaiMo"){//钻具 热处理
											$("input[name='drillNaiMo_a1'][value='" +  data.list[i].drillNaiMo_a1 + "']").attr("checked",true); 
											$("input[name='drillNaiMo_a2'][value='" +  data.list[i].drillNaiMo_a2 + "']").attr("checked",true);
											$("input[name='drillNaiMo_a3']").val(data.list[i].drillNaiMo_a3);
											$("input[name='drillNaiMo_a4']").val(data.list[i].drillNaiMo_a4)
											$("input[name='drillNaiMo_l1']").val(data.list[i].change[0].drillNaiMo_l1);
											$("select[name='drillNaiMo_l2']").val(data.list[i].change[0].drillNaiMo_l2);
											$("input[name='drillNaiMo_l3']").val(data.list[i].change[0].drillNaiMo_l3);
											$("input[name='drillNaiMo_l4']").val(data.list[i].change[0].drillNaiMo_l4);
											$("input[name='drillNaiMo_l5']").val(data.list[i].change[0].drillNaiMo_l5);
											$("input[name='drillNaiMo_l6']").val(data.list[i].change[0].drillNaiMo_l6);
											$("input[name='drillNaiMo_l7']").val(data.list[i].change[0].drillNaiMo_l7);
											$("input[name='drillNaiMo_l8']").val(data.list[i].change[0].drillNaiMo_l8);
											$("input[name='drillNaiMo_l9']").val(data.list[i].change[0].drillNaiMo_l9);
											$("input[name='drillNaiMo_l10']").val(data.list[i].change[0].drillNaiMo_l10);
											$("input[name='drillNaiMo_b1']").val(data.list[i].drillNaiMo_b1);
											if(data.list[i].change[0].length>1){
												for(var j=1;j<data.list[i].change[0].length;j++){
													$str='';
									        $str+='<tr>';
													$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l1" value="'+data.list[i].change[j].drillNaiMo_l1+'"/></td>';
													if (data.list[i].change[j].drillNaiMo_l2 == "符合") {
														$str+='<td align="center"><select name="drillNaiMo_l2"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
													}else{
														$str+='<td align="center"><select name="drillNaiMo_l2"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
													}
													$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l3" value="'+data.list[i].change[j].drillNaiMo_l3+'"/></td>';
													$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l4" value="'+data.list[i].change[j].drillNaiMo_l4+'"/></td>';
													$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l5" value="'+data.list[i].change[j].drillNaiMo_l5+'"/></td>';
													$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l6" value="'+data.list[i].change[j].drillNaiMo_l6+'"/></td>';
													$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l7" value="'+data.list[i].change[j].drillNaiMo_l7+'"/></td>';
													$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l8" value="'+data.list[i].change[j].drillNaiMo_l8+'"/></td>';
													$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l9" value="'+data.list[i].change[j].drillNaiMo_l9+'"/></td>';
													$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l10" value="'+data.list[i].change[j].drillNaiMo_l10+'" /></td>';
													$str+='<td align="center"></td>';
											    $str+='</tr>';
											    $("#drill_naiMo").before($str);
												}
											}
										}

			if(data.list[i].name == "drillNeiTuCeng"){//钻具  内涂层
				$("input[name='drillNeiTuCeng_a1'][value='" +data.list[i].drillNeiTuCeng_a1 + "']").attr("checked",true); 
				$("input[name='drillNeiTuCeng_a2'][value='" +data.list[i].drillNeiTuCeng_a2 + "']").attr("checked",true);
				$("input[name='drillNeiTuCeng_l1']").val(data.list[i].change[0].drillNeiTuCeng_l1);
				$("input[name='drillNeiTuCeng_l2']").val(data.list[i].change[0].drillNeiTuCeng_l2);
				$("input[name='drillNeiTuCeng_l3']").val(data.list[i].change[0].drillNeiTuCeng_l3);
				$("input[name='drillNeiTuCeng_l4']").val(data.list[i].change[0].drillNeiTuCeng_l4);
				$("input[name='drillNeiTuCeng_l5']").val(data.list[i].change[0].drillNeiTuCeng_l5);
				$("input[name='drillNeiTuCeng_l6']").val(data.list[i].change[0].drillNeiTuCeng_l6);
				$("input[name='drillNeiTuCeng_b1']").val(data.list[i].drillNeiTuCeng_b1);
				$("input[name='drillNeiTuCeng_b2']").val(data.list[i].drillNeiTuCeng_b2);
				$("input[name='drillNeiTuCeng_b3']").val(data.list[i].drillNeiTuCeng_b3);
				$("input[name='drillNeiTuCeng_b4']").val(data.list[i].drillNeiTuCeng_b4);
				$("input[name='drillNeiTuCeng_b5']").val(data.list[i].drillNeiTuCeng_b5);
				$("input[name='drillNeiTuCeng_c1']").val(data.list[i].drillNeiTuCeng_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l1" value="'+data.list[i].change[j].drillNeiTuCeng_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l2" value="'+data.list[i].change[j].drillNeiTuCeng_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l3" value="'+data.list[i].change[j].drillNeiTuCeng_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l4" value="'+data.list[i].change[j].drillNeiTuCeng_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l5" value="'+data.list[i].change[j].drillNeiTuCeng_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l6" value="'+data.list[i].change[j].drillNeiTuCeng_l6+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#drill_neiTuCeng").before($str);
					}
				}
			}

			if(data.list[i].name == "drillNeiTuCengHouDu"){//钻具 内涂层厚度测量
					$("input[name='drillNeiTuCengHouDu_l1']").val(data.list[i].change[0].drillNeiTuCengHouDu_l1);
					$("input[name='drillNeiTuCengHouDu_l2']").val(data.list[i].change[0].drillNeiTuCengHouDu_l2);
					$("input[name='drillNeiTuCengHouDu_l3']").val(data.list[i].change[0].drillNeiTuCengHouDu_l3);
					$("input[name='drillNeiTuCengHouDu_l4']").val(data.list[i].change[0].drillNeiTuCengHouDu_l4);
					$("input[name='drillNeiTuCengHouDu_a1']").val(data.list[i].drillNeiTuCengHouDu_a1);
					$("input[name='drillNeiTuCengHouDu_a2']").val(data.list[i].drillNeiTuCengHouDu_a2);
					$("input[name='drillNeiTuCengHouDu_a3']").val(data.list[i].drillNeiTuCengHouDu_a3);
					$("input[name='drillNeiTuCengHouDu_b1']").val(data.list[i].drillNeiTuCengHouDu_b1);
					if(data.list[i].change[0].length>1){
						for(var j=1;j<data.list[i].change[0].length;j++){
							$str='';
			        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu_l1" value="'+data.list[i].change[j].drillNeiTuCengHouDu_l1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu_l2" value="'+data.list[i].change[j].drillNeiTuCengHouDu_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu_l3" value="'+data.list[i].change[j].drillNeiTuCengHouDu_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu_l4" value="'+data.list[i].change[j].drillNeiTuCengHouDu_l4+'"/></td>';
							$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#drill_neiTuCengHouDu").before($str);
						}
					}
				}
				if(data.list[i].name == "drillBaoZhuang"){//
					$("input[name='drillBaoZhuang_a1']").val(data.list[i].drillBaoZhuang_a1);
					$("input[name='drillBaoZhuang_a2'][value='" + data.list[i].drillBaoZhuang_a2 + "']").attr("checked",true);
					$("input[name='drillBaoZhuang_l1']").val(data.list[i].change[0].drillBaoZhuang_l1);
					$("select[name='drillBaoZhuang_l2']").val(data.list[i].change[0].drillBaoZhuang_l2);
					$("select[name='drillBaoZhuang_l3']").val(data.list[i].change[0].drillBaoZhuang_l3);
					$("select[name='drillBaoZhuang_l4']").val(data.list[i].change[0].drillBaoZhuang_l4);
					$("select[name='drillBaoZhuang_l5']").val(data.list[i].change[0].drillBaoZhuang_l5);
					$("input[name='drillBaoZhuang_l6']").val(data.list[i].change[0].drillBaoZhuang_l6);
					$("input[name='drillBaoZhuang_b1']").val(data.list[i].drillBaoZhuang_b1);
					if(data.list[i].change[0].length>1){
						for(var j=1;j<data.list[i].change[0].length;j++){
							$str='';
			        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBaoZhuang_l1" value="'+data.list[i].change[j].drillBaoZhuang_l1+'"/></td>';
							if (data.list[i].change[j].drillBaoZhuang_l2 == "符合") {
								$str+='<td align="center"><select name="drillBaoZhuang_l2"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="drillBaoZhuang_l2"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							if (data.list[i].change[j].drillBaoZhuang_l3 == "符合") {
								$str+='<td align="center"><select name="drillBaoZhuang_l3"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="drillBaoZhuang_l3"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							if (data.list[i].change[j].drillBaoZhuang_l4 == "符合") {
								$str+='<td align="center"><select name="drillBaoZhuang_l4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="drillBaoZhuang_l4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							if (data.list[i].change[j].drillBaoZhuang_l5 == "符合") {
								$str+='<td align="center"><select name="drillBaoZhuang_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="drillBaoZhuang_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBaoZhuang_l6" value="'+data.list[i].change[j].drillBaoZhuang_l6+'"/></td>';
							$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#drill_baoZhuang").before($str);
						}
					}
				}
				if(data.list[i].name == "drillBeiLiao"){//备料
					$("input[name='drillBeiLiao_a1']").val(data.list[i].drillBeiLiao_a1);
					$("input[name='drillBeiLiao_l1']").val(data.list[i].change[0].drillBeiLiao_l1);
					$("input[name='drillBeiLiao_l2']").val(data.list[i].change[0].drillBeiLiao_l2);
					$("input[name='drillBeiLiao_l3']").val(data.list[i].change[0].drillBeiLiao_l3);
					$("input[name='drillBeiLiao_l4']").val(data.list[i].change[0].drillBeiLiao_l4);
					$("select[name='drillBeiLiao_l5']").val(data.list[i].change[0].drillBeiLiao_l5);
					if(data.list[i].change[0].length>1){
						for(var j=1;j<data.list[i].change[0].length;j++){
							$str='';
			        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBeiLiao_l1" value="'+data.list[i].change[j].drillBeiLiao_l1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBeiLiao_l2" value="'+data.list[i].change[j].drillBeiLiao_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBeiLiao_l3" value="'+data.list[i].change[j].drillBeiLiao_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBeiLiao_l4" value="'+data.list[i].change[j].drillBeiLiao_l4+'"/></td>';
							if (data.list[i].change[j].drillBeiLiao_l5 == "符合") {
								$str+='<td align="center"><select name="drillBeiLiao_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="drillBeiLiao_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#drill_beiLiao").before($str);
						}
					

					}
				}

				if(data.list[i].name == "drillZuanKong"){//钻具 钻孔、车外圆
					$("input[name='drillZuanKong_a1']").val(data.list[i].drillZuanKong_a1);
					$("input[name='drillZuanKong_a2'][value='" + data.list[i].drillZuanKong_a2 + "']").attr("checked",true);
					$("input[name='drillZuanKong_l1']").val(data.list[i].change[0].drillZuanKong_l1);
					$("input[name='drillZuanKong_l2']").val(data.list[i].change[0].drillZuanKong_l2);
					$("input[name='drillZuanKong_l3']").val(data.list[i].change[0].drillZuanKong_l3);
					$("input[name='drillZuanKong_l4']").val(data.list[i].change[0].drillZuanKong_l4);
					$("input[name='drillZuanKong_b1']").val(data.list[i].drillZuanKong_b1);
					if(data.list[i].change[0].length>1){
						for(var j=1;j<data.list[i].change[0].length;j++){
							$str='';
			        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillZuanKong_l1" value="'+data.list[i].change[j].drillZuanKong_l1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillZuanKong_l2" value="'+data.list[i].change[j].drillZuanKong_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillZuanKong_l3" value="'+data.list[i].change[j].drillZuanKong_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillZuanKong_l4" value="'+data.list[i].change[j].drillZuanKong_l4+'"/></td>';
							$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#drill_zuanKong").before($str);
						}
					}
				}
				if(data.list[i].name == "drillChaoShengBo2"){	//输送管  超声波检测（连探、手探）
					$("input[name='drillChaoShengBo2_b1']").val(data.list[i].drillChaoShengBo2_b1);
					$("input[name='drillChaoShengBo2_a1'][value='" + data.list[i].drillChaoShengBo2_a1 + "']").attr("checked",true); 
					$("input[name='drillChaoShengBo2_a2'][value='" + data.list[i].drillChaoShengBo2_a2 + "']").attr("checked",true);
					$("input[name='drillChaoShengBo2_a3'][value='" + data.list[i].drillChaoShengBo2_a3 + "']").attr("checked",true); 
					$("input[name='drillChaoShengBo2_a4'][value='" + data.list[i].drillChaoShengBo2_a4 + "']").attr("checked",true);
					$("input[name='drillChaoShengBo2_a5'][value='" + data.list[i].drillChaoShengBo2_a5 + "']").attr("checked",true);
					$("input[name='drillChaoShengBo2_l1']").val(data.list[i].change[0].drillChaoShengBo2_l1);
					$("select[name='drillChaoShengBo2_l2']").val(data.list[i].change[0].drillChaoShengBo2_l2);
					$("input[name='drillChaoShengBo2_l3']").val(data.list[i].change[0].drillChaoShengBo2_l3);
					$("input[name='drillChaoShengBo2_l4']").val(data.list[i].change[0].drillChaoShengBo2_l4);
					$("input[name='drillChaoShengBo2_l5']").val(data.list[i].change[0].drillChaoShengBo2_l5);
					$("input[name='drillChaoShengBo2_l6']").val(data.list[i].change[0].drillChaoShengBo2_l6);
					$("input[name='drillChaoShengBo2_ll1']").val(data.list[i].change2[0].drillChaoShengBo2_ll1);
					$("input[name='drillChaoShengBo2_ll2']").val(data.list[i].change2[0].drillChaoShengBo2_ll2);
					$("select[name='drillChaoShengBo2_ll3']").val(data.list[i].change2[0].drillChaoShengBo2_ll3);
					$("select[name='drillChaoShengBo2_ll4']").val(data.list[i].change2[0].drillChaoShengBo2_ll4);
					$("input[name='drillChaoShengBo2_ll5']").val(data.list[i].change2[0].drillChaoShengBo2_ll5);
					$("select[name='drillChaoShengBo2_ll6']").val(data.list[i].change2[0].drillChaoShengBo2_ll6);
					$("input[name='drillChaoShengBo2_ll7']").val(data.list[i].change2[0].drillChaoShengBo2_ll7);

					if(data.list[i].change[0].length>1){
						for(var j=1;j<data.list[i].change[0].length;j++){
							$str='';
			        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_l1" value="'+data.list[i].change[j].drillChaoShengBo2_l1+'"/></td>';
							if (data.list[i].change[j].drillChaoShengBo2_l3 == "连探") {
								$str+='<td align="center"><select name="drillChaoShengBo2_l2"><option value="连探" selected>连探</option><option value="手探">手探</option></select></td>';
							}else{
								$str+='<td align="center"><select name="drillChaoShengBo2_l2"><option value="连探">连探</option><option value="手探" selected>手探</option></select></td>';
							}
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_l3" value="'+data.list[i].change[j].drillChaoShengBo2_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_l4" value="'+data.list[i].change[j].drillChaoShengBo2_l4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_l5" value="'+data.list[i].change[j].drillChaoShengBo2_l5+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_l6" value="'+data.list[i].change[j].drillChaoShengBo2_l6+'"/></td>';
							$str+='<td align="center" ></td>';
					    $str+='</tr>';
					    $("#drill_chaoShengBo21").before($str);
						}
					}
					if(data.list[i].change2[0].length>1){
						for(var j=1;j<data.list[i].change2[0].length;j++){
							$str='';
			        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_ll1" value="'+data.list[i].change2[j].drillChaoShengBo2_ll1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_ll2" value="'+data.list[i].change2[j].drillChaoShengBo2_ll2+'"/></td>';
							if (data.list[i].change2[j].drillChaoShengBo2_ll3 == "符合") {
								$str+='<td align="center"><select name="drillChaoShengBo2_ll3"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="drillChaoShengBo2_ll3"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							if (data.list[i].change2[j].drillChaoShengBo2_ll4 == "符合") {
								$str+='<td align="center"><select name="drillChaoShengBo2_ll4"><option value="符合"selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="drillChaoShengBo2_ll4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_ll5" value="'+data.list[i].change2[j].drillChaoShengBo2_ll5+'"/></td>';
							if (data.list[i].change2[j].drillChaoShengBo2_ll5 == "符合") {
								$str+='<td align="center"><select name="drillChaoShengBo2_ll6"><option value="符合"selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="drillChaoShengBo2_ll6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_ll7" value="'+data.list[i].change2[j].drillChaoShengBo2_ll7+'"/></td>';
							$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#drill_chaoShengBo22").before($str);
						}
					}
				}
		if(data.list[i].name == "drillReChuLi2"){//钻具 热处理
					$("input[name='drillReChuLi2_a1'][value='" + data.list[i].drillReChuLi2_a1 + "']").attr("checked",true); 
					$("input[name='drillReChuLi2_a2'][value='" + data.list[i].drillReChuLi2_a2 + "']").attr("checked",true);
					$("input[name='drillReChuLi2_l1']").val(data.list[i].change[0].drillReChuLi2_l1);
					$("input[name='drillReChuLi2_l2']").val(data.list[i].change[0].drillReChuLi2_l2);
					$("input[name='drillReChuLi2_l3']").val(data.list[i].change[0].drillReChuLi2_l3);
					$("input[name='drillReChuLi2_l4']").val(data.list[i].change[0].drillReChuLi2_l4);
					$("input[name='drillReChuLi2_l5']").val(data.list[i].change[0].drillReChuLi2_l5);
					$("input[name='drillReChuLi2_ll1']").val(data.list[i].change2[0].drillReChuLi2_ll1);
					$("input[name='drillReChuLi2_ll2']").val(data.list[i].change2[0].drillReChuLi2_ll2);
					$("input[name='drillReChuLi2_ll3']").val(data.list[i].change2[0].drillReChuLi2_ll3);
					$("input[name='drillReChuLi2_ll4']").val(data.list[i].change2[0].drillReChuLi2_ll4);
					$("input[name='drillReChuLi2_ll5']").val(data.list[i].change2[0].drillReChuLi2_ll5);
					$("input[name='drillReChuLi2_lll1']").val(data.list[i].change3[0].drillReChuLi2_lll1);
					$("input[name='drillReChuLi2_lll2']").val(data.list[i].change3[0].drillReChuLi2_lll2);
					$("input[name='drillReChuLi2_lll3']").val(data.list[i].change3[0].drillReChuLi2_lll3);
					$("input[name='drillReChuLi2_lll4']").val(data.list[i].change3[0].drillReChuLi2_lll4);
					$("input[name='drillReChuLi2_lll5']").val(data.list[i].change3[0].drillReChuLi2_lll5);
					$("input[name='drillReChuLi2_b1']").val(data.list[i].drillReChuLi2_b1);
					if(data.list[i].change[0].length>1){
						for(var j=1;j<data.list[i].change[0].length;j++){
							$str='';
			        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_l1" value="'+data.list[i].change[j].drillReChuLi2_l1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_l2" value="'+data.list[i].change[j].drillReChuLi2_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_l3" value="'+data.list[i].change[j].drillReChuLi2_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_l4" value="'+data.list[i].change[j].drillReChuLi2_l4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_l5" value="'+data.list[i].change[j].drillReChuLi2_l5+'"/></td>';
							$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#drill_reChuLi21").before($str);
						}
					}
					if(data.list[i].change2[0].length>1){
						for(var j=1;j<data.list[i].change2[0].length;j++){
							$str='';
			        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_ll1" value="'+data.list[i].change2[j].drillReChuLi2_ll1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_ll2" value="'+data.list[i].change2[j].drillReChuLi2_ll2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_ll3" value="'+data.list[i].change2[j].drillReChuLi2_ll3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_ll4" value="'+data.list[i].change2[j].drillReChuLi2_ll4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_ll5" value="'+data.list[i].change2[j].drillReChuLi2_ll5+'"/></td>';
							$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#drill_reChuLi22").before($str);
						}
					}
					if(data.list[i].change3[0].length>1){
						for(var j=1;j<data.list[i].change3[0].length;j++){
							$str='';
			        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_lll1" value="'+data.list[i].change3[j].drillReChuLi2_lll1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_lll2" value="'+data.list[i].change3[j].drillReChuLi2_lll2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_lll3" value="'+data.list[i].change3[j].drillReChuLi2_lll3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_lll4" value="'+data.list[i].change3[j].drillReChuLi2_lll4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_lll5" value="'+data.list[i].change3[j].drillReChuLi2_lll5+'"/></td>';
							$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#drill_reChuLi23").before($str);
						}
					}
				}
				if(data.list[i].name == "drillHuaXue"){//化学成分
					$("input[name='drillHuaXue_a1'][value='" + data.list[i].drillHuaXue_a1 + "']").attr("checked",true); 
					$("input[name='drillHuaXue_a2'][value='" + data.list[i].drillHuaXue_a2 + "']").attr("checked",true);
					$("input[name='drillHuaXue_b1']").val(data.list[i].drillHuaXue_b1);
					$("input[name='drillHuaXue_b2']").val(data.list[i].drillHuaXue_b2);
					$("input[name='drillHuaXue_b3']").val(data.list[i].drillHuaXue_b3);
					$("input[name='drillHuaXue_b4']").val(data.list[i].drillHuaXue_b4);
					$("input[name='drillHuaXue_c1']").val(data.list[i].drillHuaXue_c1);
					$("input[name='drillHuaXue_c2']").val(data.list[i].drillHuaXue_c2);
					$("input[name='drillHuaXue_c3']").val(data.list[i].drillHuaXue_c3);
					$("input[name='drillHuaXue_c4']").val(data.list[i].drillHuaXue_c4);
					$("input[name='drillHuaXue_d1']").val(data.list[i].drillHuaXue_d1);
					$("input[name='drillHuaXue_d2']").val(data.list[i].drillHuaXue_d2);
					$("input[name='drillHuaXue_d3']").val(data.list[i].drillHuaXue_d3);
					$("input[name='drillHuaXue_d4']").val(data.list[i].drillHuaXue_d4);
					$("input[name='drillHuaXue_e1']").val(data.list[i].drillHuaXue_e1);
				}

				if(data.list[i].name == "drillLaShenXingNeng"){//阀门 拉伸性能
					$("input[name='drillLaShenXingNeng_a1'][value='" + data.list[i].drillLaShenXingNeng_a1 + "']").attr("checked",true); 
					$("input[name='drillLaShenXingNeng_a2'][value='" + data.list[i].drillLaShenXingNeng_a2 + "']").attr("checked",true);
					$("input[name='drillLaShenXingNeng_a3'][value='" + data.list[i].drillLaShenXingNeng_a3 + "']").attr("checked",true); 
					$("input[name='drillLaShenXingNeng_a4'][value='" + data.list[i].drillLaShenXingNeng_a4 + "']").attr("checked",true);
					$("input[name='drillLaShenXingNeng_l1']").val(data.list[i].change[0].drillLaShenXingNeng_l1);
					$("input[name='drillLaShenXingNeng_l2']").val(data.list[i].change[0].drillLaShenXingNeng_l2);
					$("input[name='drillLaShenXingNeng_l3']").val(data.list[i].change[0].drillLaShenXingNeng_l3);
					$("input[name='drillLaShenXingNeng_l4']").val(data.list[i].change[0].drillLaShenXingNeng_l4);
					$("input[name='drillLaShenXingNeng_l5']").val(data.list[i].change[0].drillLaShenXingNeng_l5);
					$("input[name='drillLaShenXingNeng_l6']").val(data.list[i].change[0].drillLaShenXingNeng_l6);
					$("input[name='drillLaShenXingNeng_b1']").val(data.list[i].drillLaShenXingNeng_b1);
					if(data.list[i].change[0].length>1){
						for(var j=1;j<data.list[i].change[0].length;j++){
							 $str='';
						        $str+='<tr>';
								$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l1" value="'+data.list[i].change[j].drillLaShenXingNeng_l1+'"/></td>';
								$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l2" value="'+data.list[i].change[j].drillLaShenXingNeng_l2+'"/></td>';
								$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l3" value="'+data.list[i].change[j].drillLaShenXingNeng_l3+'"/></td>';
								$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l4" value="'+data.list[i].change[j].drillLaShenXingNeng_l4+'"/></td>';
								$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l5" value="'+data.list[i].change[j].drillLaShenXingNeng_l5+'"/></td>';
								$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l6" value="'+data.list[i].change[j].drillLaShenXingNeng_l6+'"/></td>';
								$str+='<td align="center">/td>';
							    $str+='</tr>';
							    $("#drillLaShenXingNeng").before($str);
						}
					}
				}
		if(data.list[i].name == "drillChongJi"){//冲击试验
			$("input[name='drillChongJi_a1'][value='" + data.list[i].drillChongJi_a1 + "']").attr("checked",true); 
			$("input[name='drillChongJi_a2'][value='" + data.list[i].drillChongJi_a2 + "']").attr("checked",true);
			$("input[name='drillChongJi_a3'][value='" + data.list[i].drillChongJi_a3 + "']").attr("checked",true); 
			$("input[name='drillChongJi_a4'][value='" + data.list[i].drillChongJi_a4 + "']").attr("checked",true);
			$("input[name='drillChongJi_l1']").val(data.list[i].change[0].drillChongJi_l1);
			$("input[name='drillChongJi_l2']").val(data.list[i].change[0].drillChongJi_l2);
			$("input[name='drillChongJi_l3']").val(data.list[i].change[0].drillChongJi_l3);
			$("input[name='drillChongJi_l4']").val(data.list[i].change[0].drillChongJi_l4);
			$("input[name='drillChongJi_l5']").val(data.list[i].change[0].drillChongJi_l5);
			$("input[name='drillChongJi_l6']").val(data.list[i].change[0].drillChongJi_l6);
			$("input[name='drillChongJi_l7']").val(data.list[i].change[0].drillChongJi_l7);
			$("input[name='drillChongJi_b1']").val(data.list[i].drillChongJi_b1);
			$("input[name='drillChongJi_b2']").val(data.list[i].drillChongJi_b2);
			$("input[name='drillChongJi_c1']").val(data.list[i].drillChongJi_c1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					 $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l1" value="'+data.list[i].change[j].drillChongJi_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l2" value="'+data.list[i].change[j].drillChongJi_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l3" value="'+data.list[i].change[j].drillChongJi_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l4" value="'+data.list[i].change[j].drillChongJi_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l5" value="'+data.list[i].change[j].drillChongJi_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l6" value="'+data.list[i].change[j].drillChongJi_l6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l7" value="'+data.list[i].change[j].drillChongJi_l7+'"/></td>';
						$str+='<td align="center">/td>';
					    $str+='</tr>';
					    $("#drillChongJi").before($str);
				}
			}
		}

		if(data.list[i].name == "drillYingDu"){//硬度 
			$("input[name='drillYingDu_a1'][value='" + data.list[i].drillYingDu_a1 + "']").attr("checked",true); 
			$("input[name='drillYingDu_a2'][value='" + data.list[i].drillYingDu_a2 + "']").attr("checked",true);
			$("input[name='drillYingDu_b1']").val(data.list[i].drillYingDu_b1);
			$("input[name='drillYingDu_b2']").val(data.list[i].drillYingDu_b2);
			$("input[name='drillYingDu_b3']").val(data.list[i].drillYingDu_b3);
			$("input[name='drillYingDu_b4']").val(data.list[i].drillYingDu_b4);
			$("input[name='drillYingDu_c1']").val(data.list[i].drillYingDu_c1);
			$("input[name='drillYingDu_c2']").val(data.list[i].drillYingDu_c2);
			$("input[name='drillYingDu_c3']").val(data.list[i].drillYingDu_c3);
			$("input[name='drillYingDu_c4']").val(data.list[i].drillYingDu_c4);
			$("input[name='drillYingDu_d1']").val(data.list[i].drillYingDu_d1);
		}

		if(data.list[i].name == "drillJiJiaGong"){//钻具  机加工
			$("input[name='drillJiJiaGong_a1']").val(data.list[i].drillJiJiaGong_a1);
			$("input[name='drillJiJiaGong_a2'][value='"+data.list[i].drillJiJiaGong_a2+"']").attr("checked",true);
			$("input[name='drillJiJiaGong_l1']").val(data.list[i].change[0].drillJiJiaGong_l1);
			$("input[name='drillJiJiaGong_l2']").val(data.list[i].change[0].drillJiJiaGong_l2);
			$("input[name='drillJiJiaGong_l3']").val(data.list[i].change[0].drillJiJiaGong_l3);
			$("input[name='drillJiJiaGong_l4']").val(data.list[i].change[0].drillJiJiaGong_l4);
			$("select[name='drillJiJiaGong_l5']").val(data.list[i].change[0].drillJiJiaGong_l5);
			$("input[name='drillJiJiaGong_l6']").val(data.list[i].change[0].drillJiJiaGong_l6);
			$("select[name='drillJiJiaGong_l7']").val(data.list[i].change[0].drillJiJiaGong_l7);
			$("select[name='drillJiJiaGong_l8']").val(data.list[i].change[0].drillJiJiaGong_l8);

			$("input[name='drillJiJiaGong_b1']").val(data.list[i].drillJiJiaGong_b1);
			if(data.list[i].change[0].length>1){
				for(var j=1;j<data.list[i].change[0].length;j++){
					$str='';
		    $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillJiJiaGong_l1" value="'+data.list[i].change[j].drillJiJiaGong_l1+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillJiJiaGong_l2" value="'+data.list[i].change[j].drillJiJiaGong_l2+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillJiJiaGong_l3" value="'+data.list[i].change[j].drillJiJiaGong_l3+'"/></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillJiJiaGong_l4" value="'+data.list[i].change[j].drillJiJiaGong_l4+'"/></td>';
					if (data.list[i].change[j].drillJiJiaGong_l5 == "符合") {
						$str+='<td align="center"><select name="drillJiJiaGong_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="drillJiJiaGong_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillJiJiaGong_l6" value="'+data.list[i].change[j].drillJiJiaGong_l6+'"/></td>';
					if (data.list[i].change[j].drillJiJiaGong_l7 == "符合") {
						$str+='<td align="center"><select name="drillJiJiaGong_l7"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="drillJiJiaGong_l7"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					if (data.list[i].change[j].drillJiJiaGong_l8 == "符合") {
						$str+='<td align="center"><select name="drillJiJiaGong_l8"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
					}else{
						$str+='<td align="center"><select name="drillJiJiaGong_l8"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
					}
					$str+='<td align="center"></td>';
			    $str+='</tr>';
			    $("#drill_jiJiaGong").before($str);
				}
			}
		}

			if(data.list[i].name == "drillNaiMo1"){//钻具 热处理
				$("input[name='drillNaiMo1_a1'][value='" + data.list[i].drillNaiMo1_a1 + "']").attr("checked",true); 
				$("input[name='drillNaiMo1_a2'][value='" + data.list[i].drillNaiMo1_a2 + "']").attr("checked",true);
				$("input[name='drillNaiMo1_a3']").val(data.list[i].drillNaiMo1_a3);
				$("input[name='drillNaiMo1_a4']").val(data.list[i].drillNaiMo1_a4)
				$("input[name='drillNaiMo1_l1']").val(data.list[i].change[0].drillNaiMo1_l1);
				$("select[name='drillNaiMo1_l2']").val(data.list[i].change[0].drillNaiMo1_l2);
				$("input[name='drillNaiMo1_l3']").val(data.list[i].change[0].drillNaiMo1_l3);
				$("input[name='drillNaiMo1_l4']").val(data.list[i].change[0].drillNaiMo1_l4);
				$("input[name='drillNaiMo1_l5']").val(data.list[i].change[0].drillNaiMo1_l5);
				$("input[name='drillNaiMo1_l6']").val(data.list[i].change[0].drillNaiMo1_l6);
				$("input[name='drillNaiMo1_l7']").val(data.list[i].change[0].drillNaiMo1_l7);
				$("input[name='drillNaiMo1_l8']").val(data.list[i].change[0].drillNaiMo1_l8);
				$("input[name='drillNaiMo1_l9']").val(data.list[i].change[0].drillNaiMo1_l9);
				$("input[name='drillNaiMo1_l10']").val(data.list[i].change[0].drillNaiMo1_l10);
				$("input[name='drillNaiMo1_b1']").val(data.list[i].drillNaiMo1_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
			    $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l1" value="'+data.list[i].change[j].drillNaiMo1_l1+'"/></td>';
						if (data.list[i].change[j].drillNaiMo1_l2 == "符合") {
							$str+='<td align="center"><select name="drillNaiMo1_l2"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="drillNaiMo1_l2"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l3" value="'+data.list[i].change[j].drillNaiMo1_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l4" value="'+data.list[i].change[j].drillNaiMo1_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l5" value="'+data.list[i].change[j].drillNaiMo1_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l6" value="'+data.list[i].change[j].drillNaiMo1_l6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l7" value="'+data.list[i].change[j].drillNaiMo1_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l8" value="'+data.list[i].change[j].drillNaiMo1_l8+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l9" value="'+data.list[i].change[j].drillNaiMo1_l9+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l10" value="'+data.list[i].change[j].drillNaiMo1_l10+'" /></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#drill_naiMo1").before($str);
					}
				}
			}

			if(data.list[i].name == "drillNeiTuCeng2"){//钻具  内涂层
				$("input[name='drillNeiTuCeng2_a1'][value='" + data.list[i].drillNeiTuCeng2_a1 + "']").attr("checked",true); 
				$("input[name='drillNeiTuCeng2_a2'][value='" + data.list[i].drillNeiTuCeng2_a2 + "']").attr("checked",true);
				$("input[name='drillNeiTuCeng2_l1']").val(data.list[i].change[0].drillNeiTuCeng2_l1);
				$("input[name='drillNeiTuCeng2_l2']").val(data.list[i].change[0].drillNeiTuCeng2_l2);
				$("input[name='drillNeiTuCeng2_l3']").val(data.list[i].change[0].drillNeiTuCeng2_l3);
				$("input[name='drillNeiTuCeng2_l4']").val(data.list[i].change[0].drillNeiTuCeng2_l4);
				$("input[name='drillNeiTuCeng2_l5']").val(data.list[i].change[0].drillNeiTuCeng2_l5);
				$("input[name='drillNeiTuCeng2_l6']").val(data.list[i].change[0].drillNeiTuCeng2_l6);
				$("input[name='drillNeiTuCeng2_b1']").val(data.list[i].drillNeiTuCeng2_b1);
				$("input[name='drillNeiTuCeng2_b2']").val(data.list[i].drillNeiTuCeng2_b2);
				$("input[name='drillNeiTuCeng2_b3']").val(data.list[i].drillNeiTuCeng2_b3);
				$("input[name='drillNeiTuCeng2_b4']").val(data.list[i].drillNeiTuCeng2_b4);
				$("input[name='drillNeiTuCeng2_b5']").val(data.list[i].drillNeiTuCeng2_b5);
				$("input[name='drillNeiTuCeng2_c1']").val(data.list[i].drillNeiTuCeng2_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l1" value="'+data.list[i].change[j].drillNeiTuCeng2_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l2" value="'+data.list[i].change[j].drillNeiTuCeng2_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l3" value="'+data.list[i].change[j].drillNeiTuCeng2_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l4" value="'+data.list[i].change[j].drillNeiTuCeng2_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l5" value="'+data.list[i].change[j].drillNeiTuCeng2_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l6" value="'+data.list[i].change[j].drillNeiTuCeng2_l6+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#drill_neiTuCeng2").before($str);
					}
				}
			}
			if(data.list[i].name == "drillNeiTuCengHouDu2"){//钻具 内涂层厚度测量
				$("input[name='drillNeiTuCengHouDu2_l1']").val(data.list[i].change[0].drillNeiTuCengHouDu2_l1);
				$("input[name='drillNeiTuCengHouDu2_l2']").val(data.list[i].change[0].drillNeiTuCengHouDu2_l2);
				$("input[name='drillNeiTuCengHouDu2_l3']").val(data.list[i].change[0].drillNeiTuCengHouDu2_l3);
				$("input[name='drillNeiTuCengHouDu2_l4']").val(data.list[i].change[0].drillNeiTuCengHouDu2_l4);
				$("input[name='drillNeiTuCengHouDu2_a1']").val(data.list[i].drillNeiTuCengHouDu2_a1);
				$("input[name='drillNeiTuCengHouDu2_a2']").val(data.list[i].drillNeiTuCengHouDu2_a2);
				$("input[name='drillNeiTuCengHouDu2_a3']").val(data.list[i].drillNeiTuCengHouDu2_a3);
				$("input[name='drillNeiTuCengHouDu2_b1']").val(data.list[i].drillNeiTuCengHouDu2_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu2_l1" value="'+data.list[i].change[j].drillNeiTuCengHouDu2_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu2_l2" value="'+data.list[i].change[j].drillNeiTuCengHouDu2_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu2_l3" value="'+data.list[i].change[j].drillNeiTuCengHouDu2_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu2_l4" value="'+data.list[i].change[j].drillNeiTuCengHouDu2_l4+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#drill_neiTuCengHouDu2").before($str);
					}
				}
			}
			if(data.list[i].name == "drillBaoZhuang2"){//
				$("input[name='drillBaoZhuang2_a1']").val(data.list[i].drillBaoZhuang2_a1);
				$("input[name='drillBaoZhuang2_a2'][value='" + data.list[i].drillBaoZhuang2_a2 + "']").attr("checked",true);
				$("input[name='drillBaoZhuang2_l1']").val(data.list[i].change[0].drillBaoZhuang2_l1);
				$("select[name='drillBaoZhuang2_l2']").val(data.list[i].change[0].drillBaoZhuang2_l2);
				$("select[name='drillBaoZhuang2_l3']").val(data.list[i].change[0].drillBaoZhuang2_l3);
				$("select[name='drillBaoZhuang2_l4']").val(data.list[i].change[0].drillBaoZhuang2_l4);
				$("select[name='drillBaoZhuang2_l5']").val(data.list[i].change[0].drillBaoZhuang2_l5);
				$("input[name='drillBaoZhuang2_l6']").val(data.list[i].change[0].drillBaoZhuang2_l6);
				$("input[name='drillBaoZhuang2_b1']").val(data.list[i].drillBaoZhuang2_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
		        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBaoZhuang2_l1" value="'+data.list[i].change[j].drillBaoZhuang2_l1+'"/></td>';
						if (data.list[i].change[j].drillBaoZhuang2_l2 == "符合") {
							$str+='<td align="center"><select name="drillBaoZhuang2_l2"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="drillBaoZhuang2_l2"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if (data.list[i].change[j].drillBaoZhuang2_l3 == "符合") {
							$str+='<td align="center"><select name="drillBaoZhuang2_l3"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="drillBaoZhuang2_l3"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if (data.list[i].change[j].drillBaoZhuang2_l4 == "符合") {
							$str+='<td align="center"><select name="drillBaoZhuang2_l4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="drillBaoZhuang2_l4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if (data.list[i].change[j].drillBaoZhuang2_l5 == "符合") {
							$str+='<td align="center"><select name="drillBaoZhuang2_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="drillBaoZhuang2_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBaoZhuang2_l6" value="'+data.list[i].change[j].drillBaoZhuang2_l6+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#drill_baoZhuang2").before($str);
					}
				}
			}

			if(data.list[i].name == "faMenQiTa"){//其他
				$("input[name='faMenQiTa_a1'").val(data.list[i].faMenQiTa_a1);
				$("input[name='faMenQiTa_a2'").val(data.list[i].faMenQiTa_a2);
				$("input[name='faMenQiTa_b1'").val(data.list[i].faMenQiTa_b1);
				$("input[name='faMenQiTa_b2'").val(data.list[i].faMenQiTa_b2);
				$("input[name='faMenQiTa_b3'").val(data.list[i].faMenQiTa_b3);
				$("input[name='faMenQiTa_c1'").val(data.list[i].faMenQiTa_c1);
				$("input[name='faMenQiTa_c2'").val(data.list[i].faMenQiTa_c2);
				$("input[name='faMenQiTa_c3'").val(data.list[i].faMenQiTa_c3);
				$("input[name='faMenQiTa_c4'").val(data.list[i].faMenQiTa_c4);
				$("input[name='faMenQiTa_d1'").val(data.list[i].faMenQiTa_d1);
				$("input[name='faMenQiTa_f1'").val(data.list[i].faMenQiTa_f1);
				$("input[name='faMenQiTa_l1'").val(data.list[i].change[0].faMenQiTa_l1);
				$("input[name='faMenQiTa_l2'").val(data.list[i].change[0].faMenQiTa_l2);
				$("input[name='faMenQiTa_l3'").val(data.list[i].change[0].faMenQiTa_l3);
				$("input[name='faMenQiTa_l4'").val(data.list[i].change[0].faMenQiTa_l4);
				$("input[name='faMenQiTa_l5'").val(data.list[i].change[0].faMenQiTa_l5);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
					    $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="faMenQiTa_l1" value="'+data.list[i].change[j].faMenQiTa_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="faMenQiTa_l2" value="'+data.list[i].change[j].faMenQiTa_l2+'"/></td>';
						$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="faMenQiTa_l3" value="'+data.list[i].change[j].faMenQiTa_l3+'"/></td>';
						$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="faMenQiTa_l4" value="'+data.list[i].change[j].faMenQiTa_l4+'"/></td>';
						$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="faMenQiTa_l5" value="'+data.list[i].change[j].faMenQiTa_l5+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#faMenQiTa").before($str);
					}
				}
			}
			if(data.list[i].name == "faMenHanJie"){//焊接
				$("input[name='faMenHanJie_a1'][value='" + data.list[i].faMenHanJie_a1 + "']").attr("checked",true); 
				$("input[name='faMenHanJie_a2'][value='" + data.list[i].faMenHanJie_a2 + "']").attr("checked",true);
				$("input[name='faMenHanJie_a3'][value='" + data.list[i].faMenHanJie_a3 + "']").attr("checked",true);
				$("input[name='faMenHanJie_a4'][value='" + data.list[i].faMenHanJie_a4 + "']").attr("checked",true);
				$("input[name='faMenHanJie_b1']").val(data.list[i].faMenHanJie_b1);
				$("input[name='faMenHanJie_l1']").val(data.list[i].change[0].faMenHanJie_l1);
				$("input[name='faMenHanJie_l2']").val(data.list[i].change[0].faMenHanJie_l2);
				$("input[name='faMenHanJie_l3']").val(data.list[i].change[0].faMenHanJie_l3);
				$("input[name='faMenHanJie_l4']").val(data.list[i].change[0].faMenHanJie_l4);
				$("input[name='faMenHanJie_l5']").val(data.list[i].change[0].faMenHanJie_l5);
				$("select[name='faMenHanJie_l6']").val(data.list[i].change[0].faMenHanJie_l6);
				$("input[name='faMenHanJie_l7']").val(data.list[i].change[0].faMenHanJie_l7);
				$("input[name='faMenHanJie_l8']").val(data.list[i].change[0].faMenHanJie_l8);
				$("input[name='faMenHanJie_l9']").val(data.list[i].change[0].faMenHanJie_l9);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						 $str='';
					        $str+='<tr>';
					        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l1" value="'+data.list[i].change[j].faMenHanJie_l1+'"/></td>';
					        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l2" value="'+data.list[i].change[j].faMenHanJie_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l3" value="'+data.list[i].change[j].faMenHanJie_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l4" value="'+data.list[i].change[j].faMenHanJie_l4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l5" value="'+data.list[i].change[j].faMenHanJie_l5+'"/></td>';
							if(data.list[i].change[j].faMenHanJie_l6=="符合"){
								$str+='<td align="center"><select name="faMenHanJie_l6"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}
							else{
								$str+='<td align="center"><select name="faMenHanJie_l6"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l7" value="'+data.list[i].change[j].faMenHanJie_l7+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l8" value="'+data.list[i].change[j].faMenHanJie_l8+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l9" value="'+data.list[i].change[j].faMenHanJie_l9+'"/></td>';
						    $str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#faMenHanJie").before($str);
					}
				}
			}

			if(data.list[i].name == "faMenSheXianGuoCheng"){		//设备 射线检测过程
				$("input[name='faMenSheXianGuoCheng_b1']").val(data.list[i].faMenSheXianGuoCheng_b1);
				$("input[name='faMenSheXianGuoCheng_a1'][value='" + data.list[i].faMenSheXianGuoCheng_a1 + "']").attr("checked",true); 
				$("input[name='faMenSheXianGuoCheng_a2'][value='" + data.list[i].faMenSheXianGuoCheng_a2 + "']").attr("checked",true);
				$("input[name='faMenSheXianGuoCheng_a3'][value='" + data.list[i].faMenSheXianGuoCheng_a3 + "']").attr("checked",true); 
				$("input[name='faMenSheXianGuoCheng_a4'][value='" + data.list[i].faMenSheXianGuoCheng_a4 + "']").attr("checked",true);

				$("input[name='faMenSheXianGuoCheng_l1']").val(data.list[i].change[0].faMenSheXianGuoCheng_l1);
				$("input[name='faMenSheXianGuoCheng_l2']").val(data.list[i].change[0].faMenSheXianGuoCheng_l2);
				$("input[name='faMenSheXianGuoCheng_l3']").val(data.list[i].change[0].faMenSheXianGuoCheng_l3);
				$("input[name='faMenSheXianGuoCheng_l4']").val(data.list[i].change[0].faMenSheXianGuoCheng_l4);
				$("select[name='faMenSheXianGuoCheng_l5']").val(data.list[i].change[0].faMenSheXianGuoCheng_l5);
				$("input[name='faMenSheXianGuoCheng_l6']").val(data.list[i].change[0].faMenSheXianGuoCheng_l6);
				$("select[name='faMenSheXianGuoCheng_l7']").val(data.list[i].change[0].faMenSheXianGuoCheng_l7);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
			    $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianGuoCheng_l1" value="'+data.list[i].change[j].faMenSheXianGuoCheng_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianGuoCheng_l2" value="'+data.list[i].change[j].faMenSheXianGuoCheng_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianGuoCheng_l3" value="'+data.list[i].change[j].faMenSheXianGuoCheng_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianGuoCheng_l4" value="'+data.list[i].change[j].faMenSheXianGuoCheng_l4+'"/></td>';
						if (data.list[i].change[j].faMenSheXianGuoCheng_l5 == "符合") {
							$str+='<td align="center"><select name="faMenSheXianGuoCheng_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="faMenSheXianGuoCheng_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianGuoCheng_l6" value="'+data.list[i].change[j].faMenSheXianGuoCheng_l6+'"/></td>';
						if (data.list[i].change[j].faMenSheXianGuoCheng_l7 == "符合") {
							$str+='<td align="center"><select name="faMenSheXianGuoCheng_l7"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="faMenSheXianGuoCheng_l7"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#faMen_sheXianGuoCheng").before($str);
					}
				}
			}

			if(data.list[i].name == "faMenSheXianDiPian"){//
				$("input[name='faMenSheXianDiPian_a1'][value='" + data.list[i].faMenSheXianDiPian_a1 + "']").attr("checked",true); 
				$("input[name='faMenSheXianDiPian_a2'][value='" + data.list[i].faMenSheXianDiPian_a2 + "']").attr("checked",true);
				$("input[name='faMenSheXianDiPian_a3'][value='" + data.list[i].faMenSheXianDiPian_a3 + "']").attr("checked",true);
				$("input[name='faMenSheXianDiPian_a4'][value='" + data.list[i].faMenSheXianDiPian_a4 + "']").attr("checked",true);
				$("input[name='faMenSheXianDiPian_b1']").val(data.list[i].faMenSheXianDiPian_b1);
				$("input[name='faMenSheXianDiPian_l1']").val(data.list[i].change[0].faMenSheXianDiPian_l1);
				$("input[name='faMenSheXianDiPian_l2']").val(data.list[i].change[0].faMenSheXianDiPian_l2);
				$("input[name='faMenSheXianDiPian_l3']").val(data.list[i].change[0].faMenSheXianDiPian_l3);
				$("input[name='faMenSheXianDiPian_l4']").val(data.list[i].change[0].faMenSheXianDiPian_l4);
				$("input[name='faMenSheXianDiPian_l5']").val(data.list[i].change[0].faMenSheXianDiPian_l5);
				$("input[name='faMenSheXianDiPian_l6']").val(data.list[i].change[0].faMenSheXianDiPian_l6);
				$("input[name='faMenSheXianDiPian_l7']").val(data.list[i].change[0].faMenSheXianDiPian_l7);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
							$str='';
					        $str+='<tr>';
					        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l1"  value="'+data.list[i].change[j].faMenSheXianDiPian_l1+'"/></td>';
					        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l2"  value="'+data.list[i].change[j].faMenSheXianDiPian_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l3"  value="'+data.list[i].change[j].faMenSheXianDiPian_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l4"  value="'+data.list[i].change[j].faMenSheXianDiPian_l4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l5"  value="'+data.list[i].change[j].faMenSheXianDiPian_l5+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l6"  value="'+data.list[i].change[j].faMenSheXianDiPian_l6+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l7"  value="'+data.list[i].change[j].faMenSheXianDiPian_l7+'"/></td>';
						    $str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#faMenSheXianDiPian").before($str);
					}
				}
			}

			if(data.list[i].name == "faMenChaoShengBo"){
				$("input[name='faMenChaoShengBo_a1'][value='" + data.list[i].faMenChaoShengBo_a1 + "']").attr("checked",true); 
				$("input[name='faMenChaoShengBo_a2'][value='" + data.list[i].faMenChaoShengBo_a2 + "']").attr("checked",true);
				$("input[name='faMenChaoShengBo_a3'][value='" + data.list[i].faMenChaoShengBo_a3 + "']").attr("checked",true);
				$("input[name='faMenChaoShengBo_a4'][value='" + data.list[i].faMenChaoShengBo_a4 + "']").attr("checked",true);
				$("input[name='faMenChaoShengBo_b1'][value='" + data.list[i].faMenChaoShengBo_b1 + "']").attr("checked",true);
				
				$("input[name='faMenChaoShengBo_l1']").val(data.list[i].change[0].faMenChaoShengBo_l1);
				$("input[name='faMenChaoShengBo_l2']").val(data.list[i].change[0].faMenChaoShengBo_l2);
				$("input[name='faMenChaoShengBo_l3']").val(data.list[i].change[0].faMenChaoShengBo_l3);
				$("input[name='faMenChaoShengBo_l4']").val(data.list[i].change[0].faMenChaoShengBo_l4);
				$("input[name='faMenChaoShengBo_l5']").val(data.list[i].change[0].faMenChaoShengBo_l5);
				
				$("input[name='faMenChaoShengBo_ll1']").val(data.list[i].change2[0].faMenChaoShengBo_ll1);
				$("input[name='faMenChaoShengBo_ll2']").val(data.list[i].change2[0].faMenChaoShengBo_ll2);
				$("input[name='faMenChaoShengBo_ll3']").val(data.list[i].change2[0].faMenChaoShengBo_ll3);
				$("select[name='faMenChaoShengBo_ll4']").val(data.list[i].change2[0].faMenChaoShengBo_ll4);
				$("select[name='faMenChaoShengBo_ll5']").val(data.list[i].change2[0].faMenChaoShengBo_ll5);
				$("input[name='faMenChaoShengBo_ll6']").val(data.list[i].change2[0].faMenChaoShengBo_ll6);
				$("input[name='faMenChaoShengBo_ll7']").val(data.list[i].change2[0].faMenChaoShengBo_ll7);
				$("input[name='faMenChaoShengBo_c1']").val(data.list[i].faMenChaoShengBo_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						 $str='';
					        $str+='<tr>';
					        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_l1" value="'+data.list[i].change[j].faMenChaoShengBo_l1+'"/></td>';
					        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_l2" value="'+data.list[i].change[j].faMenChaoShengBo_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_l3" value="'+data.list[i].change[j].faMenChaoShengBo_l3+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenChaoShengBo_l4" value="'+data.list[i].change[j].faMenChaoShengBo_l4+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenChaoShengBo_l5" value="'+data.list[i].change[j].faMenChaoShengBo_l5+'"/></td>';
						    $str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#faMenChaoShengBo1").before($str);
					}
				}
				if (data.list[i].change2[0].length>1) {
					for(var j=1;j<data.list[i].change2[0].length;j++){
						  $str='';
					        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_ll1" value="'+data.list[i].change2[j].faMenChaoShengBo_ll1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_ll2" value="'+data.list[i].change2[j].faMenChaoShengBo_ll2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_ll3" value="'+data.list[i].change2[j].faMenChaoShengBo_ll3+'"/></td>';
							if(data.list[i].change2[j].faMenChaoShengBo_ll4=="符合"){
								$str+='<td align="center"><select name="faMenChaoShengBo_ll4" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="faMenChaoShengBo_ll4" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							if(data.list[i].change2[j].faMenChaoShengBo_ll5=="符合"){
								$str+='<td align="center"><select name="faMenChaoShengBo_ll5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="faMenChaoShengBo_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_ll6" value="'+data.list[i].change2[j].faMenChaoShengBo_ll6+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_ll7" value="'+data.list[i].change2[j].faMenChaoShengBo_ll7+'"/></td>';
							$str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#faMenChaoShengBo2").before($str);
					}
				}
			}

			if(data.list[i].name == "faMenCiFenJianCe"){//阀门 磁粉检测
				$("input[name='faMenCiFenJianCe_a1'][value='" + data.list[i].faMenCiFenJianCe_a1 + "']").attr("checked",true); 
				$("input[name='faMenCiFenJianCe_a2'][value='" + data.list[i].faMenCiFenJianCe_a2 + "']").attr("checked",true);
				$("input[name='faMenCiFenJianCe_a3'][value='" + data.list[i].faMenCiFenJianCe_a3 + "']").attr("checked",true);
				$("input[name='faMenCiFenJianCe_a4'][value='" + data.list[i].faMenCiFenJianCe_a4 + "']").attr("checked",true);
				$("input[name='faMenCiFenJianCe_b1'][value='" + data.list[i].faMenCiFenJianCe_b1 + "']").attr("checked",true);
				
				$("input[name='faMenCiFenJianCe_l1']").val(data.list[i].change[0].faMenCiFenJianCe_l1);
				$("input[name='faMenCiFenJianCe_l2']").val(data.list[i].change[0].faMenCiFenJianCe_l2);
				$("input[name='faMenCiFenJianCe_l3']").val(data.list[i].change[0].faMenCiFenJianCe_l3);
				$("input[name='faMenCiFenJianCe_l4']").val(data.list[i].change[0].faMenCiFenJianCe_l4);
				$("input[name='faMenCiFenJianCe_l5']").val(data.list[i].change[0].faMenCiFenJianCe_l5);
				
				$("input[name='faMenCiFenJianCe_ll1']").val(data.list[i].change2[0].faMenCiFenJianCe_ll1);
				$("input[name='faMenCiFenJianCe_ll2']").val(data.list[i].change2[0].faMenCiFenJianCe_ll2);
				$("input[name='faMenCiFenJianCe_ll3']").val(data.list[i].change2[0].faMenCiFenJianCe_ll3);
				$("input[name='faMenCiFenJianCe_ll4']").val(data.list[i].change2[0].faMenCiFenJianCe_ll4);
				$("select[name='faMenCiFenJianCe_ll5']").val(data.list[i].change2[0].faMenCiFenJianCe_ll5);
				$("select[name='faMenCiFenJianCe_ll6']").val(data.list[i].change2[0].faMenCiFenJianCe_ll6);
				$("input[name='faMenCiFenJianCe_ll7']").val(data.list[i].change2[0].faMenCiFenJianCe_ll7);
				$("input[name='faMenCiFenJianCe_c1']").val(data.list[i].faMenCiFenJianCe_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						 $str='';
					        $str+='<tr>';
					        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_l1" value="'+data.list[i].change[j].faMenCiFenJianCe_l1+'"/></td>';
					        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_l2" value="'+data.list[i].change[j].faMenCiFenJianCe_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_l3" value="'+data.list[i].change[j].faMenCiFenJianCe_l3+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenCiFenJianCe_l4" value="'+data.list[i].change[j].faMenCiFenJianCe_l4+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenCiFenJianCe_l5" value="'+data.list[i].change[j].faMenCiFenJianCe_l5+'"/></td>';
						    $str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#faMenCiFenJianCe1").before($str);
					}
				}
				if(data.list[i].change2[0].length>1){
					for(var j=1;j<data.list[i].change2[0].length;j++){
						 $str='';
					        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_ll1" value="'+data.list[i].change2[j].faMenCiFenJianCe_ll1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_ll2" value="'+data.list[i].change2[j].faMenCiFenJianCe_ll5+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_ll3" value="'+data.list[i].change2[j].faMenCiFenJianCe_ll3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_ll4" value="'+data.list[i].change2[j].faMenCiFenJianCe_ll4+'"/></td>';
							if(data.list[i].change2[j].faMenCiFenJianCe_ll5=="符合"){
								$str+='<td align="center"><select name="faMenCiFenJianCe_ll5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="faMenCiFenJianCe_ll5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							if(data.list[i].change2[j].faMenCiFenJianCe_ll6=="符合"){
								$str+='<td align="center"><select name="faMenCiFenJianCe_ll6" ><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="faMenCiFenJianCe_ll6" ><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_ll7" value="'+data.list[i].change2[j].faMenCiFenJianCe_ll7+'"/></td>';
							$str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#faMenCiFenJianCe2").before($str);
					}
				}
			}

			if(data.list[i].name == "faMenShenTouJianCe"){//阀门 渗透检测
				$("input[name='faMenShenTouJianCe_a1'][value='" + data.list[i].faMenShenTouJianCe_a1 + "']").attr("checked",true); 
				$("input[name='faMenShenTouJianCe_a2'][value='" + data.list[i].faMenShenTouJianCe_a2 + "']").attr("checked",true);
				$("input[name='faMenShenTouJianCe_a3'][value='" + data.list[i].faMenShenTouJianCe_a3 + "']").attr("checked",true);
				$("input[name='faMenShenTouJianCe_b1'][value='" + data.list[i].faMenShenTouJianCe_b1 + "']").attr("checked",true);
				
				$("input[name='faMenShenTouJianCe_l1']").val(data.list[i].change[0].faMenShenTouJianCe_l1);
				$("input[name='faMenShenTouJianCe_l2']").val(data.list[i].change[0].faMenShenTouJianCe_l2);
				$("input[name='faMenShenTouJianCe_l3']").val(data.list[i].change[0].faMenShenTouJianCe_l3);
				$("input[name='faMenShenTouJianCe_l4']").val(data.list[i].change[0].faMenShenTouJianCe_l4);
				
				$("input[name='faMenShenTouJianCe_ll1']").val(data.list[i].change2[0].faMenShenTouJianCe_ll1);
				$("input[name='faMenShenTouJianCe_ll2']").val(data.list[i].change2[0].faMenShenTouJianCe_ll2);
				$("input[name='faMenShenTouJianCe_ll3']").val(data.list[i].change2[0].faMenShenTouJianCe_ll3);
				$("input[name='faMenShenTouJianCe_ll4']").val(data.list[i].change2[0].faMenShenTouJianCe_ll4);
				$("input[name='faMenShenTouJianCe_ll5']").val(data.list[i].change2[0].faMenShenTouJianCe_ll5);
				$("input[name='faMenShenTouJianCe_ll6']").val(data.list[i].change2[0].faMenShenTouJianCe_ll6);
				$("input[name='faMenShenTouJianCe_ll7']").val(data.list[i].change2[0].faMenShenTouJianCe_ll7);
				$("input[name='faMenShenTouJianCe_ll8']").val(data.list[i].change2[0].faMenShenTouJianCe_ll8);
				$("input[name='faMenShenTouJianCe_c1']").val(data.list[i].faMenShenTouJianCe_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						  $str='';
					        $str+='<tr>';
					        $str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenShenTouJianCe_l1" value="'+data.list[i].change[j].faMenShenTouJianCe_l1+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenShenTouJianCe_l2" value="'+data.list[i].change[j].faMenShenTouJianCe_l2+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenShenTouJianCe_l3" value="'+data.list[i].change[j].faMenShenTouJianCe_l3+'"/></td>';
							$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenShenTouJianCe_l4" value="'+data.list[i].change[j].faMenShenTouJianCe_l4+'"/></td>';
						    $str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#faMenShenTouJianCe1").before($str);
					}
				}
				if(data.list[i].change2[0].length>1){
					for(var j=1;j<data.list[i].change2[0].length;j++){
						 $str='';
					        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll1" value="'+data.list[i].change2[j].faMenShenTouJianCe_ll1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll2" value="'+data.list[i].change2[j].faMenShenTouJianCe_ll2+'" /></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll3" value="'+data.list[i].change2[j].faMenShenTouJianCe_ll3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll4" value="'+data.list[i].change2[j].faMenShenTouJianCe_ll4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll5" value="'+data.list[i].change2[j].faMenShenTouJianCe_ll5+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll6" value="'+data.list[i].change2[j].faMenShenTouJianCe_ll6+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll7" value="'+data.list[i].change2[j].faMenShenTouJianCe_ll7+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll8" value="'+data.list[i].change2[j].faMenShenTouJianCe_ll8+'"/></td>';
							$str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#faMenShenTouJianCe2").before($str);
					}
				}
			}

			if(data.list[i].name == "faMenZuZhuang"){//阀门组装
				$("input[name='faMenZuZhuang_a1'][value='" + data.list[i].faMenZuZhuang_a1 + "']").attr("checked",true); 
				$("input[name='faMenZuZhuang_a2'][value='" + data.list[i].faMenZuZhuang_a2 + "']").attr("checked",true);
				
				$("input[name='faMenZuZhuang_l1']").val(data.list[i].change[0].faMenZuZhuang_l1);
				$("input[name='faMenZuZhuang_l2']").val(data.list[i].change[0].faMenZuZhuang_l2);
				$("input[name='faMenZuZhuang_l3']").val(data.list[i].change[0].faMenZuZhuang_l3);
				$("select[name='faMenZuZhuang_l4']").val(data.list[i].change[0].faMenZuZhuang_l4);
				$("select[name='faMenZuZhuang_l5']").val(data.list[i].change[0].faMenZuZhuang_l5);
				$("input[name='faMenZuZhuang_l6']").val(data.list[i].change[0].faMenZuZhuang_l6);
				$("input[name='faMenZuZhuang_b1']").val(data.list[i].faMenZuZhuang_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenZuZhuang_l1" value="'+data.list[i].change[j].faMenZuZhuang_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenZuZhuang_l2" value="'+data.list[i].change[j].faMenZuZhuang_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenZuZhuang_l3" value="'+data.list[i].change[j].faMenZuZhuang_l3+'"/></td>';
						if(data.list[i].change[j].faMenZuZhuang_l4=="符合"){
							$str+='<td align="center"><select name="faMenZuZhuang_l4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="faMenZuZhuang_l4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].faMenZuZhuang_l5=="符合"){
							$str+='<td align="center"><select name="faMenZuZhuang_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';							
						}else{
							$str+='<td align="center"><select name="faMenZuZhuang_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenZuZhuang_l6" value="'+data.list[i].change[j].faMenZuZhuang_l6+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#faMenZuZhuang").before($str);
					}
				}
			}

			if(data.list[i].name == "faMenChuXiuYouQi"){//除锈油漆
				$("input[name='faMenChuXiuYouQi_a1'][value='" + data.list[i].faMenChuXiuYouQi_a1 + "']").attr("checked",true); 
				$("input[name='faMenChuXiuYouQi_a2'][value='" + data.list[i].faMenChuXiuYouQi_a2 + "']").attr("checked",true);
				
				$("input[name='faMenChuXiuYouQi_l1']").val(data.list[i].change[0].faMenChuXiuYouQi_l1);
				$("input[name='faMenChuXiuYouQi_l2']").val(data.list[i].change[0].faMenChuXiuYouQi_l2);
				$("input[name='faMenChuXiuYouQi_l3']").val(data.list[i].change[0].faMenChuXiuYouQi_l3);
				$("input[name='faMenChuXiuYouQi_l4']").val(data.list[i].change[0].faMenChuXiuYouQi_l4);
				$("select[name='faMenChuXiuYouQi_l5']").val(data.list[i].change[0].faMenChuXiuYouQi_l5);
				$("input[name='faMenChuXiuYouQi_l6']").val(data.list[i].change[0].faMenChuXiuYouQi_l6);
				$("input[name='faMenChuXiuYouQi_l7']").val(data.list[i].change[0].faMenChuXiuYouQi_l7);
				$("input[name='faMenChuXiuYouQi_b1']").val(data.list[i].faMenChuXiuYouQi_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						 $str='';
					        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l1" value="'+data.list[i].change[j].faMenChuXiuYouQi_l1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l2" value="'+data.list[i].change[j].faMenChuXiuYouQi_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l3" value="'+data.list[i].change[j].faMenChuXiuYouQi_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l4" value="'+data.list[i].change[j].faMenChuXiuYouQi_l4+'"/></td>';
							if(data.list[i].change[j].faMenChuXiuYouQi_l5=="符合"){
								$str+='<td align="center"><select name="faMenChuXiuYouQi_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="faMenChuXiuYouQi_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l6" value="'+data.list[i].change[j].faMenChuXiuYouQi_l6+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l7" value="'+data.list[i].change[j].faMenChuXiuYouQi_l7+'"/></td>';
							$str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#faMenChuXiuYouQi").before($str);
					}
				}
			}

			if(data.list[i].name == "faMenBaoZhuangFaYun"){//包装发运
				$("input[name='faMenBaoZhuangFaYun_a1']").val(data.list[i].faMenBaoZhuangFaYun_a1);
				$("input[name='faMenBaoZhuangFaYun_a2']").val(data.list[i].faMenBaoZhuangFaYun_a2);
				$("input[name='faMenBaoZhuangFaYun_a3'][value='" + data.list[i].faMenBaoZhuangFaYun_a3 + "']").attr("checked",true); 
				$("input[name='faMenBaoZhuangFaYun_a4'][value='" + data.list[i].faMenBaoZhuangFaYun_a4 + "']").attr("checked",true);
				$("input[name='faMenBaoZhuangFaYun_a5'][value='" + data.list[i].faMenBaoZhuangFaYun_a5 + "']").attr("checked",true); 
				$("input[name='faMenBaoZhuangFaYun_a6'][value='" + data.list[i].faMenBaoZhuangFaYun_a6 + "']").attr("checked",true);
				$("input[name='faMenBaoZhuangFaYun_a7'][value='" + data.list[i].faMenBaoZhuangFaYun_a7 + "']").attr("checked",true);
				$("input[name='faMenBaoZhuangFaYun_l1']").val(data.list[i].change[0].faMenBaoZhuangFaYun_l1);
				$("input[name='faMenBaoZhuangFaYun_l2']").val(data.list[i].change[0].faMenBaoZhuangFaYun_l2);
				$("input[name='faMenBaoZhuangFaYun_l3']").val(data.list[i].change[0].faMenBaoZhuangFaYun_l3);
				$("select[name='faMenBaoZhuangFaYun_l4']").val(data.list[i].change[0].faMenBaoZhuangFaYun_l4);
				$("select[name='faMenBaoZhuangFaYun_l5']").val(data.list[i].change[0].faMenBaoZhuangFaYun_l5);
				$("input[name='faMenBaoZhuangFaYun_b1']").val(data.list[i].faMenBaoZhuangFaYun_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenBaoZhuangFaYun_l1" value="'+data.list[i].change[j].faMenBaoZhuangFaYun_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenBaoZhuangFaYun_l2" value="'+data.list[i].change[j].faMenBaoZhuangFaYun_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenBaoZhuangFaYun_l3" value="'+data.list[i].change[j].faMenBaoZhuangFaYun_l3+'"/></td>';
						if(data.list[i].change[j].faMenBaoZhuangFaYun_l4 =="符合"){
							$str+='<td align="center"><select name="faMenBaoZhuangFaYun_l4"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="faMenBaoZhuangFaYun_l4"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						if(data.list[i].change[j].faMenBaoZhuangFaYun_l5 =="符合"){
							$str+='<td align="center"><select name="faMenBaoZhuangFaYun_l5"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
						}else{
							$str+='<td align="center"><select name="faMenBaoZhuangFaYun_l5"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
						}
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#faMenBaoZhuangFaYun").before($str);
					}
				}
			}

			if(data.list[i].name == "faMenYaLiShiYan"){//压力试验
				$("input[name='faMenYaLiShiYan_a1'][value=' " + data.list[i].faMenYaLiShiYan_a1 + "']").attr("checked",true); 
				$("input[name='faMenYaLiShiYan_a2'][value=' " + data.list[i].faMenYaLiShiYan_a2 + "']").attr("checked",true);
				$("input[name='faMenYaLiShiYan_a3'][value=' " + data.list[i].faMenYaLiShiYan_a3 + "']").attr("checked",true); 
				$("input[name='faMenYaLiShiYan_a4'][value=' " + data.list[i].faMenYaLiShiYan_a4 + "']").attr("checked",true);
				$("input[name='faMenYaLiShiYan_b1']").val(data.list[i].faMenYaLiShiYan_b1);
				$("input[name='faMenYaLiShiYan_b2']").val(data.list[i].faMenYaLiShiYan_b2);
				$("input[name='faMenYaLiShiYan_b3']").val(data.list[i].faMenYaLiShiYan_b3);
				$("input[name='faMenYaLiShiYan_b4']").val(data.list[i].faMenYaLiShiYan_b4);
				
				$("input[name='faMenYaLiShiYan_l1']").val(data.list[i].change[0].faMenYaLiShiYan_l1);
				$("input[name='faMenYaLiShiYan_l2']").val(data.list[i].change[0].faMenYaLiShiYan_l2);
				$("input[name='faMenYaLiShiYan_l3']").val(data.list[i].change[0].faMenYaLiShiYan_l3);
				$("input[name='faMenYaLiShiYan_l4']").val(data.list[i].change[0].faMenYaLiShiYan_l4);
				$("input[name='faMenYaLiShiYan_l5']").val(data.list[i].change[0].faMenYaLiShiYan_l5);
				$("input[name='faMenYaLiShiYan_l6']").val(data.list[i].change[0].faMenYaLiShiYan_l6);
				$("input[name='faMenYaLiShiYan_l7']").val(data.list[i].change[0].faMenYaLiShiYan_l7);
				$("input[name='faMenYaLiShiYan_l8']").val(data.list[i].change[0].faMenYaLiShiYan_l8);
				$("input[name='faMenYaLiShiYan_l9']").val(data.list[i].change[0].faMenYaLiShiYan_l9);
				$("input[name='faMenYaLiShiYan_l10']").val(data.list[i].change[0].faMenYaLiShiYan_l10);
				$("input[name='faMenYaLiShiYan_l11']").val(data.list[i].change[0].faMenYaLiShiYan_l11);
				$("select[name='faMenYaLiShiYan_l12']").val(data.list[i].change[0].faMenYaLiShiYan_l12);
				$("input[name='faMenYaLiShiYan_l13']").val(data.list[i].change[0].faMenYaLiShiYan_l13);
				$("input[name='faMenYaLiShiYan_l14']").val(data.list[i].change[0].faMenYaLiShiYan_l14);
				$("input[name='faMenYaLiShiYan_c1']").val(data.list[i].faMenYaLiShiYan_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
							$str='';
					        $str+='<tr>';
							$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenYaLiShiYan_l1" value="'+data.list[i].change[j].faMenYaLiShiYan_l1+'"/></td>';
							$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenYaLiShiYan_l2" value="'+data.list[i].change[j].faMenYaLiShiYan_l2+'"/></td>';
							$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenYaLiShiYan_l3" value="'+data.list[i].change[j].faMenYaLiShiYan_l3+'"/></td>';
							$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l4" value="'+data.list[i].change[j].faMenYaLiShiYan_l4+'"/></td>';
							$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l5" value="'+data.list[i].change[j].faMenYaLiShiYan_l5+'"/></td>';
							$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l6" value="'+data.list[i].change[j].faMenYaLiShiYan_l6+'"/></td>';
							$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l7" value="'+data.list[i].change[j].faMenYaLiShiYan_l7+'"/></td>';
							$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l8" value="'+data.list[i].change[j].faMenYaLiShiYan_l8+'"/></td>';
							$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l9" value="'+data.list[i].change[j].faMenYaLiShiYan_l9+'"/></td>';
							$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l10" value="'+data.list[i].change[j].faMenYaLiShiYan_l10+'"/></td>';
							$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l11" value="'+data.list[i].change[j].faMenYaLiShiYan_l11+'"/></td>';
							if(data.list[i].change[j].faMenYaLiShiYan_l12 =="符合"){
								$str+='<td align="center"><select name="faMenYaLiShiYan_l12"><option value="符合" selected>符合</option><option value="不符合">不符合</option></select></td>';
							}else{
								$str+='<td align="center"><select name="faMenYaLiShiYan_l12"><option value="符合">符合</option><option value="不符合" selected>不符合</option></select></td>';
							}
							$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenYaLiShiYan_l13" value="'+data.list[i].change[j].faMenYaLiShiYan_l13+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenYaLiShiYan_l14" value="'+data.list[i].change[j].faMenYaLiShiYan_l14+'"/></td>';
							$str+='<td align="center"></td>';
						    $str+='</tr>';
						    $("#faMenYaLiShiYan").before($str);	
					}
				}
			}

			if(data.list[i].name == "faMenHuaXue"){//化学成分
				$("input[name='faMenHuaXue_a1'][value='" + data.list[i].faMenHuaXue_a1 + "']").attr("checked",true); 
				$("input[name='faMenHuaXue_a2'][value='" + data.list[i].faMenHuaXue_a2 + "']").attr("checked",true);
				$("input[name='faMenHuaXue_b1']").val(data.list[i].faMenHuaXue_b1);
				$("input[name='faMenHuaXue_b2']").val(data.list[i].faMenHuaXue_b2);
				$("input[name='faMenHuaXue_b3']").val(data.list[i].faMenHuaXue_b3);
				$("input[name='faMenHuaXue_b4']").val(data.list[i].faMenHuaXue_b4);
				$("input[name='faMenHuaXue_c1']").val(data.list[i].faMenHuaXue_c1);
				$("input[name='faMenHuaXue_c2']").val(data.list[i].faMenHuaXue_c2);
				$("input[name='faMenHuaXue_c3']").val(data.list[i].faMenHuaXue_c3);
				$("input[name='faMenHuaXue_c4']").val(data.list[i].faMenHuaXue_c4);
				$("input[name='faMenHuaXue_d1']").val(data.list[i].faMenHuaXue_d1);
				$("input[name='faMenHuaXue_d2']").val(data.list[i].faMenHuaXue_d2);
				$("input[name='faMenHuaXue_d3']").val(data.list[i].faMenHuaXue_d3);
				$("input[name='faMenHuaXue_d4']").val(data.list[i].faMenHuaXue_d4);
				$("input[name='faMenHuaXue_e1']").val(data.list[i].faMenHuaXue_e1);
			}

			if(data.list[i].name == "faMenLaShenXingNeng"){//阀门 拉伸性能
				$("input[name='faMenLaShenXingNeng_a1'][value='" + data.list[i].faMenLaShenXingNeng_a1 + "']").attr("checked",true); 
				$("input[name='faMenLaShenXingNeng_a2'][value='" + data.list[i].faMenLaShenXingNeng_a2 + "']").attr("checked",true);
				$("input[name='faMenLaShenXingNeng_a3'][value='" + data.list[i].faMenLaShenXingNeng_a3 + "']").attr("checked",true); 
				$("input[name='faMenLaShenXingNeng_a4'][value='" + data.list[i].faMenLaShenXingNeng_a4 + "']").attr("checked",true);
				$("input[name='faMenLaShenXingNeng_l1']").val(data.list[i].change[0].faMenLaShenXingNeng_l1);
				$("input[name='faMenLaShenXingNeng_l2']").val(data.list[i].change[0].faMenLaShenXingNeng_l2);
				$("input[name='faMenLaShenXingNeng_l3']").val(data.list[i].change[0].faMenLaShenXingNeng_l3);
				$("input[name='faMenLaShenXingNeng_l4']").val(data.list[i].change[0].faMenLaShenXingNeng_l4);
				$("input[name='faMenLaShenXingNeng_l5']").val(data.list[i].change[0].faMenLaShenXingNeng_l5);
				$("input[name='faMenLaShenXingNeng_l6']").val(data.list[i].change[0].faMenLaShenXingNeng_l6);
				$("input[name='faMenLaShenXingNeng_l7']").val(data.list[i].change[0].faMenLaShenXingNeng_l7);
				$("input[name='faMenLaShenXingNeng_b1']").val(data.list[i].faMenLaShenXingNeng_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						 $str='';
					        $str+='<tr>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l1" value="'+data.list[i].change[j].faMenLaShenXingNeng_l1+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l2" value="'+data.list[i].change[j].faMenLaShenXingNeng_l2+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l3" value="'+data.list[i].change[j].faMenLaShenXingNeng_l3+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l4" value="'+data.list[i].change[j].faMenLaShenXingNeng_l4+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l5" value="'+data.list[i].change[j].faMenLaShenXingNeng_l5+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l6" value="'+data.list[i].change[j].faMenLaShenXingNeng_l6+'"/></td>';
							$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l7" value="'+data.list[i].change[j].faMenLaShenXingNeng_l7+'"/></td>';
							$str+='<td align="center">/td>';
						    $str+='</tr>';
						    $("#faMenLaShenXingNeng").before($str);
					}
				}
			}

			if(data.list[i].name == "faMenChongJi"){//
				$("input[name='faMenChongJi_a1'][value='" + data.list[i].faMenChongJi_a1 + "']").attr("checked",true); 
				$("input[name='faMenChongJi_a2'][value='" + data.list[i].faMenChongJi_a2 + "']").attr("checked",true);
				$("input[name='faMenChongJi_a3'][value='" + data.list[i].faMenChongJi_a3 + "']").attr("checked",true); 
				$("input[name='faMenChongJi_a4'][value='" + data.list[i].faMenChongJi_a4 + "']").attr("checked",true);
				$("input[name='faMenChongJi_b1']").val(data.list[i].faMenChongJi_b1);
				$("input[name='faMenChongJi_b2']").val(data.list[i].faMenChongJi_b2);
				$("input[name='faMenChongJi_c1']").val(data.list[i].faMenChongJi_c1);
				$("input[name='faMenChongJi_c2']").val(data.list[i].faMenChongJi_c2);
				$("input[name='faMenChongJi_c3']").val(data.list[i].faMenChongJi_c3);
				$("input[name='faMenChongJi_c4']").val(data.list[i].faMenChongJi_c4);
				$("input[name='faMenChongJi_d1']").val(data.list[i].faMenChongJi_d1);
				$("input[name='faMenChongJi_d2']").val(data.list[i].faMenChongJi_d2);
				$("input[name='faMenChongJi_d3']").val(data.list[i].faMenChongJi_d3);
				$("input[name='faMenChongJi_d4']").val(data.list[i].faMenChongJi_d4);
				$("input[name='faMenChongJi_e1']").val(data.list[i].faMenChongJi_e1);
				$("input[name='faMenChongJi_e2']").val(data.list[i].faMenChongJi_e2);
				$("input[name='faMenChongJi_e3']").val(data.list[i].faMenChongJi_e3);
				$("input[name='faMenChongJi_e4']").val(data.list[i].faMenChongJi_e4);
				$("input[name='faMenChongJi_f1']").val(data.list[i].faMenChongJi_f1);
				$("input[name='faMenChongJi_f2']").val(data.list[i].faMenChongJi_f2);
				$("input[name='faMenChongJi_f3']").val(data.list[i].faMenChongJi_f3);
				$("input[name='faMenChongJi_f4']").val(data.list[i].faMenChongJi_f4);
				$("input[name='faMenChongJi_g1']").val(data.list[i].faMenChongJi_g1);
				$("input[name='faMenChongJi_g2']").val(data.list[i].faMenChongJi_g2);
				$("input[name='faMenChongJi_g3']").val(data.list[i].faMenChongJi_g3);
				$("input[name='faMenChongJi_g4']").val(data.list[i].faMenChongJi_g4);
				$("input[name='faMenChongJi_h1']").val(data.list[i].faMenChongJi_h1);
			}

			if(data.list[i].name == "faMenWanQu"){//
				$("input[name='faMenWanQu_a1'][value='" + data.list[i].faMenWanQu_a1 + "']").attr("checked",true); 
				$("input[name='faMenWanQu_a2'][value='" + data.list[i].faMenWanQu_a2 + "']").attr("checked",true);
				$("input[name='faMenWanQu_a3'][value='" + data.list[i].faMenWanQu_a3 + "']").attr("checked",true); 
				$("input[name='faMenWanQu_a4'][value='" + data.list[i].faMenWanQu_a4 + "']").attr("checked",true);
				$("input[name='faMenWanQu_b1']").val(data.list[i].faMenWanQu_b1);
				$("input[name='faMenWanQu_b2']").val(data.list[i].faMenWanQu_b2);
				$("input[name='faMenWanQu_c1']").val(data.list[i].faMenWanQu_c1);
				$("input[name='faMenWanQu_c2']").val(data.list[i].faMenWanQu_c2);
				$("input[name='faMenWanQu_c3']").val(data.list[i].faMenWanQu_c3);
				$("input[name='faMenWanQu_c4']").val(data.list[i].faMenWanQu_c4);
				$("input[name='faMenWanQu_d1']").val(data.list[i].faMenWanQu_d1);
				$("input[name='faMenWanQu_d2']").val(data.list[i].faMenWanQu_d2);
				$("input[name='faMenWanQu_d3']").val(data.list[i].faMenWanQu_d3);
				$("input[name='faMenWanQu_d4']").val(data.list[i].faMenWanQu_d4);
				$("input[name='faMenWanQu_e1']").val(data.list[i].faMenWanQu_e1);
				$("input[name='faMenWanQu_e2']").val(data.list[i].faMenWanQu_e2);
				$("input[name='faMenWanQu_e3']").val(data.list[i].faMenWanQu_e3);
				$("input[name='faMenWanQu_e4']").val(data.list[i].faMenWanQu_e4);
				$("input[name='faMenWanQu_f1']").val(data.list[i].faMenWanQu_f1);
				$("input[name='faMenWanQu_f2']").val(data.list[i].faMenWanQu_f2);
				$("input[name='faMenWanQu_f3']").val(data.list[i].faMenWanQu_f3);
				$("input[name='faMenWanQu_f4']").val(data.list[i].faMenWanQu_f4);
				$("input[name='faMenWanQu_g1']").val(data.list[i].faMenWanQu_g1);
			}

			if(data.list[i].name == "faMenJinXiang"){//
				$("input[name='faMenJinXiang_a1'][value='"+data.list[i].faMenJinXiang_a1+"']").attr("checked",true); 
				$("input[name='faMenJinXiang_a2'][value='"+data.list[i].faMenJinXiang_a2+"']").attr("checked",true);
				$("input[name='faMenJinXiang_a3'][value='"+data.list[i].faMenJinXiang_a3+"']").attr("checked",true); 
				$("input[name='faMenJinXiang_a4'][value='"+data.list[i].faMenJinXiang_a4+"']").attr("checked",true);
				$("input[name='faMenJinXiang_b1']").val(data.list[i].faMenJinXiang_b1);
				$("input[name='faMenJinXiang_b2']").val(data.list[i].faMenJinXiang_b2);
				$("input[name='faMenJinXiang_b3']").val(data.list[i].faMenJinXiang_b3);
				$("input[name='faMenJinXiang_b4']").val(data.list[i].faMenJinXiang_b4);
				$("input[name='faMenJinXiang_c1']").val(data.list[i].faMenJinXiang_c1);
				$("input[name='faMenJinXiang_c2']").val(data.list[i].faMenJinXiang_c2);
				$("input[name='faMenJinXiang_c3']").val(data.list[i].faMenJinXiang_c3);
				$("input[name='faMenJinXiang_c4']").val(data.list[i].faMenJinXiang_c4);
				$("input[name='faMenJinXiang_d1']").val(data.list[i].faMenJinXiang_d1);
				$("input[name='faMenJinXiang_d2']").val(data.list[i].faMenJinXiang_d2);
				$("input[name='faMenJinXiang_d3']").val(data.list[i].faMenJinXiang_d3);
				$("input[name='faMenJinXiang_d4']").val(data.list[i].faMenJinXiang_d4);
				$("input[name='faMenJinXiang_e1']").val(data.list[i].faMenJinXiang_e1);
				$("input[name='faMenJinXiang_e2']").val(data.list[i].faMenJinXiang_e2);
				$("input[name='faMenJinXiang_e3']").val(data.list[i].faMenJinXiang_e3);
				$("input[name='faMenJinXiang_e4']").val(data.list[i].faMenJinXiang_e4);
				$("input[name='faMenJinXiang_f1']").val(data.list[i].faMenJinXiang_f1);
			}

			if(data.list[i].name == "fangFuQiTa"){//其他
				$("input[name='fangFuQiTa_a1']").val(data.list[i].fangFuQiTa_a1);
				$("input[name='fangFuQiTa_a2']").val(data.list[i].fangFuQiTa_a2);
				$("input[name='fangFuQiTa_b1']").val(data.list[i].fangFuQiTa_b1);
				$("input[name='fangFuQiTa_b2']").val(data.list[i].fangFuQiTa_b2);
				$("input[name='fangFuQiTa_b3']").val(data.list[i].fangFuQiTa_b3);
				$("input[name='fangFuQiTa_c1']").val(data.list[i].fangFuQiTa_c1);
				$("input[name='fangFuQiTa_c2']").val(data.list[i].fangFuQiTa_c2);
				$("input[name='fangFuQiTa_c3']").val(data.list[i].fangFuQiTa_c3);
				$("input[name='fangFuQiTa_c4']").val(data.list[i].fangFuQiTa_c4);
				$("input[name='fangFuQiTa_d1']").val(data.list[i].fangFuQiTa_d1);
				$("input[name='fangFuQiTa_f1']").val(data.list[i].fangFuQiTa_f1);
				$("input[name='fangFuQiTa_l1']").val(data.list[i].change[0].fangFuQiTa_l1);
				$("input[name='fangFuQiTa_l2']").val(data.list[i].change[0].fangFuQiTa_l2);
				$("input[name='fangFuQiTa_l3']").val(data.list[i].change[0].fangFuQiTa_l3);
				$("input[name='fangFuQiTa_l4']").val(data.list[i].change[0].fangFuQiTa_l4);
				$("input[name='fangFuQiTa_l5']").val(data.list[i].change[0].fangFuQiTa_l5);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
					    $str='';
				        $str+='<tr>';
				        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="fangFuQiTa_l1" value="'+data.list[i].change[j].fangFuQiTa_l1+'"/></td>';
				        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="fangFuQiTa_l2" value="'+data.list[i].change[j].fangFuQiTa_l2+'"/></td>';
						$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="fangFuQiTa_l3" value="'+data.list[i].change[j].fangFuQiTa_l3+'"/></td>';
						$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="fangFuQiTa_l4" value="'+data.list[i].change[j].fangFuQiTa_l4+'"/></td>';
						$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="fangFuQiTa_l5" value="'+data.list[i].change[j].fangFuQiTa_l5+'"/></td>';
					    $str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#fangFuQiTa").before($str);
					}
				}
			}

			if(data.list[i].name == "fangFuFang"){
				$("input[name='fangFuFang_a1'][value='"+data.list[i].fangFuFang_a1+"']").attr("checked",true); 
				$("input[name='fangFuFang_a2'][value='"+data.list[i].fangFuFang_a2+"']").attr("checked",true);
				$("input[name='fangFuFang_b1']").val(data.list[i].fangFuFang_b1);
				$("input[name='fangFuFang_b2']").val(data.list[i].fangFuFang_b2);
				$("input[name='fangFuFang_b3']").val(data.list[i].fangFuFang_b3);
				$("input[name='fangFuFang_b4']").val(data.list[i].fangFuFang_b4);
				$("input[name='fangFuFang_b5']").val(data.list[i].fangFuFang_b5);
				$("input[name='fangFuFang_b6']").val(data.list[i].fangFuFang_b6);
				$("input[name='fangFuFang_b7']").val(data.list[i].fangFuFang_b7);
			}

			if(data.list[i].name == "fangFuQingJie"){//弯管 弯管清洁
				$("input[name='fangFuQingJie_l1']").val(data.list[i].change[0].fangFuQingJie_l1);
				$("input[name='fangFuQingJie_l2']").val(data.list[i].change[0].fangFuQingJie_l2);
				$("input[name='fangFuQingJie_l3']").val(data.list[i].change[0].fangFuQingJie_l3);
				$("input[name='fangFuQingJie_l4']").val(data.list[i].change[0].fangFuQingJie_l4);
				$("input[name='fangFuQingJie_l5']").val(data.list[i].change[0].fangFuQingJie_l5);
				$("input[name='fangFuQingJie_l6']").val(data.list[i].change[0].fangFuQingJie_l6);
				$("input[name='fangFuQingJie_l7']").val(data.list[i].change[0].fangFuQingJie_l7);
				$("input[name='fangFuQingJie_a1']").val(data.list[i].fangFuQingJie_a1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l1" value="'+data.list[i].change[j].fangFuQingJie_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l2" value="'+data.list[i].change[j].fangFuQingJie_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l3" value="'+data.list[i].change[j].fangFuQingJie_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l4" value="'+data.list[i].change[j].fangFuQingJie_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l5" value="'+data.list[i].change[j].fangFuQingJie_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l6" value="'+data.list[i].change[j].fangFuQingJie_l6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l7" value="'+data.list[i].change[j].fangFuQingJie_l7+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#fangFu_qingJie").before($str);
					}
				}
			}

			if(data.list[i].name == "fangFuNeiTuCeng"){//钻具  内涂层
				$("input[name='fangFuNeiTuCeng_a1'][value='"+data.list[i].fangFuNeiTuCeng_a1+"']").attr("checked",true); 
				$("input[name='fangFuNeiTuCeng_a2'][value='"+data.list[i].fangFuNeiTuCeng_a2+"']").attr("checked",true);
				$("input[name='fangFuNeiTuCeng_a3']").val(data.list[i].fangFuNeiTuCeng_a3);
				$("input[name='fangFuNeiTuCeng_l1']").val(data.list[i].change[0].fangFuNeiTuCeng_l1);
				$("input[name='fangFuNeiTuCeng_l2']").val(data.list[i].change[0].fangFuNeiTuCeng_l2);
				$("input[name='fangFuNeiTuCeng_l3']").val(data.list[i].change[0].fangFuNeiTuCeng_l3);
				$("input[name='fangFuNeiTuCeng_l4']").val(data.list[i].change[0].fangFuNeiTuCeng_l4);
				$("input[name='fangFuNeiTuCeng_l5']").val(data.list[i].change[0].fangFuNeiTuCeng_l5);
				$("input[name='fangFuNeiTuCeng_l6']").val(data.list[i].change[0].fangFuNeiTuCeng_l6);
				
				$("input[name='fangFuNeiTuCeng_c1']").val(data.list[i].fangFuNeiTuCeng_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
			    $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l1" value="'+data.list[i].change[j].fangFuNeiTuCeng_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l2" value="'+data.list[i].change[j].fangFuNeiTuCeng_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l3" value="'+data.list[i].change[j].fangFuNeiTuCeng_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l4" value="'+data.list[i].change[j].fangFuNeiTuCeng_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l5" value="'+data.list[i].change[j].fangFuNeiTuCeng_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l6" value="'+data.list[i].change[j].fangFuNeiTuCeng_l6+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#fangFu_neiTuCeng").before($str);
					}
				}
			}

			if(data.list[i].name == "fangFuXingNeng"){//弯管 防腐层性能检验
				$("input[name='fangFuXingNeng_a1'][value='"+data.list[i].fangFuXingNeng_a1+"']").attr("checked",true); 
				$("input[name='fangFuXingNeng_a2'][value='"+data.list[i].fangFuXingNeng_a2+"']").attr("checked",true);
				$("input[name='fangFuXingNeng_l1']").val(data.list[i].change[0].fangFuXingNeng_l1);
				$("input[name='fangFuXingNeng_l2']").val(data.list[i].change[0].fangFuXingNeng_l2);
				$("input[name='fangFuXingNeng_l3']").val(data.list[i].change[0].fangFuXingNeng_l3);
				$("input[name='fangFuXingNeng_l4']").val(data.list[i].change[0].fangFuXingNeng_l4);
				$("input[name='fangFuXingNeng_l5']").val(data.list[i].change[0].fangFuXingNeng_l5);
				$("input[name='fangFuXingNeng_l6']").val(data.list[i].change[0].fangFuXingNeng_l6);
				$("input[name='fangFuXingNeng_l7']").val(data.list[i].change[0].fangFuXingNeng_l7);
				$("input[name='fangFuXingNeng_l8']").val(data.list[i].change[0].fangFuXingNeng_l8);
				$("input[name='fangFuXingNeng_l9']").val(data.list[i].change[0].fangFuXingNeng_l9);
				$("input[name='fangFuXingNeng_b1']").val(data.list[i].fangFuXingNeng_b1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l1" value="'+data.list[i].change[j].fangFuXingNeng_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l2" value="'+data.list[i].change[j].fangFuXingNeng_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l3" value="'+data.list[i].change[j].fangFuXingNeng_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l4" value="'+data.list[i].change[j].fangFuXingNeng_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l5" value="'+data.list[i].change[j].fangFuXingNeng_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l6" value="'+data.list[i].change[j].fangFuXingNeng_l6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l7" value="'+data.list[i].change[j].fangFuXingNeng_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l8" value="'+data.list[i].change[j].fangFuXingNeng_l8+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l9" value="'+data.list[i].change[j].fangFuXingNeng_l9+'"/></td>';
					    $str+='</tr>';
					    $("#fangFu_xingNeng").before($str);
					}
				}
			}

			if(data.list[i].name == "fangFuWaiGuan"){//弯管 防腐层外观尺寸
				$("input[name='fangFuWaiGuan_a1']").val(data.list[i].fangFuWaiGuan_a1);
				$("input[name='fangFuWaiGuan_a2'][value='"+data.list[i].fangFuWaiGuan_a2+"']").attr("checked",true);
				$("input[name='fangFuWaiGuan_a3'][value='"+data.list[i].fangFuWaiGuan_a3+"']").attr("checked",true); 
				$("input[name='fangFuWaiGuan_a4'][value='"+data.list[i].fangFuWaiGuan_a4+"']").attr("checked",true);
				$("input[name='fangFuWaiGuan_l1']").val(data.list[i].change[0].fangFuWaiGuan_l1);
				$("input[name='fangFuWaiGuan_l2']").val(data.list[i].change[0].fangFuWaiGuan_l2);
				$("input[name='fangFuWaiGuan_l3']").val(data.list[i].change[0].fangFuWaiGuan_l3);
				$("input[name='fangFuWaiGuan_l4']").val(data.list[i].change[0].fangFuWaiGuan_l4);
				$("input[name='fangFuWaiGuan_l5']").val(data.list[i].change[0].fangFuWaiGuan_l5);
				$("input[name='fangFuWaiGuan_l6']").val(data.list[i].change[0].fangFuWaiGuan_l6);
				$("input[name='fangFuWaiGuan_l7']").val(data.list[i].change[0].fangFuWaiGuan_l7);
				$("input[name='fangFuWaiGuan_l8']").val(data.list[i].change[0].fangFuWaiGuan_l8);
				$("input[name='fangFuWaiGuan_b1']").val(data.list[i].fangFuWaiGuan_b1);
				$("input[name='fangFuWaiGuan_b2']").val(data.list[i].fangFuWaiGuan_b2);
				$("input[name='fangFuWaiGuan_b3']").val(data.list[i].fangFuWaiGuan_b3);
				$("input[name='fangFuWaiGuan_b4']").val(data.list[i].fangFuWaiGuan_b4);
				$("input[name='fangFuWaiGuan_b5']").val(data.list[i].fangFuWaiGuan_b5);
				$("input[name='fangFuWaiGuan_b6']").val(data.list[i].fangFuWaiGuan_b6);
				$("input[name='fangFuWaiGuan_b7']").val(data.list[i].fangFuWaiGuan_b7);
				$("input[name='fangFuWaiGuan_c1']").val(data.list[i].fangFuWaiGuan_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l1" value="'+data.list[i].change[j].fangFuWaiGuan_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l2" value="'+data.list[i].change[j].fangFuWaiGuan_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l3" value="'+data.list[i].change[j].fangFuWaiGuan_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l4" value="'+data.list[i].change[j].fangFuWaiGuan_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l5" value="'+data.list[i].change[j].fangFuWaiGuan_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l6" value="'+data.list[i].change[j].fangFuWaiGuan_l6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l7" value="'+data.list[i].change[j].fangFuWaiGuan_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l8" value="'+data.list[i].change[j].fangFuWaiGuan_l8+'"/></td>';
						$str+='<td align="center"><</td>';
					    $str+='</tr>';
					    $("#fangFu_waiGuan").before($str);
					}
				}
			}

			if(data.list[i].name == "fangFuDui"){//弯管 防腐层外观尺寸
				$("input[name='fangFuDui_a1'][value='"+data.list[i].fangFuDui_a1+"']").attr("checked",true); 
				$("input[name='fangFuDui_a2'][value='"+data.list[i].fangFuDui_a2+"']").attr("checked",true);
				$("input[name='fangFuDui_a3'][value='"+data.list[i].fangFuDui_a3+"']").attr("checked",true); 
				$("input[name='fangFuDui_a4'][value='"+data.list[i].fangFuDui_a4+"']").attr("checked",true);
				$("input[name='fangFuDui_a5']").val(data.list[i].fangFuDui_a5);
			}

			if(data.list[i].name == "fangFuFa"){
				$("input[name='fangFuFa_a1']").val(data.list[i].fangFuFa_a1);
				$("input[name='fangFuFa_a2']").val(data.list[i].fangFuFa_a2);
				$("input[name='fangFuFa_a3']").val(data.list[i].fangFuFa_a3);
				$("input[name='fangFuFa_a4']").val(data.list[i].fangFuFa_a4);
				$("input[name='fangFuFa_a5'][value='"+data.list[i].fangFuFa_a5+"']").attr("checked",true);
				$("input[name='fangFuFa_a6'][value='"+data.list[i].fangFuFa_a6+"']").attr("checked",true);
				$("input[name='fangFuFa_a7'][value='"+data.list[i].fangFuFa_a7+"']").attr("checked",true);
				$("input[name='fangFuFa_a8']").val(data.list[i].fangFuFa_a8);
				$("input[name='fangFuFa_a9']").val(data.list[i].fangFuFa_a9);
			}

			if(data.list[i].name == "delbendJu"){
				$("input[name='delbendJu_a1'][value='"+data.list[i].delbendJu_a1+"']").attr("checked",true);
				$("input[name='delbendJu_a2']").val(data.list[i].delbendJu_a2);
				$("input[name='delbendJu_a3']").val(data.list[i].delbendJu_a3);
				$("input[name='delbendJu_a4'][value='"+data.list[i].delbendJu_a4+"']").attr("checked",true);
				$("input[name='delbendJu_b1']").val(data.list[i].delbendJu_b1);
				$("select[name='delbendJu_b2']").val(data.list[i].delbendJu_b2);
				$("input[name='delbendJu_b3']").val(data.list[i].delbendJu_b3);
				$("input[name='delbendJu_b4']").val(data.list[i].delbendJu_b4);
				$("input[name='delbendJu_b5']").val(data.list[i].delbendJu_b5);
				$("select[name='delbendJu_b6']").val(data.list[i].delbendJu_b6);
				$("input[name='delbendJu_b7']").val(data.list[i].delbendJu_b7);
				$("input[name='delbendJu_b8']").val(data.list[i].delbendJu_b8);
				$("input[name='delbendJu_c1']").val(data.list[i].delbendJu_c1);
				$("select[name='delbendJu_c2']").val(data.list[i].delbendJu_b2);
				$("input[name='delbendJu_c3']").val(data.list[i].delbendJu_c3);
				$("input[name='delbendJu_c4']").val(data.list[i].delbendJu_c4);
				$("input[name='delbendJu_c5']").val(data.list[i].delbendJu_c5);
				$("select[name='delbendJu_c6']").val(data.list[i].delbendJu_c6);
				$("input[name='delbendJu_c7']").val(data.list[i].delbendJu_c7);
				$("input[name='delbendJu_c8']").val(data.list[i].delbendJu_c8);
				$("input[name='delbendJu_d1']").val(data.list[i].delbendJu_d1);
				$("select[name='delbendJu_d2']").val(data.list[i].delbendJu_d2);
				$("input[name='delbendJu_d3']").val(data.list[i].delbendJu_d3);
				$("input[name='delbendJu_d4']").val(data.list[i].delbendJu_d4);
				$("input[name='delbendJu_d5']").val(data.list[i].delbendJu_d5);
				$("select[name='delbendJu_d6']").val(data.list[i].delbendJu_d6);
				$("input[name='delbendJu_d7']").val(data.list[i].delbendJu_d7);
				$("input[name='delbendJu_d8']").val(data.list[i].delbendJu_d8);
				$("input[name='delbendJu_e1']").val(data.list[i].delbendJu_e1);
				$("select[name='delbendJu_e2']").val(data.list[i].delbendJu_e2);
				$("input[name='delbendJu_e3']").val(data.list[i].delbendJu_e3);
				$("input[name='delbendJu_e4']").val(data.list[i].delbendJu_e4);
				$("input[name='delbendJu_e5']").val(data.list[i].delbendJu_e5);
			}

			if(data.list[i].name == "delbendFangShi"){
				$("input[name='delbendFangShi_a1'][value='"+data.list[i].delbendFangShi_a1+"']").attr("checked",true);
				$("input[name='delbendFangShi_a2']").val(data.list[i].delbendFangShi_a2);
				$("input[name='delbendFangShi_a3']").val(data.list[i].delbendFangShi_a3);
				$("input[name='delbendFangShi_a4'][value='"+data.list[i].delbendFangShi_a4+"']").attr("checked",true);
				$("input[name='delbendFangShi_b1']").val(data.list[i].delbendFangShi_b1);
				$("select[name='delbendFangShi_b2']").val(data.list[i].delbendFangShi_b2);
				$("input[name='delbendFangShi_b3']").val(data.list[i].delbendFangShi_b3);
				$("input[name='delbendFangShi_b4']").val(data.list[i].delbendFangShi_b4);
				$("input[name='delbendFangShi_b5']").val(data.list[i].delbendFangShi_b5);
				$("select[name='delbendFangShi_b6']").val(data.list[i].delbendFangShi_b6);
				$("input[name='delbendFangShi_b7']").val(data.list[i].delbendFangShi_b7);
				$("input[name='delbendFangShi_b8']").val(data.list[i].delbendFangShi_b8);
				$("input[name='delbendFangShi_c1']").val(data.list[i].delbendFangShi_c1);
				$("select[name='delbendFangShi_c2']").val(data.list[i].delbendFangShi_b2);
				$("input[name='delbendFangShi_c3']").val(data.list[i].delbendFangShi_c3);
				$("input[name='delbendFangShi_c4']").val(data.list[i].delbendFangShi_c4);
				$("input[name='delbendFangShi_c5']").val(data.list[i].delbendFangShi_c5);
				$("select[name='delbendFangShi_c6']").val(data.list[i].delbendFangShi_c6);
				$("input[name='delbendFangShi_c7']").val(data.list[i].delbendFangShi_c7);
				$("input[name='delbendFangShi_c8']").val(data.list[i].delbendFangShi_c8);
				$("input[name='delbendFangShi_d1']").val(data.list[i].delbendFangShi_d1);
				$("select[name='delbendFangShi_d2']").val(data.list[i].delbendFangShi_d2);
				$("input[name='delbendFangShi_d3']").val(data.list[i].delbendFangShi_d3);
				$("input[name='delbendFangShi_d4']").val(data.list[i].delbendFangShi_d4);
				$("input[name='delbendFangShi_d5']").val(data.list[i].delbendFangShi_d5);
				$("select[name='delbendFangShi_d6']").val(data.list[i].delbendFangShi_d6);
				$("input[name='delbendFangShi_d7']").val(data.list[i].delbendFangShi_d7);
				$("input[name='delbendFangShi_d8']").val(data.list[i].delbendFangShi_d8);
				$("input[name='delbendFangShi_e1']").val(data.list[i].delbendFangShi_e1);
				$("select[name='delbendFangShi_e2']").val(data.list[i].delbendFangShi_e2);
				$("input[name='delbendFangShi_e3']").val(data.list[i].delbendFangShi_e3);
				$("input[name='delbendFangShi_e4']").val(data.list[i].delbendFangShi_e4);
				$("input[name='delbendFangShi_e5']").val(data.list[i].delbendFangShi_e5);
				$("select[name='delbendFangShi_e6']").val(data.list[i].delbendFangShi_e6);
				$("input[name='delbendFangShi_e7']").val(data.list[i].delbendFangShi_e7);
				$("input[name='delbendFangShi_e8']").val(data.list[i].delbendFangShi_e8);
				$("input[name='delbendFangShi_f1']").val(data.list[i].delbendFangShi_f1);
				$("select[name='delbendFangShi_f2']").val(data.list[i].delbendFangShi_f2);
				$("input[name='delbendFangShi_f3']").val(data.list[i].delbendFangShi_f3);
				$("input[name='delbendFangShi_f4']").val(data.list[i].delbendFangShi_f4);
				$("input[name='delbendFangShi_f5']").val(data.list[i].delbendFangShi_f5);
			}

			if(data.list[i].name == "delbendWaiHu"){//输送管弯管  外护管
				$("input[name='delbendWaiHu_a1']").val(data.list[i].delbendWaiHu_a1);
				$("input[name='delbendWaiHu_a2']").val(data.list[i].delbendWaiHu_a2);
				$("input[name='delbendWaiHu_a3'][value='"+data.list[i].delbendWaiHu_a3+"']").attr("checked",true);
				$("input[name='delbendWaiHu_a4'][value='"+data.list[i].delbendWaiHu_a4+"']").attr("checked",true);
				$("input[name='delbendWaiHu_l1']").val(data.list[i].change[0].delbendWaiHu_l1);
				$("input[name='delbendWaiHu_l2']").val(data.list[i].change[0].delbendWaiHu_l2);
				$("input[name='delbendWaiHu_l3']").val(data.list[i].change[0].delbendWaiHu_l3);
				$("input[name='delbendWaiHu_l4']").val(data.list[i].change[0].delbendWaiHu_l4);
				$("input[name='delbendWaiHu_b1']").val(data.list[i].delbendWaiHu_b1);
				$("input[name='delbendWaiHu_b2']").val(data.list[i].delbendWaiHu_b2);
				$("input[name='delbendWaiHu_b3']").val(data.list[i].delbendWaiHu_b3);
				$("input[name='delbendWaiHu_c1']").val(data.list[i].delbendWaiHu_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
			    $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendWaiHu_l1" value="'+data.list[i].change[j].delbendWaiHu_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendWaiHu_l2" value="'+data.list[i].change[j].delbendWaiHu_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendWaiHu_l3" value="'+data.list[i].change[j].delbendWaiHu_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendWaiHu_l4" value="'+data.list[i].change[j].delbendWaiHu_l4+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#delbend_waiHu").before($str);
					}
				}
			}

			if(data.list[i].name == "delbendBaoYuan"){//输送管弯管
				$("input[name='delbendBaoYuan_a1'][value='"+data.list[i].delbendBaoYuan_a1+"']").attr("checked",true);
				$("input[name='delbendBaoYuan_a2'][value='"+data.list[i].delbendBaoYuan_a2+"']").attr("checked",true);
				$("input[name='delbendBaoYuan_a3']").val(data.list[i].delbendBaoYuan_a3);
				$("input[name='delbendBaoYuan_a4']").val(data.list[i].delbendBaoYuan_a4);
				$("input[name='delbendBaoYuan_a5']").val(data.list[i].delbendBaoYuan_a5);
				$("input[name='delbendBaoYuan_a6']").val(data.list[i].delbendBaoYuan_a6);
				$("input[name='delbendBaoYuan_a7']").val(data.list[i].delbendBaoYuan_a7);
			}

			if(data.list[i].name == "delbendBaoWen"){//输送管弯管  钢管保温生产
				$("input[name='delbendBaoWen_a1'][value='"+data.list[i].delbendBaoWen_a1+"']").attr("checked",true);
				$("input[name='delbendBaoWen_a2'][value='"+data.list[i].delbendBaoWen_a2+"']").attr("checked",true);
				$("input[name='delbendBaoWen_a3'][value='"+data.list[i].delbendBaoWen_a3+"']").attr("checked",true);
				$("input[name='delbendBaoWen_a4'][value='"+data.list[i].delbendBaoWen_a4+"']").attr("checked",true);
				$("input[name='delbendBaoWen_l1']").val(data.list[i].change[0].delbendBaoWen_l1);
				$("input[name='delbendBaoWen_l2']").val(data.list[i].change[0].delbendBaoWen_l2);
				$("input[name='delbendBaoWen_l3']").val(data.list[i].change[0].delbendBaoWen_l3);
				$("input[name='delbendBaoWen_l4']").val(data.list[i].change[0].delbendBaoWen_l4);
				$("input[name='delbendBaoWen_l5']").val(data.list[i].change[0].delbendBaoWen_l5);
				$("input[name='delbendBaoWen_l6']").val(data.list[i].change[0].delbendBaoWen_l6);
				$("input[name='delbendBaoWen_l7']").val(data.list[i].change[0].delbendBaoWen_l7);
				$("input[name='delbendBaoWen_l8']").val(data.list[i].change[0].delbendBaoWen_l8);
				$("input[name='delbendBaoWen_b1']").val(data.list[i].delbendBaoWen_b1);
				$("input[name='delbendBaoWen_b2']").val(data.list[i].delbendBaoWen_b2);
				$("input[name='delbendBaoWen_b3']").val(data.list[i].delbendBaoWen_b3);
				$("input[name='delbendBaoWen_b4']").val(data.list[i].delbendBaoWen_b4);
				$("input[name='delbendBaoWen_c1']").val(data.list[i].delbendBaoWen_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
			    $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l1" value="'+data.list[i].change[j].delbendBaoWen_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l2" value="'+data.list[i].change[j].delbendBaoWen_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l3" value="'+data.list[i].change[j].delbendBaoWen_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l4" value="'+data.list[i].change[j].delbendBaoWen_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l5" value="'+data.list[i].change[j].delbendBaoWen_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l6" value="'+data.list[i].change[j].delbendBaoWen_l6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l7" value="'+data.list[i].change[j].delbendBaoWen_l7+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l8" value="'+data.list[i].change[j].delbendBaoWen_l8+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#delbend_baoWen").before($str);
					}
				}
			}

			if(data.list[i].name == "delbendFangMao"){//输送管弯管  
				$("input[name='delbendFangMao_a1'][value='"+data.list[i].delbendFangMao_a1+"']").attr("checked",true);
				$("input[name='delbendFangMao_a2'][value='"+data.list[i].delbendFangMao_a2+"']").attr("checked",true);
				$("input[name='delbendFangMao_a3'][value='"+data.list[i].delbendFangMao_a3+"']").attr("checked",true);
				$("input[name='delbendFangMao_a4'][value='"+data.list[i].delbendFangMao_a4+"']").attr("checked",true);
				$("input[name='delbendFangMao_a5'][value='"+data.list[i].delbendFangMao_a5+"']").attr("checked",true);
				$("input[name='delbendFangMao_a6'][value='"+data.list[i].delbendFangMao_a6+"']").attr("checked",true);
				$("input[name='delbendFangMao_l1']").val(data.list[i].change[0].delbendFangMao_l1);
				$("input[name='delbendFangMao_l2']").val(data.list[i].change[0].delbendFangMao_l2);
				$("input[name='delbendFangMao_l3']").val(data.list[i].change[0].delbendFangMao_l3);
				$("input[name='delbendFangMao_l4']").val(data.list[i].change[0].delbendFangMao_l4);
				$("input[name='delbendFangMao_b1']").val(data.list[i].delbendFangMao_b1);
				$("input[name='delbendFangMao_b2']").val(data.list[i].delbendFangMao_b2);
				$("input[name='delbendFangMao_b3']").val(data.list[i].delbendFangMao_b3);
				$("input[name='delbendFangMao_ll1']").val(data.list[i].change2[0].delbendFangMao_ll1);
				$("input[name='delbendFangMao_ll2']").val(data.list[i].change2[0].delbendFangMao_ll2);
				$("input[name='delbendFangMao_ll3']").val(data.list[i].change2[0].delbendFangMao_ll3);
				$("input[name='delbendFangMao_ll4']").val(data.list[i].change2[0].delbendFangMao_ll4);
				$("input[name='delbendFangMao_ll5']").val(data.list[i].change2[0].delbendFangMao_ll5);
				$("input[name='delbendFangMao_ll6']").val(data.list[i].change2[0].delbendFangMao_ll6);
				$("input[name='delbendFangMao_ll7']").val(data.list[i].change2[0].delbendFangMao_ll7);
				$("input[name='delbendFangMao_c1']").val(data.list[i].delbendFangMao_c1);
				$("input[name='delbendFangMao_c2']").val(data.list[i].delbendFangMao_c2);
				$("input[name='delbendFangMao_c3']").val(data.list[i].delbendFangMao_c3);
				$("input[name='delbendFangMao_c4']").val(data.list[i].delbendFangMao_c4);
				$("input[name='delbendFangMao_c5']").val(data.list[i].delbendFangMao_c5);
				$("input[name='delbendFangMao_c6']").val(data.list[i].delbendFangMao_c6);
				$("input[name='delbendFangMao_d1']").val(data.list[i].delbendFangMao_d1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
			    $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_l1" value="'+data.list[i].change[j].delbendFangMao_l1+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_l2" value="'+data.list[i].change[j].delbendFangMao_l2+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_l3" value="'+data.list[i].change[j].delbendFangMao_l3+'"/></td>';
						$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_l4" value="'+data.list[i].change[j].delbendFangMao_l4+'"/></td>';
						$str+='<td align="center"></td>';
			    	$str+='</tr>';
			    	$("#delbend_fangMao1").before($str);
					}
				}
				if(data.list[i].change2[0].length>1){
					for(var j=1;j<data.list[i].change2[0].length;j++){
						$str='';
			    $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll1" value="'+data.list[i].change2[j].delbendFangMao_ll1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll2" value="'+data.list[i].change2[j].delbendFangMao_ll2+'"//></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll3" value="'+data.list[i].change2[j].delbendFangMao_ll3+'"//></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll4" value="'+data.list[i].change2[j].delbendFangMao_ll4+'"//></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll5" value="'+data.list[i].change2[j].delbendFangMao_ll5+'"//></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll6" value="'+data.list[i].change2[j].delbendFangMao_ll6+'"//></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll7" value="'+data.list[i].change2[j].delbendFangMao_ll7+'"//></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#delbend_fangMao2").before($str);
					}
				}
			}

			if(data.list[i].name == "delbendBaoDui"){//输送管弯管 保温管堆放
				$("input[name='delbendBaoDui_a1'][value='"+data.list[i].delbendBaoDui_a1+"']").attr("checked",true);
				$("input[name='delbendBaoDui_a2'][value='"+data.list[i].delbendBaoDui_a2+"']").attr("checked",true);
				$("input[name='delbendBaoDui_a3'][value='"+data.list[i].delbendBaoDui_a3+"']").attr("checked",true);
				$("input[name='delbendBaoDui_a4'][value='"+data.list[i].delbendBaoDui_a4+"']").attr("checked",true);
				$("input[name='delbendBaoDui_a5']").val(data.list[i].delbendBaoDui_a5);
			}

			if(data.list[i].name == "delbendBaoFa"){//输送管弯管 防腐保温管发运
				$("input[name='delbendBaoFa_a1']").val(data.list[i].delbendBaoFa_a1);
				$("input[name='delbendBaoFa_a2']").val(data.list[i].delbendBaoFa_a2);
				$("input[name='delbendBaoFa_a3']").val(data.list[i].delbendBaoFa_a3);
				$("input[name='delbendBaoFa_a4']").val(data.list[i].delbendBaoFa_a4);
				$("input[name='delbendBaoFa_a5'][value='"+data.list[i].delbendBaoFa_a5+"']").attr("checked",true);
				$("input[name='delbendBaoFa_a6'][value='"+data.list[i].delbendBaoFa_a6+"']").attr("checked",true);
				$("input[name='delbendBaoFa_a7'][value='"+data.list[i].delbendBaoFa_a7+"']").attr("checked",true);
				$("input[name='delbendBaoFa_a8']").val(data.list[i].delbendBaoFa_a8);
				$("input[name='delbendBaoFa_a9']").val(data.list[i].delbendBaoFa_a9);
			}

			if(data.list[i].name == "delbendFangXing"){
				$("input[name='delbendFangXing_a1'][value='"+data.list[i].delbendFangXing_a1+"']").attr("checked",true);
				$("input[name='delbendFangXing_a2']").val(data.list[i].delbendFangXing_a2);
				$("input[name='delbendFangXing_a3']").val(data.list[i].delbendFangXing_a3);
				$("input[name='delbendFangXing_a4'][value='"+data.list[i].delbendFangXing_a4+"']").attr("checked",true);
				$("input[name='delbendFangXing_b1']").val(data.list[i].delbendFangXing_b1);
				$("select[name='delbendFangXing_b2']").val(data.list[i].delbendFangXing_b2);
				$("input[name='delbendFangXing_b3']").val(data.list[i].delbendFangXing_b3);
				$("input[name='delbendFangXing_b4']").val(data.list[i].delbendFangXing_b4);
				$("input[name='delbendFangXing_b5']").val(data.list[i].delbendFangXing_b5);
				$("select[name='delbendFangXing_b6']").val(data.list[i].delbendFangXing_b6);
				$("input[name='delbendFangXing_b7']").val(data.list[i].delbendFangXing_b7);
				$("input[name='delbendFangXing_b8']").val(data.list[i].delbendFangXing_b8);
				$("input[name='delbendFangXing_c1']").val(data.list[i].delbendFangXing_c1);
				$("select[name='delbendFangXing_c2']").val(data.list[i].delbendFangXing_b2);
				$("input[name='delbendFangXing_c3']").val(data.list[i].delbendFangXing_c3);
				$("input[name='delbendFangXing_c4']").val(data.list[i].delbendFangXing_c4);
				$("input[name='delbendFangXing_c5']").val(data.list[i].delbendFangXing_c5);
				$("select[name='delbendFangXing_c6']").val(data.list[i].delbendFangXing_c6);
				$("input[name='delbendFangXing_c7']").val(data.list[i].delbendFangXing_c7);
				$("input[name='delbendFangXing_c8']").val(data.list[i].delbendFangXing_c8);
				$("input[name='delbendFangXing_d1']").val(data.list[i].delbendFangXing_d1);
				$("select[name='delbendFangXing_d2']").val(data.list[i].delbendFangXing_d2);
				$("input[name='delbendFangXing_d3']").val(data.list[i].delbendFangXing_d3);
				$("input[name='delbendFangXing_d4']").val(data.list[i].delbendFangXing_d4);
				$("input[name='delbendFangXing_d5']").val(data.list[i].delbendFangXing_d5);
				$("select[name='delbendFangXing_d6']").val(data.list[i].delbendFangXing_d6);
				$("input[name='delbendFangXing_d7']").val(data.list[i].delbendFangXing_d7);
				$("input[name='delbendFangXing_d8']").val(data.list[i].delbendFangXing_d8);
				$("input[name='delbendFangXing_d9']").val(data.list[i].delbendFangXing_d9);
			}
			if(data.list[i].name == "delbendWaiXing"){
				$("input[name='delbendWaiXing_a1'][value='"+data.list[i].delbendWaiXing_a1+"']").attr("checked",true);
				$("input[name='delbendWaiXing_a2']").val(data.list[i].delbendWaiXing_a2);
				$("input[name='delbendWaiXing_a3']").val(data.list[i].delbendWaiXing_a3);
				$("input[name='delbendWaiXing_a4'][value='"+data.list[i].delbendWaiXing_a4+"']").attr("checked",true);
				$("input[name='delbendWaiXing_b1']").val(data.list[i].delbendWaiXing_b1);
				$("select[name='delbendWaiXing_b2']").val(data.list[i].delbendWaiXing_b2);
				$("input[name='delbendWaiXing_b3']").val(data.list[i].delbendWaiXing_b3);
				$("input[name='delbendWaiXing_b4']").val(data.list[i].delbendWaiXing_b4);
				$("input[name='delbendWaiXing_b5']").val(data.list[i].delbendWaiXing_b5);
				$("select[name='delbendWaiXing_b6']").val(data.list[i].delbendWaiXing_b6);
				$("input[name='delbendWaiXing_b7']").val(data.list[i].delbendWaiXing_b7);
				$("input[name='delbendWaiXing_b8']").val(data.list[i].delbendWaiXing_b8);
				$("input[name='delbendWaiXing_c1']").val(data.list[i].delbendWaiXing_c1);
				$("select[name='delbendWaiXing_c2']").val(data.list[i].delbendWaiXing_b2);
				$("input[name='delbendWaiXing_c3']").val(data.list[i].delbendWaiXing_c3);
				$("input[name='delbendWaiXing_c4']").val(data.list[i].delbendWaiXing_c4);
				$("input[name='delbendWaiXing_c5']").val(data.list[i].delbendWaiXing_c5);
				$("select[name='delbendWaiXing_c6']").val(data.list[i].delbendWaiXing_c6);
				$("input[name='delbendWaiXing_c7']").val(data.list[i].delbendWaiXing_c7);
				$("input[name='delbendWaiXing_c8']").val(data.list[i].delbendWaiXing_c8);
				$("input[name='delbendWaiXing_c9']").val(data.list[i].delbendWaiXing_c9);
			}

			if(data.list[i].name == "delbendBao"){
				$("input[name='delbendBao_a1'][value='"+data.list[i].delbendBao_a1+"']").attr("checked",true);
				$("input[name='delbendBao_a2']").val(data.list[i].delbendBao_a2);
				$("input[name='delbendBao_a3']").val(data.list[i].delbendBao_a3);
				$("input[name='delbendBao_a4'][value='"+data.list[i].delbendBao_a4+"']").attr("checked",true);
				$("input[name='delbendBao_b1']").val(data.list[i].delbendBao_b1);
				$("select[name='delbendBao_b2']").val(data.list[i].delbendBao_b2);
				$("input[name='delbendBao_b3']").val(data.list[i].delbendBao_b3);
				$("input[name='delbendBao_b4']").val(data.list[i].delbendBao_b4);
				$("input[name='delbendBao_b5']").val(data.list[i].delbendBao_b5);
				$("select[name='delbendBao_b6']").val(data.list[i].delbendBao_b6);
				$("input[name='delbendBao_b7']").val(data.list[i].delbendBao_b7);
				$("input[name='delbendBao_b8']").val(data.list[i].delbendBao_b8);
				$("input[name='delbendBao_c1']").val(data.list[i].delbendBao_c1);
				$("select[name='delbendBao_c2']").val(data.list[i].delbendBao_b2);
				$("input[name='delbendBao_c3']").val(data.list[i].delbendBao_c3);
				$("input[name='delbendBao_c4']").val(data.list[i].delbendBao_c4);
				$("input[name='delbendBao_c5']").val(data.list[i].delbendBao_c5);
				$("select[name='delbendBao_c6']").val(data.list[i].delbendBao_c6);
				$("input[name='delbendBao_c7']").val(data.list[i].delbendBao_c7);
				$("input[name='delbendBao_c8']").val(data.list[i].delbendBao_c8);
				$("input[name='delbendBao_c9']").val(data.list[i].delbendBao_c9);
			}

			if(data.list[i].name == "delbendFang"){
				$("input[name='delbendFang_a1'][value='"+data.list[i].delbendFang_a1+"']").attr("checked",true); 
				$("input[name='delbendFang_a2'][value='"+data.list[i].delbendFang_a2+"']").attr("checked",true);
				$("input[name='delbendFang_b1']").val(data.list[i].delbendFang_b1);
				$("input[name='delbendFang_b2']").val(data.list[i].delbendFang_b2);
				$("input[name='delbendFang_c1']").val(data.list[i].delbendFang_c1);
			}

			if(data.list[i].name == "delbendQingJie"){//弯管 弯管清洁
				$("input[name='delbendQingJie_l1']").val(data.list[i].change[0].delbendQingJie_l1);
				$("input[name='delbendQingJie_l2']").val(data.list[i].change[0].delbendQingJie_l2);
				$("input[name='delbendQingJie_l3']").val(data.list[i].change[0].delbendQingJie_l3);
				$("input[name='delbendQingJie_l4']").val(data.list[i].change[0].delbendQingJie_l4);
				$("input[name='delbendQingJie_l5']").val(data.list[i].change[0].delbendQingJie_l5);
				$("input[name='delbendQingJie_l6']").val(data.list[i].change[0].delbendQingJie_l6);
				$("input[name='delbendQingJie_l7']").val(data.list[i].change[0].delbendQingJie_l7);
				$("input[name='delbendQingJie_a1']").val(data.list[i].delbendQingJie_a1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l1" value="'+data.list[i].change[j].delbendQingJie_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l2" value="'+data.list[i].change[j].delbendQingJie_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l3" value="'+data.list[i].change[j].delbendQingJie_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l4" value="'+data.list[i].change[j].delbendQingJie_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l5" value="'+data.list[i].change[j].delbendQingJie_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l6" value="'+data.list[i].change[j].delbendQingJie_l6+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l7" value="'+data.list[i].change[j].delbendQingJie_l7+'"/></td>';
						$str+='<td align="center"></td>';
					    $str+='</tr>';
					    $("#delbend_qingJie").before($str);
					}
				}
			}

			if(data.list[i].name == "delbendNeiTuCeng"){//钻具  内涂层
				$("input[name='delbendNeiTuCeng_a1'][value='"+data.list[i].delbendNeiTuCeng_a1+"']").attr("checked",true); 
				$("input[name='delbendNeiTuCeng_a2'][value='"+data.list[i].delbendNeiTuCeng_a2+"']").attr("checked",true);
				$("input[name='delbendNeiTuCeng_l1']").val(data.list[i].change[0].delbendNeiTuCeng_l1);
				$("input[name='delbendNeiTuCeng_l2']").val(data.list[i].change[0].delbendNeiTuCeng_l2);
				$("input[name='delbendNeiTuCeng_l3']").val(data.list[i].change[0].delbendNeiTuCeng_l3);
				$("input[name='delbendNeiTuCeng_l4']").val(data.list[i].change[0].delbendNeiTuCeng_l4);
				$("input[name='delbendNeiTuCeng_l5']").val(data.list[i].change[0].delbendNeiTuCeng_l5);
				$("input[name='delbendNeiTuCeng_l6']").val(data.list[i].change[0].delbendNeiTuCeng_l6);
				
				$("input[name='delbendNeiTuCeng_c1']").val(data.list[i].delbendNeiTuCeng_c1);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
			    $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l1" value="'+data.list[i].change[j].delbendNeiTuCeng_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l2" value="'+data.list[i].change[j].delbendNeiTuCeng_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l3" value="'+data.list[i].change[j].delbendNeiTuCeng_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l4" value="'+data.list[i].change[j].delbendNeiTuCeng_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l5" value="'+data.list[i].change[j].delbendNeiTuCeng_l5+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l6" value="'+data.list[i].change[j].delbendNeiTuCeng_l6+'"/></td>';
						$str+='<td align="center"></td>';
				    $str+='</tr>';
				    $("#delbend_neiTuCeng").before($str);
					}
				}
			}

			if(data.list[i].name == "delbendHouDu"){//输送管弯管  钢管保温生产
				$("input[name='delbendHouDu_l1']").val(data.list[i].change[0].delbendHouDu_l1);
				$("input[name='delbendHouDu_l2']").val(data.list[i].change[0].delbendHouDu_l2);
				$("input[name='delbendHouDu_l3']").val(data.list[i].change[0].delbendHouDu_l3);
				$("input[name='delbendHouDu_l4']").val(data.list[i].change[0].delbendHouDu_l4);
				$("input[name='delbendHouDu_l5']").val(data.list[i].change[0].delbendHouDu_l5);
				$("input[name='delbendHouDu_a1']").val(data.list[i].delbendHouDu_a1);
				$("input[name='delbendHouDu_a2']").val(data.list[i].delbendHouDu_a2);
				$("input[name='delbendHouDu_a3']").val(data.list[i].delbendHouDu_a3);
				if(data.list[i].change[0].length>1){
					for(var j=1;j<data.list[i].change[0].length;j++){
						$str='';
			   			$str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendHouDu_l1" value="'+data.list[i].change[j].delbendHouDu_l1+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendHouDu_l2" value="'+data.list[i].change[j].delbendHouDu_l2+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendHouDu_l3" value="'+data.list[i].change[j].delbendHouDu_l3+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendHouDu_l4" value="'+data.list[i].change[j].delbendHouDu_l4+'"/></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendHouDu_l5" value="'+data.list[i].change[j].delbendHouDu_l5+'"/></td>';
						$str+='<td align="center"></td>';
			    		$str+='</tr>';
			    		$("#delbend_houDu").before($str);
					}
				}
			}

			if(data.list[i].name == "delbendBaoDui1"){//输送管弯管 保温管堆放
				$("input[name='delbendBaoDui1_a1'][value='"+data.list[i].delbendBaoDui1_a1+"']").attr("checked",true);
				$("input[name='delbendBaoDui1_a2'][value='"+data.list[i].delbendBaoDui1_a2+"']").attr("checked",true);
				$("input[name='delbendBaoDui1_a3'][value='"+data.list[i].delbendBaoDui1_a3+"']").attr("checked",true);
				$("input[name='delbendBaoDui1_a4'][value='"+data.list[i].delbendBaoDui1_a4+"']").attr("checked",true);
				$("input[name='delbendBaoDui1_a5']").val(data.list[i].delbendBaoDui1_a5);
			}


	}
}