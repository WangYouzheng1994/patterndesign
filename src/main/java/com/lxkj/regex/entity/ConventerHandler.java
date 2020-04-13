package com.lxkj.regex.entity;

import com.lxkj.regex.linkedstrategy.HandlerChain;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/1 16:35
 * @Description: 转换器的调用
 */
public interface ConventerHandler {
	public void doHandle(HandlerChain handlerChain);
}
