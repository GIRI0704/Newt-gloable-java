package com.example.JDBCtoJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PersonRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;  // its helpes to talk to the database


    // it is an custom row mapper like @Builder
   class PersonRowmapper implements RowMapper<Person>
   {

       @Override
       public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
           Person person = new Person();
           person.setId(rs.getInt("id"));
           person.setName(rs.getString("name"));
           return person;
       }
   }

    public List<Person> findAll()
    {
        return jdbcTemplate.query("select * from person",
                new BeanPropertyRowMapper<>(Person.class)); // this line is used to map the person ID to DB Id ex : entity annotation

    }

    public Person findById(int id)
    {
        //queryForObject ---------> this is used to get a specific object
        return jdbcTemplate.queryForObject("select * from person where id = ?",
                new Object[]{id},
                new BeanPropertyRowMapper<>(Person.class)); // this line is used to map the person ID to DB Id ex : entity annotation
    }

    public List<Person> findByName(String name)
    {
        return jdbcTemplate.query("select * from person where name = ?",
                new Object[]{name},
                new PersonRowmapper()); // its a custom
    }


    public int deleteById(int id)
    {
       // update ------> is used to update and also delete
        return jdbcTemplate.update("delete from person where id = ?",
                new Object[]{id});

        // it return the Integer value;
    }

    public int insert(Person person)
    {
        // update ------> is used to update and also delete
        return jdbcTemplate.update("insert into person values(?,?)",
                new Object[]{person.getId(),person.getName()});

        // it return the Integer value;
    }

    public int update(Person person)
    {
        // update ------> is used to update and also delete
        return jdbcTemplate.update("update person set name = ? where id = ?",
                new Object[]{person.getName(),person.getId()});

        // it return the Integer value;
    }
}
