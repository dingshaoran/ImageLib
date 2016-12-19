package com.lib.image.cache;

public interface DataCache<K, V> {
	/**
	 * 把需要缓存的数据放到缓存中
	 * @param key  查找数据的 key
	 * @param vaue 数据
	 * @return  成功返回 true
	 */
	V put(K key, V value);

	/**
	 * 通过 key 寻找数据
	 * @param key 
	 * @return 如果null 代表没有缓存记录
	 */
	V get(K key);

	/**
	 * 删除 key 对应的数据
	 * @param key
	 * @return
	 */
	V remove(K key);

	/**
	 * 删掉所有的数据
	 */
	void removeAll();
}
