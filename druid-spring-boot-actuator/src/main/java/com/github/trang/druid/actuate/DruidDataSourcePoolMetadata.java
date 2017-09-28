package com.github.trang.druid.actuate;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.jdbc.metadata.AbstractDataSourcePoolMetadata;

/**
 * @author trang
 */
public class DruidDataSourcePoolMetadata extends AbstractDataSourcePoolMetadata<DruidDataSource> {

    /**
     * Create an instance with the data source to use.
     *
     * @param dataSource the data source
     */
    public DruidDataSourcePoolMetadata(DruidDataSource dataSource) {
        super(dataSource);
    }

    @Override
    public Integer getActive() {
        return getDataSource().getActiveCount();
    }

    @Override
    public Integer getMax() {
        return getDataSource().getMaxActive();
    }

    @Override
    public Integer getMin() {
        return getDataSource().getMinIdle();
    }

    @Override
    public String getValidationQuery() {
        return getDataSource().getValidationQuery();
    }

}