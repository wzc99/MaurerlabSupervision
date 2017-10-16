package sys.spvisor.core.result.process;

import java.util.List;

import sys.spvisor.core.entity.process.TDeliveryPipeProcess;
import sys.spvisor.core.entity.process.TFangfuProcess;
import sys.spvisor.core.entity.process.TGuanjianProcess;
import sys.spvisor.core.entity.process.TJueyuanjietouProcess;
import sys.spvisor.core.entity.process.TShebeiBengProcess;
import sys.spvisor.core.entity.process.TShebeiProcess;
import sys.spvisor.core.entity.process.TShiyouProcess;
import sys.spvisor.core.entity.process.TValveProcess;
import sys.spvisor.core.entity.process.TWanguanProcess;
import sys.spvisor.core.entity.process.TZuanjuProcess;
/**
 * 保存进度表的时候用于接受参数
 * @author leixiaojing
 *
 */
public class ScheduleTableModel {
	
	private List<TDeliveryPipeProcess> shuSongGuan;
	
	private List<TWanguanProcess> wanGuan;
	
	private List<TFangfuProcess> fangFu;
	
	private List<TShiyouProcess> shiYou;
	
	private List<TGuanjianProcess> guanJian;
	
	private List<TValveProcess> faMen;
	
	private List<TShebeiProcess> sheBei;
	
	private List<TShebeiBengProcess> sheBeiBeng;
	
	private List<TZuanjuProcess> zuanJu;
	
	private List<TJueyuanjietouProcess> jueYuan;

	public List<TDeliveryPipeProcess> getShuSongGuan() {
		return shuSongGuan;
	}

	public void setShuSongGuan(List<TDeliveryPipeProcess> shuSongGuan) {
		this.shuSongGuan = shuSongGuan;
	}

	public List<TWanguanProcess> getWanGuan() {
		return wanGuan;
	}

	public void setWanGuan(List<TWanguanProcess> wanGuan) {
		this.wanGuan = wanGuan;
	}

	public List<TFangfuProcess> getFangFu() {
		return fangFu;
	}

	public void setFangFu(List<TFangfuProcess> fangFu) {
		this.fangFu = fangFu;
	}

	public List<TShiyouProcess> getShiYou() {
		return shiYou;
	}

	public void setShiYou(List<TShiyouProcess> shiYou) {
		this.shiYou = shiYou;
	}

	public List<TGuanjianProcess> getGuanJian() {
		return guanJian;
	}

	public void setGuanJian(List<TGuanjianProcess> guanJian) {
		this.guanJian = guanJian;
	}

	public List<TValveProcess> getFaMen() {
		return faMen;
	}

	public void setFaMen(List<TValveProcess> faMen) {
		this.faMen = faMen;
	}

	public List<TShebeiProcess> getSheBei() {
		return sheBei;
	}

	public void setSheBei(List<TShebeiProcess> sheBei) {
		this.sheBei = sheBei;
	}

	public List<TShebeiBengProcess> getSheBeiBeng() {
		return sheBeiBeng;
	}

	public void setSheBeiBeng(List<TShebeiBengProcess> sheBeiBeng) {
		this.sheBeiBeng = sheBeiBeng;
	}

	public List<TZuanjuProcess> getZuanJu() {
		return zuanJu;
	}

	public void setZuanJu(List<TZuanjuProcess> zuanJu) {
		this.zuanJu = zuanJu;
	}

	public List<TJueyuanjietouProcess> getJueYuan() {
		return jueYuan;
	}

	public void setJueYuan(List<TJueyuanjietouProcess> jueYuan) {
		this.jueYuan = jueYuan;
	}
	
	

}
