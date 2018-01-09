package com.lin.luo.tian;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.luo.tian.procedures.QueryPartyProcedure;

public class EntryPoint {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("*.xml");
		QueryPartyProcedure queryPartyProcedure =  (QueryPartyProcedure) c.getBean("queryPartyProcedure");
		TradeAccount tradeAccount = queryPartyProcedure.getTradeAccount(24283);
		System.out.println(tradeAccount);
		
	}
}
