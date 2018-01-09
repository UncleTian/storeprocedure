package com.lin.luo.tian;

import com.google.common.base.Objects;

public class StoreProcedureTest {
	public static void main(String[] args) {
		String str = "UPDATE_TRADE_ACCT_CHANGE:" + "tian";
		System.out.println(str.length());
		System.out.println(str.substring(25));
		
		System.out.println(Integer.parseInt("123"));
		
		System.out.println(Objects.equal(null, null));
		
	}
}
