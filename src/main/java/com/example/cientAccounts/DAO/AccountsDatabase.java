package com.example.cientAccounts.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class AccountsDatabase {
        final
        JdbcTemplate jdbc;

    public AccountsDatabase(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public String addAccount(String accKey,String json){
            jdbc.execute("insert into accounts(number,json)values(333,'json')");
        return"data inserted Successfully";

    }
}
