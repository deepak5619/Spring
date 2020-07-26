package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class OracleEmployeeDAOImpl implements EmployeeDAO {
     private static final String query="INSERT INTO SPRING_EMPLOYEE VALUES(EMP_SEQUENCE.NEXTVAL,?,?,?,?,?)";
	
     private DataSource ds=null;
     
     public OracleEmployeeDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}
	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//create databse connection
		con=ds.getConnection();
		//create preared Statement Object
		ps=con.prepareStatement(query);
		//set the query parameter value
		ps.setString(1, bo.getEname());
		ps.setString(2, bo.getEadd());
		ps.setFloat(3,bo.getBasicSal());
		ps.setFloat(4, bo.getGrossSal());
		ps.setFloat(5, bo.getNetSal());
		//execute the query
		count=ps.executeUpdate();
		//close Object
		ps.close();
		con.close();
		return count;
	}

}
