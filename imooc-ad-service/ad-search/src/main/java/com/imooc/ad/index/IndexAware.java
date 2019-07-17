package com.imooc.ad.index;

/**
 * @author zms
 * @data 2019/6/27
 */
public interface IndexAware<K, V> {
    V get(K key);
    void add(K key, V value);
    void update(K key, V value);
    void delete(K key, V value);
}
