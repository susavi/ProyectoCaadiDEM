package com.ProyectoCaadiDEM.Entidades;

import com.ProyectoCaadiDEM.Entidades.Periods;
import com.ProyectoCaadiDEM.Entidades.Students;
import com.ProyectoCaadiDEM.Entidades.Teachers;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-10-06T14:09:17")
@StaticMetamodel(Groups.class)
public class Groups_ { 

    public static volatile SingularAttribute<Groups, String> learningUnit;
    public static volatile SingularAttribute<Groups, String> identifier;
    public static volatile SingularAttribute<Groups, Periods> periodId;
    public static volatile SingularAttribute<Groups, String> level;
    public static volatile CollectionAttribute<Groups, Students> studentsCollection;
    public static volatile SingularAttribute<Groups, Integer> id;
    public static volatile SingularAttribute<Groups, Teachers> employeeNumber;

}