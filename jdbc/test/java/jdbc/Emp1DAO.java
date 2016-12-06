package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.LogManager;

import org.testng.log4testng.Logger;


public class Emp1DAO {

	Connection ds;
	static Logger log=Logger.getLogger(Emp1DAO.class);
	public void getData(){
		
		try{
			ds=ConnectionFactory.getConnection();
			Statement stmt=ds.createStatement();
			
			ResultSet rs=stmt.executeQuery("Select sno,ename,eid,job,mgr from emp where sno=4;");
			while(rs.next()){
				log.info("ee"+rs.getString("ename")+" and its manager is "+rs.getString("mgr"));
				System.out.println(rs.getString("ename")+" and its manager is "+rs.getString("mgr"));
			}
		}catch(SQLException d){
			d.printStackTrace();
		}
	}
}
