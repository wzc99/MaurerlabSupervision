$(function(){
		//其他
		var bendQiTaIndex = 2;
		$("#addbendQiTa").click(function(){
			var tempDelFileInfoId = "bendQiTa" + ++bendQiTaIndex;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="bendQiTa_l1" /></td>';
	        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="bendQiTa_l2" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="bendQiTa_l3" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="bendQiTa_l4" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="bendQiTa_l5" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#bendQiTa").before($str);
		});
		//弯管 煨制
		var wanGuan_weiZhiIndex = 2;
		$("#addWanGuan_weiZhi").click(function(){
			var tempDelFileInfoId = "wanGuanWeiZhi" + ++wanGuan_weiZhiIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWeiZhi_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWeiZhi_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWeiZhi_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWeiZhi_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWeiZhi_l5" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#wanGuan_weiZhi").before($str);
		});
		//弯管 热处理
		var wanGuan_reChuLiIndex = 2;
		$("#addWanGuan_reChuLi").click(function(){
			var tempDelFileInfoId = "wanGuanReChuLi" + ++wanGuan_reChuLiIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanReChuLi_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#wanGuan_reChuLi").before($str);
		});

			var wanGuan_sheXianGuoChengIndex = 2;
			$("#addwanGuan_sheXianGuoCheng").click(function(){
				var tempDelFileInfoId = "wanGuanSheXianGuoCheng" + ++wanGuan_sheXianGuoChengIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianGuoCheng_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianGuoCheng_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianGuoCheng_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianGuoCheng_l4" /></td>';
				$str+='<td align="center"><select name="wanGuanSheXianGuoCheng_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianGuoCheng_l6" /></td>';
				$str+='<td align="center"><select name="wanGuanSheXianGuoCheng_l7"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#wanGuan_sheXianGuoCheng").before($str);
			});
			var wanGuanChaoShengBo1Index = 2;
			$("#addwanGuanChaoShengBo1").click(function(){
				var tempDelFileInfoId = "wanGuanChaoShengBo1" + ++wanGuanChaoShengBo1Index;
			    $str='';
		        $str+='<tr>';
		        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_l1" /></td>';
		        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_l3" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanChaoShengBo_l4" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanChaoShengBo_l5" /></td>';
			    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#wanGuanChaoShengBo1").before($str);
			});
			var wanGuanChaoShengBo2Index = 2;
			$("#addwanGuanChaoShengBo2").click(function(){
				var tempDelFileInfoId = "wanGuanChaoShengBo2" + ++wanGuanChaoShengBo2Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_ll1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_ll2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_ll3" /></td>';
				$str+='<td align="center"><select name="wanGuanChaoShengBo_ll4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><select name="wanGuanChaoShengBo_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_ll6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanChaoShengBo_ll7" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#wanGuanChaoShengBo2").before($str);
			});
		var wanGuanCiFenJianCe1Index = 2;
		$("#addwanGuanCiFenJianCe1").click(function(){
			var tempDelFileInfoId = "wanGuanCiFenJianCe1" + ++wanGuanCiFenJianCe1Index;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_l1" /></td>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_l3" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_l4" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_l5" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#wanGuanCiFenJianCe1").before($str);
		});
		var wanGuanCiFenJianCe2Index = 2;
		$("#addwanGuanCiFenJianCe2").click(function(){
			var tempDelFileInfoId = "wanGuanCiFenJianCe2" + ++wanGuanCiFenJianCe2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_ll3" /></td>';
			$str+='<td align="center"><select name="wanGuanCiFenJianCe_ll4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><select name="wanGuanCiFenJianCe_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="wanGuanCiFenJianCe_ll6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#wanGuanCiFenJianCe2").before($str);
		});

		var wanGuanShenTouJianCe1Index = 2;
		$("#addwanGuanShenTouJianCe1").click(function(){
			var tempDelFileInfoId = "wanGuanShenTouJianCe1" + ++wanGuanShenTouJianCe1Index;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_l1" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_l2" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_l3" /></td>';
			$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_l4" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#wanGuanShenTouJianCe1").before($str);
		});
		var wanGuanShenTouJianCe2Index = 2;
		$("#addwanGuanShenTouJianCe2").click(function(){
			var tempDelFileInfoId = "wanGuanShenTouJianCe2" + ++wanGuanShenTouJianCe2Index;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_ll1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_ll2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_ll3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_ll4" /></td>';
			$str+='<td align="center"><select name="wanGuanShenTouJianCe_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShenTouJianCe_ll6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#wanGuanShenTouJianCe2").before($str);
		});

			var wanGuanSheXianDiPianIndex = 2;
			$("#addwanGuanSheXianDiPian").click(function(){
				var tempDelFileInfoId = "wanGuanSheXianDiPian" + ++wanGuanSheXianDiPianIndex;
			    $str='';
		        $str+='<tr>';
		        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l1" /></td>';
		        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanSheXianDiPian_l7" /></td>';
			    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#wanGuanSheXianDiPian").before($str);
			});

				var wanGuan_shuiYaShiYanIndex = 2;
				$("#addwanGuan_shuiYaShiYan").click(function(){
					var tempDelFileInfoId = "wanGuanShuiYaShiYan" + ++wanGuan_shuiYaShiYanIndex;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l3" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l4" /></td>';
					$str+='<td align="center"><select name="wanGuanShuiYaShiYan_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l6" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l7" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanShuiYaShiYan_l8" /></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#wanGuan_shuiYaShiYan").before($str);
				});
			//弯管 弯管清洁
			var wanGuan_qingJieIndex = 2;
			$("#addWanGuan_qingJie").click(function(){
				var tempDelFileInfoId = "wanGuanQingJie" + ++wanGuan_qingJieIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanQingJie_l7" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#wanGuan_qingJie").before($str);
			});
			//弯管 弯管涂覆
			var wanGuan_tuFuIndex = 2;
			$("#addWanGuan_tuFu").click(function(){
				var tempDelFileInfoId = "wanGuanTuFu" + ++wanGuan_tuFuIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanTuFu_l6" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#wanGuan_tuFu").before($str);
			});
			//弯管 防腐层性能检验
			var wanGuan_xingNengIndex = 2;
			$("#addWanGuan_xingNeng").click(function(){
				var tempDelFileInfoId = "wanGuanXingNeng" + ++wanGuan_xingNengIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l7" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l8" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanXingNeng_l9" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#wanGuan_xingNeng").before($str);
			});
			//弯管 防腐层外观尺寸
			var wanGuan_waiGuanIndex = 2;
			$("#addWanGuan_waiGuan").click(function(){
				var tempDelFileInfoId = "wanGuanWaiGuan" + ++wanGuan_waiGuanIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l7" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanWaiGuan_l8" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#wanGuan_waiGuan").before($str);
			});
			//弯管 包装发运
			var wanGuan_baoZhuangIndex = 2;
			$("#addWanGuan_baoZhuang").click(function(){
				var tempDelFileInfoId = "wanGuanBaoZhuang" + ++wanGuan_baoZhuangIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanBaoZhuang_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanBaoZhuang_l2" /></td>';
				$str+='<td align="center"><select name="wanGuanBaoZhuang_l3"><option value="防腐">防腐</option><option value="光管">光管</option></select></td>';
				$str+='<td align="center"><select name="wanGuanBaoZhuang_l4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><select name="wanGuanBaoZhuang_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><select name="wanGuanBaoZhuang_l6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><select name="wanGuanBaoZhuang_l7"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#wanGuan_baoZhuang").before($str);
			});
			var wanGuanLaShenXingNengIndex = 2;
			$("#addwanGuanLaShenXingNeng").click(function(){
				var tempDelFileInfoId = "wanGuanLaShenXingNeng" + ++wanGuanLaShenXingNengIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l5" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="wanGuanLaShenXingNeng_l6" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#wanGuanLaShenXingNeng").before($str);
			});
});
function delTr(tempTdId){//删除
	var obj  = $("#" + tempTdId);
	$(obj).parent().parent().remove();  
}