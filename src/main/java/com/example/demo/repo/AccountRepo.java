package com.example.demo.repo;

import com.example.demo.core.inter.repo.AccountRepoInterface;
import com.example.demo.model.entity.Account;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
            this.JdbcTemplate.update(sql, name);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public List<Account> GetAccounts() {
        try {
            String sql = "select * from account";
            List<Account> listAccount = this.JdbcTemplate.query(sql, new RowMapper<Account>() {
                public Account mapRow(ResultSet result, int rowNum) throws SQLException {
                    Account account = new Account();
                    account.setId(result.getInt("id"));
                    account.setName(result.getString("name"));
                    return account;
                }
            }
            );
            return listAccount;
        } catch (Exception e) {
            return new ArrayList<Account>();
        }
    }

}
