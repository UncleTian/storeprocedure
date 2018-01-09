package com.lin.luo.tian.procedures;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.object.StoredProcedure;

import com.lin.luo.tian.TradeAccount;

public class QueryPartyProcedure extends StoredProcedure {
	public TradeAccount getTradeAccount(final Integer tradeAcctId) {

		JdbcTemplate template = this.getJdbcTemplate();

		String sql = "select phone, fax, contact_email from cp_acct_trade where trade_acct_id = " + tradeAcctId;

		return template.query(sql, new ResultSetExtractor<TradeAccount>() {

			public TradeAccount extractData(ResultSet rs) throws SQLException, DataAccessException {
				while (rs.next()) {
					TradeAccount tradeAccount = new TradeAccount();
					tradeAccount.setId(tradeAcctId);
					tradeAccount.setPhone(rs.getString("phone"));
					tradeAccount.setFax(rs.getString("fax"));
					tradeAccount.setContactEmail(rs.getString("contact_email"));
					return tradeAccount;

				}
				return null;
			}

		});
	}
}
