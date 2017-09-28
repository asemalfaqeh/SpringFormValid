package com.af.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;
import com.af.beans.UserBean;

@Component("UsersDao")
public class UsersDao {

	private static NamedParameterJdbcTemplate jdbc;
	
	//@Autowired
	public UsersDao() {
		System.out.println("Success Loading Dao");
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		 this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public static List<Users> getUsers() {
		return jdbc.query("select * from users",new RowMapper<Users>() {
			@Override
			public Users mapRow(ResultSet rs, int i) throws SQLException {
				// TODO Auto-generated method stub
				Users users = new Users();
				//List<UserBean> lst = new ArrayList<>();
				users.setUsername(rs.getString("username"));
				users.setId(rs.getInt("id"));
				users.setPassword(rs.getString("password"));
				users.setEmail(rs.getString("email"));
				//lst.add(users);
				return users;
			}
		});
	}
	
}
