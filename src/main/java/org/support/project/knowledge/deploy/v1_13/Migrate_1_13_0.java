package org.support.project.knowledge.deploy.v1_13;

import org.support.project.knowledge.deploy.Migrate;
import org.support.project.ormapping.tool.dao.InitializeDao;

public class Migrate_1_13_0 implements Migrate {

    public static Migrate_1_13_0 get() {
        return org.support.project.di.Container.getComp(Migrate_1_13_0.class);
    }

    @Override
    public boolean doMigrate() throws Exception {
        InitializeDao initializeDao = InitializeDao.get();
        String[] sqlpaths = {
            "/org/support/project/knowledge/deploy/v1_13/migrate_v1_13_0.sql",
        };
        initializeDao.initializeDatabase(sqlpaths);
        return true;
    }
}