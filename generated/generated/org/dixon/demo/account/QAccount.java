package org.dixon.demo.account;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAccount is a Querydsl query type for Account
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAccount extends EntityPathBase<Account> {

    private static final long serialVersionUID = -190979769L;

    public static final QAccount account = new QAccount("account");

    public final StringPath accCurCode = createString("accCurCode");

    public final StringPath accName = createString("accName");

    public final StringPath accNum = createString("accNum");

    public final StringPath accStatusCode = createString("accStatusCode");

    public final StringPath accType = createString("accType");

    public final DateTimePath<org.joda.time.DateTime> createTime = createDateTime("createTime", org.joda.time.DateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath jointAccInd = createString("jointAccInd");

    public final StringPath productName = createString("productName");

    public final DateTimePath<org.joda.time.DateTime> updateTime = createDateTime("updateTime", org.joda.time.DateTime.class);

    public final StringPath userId = createString("userId");

    public final BooleanPath visibility = createBoolean("visibility");

    public QAccount(String variable) {
        super(Account.class, forVariable(variable));
    }

    public QAccount(Path<? extends Account> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccount(PathMetadata metadata) {
        super(Account.class, metadata);
    }

}

