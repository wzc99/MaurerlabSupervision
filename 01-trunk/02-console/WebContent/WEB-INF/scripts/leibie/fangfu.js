$(function(){
	var fangFuqiTaIndex = 2;
	$("#addfangFuQiTa").click(function(){
		var tempDelFileInfoId = "fangFufileInfoTab" + ++fangFuqiTaIndex;
	    $str='';
        $str+='<tr>';
        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="fangFuQiTa_l1" /></td>';
        $str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="fangFuQiTa_l2" /></td>';
		$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="fangFuQiTa_l3" /></td>';
		$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="fangFuQiTa_l4" /></td>';
		$str+='<td align="center"><input class="input_100 easyui-validatebox" type="text" name="fangFuQiTa_l5" /></td>';
	    $str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
	    $str+='</tr>';
	    $("#fangFuQiTa").before($str);
	});
	var fangFu_qingJieIndex = 2;
	$("#addfangFu_qingJie").click(function(){
		var tempDelFileInfoId = "fangfuQingJieInfoTab" + ++fangFu_qingJieIndex;
	    $str='';
        $str+='<tr>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l1" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l2" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l3" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l4" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l5" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l6" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuQingJie_l7" /></td>';
		$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
	    $str+='</tr>';
	    $("#fangFu_qingJie").before($str);
	});
	var fangFu_neiTuCengIndex = 2;
	$("#addfangFu_neiTuCeng").click(function(){
		var tempDelFileInfoId = "fangFuNeiTuCeng" + ++fangFu_neiTuCengIndex;
	    $str='';
        $str+='<tr>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l1" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l2" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l3" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l4" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l5" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuNeiTuCeng_l6" /></td>';
		$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
	    $str+='</tr>';
	    $("#fangFu_neiTuCeng").before($str);
	});
	var fangFu_xingNengIndex = 2;
	$("#addfangFu_xingNeng").click(function(){
		var tempDelFileInfoId = "fangFuXingNeng" + ++fangFu_xingNengIndex;
	    $str='';
        $str+='<tr>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l1" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l2" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l3" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l4" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l5" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l6" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l7" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l8" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuXingNeng_l9" /></td>';
		$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
	    $str+='</tr>';
	    $("#fangFu_xingNeng").before($str);
	});
		var fangFu_waiGuanIndex = 2;
		$("#addfangFu_waiGuan").click(function(){
			var tempDelFileInfoId = "fangFuWaiGuan" + ++fangFu_waiGuanIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l7" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="fangFuWaiGuan_l8" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#fangFu_waiGuan").before($str);
		});
		var delbend_waiHuIndex = 2;
		$("#addDelbend_waiHu").click(function(){
			var tempDelFileInfoId = "delbendWaiHu" + ++delbend_waiHuIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendWaiHu_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendWaiHu_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendWaiHu_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendWaiHu_l4" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#delbend_waiHu").before($str);
		});
	//输送管弯管  钢管保温生产
	var delbend_baoWenIndex = 2;
	$("#addDelbend_baoWen").click(function(){
		var tempDelFileInfoId = "delbendBaoWen" + ++delbend_baoWenIndex;
	    $str='';
        $str+='<tr>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l1" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l2" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l3" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l4" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l5" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l6" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l7" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendBaoWen_l8" /></td>';
		$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
	    $str+='</tr>';
	    $("#delbend_baoWen").before($str);
	});
	//输送管弯管  保温
	var delbend_fangMao1Index = 2;
	$("#addDelbend_fangMao1").click(function(){
		var tempDelFileInfoId = "delbendFangMao1" + ++delbend_fangMao1Index;
	    $str='';
        $str+='<tr>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_l1" /></td>';
		$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_l2" /></td>';
		$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_l3" /></td>';
		$str+='<td align="center" colspan="2"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_l4" /></td>';
		$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
	    $str+='</tr>';
	    $("#delbend_fangMao1").before($str);
	});
	var delbend_fangMao2Index = 2;
	$("#addDelbend_fangMao2").click(function(){
		var tempDelFileInfoId = "delbendFangMao2" + ++delbend_fangMao2Index;
	    $str='';
        $str+='<tr>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll1" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll2" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll3" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll4" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll5" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll6" /></td>';
		$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendFangMao_ll7" /></td>';
		$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
	    $str+='</tr>';
	    $("#delbend_fangMao2").before($str);
	});
		var delbend_qingJieIndex = 2;
		$("#adddelbend_qingJie").click(function(){
			var tempDelFileInfoId = "delbendQingJieInfoTab" + ++delbend_qingJieIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l6" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendQingJie_l7" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#delbend_qingJie").before($str);
		});
		var delbend_neiTuCengIndex = 2;
		$("#adddelbend_neiTuCeng").click(function(){
			var tempDelFileInfoId = "delbendNeiTuCeng" + ++delbend_neiTuCengIndex;
		    $str='';
	        $str+='<tr>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l1" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l2" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l3" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l4" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l5" /></td>';
			$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendNeiTuCeng_l6" /></td>';
			$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
		    $str+='</tr>';
		    $("#delbend_neiTuCeng").before($str);
		});
			//输送管弯管  防腐层厚度测量
			var delbend_houDuIndex = 2;
			$("#addDelbend_houDu").click(function(){
				var tempDelFileInfoId = "delbendHouDu" + ++delbend_houDuIndex;
			    $str='';
		        $str+='<tr>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendHouDu_l1" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendHouDu_l2" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendHouDu_l3" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendHouDu_l4" /></td>';
				$str+='<td align="center"><input class="input_80 easyui-validatebox" type="text" name="delbendHouDu_l5" /></td>';
				$str+='<td align="center"><a id="'+tempDelFileInfoId+'" 	href="javascript:delTr(\''+tempDelFileInfoId+'\')" >删除</a></td>';
			    $str+='</tr>';
			    $("#delbend_houDu").before($str);
			});
});
function delTr(tempTdId){//删除
	var obj  = $("#" + tempTdId);
	$(obj).parent().parent().remove();  
}

