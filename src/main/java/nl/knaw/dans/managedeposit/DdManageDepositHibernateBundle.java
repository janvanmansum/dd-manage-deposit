package nl.knaw.dans.managedeposit;

import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import nl.knaw.dans.managedeposit.core.DepositProperties;

public class DdManageDepositHibernateBundle extends HibernateBundle<DdManageDepositConfiguration> {

    public DdManageDepositHibernateBundle() {
        super(DepositProperties.class);
    }

    @Override
    public PooledDataSourceFactory getDataSourceFactory(DdManageDepositConfiguration ddManageDepositConfiguration) {
        return ddManageDepositConfiguration.getDepositPropertiesDatabase();
    }
}
