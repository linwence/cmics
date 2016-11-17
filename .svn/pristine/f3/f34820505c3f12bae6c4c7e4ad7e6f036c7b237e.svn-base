package com.el.cmic.domain.goods;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.NameFilter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 货品 虚拟实体(货品信息推送)
 *
 * @author zhanhao
 */
@JSONType(orders = {"货主", "编号", "名称", "查询码", "原编号", "建档时间", "规格", "产地", "单位", "有效期", "包装", "中包装",
        "质量标准", "状态", "是否电子监管", "货主名称", "是否启用企业物流码", "通用名称", "件长", "件宽", "件高", "小包装长", "小包装宽", "小包装高"
        , "单位重量", "是否唯一码监管", "自定义分类", "货品属性", "条形码", "注册商标", "养护周期", "报警库存", "分类1", "分类2", "分类3", "全球唯一码",
        "中包装条形码", "大包装条形码", "澄明度检查", "重点养护品种", "是否OTC", "是否中药", "是否打印验报", "是否打印厂检报告", "简称", "生产厂商",
        "剂型", "储存条件", "验收类别", "双人收货", "双人验收", "双人复核", "是否植入介入反馈品种", "质管部是否审批", "证照明细"})
public class Bales {

    /**
     * FE8WMS01
     */
    @JSONField(serialize = false)
    private String bslitm;
    /**
     * 货主 - FE8WMS20.LSE8HZBM
     */
    @JSONField(name = "货主")
    private String LSE8HZBM;
    /**
     * 编号 - F4101.IMLITM
     */
    @JSONField(name = "编号")
    private String imlitm;

    /**
     * 名称 - FE84101.SPE8NAME
     */
    @JSONField(name = "名称")
    private String spe8name;

    /**
     * 查询码 - F4101.IMSRTX
     */
    @JSONField(name = "查询码")
    private String imsrtx;
    @JSONField(name = "原编号")
    private String originalNo;
    /**
     * 建档时间 - FE84101.SPE8JDSJ
     */
    @JSONField(name = "建档时间", format = "yyyy-MM-dd")
    private Date spe8jdsj;
    /**
     * 规格 - F4101.IMDSC2
     */
    @JSONField(name = "规格")
    private String imdsc2;

    /**
     * 产地 - FE84101.SPORIG
     */
    @JSONField(name = "产地")
    private String sporig;

    /**
     * 单位 - F4101.IMUOM1
     */
    @JSONField(name = "单位")
    private String imuom1;

    /**
     * 有效期 - F4101.IMSLD
     */
    @JSONField(name = "有效期")
    private String imsld;
    @JSONField(name = "包装")
    private BigDecimal packsize;
    @JSONField(name = "中包装")
    private BigDecimal midPackSize;
    @JSONField(name = "质量标准")
    private String qStanderd;
    /**
     * 状态 - F4101.IMSTKT
     */
    @JSONField(name = "状态")
    private String imstkt;
    @JSONField(name = "是否电子监管")
    private String electronFlag;

    /**
     * 货主名称   F0010.CCNAME
     */
    @JSONField(name = "货主名称")
    private String ccname;
    @JSONField(name = "是否启用企业物流码")
    private String logisticsFlag;
    /**
     * 通用名称 - FE84101.SPE8TYM
     */
    @JSONField(name = "通用名称")
    private String spe8tym;
    @JSONField(name = "件长")
    private BigDecimal length;
    @JSONField(name = "件宽")
    private BigDecimal width;
    @JSONField(name = "件高")
    private BigDecimal height;
    @JSONField(name = "小包装长")
    private BigDecimal smallPackLength;
    @JSONField(name = "小包装宽")
    private BigDecimal smallPackWidth;
    @JSONField(name = "小包装高")
    private BigDecimal smallPackHeight;
    @JSONField(name = "单位重量")
    private BigDecimal weight;
    /**
     * 是否唯一码监管 - FE84101.SPE8XLHGL
     */
    @JSONField(name = "是否唯一码监管")
    private String spe8xlhgl;
    @JSONField(name = "自定义分类")
    private String customClass;
    @JSONField(name = "货品属性")
    private String goodsProperty;
    @JSONField(name = "条形码")
    private String barCode;
    @JSONField(name = "注册商标")
    private String brand;
    /**
     * 养护周期 - FE84101.SPE8YHZQ
     */
    @JSONField(name = "养护周期")
    private BigDecimal spe8yhzq;
    @JSONField(name = "报警库存")
    private BigDecimal warnQty;
    /**
     * 分类1 - F4101.IMSRP3
     */
    @JSONField(name = "分类1")
    private String imsrp3;
    /**
     * 分类2 - F4101.IMSRP5
     */
    @JSONField(name = "分类2")
    private String imsrp5;
    @JSONField(name = "分类3")
    private String class3;

    @JSONField(name = "全球唯一码")
    private String globalCode;
    @JSONField(name = "中包装条形码")
    private String midPackSizeBarCode;
    @JSONField(name = "大包装条形码")
    private String bigPackSizeBarCode;
    @JSONField(name = "澄明度检查")
    private String clarityFlag;
    /**
     * 重点养护品种 - FE84101.SPE8ZDYH
     */
    @JSONField(name = "重点养护品种")
    private String spe8zdyh;
    @JSONField(name = "是否OTC")
    private String otcFlag;
    @JSONField(name = "是否中药")
    private String chineseFlag;
    @JSONField(name = "是否打印验报")
    private int printFlag;
    @JSONField(name = "是否打印厂检报告")
    private int printFactoryFlag;
    @JSONField(name = "简称")
    private String shortName;
    /**
     * 生产厂商 - F0101.ABALPH
     */
    @JSONField(name = "生产厂商")
    private String abalph;
    /**
     * 剂型 - FE84101.SPE8JX
     */
    @JSONField(name = "剂型")
    private String spe8jx;
    /**
     * 储存条件 - FE84101.SPE8CCTJ
     */
    @JSONField(name = "储存条件")
    private String spe8cctj;
    @JSONField(name = "验收类别")
    private String checkClass;
    @JSONField(name = "双人收货")
    private int doubleTakeFlag;
    @JSONField(name = "双人验收")
    private int doubleAcceptFlag;
    @JSONField(name = "双人复核")
    private int doubleCheckFlag;

    @JSONField(name = "是否植入介入反馈品种")
    private String interventionFlag;
    @JSONField(name = "质管部是否审批")
    private int qualityApproveFlag;
    /**
     * 证照明细
     */
    @JSONField(name = "证照明细")
    private List<Licence> licenceList;

    public String getBslitm() {
        return bslitm;
    }

    public void setBslitm(String bslitm) {
        this.bslitm = bslitm;
    }

    public String getLSE8HZBM() {
        return LSE8HZBM;
    }

    public void setLSE8HZBM(String LSE8HZBM) {
        this.LSE8HZBM = LSE8HZBM;
    }

    public String getImlitm() {
        return imlitm;
    }

    public void setImlitm(String imlitm) {
        this.imlitm = imlitm;
    }

    public String getSpe8name() {
        return spe8name;
    }

    public void setSpe8name(String spe8name) {
        this.spe8name = spe8name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImsrtx() {
        return imsrtx;
    }

    public void setImsrtx(String imsrtx) {
        this.imsrtx = imsrtx;
    }

    public String getOriginalNo() {
        return originalNo;
    }

    public void setOriginalNo(String originalNo) {
        this.originalNo = originalNo;
    }

    public Date getSpe8jdsj() {
        return spe8jdsj;
    }

    public void setSpe8jdsj(Date spe8jdsj) {
        this.spe8jdsj = spe8jdsj;
    }

    public String getImdsc2() {
        return imdsc2;
    }

    public void setImdsc2(String imdsc2) {
        this.imdsc2 = imdsc2;
    }

    public String getSporig() {
        return sporig;
    }

    public void setSporig(String sporig) {
        this.sporig = sporig;
    }

    public String getImuom1() {
        return imuom1;
    }

    public void setImuom1(String imuom1) {
        this.imuom1 = imuom1;
    }

    public String getImsld() {
        return imsld;
    }

    public void setImsld(String imsld) {
        this.imsld = imsld;
    }

    public BigDecimal getPacksize() {
        return packsize;
    }

    public void setPacksize(BigDecimal packsize) {
        this.packsize = packsize;
    }

    public BigDecimal getMidPackSize() {
        return midPackSize;
    }

    public void setMidPackSize(BigDecimal midPackSize) {
        this.midPackSize = midPackSize;
    }

    public String getqStanderd() {
        return qStanderd;
    }

    public void setqStanderd(String qStanderd) {
        this.qStanderd = qStanderd;
    }

    public String getImstkt() {
        return imstkt;
    }

    public void setImstkt(String imstkt) {
        this.imstkt = imstkt;
    }

    public String getElectronFlag() {
        return electronFlag;
    }

    public void setElectronFlag(String electronFlag) {
        this.electronFlag = electronFlag;
    }

    public String getCcname() {
        return ccname;
    }

    public void setCcname(String ccname) {
        this.ccname = ccname;
    }

    public String getLogisticsFlag() {
        return logisticsFlag;
    }

    public void setLogisticsFlag(String logisticsFlag) {
        this.logisticsFlag = logisticsFlag;
    }

    public String getSpe8tym() {
        return spe8tym;
    }

    public void setSpe8tym(String spe8tym) {
        this.spe8tym = spe8tym;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getSmallPackLength() {
        return smallPackLength;
    }

    public void setSmallPackLength(BigDecimal smallPackLength) {
        this.smallPackLength = smallPackLength;
    }

    public BigDecimal getSmallPackWidth() {
        return smallPackWidth;
    }

    public void setSmallPackWidth(BigDecimal smallPackWidth) {
        this.smallPackWidth = smallPackWidth;
    }

    public BigDecimal getSmallPackHeight() {
        return smallPackHeight;
    }

    public void setSmallPackHeight(BigDecimal smallPackHeight) {
        this.smallPackHeight = smallPackHeight;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getSpe8xlhgl() {
        return spe8xlhgl;
    }

    public void setSpe8xlhgl(String spe8xlhgl) {
        this.spe8xlhgl = spe8xlhgl;
    }

    public String getCustomClass() {
        return customClass;
    }

    public void setCustomClass(String customClass) {
        this.customClass = customClass;
    }

    public String getGoodsProperty() {
        return goodsProperty;
    }

    public void setGoodsProperty(String goodsProperty) {
        this.goodsProperty = goodsProperty;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public BigDecimal getSpe8yhzq() {
        return spe8yhzq;
    }

    public void setSpe8yhzq(BigDecimal spe8yhzq) {
        this.spe8yhzq = spe8yhzq;
    }

    public BigDecimal getWarnQty() {
        return warnQty;
    }

    public void setWarnQty(BigDecimal warnQty) {
        this.warnQty = warnQty;
    }

    public String getImsrp3() {
        return imsrp3;
    }

    public void setImsrp3(String imsrp3) {
        this.imsrp3 = imsrp3;
    }

    public String getImsrp5() {
        return imsrp5;
    }

    public void setImsrp5(String imsrp5) {
        this.imsrp5 = imsrp5;
    }

    public String getClass3() {
        return class3;
    }

    public void setClass3(String class3) {
        this.class3 = class3;
    }

    public String getGlobalCode() {
        return globalCode;
    }

    public void setGlobalCode(String globalCode) {
        this.globalCode = globalCode;
    }

    public String getMidPackSizeBarCode() {
        return midPackSizeBarCode;
    }

    public void setMidPackSizeBarCode(String midPackSizeBarCode) {
        this.midPackSizeBarCode = midPackSizeBarCode;
    }

    public String getBigPackSizeBarCode() {
        return bigPackSizeBarCode;
    }

    public void setBigPackSizeBarCode(String bigPackSizeBarCode) {
        this.bigPackSizeBarCode = bigPackSizeBarCode;
    }

    public String getClarityFlag() {
        return clarityFlag;
    }

    public void setClarityFlag(String clarityFlag) {
        this.clarityFlag = clarityFlag;
    }

    public String getSpe8zdyh() {
        return spe8zdyh;
    }

    public void setSpe8zdyh(String spe8zdyh) {
        this.spe8zdyh = spe8zdyh;
    }

    public String getOtcFlag() {
        return otcFlag;
    }

    public void setOtcFlag(String otcFlag) {
        this.otcFlag = otcFlag;
    }

    public String getChineseFlag() {
        return chineseFlag;
    }

    public void setChineseFlag(String chineseFlag) {
        this.chineseFlag = chineseFlag;
    }

    public int getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(int printFlag) {
        this.printFlag = printFlag;
    }

    public int getPrintFactoryFlag() {
        return printFactoryFlag;
    }

    public void setPrintFactoryFlag(int printFactoryFlag) {
        this.printFactoryFlag = printFactoryFlag;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAbalph() {
        return abalph;
    }

    public void setAbalph(String abalph) {
        this.abalph = abalph;
    }

    public String getSpe8jx() {
        return spe8jx;
    }

    public void setSpe8jx(String spe8jx) {
        this.spe8jx = spe8jx;
    }

    public String getSpe8cctj() {
        return spe8cctj;
    }

    public void setSpe8cctj(String spe8cctj) {
        this.spe8cctj = spe8cctj;
    }

    public String getCheckClass() {
        return checkClass;
    }

    public void setCheckClass(String checkClass) {
        this.checkClass = checkClass;
    }

    public int getDoubleTakeFlag() {
        return doubleTakeFlag;
    }

    public void setDoubleTakeFlag(int doubleTakeFlag) {
        this.doubleTakeFlag = doubleTakeFlag;
    }

    public int getDoubleAcceptFlag() {
        return doubleAcceptFlag;
    }

    public void setDoubleAcceptFlag(int doubleAcceptFlag) {
        this.doubleAcceptFlag = doubleAcceptFlag;
    }

    public int getDoubleCheckFlag() {
        return doubleCheckFlag;
    }

    public void setDoubleCheckFlag(int doubleCheckFlag) {
        this.doubleCheckFlag = doubleCheckFlag;
    }

    public String getInterventionFlag() {
        return interventionFlag;
    }

    public void setInterventionFlag(String interventionFlag) {
        this.interventionFlag = interventionFlag;
    }

    public int getQualityApproveFlag() {
        return qualityApproveFlag;
    }

    public void setQualityApproveFlag(int qualityApproveFlag) {
        this.qualityApproveFlag = qualityApproveFlag;
    }

    public List<Licence> getLicenceList() {
        return licenceList;
    }

    public void setLicenceList(List<Licence> licenceList) {
        this.licenceList = licenceList;
    }
}
