package com.huatec.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.huatec.greendao.Category;

import com.huatec.greendao.gen.CategoryDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig categoryDaoConfig;

    private final CategoryDao categoryDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        categoryDaoConfig = daoConfigMap.get(CategoryDao.class).clone();
        categoryDaoConfig.initIdentityScope(type);

        categoryDao = new CategoryDao(categoryDaoConfig, this);

        registerDao(Category.class, categoryDao);
    }
    
    public void clear() {
        categoryDaoConfig.clearIdentityScope();
    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

}
