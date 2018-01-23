$(function(){
		var deliveryqiTaIndex = 2;
		$("#adddeliveryQiTa").click(function(){
			var tempDelFileInfoId = "deliveryQiTa" + ++deliveryqiTaIndex;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa_l1" /></td>';
	        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa_l2" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa_l3" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa_l4" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa_l5" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#deliveryQiTa").before($str);
		});
		//输送管  热轧
		var delivery_reZhaIndex = 2;
		$("#addDelivery_reZha").click(function(){
			var tempDelFileInfoId = "deliveryReZha" + ++delivery_reZhaIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReZha_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReZha_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReZha_l3" /></td>';
			$str+='<td align="center"><select name="deliveryReZha_l4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center" ><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#delivery_reZha").before($str);
		});
		//输送管 热处理
		var delivery_reChuLiIndex = 2;
		$("#addDelivery_reChuLi").click(function(){
			var tempDelFileInfoId = "fileInfoTab" + ++delivery_reChuLiIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryReChuLi_l7" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#delivery_reChuLi").before($str);
		});
			//输送管  无缝钢管 超声波检测
			var delivery_wuFengChaoShengBo1Index = 2;
			$("#addDelivery_wuFengChaoShengBo1").click(function(){
				var tempDelFileInfoId = "deliveryWuFengChaoShengBo1" + ++delivery_wuFengChaoShengBo1Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_l2" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_l3" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_l4" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_l5" /></td>';
				$str+='<td align="center" ><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_wuFengChaoShengBo1").before($str);
			});
			var delivery_wuFengChaoShengBo2Index = 2;
			$("#addDelivery_wuFengChaoShengBo2").click(function(){
				var tempDelFileInfoId = "deliveryWuFengChaoShengBo2" + ++delivery_wuFengChaoShengBo2Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll5" /></td>';
				$str+='<td align="center"><select name="deliveryWuFengChaoShengBo_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengChaoShengBo_ll7" /></td>';
				$str+='<td align="center"><select name="deliveryWuFengChaoShengBo_ll8"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_wuFengChaoShengBo2").before($str);
			});
		//输送管  无缝钢管 磁粉检测
		var delivery_wuFengCiFen1Index = 2;
		$("#addDelivery_wuFengCiFen1").click(function(){
			var tempDelFileInfoId = "deliveryWuFengCiFen1" + ++delivery_wuFengCiFen1Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_l2" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_l3" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_l4" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_l5" /></td>';
			$str+='<td align="center" ><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#delivery_wuFengCiFen1").before($str);
		});
		var delivery_wuFengCiFen2Index = 2;
		$("#addDelivery_wuFengCiFen2").click(function(){
			var tempDelFileInfoId = "deliveryWuFengCiFen2" + ++delivery_wuFengCiFen2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll5" /></td>';
			$str+='<td align="center"><select name="deliveryWuFengCiFen_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWuFengCiFen_ll7" /></td>';
			$str+='<td align="center"><select name="deliveryWuFengCiFen_ll8"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#delivery_wuFengCiFen2").before($str);
		});
		//输送管  无缝钢管 涡流检测
		var delivery_woLiu1Index = 2;
		$("#addDelivery_woLiu1").click(function(){
			var tempDelFileInfoId = "deliveryWoLiu1" + ++delivery_woLiu1Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_l2" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_l3" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_l4" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_l5" /></td>';
			$str+='<td align="center" ><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#delivery_woLiu1").before($str);
		});
		var delivery_woLiu2Index = 2;
		$("#addDelivery_woLiu2").click(function(){
			var tempDelFileInfoId = "deliveryWoLiu2" + ++delivery_woLiu2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll5" /></td>';
			$str+='<td align="center"><select name="deliveryWoLiu_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryWoLiu_ll7" /></td>';
			$str+='<td align="center"><select name="deliveryWoLiu_ll8"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#delivery_woLiu2").before($str);
		});
			//输送管  无缝钢管 漏磁检测
			var delivery_louCi1Index = 2;
			$("#addDelivery_louCi1").click(function(){
				var tempDelFileInfoId = "deliveryLouCi1" + ++delivery_louCi1Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_l2" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_l3" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_l4" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_l5" /></td>';
				$str+='<td align="center" ><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_louCi1").before($str);
			});
			var delivery_louCi2Index = 2;
			$("#addDelivery_louCi2").click(function(){
				var tempDelFileInfoId = "deliveryLouCi2" + ++delivery_louCi2Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll5" /></td>';
				$str+='<td align="center"><select name="deliveryLouCi_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLouCi_ll7" /></td>';
				$str+='<td align="center"><select name="deliveryLouCi_ll8"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_louCi2").before($str);
			});
			//输送管  无缝钢管 水压试验
			var delivery_shuiYaIndex = 2;
			$("#addDelivery_ShuiYa").click(function(){
				var tempDelFileInfoId = "deliveryShuiYa" + ++delivery_shuiYaIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYa_l7" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_shuiYa").before($str);
			});
			//输送管  无缝钢管 拉伸性能
			var delivery_laShenIndex = 2;
			$("#addDelivery_laShen").click(function(){
				var tempDelFileInfoId = "deliveryLaShen" + ++delivery_laShenIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShen_l7" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_laShen").before($str);
			});
			//输送管  无缝钢管 冲击韧性
			var delivery_ChongJiIndex = 2;
			$("#addDelivery_ChongJi").click(function(){
				var tempDelFileInfoId = "deliveryChongJi" + ++delivery_ChongJiIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChongJi_l7" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_ChongJi").before($str);
			});
			//输送管  无缝钢管 金相硬度
			var delivery_jinXiangIndex = 2;
			$("#addDelivery_jinXiang").click(function(){
				var tempDelFileInfoId = "deliveryJinXiang" + ++delivery_jinXiangIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryJinXiang_l7" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_jinXiang").before($str);
			});

			var deliveryqiTa2Index = 2;
			$("#adddeliveryQiTa2").click(function(){
				var tempDelFileInfoId = "deliveryQiTa2" + ++deliveryqiTa2Index;
			    $str='';
		        $str+='<tr>';
		        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa2_l1" /></td>';
		        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa2_l2" /></td>';
				$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa2_l3" /></td>';
				$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa2_l4" /></td>';
				$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="deliveryQiTa2_l5" /></td>';
			    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#deliveryQiTa2").before($str);
			});

			//输送管 投料
			var delivery_touLiaoIndex = 2;
			$("#addDelivery_touLiao").click(function(){
				var tempDelFileInfoId = "fileInfoTab" + ++delivery_touLiaoIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryTouLiao_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryTouLiao_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryTouLiao_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryTouLiao_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryTouLiao_l5" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_touLiao").before($str);
			});
			//输送管 成型焊接
			var delivery_chengXingIndex = 2;
			$("#addDelivery_chengXing").click(function(){
				var tempDelFileInfoId = "deliveryChengXing" + ++delivery_chengXingIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChengXing_l6" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_chengXing").before($str);
			});
			//输送管  射线检测
			var delivery_sheXian1Index = 2;
			$("#addDelivery_sheXian1").click(function(){
				var tempDelFileInfoId = "deliverySheXian1" + ++delivery_sheXian1Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_l6" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_sheXian1").before($str);
			});
			var delivery_sheXian2Index = 2;
			$("#addDelivery_sheXian2").click(function(){
				var tempDelFileInfoId = "deliverySheXian2" + ++delivery_sheXian2Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_ll1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_ll2" /></td>';
				$str+='<td align="center"><select name="deliverySheXian_ll3"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_ll4" /></td>';
				$str+='<td align="center"><select name="deliverySheXian_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliverySheXian_ll6" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_sheXian2").before($str);
			});
			//输送管  超声波检测（连探、手探）
			var delivery_chaoShengBo1Index = 2;
			$("#addDelivery_chaoShengBo1").click(function(){
				var tempDelFileInfoId = "deliveryChaoShengBo1" + ++delivery_chaoShengBo1Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_l1" /></td>';
				$str+='<td align="center"><select name="deliveryChaoShengBo_l2"><option value="连探">连探</option><option value="手探">手探</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_l5" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_l6" /></td>';
				$str+='<td align="center" ><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_chaoShengBo1").before($str);
			});
			var delivery_chaoShengBo2Index = 2;
			$("#addDelivery_chaoShengBo2").click(function(){
				var tempDelFileInfoId = "deliveryChaoShengBo2" + ++delivery_chaoShengBo2Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_ll1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_ll2" /></td>';
				$str+='<td align="center"><select name="deliveryChaoShengBo_ll3"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><select name="deliveryChaoShengBo_ll4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_ll5" /></td>';
				$str+='<td align="center"><select name="deliveryChaoShengBo_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryChaoShengBo_ll7" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_chaoShengBo2").before($str);
			});
			// 管件  磁粉检测
			var delivery_ciFen1Index = 2;
			$("#adddelivery_ciFen1").click(function(){
				var tempDelFileInfoId = "deliveryCiFen1" + ++delivery_ciFen1Index;
			    $str='';
		        $str+='<tr>';
		        $str+='<td align="center" ><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_l1" /></td>';
		        $str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_l2" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_l3" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="deliveryCiFen_l4" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="deliveryCiFen_l5" /></td>';
			    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_ciFen1").before($str);
			});
			var delivery_ciFen2Index = 2;
			$("#adddelivery_ciFen2").click(function(){
				var tempDelFileInfoId = "deliveryCiFen2" + ++delivery_ciFen2Index;
			    $str='';
		        $str+='<tr>';
		        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll4" /></td>';
				$str+='<td align="center"><select name="deliveryCiFen_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll6" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="deliveryCiFen_ll7" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delivery_ciFen2").before($str);
			});

				var delivery2_shuiYaShiYanIndex = 2;
				$("#adddelivery2_shuiYaShiYan").click(function(){
					var tempDelFileInfoId = "delivery2ShuiYaShiYan_" + ++delivery2_shuiYaShiYanIndex;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYaShiYan2_l1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYaShiYan2_l2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYaShiYan2_l3" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYaShiYan2_l4" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryShuiYaShiYan2_l5" /></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#delivery2_shuiYaShiYan").before($str);
				});

				var deliveryLaShenXingNengIndex = 2;
				$("#adddeliveryLaShenXingNeng").click(function(){
					var tempDelFileInfoId = "deliveryLaShenXingNeng" + ++deliveryLaShenXingNengIndex;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l3" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l4" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l5" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="deliveryLaShenXingNeng_l6" /></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#deliveryLaShenXingNeng").before($str);
				});
});
function delTr(tempTdId){//删除
	var obj  = $("#" + tempTdId);
	$(obj).parent().parent().remove();  
}