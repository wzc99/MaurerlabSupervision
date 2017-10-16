package sys.spvisor.core.util;

/**
 * 枚举类放多个常量<br>
 * 订单状态等
 * 
 * @author ZhaoYundi
 * @date 2016年11月7日
 */
public class Enumerations {
	/** 返回状态码 */
	public enum ReturnCode {
		参数格式错误("100"), 参数不正确("101"), 安全验证失败("102"), 安全验证不合法("103"), 执行超时("104"), 执行失败("105"), 成功("200"), 服务器错误(
				"500"), 没有权限("300");
		private String code;

		private ReturnCode(String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}

		public static ReturnCode getReturnCode(String code) {
			switch (code) {
			case "100":
				return 参数格式错误;
			case "101":
				return 参数不正确;
			case "102":
				return 安全验证失败;
			case "103":
				return 安全验证不合法;
			case "104":
				return 执行超时;
			case "105":
				return 执行失败;
			case "500":
				return 服务器错误;
			case "300":
				return 没有权限;
			default:
				return 成功;
			}
		}
	}

	public static ReturnDatas getReturnDatasByServiceCode(int code) {
		switch (code) {
		case 0:
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.执行失败.getCode(), "执行失败");
		case 2:
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.安全验证不合法.getCode(), "非法操作");
		case 3:
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.参数不正确.getCode(), "参数验证失败");
		case 4:
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.没有权限.getCode(), "非法权限");
		default:
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.执行失败.getCode(), "执行失败");
		}
	}

	/** 返回状态码 */
	public enum ServiceReturnCode {
		出错或异常(0), 操作成功(1), 非法操作(2), 参数验证出错(3), 非法权限(4);
		private int code;

		private ServiceReturnCode(int code) {
			this.code = code;
		}

		public int getCode() {
			return code;
		}

		public static ServiceReturnCode getReturnCode(int code) {
			switch (code) {
			case 0:
				return 出错或异常;
			case 1:
				return 操作成功;
			case 2:
				return 非法操作;
			case 3:
				return 参数验证出错;
			case 4:
				return 非法权限;
			default:
				return 出错或异常;
			}
		}
	}

}
