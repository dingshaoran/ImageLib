package com.lib.image.down;

public interface DataLoad<Source, Target> {
	/**
	 * 从 source 获取 target，比如source是 url，target 是 file
	 * @param s 源头
	 * @return 目标数据
	 */
	Target load(Source s);

}
