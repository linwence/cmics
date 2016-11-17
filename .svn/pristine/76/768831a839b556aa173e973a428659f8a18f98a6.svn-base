package com.el.cmic.ws.service;

import com.el.cfg.domain.F0101;
import com.el.cfg.domain.F0116;

import com.el.cfg.domain.Fe80101;
import com.el.cfg.domain.Fe80101z;
import com.el.cmic.ws.domain.*;
import com.el.cmic.ws.mapper.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created by king_ on 2016/10/10.
 */
@Service
public class AddC01ToERPServiceImpl implements AddC01ToERPService{
    Logger logger = Logger.getLogger(AddC01ToERPServiceImpl.class);
    @Autowired
    F0101UpdateByPKMapper f0101UpdateByPKMapper;
    @Autowired
    F0116UpdateByAn8Mapper f0116UpdateByAn8Mapper;
    @Autowired
    FE80101UpdateByPKMapper fe80101UpdateByPKMapper;
    @Autowired
    FE80101ZUpdateByE8ZZBMMapper fe80101ZUpdateByE8ZZBMMapper;
    @Autowired
    F0005Mapper f0005Mapper;

    @Value("${ctlSchema}")
    private String dbtype;
    @Value("${schema}")
    private String schema;
    @Transactional
    public String addC01ToERP(PhE001OutHeader phE001OutHeader, PhC001OutMain phC001OutMain,
                              PhC001OutSublineYY phC001OutSublineYY, PhC001OutSublineJCYLJG phC001OutSublineJCYLJG,
                              PhC001OutSublineGR phC001OutSublineGR,PhC001OutSublineQT phC001OutSublineQT,PhC001OutSublineB phC001OutSublineB,
                              PhC001OutSublineJXS phC001OutSublineJXS,PhC001OutSublineJKS phC001OutSublineJKS,PhC001OutSublineCSC phC001OutSublineCSC,String no) {
     //  updateF0101(phE001OutHeader,phC001OutMain,no);
        try {
            updateF0116(phC001OutMain, no);
            updateFE80101(phE001OutHeader, phC001OutMain, phC001OutSublineYY,
                    phC001OutSublineJCYLJG, phC001OutSublineGR, phC001OutSublineQT,
                    phC001OutSublineJXS, phC001OutSublineJKS, phC001OutSublineCSC, no);
            updateFE80101Z(phC001OutSublineB, no);

            updateFe80101SON(no);
        }catch (Exception e){
            logger.error("----------------------------------------------------------------------------------------------------");
            logger.error("客商更新失败:"+e.getMessage());
            logger.error("----------------------------------------------------------------------------------------------------");
        }


        return null;
    }

    @Transactional
    public String updateF0101(PhE001OutHeader phE001OutHeader, PhC001OutMain phC001OutMain, String no) {
        logger.info("客商开始更新F0101");
        F0101 f0101 = new F0101();
        BigDecimal bd = new BigDecimal(no);
        /*String TemporaryCode = "";
        String FormalCode = "";
        for(PhE001OutHeaderCode tmp : phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()){
            if(tmp.getCodetype().equals("0")){
                TemporaryCode=tmp.getCodevalue();
            }
            if(tmp.getCodetype().equals("1")){
                FormalCode = tmp.getCodevalue();
            }
        }*/
        f0101.setAban8(bd);
        //f0101.setAbalky(FormalCode);
        f0101UpdateByPKMapper.updateByPrimaryKeySelective(schema,f0101,"C01");

        logger.info("成功");
        return null;
    }
    @Transactional
    public String updateF0116(PhC001OutMain phC001OutMain, String no) {
        logger.info("客商开始更新F0116");
        F0116 f0116 = new F0116();
        f0116.setAlctr(phC001OutMain.getPk_country());
        //f0116.setAladds(phC001OutMain.getPk_szq());
        f0116.setAladds(f0005Mapper.selectF0005(dbtype,"00","S",phC001OutMain.getPk_szq()));
        f0116.setAlcty1(phC001OutMain.getPk_cities());
        //f0116.setAlcty1(f0005Mapper.selectF0005(dbtype,"00","CT",phC001OutMain.getPk_cities()));
        f0116.setAlcoun(phC001OutMain.getPk_counties());
        //f0116.setAlcoun(f0005Mapper.selectF0005(dbtype,"E8","DS",phC001OutMain.getPk_counties()));
        BigDecimal bd = new BigDecimal(no);
        f0116.setAlan8(bd);
        if(phC001OutMain.getAddress().length()<=40){
            f0116.setAladd1(phC001OutMain.getAddress());
        }
        if(phC001OutMain.getAddress().length()>40 && phC001OutMain.getAddress().length()<=80){
            f0116.setAladd1(phC001OutMain.getAddress().substring(0,40));
            f0116.setAladd2(phC001OutMain.getAddress().substring(40,phC001OutMain.getAddress().length()));
           }
        if(phC001OutMain.getAddress().length()>80 && phC001OutMain.getAddress().length()<=120){
            f0116.setAladd1(phC001OutMain.getAddress().substring(0,40));
            f0116.setAladd2(phC001OutMain.getAddress().substring(40,80));
            f0116.setAladd3(phC001OutMain.getAddress().substring(80,phC001OutMain.getAddress().length()));
        }
        if(phC001OutMain.getAddress().length()>120 && phC001OutMain.getAddress().length()<=160){
            f0116.setAladd1(phC001OutMain.getAddress().substring(0,40));
            f0116.setAladd2(phC001OutMain.getAddress().substring(40,80));
            f0116.setAladd3(phC001OutMain.getAddress().substring(80,120));
            f0116.setAladd4(phC001OutMain.getAddress().substring(120,phC001OutMain.getAddress().length()));
        }
        if(phC001OutMain.getAddress().length()>160){
            f0116.setAladd1(phC001OutMain.getAddress().substring(0,40));
            f0116.setAladd2(phC001OutMain.getAddress().substring(40,80));
            f0116.setAladd3(phC001OutMain.getAddress().substring(80,120));
            f0116.setAladd4(phC001OutMain.getAddress().substring(120,160));
        }
        if(f0116.getAladd1()==null){
            f0116.setAladd1(" ");
        }

        if(f0116.getAladd2()==null){
            f0116.setAladd2(" ");
        }
        if(f0116.getAladd3()==null){
            f0116.setAladd3(" ");
        }
        if(f0116.getAladd4()==null){
            f0116.setAladd4(" ");
        }
        f0116UpdateByAn8Mapper.updateByAn8(schema,f0116,"C01");
        logger.info("成功");
        return null;
    }
    @Transactional
    public String updateFE80101(PhE001OutHeader phE001OutHeader, PhC001OutMain phC001OutMain,
                                PhC001OutSublineYY phC001OutSublineYY, PhC001OutSublineJCYLJG phC001OutSublineJCYLJG,
                                PhC001OutSublineGR phC001OutSublineGR,PhC001OutSublineQT phC001OutSublineQT,PhC001OutSublineJXS phC001OutSublineJXS
            ,PhC001OutSublineJKS phC001OutSublineJKS,PhC001OutSublineCSC phC001OutSublineCSC,String no) {
        logger.info("客商开始更新FE80101");
        Fe80101 fe80101 = new Fe80101();
        for(PhE001OutHeaderCode tmp :phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()){

            if(tmp.getCodetype().equals("1")){
                fe80101.setKsev01("Y");
            }
        }
        if(fe80101.getKsev01().equals(null)) {
            fe80101.setKsev01("N");
        }
        String TemporaryCode = "";
        String FormalCode = "";
        for(PhE001OutHeaderCode tmp : phE001OutHeader.getCodeinfo().getPhE001OutHeaderCodeList()){
            if(tmp.getCodetype().equals("0")){
                TemporaryCode=tmp.getCodevalue();
            }
            if(tmp.getCodetype().equals("1")){
                FormalCode = tmp.getCodevalue();
            }
        }
        fe80101.setKse8kstym(FormalCode);
        BigDecimal bd = new BigDecimal(no);
        fe80101.setKsan8(bd);
        fe80101.setKse8name(phC001OutMain.getCustname());
        fe80101.setKse8scs(phC001OutMain.getIsscs());
        fe80101.setKse8jxs(phC001OutMain.getIsjxs());
        fe80101.setKse8jks(phC001OutMain.getIsjks());
        fe80101.setKse8yy(phC001OutMain.getIsyy());
        fe80101.setKse8yljg(phC001OutMain.getIsjcyljg());
        fe80101.setKse8gr(phC001OutMain.getIsgr());
        fe80101.setKse8qt(phC001OutMain.getIsqt());

        if(phC001OutMain.getIsyy().equals("Y")) {
            fe80101.setKse8yyyl(phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getIsyl());
            fe80101.setKse8yygl(phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getIsgl());
            fe80101.setKse8yysb(phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getIssbdd());
            //fe80101.setKse8yygs(phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getPk_yygs());
            fe80101.setKse8yygs(f0005Mapper.selectF0005(dbtype,"E8","25",phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getPk_yygs()));
            //fe80101.setKse8yljb(phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getPk_yljb());
            fe80101.setKse8yljb(f0005Mapper.selectF0005(dbtype,"E8","26",phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getIstgyf()));
            fe80101.setKse8tgyf(phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getIstgyf());
            //fe80101.setKse8dl(phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getPk_yydl());
            fe80101.setKse8dl(f0005Mapper.selectF0005(dbtype, "E8", "11", phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getPk_yydl()));
            //fe80101.setKse8xl(phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getPk_yyxl());
            fe80101.setKse8xl(f0005Mapper.selectF0005(dbtype, "E8", "12", phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getPk_yyxl()));
            if(!phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getYynsr().equals("")) {
                BigDecimal bd1 = new BigDecimal(phC001OutSublineYY.getPhC001OutSublineYYList().get(0).getYynsr());
                fe80101.setKse8yynsr(bd1);
            }

        }

        if(phC001OutMain.getIsjcyljg().equals("Y")) {
            fe80101.setKse8yyyl(phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getIsyl());
            fe80101.setKse8yygl(phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getIsgl());
            fe80101.setKse8yysb(phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getIssbdd());
            //fe80101.setKse8yygs(phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getPk_yygs());
            fe80101.setKse8yygs(f0005Mapper.selectF0005(dbtype, "E8", "25", phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getPk_yygs()));
            //fe80101.setKse8yljb(phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getPk_yljb());
            fe80101.setKse8yljb(f0005Mapper.selectF0005(dbtype, "E8", "26", phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getPk_yljb()));
            fe80101.setKse8tgyf(phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getIstgyf());
            //fe80101.setKse8dl(phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getPk_yydl());
            //fe80101.setKse8xl(phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getPk_yyxl());
            fe80101.setKse8dl(f0005Mapper.selectF0005(dbtype, "E8", "11", phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getPk_yydl()));
            fe80101.setKse8xl(f0005Mapper.selectF0005(dbtype, "E8", "12", phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getPk_yyxl()));
            if(!phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).equals("")) {
                BigDecimal bd2 = new BigDecimal(phC001OutSublineJCYLJG.getPhC001OutJCYLJGC01List().get(0).getYynsr());
                fe80101.setKse8yynsr(bd2);
            }
        }

        if(phC001OutMain.getIsgr().equals("Y")) {
            fe80101.setKse8sfz(phC001OutSublineGR.getPhC001OutGRC01().getIdcard());
        }
        if(phC001OutMain.getIsqt().equals("Y")) {
            //fe80101.setKse8dwxz(phC001OutSublineQT.getPhC001OutQTC01().getPk_dwxz());
            fe80101.setKse8dwxz(f0005Mapper.selectF0005(dbtype,"E8","24",phC001OutSublineQT.getPhC001OutQTC01().getPk_dwxz()));
        }
        if(phC001OutMain.getIsjxs().equals("Y")){
            //fe80101.setKse8dwxz(phC001OutSublineJXS.getPhC001OutJXSC01List().get(0).getPk_dwxz());
            fe80101.setKse8dwxz(f0005Mapper.selectF0005(dbtype,"E8","24",phC001OutSublineJXS.getPhC001OutJXSC01List().get(0).getPk_dwxz()));
        }
        if(phC001OutMain.getIsjks().equals("Y")){
            //fe80101.setKse8dwxz(phC001OutSublineJKS.getPhC001OutJKSC01List().get(0).getPk_dwxz());
            fe80101.setKse8dwxz(f0005Mapper.selectF0005(dbtype,"E8","24",phC001OutSublineJKS.getPhC001OutJKSC01List().get(0).getPk_dwxz()));
        }
        if(phC001OutMain.getIsscs().equals("Y")){
            //fe80101.setKse8dwxz(phC001OutSublineCSC.getPhC001OutCSCC01List().get(0).getPk_dwxz());
            fe80101.setKse8dwxz(f0005Mapper.selectF0005(dbtype,"E8","24",phC001OutSublineCSC.getPhC001OutCSCC01List().get(0).getPk_dwxz()));
        }




        fe80101UpdateByPKMapper.updateByPrimaryKeySelective(schema,fe80101,"C01");
        logger.info("成功");
        return null;
    }
    @Transactional
    public String updateFE80101Z(PhC001OutSublineB phC001OutSublineB, String no) {
        logger.info("客商开始更新FE80101Z");
        if(phC001OutSublineB.getPhC001OutBC01List()!=null) {

            for (PhC001OutBC01 tmp : phC001OutSublineB.getPhC001OutBC01List()) {
                Fe80101z fe80101Z = new Fe80101z();
                BigDecimal bigDecimal = new BigDecimal(no);
                fe80101Z.setZzan8(bigDecimal);
                //fe80101Z.setZze8zzlxa(tmp.getPk_lictype());
                fe80101Z.setZze8zzlxa(f0005Mapper.selectF0005(dbtype, "E8", "10", tmp.getPk_lictype()));
                fe80101Z.setZzfil2(tmp.getDef3());
                fe80101Z.setZze8zzbm(tmp.getLicno());
                fe80101Z.setZze8jyfw(tmp.getLicfw());
                //BigDecimal bd = new BigDecimal(tmp.getLictodate());
                // Integer bd = Integer.parseInt(tmp.getLictodate());
                //  fe80101Z.setZzexdj(bd);

                if (fe80101ZUpdateByE8ZZBMMapper.selectByPrimaryKey(tmp.getLicno()) >= 1) {
                    fe80101ZUpdateByE8ZZBMMapper.updateByE8ZZBM(schema, fe80101Z, "C01", tmp.getLictodate());
                }

                if (fe80101ZUpdateByE8ZZBMMapper.selectByPrimaryKey(tmp.getLicno()) == 0) {
                    fe80101ZUpdateByE8ZZBMMapper.insertSelective(schema, fe80101Z, tmp.getLictodate());
                }
            }
        }
        logger.info("成功");
        return null;
    }

    public String updateFe80101SON(String no ){
        logger.info("客商开始更新FE80101");
        Fe80101 fe80101 = new Fe80101();
        BigDecimal bd = new BigDecimal(no);
        fe80101.setKsan8(bd);
        fe80101.setKsflag("S");

        fe80101UpdateByPKMapper.updateByPrimaryKeySelective(schema,fe80101,"S");
        logger.info("成功");
        return null;
    }
}
