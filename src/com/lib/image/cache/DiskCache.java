package com.lib.image.cache;

import android.graphics.Bitmap;

public class DiskCache implements DataCache<String, Bitmap> {

	private final String mCachePath;

	public DiskCache(String cachePath, int maxSize) {
		super();
		this.mCachePath = cachePath;
	}

	@Override
	public Bitmap put(String key, Bitmap value) {

		return null;
	}

	@Override
	public Bitmap get(String key) {
		return null;
	}

	@Override
	public Bitmap remove(String key) {
		return null;
	}

	@Override
	public void removeAll() {
	}

}