package com.imooc.ad.index.adplan;

import com.imooc.ad.index.IndexAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zms
 * @data 2019/6/27
 */
@Slf4j
@Component
public class AdPlanIndex implements IndexAware<Long, AdplanObject> {
    private static Map<Long, AdplanObject> objectMap;

    static {
        objectMap = new ConcurrentHashMap<>();
    }

    @Override
    public AdplanObject get(Long key) {
        return objectMap.get(key);
    }

    @Override
    public void add(Long key, AdplanObject value) {
        objectMap.put(key, value);
    }

    @Override
    public void update(Long key, AdplanObject value) {
        AdplanObject oldObject = objectMap.get(key);
        if (oldObject == null){
            objectMap.put(key, value);
        }else {
            oldObject.update(value);
        }
    }

    @Override
    public void delete(Long key, AdplanObject value) {
        objectMap.remove(key);
    }
}
