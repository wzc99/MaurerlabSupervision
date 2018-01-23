
$(function() {
	var sheBeiqiTaIndex = 2;
	$("#addSheBeiQiTa").click(function(){
		var tempDelFileInfoId = "shebeiQiTa" + ++sheBeiqiTaIndex;
	    $str='';
        $str+='<tr>';
        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="shebeiQiTa_l1" /></td>';
        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="shebeiQiTa_l2" /></td>';
		$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="shebeiQiTa_l3" /></td>';
		$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="shebeiQiTa_l4" /></td>';
		$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="shebeiQiTa_l5" /></td>';
	    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
	    $str+='</tr>';
	    $("#shebeiQiTa").before($str);
	});

	//设备  
		var sheBei_quDongIndex = 2;
		$("#addSheBei_quDong").click(function(){
			var tempDelFileInfoId = "sheBeiQuDong" + ++sheBei_quDongIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiQuDong_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#sheBei_quDong").before($str);
		});
		//设备 下料
		var sheBei_xiaLiaoIndex = 2;
		$("#addSheBei_xiaLiao").click(function(){
			var tempDelFileInfoId = "sheBeiXiaLiao" + ++sheBei_xiaLiaoIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiXiaLiao_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiXiaLiao_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiXiaLiao_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiXiaLiao_l4" /></td>';
			$str+='<td align="center"><select name="sheBeiXiaLiao_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="sheBeiXiaLiao_l6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#sheBei_xiaLiao").before($str);
		});
		//设备 筒体成型校圆
		var sheBei_tongTiIndex = 2;
		$("#addSheBei_tongTi").click(function(){
			var tempDelFileInfoId = "sheBeiTongTi" + ++sheBei_tongTiIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l7" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiTongTi_l8" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#sheBei_tongTi").before($str);
		});

		//设备 焊接
		var sheBei_hanJie1Index = 2;
		$("#addSheBei_hanJie1").click(function(){
			var tempDelFileInfoId = "sheBeiHanJie1" + ++sheBei_hanJie1Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_l2" /></td>';
			$str+='<td align="center"><select name="sheBeiHanJie_l3"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_l5" /></td>';
			$str+='<td align="center" colspan="2"><select name="sheBeiHanJie_l6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#sheBei_hanJie1").before($str);
		});
		var sheBei_hanJie2Index = 2;
		$("#addSheBei_hanJie2").click(function(){
			var tempDelFileInfoId = "heBeiHanJie2" + ++sheBei_hanJie2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_ll3" /></td>';
			$str+='<td align="center"><select name="sheBeiHanJie_ll4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="sheBeiHanJie_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_ll6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHanJie_ll7" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#sheBei_hanJie2").before($str);
		});
		//设备  射线检测过程
		var sheBei_sheXianGuoChengIndex = 2;
		$("#addSheBei_sheXianGuoCheng").click(function(){
			var tempDelFileInfoId = "sheBeiSheXianGuoCheng" + ++sheBei_sheXianGuoChengIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianGuoCheng_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianGuoCheng_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianGuoCheng_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianGuoCheng_l4" /></td>';
			$str+='<td align="center"><select name="sheBeiSheXianGuoCheng_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianGuoCheng_l6" /></td>';
			$str+='<td align="center"><select name="sheBeiSheXianGuoCheng_l7"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#sheBei_sheXianGuoCheng").before($str);
		});

		//阀门 超声波
		var sheBeiChaoShengBo1Index = 2;
		$("#addsheBeiChaoShengBo1").click(function(){
			var tempDelFileInfoId = "sheBeiChaoShengBo1" + ++sheBeiChaoShengBo1Index;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_l1" /></td>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_l3" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiChaoShengBo_l4" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiChaoShengBo_l5" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#sheBeiChaoShengBo1").before($str);
		});
		var sheBeiChaoShengBo2Index = 2;
		$("#addsheBeiChaoShengBo2").click(function(){
			var tempDelFileInfoId = "sheBeiChaoShengBo2" + ++sheBeiChaoShengBo2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_ll3" /></td>';
			$str+='<td align="center"><select name="sheBeiChaoShengBo_ll4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="sheBeiChaoShengBo_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_ll6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChaoShengBo_ll7" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#sheBeiChaoShengBo2").before($str);
		});

			// 阀门 磁粉检测
			var ciFenJianCe1Index = 2;
			$("#addSheBeiCiFenJianCe1").click(function(){
				var tempDelFileInfoId = "SheBeiCiFenJianCe1" + ++ciFenJianCe1Index;
			    $str='';
		        $str+='<tr>';
		        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="ciFenJianCe_l1" /></td>';
		        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="ciFenJianCe_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="ciFenJianCe_l3" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="ciFenJianCe_l4" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="ciFenJianCe_l5" /></td>';
			    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#sheBeiCiFenJianCe1").before($str);
			});
			var ciFenJianCe2Index = 2;
			$("#addSheBeiCiFenJianCe2").click(function(){
				var tempDelFileInfoId = "SheBeiCiFenJianCe2" + ++ciFenJianCe2Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="ciFenJianCe_ll1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="ciFenJianCe_ll2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="ciFenJianCe_ll3" /></td>';
				$str+='<td align="center"><select name="ciFenJianCe_ll4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><select name="ciFenJianCe_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="ciFenJianCe_ll6" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#sheBeiCiFenJianCe2").before($str);
			});
				//阀门 渗透检测
				var sheBeishenTouJianCe1Index = 2;
				$("#addSheBeiShenTouJianCe1").click(function(){
					var tempDelFileInfoId = "SheBeiShenTouJianCe1" + ++sheBeishenTouJianCe1Index;
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_l1" /></td>';
					$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_l2" /></td>';
					$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_l3" /></td>';
					$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_l4" /></td>';
				    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#sheBeiShenTouJianCe1").before($str);
				});
				var sheBeishenTouJianCe2Index = 2;
				$("#addSheBeiShenTouJianCe2").click(function(){
					var tempDelFileInfoId = "SheBeiShenTouJianCe2" + ++sheBeishenTouJianCe2Index;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_ll1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_ll2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_ll3" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_ll4" /></td>';
					$str+='<td align="center"><select name="sheBeiShenTouJianCe_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShenTouJianCe_ll6" /></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#sheBeiShenTouJianCe2").before($str);
				});
				var SheBeiSheXianDiPianIndex = 2;
				$("#addSheBeiSheXianDiPian").click(function(){
					var tempDelFileInfoId = "SheBeiSheXianDiPian" + ++sheBeishenTouJianCe2Index;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l3" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l4" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l5" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l6" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiSheXianDiPian_l7" /></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#SheBeiSheXianDiPian").before($str);
				});

				var SheBeiHuaXianIndex = 2;
				$("#addSheBei_huaXian").click(function(){
					var tempDelFileInfoId = "SheBeiHuaXian" + ++SheBeiHuaXianIndex;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHuaXian_l1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHuaXian_l2" /></td>';
					$str+='<td align="center"><select name="sheBeiHuaXian_l3"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHuaXian_l4" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHuaXian_l5" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHuaXian_l6" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiHuaXian_l7" /></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#sheBei_huaXian").before($str);
				});
				var SheBeiReChuLiIndex = 2;
				$("#addSheBei_reChuLi").click(function(){
					var tempDelFileInfoId = "SheBeiReChuLi" + ++SheBeiReChuLiIndex;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiReChuLi_l1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiReChuLi_l2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiReChuLi_l3" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiReChuLi_l4" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiReChuLi_l5" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiReChuLi_l6" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiReChuLi_l7" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiReChuLi_l8" /></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#sheBei_reChuLi").before($str);
				});

				var sheBeiShuiYaIndex = 2;
				$("#addSheBei_shuiYa").click(function(){
					var tempDelFileInfoId = "sheBeiShuiYa" + ++sheBeiShuiYaIndex;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShuiYa_l1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShuiYa_l2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShuiYa_l3" /></td>';
					$str+='<td align="center"><select name="sheBeiShuiYa_l4"><option value="立">立</option><option value="卧">卧</option></select></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShuiYa_l5" /></td>';
					$str+='<td align="center"><select name="sheBeiShuiYa_l6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShuiYa_l7" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShuiYa_l8" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiShuiYa_l9" /></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#sheBei_shuiYa").before($str);
				});
				var sheBeiChuXiuIndex = 2;
				$("#addSheBei_chuXiu").click(function(){
					var tempDelFileInfoId = "sheBeiChuXiu" + ++sheBeiChuXiuIndex;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChuXiu_l1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChuXiu_l2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChuXiu_l3" /></td>';
					$str+='<td align="center"><select name="sheBeiChuXiu_l4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><select name="sheBeiChuXiu_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><select name="sheBeiChuXiu_l6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChuXiu_l7" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiChuXiu_l8" /></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#sheBei_chuXiu").before($str);
				});
				var sheBeiBaoZhuangIndex = 2;
				$("#addSheBei_baoZhuang").click(function(){
					var tempDelFileInfoId = "sheBeiBaoZhuang" + ++sheBeiBaoZhuangIndex;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiBaoZhuang_l1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiBaoZhuang_l2" /></td>';
					$str+='<td align="center"><select name="sheBeiBaoZhuang_l3"><option value="整体">整体</option><option value="分段">分段</option></select></td>';
					$str+='<td align="center"><select name="sheBeiBaoZhuang_l4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><select name="sheBeiBaoZhuang_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><select name="sheBeiBaoZhuang_l6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><select name="sheBeiBaoZhuang_l7"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><select name="sheBeiBaoZhuang_l8"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><select name="sheBeiBaoZhuang_l9"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#sheBei_baoZhuang").before($str);
				});

			var sheBei_laShenIndex = 2;
			$("#addSheBeiLaShenXingNeng").click(function(){
				var tempDelFileInfoId = "SheBeiLaShenXingNeng" + ++sheBei_laShenIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="sheBeiLaShen_l7" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#sheBei_laShen").before($str);
			});
				
});			


function delTr(tempTdId){//删除
	var obj  = $("#" + tempTdId);
	$(obj).parent().parent().remove();  
}