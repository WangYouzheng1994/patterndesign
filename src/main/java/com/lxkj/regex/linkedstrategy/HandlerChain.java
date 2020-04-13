package com.lxkj.regex.linkedstrategy;

import com.alibaba.fastjson.JSONObject;
import com.lxkj.regex.entity.ConventerHandler;
import com.lxkj.regex.handle.AndStrategy;
import com.lxkj.regex.handle.NotStrategy;
import com.lxkj.regex.handle.ORStrategy;

import java.util.LinkedList;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/1 16:33
 * @Description: 每个拆解的逻辑扔到这个链里面
 */
public class HandlerChain {
	private static HandlerChain instance = new HandlerChain();

	private LinkedList strategy = new LinkedList(){
		{
			add(new AndStrategy());
			add(new NotStrategy());
			add(new ORStrategy());
			// add(new AndStrategy());
		};
	};

	private class Entry {
		private ConventerHandler value;
		private Entry next;

		public Entry getNext() {
			return next;
		}

		public void setNext(Entry next) {
			this.next = next;
		}
	}

	private Entry head = new Entry();
	private Entry current = head;

	private HandlerChain() {
		Entry entry;

		// for (int i = 1; ) {
			entry = new Entry();
			entry =
			current.next = entry;
			current = current.next;

		// }
	}

	public static HandlerChain getInstance() {
		return instance;
	}

	public void doHandle() {

	}

}
