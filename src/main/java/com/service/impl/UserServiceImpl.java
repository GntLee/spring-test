package com.service.impl;

import com.bean.User;
import com.dao.UserDao;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Lee
 * @Date 2018/6/29 11:09
 */
public class UserServiceImpl implements UserDao {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 添加
     * @param user
     */
    public void save(User user) {
        String sql = "insert into user (username,password,nickname,age,sex) values (?,?,?,?,?)";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,user.getNickname());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getNickname());
            ps.setInt(4,user.getAge());
            ps.setString(5,user.getSex());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 查询
     * @return
     */
    public List<User> findAll() {

        List<User> userList = new ArrayList<User>();

        String sql = "select * from user";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String sex = rs.getString("sex");
                Integer age =  rs.getInt("age");
                String nickname = rs.getString("nickname");
                User user = new User(username,password,nickname,sex,age);
                System.out.println(user);
                userList.add(user);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return userList;

    }
}
