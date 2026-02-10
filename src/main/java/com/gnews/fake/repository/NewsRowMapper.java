package com.gnews.fake.repository;

import com.gnews.fake.domain.Article;
import com.gnews.fake.domain.Source;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class NewsRowMapper implements RowMapper<Article> {

    @Override
    public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
        Source source = new Source(
            rs.getString("source_id"),
            rs.getString("source_name"), 
            rs.getString("source_url"),
            rs.getString("source_country")
        );

        return new Article(
            rs.getString("id"),
            rs.getString("title"),
            rs.getString("description"), 
            rs.getString("content"),
            rs.getString("url"),
            rs.getString("image_url"),
            rs.getTimestamp("published_at").toLocalDateTime(),
            rs.getString("lang"),
            rs.getString("category"),
            source
        );
    }
}