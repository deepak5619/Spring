package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class OracleDAOImpl implements CustomerDAO{
	private static final String query="INSERT INTO SPRING_CUSTOMER VALUES(CUST_SEQUENCE.NEXTVAL,?,?,?,?)";
	private DataSource ds=null;
	
	public OracleDAOImpl(DataSource ds) {
		this.ds=ds;
	}
	
	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//create jdbc connection
		con=ds.getConnection();
		//create prepareStatement Object
		ps=con.prepareStatement(query);
		//set inputs to the query
		ps.setString(1, bo.getCname());
		ps.setString(2, bo.getCadd());
		ps.setFloat(3, bo.getpAmt());
		ps.setFloat(4, bo.getInterestAmt());
		//execute the  query
		count=ps.executeUpdate();
		//close Objects
		ps.close();
		con.close();
		return count;
	}
     
}
