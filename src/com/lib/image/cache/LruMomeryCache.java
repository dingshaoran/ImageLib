package com.lib.image.cache;

import android.util.LruCache;

public class LruMomeryCache<K, V> implements DataCache<K, V> {
	private final LruCache<K, V> cache;

	public LruMomeryCache(int maxSize) {
		super();
		cache = new LruCache<K, V>(maxSize);
	}

	@Override
	public V put(K key, V value) {
		return cache.put(key, value);
	}

	@Override
	public V get(K key) {
		return cache.get(key);
	}

	@Override
	public V remove(K key) {
		return cache.remove(key);
	}

	@Override
	public void removeAll() {
		cache.evictAll();
	}

}