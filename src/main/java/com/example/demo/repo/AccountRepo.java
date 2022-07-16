package com.example.demo.repo;

import com.example.demo.core.inter.repo.AccountRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepo implements AccountRepoInterface {

    @Autowired
    private JdbcTemplate JdbcTemplate;

    @Override
    public boolean Insert(String name) {
        try {
            String sql = "INSERT INTO public.account(\n"
                    + "	name)\n"
                    + "	VALUES (?);";
            this.JdbcTemplate.update(sql , name);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
