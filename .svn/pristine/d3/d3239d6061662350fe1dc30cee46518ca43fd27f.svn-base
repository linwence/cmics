package com.el.cmic.service.orderback;

import com.el.cmic.common.SpdInterfaceType;
import com.el.cmic.common.domain.SpdData;
import com.el.cmic.common.domain.SpdRequest;
import com.el.cmic.common.domain.SpdResult;
import com.el.cmic.domain.orderback.SpdOrderBack;
import com.el.cmic.domain.orderback.SpdOrderBackDetail;
import com.el.cmic.mapper.orderback.SpdOrderBackMapper;
import com.el.cmic.service.department.impl.DepartmentDataServiceImpl;
import com.el.utils.CallSpdWebServiceUtil;
import com.el.utils.SpdClientService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by king_ on 2016/11/9.
 */
@Service
public class SpdOrderBackServiceImpl implements SpdOrderBackService {
    Logger logger = Logger.getLogger(DepartmentDataServiceImpl.class);
    
    @Autowired
    SpdOrderBackMapper spdOrderBackMapper;
    
    @Value("${schema}")
    private String schema;
    
    @Resource(name="spdRequest")
    private SpdRequest spdRequest;
    
    @Resource(name="spdClientService")
    private SpdClientService spdClientService;
    



    public String CallSpdOrderBackInterface() {
        List<SpdOrderBack> spdOrderBackList = this.selectSpdOrderBackData();
        System.out.print(spdOrderBackList.toString());

        for(SpdOrderBack tmp : spdOrderBackList) {
            try {
                SpdData spdData = new SpdData(SpdInterfaceType.ORDERBACK_TYPE, "JKSPD", tmp);
                String data = spdData.toJson();
                System.out.println(data);

                SpdResult spdResult = spdClientService.callSpdWebService(data);
                
                System.out.println(spdResult);

                //spdRequest.setData(data);
             /*
                String encodeResult = callWebServiceImp.CallWSI(spdRequest.toMap());

                byte[] bytes = Base64Utils.decodeFromString(encodeResult);
                String decodeResult = new String(bytes, "utf-8");

                System.out.println(encodeResult);*/
               // afterafterResponse(null,spdResult,tmp);
            }catch (Exception e){

            }

        }
        return null;
    }

    public List<SpdOrderBack> selectSpdOrderBackData(){
        return spdOrderBackMapper.selectAllVe8dd001(schema);
    }

    public void afterafterResponse(SpdOrderBack spdOrderBack,SpdResult spdResult,SpdOrderBack tmp){
       // SpdResult spdResult =JSON.parseObject(jsonString,SpdResult.class);
        String status = "Y";
        //接口调用不成功  更新状态
        if(!spdResult.isSuccess()){
            status="E";
        }
       //---------------------------------------暂时没有字段进行更新 updateNxtrF4211(status,tmp);
    }

    public int updateNxtrF4211(String status,SpdOrderBack tmp){
        String kcoo = new String();
        String dcto = new String();
        BigDecimal doco = new BigDecimal(0);
        BigDecimal lnid = new BigDecimal(0);
        for(SpdOrderBackDetail tmp1 :tmp.getSpdOrderBackDetailList()) {
            kcoo = tmp1.getKcoo();
            doco = tmp1.getDoco();
            dcto = tmp1.getDcto();
            lnid = tmp1.getLnid();
            spdOrderBackMapper.updateF4211(schema,status,kcoo,dcto,doco,lnid);
        }
        return 0;
    }

}
