$(function(){
   	//其他
		var drillQiTaIndex = 2;
		$("#adddrillQiTa").click(function(){
			var tempDelFileInfoId = "drillQiTa" + ++drillQiTaIndex;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="drillQiTa_l1" /></td>';
	        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="drillQiTa_l2" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="drillQiTa_l3" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="drillQiTa_l4" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="drillQiTa_l5" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drillQiTa").before($str);
		});
		//钻具 管端加厚
		var drill_guanDuanIndex = 2;
		$("#addDrill_guanDuan").click(function(){
			var tempDelFileInfoId = "drillGuanDuan" + ++drill_guanDuanIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillGuanDuan_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_guanDuan").before($str);
		});
		//钻具 摩擦焊
		var drill_moCaHanIndex = 2;
		$("#addDrill_moCaHan").click(function(){
			var tempDelFileInfoId = "drillMoCaHan" + ++drill_moCaHanIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l7" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillMoCaHan_l8" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_moCaHan").before($str);
		});

		//钻具 焊区机加工
		var drill_hanQuIndex = 2;
		$("#addDrill_hanQu").click(function(){
			var tempDelFileInfoId = "drillHanQu" + ++drill_hanQuIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillHanQu_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillHanQu_l2" /></td>';
			$str+='<td align="center"><select name="drillHanQu_l3"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="drillHanQu_l4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_hanQu").before($str);
		});
		//钻具 热处理
		var drill_reChuLi1Index = 2;
		$("#addDrill_reChuLi1").click(function(){
			var tempDelFileInfoId = "drillReChuLi1" + ++drill_reChuLi1Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_reChuLi1").before($str);
		});
		var drill_reChuLi2Index = 2;
		$("#addDrill_reChuLi2").click(function(){
			var tempDelFileInfoId = "drillReChuLi2" + ++drill_reChuLi2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_ll6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_reChuLi2").before($str);
		});
		var drill_reChuLi3Index = 2;
		$("#addDrill_reChuLi3").click(function(){
			var tempDelFileInfoId = "drillReChuLi3" + ++drill_reChuLi3Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi_lll6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_reChuLi3").before($str);
		});
		var drill_chaoShengBo1Index = 2;
		$("#addDrill_chaoShengBo1").click(function(){
			var tempDelFileInfoId = "drillChaoShengBo1" + ++drill_chaoShengBo1Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_l1" /></td>';
			$str+='<td align="center"><select name="drillChaoShengBo_l2"><option value="连探">连探</option><option value="手探">手探</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_l5" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_l6" /></td>';
			$str+='<td align="center" ><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_chaoShengBo1").before($str);
		});
		var drill_chaoShengBo2Index = 2;
		$("#addDrill_chaoShengBo2").click(function(){
			var tempDelFileInfoId = "drillChaoShengBo2" + ++drill_chaoShengBo2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_ll2" /></td>';
			$str+='<td align="center"><select name="drillChaoShengBo_ll3"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="drillChaoShengBo_ll4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_ll5" /></td>';
			$str+='<td align="center"><select name="drillChaoShengBo_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo_ll7" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_chaoShengBo2").before($str);
		});


		// 阀门 磁粉检测
		var drillCiFenJianCe1Index = 2;
		$("#addDrillCiFenJianCe1").click(function(){
			var tempDelFileInfoId = "drillCiFenJianCe1" + ++drillCiFenJianCe1Index;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_l1" /></td>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_l3" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="drillCiFenJianCe_l4" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="drillCiFenJianCe_l5" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drillCiFenJianCe1").before($str);
		});
		var drillCiFenJianCe2Index = 2;
		$("#addDrillCiFenJianCe2").click(function(){
			var tempDelFileInfoId = "drillCiFenJianCe2" + ++drillCiFenJianCe2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_ll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_ll4" /></td>';
			$str+='<td align="center"><select name="drillCiFenJianCe_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="drillCiFenJianCe_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe_ll7" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drillCiFenJianCe2").before($str);
		});

		//钻具  耐磨带加工
		var drill_naiMoIndex = 2;
		$("#addDrill_naiMo").click(function(){
			var tempDelFileInfoId = "drillNaiMo" + ++drill_naiMoIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l1" /></td>';
			$str+='<td align="center"><select name="drillNaiMo_l2"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l7" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l8" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l9" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo_l10" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_naiMo").before($str);
		});
		//钻具  内涂层
		var drill_neiTuCengIndex = 2;
		$("#addDrill_neiTuCeng").click(function(){
			var tempDelFileInfoId = "drillNeiTuCeng" + ++drill_neiTuCengIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_neiTuCeng").before($str);
		});

			//钻具 内涂层厚度测量
			var drill_neiTuCengHouDuIndex = 2;
			$("#addDrill_neiTuCengHouDu").click(function(){
				var tempDelFileInfoId = "drillNeiTuCengHouDu" + ++drill_neiTuCengHouDuIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu_l4" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#drill_neiTuCengHouDu").before($str);
			});
		//钻具 包装发运
		var drill_baoZhuangIndex = 2;
		$("#addDrill_baoZhuang").click(function(){
			var tempDelFileInfoId = "drillBaoZhuang" + ++drill_baoZhuangIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBaoZhuang_l1" /></td>';
			$str+='<td align="center"><select name="drillBaoZhuang_l2"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="drillBaoZhuang_l3"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="drillBaoZhuang_l4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="drillBaoZhuang_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBaoZhuang_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_baoZhuang").before($str);
		});
		//钻具 备料
		var drill_beiLiaoIndex = 2;
		$("#addDrill_beiLiao").click(function(){
			var tempDelFileInfoId = "drillBeiLiao" + ++drill_beiLiaoIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBeiLiao_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBeiLiao_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBeiLiao_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBeiLiao_l4" /></td>';
			$str+='<td align="center"><select name="drillBeiLiao_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_beiLiao").before($str);
		});

		//钻具 钻孔、车外圆
		var drill_zuanKongIndex = 2;
		$("#addDrill_zuanKong").click(function(){
			var tempDelFileInfoId = "drillZuanKong" + ++drill_zuanKongIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillZuanKong_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillZuanKong_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillZuanKong_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillZuanKong_l4" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_zuanKong").before($str);
		});

		var drill_chaoShengBo21Index = 2;
		$("#addDrill_chaoShengBo21").click(function(){
			var tempDelFileInfoId = "drillChaoShengBo21" + ++drill_chaoShengBo21Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_l1" /></td>';
			$str+='<td align="center"><select name="drillChaoShengBo2_l2"><option value="连探">连探</option><option value="手探">手探</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_l5" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_l6" /></td>';
			$str+='<td align="center" ><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_chaoShengBo21").before($str);
		});
		var drill_chaoShengBo22Index = 2;
		$("#addDrill_chaoShengBo22").click(function(){
			var tempDelFileInfoId = "drillChaoShengBo22" + ++drill_chaoShengBo22Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_ll2" /></td>';
			$str+='<td align="center"><select name="drillChaoShengBo2_ll3"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="drillChaoShengBo2_ll4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_ll5" /></td>';
			$str+='<td align="center"><select name="drillChaoShengBo2_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChaoShengBo2_ll7" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_chaoShengBo22").before($str);
		});

		// 阀门 磁粉检测
		var drillCiFenJianCe21Index = 2;
		$("#addDrillCiFenJianCe21").click(function(){
			var tempDelFileInfoId = "drillCiFenJianCe21" + ++drillCiFenJianCe21Index;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_l1" /></td>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_l3" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="drillCiFenJianCe2_l4" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="drillCiFenJianCe2_l5" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drillCiFenJianCe21").before($str);
		});
		var drilliFenJianCe22Index = 2;
		$("#addDrillCiFenJianCe22").click(function(){
			var tempDelFileInfoId = "drillCiFenJianCe22" + ++drilliFenJianCe22Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_ll3" /></td>';
			$str+='<td align="center"><select name="drillCiFenJianCe2_ll4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			
			$str+='<td align="center"><select name="drillCiFenJianCe2_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillCiFenJianCe2_ll6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drillCiFenJianCe22").before($str);
		});

		//钻具 热处理
		var drill_reChuLi21Index = 2;
		$("#addDrill_reChuLi21").click(function(){
			var tempDelFileInfoId = "drillReChuLi21" + ++drill_reChuLi21Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_l5" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_reChuLi21").before($str);
		});
		var drill_reChuLi22Index = 2;
		$("#addDrill_reChuLi22").click(function(){
			var tempDelFileInfoId = "drillReChuLi22" + ++drill_reChuLi22Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_ll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_ll4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_ll5" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_reChuLi22").before($str);
		});
		var drill_reChuLi23Index = 2;
		$("#addDrill_reChuLi23").click(function(){
			var tempDelFileInfoId = "drillReChuLi23" + ++drill_reChuLi23Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_lll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_lll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_lll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_lll4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillReChuLi2_lll5" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_reChuLi23").before($str);
		});

		var drillLaShenXingNengIndex = 2;
		$("#addDrillLaShenXingNeng").click(function(){
			var tempDelFileInfoId = "drillLaShenXingNeng" + ++drillLaShenXingNengIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillLaShenXingNeng_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drillLaShenXingNeng").before($str);
		});
		var DrillChongJiIndex = 2;
		$("#addDrillChongJi").click(function(){
			var tempDelFileInfoId = "drillChongJi" + ++DrillChongJiIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillChongJi_l7" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drillChongJi").before($str);
		});
		//钻具  机加工
		var drill_jiJiaGongIndex = 2;
		$("#addDrill_jiJiaGong").click(function(){
			var tempDelFileInfoId = "drillJiJiaGong" + ++drill_jiJiaGongIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillJiJiaGong_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillJiJiaGong_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillJiJiaGong_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillJiJiaGong_l4" /></td>';
			$str+='<td align="center"><select name="drillJiJiaGong_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillJiJiaGong_l6" /></td>';
			$str+='<td align="center"><select name="drillJiJiaGong_l7"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="drillJiJiaGong_l8"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_jiJiaGong").before($str);
		});
		//钻具  耐磨带加工
		var drill_naiMo1Index = 2;
		$("#addDrill_naiMo1").click(function(){
			var tempDelFileInfoId = "drillNaiMo1" + ++drill_naiMo1Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l1" /></td>';
			$str+='<td align="center"><select name="drillNaiMo1_l2"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l7" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l8" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l9" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNaiMo1_l10" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_naiMo1").before($str);
		});

		//钻具  内涂层
		var drill_neiTuCeng2Index = 2;
		$("#addDrill_neiTuCeng2").click(function(){
			var tempDelFileInfoId = "drillNeiTuCeng2" + ++drill_neiTuCeng2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCeng2_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#drill_neiTuCeng2").before($str);
		});

			//钻具 内涂层厚度测量
			var drill_neiTuCengHouDu2Index = 2;
			$("#addDrill_neiTuCengHouDu2").click(function(){
				var tempDelFileInfoId = "drillNeiTuCengHouDu2" + ++drill_neiTuCengHouDu2Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu2_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu2_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu2_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillNeiTuCengHouDu2_l4" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#drill_neiTuCengHouDu2").before($str);
			});

			//钻具 包装发运
			var drill_baoZhuang2Index = 2;
			$("#addDrill_baoZhuang2").click(function(){
				var tempDelFileInfoId = "drillBaoZhuang2" + ++drill_baoZhuang2Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBaoZhuang2_l1" /></td>';
				$str+='<td align="center"><select name="drillBaoZhuang2_l2"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><select name="drillBaoZhuang2_l3"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><select name="drillBaoZhuang2_l4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><select name="drillBaoZhuang2_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="drillBaoZhuang2_l6" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#drill_baoZhuang2").before($str);
			});
});
function delTr(tempTdId){//删除
	var obj  = $("#" + tempTdId);
	$(obj).parent().parent().remove();  
}