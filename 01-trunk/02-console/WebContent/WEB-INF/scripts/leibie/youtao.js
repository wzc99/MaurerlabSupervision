$(function(){
		//其他
		var oilPipeQiTaIndex = 2;
		$("#addoilPipeQiTa").click(function(){
			var tempDelFileInfoId = "oilPipeQiTa" + ++oilPipeQiTaIndex;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="oilPipeQiTa_l1" /></td>';
	        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="oilPipeQiTa_l2" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="oilPipeQiTa_l3" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="oilPipeQiTa_l4" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="oilPipeQiTa_l5" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipeQiTa").before($str);
		});

		var oilPipe_touLiaoIndex = 2;
		$("#addoilPipe_touLiao").click(function(){
			var tempDelFileInfoId = "oilPipeTouLiao" + ++oilPipe_touLiaoIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTouLiao_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTouLiao_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTouLiao_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTouLiao_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTouLiao_l5" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipe_touLiao").before($str);
		});

		//石油专用管  成型焊接
		var oilPipe_chengXingIndex = 2;
		$("#addOilPipe_chengXing").click(function(){
			var tempDelFileInfoId = "oilPipeChengXing" + ++oilPipe_chengXingIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChengXing_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipe_chengXing").before($str);
		});
		//石油专用管   热轧、外购管坯
		var oilPipe_reZhaIndex = 2;
		$("#addOilPipe_reZha").click(function(){
			var tempDelFileInfoId = "oilPipeReZha" + ++oilPipe_reZhaIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReZha_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReZha_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReZha_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReZha_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReZha_l5" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipe_reZha").before($str);
		});
		//管端加厚
		var oilPipe_guanDuanIndex = 2;
		$("#addoilPipe_guanDuan").click(function(){
			var tempDelFileInfoId = "oilPipeGuanDuan" + ++oilPipe_guanDuanIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeGuanDuan_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeGuanDuan_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeGuanDuan_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeGuanDuan_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeGuanDuan_l5" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipe_guanDuan").before($str);
		});

		//石油专用管   热处理
		var oilPipe_reChuLiIndex = 2;
		$("#addOilPipe_reChuLi").click(function(){
			var tempDelFileInfoId = "oilPipeReChuLi" + ++oilPipe_reZhaIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReChuLi_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReChuLi_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReChuLi_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReChuLi_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeReChuLi_l5" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipe_reChuLi").before($str);
		});
		var oilPipe_chaoShengBo1Index = 2;
		$("#addoilPipe_chaoShengBo1").click(function(){
			var tempDelFileInfoId = "oilPipeChaoShengBo1" + ++oilPipe_chaoShengBo1Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_l1" /></td>';
			$str+='<td align="center"><select name="oilPipeChaoShengBo_l2"><option value="连探">连探</option><option value="手探">手探</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_l5" /></td>';
			$str+='<td align="center" colspan="3"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_l6" /></td>';
			$str+='<td align="center" ><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipe_chaoShengBo1").before($str);
		});
		var oilPipe_chaoShengBo2Index = 2;
		$("#addoilPipe_chaoShengBo2").click(function(){
			var tempDelFileInfoId = "oilPipeChaoShengBo2" + ++oilPipe_chaoShengBo2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll3" /></td>';
			$str+='<td align="center"><select name="oilPipeChaoShengBo_ll4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="oilPipeChaoShengBo_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll7" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeChaoShengBo_ll8" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipe_chaoShengBo2").before($str);
		});
		var oilPipeCiFenJianCe1Index = 2;
		$("#addoilPipeCiFenJianCe1").click(function(){
			var tempDelFileInfoId = "oilPipeCiFenJianCe1" + ++oilPipeCiFenJianCe1Index;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_l1" /></td>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_l3" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_l4" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_l5" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipeCiFenJianCe1").before($str);
		});
		var oilPipeCiFenJianCe2Index = 2;
		$("#addoilPipeCiFenJianCe2").click(function(){
			var tempDelFileInfoId = "oilPipeCiFenJianCe2" + ++oilPipeCiFenJianCe2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll5" /></td>';
			$str+='<td align="center"><select name="oilPipeCiFenJianCe_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeCiFenJianCe_ll7" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipeCiFenJianCe2").before($str);
		});
		var oilPipeShenTouJianCe1Index = 2;
		$("#addoilPipeShenTouJianCe1").click(function(){
			var tempDelFileInfoId = "oilPipeShenTouJianCe1" + ++oilPipeShenTouJianCe1Index;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center" colspan="1"><input class="input_140 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_l1" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_l2" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_l3" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_l4" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipeShenTouJianCe1").before($str);
		});
		var oilPipeShenTouJianCe2Index = 2;
		$("#addoilPipeShenTouJianCe2").click(function(){
			var tempDelFileInfoId = "oilPipeShenTouJianCe2" + ++oilPipeShenTouJianCe2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll4" /></td>';
			$str+='<td align="center"><select name="oilPipeShenTouJianCe_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';

			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShenTouJianCe_ll7" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipeShenTouJianCe2").before($str);
		});
		//石油专用管   拧接岗位
		var oilPipe_ningJieIndex = 2;
		$("#addOilPipe_ningJie").click(function(){
			var tempDelFileInfoId = "oilPipeNingJie" + ++oilPipe_ningJieIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeNingJie_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeNingJie_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeNingJie_l3" /></td>';
			$str+='<td align="center"><select name="oilPipeNingJie_l4"><option value="手动">手动</option><option value="自动">自动</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeNingJie_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeNingJie_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipe_ningJie").before($str);
		});
		//石油专用管  通径试验
		var oilPipe_tongJingIndex = 2;
		$("#addOilPipe_tongJing").click(function(){
			var tempDelFileInfoId = "oilPipeTongJing" + ++oilPipe_tongJingIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTongJing_l1" /></td>';
			$str+='<td align="center"><select name="oilPipeTongJing_l2"><option value="全长通径">全长通径</option><option value="拧接端通径">拧接端通径</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTongJing_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeTongJing_l4" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipe_tongJing").before($str);
		});
		//石油专用管  水压试验
		var oilPipe_shuiYaIndex = 2;
		$("#addOilPipe_shuiYa").click(function(){
			var tempDelFileInfoId = "oilPipeShuiYa" + ++oilPipe_shuiYaIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShuiYa_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShuiYa_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShuiYa_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeShuiYa_l4" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipe_shuiYa").before($str);
		});

		var oilPipe_baoZhuangIndex = 2;
		$("#addoilPipe_baoZhuang").click(function(){
			var tempDelFileInfoId = "oilPipeBaoZhuang" + ++oilPipe_baoZhuangIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeBaoZhuang_l1" /></td>';
			$str+='<td align="center"><select name="oilPipeBaoZhuang_l2"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="oilPipeBaoZhuang_l3"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="oilPipeBaoZhuang_l4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="oilPipeBaoZhuang_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeBaoZhuang_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#oilPipe_baoZhuang").before($str);
		});
			var oilPipeLaShenXingNengIndex = 2;
			$("#addoilPipeLaShenXingNeng").click(function(){
				var tempDelFileInfoId = "oilPipeLaShenXingNeng" + ++oilPipeLaShenXingNengIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng_l7" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#oilPipeLaShenXingNeng").before($str);
			});
			var oilPipeLaShenXingNeng1Index = 2;
			$("#addoilPipeLaShenXingNeng1").click(function(){
				var tempDelFileInfoId = "oilPipeLaShenXingNeng1" + ++oilPipeLaShenXingNeng1Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="oilPipeLaShenXingNeng1_l6" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#oilPipeLaShenXingNeng1").before($str);
			});
});

function delTr(tempTdId){//删除
	var obj  = $("#" + tempTdId);
	$(obj).parent().parent().remove();  
}