/*
 * This file is generated by jOOQ.
 */
package com.kuvaszuptime.kuvasz.enums;


import com.kuvaszuptime.kuvasz.DefaultSchema;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum SslStatus implements EnumType {

    VALID("VALID"),

    INVALID("INVALID"),

    WILL_EXPIRE("WILL_EXPIRE");

    private final String literal;

    private SslStatus(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public String getName() {
        return "ssl_status";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
