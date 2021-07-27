package com.jayjav.springboot.springbatch;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author OMONIYI ILESANMI
 */

public class Writer  {

    public ItemWriter<Product> write(){
        return null;
    }
}
