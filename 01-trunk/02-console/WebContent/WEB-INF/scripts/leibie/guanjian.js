$(function(){

	//其他
	var guanJianQiTaIndex = 2;
	$("#addguanJianQiTa").click(function(){
		var tempDelFileInfoId = "guanJianQiTa" + ++guanJianQiTaIndex;
	    $str='';
        $str+='<tr>';
        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="guanJianQiTa_l1" /></td>';
        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="guanJianQiTa_l2" /></td>';
		$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="guanJianQiTa_l3" /></td>';
		$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="guanJianQiTa_l4" /></td>';
		$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="guanJianQiTa_l5" /></td>';
	    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
	    $str+='</tr>';
	    $("#guanJianQiTa").before($str);
	});

	var guanJian_yuZhiChengXingIndex = 2;
		$("#addGuanJian_yuZhiChengXing").click(function(){
			var tempDelFileInfoId = "guanJianYuZhiChengXing" + ++guanJian_yuZhiChengXingIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianYuZhiChengXing_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianYuZhiChengXing_l2" /></td>';
			$str+='<td align="center"><select name="guanJianYuZhiChengXing_l3"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianYuZhiChengXing_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianYuZhiChengXing_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianYuZhiChengXing_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJian_yuZhiChengXing").before($str);
		});

		var guanJian_reChuLiIndex = 2;
		$("#addGuanJian_reChuLi").click(function(){
			var tempDelFileInfoId = "guanJianReChuLi" + ++guanJian_reChuLiIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianReChuLi_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianReChuLi_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianReChuLi_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianReChuLi_l4" /></td>';
			$str+='<td align="center"><select name="guanJianReChuLi_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianReChuLi_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJian_reChuLi").before($str);
		});

		var guanJian_hanJieIndex = 2;
		$("#addGuanJian_hanJie").click(function(){
			var tempDelFileInfoId = "guanJianHanJie" + ++guanJian_hanJieIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianHanJie_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianHanJie_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianHanJie_l3" /></td>';
			$str+='<td align="center"><select name="guanJianHanJie_l4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="guanJianHanJie_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianHanJie_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJian_hanJie").before($str);
		});

		//设备  射线检测过程
		var guanJian_sheXianGuoChengIndex = 2;
		$("#addguanJian_sheXianGuoCheng").click(function(){
			var tempDelFileInfoId = "guanJianSheXianGuoCheng" + ++guanJian_sheXianGuoChengIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianGuoCheng_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianGuoCheng_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianGuoCheng_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianGuoCheng_l4" /></td>';
			$str+='<td align="center"><select name="guanJianSheXianGuoCheng_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianGuoCheng_l6" /></td>';
			$str+='<td align="center"><select name="guanJianSheXianGuoCheng_l7"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJian_sheXianGuoCheng").before($str);
		});

			var guanJianChaoShengBo1Index = 2;
			$("#addguanJianChaoShengBo1").click(function(){
				var tempDelFileInfoId = "guanJianChaoShengBo1" + ++guanJianChaoShengBo1Index;
			    $str='';
		        $str+='<tr>';
		        $str+='<td align="center" colspan="1"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_l1" /></td>';
		        $str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_l2" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_l3" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianChaoShengBo_l4" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianChaoShengBo_l5" /></td>';
			    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#guanJianChaoShengBo1").before($str);
			});
			var guanJianChaoShengBo2Index = 2;
			$("#addguanJianChaoShengBo2").click(function(){
				var tempDelFileInfoId = "guanJianChaoShengBo2" + ++guanJianChaoShengBo2Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll4" /></td>';
				$str+='<td align="center"><select name="guanJianChaoShengBo_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><select name="guanJianChaoShengBo_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll7" /></td>';
				$str+='<td align="center"><select name="guanJianChaoShengBo_ll8"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChaoShengBo_ll9" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#guanJianChaoShengBo2").before($str);
			});
		var guanJianCiFenJianCe1Index = 2;
		$("#addguanJianCiFenJianCe1").click(function(){
			var tempDelFileInfoId = "guanJianCiFenJianCe1" + ++guanJianCiFenJianCe1Index;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center" colspan="1"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_l1" /></td>';
	        $str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_l2" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_l3" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianCiFenJianCe_l4" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianCiFenJianCe_l5" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJianCiFenJianCe1").before($str);
		});
		var guanJianCiFenJianCe2Index = 2;
		$("#addguanJianCiFenJianCe2").click(function(){
			var tempDelFileInfoId = "guanJianCiFenJianCe2" + ++guanJianCiFenJianCe2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll4" /></td>';
			$str+='<td align="center"><select name="guanJianCiFenJianCe_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="guanJianCiFenJianCe_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll7" /></td>';

			$str+='<td align="center"><select name="guanJianCiFenJianCe_ll8"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianCiFenJianCe_ll9" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJianCiFenJianCe2").before($str);
		});
		var guanJianShenTouJianCe1Index = 2;
		$("#addguanJianShenTouJianCe1").click(function(){
			var tempDelFileInfoId = "guanJianShenTouJianCe1" + ++guanJianShenTouJianCe1Index;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianShenTouJianCe_l1" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianShenTouJianCe_l2" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="guanJianShenTouJianCe_l3" /></td>';
			$str+='<td align="center" colspan="3"><input class="input_140 easyui-validatebox" type="text" name="guanJianShenTouJianCe_l4" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJianShenTouJianCe1").before($str);
		});
		var guanJianShenTouJianCe2Index = 2;
		$("#addguanJianShenTouJianCe2").click(function(){
			var tempDelFileInfoId = "guanJianShenTouJianCe2" + ++guanJianShenTouJianCe2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll7" /></td>';
			$str+='<td align="center"><select name="guanJianShenTouJianCe_ll8"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';

			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShenTouJianCe_ll9" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJianShenTouJianCe2").before($str);
		});

		var guanJianSheXianDiPianIndex = 2;
		$("#addguanJianSheXianDiPian").click(function(){
			var tempDelFileInfoId = "guanJianSheXianDiPian" + ++guanJianSheXianDiPianIndex;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l1" /></td>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianSheXianDiPian_l7" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJianSheXianDiPian").before($str);
		});
		//管件 水压试验
		var guanJian_shuiYaShiYanIndex = 2;
		$("#addGuanJian_shuiYaShiYan").click(function(){
			var tempDelFileInfoId = "guanJianShuiYaShiYan" + ++guanJian_shuiYaShiYanIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l5" /></td>';
			$str+='<td align="center"><select name="guanJianShuiYaShiYan_l6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l7" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l8" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianShuiYaShiYan_l9" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJian_shuiYaShiYan").before($str);
		});
		//管件 除锈油漆、标识
		var guanJian_chuXiuIndex = 2;
		$("#addGuanJian_chuXiu").click(function(){
			var tempDelFileInfoId = "guanJianChuXiu" + ++guanJian_chuXiuIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChuXiu_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChuXiu_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChuXiu_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChuXiu_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianChuXiu_l5" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJian_chuXiu").before($str);
		});

		var guanJianLaShenXingNengIndex = 2;
		$("#addguanJianLaShenXingNeng").click(function(){
			var tempDelFileInfoId = "guanJianLaShenXingNeng" + ++guanJianLaShenXingNengIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="guanJianLaShenXingNeng_l7" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#guanJianLaShenXingNeng").before($str);
		});
});

function delTr(tempTdId){//删除
	var obj  = $("#" + tempTdId);
	$(obj).parent().parent().remove();  
}