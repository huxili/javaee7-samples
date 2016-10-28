package org.javaee7.batch.chunk.csv.database;

import javax.ejb.Stateless;

/**
 * @author Huxi LI
 */
@Stateless
public class MyEJBService {

    public void technicalError() {
        throw new NullPointerException("Runtime execption EJB");
    }

    public void AppError() throws MyAppException {
        throw new MyAppException("Runtime execption EJB");
    }
}
