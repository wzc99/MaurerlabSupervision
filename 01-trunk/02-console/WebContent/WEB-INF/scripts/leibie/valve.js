$(function() {
	//其他
		var faMenQiTaIndex = 2;
		$("#addFaMenQiTa").click(function(){
			var tempDelFileInfoId = "faMenQiTa" + ++faMenQiTaIndex;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="faMenQiTa_l1" /></td>';
	        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="faMenQiTa_l2" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="faMenQiTa_l3" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="faMenQiTa_l4" /></td>';
			$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="faMenQiTa_l5" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#faMenQiTa").before($str);
		});

		//焊接
		var faMenHanJieIndex = 2;
		$("#addfaMenHanJie").click(function(){
			var tempDelFileInfoId = "faMenHanJie" + ++faMenHanJieIndex;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l1" /></td>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l5" /></td>';
			$str+='<td align="center"><select name="faMenHanJie_l6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l7" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l8" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenHanJie_l9" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#faMenHanJie").before($str);
		});

		//设备  射线检测过程
		var faMen_sheXianGuoChengIndex = 2;
		$("#addfaMen_sheXianGuoCheng").click(function(){
			var tempDelFileInfoId = "faMenSheXianGuoCheng" + ++faMen_sheXianGuoChengIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianGuoCheng_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianGuoCheng_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianGuoCheng_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianGuoCheng_l4" /></td>';
			$str+='<td align="center"><select name="faMenSheXianGuoCheng_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianGuoCheng_l6" /></td>';
			$str+='<td align="center"><select name="faMenSheXianGuoCheng_l7"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#faMen_sheXianGuoCheng").before($str);
		});

		var faMenSheXianDiPianIndex = 2;
		$("#addfaMenSheXianDiPian").click(function(){
			var tempDelFileInfoId = "faMenSheXianDiPian" + ++faMenSheXianDiPianIndex;
		    $str='';
	        $str+='<tr>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l1" /></td>';
	        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenSheXianDiPian_l7" /></td>';
		    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#faMenSheXianDiPian").before($str);
		});

			//超声波
			var faMenChaoShengBo1Index = 2;
			$("#addfaMenChaoShengBo1").click(function(){
				var tempDelFileInfoId = "faMenChaoShengBo1" + ++faMenChaoShengBo1Index;
			    $str='';
		        $str+='<tr>';
		        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_l1" /></td>';
		        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_l3" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenChaoShengBo_l4" /></td>';
				$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenChaoShengBo_l5" /></td>';
			    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#faMenChaoShengBo1").before($str);
			});
			var faMenChaoShengBo2Index = 2;
			$("#addfaMenChaoShengBo2").click(function(){
				var tempDelFileInfoId = "faMenChaoShengBo2" + ++faMenChaoShengBo2Index;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_ll1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_ll2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_ll3" /></td>';
				$str+='<td align="center"><select name="faMenChaoShengBo_ll4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><select name="faMenChaoShengBo_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_ll6" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChaoShengBo_ll7" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#faMenChaoShengBo2").before($str);
			});

				// 阀门 磁粉检测
				var faMenCiFenJianCe1Index = 2;
				$("#addfaMenCiFenJianCe1").click(function(){
					var tempDelFileInfoId = "faMenCiFenJianCe1" + ++faMenCiFenJianCe1Index;
				    $str='';
			        $str+='<tr>';
			        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_l1" /></td>';
			        $str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_l2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_l3" /></td>';
					$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenCiFenJianCe_l4" /></td>';
					$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenCiFenJianCe_l5" /></td>';
				    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#faMenCiFenJianCe1").before($str);
				});
				var faMenCiFenJianCe2Index = 2;
				$("#addfaMenCiFenJianCe2").click(function(){
					var tempDelFileInfoId = "faMenCiFenJianCe2" + ++faMenCiFenJianCe2Index;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_ll1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_ll2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_ll3" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_ll4" /></td>';
					$str+='<td align="center"><select name="faMenCiFenJianCe_ll5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><select name="faMenCiFenJianCe_ll6"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenCiFenJianCe_ll7" /></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#faMenCiFenJianCe2").before($str);
				});

					//阀门 渗透检测
					var faMenShenTouJianCe1Index = 2;
					$("#addfaMenShenTouJianCe1").click(function(){
						var tempDelFileInfoId = "faMenShenTouJianCe1" + ++faMenShenTouJianCe1Index;
					    $str='';
				        $str+='<tr>';
				        $str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenShenTouJianCe_l1" /></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenShenTouJianCe_l2" /></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenShenTouJianCe_l3" /></td>';
						$str+='<td align="center" colspan="2"><input class="input_140 easyui-validatebox" type="text" name="faMenShenTouJianCe_l4" /></td>';
					    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
					    $str+='</tr>';
					    $("#faMenShenTouJianCe1").before($str);
					});
					var faMenShenTouJianCe2Index = 2;
					$("#addfaMenShenTouJianCe2").click(function(){
						var tempDelFileInfoId = "faMenShenTouJianCe2" + ++faMenShenTouJianCe2Index;
					    $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll1" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll2" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll3" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll4" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll5" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll6" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll7" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenShenTouJianCe_ll8" /></td>';
						$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
					    $str+='</tr>';
					    $("#faMenShenTouJianCe2").before($str);
					});

					//阀门组装
					var faMenZuZhuangIndex = 2;
					$("#addFaMenZuZhuang").click(function(){
						var tempDelFileInfoId = "faMenZuZhuang" + ++faMenZuZhuangIndex;
					    $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenZuZhuang_l1" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenZuZhuang_l2" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenZuZhuang_l3" /></td>';
						$str+='<td align="center"><select name="faMenZuZhuang_l4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
						$str+='<td align="center"><select name="faMenZuZhuang_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenZuZhuang_l6" /></td>';
						$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
					    $str+='</tr>';
					    $("#faMenZuZhuang").before($str);
					});
				//除锈油漆
				var faMenChuXiuYouQiIndex = 2;
				$("#addfaMenChuXiuYouQi").click(function(){
					var tempDelFileInfoId = "faMenChuXiuYouQi" + ++faMenChuXiuYouQiIndex;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l3" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l4" /></td>';
					$str+='<td align="center"><select name="faMenChuXiuYouQi_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l6" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenChuXiuYouQi_l7" /></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#faMenChuXiuYouQi").before($str);
				});

				//包装发运
				var faMenBaoZhuangFaYunIndex = 2;
				$("#addfaMenBaoZhuangFaYun").click(function(){
					var tempDelFileInfoId = "faMenBaoZhuangFaYun" + ++faMenBaoZhuangFaYunIndex;
				    $str='';
			        $str+='<tr>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenBaoZhuangFaYun_l1" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenBaoZhuangFaYun_l2" /></td>';
					$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenBaoZhuangFaYun_l3" /></td>';
					$str+='<td align="center"><select name="faMenBaoZhuangFaYun_l4"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><select name="faMenBaoZhuangFaYun_l5"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
					$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
				    $str+='</tr>';
				    $("#faMenBaoZhuangFaYun").before($str);
				});

					//压力试验
					var faMenYaLiShiYanIndex = 2;
					$("#addfaMenYaLiShiYan").click(function(){
						var tempDelFileInfoId = "faMenYaLiShiYan" + ++faMenYaLiShiYanIndex;
					    $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenYaLiShiYan_l1" /></td>';
						$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenYaLiShiYan_l2" /></td>';
						$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenYaLiShiYan_l3" /></td>';
						$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l4" /></td>';
						$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l5" /></td>';
						$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l6" /></td>';
						$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l7" /></td>';
						$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l8" /></td>';
						$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l9" /></td>';
						$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l10" /></td>';
						$str+='<td align="center"><input class="input_40 easyui-validatebox" type="text" name="faMenYaLiShiYan_l11" /></td>';
						$str+='<td align="center"><select name="faMenYaLiShiYan_l12"><option value="符合">符合</option><option value="不符合">不符合</option></select></td>';
						$str+='<td align="center"><input class="input_60 easyui-validatebox" type="text" name="faMenYaLiShiYan_l13" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenYaLiShiYan_l14" /></td>';
						$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
					    $str+='</tr>';
					    $("#faMenYaLiShiYan").before($str);
					});

					//阀门 拉伸性能
					var faMenLaShenXingNengIndex = 2;
					$("#addfaMenLaShenXingNeng").click(function(){
						var tempDelFileInfoId = "faMenLaShenXingNeng" + ++faMenLaShenXingNengIndex;
					    $str='';
				        $str+='<tr>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l1" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l2" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l3" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l4" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l5" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l6" /></td>';
						$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="faMenLaShenXingNeng_l7" /></td>';
						$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
					    $str+='</tr>';
					    $("#faMenLaShenXingNeng").before($str);
					});
});

function delTr(tempTdId){//删除
	var obj  = $("#" + tempTdId);
	$(obj).parent().parent().remove();  
}