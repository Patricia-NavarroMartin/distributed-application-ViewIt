package entities.inherited;

import entities.Product_;
import enumerations.EdibleCategory;
import enumerations.ProductSize;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-04T16:28:32")
@StaticMetamodel(Edible.class)
public class Edible_ extends Product_ {

    public static volatile SingularAttribute<Edible, ProductSize> productSize;
    public static volatile SingularAttribute<Edible, EdibleCategory> category;

}