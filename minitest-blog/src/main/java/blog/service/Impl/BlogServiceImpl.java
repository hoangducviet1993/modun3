package blog.service.Impl;

import blog.model.Blog;
import blog.service.BlogService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BlogServiceImpl implements BlogService {
    public BlogServiceImpl() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog_luyentap?useSSL=false", "root", "123456");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }


    @Override
    public List<Blog> findAll() throws SQLException {
        List<Blog> blogs = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from blog");) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String content = rs.getString("content");
                int categoryId = Integer.parseInt(rs.getString("categoryId"));
                blogs.add(new Blog(id, name, content, categoryId));
            }
        } catch (SQLException e) {
        }
        return blogs;
    }

    @Override
    public void save(Blog blog) throws SQLException {

    }

    @Override
    public void update(int id, Blog blog) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public Blog findById(int id) throws SQLException {
        return null;
    }
}
