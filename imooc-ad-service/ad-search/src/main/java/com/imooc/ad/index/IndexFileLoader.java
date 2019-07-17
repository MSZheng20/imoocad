package com.imooc.ad.index;

import com.alibaba.fastjson.JSON;
import com.imooc.ad.dump.DConstant;
import com.imooc.ad.dump.table.AdPlanTable;
import com.imooc.ad.handler.AdLevelDataHandler;
import com.imooc.ad.mysql.constant.OpType;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zms
 * @data 2019/7/9
 */
@Component
@DependsOn("dataTable")
public class IndexFileLoader {


    public void init(){
        List<String> adPlanString  = loadDumpData(
                String.format("%s%s",
                        DConstant.DATA_ROOT_DIR,
                        DConstant.AD_PLAN)
        );

        adPlanString.forEach(p -> AdLevelDataHandler.handleLevel2(
                JSON.parseObject(p,AdPlanTable.class),OpType.ADD)
        );

        List<String> adCreativeString  = loadDumpData(
                String.format("%s%s",
                        DConstant.DATA_ROOT_DIR,
                        DConstant.AD_CREATIVE)
        );
    }

    private List<String> loadDumpData(String fileName){
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))){
            return br.lines().collect(Collectors.toList());
        }catch (IOException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
}
