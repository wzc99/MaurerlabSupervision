package sys.spvisor.core.entity.project;

import java.sql.Date;

public class TGoodsLists {
    private Integer id;

    private Integer proId;

    private Integer listSerialNumber;

    private String goodType;

    private String goodName;

    private String goodSpecifications;

    private Integer goodOrderNum;

    private String goodUnit;

    private String goodNote;

    private Integer goodId;

    private Date planDate;

    private Date promiseDate;

    private String productNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getListSerialNumber() {
        return listSerialNumber;
    }

    public void setListSerialNumber(Integer listSerialNumber) {
        this.listSerialNumber = listSerialNumber;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType == null ? null : goodType.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getGoodSpecifications() {
        return goodSpecifications;
    }

    public void setGoodSpecifications(String goodSpecifications) {
        this.goodSpecifications = goodSpecifications == null ? null : goodSpecifications.trim();
    }

    public Integer getGoodOrderNum() {
        return goodOrderNum;
    }

    public void setGoodOrderNum(Integer goodOrderNum) {
        this.goodOrderNum = goodOrderNum;
    }

    public String getGoodUnit() {
        return goodUnit;
    }

    public void setGoodUnit(String goodUnit) {
        this.goodUnit = goodUnit == null ? null : goodUnit.trim();
    }

    public String getGoodNote() {
        return goodNote;
    }

    public void setGoodNote(String goodNote) {
        this.goodNote = goodNote == null ? null : goodNote.trim();
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public Date getPromiseDate() {
        return promiseDate;
    }

    public void setPromiseDate(Date promiseDate) {
        this.promiseDate = promiseDate;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum == null ? null : productNum.trim();
    }
}