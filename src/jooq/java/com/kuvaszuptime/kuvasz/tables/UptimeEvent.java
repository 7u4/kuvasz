/*
 * This file is generated by jOOQ.
 */
package com.kuvaszuptime.kuvasz.tables;


import com.kuvaszuptime.kuvasz.DefaultSchema;
import com.kuvaszuptime.kuvasz.Indexes;
import com.kuvaszuptime.kuvasz.Keys;
import com.kuvaszuptime.kuvasz.enums.UptimeStatus;
import com.kuvaszuptime.kuvasz.tables.records.UptimeEventRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UptimeEvent extends TableImpl<UptimeEventRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>uptime_event</code>
     */
    public static final UptimeEvent UPTIME_EVENT = new UptimeEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UptimeEventRecord> getRecordType() {
        return UptimeEventRecord.class;
    }

    /**
     * The column <code>uptime_event.id</code>.
     */
    public final TableField<UptimeEventRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>uptime_event.monitor_id</code>.
     */
    public final TableField<UptimeEventRecord, Integer> MONITOR_ID = createField(DSL.name("monitor_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>uptime_event.status</code>. Status of the event
     */
    public final TableField<UptimeEventRecord, UptimeStatus> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(com.kuvaszuptime.kuvasz.enums.UptimeStatus.class), this, "Status of the event");

    /**
     * The column <code>uptime_event.error</code>.
     */
    public final TableField<UptimeEventRecord, String> ERROR = createField(DSL.name("error"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>uptime_event.started_at</code>. The current event started at
     */
    public final TableField<UptimeEventRecord, OffsetDateTime> STARTED_AT = createField(DSL.name("started_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "The current event started at");

    /**
     * The column <code>uptime_event.ended_at</code>. The current event ended at
     */
    public final TableField<UptimeEventRecord, OffsetDateTime> ENDED_AT = createField(DSL.name("ended_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "The current event ended at");

    /**
     * The column <code>uptime_event.updated_at</code>.
     */
    public final TableField<UptimeEventRecord, OffsetDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "");

    private UptimeEvent(Name alias, Table<UptimeEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private UptimeEvent(Name alias, Table<UptimeEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>uptime_event</code> table reference
     */
    public UptimeEvent(String alias) {
        this(DSL.name(alias), UPTIME_EVENT);
    }

    /**
     * Create an aliased <code>uptime_event</code> table reference
     */
    public UptimeEvent(Name alias) {
        this(alias, UPTIME_EVENT);
    }

    /**
     * Create a <code>uptime_event</code> table reference
     */
    public UptimeEvent() {
        this(DSL.name("uptime_event"), null);
    }

    public <O extends Record> UptimeEvent(Table<O> child, ForeignKey<O, UptimeEventRecord> key) {
        super(child, key, UPTIME_EVENT);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.UPTIME_EVENT_ENDED_AT_IDX, Indexes.UPTIME_EVENT_MONITOR_IDX);
    }

    @Override
    public Identity<UptimeEventRecord, Integer> getIdentity() {
        return (Identity<UptimeEventRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<UptimeEventRecord> getPrimaryKey() {
        return Keys.UPTIME_EVENT_PKEY;
    }

    @Override
    public List<UniqueKey<UptimeEventRecord>> getKeys() {
        return Arrays.<UniqueKey<UptimeEventRecord>>asList(Keys.UPTIME_EVENT_PKEY, Keys.UPTIME_EVENT_KEY);
    }

    @Override
    public List<ForeignKey<UptimeEventRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UptimeEventRecord, ?>>asList(Keys.UPTIME_EVENT__UPTIME_EVENT_MONITOR_ID_FKEY);
    }

    private transient Monitor _monitor;

    public Monitor monitor() {
        if (_monitor == null)
            _monitor = new Monitor(this, Keys.UPTIME_EVENT__UPTIME_EVENT_MONITOR_ID_FKEY);

        return _monitor;
    }

    @Override
    public UptimeEvent as(String alias) {
        return new UptimeEvent(DSL.name(alias), this);
    }

    @Override
    public UptimeEvent as(Name alias) {
        return new UptimeEvent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UptimeEvent rename(String name) {
        return new UptimeEvent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UptimeEvent rename(Name name) {
        return new UptimeEvent(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, UptimeStatus, String, OffsetDateTime, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
