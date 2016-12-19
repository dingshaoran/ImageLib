package com.lib.image.convert;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

public class BitmapConvert {
	private final Bitmap.Config conf;
	private final Options opts;

	public BitmapConvert(Bitmap.Config conf) {
		super();
		opts = new Options();
		opts.inPreferredConfig = conf;
		this.conf = conf;
	}

	public Bitmap convertFile(String pathName) {
		Bitmap bitmap = BitmapFactory.decodeFile(pathName, opts);
		return bitmap;
	}
}
